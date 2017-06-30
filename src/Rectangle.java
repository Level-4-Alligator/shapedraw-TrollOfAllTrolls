import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
	protected int width;
	protected int height;

	public Rectangle(int x, int y, int Width, int Height) {
		super(x, y);
		width = Width;
		height = Height;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
