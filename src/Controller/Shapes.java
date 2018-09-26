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
	//metoda do obliczania powierzchni nadpisana dla ka�dego kszta�tu
	public abstract double area();
	//metoda draw s�u�y do rysowania kszta�t�w nadpisana odpowiednio w dzieciach,
	//wykorzystanie jednej metody do rysowania i wypisywania informacji o obiekcie
	//przeczy z zasad� pojedy�czej odpowiedzialno�ci lecz ze wzgl�du na �cis�e 
	//powi�zanie tych dw�ch zabieg�w zdecydowa�em si� na ten ruch
	public abstract void draw(Graphics g, int i);
		
}
