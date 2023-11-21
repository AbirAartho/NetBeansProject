
package firstjavaapp;

public class RuntimePolymorphism {
    static int Multiply(int a, int b){        
        return a * b;
    }
    
    static double Multiply2(double a, double b) {        
        return a * b;
    }
    
    
    public static void main(String[] args) {
        System.out.println(RuntimePolymorphism.Multiply(2,4));
        System.out.println(RuntimePolymorphism.Multiply2(5,2));
        
        
    }
}
