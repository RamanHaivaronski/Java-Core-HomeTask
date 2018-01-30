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
public class TriangularPyramid implements the3D {
    private double height;
    private double slantHeight;
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
    public double getSlantHeight(){
        return slantHeight;
    }
    public void setSlantHeight(double x){
        this.slantHeight = x;
    }
    @Override
    public double getArea(){
        return area = Math.sqrt(3)/4 * getSide()*getSide() + 1.5*getSide()*getSlantHeight();
    }
    @Override
    public double getVolume(){
        return volume = getHeight()*getSide()*getSide()/(4*Math.sqrt(3));
    }
}
