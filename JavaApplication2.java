/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author acer
 */
import java.util.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[m];
        int[] arr2=new int[l];
        int pos1=0;
        int pos2=0;
        System.out.println("The elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        
        }
        for(int i=0;i<n;i++)
        {
        
            if(arr[i]%2==0)
            {
                arr1[pos1]=arr[i];
                pos1++;
            }
            else if(arr[i]%2!=0)
            {
                arr2[pos2]=arr[i];
                pos2++;
            }
        }
       System.out.println("The even array");
        for(int i=0;i<m;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("The odd array");
        for(int i=0;i<l;i++)
        {
            System.out.println(arr2[i]);
        }
    }
    
}
