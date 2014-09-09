import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args) 
        throws InterruptedException
    {
        World turtleWorld = new World(1750, 1000);
        
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
        
        int count = 300;
        int d = 10;
        int f = 10;
        while (count > 0)
        {
            turtle.forward(f);
            turtle1.forward(f);
            turtle2.forward(f);
            turtle3.forward(f);
            turtle4.forward(f);
            turtle5.forward(f);
            turtle6.forward(f);
            turtle7.forward(f);
            turtle8.forward(f);
            turtle9.forward(f);
            Thread.sleep(100);
            turtle.turn(d);
            turtle1.turn(d);
            turtle2.turn(d);
            turtle3.turn(d);
            turtle4.turn(d);
            turtle5.turn(d);
            turtle6.turn(d);
            turtle7.turn(d);
            turtle8.turn(d);
            turtle9.turn(d);
            d = d + 10;
            f = f + 1;
            count = count - 1;
    }
}
}
