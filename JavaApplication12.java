/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author acer
 */
class Brand
{
 String Car_name="Ford";
}
public class JavaApplication12 {
String getBrand()
{
    Brand cn=new Brand();
    return cn.Car_name;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication12 j=new JavaApplication12();
        String Brand_name=j.getBrand();
        System.out.println(Brand_name);
    }
    
}
