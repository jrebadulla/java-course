class Human {
    // private int age = 11; // private variable - accessible in the same class
    // private String name = "Jellian";

    private int age; // private variable - ano value yet
    private String name; // instance variable

    public int getAge() {
        return age;
    }

    public void setAge(int name) { // local variable
        this.age = name; // this - refers to a current object
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class ThisKeyWord {

    public static void main(String[] args) {

        Human p1 = new Human();
        p1.setAge(11);
        p1.setName("Jellian");

        System.out.println(p1.getName() + ": " + p1.getAge()); // fetch the private variable call the Method instead

    }
}
