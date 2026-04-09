package TallGrass;

public interface Value {
	public String toString();
	static class NumVal implements Value {
		private double _val;
	    public NumVal(double v) { _val = v; } 
	    public double v() { return _val; }
	    public String toString() { 
	    	int tmp = (int) _val;
	    	if(tmp == _val) return "" + tmp;
	    	return "" + _val; 
	    }
	}
	static class StringVal implements Value {
		private String _val;
	    public StringVal(String v) { _val = v; } 
	    public String v() { return _val; }
	    public String toString() { return _val; }
	}
}
