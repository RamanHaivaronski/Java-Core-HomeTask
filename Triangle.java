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
class Triangle implements the2D{
    
    private double verticeX1;
    private double verticeX2;
    private double verticeY1;
    private double verticeY2;
    private double verticeX3;
    private double verticeY3;
    private double sideValue;
    private double halfPerimeter;
    private double area;
    
    public double getVerticeX1(){
        return verticeX1;
    }
    public double getVerticeX2(){
        return verticeX2;
    }
    public double getVerticeX3(){
        return verticeX3;
    }
    public double getVerticeY1(){
        return verticeY1;
    }
    public double getVerticeY2(){
        return verticeY2;
    }
    public double getVerticeY3(){
        return verticeY3;
    }
    public void setVerticeX1(double x){
            this.verticeX1 = x;
    }
    public void setVerticeX2(double x){
            this.verticeX2 = x;
    }
    public void setVerticeX3(double x){
            this.verticeX3 = x;
    }
    public void setVerticeY1(double y){
            this.verticeY1 = y;
    }
    public void setVerticeY2(double y){
            this.verticeY2 = y;
    }
    public void setVerticeY3(double x){
            this.verticeY3 = x;
    }
    
    @Override
    public double getDistance(){
        if (getVerticeX1() != getVerticeX2() && getVerticeY1() != getVerticeY2()){
            sideValue = Math.sqrt(Math.abs((getVerticeX2() - getVerticeX1())*(getVerticeX2() - getVerticeX1()))+Math.abs((getVerticeY2() - getVerticeY1())*(getVerticeY2() - getVerticeY1())));
        } 
        else if (getVerticeX1() == getVerticeX2()) {
            sideValue = Math.abs(getVerticeY2() - getVerticeY1());
        }
        else if (getVerticeY1() == getVerticeY2()){
            sideValue = Math.abs(getVerticeX2() - getVerticeX1());
        }
        return sideValue;
    }
    @Override
    public double getArea(){
        halfPerimeter = getDistance()*3/2;
        return area = Math.sqrt(halfPerimeter * (halfPerimeter-getDistance()) * 3);  // as we have equilateral triangle in the description I changed the logic and formulas accordingly
    }
    
}
