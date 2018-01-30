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
public class Square implements the2D{
    
    private double upperLeftX;
    private double lowerRightX;
    private double sideValue;
    private double area;
    
    public double getUpperLeftX(){
        return upperLeftX;
    }
    public double getLowerRightX(){
        return lowerRightX;
    }
    public void setUpperLeftX(double x){
            this.upperLeftX = x;
    }
    public void setLowerRightX(double y){
            this.lowerRightX = y;
    }
    @Override
    public double getDistance(){
        return sideValue = Math.abs(lowerRightX - upperLeftX);
    }
    @Override
    public double getArea(){
        return area = getDistance()*getDistance();
    }
}
