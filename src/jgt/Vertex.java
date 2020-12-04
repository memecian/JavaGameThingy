package jgt;

public class Vertex {

	private double x;
	private double y;

	// Constructor
	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double length() {
		return Math.sqrt(x * x + y * y);
	}
// modifiers --------------------------------
	public void scalarMultMod(double s) {
		x = x * s;
		y = y * s;
	}

	public void addMod(Vertex v) {
		x=x+v.x;
		y=y+v.y;
	}
// ------------------------------------------
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}

// getters/setters --------------------------
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void setX(double val) {
		x = val;
	}
	public void setY(double val) {
		y = val;
	}
// ------------------------------------------
	
// ------------------------------------------	
	public boolean equals(Object thatObject) {
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex)thatObject;
			return this.x == that.x && this.y == that.y;
		}
		return false;
	}
}
