/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author acer
 */
import java.util.*;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
   static public void check(String s) {
        // TODO code application logic here
       for (int i=0;i<s.length();i++) 
           
       {
           for(int k=0;k<26;k++)
           {
           if (s.charAt(i)== (char)(k+65) || s.charAt(i)== (char)(k+97) )
           {
               System.out.println("The name only consists of alphabets");
               return;
           }
           
       }
       for (int k=0;k<10;k++) 
       {
           if (s.charAt(i)==(char)(k+48))
           {
               System .out.println("The age only consists of numbers");
               return;
           }
       
       }
    }
       
    
}
    public static void main(String[] args)
    {
       String name= "Ramen";
       String age="45";
       check(name);
       check(age);
    }
}
