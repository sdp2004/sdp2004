/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author acer
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    int length;
    int breadth; 
    int side;
    int area1;
    int area2;
 void JavaApplication16(int...parameter)
 {
     if(parameter.length==2)
     {
         
              length= parameter[0];

       breadth= parameter[1];
        area1= length*breadth;
     }
     else if(parameter.length==1)
     {
        side= parameter[0];
         area2=side*side;
     }
 }
 void display()
 {
     System.out.println(area1);
     System.out.println(area2);
 }
    public static void main(String[] args) {
        // TODO code application logic here
         JavaApplication16 ar=new  JavaApplication16();
         ar. JavaApplication16(42,23);
         ar.JavaApplication16(34);
         ar.display();
    }
    
}
