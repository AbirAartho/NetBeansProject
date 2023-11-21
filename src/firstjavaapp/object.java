
package firstjavaapp;

// Encapsulation:

public class object {
    private int id;
    private String name;
    public int age;

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public object() {}
    
    public object(int id) {
        this.id = id;
    }
    
    public object(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
        
        System.out.println("");
    }
    
    private String medicine;
    private int num;
    
    public object(String s, int f) {
        medicine = s;
        num = f;
    }
    
    public void setData(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
