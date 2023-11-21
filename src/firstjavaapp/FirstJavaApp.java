
package firstjavaapp;

import java.util.Scanner;


public class FirstJavaApp {

  
    public Integer var57 = 100;
    public static Integer var10 = 10;

    public static void xyz() {
        Integer var20 = 20;
        System.out.println(var20);

//          Data Type:
    }

    public void testMethod2(Integer num) {
        this.var57 = num;
    }

    public static void areaCal(double r) {
        double area;
        area = r * r * 3.14159;
        System.out.println("Area-- " + area);
    }

    public static void main(String[] args) {
//        System.out.println("Hello World!!!");
//        System.out.println("Hello World!!!");
//        
//        Integer abc = 500;
//        
//        Employee emp = new Employee();
//        emp.;println(Employee.varDefault);

        xyz();

//        DataTypes obj = new DataTypes();
//        obj.testMethod2();
//        
//        testMethod2(Integer num); 
//     public void printVal(){
//        System.out.println(Employee.varPublic);
        System.out.println(var10);

        FirstJavaApp def = new FirstJavaApp();
        System.out.println(def.var57);

        System.out.println("");
        System.out.println("     J     A     V     V     A");
        System.out.println("     J    A A     V   V     A A");
        System.out.println(" J   J   AAAAA     V V     AAAAA");
        System.out.println("  J J   A     A     V     A     A");

//    double area;
//    double r = input.nextDouble();
//    area = r * r * 3.14159;
//    System.out.println("Area-- " + area);
//    
//    double area;
//    double r = 105.0;
//    area = r * r * 3.14159;
//    System.out.println("Area-- " + area);
        

//Scanner input = new Scanner(System.in);
//        double r = input.nextDouble();
//        areaCal(r);
        
        System.out.println("");
        System.out.println("a   a^2   a^3");
        System.out.println("1   1     1");
        System.out.println("2   4     8");
        System.out.println("3   9     27");
        System.out.println("4   16    64");
        
        
        System.out.println(((9.5*4.5)-(2.5*3)/(45.5-3.5)));
        
        System.out.println(1+2+3+4+5+6+7+8+9);
        
        double pi = 4.0 * (1.0-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/11));
        System.out.println(pi);
        
        double second = 4.0 * (1.0-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/11) + (1.0/13));
        System.out.println(second);
        
        double r = 3.141592653589793;
        double radius = 5.5;
        double perimeter, area;
        
//        System.out.println(Math.PI);
        perimeter = 2 * radius * r;
        area = radius * radius * r;
        System.out.println(perimeter);
        System.out.println(area);
        
        double w = 4.5;
        double h = 7.9;
        double a;
        a = w * h;
        System.out.println(a);
    }
}