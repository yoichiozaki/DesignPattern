package drawer;

import command.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawCanvas extends Canvas implements Drawable {
	private Color color = Color.red;
	private int radius = 6;
	private MacroCommad history;
	public DrawCanvas(int width, int height, MacroCommad history) {
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	public void paint(Graphics g) {
		history.execute();
	}
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x - radius, y - radius, radius*2, radius*2);
	}
}