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
public class Rectangle {
    
    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getPerimeter(){
        return 2 * width + 2 *  length;
    }
    
    public double getArea(){
        return width * length;
    }
    
    private double length, width;
    
}
