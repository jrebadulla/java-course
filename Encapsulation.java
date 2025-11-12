class Human {
    // private int age = 11; // private variable - accessible in the same class
    // private String name = "Jellian";

    private int age; // private variable - ano value yet
    private String name;

    public int getAge() { // Method to get/use the private variable
        return age; // return the age variable
    }

    public void setAge(int a) { // Method accepting a value
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Human p1 = new Human();
        p1.setAge(11);
        p1.setName("Jellian");

        System.out.println(p1.getName() + ": " + p1.getAge()); // fetch the private variable call the Method instead

    }
}
