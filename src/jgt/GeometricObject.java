package jgt;

public class GeometricObject {
	private Vertex pos;
	private double height;
	private double width;
	
	// getters/setters
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	public Vertex getPos() {return pos;}
	
	public void setWidth(double val) {width = val;}
	public void setHeight(double val) {height = val;}
	public void setPos(Vertex val) {pos = val;}
	
	// constructor
	public GeometricObject(Vertex pos, double width, double height) {
		pos = this.pos;
		width = this.width;
		height = this.width;
	}
}
