public class FoodStorage {

    Food[] foods = new Food[20];

    int foodCount = 8;

    public FoodStorage() {

        foods[0] = new Food(1, "Pizza", 12);
        foods[1] = new Food(2, "Burger", 8);
        foods[2] = new Food(3, "Doner", 5);
        foods[3] = new Food(4, "Pasta", 10);
        foods[4] = new Food(5, "Salad", 6);
        foods[5] = new Food(6, "Sushi", 15);
        foods[6] = new Food(7, "Kabab", 14);
        foods[7] = new Food(8, "Sandwich", 7);
    }
}
