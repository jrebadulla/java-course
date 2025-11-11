public class Strings {

    public static void main(String[] args) {

        String name = "Jellian"; // Immutable String (cannot change value)
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Marie"); // Immutable String (cannot change value)
        sb.append(" Reddy");
        System.out.println(sb);
    }
}
