package Controller;

import java.util.*;

import javax.swing.JFrame;

import java.awt.*;


public class RandomShapes {
		
	public ArrayList<Shapes> list;
	int widthFrame;
	int heightFrame;
	public RandomShapes() {
		list = new ArrayList<Shapes>();
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
	//koordynaty x cofniête o szerokoœæ pola z informacjami o obiektach
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
		int tmp = 0;
		int tmp1 = 0;
			for(Shapes shape : list) {
				if(!(shape instanceof Circle))	{
					tmp1 = 1;
				} else tmp1 = 2;
				if(!(shape.equals(circle))){
					tmp = 1;
				} else tmp = 2;
			} 
			if(tmp1 == 1) { 
				System.out.println("Pierwsze Ko³o"); 
			} 
			if(tmp1 == 2) {
				System.out.println("Ko³a obecne ju¿");
			}
			if(tmp == 1) {
				System.out.println("Ko³o poprawne");
			}
			if(tmp == 2) {
				System.out.println("Ko³o Powtórzone");
			}
			if(tmp == 1 || tmp1 == 1) {
				list.add(circle);
				System.out.println(circle.toString());
			}
	}
	public void generateRectangles() {
		Controller.Rectangle rectangle = new Controller.Rectangle(randomCoordinatesOfX(), randomCoordinatesOfY(), randomColor());
		rectangle.setHeight(randomSide());
		rectangle.setWidth(randomSide());
		if(list.isEmpty()) {
			list.add(rectangle);
		}
		int tmp = 0;
		int tmp1 = 0;
		for(Shapes shape : list) {
			if (!(shape instanceof Rectangle)) {
				tmp1 = 1;
			} else tmp1 = 2;
			if(!(shape.equals(rectangle))){
				tmp = 1;
			} else tmp = 2;
		} 
		if(tmp == 1 || tmp1 == 1) {
			list.add(rectangle);
			System.out.println(rectangle.toString());
		}
	}
	public void generateSquare() {
		Controller.Square square = new Square(randomCoordinatesOfX() , randomCoordinatesOfY(), randomColor());
		square.setSide(randomSide());
		if(list.isEmpty()) {
			list.add(square);
		}
		int tmp = 0;
		int tmp1 = 0;
		for(Shapes shape : list) {
			if(shape instanceof Square) {
				tmp1 = 1;
			} else tmp1 = 2;
			if(!(shape.equals(square))){
				tmp = 1;
			} else tmp = 2;
		} 
		if(tmp == 1) {
			list.add(square);
			System.out.println(square.toString());
		}
	}
}
