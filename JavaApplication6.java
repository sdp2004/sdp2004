/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author acer
 */
import java.util.*;
public class JavaApplication6 {
public void list(int ...a){
    int max=a[0];
    int sum=0;
    System.out.println("the length of the argument"+" "+a.length);
    for (int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    System.out.println("the largest argument is"+" "+max);
    for (int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    System.out.println("The sum is"+" "+sum);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     JavaApplication6 l=new JavaApplication6();
     l.list(2,5,4,6);
   
}
}
