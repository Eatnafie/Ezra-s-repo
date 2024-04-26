
import java.util.ArrayList;
import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        BevShop bevShop = new BevShop(new ArrayList<>());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BevShop!");
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter your age: ");
        int customerAge = scanner.nextInt();
        System.out.println("Enter the time (in 24-hour format): ");
        int time = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the day (e.g., Monday, Tuesday, etc.): ");
        String dayStr = scanner.nextLine();
        Day day = Day.valueOf(dayStr.toUpperCase());

        bevShop.startNewOrder(time, day, customerName, customerAge);

        boolean ordering = true;
        while (ordering) {
            System.out.println("Choose your beverage type:");
            System.out.println("1. Coffee");
            System.out.println("2. Alcohol");
            System.out.println("3. Finish order");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the coffee: ");
                    String coffeeName = scanner.nextLine();
                    System.out.println("Enter the size (SMALL, MEDIUM, LARGE): ");
                    String sizeStr = scanner.nextLine();
                    Size size = Size.valueOf(sizeStr.toUpperCase());
                    System.out.println("Do you want an extra shot? (true/false): ");
                    boolean extraShot = scanner.nextBoolean();
                    System.out.println("Do you want extra syrup? (true/false): ");
                    boolean extraSyrup = scanner.nextBoolean();
                    bevShop.processCoffeeOrder(coffeeName, size, extraShot, extraSyrup);
                    break;
                case 2:
                    System.out.println("Enter the name of the alcohol drink: ");
                    String alcoholName = scanner.nextLine();
                    System.out.println("Enter the size (SMALL, MEDIUM, LARGE): ");
                    sizeStr = scanner.nextLine();
                    size = Size.valueOf(sizeStr.toUpperCase());
                    bevShop.processAlcoholOrder(alcoholName, size);
                    break;
                case 3:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }

        System.out.println("Thank you for your order!\nYour receipt:");
        System.out.println(bevShop.toString());

        scanner.close();
    }
}
