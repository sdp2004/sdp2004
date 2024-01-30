/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author acer
 */
public class Students {

    /**
     * @param args the command line arguments
     * 
     */
      int Student_roll;
    String Student_name;
    int [] Student_mark=new int[5];
    
   void Student(int roll,String name,int [] marks)
   {
       this.Student_roll=roll;
       this.Student_name=name;
       
       for(int i=0;i<5;i++)
       {
           this.Student_mark[i]=marks[i];
       }
   }
   
   void display()
   {
       System.out.println(Student_roll);
        System.out.println(Student_name);
        for (int i=0;i<5;i++)
        {
            System.out.println(Student_mark[i]);
        }
        
   }
   void average_marks()
   {
       int average=0;
      
       for (int i=0;i<5;i++)
       {
           average= average+Student_mark[i];
       }
      System.out.println(average/5);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Students s1=new Students();
        Students s2=new Students();
         Students s3=new Students();
        s1.Student(22, "Soumi",new int[]{30,40,45,50,50} );
       
        s2.Student(21,"Simon",new int[]{20,30,40,50,45});
        s3.Student(61,"Chandrani",new int[]{35,45,40,50,50});
        s1.display();
        s1.average_marks();
        s2.display();
        s2.average_marks(); 
        s3.display();
        s3.average_marks();
    }
    
    
}
