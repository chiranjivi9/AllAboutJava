public class AreaCalculator {

    public static void main(String[] args){
        area(-1);
        area(2);
        area(5);
        area(2,5);
        area(-1,4);
    }

    public static double area(double radius){

        double pi = 3.14159;
        if(radius < 0){
            System.out.println("Invalid Value for radius. (Radius given: " + radius + ")");
            return -1.0;
        } else {
            double areaOfCircle = radius * radius * pi;
            System.out.println("The are of circle with radius:" + radius +" is "+ areaOfCircle);
            return areaOfCircle;
        }
    }

    public static double area(double x, double y){

        if(x<0 || y<0){
            System.out.println("Invalid Value given. (Values: "+ x + ", " + y + ")");
            return -1.0;
        } else {

            double areaOfRectangle = x * y;
            System.out.println("The area of Rectangle with sides "+ x + ", "+ y +" is "+ areaOfRectangle);
            return areaOfRectangle;
        }
    }
}

