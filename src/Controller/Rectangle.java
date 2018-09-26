package Controller;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shapes{
	
	public Rectangle(int x, int y, Color c) {
		super(x, y, c);
	}

	private int height;
	private int width;

	
	public void setHeight(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int w) {
		width = w;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public double area() {
		double area = getHeight() * getWidth();
		return area;
	}
	@Override
	public void draw(Graphics g, int i) {
		g.setColor(getColor());
		g.fillRect(getXPosition(), getYPosition(), getWidth(), getHeight());
		g.setColor(Color.WHITE);
		g.drawString(toString(), (randomShapes.widthFrame - 200), ( 50 + i ));
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof Rectangle) {
			Rectangle rectangle = (Controller.Rectangle) obj;
			return getHeight() == rectangle.getHeight() && 
					getColor().equals(rectangle.getColor()) && getWidth() == rectangle.getWidth();
		}
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return " Prostok¹t "+this.getColor().getRed()+"-"+
				this.getColor().getGreen()+"-"+this.getColor().getBlue()+" "+area();
	}
}
