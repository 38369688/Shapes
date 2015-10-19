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
public class Triangle {

    public Triangle(double hight, double base) {
        this.base = base;
        this.hight = hight;
    }

    public double getBase() {
        return base;
    }

    public double getHight() {
        return hight;
    }

    public double getArea() {
        return (base * hight)/2;
    }

    private double base, hight;

}

