package View;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Controller.*;

public class Drawing extends JPanel{
	
	int i = 0;
	
	private SpringLayout baseLayout;
	private JButton addShapeButton;
	private JButton counter;
	
	private String counterName = "Shape type counter";

	public static RandomShapes randomShapes;
	
	public Drawing() {
		baseLayout = new SpringLayout();
		addShapeButton = new JButton("Add Shapes");
		counter = new JButton(counterName);
		
		randomShapes = new RandomShapes();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	
	private void setupPanel() {
		//dodawanie do panelu komponentó
		this.setLayout(baseLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(addShapeButton);
		this.add(counter);
	}

	private void setupLayout() {
		//ustawianie layoutów
		baseLayout.putConstraint(SpringLayout.WEST, addShapeButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addShapeButton, -40, SpringLayout.SOUTH, this);
		
		baseLayout.putConstraint(SpringLayout.WEST, counter, 10, SpringLayout.EAST, addShapeButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, counter, -40, SpringLayout.SOUTH, this);
	}
	private void setupListeners() {
		//s³uchacz przycisku, przyk³ad urzycia klasy anonimowej
		
		addShapeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent click) {
				
				if(randomShapes.shapeSelection() == 1) {
					randomShapes.generateCircle();
				} else if (randomShapes.shapeSelection() == 2) {
					randomShapes.generateSquare();
				} else
					randomShapes.generateRectangles();
			
				repaint();
								
				counter.setEnabled(true);
				counter.setText(counterName);
			}
			
		});
		counter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int circles = 0;
				int rectangles = 0;
				int squares = 0;
				for(Shapes shape : randomShapes.list) {
					if(shape instanceof Circle) {
						circles++;
					}
					if(shape instanceof  Controller.Rectangle) {
						rectangles++;
					}
					if(shape instanceof Square) {
						squares++;
					}
				}
				counter.setText("Ko³a : "+circles+" Prostok¹ty : "+rectangles+" Kwadraty : "+squares);
				counter.setEnabled(false);
				
			}
			
		});
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// do odrysowywania
		super.paintComponent(g);
		int i = 0;
		Graphics2D mainGraphics = (Graphics2D) g;
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.WHITE);
		mainGraphics.drawString("Kszta³t RGB Pole", Toolkit.getDefaultToolkit().getScreenSize().width-200, 50);
		for(Shapes shape : randomShapes.list ) {
			i = i + 15;
			
			if(shape.getClass().isAssignableFrom(Circle.class)) {
				shape.draw(g,i);
			} else if(shape.getClass().isAssignableFrom(Controller.Rectangle.class)){
				shape.draw(g,i);
			} else {
				shape.draw(g,i);
			}
		}
		
			
	}
	
}
