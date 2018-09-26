package Controller;

import java.awt.*;

public abstract class Shapes implements FeaturesOfShape {
	
	
	
	protected Color color;
	protected int xPosition;
	protected int yPosition;
	
	RandomShapes randomShapes = new RandomShapes();
	
	public Shapes(int x, int y, Color c) {
		xPosition = x;
		yPosition = y;
		color = c;
	}

	@Override
	public int getXPosition() {
		return xPosition;
	}

	@Override
	public int getYPosition() {
		return yPosition;
	}

	@Override
	public Color getColor() {
		return color;
	}
	//metoda do obliczania powierzchni nadpisana dla ka¿dego kszta³tu
	public abstract double area();
	//metoda draw s³u¿y do rysowania kszta³tów nadpisana odpowiednio w dzieciach,
	//wykorzystanie jednej metody do rysowania i wypisywania informacji o obiekcie
	//przeczy z zasad¹ pojedyñczej odpowiedzialnoœci lecz ze wzglêdu na œcis³e 
	//powi¹zanie tych dwóch zabiegów zdecydowa³em siê na ten ruch
	public abstract void draw(Graphics g, int i);

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + xPosition;
		result = prime * result + yPosition;
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
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Shapes)) {
			return false;
		}
		Shapes other = (Shapes) obj;
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		if (xPosition != other.xPosition) {
			return false;
		}
		if (yPosition != other.yPosition) {
			return false;
		}
		return true;
	}
		
	
}
