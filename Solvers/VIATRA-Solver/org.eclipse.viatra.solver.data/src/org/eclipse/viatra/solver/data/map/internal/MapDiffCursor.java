package org.eclipse.viatra.solver.data.map.internal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.DiffCursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;

/**
 * A cursor representing the difference between two states of a map.
 * @author Oszkar Semerath
 *
 */
public class MapDiffCursor<KEY,VALUE> implements DiffCursor<KEY, VALUE>, Cursor<KEY,VALUE>{
	/**
	 * Default value representing missing elements.
	 */
	VALUE defaultValue;
	MapCursor<KEY,VALUE> cursor1;
	MapCursor<KEY,VALUE> cursor2;
	
	// Values
	KEY key;
	VALUE value1;
	VALUE value2;
	
	// State
	/**
	 * Positive number if cursor 1 is behind, negative number if cursor 2 is behind, and 0 if they are at the same position.
	 */
	int cursorRelation;
	
	public MapDiffCursor(VALUE defaultValue, Cursor<KEY, VALUE> cursor1, Cursor<KEY, VALUE> cursor2) {
		super();
		this.defaultValue = defaultValue;
		this.cursor1 = (MapCursor<KEY, VALUE>) cursor1;
		this.cursor2 = (MapCursor<KEY, VALUE>) cursor2;
		
		this.updateState();
		this.moveToConsistentState();
	}

	public KEY getKey() {
		return key;
	}
	public VALUE getValue1() {
		return value1;
	}
	public VALUE getValue2() {
		return value2;
	}
	@Override
	public VALUE getValue() {
		return this.value2;
	}
	public boolean isTerminated() {
		return cursor1.isTerminated() && cursor2.isTerminated();
	}
	@Override
	public boolean isDirty() {
		return this.cursor1.isDirty() || this.cursor2.isDirty();
	}
	@Override
	public List<VersionedMap<KEY, VALUE>> getDependingMaps() {
		return Stream.concat(
				cursor1.getDependingMaps().stream(),
				cursor2.getDependingMaps().stream()
			).collect(Collectors.toList());
	}
	
	protected void updateState() {
		this.cursorRelation = MapCursor.compare(cursor1, cursor2);
		if(cursorRelation > 0 || cursor2.isTerminated()) {
			this.key = cursor1.getKey();
			this.value1 = cursor1.getValue();
			this.value2 = defaultValue;
		} else if(cursorRelation < 0|| cursor1.isTerminated()){
			this.key = cursor2.getKey();
			this.value1 = defaultValue;
			this.value2 = cursor1.getValue();
		} else {
			// cursor1 = cursor2
			if(!cursor1.getKey().equals(cursor2.getKey())) {
				throw new IllegalStateException(
					"Cursor comarison tells that they are in the same state, but keys are different. " + cursor1.getKey() + " - " + cursor2.getKey());
			}
			this.key = cursor1.getKey();
			this.value1 = cursor1.getValue();
			this.value2 = defaultValue;
		}
	}
	
	protected boolean differentValues() {
		return this.value1 != this.value2;
	}
	protected boolean moveOne() {
		if(isTerminated()) {
			throw new IllegalStateException("DiffCursor tries to move when terminated!");
		}
		if(this.cursorRelation > 0 || cursor2.isTerminated()) {
			return cursor1.move();
		} else if(this.cursorRelation < 0 || cursor1.isTerminated()) {
			return cursor2.move();
		} else {
			boolean moved1 = cursor1.move();
			boolean moved2 = cursor2.move();
			return moved1 && moved2;
		}
	}
	private boolean skipNode() {
		if(isTerminated()) {
			throw new IllegalStateException("DiffCursor tries to skip when terminated!");
		}
		boolean update1 = cursor1.skipCurrentNode();
		boolean update2 = cursor2.skipCurrentNode();
		updateState();
		return update1 && update2;
	}
	
	protected boolean moveToConsistentState() {
		if(!isTerminated()) {
			boolean changed;
			boolean lastResult = true;
			do {
				changed = false;
				if(MapCursor.sameSubnode(cursor1, cursor2)) {
					lastResult = skipNode();
					changed = true;
				}
				if(differentValues()) {
					lastResult = moveOne();
					changed = true;
				}
			} while(changed && !isTerminated());
			return lastResult;
		} else {
			return false;
		}
	}
	
	public boolean move() {
		if(!isTerminated()) {
			if(moveOne()) {
				return moveToConsistentState();
			} else {
				return false;
			}
		} else return false;
	}
}
