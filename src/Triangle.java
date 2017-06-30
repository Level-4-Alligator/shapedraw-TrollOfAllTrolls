import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape {
	protected int width;
	protected int height;
	Polygon p = new Polygon();

	public Triangle(int x, int y, int Width, int Height) {
		super(x, y);
		width = Width;
		height = Height;

	}

	public void draw(Graphics g) {
		p.addPoint(x, y + height);
		p.addPoint(x + (width / 2), y);
		p.addPoint(x + width, y + height);
		g.setColor(color);
		g.fillPolygon(p);
		p.reset();
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
