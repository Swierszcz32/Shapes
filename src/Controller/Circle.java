package Controller;

import java.awt.Color;
import java.awt.Graphics;

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
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof Circle) {
			Circle circle = (Circle) obj;
			return getRadius() == circle.getRadius() && getColor().equals(circle.getColor()); 
		}
		return true;
	}
	@Override
	public String toString() {
		return " Ko³o "+this.getColor().getRed()+"-"+
				this.getColor().getGreen()+"-"+this.getColor().getBlue()+" "+area();
	}
	
}
