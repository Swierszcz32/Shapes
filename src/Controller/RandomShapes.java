package Controller;

import java.util.*;

import javax.swing.JFrame;

import java.awt.*;


public class RandomShapes {
		
	public HashSet<Shapes> list;
	int widthFrame;
	int heightFrame;
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
		int random_Radius = (int)((Math.random() * 200) + 1);
		return random_Radius;
	}
	//koordynaty x cofni�te o szeroko�� pola z informacjami o obiektach
	public int randomCoordinatesOfX() {
		int random_X = (int)((Math.random() * (widthFrame - 400)) + 1);
		return random_X;
	}
	public int randomCoordinatesOfY() {
		int random_Y = (int)((Math.random() * (heightFrame - 200)) + 1);
		return random_Y;
	}
	public int randomSide() {
		int random_side = (int)((Math.random() * 200) + 1);
		return random_side;
	}
	public Color randomColor() {
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		
		Color randomColor = new Color(red, green, blue);
		return randomColor;
	}
	public void generateCircle() {
		Controller.Circle circle = new Circle(randomCoordinatesOfX(), randomCoordinatesOfY(), randomColor());
		circle.setRadius(randomRadius());
		if(list.isEmpty()) {
			list.add(circle);
		}

		if(!(list.contains(circle))) {
			list.add(circle);
		}
	}
	public void generateRectangles() {
		Controller.Rectangle rectangle = new Controller.Rectangle(randomCoordinatesOfX(), randomCoordinatesOfY(), randomColor());
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
		Controller.Square square = new Square(randomCoordinatesOfX() , randomCoordinatesOfY(), randomColor());
		square.setSide(randomSide());
		if(list.isEmpty()) {
			list.add(square);
		}

		if(!(list.contains(square))) {
			list.add(square);
		}
	}
}
