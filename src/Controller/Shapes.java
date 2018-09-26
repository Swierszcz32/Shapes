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
		
}
