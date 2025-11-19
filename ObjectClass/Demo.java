package ObjectClass;

class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class Demo {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.model = "Lenovo";
        lap.price = 100;

        Laptop lap1 = new Laptop();
        lap1.model = "Lenovo";
        lap1.price = 100;

        boolean result = lap.equals(lap1);
        System.out.println(result);
    }
}
