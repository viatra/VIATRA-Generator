package org.eclipse.viatra.solver.data.map.internal;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.DiffCursor;

/**
 * A cursor representing the difference between two states of a map.
 * @author Oszkar Semerath
 *
 */
public class MapDiffCursor<KEY,VALUE> implements DiffCursor<KEY, VALUE> {
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
	public boolean isTerminated() {
		return cursor1.isTerminated() && cursor2.isTerminated();
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
	
	protected boolean canStop() {
		return this.value1 != this.value2;
	}
	protected void moveOne() {
		if(isTerminated()) {
			throw new IllegalStateException("DiffCursor tries to move when terminated!");
		}
		if(this.cursorRelation > 0 || cursor2.isTerminated()) {
			cursor1.move();
		} else if(this.cursorRelation < 0 || cursor1.isTerminated()) {
			cursor2.move();
		} else {
			cursor1.move();
			cursor2.move();
		}
		updateState();
	}
	protected void moveToConsistentState() {
		while(!canStop() && !isTerminated()) {
			moveOne();
		}
	}
	
	public void move() {
		if(!isTerminated()) {
			moveOne();
			moveToConsistentState();
		}
	}
}
