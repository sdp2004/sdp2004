/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author acer
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    int Student_roll;
    String Student_name;
    int [] Student_marks=new int[]{0,0,0,0,0};
    
   void Student(int roll,String name,int [] marks)
   {
       this.Student_roll=roll;
       this.Student_name=name;
       for(int i=0;i<5;i++)
       {
           this.Student_marks[i]=marks[i];
       }
   }
   void Student()
   {
       this.Student_roll=0;
       this.Student_name="Unknown";
   }
   void display()
   {
       System.out.println(Student_roll);
        System.out.println(Student_name);
        for (int i=0;i<5;i++)
        {
            System.out.println(Student_marks[i]);
        }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Student s=new Student();
        Student m=new Student();
        s.Student(22, "Soumi",new int[]{30,40,45,50,50} );
       
        m.Student();
         s.display();
        m.display();
    }
    
}
