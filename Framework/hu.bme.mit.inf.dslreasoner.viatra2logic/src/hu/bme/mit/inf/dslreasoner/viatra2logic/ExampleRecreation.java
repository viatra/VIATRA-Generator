package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.util.HashMap;

import com.microsoft.z3.*;

public class ExampleRecreation {
	
	
	public static void sudoku(Context ctx) {
		
		// 9 * 9 int matrix
		IntExpr[][] X = new IntExpr[9][];
		for (int i = 0; i < 9; i++) {
			X[i] = new IntExpr[9];
			for (int j = 0; j < 9; j++) {
				X[i][j] = (IntExpr) ctx.mkConst(ctx.mkSymbol("x_" + (i + 1) + "_" + (j + 1)), ctx.getIntSort());
			}
		}
		
		// Cell value from 1 - 9
		BoolExpr[][] cells = new BoolExpr[9][]; 
		for (int i = 0; i < 9; i++) {
			cells[i] = new BoolExpr[9];
			for (int j = 0; j < 9; j++) {
				cells[i][j] =  ctx.mkAnd(ctx.mkLe(ctx.mkInt(1), X[i][j]), ctx.mkLe(X[i][j], ctx.mkInt(9)));
			}
		}
		
		// Each value in a row is distinct 
		BoolExpr[] row = new BoolExpr[9];
		for (int i = 0; i < 9; i++) {
			row[i] = ctx.mkDistinct(X[i]);
		}
		
		// Each value in a col is distinct 
		BoolExpr[] col = new BoolExpr[9];
		for (int j = 0; j < 9; j++) {
			IntExpr[] one_col = new IntExpr[9];
			for (int i = 0; i < 9; i++) {
				one_col[i] =  X[i][j];
			}
			col[j] = ctx.mkDistinct(one_col);
		}
		
	
		// Each value in a  3*3 square is distinct 
		BoolExpr[][] squares = new BoolExpr[3][];
		for (int x = 0; x < 3; x++) {
			squares[x] = new BoolExpr[3];
			for (int y = 0; y < 3; y++) {
				IntExpr[] square = new IntExpr[9];
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						square[3 * i + j] = X[3 * x + i][3 * y + j]; 
					}
				}
				squares[x][y] = ctx.mkDistinct(square);
			}
		}
		
		// Combine all conditions
		BoolExpr sudoku = ctx.mkTrue();
		for (BoolExpr[] e: cells) {
			sudoku = ctx.mkAnd(ctx.mkAnd(e), sudoku);
		}
		sudoku = ctx.mkAnd(ctx.mkAnd(row), sudoku);
		sudoku = ctx.mkAnd(ctx.mkAnd(col), sudoku);
		for (BoolExpr[] e: squares) {
			sudoku = ctx.mkAnd(ctx.mkAnd(e), sudoku);
		}
		
	    int[][] instance = { { 0, 0, 0, 0, 9, 4, 0, 3, 0 },
	                { 0, 0, 0, 5, 1, 0, 0, 0, 7 }, { 0, 8, 9, 0, 0, 0, 0, 4, 0 },
	                { 0, 0, 0, 0, 0, 0, 2, 0, 8 }, { 0, 6, 0, 2, 0, 1, 0, 5, 0 },
	                { 1, 0, 2, 0, 0, 0, 0, 0, 0 }, { 0, 7, 0, 0, 0, 0, 5, 2, 0 },
	                { 9, 0, 0, 0, 6, 5, 0, 0, 0 }, { 0, 4, 0, 9, 7, 0, 0, 0, 0 } };
	    
	    // Set assertions enforced by the instance 
	    BoolExpr inst = ctx.mkTrue();
	    for (int i = 0; i < 9; i++) {
	    	for (int j = 0; j < 9; j++) {
	    		inst = ctx.mkAnd(inst, (BoolExpr) ctx.mkITE(ctx.mkEq(ctx.mkInt(instance[i][j]), ctx.mkInt(0)), ctx.mkTrue(), ctx.mkEq(X[i][j], ctx.mkInt(instance[i][j]))));
	    	}
	    }
	    
	    Solver s = ctx.mkSolver();
	    s.add(sudoku);
	    s.add(inst);
	    
	    if (s.check() == Status.SATISFIABLE) {
	    	Model m = s.getModel();
	    	Expr[][] solution = new Expr[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                	solution[i][j] = m.evaluate(X[i][j], false);
                }
            }
            
            System.out.println("Sudoku solution:\n");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                	System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
	    }
	    else {
	    	System.out.println("No solution");
	    }
	}
	
	public static void main (String []args) {
	     HashMap<String, String> cfg = new HashMap<String, String>();
         cfg.put("model", "true");
         Context ctx = new Context(cfg);
		 sudoku(ctx);
	}

}