/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author acer
 */

public class JavaApplication4 {
 
        
    
public void Area(int a, double b)
{
 System.out.println("Area of rectangle"+" "+a*b);
}
public void Area(double r)
{
    System.out.println("Area of circle"+" "+3.14*2*r);
}
public void Area(int x)
{
    System.out.println("Area of square"+" "+x*x);
}



    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JavaApplication4 a1=new JavaApplication4();
       
       a1.Area(400,500.4567);
       a1.Area(3.2);
       a1.Area(8);
       
       
        
    }
    
}
