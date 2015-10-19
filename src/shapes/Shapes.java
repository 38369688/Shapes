/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author user
 */
public class Shapes {

    public static void main(String[] args) {
        testShapes();
    }

    private static void testShapes() {
        Circle myCircle = new Circle(5.5);

        System.out.println("Circle");
        System.out.printf("radius     = %.2f\n", myCircle.getRadius());
        System.out.printf("Diamiter   =%.2f\n", myCircle.getDiameter());
        System.out.printf("Area       = %.2f\n", myCircle.getArea());
        System.out.printf("Circumference      =%.2f\n", myCircle.getCircumfrence());

        Rectangle myRectangle = new Rectangle(2.0, 8.4);

        System.out.println("Rectangle");
        System.out.printf("width    = %.2f\n", myRectangle.getWidth());
        System.out.printf("length   =%.2f\n", myRectangle.getLength());
        System.out.printf("Area       = %.2f\n", myRectangle.getArea());
        System.out.printf("Perimeter      =%.2f\n", myRectangle.getPerimeter());
        
        Triangle myTriangle = new Triangle(2.0, 7.0);

        System.out.println("Triangle");
        System.out.printf("Base    = %.2f\n", myTriangle.getBase());
        System.out.printf("Hight  =%.2f\n", myTriangle.getHight());
        System.out.printf("Area       = %.2f\n", myTriangle.getArea());
//        System.out.printf("Perimeter      =%.2f\n", myTriangle.getPerimeter());

    }

}
