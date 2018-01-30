/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Raman Haivaronski
 */
public class TriangularPrism implements the3D{
    private double height;
    private double side;
    private double area;
    private double volume;
    
    @Override
    public double getHeight(){
        return height;
    }
    public void setHeight(double x){
        this.height = x;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        this.side= s;
    }

    
    @Override
    public double getArea(){
        return area = 2*(Math.sqrt(3)*getSide()*getSide())/4 + 3*getSide()*getHeight();
    }
    @Override
    public double getVolume(){
        return volume = (Math.sqrt(3)*getSide()*getSide()*getHeight())/4;
    }

}
