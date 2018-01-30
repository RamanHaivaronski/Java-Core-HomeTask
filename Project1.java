/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author Raman Haivaronski
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello! Welcome to the world of geometry!");
        
        while (true){
            System.out.println("Please choose 1: 2D figures 2: 3D figures 3: Exit");

            switch (input.next()) {
                case "1":
                    System.out.println("Please choose the 2D figure from the list");
                    System.out.println("1: Circle  2: Square 3: Equilateral triangle");
                    switch (input.next()){
                        case "1": {
                            Circle obj = new Circle();
                            System.out.println("Please enter the circle center X coordinate");
                            obj.setCenterOfCircleX(input.nextDouble());
                            System.out.println("Please enter the radius X coordinate");
                            obj.setRadiusOfCircleX(input.nextDouble());
                            if (obj.getCenterOfCircleX() == obj.getRadiusOfCircleX()){
                                System.out.println("It is the point not the circle!");
                                break;
                            }
                            obj.getDistance();
                            System.out.println("The area of your circle is: " + obj.getArea());
                            break;
                        }
                        case "2": {
                            Square obj = new Square();
                            System.out.println("Please enter the upper left X coordinate");             // I used Math.abs() to avoid the exception where x2-x1 < 0
                            obj.setUpperLeftX(input.nextDouble());
                            System.out.println("Please enter the lower right X coordinate"); 
                            obj.setLowerRightX(input.nextDouble());
                            if (obj.getLowerRightX() == obj.getUpperLeftX()){
                                System.out.println("It is not the square, enter the correct value");
                                break;
                            }
                            obj.getDistance();
                            System.out.println("The area of your square is: " + obj.getArea());
                            break;
                        }
                        case "3":
                            Triangle obj = new Triangle();
                            System.out.println("Please enter the vertice 1 X coordinate");
                            obj.setVerticeX1(input.nextDouble());
                            System.out.println("Please enter the vertice 1 Y coordinate");
                            obj.setVerticeY1(input.nextDouble());
                            System.out.println("Please enter the vertice 2 X coordinate");
                            obj.setVerticeX2(input.nextDouble());
                            System.out.println("Please enter the vertice 2 Y coordinate");
                            obj.setVerticeY2(input.nextDouble());
                            System.out.println("Please enter the vertice 3 X coordinate");
                            obj.setVerticeX3(input.nextDouble());
                            System.out.println("Please enter the vertice 3 Y coordinate");
                            obj.setVerticeY3(input.nextDouble());
                            if ((obj.getVerticeX1() == obj.getVerticeX2() & obj.getVerticeX1() == obj.getVerticeX3()) || (obj.getVerticeY1() == obj.getVerticeY2() & obj.getVerticeY1() == obj.getVerticeY3()) ){
                                System.out.println("It is line instead of the Triangle");
                                break;
                            }
                            obj.getDistance();
                            System.out.println("The area of your square is: " + obj.getArea());
                            break;
                        default:
                            System.out.println("Please enter the correct number 1 2 3");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Please choose the figure from the list");
                    System.out.println("1: Cone  2: Triangular Prism 3: Square Prism 4: Cylinder 5: Triangular Pyramid 6: Square Pyramid");
                    switch (input.next()){
                        case "1": {
                            Cone obj = new Cone();
                            System.out.println("Enter the radius of the Cone: ");
                            obj.setRadius(input.nextDouble());
                            System.out.println("Enter the height of the Cone: ");
                            obj.setHeight(input.nextDouble());
                            System.out.println("Enter the slant height of the Cone: ");                // I avoided using try-catch blocks and used if, because try-catch are very expensive and I usually use it  during tread manipulation and database connection and serialization process
                            obj.setSlantHeight(input.nextDouble());
                            if (obj.getSlantHeight() < obj.getHeight()){
                                System.out.println("Slant height must be more than normal height!");
                                break;
                            }
                            if (obj.getHeight() == 0){
                                System.out.println("Height can not be zero!");
                                break;
                            }
                            System.out.println("The area of your Cone is: " + obj.getArea());
                            System.out.println("The volume of your Cone is: " + obj.getVolume());
                            break;
                        }
                        case "2": {
                            TriangularPrism obj = new TriangularPrism();
                            System.out.println("Enter the value of the side of the Triangular Prism: ");
                            obj.setSide(input.nextDouble());
                            System.out.println("Enter the height of the TriangularPrism: ");
                            obj.setHeight(input.nextDouble());
                            if (obj.getHeight() == 0){
                                System.out.println("Height can not be zero!");
                                break;
                            }
                            System.out.println("The area of your Triangular Prism is: " + obj.getArea());
                            System.out.println("The volume of your Triangular Prism is: " + obj.getVolume()); 
                            break;
                        }
                        case "3": {
                            SquarePrism obj = new SquarePrism();
                            System.out.println("Enter the value of the side of the Square Prism: ");
                            obj.setSide(input.nextDouble());
                            System.out.println("Enter the height of the Square Prism: ");
                            obj.setHeight(input.nextDouble());
                            if (obj.getHeight() == 0){
                                System.out.println("Height can not be zero!");
                                break;
                            }
                            System.out.println("The area of your Square Prism is: " + obj.getArea());
                            System.out.println("The volume of your Square Prism is: " + obj.getVolume());
                            break;
                        }
                        case "4": {
                            Cylinder obj = new Cylinder();
                            System.out.println("Enter the radius of the Cylinder: ");
                            obj.setRadius(input.nextDouble());
                            System.out.println("Enter the height of the Cylinder: ");
                            obj.setHeight(input.nextDouble());
                            if (obj.getHeight() == 0){
                                System.out.println("Height can not be zero!");
                                break;
                            }
                            System.out.println("The area of your Cylinder is: " + obj.getArea());
                            System.out.println("The volume of your Cylinder is: " + obj.getVolume());
                            break;
                        }
                        case "5": {
                            TriangularPyramid obj = new TriangularPyramid();
                            System.out.println("Enter the radius of the Triangular Pyramid: ");
                            obj.setSide(input.nextDouble());
                            System.out.println("Enter the height of the Triangular Pyramid: ");
                            obj.setHeight(input.nextDouble());
                            System.out.println("Enter the slant height of the Triangular Pyramid: ");
                            obj.setSlantHeight(input.nextDouble());
                            if (obj.getSlantHeight() < obj.getHeight()){
                                System.out.println("Slant height must be more than normal height!");
                                break;
                            }
                            if (obj.getHeight() == 0){
                                System.out.println("Height can not be zero!");
                                break;
                            }
                            System.out.println("The area of your Triangular Pyramid is: " + obj.getArea());
                            System.out.println("The volume of your Triangular Pyramid is: " + obj.getVolume()); 
                            break;
                        } 
                        case "6": {
                            SquarePyramid obj = new SquarePyramid();
                            System.out.println("Enter the radius of the Square Pyramid: ");
                            obj.setSide(input.nextDouble());
                            System.out.println("Enter the height of the Square Pyramid: ");
                            obj.setHeight(input.nextDouble());
                            System.out.println("Enter the slant height of the Square Pyramid: ");
                            obj.setSlantHeight(input.nextDouble());
                            if (obj.getSlantHeight() < obj.getHeight()){
                                System.out.println("Slant height must be more than normal height!");
                                break;
                            }
                            if (obj.getHeight() == 0){
                                System.out.println("Height can not be zero!");
                                break;
                            }
                            System.out.println("The area of your Square Pyramid is: " + obj.getArea());
                            System.out.println("The volume of your Square Pyramid is: " + obj.getVolume());
                            break;
                        }
                        default: {
                            System.out.println("Please enter the correct number 1 2 3 4 5 6");
                            break;
                        }
                    }
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Please enter the correct number ");
                    break;
            }
        } // end of while(true)
    }  // end of main 
} // end of class
