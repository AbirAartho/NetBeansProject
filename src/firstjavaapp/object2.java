
package firstjavaapp;

public class object2 {
    public static void main(String[] args) {
        object ob1 = new object();
        ob1.age = 50;
        ob1.setId(5);
        ob1.setName("Dhaka");
        
        object ob2 = new object(5);
        ob2.age = 80;
//        ob2.setId(5);
        ob2.setName("Khulna");
        
        object ob3 = new object(10,"Dhaka",51);
//        ob3.age = 30;
//        ob3.setId(5);
//        ob3.setName("Rajshahi");
        
        System.out.println("Name: "+ob1.getName());
        System.out.println("Age: "+ob2.getAge());
        System.out.println("ID: "+ob3.getId());
        
        
        object ob4 = new object();
        ob4.setId(2);
        ob4.setName("Napa");
        
        ob4.setData(20, "abc", 50);
        
        
    }
}
