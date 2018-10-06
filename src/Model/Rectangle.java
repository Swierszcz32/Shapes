package Model;

import java.awt.Color;
import java.awt.Graphics;

import Controller.Shapes;

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
	public String toString() {
		return " Prostok¹t "+this.getColor().getRed()+"-"+
				this.getColor().getGreen()+"-"+this.getColor().getBlue()+" "+area();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + height;
		result = prime * result + width;
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
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}
}
