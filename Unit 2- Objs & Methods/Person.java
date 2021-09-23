public class Person {
    
    /*
     * instance vars:
     * name
     * age 
     * isAlive
     * 
     * constructor:
     * -default 
     * -one w parameters
     * 
     * behaviour methods:
     * bday method
     * age ++
     * 
     * funeral method
     * isAlive = false;
     * 
     * driver class:
     * instantiates couple ppl n call behaviour method
     */
    
    String name;
    int age;
    boolean isAlive;
    
    public Person() {
        // emprt constructor
    }
    
    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
    
    public void birthday() {
        age++;
        System.out.println("Happy birthday! You are now " + age + " years old.");
    }
    
    public void funeral() {
        isAlive = false;
        System.out.println("You died, " + name + ".");
    }
    
}