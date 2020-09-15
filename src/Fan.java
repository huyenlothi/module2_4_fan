import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        this.on = !on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan() {
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }



    public String toString() {
        if (this.on) {
            return "Fan is on: { speed = " + this.speed + ", radius = " + this.radius + ", color = " + this.color + "}";
        } else {
            return "Fan is off: { speed = " + this.speed + ", radius = " + this.radius + ", color = " + this.color + "}";
        }
    }


    public static class Fan1{
        public static void main(String[] args) {
            Fan fan1 = new Fan();
            Fan fan2 = new Fan();
            fan1.setSpeed(fan1.FAST);
            fan2.setSpeed(fan2.MEDIUM);
            fan1.setColor("yellow");
            fan1.setOn();
            fan1.setRadius(10);
            fan2.setRadius(5);
            fan2.setColor("blue");
            fan2.setOn();
            fan2.setOn();

            System.out.println(fan1.toString());
            System.out.println(fan2.toString());
        }
    }
}
