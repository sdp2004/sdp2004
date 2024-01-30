/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;

/**
 *
 * @author acer
 */
import java.util.*;
public class JavaApplication8 {
public void arrsum(int...val)
{
    int sum=0;
    for(int i=0;i<val.length;i++)
    {
        sum=sum+val[i];
    }
    System.out.println("The sum is"+" "+sum);
    
    String str="";
    String new_str="";
    str=Integer.toString(sum);
    for(int j=str.length()-1;j>=0;j--)
    {
        new_str=new_str+str.charAt(j);
    }
    System.out.println(Integer.parseInt(new_str));
    
   
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication8 li=new JavaApplication8();
        li.arrsum(2,4,6,7);
        
    }
    
}
