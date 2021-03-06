package Controller;

import java.util.*;

import java.awt.*;


public class RandomShapes {
		
	public HashSet<Shapes> list;
	
	private int widthFrame;
	private int heightFrame;
	
	private final int borderTmp = 200;
	private final int rgbTmp = 256;
	
	public int getWidthFrame() {
		return widthFrame;
	}

	public int getHeightFrame() {
		return heightFrame;
	}

	public int getBorderTmp() {
		return borderTmp;
	}

	public RandomShapes() {
		list = new HashSet<Shapes>();
		widthFrame = Toolkit.getDefaultToolkit().getScreenSize().width;
		heightFrame = Toolkit.getDefaultToolkit().getScreenSize().height;
	}
	
	public int shapeSelection() {
		int tmp = (int) (Math.random() * 3 + 1);
		return tmp;
	}
	public int randomRadius() {
		int random_Radius = (int)((Math.random() * borderTmp) + 1);
		return random_Radius;
	}
	//koordynaty x cofni�te o szeroko�� pola z informacjami o obiektach
	public int randomCoordinatesOfX() {
		int random_X = (int)((Math.random() * (widthFrame - borderTmp*2)) + 1);
		return random_X;
	}
	public int randomCoordinatesOfY() {
		int random_Y = (int)((Math.random() * (heightFrame - borderTmp)) + 1);
		return random_Y;
	}
	public int randomSide() {
		int random_side = (int)((Math.random() * borderTmp) + 1);
		return random_side;
	}
	public Color randomColor() {
		int red = (int)(Math.random() * rgbTmp);
		int green = (int)(Math.random() * rgbTmp);
		int blue = (int)(Math.random() * rgbTmp);
		
		Color randomColor = new Color(red, green, blue);
		return randomColor;
	}
	public void generateCircle() {
		Model.Circle circle = new Model.Circle(randomCoordinatesOfX(), randomCoordinatesOfY(), randomColor());
		circle.setRadius(randomRadius());
		if(list.isEmpty()) {
			list.add(circle);
		}

		if(!(list.contains(circle))) {
			list.add(circle);
		}
	}
	public void generateRectangles() {
		Model.Rectangle rectangle = new Model.Rectangle(randomCoordinatesOfX(), randomCoordinatesOfY(), randomColor());
		rectangle.setHeight(randomSide());
		rectangle.setWidth(randomSide());
		if(list.isEmpty()) {
			list.add(rectangle);
		}

		if(!(list.contains(rectangle))) {
			list.add(rectangle);
		}
	}
	public void generateSquare() {
		Model.Square square = new Model.Square(randomCoordinatesOfX() , randomCoordinatesOfY(), randomColor());
		square.setSide(randomSide());
		if(list.isEmpty()) {
			list.add(square);
		}

		if(!(list.contains(square))) {
			list.add(square);
		}
	}
}
