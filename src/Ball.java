import processing.core.PApplet;

public class Ball extends PApplet {
    public static  final int WIDTH=800;
    public static  final int HEIGHT=600;
    drawEllipse do1= new drawEllipse(1.5, (HEIGHT/5), 20, 20,WIDTH, this);
    drawEllipse do2= new drawEllipse(2.5, (HEIGHT*2)/5, 20, 20,WIDTH, this);
    drawEllipse do3= new drawEllipse(3.5, (HEIGHT*3)/5, 20, 20,WIDTH, this);
    drawEllipse do4= new drawEllipse(4.5, (HEIGHT*4)/5, 20, 20,WIDTH, this);

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }



    public void draw() {

        do1.moves();
        do2.moves();
        do3.moves();
        do4.moves();

    }
    void construct(){
        PApplet.main("Ball");
    }


}

// public void paintWhite(){
//background(255);


