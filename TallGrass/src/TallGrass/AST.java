package TallGrass;

import java.util.ArrayList;
import java.util.List;

/**
 * This class hierarchy represents expressions in the abstract syntax tree
 * manipulated by this interpreter.
 * 
 * @author hridesh
 * 
 */
public interface AST {
	public static abstract class ASTNode {
		public abstract <T> T accept(Visitor<T> visitor);
	}
	public static class Program extends ASTNode {
		Exp _e;

		public Program(Exp e) {
			_e = e;
		}

		public Exp e() {
			return _e;
		}
		
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}
	public static abstract class Exp extends ASTNode {

	}

	public static class NumExp extends Exp {
		double _val;

		public NumExp(double v) {
			_val = v;
		}

		public double v() {
			return _val;
		}
		
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static abstract class BinaryExp extends Exp {
		Exp _left;
		Exp _right;

		public BinaryExp(Exp left, Exp right) {
			_left  = left;
			_right = right;
		}

		public Exp getLeft() {
			return _left;
		}

		public Exp getRight() {
			return _right;
		}
	}

	public static abstract class UnaryExp extends Exp {
		Exp _e;

		public UnaryExp(Exp e) {
			_e = e;
		}

		public Exp getExp() {
			return _e;
		}
	}


	public static class AddExp extends BinaryExp {
		public AddExp(Exp left, Exp right) {
			super(left, right);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class SubExp extends BinaryExp {
		public SubExp(Exp left, Exp right) {
			super(left, right);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class MulExp extends BinaryExp {
		public MulExp(Exp left, Exp right) {
			super(left, right);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class DivExp extends BinaryExp {
		public DivExp(Exp left, Exp right) {
			super(left, right);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class PowExp extends BinaryExp {
		public PowExp(Exp left, Exp right) {
			super(left, right);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class NegExp extends UnaryExp {
		public NegExp(Exp e) {
			super(e);
		}
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}
	// YOUR CODE HERE

	public static class VarExp extends Exp {
		String _name;

		public VarExp(String name) {
			_name = name;
		}

		public String name() {
			return _name;
		}
		
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class AssignExp extends Exp {
		String _name;
		Exp _value;

		public AssignExp(String name, Exp value) {
			_name = name;
			_value = value;
		}

		public String name() {
			return _name;
		}

		public Exp value() {
			return _value;
		}
		
		public <T> T accept(Visitor<T> visitor) {
			return visitor.visit(this);
		}
	}

	public static class PrintExp extends Exp {
    Exp _e;
    public PrintExp(Exp e) { _e = e; }
    public Exp getExp() { return _e; }
    public <T> T accept(Visitor<T> visitor) { return visitor.visit(this); }
}

	public static class ShoutExp extends Exp {
    Exp _e;
    public ShoutExp(Exp e) { _e = e; }
    public Exp getExp() { return _e; }
    public <T> T accept(Visitor<T> visitor) { return visitor.visit(this); }
}

	public interface Visitor <T> {
		// This interface should contain a signature for each concrete AST node.
		public T visit(AST.Program e);
		public T visit(AST.NumExp e);
		public T visit(AST.AddExp e);

		public T visit(AST.SubExp e);
		public T visit(AST.MulExp e);
		public T visit(AST.DivExp e);
		public T visit(AST.PowExp e);
		public T visit(AST.NegExp e);
		public T visit(AST.VarExp e);
		public T visit(AST.AssignExp e);
		public T visit(AST.PrintExp e);
		public T visit(AST.ShoutExp e);
	}	
}
