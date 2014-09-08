import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args) 
        throws InterruptedException
    {
        World turtleWorld = new World();
        
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setColor(Color.magenta);
        turtle.setHeight(100);
        turtle.setWidth(100);
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setColor(Color.cyan);
        turtle1.setHeight(90);
        turtle1.setWidth(90);
        turtle1.turn(36);
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setColor(Color.black);
        turtle2.setHeight(80);
        turtle2.setWidth(80);
        turtle2.turn(72);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setColor(Color.red);
        turtle3.setHeight(70);
        turtle3.setWidth(70);
        turtle3.turn(108);
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle4.setColor(Color.blue);
        turtle4.setHeight(60);
        turtle4.setWidth(60);
        turtle4.turn(144);
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle5.setColor(Color.yellow);
        turtle5.setHeight(50);
        turtle5.setWidth(50);
        turtle5.turn(180);
        Turtle turtle6 = new Turtle(turtleWorld);
        turtle6.setColor(Color.green);
        turtle6.setHeight(40);
        turtle6.setWidth(40);
        turtle6.turn(216);
        Turtle turtle7 = new Turtle(turtleWorld);
        turtle7.setColor(Color.pink);
        turtle7.setHeight(30);
        turtle7.setWidth(30);
        turtle7.turn(252);
        Turtle turtle8 = new Turtle(turtleWorld);
        turtle8.setColor(Color.orange);
        turtle8.setHeight(20);
        turtle8.setWidth(20);
        turtle8.turn(288);
        Turtle turtle9 = new Turtle(turtleWorld);
        turtle9.setColor(Color.gray);
        turtle9.setHeight(10);
        turtle9.setWidth(10);
        turtle9.turn(324);
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int x : numbers)
        {
            turtle.forward(30);
            turtle1.forward(30);
            turtle2.forward(30);
            turtle3.forward(30);
            turtle4.forward(30);
            turtle5.forward(30);
            turtle6.forward(30);
            turtle7.forward(30);
            turtle8.forward(30);
            turtle9.forward(30);
            Thread.sleep(1000);
            turtle.turn(10);
            turtle1.turn(10);
            turtle2.turn(10);
            turtle3.turn(10);
            turtle4.turn(10);
            turtle5.turn(10);
            turtle6.turn(10);
            turtle7.turn(10);
            turtle8.turn(10);
            turtle9.turn(10);
    }
}
}
