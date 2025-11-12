class Human {

    private int age;
    private String name;

    // Constructors should be hava same name as a class
    // Constructors special method, never return anything
    public Human() {
        age = 11;
        name = "Russ";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int name) {
        this.age = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class Constructors {

    public static void main(String[] args) {

        Human p1 = new Human(); // everytime object create the contructor is being called
        System.out.println(p1.getName() + ": " + p1.getAge());

        // p1.setAge(11);
        // p1.setName("Jellian");

        // System.out.println(p1.getName() + ": " + p1.getAge()); // fetch the private
        // variable call the Method instead

    }
}
