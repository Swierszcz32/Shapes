package Model;

import java.awt.Color;
import java.awt.Graphics;

import Controller.Shapes;

public class Circle extends Shapes{

	public Circle(int x, int y, Color c) {
		super(x, y, c);
	}

	private int radius;
	
	public void setRadius(int r) {
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	
	@Override
	public double area() {
		double area = (Math.PI * ( (getRadius()/2) * (getRadius()/2)));
		return area;
	}
	@Override
	public void draw(Graphics g, int i) {
		g.setColor(getColor());
		g.fillOval(getXPosition(), getYPosition(), getRadius(), getRadius());
		g.setColor(Color.WHITE);
		g.drawString(toString(), (randomShapes.widthFrame - 200), ( 50 + i ));
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return true;
//		}
//		if (obj instanceof Circle) {
//			Circle circle = (Circle) obj;
//			return getRadius() == circle.getRadius() && getColor().equals(circle.getColor()); 
//		}
//		return true;
//	}
	@Override
	public String toString() {
		return " Ko³o "+this.getColor().getRed()+"-"+
				this.getColor().getGreen()+"-"+this.getColor().getBlue()+" "+area();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + radius;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle other = (Circle) obj;
		if (radius != other.radius) {
			return false;
		}
		return true;
	}
	
	
}
