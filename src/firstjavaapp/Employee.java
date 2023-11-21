/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

/**
 *
 * @author B-22
 */
public class Employee {
    static public int varPublic = 5;
    protected static int varProtected = 5;
    private static boolean varPrivate = false;
    static Integer varDefault = 500;
    
    int age = 5;
    String name = "Saiful";
    
    public void printValEmployee(int abc){
        System.out.println(Employee.varDefault);
        System.out.println(abc);
    }
    
//    Integer num2;
//    public String abc = "";
    
    public void fuc(){
    System.out.println("def");
    };
    public static void main(String[] args){
        FirstJavaApp dt = new FirstJavaApp();
        System.out.println(dt.var57);
        dt.testMethod2(800);
        System.out.println(dt.var57);
    }
    
}
