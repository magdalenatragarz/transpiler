public class Circle {

    public double radius;
    public String colour;
    public int x;
    public int y;
    public final static double pi = 3.1415926;

    public Circle(double radius, String colour, int x, int y) {
        this.radius = radius;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    public double getArea(){
        return pi*radius*radius;
    }

    public void printInformation(){
        System.out.println("The centre of " + colour + " circle is (" + x + ", " + y + "). It's area is " + getArea());
        printQuadrant();
    }

    public void printQuadrant(){
        if (x == 0 || y==0){
            System.out.println("Circle's centre is placed on axis.");
        }else if (x > 0 && y > 0){
            System.out.println("Circle's centre is placed in first quadrant.");
        }else if (x > 0 && y < 0){
            System.out.println("Circle's centre is placed in fourth quadrant.");
        }else if (x < 0 && y > 0){
            System.out.println("Circle's centre is placed in second quadrant.");
        }else{
            System.out.println("Circle's centre is placed in third quadrant.");
        }
    }

}


// public static void main(String[] args) {

//     Circle blue_circle = new Circle(5.0,"blue",5,10);
//     Circle green_circle = new Circle(2.0, "green",-2,0);

//     Circle[] circles = {blue_circle,green_circle};

//     for (int i=0; i < circles.length; ++i){
//         circles[i].printInformation();
//     }
// }




