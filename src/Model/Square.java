package Model;

import java.awt.Color;
import java.awt.Graphics;

import Controller.Shapes;

public class Square extends Shapes{

	public Square(int x, int y, Color c) {
		super(x, y, c);
	}
	
	private int side;
	
	public void setSide(int s) {
		side = s;
	}
	public int getSide() {
		return side;
	}
	@Override
	public double area() {
		double area = getSide() * getSide();
		return area;
	}
	@Override
	public void draw(Graphics g, int i) {
		g.setColor(getColor());
		g.fillRect(getXPosition(), getYPosition(), getSide(), getSide());
		g.setColor(Color.WHITE);
		g.drawString(toString(), (randomShapes.widthFrame - 200), ( 50 + i ));
	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return true;
//		}
//		if (obj instanceof Square) {
//			Square square = (Square) obj;
//			return getSide() == square.getSide() && getColor().equals(square.getColor()); 
//		}
//		return true;
//	}
	
	@Override
	public String toString() {
		return " Kwadrat "+this.getColor().getRed()+"-"+
				this.getColor().getGreen()+"-"+this.getColor().getBlue()+" "+(int)area();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + side;
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
		if (!(obj instanceof Square)) {
			return false;
		}
		Square other = (Square) obj;
		if (side != other.side) {
			return false;
		}
		return true;
	}
}
