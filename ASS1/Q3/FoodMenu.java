/* **************
Author:Samarth Zadbuke
Question:3.  Display food menu to user. User will select items from menu along with the 
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
prices to food items(hard code the prices)  When user enters 'Generate Bill' 
option , display total bill & exit.
/* */

import java.util.*;

public class FoodMenu {


    static Map<Integer, String> foodItems = new HashMap<>();
    static Map<Integer, Integer> foodPrices = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeMenu();

        Map<String, Integer> order = new HashMap<>();

        while (true) {
        
            System.out.println("\n--- Food Menu ---");
            for (int i = 1; i <= foodItems.size(); i++) {
                System.out.println(i + ". " + foodItems.get(i) + " - ₹" + foodPrices.get(i));
            }
            System.out.println("11. Generate Bill and Exit");

            System.out.print("Enter the food item number (1-10) to order, or 11 to generate bill: ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == 11) {
                generateBill(order);
                break;
            }


            if (foodItems.containsKey(itemNumber)) {
                System.out.print("Enter quantity for " + foodItems.get(itemNumber) + ": ");
                int quantity = scanner.nextInt();

           
                String foodName = foodItems.get(itemNumber);
                order.put(foodName, order.getOrDefault(foodName, 0) + quantity);
            } else {
                System.out.println("Invalid choice! Please select a valid menu item.");
            }
        }

        scanner.close();
    }


    private static void initializeMenu() {
        foodItems.put(1, "Dosa");
        foodItems.put(2, "Samosa");
        foodItems.put(3, "Idli");
        foodItems.put(4, "Vada");
        foodItems.put(5, "Pav Bhaji");
        foodItems.put(6, "Poha");
        foodItems.put(7, "Upma");
        foodItems.put(8, "Chole Bhature");
        foodItems.put(9, "Paneer Tikka");
        foodItems.put(10, "Biryani");

        
        foodPrices.put(1, 50); 
        foodPrices.put(2, 10); 
        foodPrices.put(3, 30); 
        foodPrices.put(4, 20); 
        foodPrices.put(5, 80); 
        foodPrices.put(6, 40); 
        foodPrices.put(7, 40); 
        foodPrices.put(8, 100); 
        foodPrices.put(9, 150);
        foodPrices.put(10, 120);
    }

    private static void generateBill(Map<String, Integer> order) {
        System.out.println("\n--- Bill ---");
        int totalBill = 0;

        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            String foodName = entry.getKey();
            int quantity = entry.getValue();
            int price = getPriceByFoodName(foodName);
            int itemTotal = quantity * price;
            totalBill += itemTotal;

            System.out.println(foodName + " (₹" + price + " x " + quantity + ") = ₹" + itemTotal);
        }

        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Thank you for your order!");
    }

   
    private static int getPriceByFoodName(String foodName) {
        for (Map.Entry<Integer, String> entry : foodItems.entrySet()) {
            if (entry.getValue().equals(foodName)) {
                return foodPrices.get(entry.getKey());
            }
        }
        return 0;
    }
}
