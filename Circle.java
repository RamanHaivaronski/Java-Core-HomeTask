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
class Circle implements the2D{
    
    private double centerOfCircleX;
    private double radiusOfCircleX;
    private double radiusOfCircle;
    private double area;
    
    public double getCenterOfCircleX(){
        return centerOfCircleX;
    }
    public double getRadiusOfCircleX(){
        return radiusOfCircleX;
    }
    public void setCenterOfCircleX(double x){
            this.centerOfCircleX = x;
    }
    public void setRadiusOfCircleX(double y){
            this.radiusOfCircleX = y;
    }
    
    @Override
    public double getDistance(){
        return radiusOfCircle = Math.abs(radiusOfCircleX - centerOfCircleX);
    }
    @Override
    public double getArea(){
        return area = Math.PI*getDistance()*getDistance();
    }
    
}
