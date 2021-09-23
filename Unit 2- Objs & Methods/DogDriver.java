/*
 * Annie Lee
 * Sept 23 2021
 * Do things w/ dog object
 */

// Driver classes that do things with pre-existing objects from different classes in driver class' main method

class DogDriver {
    public static void main(String[] args) {
      
      // Declare dog variables
      Dog Cookie;
      Dog Bebe;
      Dog d1;
      
      // INSTANTIATION (references to the object we created)
      Cookie = new Dog(); // Dog() is using the constructor from Dog class
      Bebe = new Dog();
      d1 = new Dog("Brownie", "raawworwrowrr", 10);
      
      // calling behaviour method to run stuff
      Cookie.bark();
      Bebe.bark();
      d1.bark();
      
      
      
    }

}