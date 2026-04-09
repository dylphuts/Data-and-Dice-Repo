package TallGrass;

import static TallGrass.AST.*;
import static TallGrass.Value.*;

import java.util.List;

public class Evaluator implements Visitor<Value> {
	
	private java.util.HashMap<String, Value> env = new java.util.HashMap<String, Value>();
	Printer.Formatter ts = new Printer.Formatter();

	Value valueOf(Program p) {
		// Value of a program in this language is the value of the expression
		return (Value) p.accept(this);
	}

	@Override
	public Value visit(Program p) {
		return (Value) p.e().accept(this);
	}

	@Override
	public Value visit(AddExp e) {
		// evaluate the left and right
		double left = ((NumVal) e.getLeft().accept(this)).v();
		double right = ((NumVal) e.getRight().accept(this)).v();

		// calculate the result
		double result = left + right;

		return new NumVal(result);
	}

	@Override
	public Value visit(SubExp e) {
		// evaluate the left and right
		double left = ((NumVal) e.getLeft().accept(this)).v();
		double right = ((NumVal) e.getRight().accept(this)).v();

		// calculate the result
		double result = left - right;

		return new NumVal(result);
	}

	@Override
	public Value visit(MulExp e) {
		// evaluate the left and right
		double left = ((NumVal) e.getLeft().accept(this)).v();
		double right = ((NumVal) e.getRight().accept(this)).v();

		// calculate the result
		double result = left * right;

		return new NumVal(result);
	}

	@Override
	public Value visit(DivExp e) {
		// evaluate the left and right
		double left = ((NumVal) e.getLeft().accept(this)).v();
		double right = ((NumVal) e.getRight().accept(this)).v();

		// calculate the result
		double result = left / right;

		return new NumVal(result);
	}

	@Override
	public Value visit(PowExp e) {
		// evaluate the left and right
		double left = ((NumVal) e.getLeft().accept(this)).v();
		double right = ((NumVal) e.getRight().accept(this)).v();

		// calculate the result
		double result = Math.pow(left, right);

		return new NumVal(result);
	}

	@Override
	public Value visit(NumExp e) {
		return new NumVal(e.v());
	}

	@Override
	public Value visit(NegExp e) {
		double val = ((NumVal) e.getExp().accept(this)).v();
		return new NumVal(-val);
	}

	@Override
	public Value visit(VarExp e) {
		Value v = env.get(e.name());
		if (v == null)
			throw new RuntimeException("Undefined variable: " + e.name());
		return v;
	}

	@Override
	public Value visit(AssignExp e) {
		Value v = e.value().accept(this);
		env.put(e.name(), v);
		return v;
	}

	@Override
	public Value visit(PrintExp e) {
		Value v = e.getExp().accept(this);
		System.out.println(((NumVal) v).v());
		return new NumVal(0);
	}

	@Override
	public Value visit(ShoutExp e) {
		Value v = e.getExp().accept(this);
		System.out.println(((NumVal) v).v());
		return new NumVal(0);
	}
}
