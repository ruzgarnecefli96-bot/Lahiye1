import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodStorage storage = new FoodStorage();

        FoodManager manager = new FoodManager(storage);

        while (true) {

            System.out.println("   FOOD LIST   ");
            System.out.println("1. Bütün yeməkləri göstər");
            System.out.println("2. Yemək sifariş et");
            System.out.println("3. Seçilmiş yeməkləri göstər");
            System.out.println("4. Yeni yemək əlavə et");
            System.out.println("5. Çıxış");

            System.out.print("Seçiminizi daxil edin: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    manager.showAllFoods();
                    break;

                case 2:
                    manager.selectFood();
                    break;

                case 3:
                    manager.showSelectedFoods();
                    break;

                case 4:
                    manager.addFood();
                    break;

                case 5:
                    System.out.println("Proqram bitdi!");
                    return;

                default:
                    System.out.println("Yanlış seçim!");
            }
        }
    }
}