package TallGrass;

import static TallGrass.AST.*;

public class Printer {
	public void print(Value v) {
		System.out.println(v.toString());
	}

	public static class Formatter implements AST.Visitor<String> {

		public String visit(Program p) {
			return (String) p.e().accept(this);
		}

		public String visit(NumExp e) {
			return "" + e.v();
		}

		public String visit(AddExp e) {
			String result = e.getLeft().accept(this);
			result += " + ";
			result += e.getRight().accept(this);

			return result;
		}

		public String visit(SubExp e) {
			String result = e.getLeft().accept(this);
			result += " - ";
			result += e.getRight().accept(this);

			return result;
		}

		public String visit(MulExp e) {
			String result = e.getLeft().accept(this);
			result += " * ";
			result += e.getRight().accept(this);

			return result;
		}

		public String visit(DivExp e) {
			String result = e.getLeft().accept(this);
			result += " / ";
			result += e.getRight().accept(this);

			return result;
		}

		public String visit(PowExp e) {
			String result = e.getLeft().accept(this);
			result += " ^ ";
			result += e.getRight().accept(this);

			return result;
		}

		public String visit(NegExp e) {
			String inner = e.getExp().accept(this);
			return "-" + inner;
		}

		public String visit(VarExp e) {
			return e.name();
		}

		public String visit(AssignExp e) {
			return e.name() + " := " + e.value().accept(this);
		}

		public String visit(PrintExp e) {
			return "print " + e.getExp().accept(this);
		}
	}
}
