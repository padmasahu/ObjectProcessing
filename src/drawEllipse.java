import processing.core.PApplet;
public class drawEllipse {
    private double inc;
    private int height;
    private int diameter;
    private int diameter2;
    private int width;
    private PApplet pApplet;

    drawEllipse(double start, int height, int diameter, int diameter2, int width, PApplet pApplet) {
        this.inc = start;
        this.height = height;
        this.diameter = diameter;
        this.diameter2 = diameter2;
        this.width = width;
        this.pApplet = pApplet;
    }

    public void moves() {
        for (int start = 0; start <= width; start += inc)
            pApplet.ellipse(start, height, 20, 20);
    }
}