import java.util.Scanner;

public class FoodManager {

    Scanner sc = new Scanner(System.in);

    FoodStorage storage;

    Food[] selectedFoods = new Food[50];
    int selectedCount = 0;

    public FoodManager(FoodStorage storage) {
        this.storage = storage;
    }

    // Bütün yeməklər
    public void showAllFoods() {
        for (int i = 0; i < storage.foodCount; i++) {
            storage.foods[i].showInfo();
        }
    }

    // ID ilə axtarış
    public Food findFoodById(int id) {
        for (int i = 0; i < storage.foodCount; i++) {
            if (storage.foods[i].id == id) {
                return storage.foods[i];
            }
        }
        return null;
    }

    // Yemək əlavə etmək
    public void addFood() {

        System.out.print("ID: ");
        int id = sc.nextInt();

        if (findFoodById(id) != null) {
            System.out.println("Bu ID mövcuddur!");
            return;
        }

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        storage.foods[storage.foodCount] = new Food(id, name, price);
        storage.foodCount++;

        System.out.println("Yemək əlavə edildi!");
    }

    // Yemək seçmək
    public void selectFood() {

        System.out.print("Yeməyin ID-si: ");
        int id = sc.nextInt();

        Food food = findFoodById(id);

        if (food != null) {
            selectedFoods[selectedCount] = food;
            selectedCount++;
            System.out.println("Sifariş edildi!");
        } else {
            System.out.println("Yanlış ID!");
        }
    }

    // Seçilmiş yeməklər
    public void showSelectedFoods() {

        for (int i = 0; i < selectedCount; i++) {
            selectedFoods[i].showInfo();
        }

        if (selectedCount == 0) {
            System.out.println("Siyahı boşdur!");
        }
    }
}