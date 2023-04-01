/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;

public class Student {
   public String name;
   private int age;
   
   public int getAge() {
       //complete Getter
       return age;
       
   }
   public void setAge(int age) {
       //complete Setter
       if(age<0){
           System.out.println("Invalid age");
           this.age=0;
       }
       else{
           this.age=age;
       }
       
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
       String name = read.nextLine();
       int age = read.nextInt();
       Student student = new Student();
       student.name = name;
       student.setAge(age);
       
       //set the age via Setter
       
       
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}
    
    

