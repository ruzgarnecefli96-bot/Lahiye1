public class Food {

    public int id;
    public String name;
    public double price;

    public Food(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("ID " + id);
        System.out.println("Name " + name);
        System.out.println("Price  " + price + " AZN");
        System.out.println("-------------------");
    }
}