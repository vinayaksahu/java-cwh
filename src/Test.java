import MyPackage1.Animal;

public class Test {
    public static void main(String[] args) {
        System.out.println("This is Test class.");
        Animal cow = new Animal(); //default constructor
        System.out.println("Age of cow is: " + cow.getAge());
        cow.setAge(10);
        System.out.println("new age of cow is: " + cow.getAge());

        Animal cat = new Animal(15); //parameterized constructor
        System.out.println("Age of cat is: " + cat.getAge());

        //copy constructor
        Animal dog = new Animal(cat.getAge());
        System.out.println("Age of dog is: " + dog.getAge());
    }
}
