package com.app.fruits;

/* **************
Author:Samarth Zadbuke
Question:1.  Solve  assignment to apply inheritance n polymorphism 
a) Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ? 
Use encapsulation. 
b) Properties (instance variables)  : color : String , weight : double , 
name:String, isFresh : boolean 
c) Add suitable constructors. 
d) Override  toString correctly to return state of all fruits (including : name 
,color , weight ) 
e) Add a taste() method : public String taste() 
For Fruit : it should return "no specific taste" 
Apple : should return  "sweet n sour" 
Mango : should return  "sweet" 
Orange : should return  "sour" 
f)  
Add all of above classes under the package "com.app.fruits" 
g) Create java application FruitBasket , with main method , as a tester 
h) Prompt user for the basket size n create suitable data structure and give 
options 
1. Add Mango 
case 1 : boundary checking 
basket[counter++]=new Mango(nm,weight,color); 
break; 
2. Add Orange 
3. Add Apple 
NOTE : You will be adding a fresh fruit in the basket , in all of above 
options. 
4. Display names of all fruits in the basket. 
eg :  for-each --- null checking --getName() 
5. Display name,color,weight , taste of all fresh fruits , in the basket. 
eg : for-each , null checking --toString , taste, isFresh : getter 
6. Display tastes of all stale(not fresh) fruits in the basket. 
7. Mark a fruit as stale 
i/p : index  
eg : setter : isFresh : false 
o/p : error message (in case of invalid index) or mark it stale 
8. Mark all sour fruits stale (optional) 
eg : for-each , taste --equals(String)  
10. Exit
/* */


import com.app.fruits.Fruit;
import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basket size: ");
        int basketSize = scanner.nextInt();
        Fruit[] basket = new Fruit[basketSize];

        int counter = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display details and taste of all fresh fruits");
            System.out.println("6. Display taste of all stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits as stale");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (counter < basket.length) {
                        System.out.print("Enter Mango name, weight, and color: ");
                        String name = scanner.next();
                        double weight = scanner.nextDouble();
                        String color = scanner.next();
                        basket[counter++] = new Mango(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2:
                    if (counter < basket.length) {
                        System.out.print("Enter Orange name, weight, and color: ");
                        String name = scanner.next();
                        double weight = scanner.nextDouble();
                        String color = scanner.next();
                        basket[counter++] = new Orange(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3:
                    if (counter < basket.length) {
                        System.out.print("Enter Apple name, weight, and color: ");
                        String name = scanner.next();
                        double weight = scanner.nextDouble();
                        String color = scanner.next();
                        basket[counter++] = new Apple(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4:
                    System.out.println("Names of all fruits in the basket:");
                    for (Fruit fruit : basket) {
                        if (fruit != null) {
                            System.out.println(fruit.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Details and taste of all fresh fruits:");
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.isFresh()) {
                            System.out.println(fruit.toString() + ", Taste: " + fruit.taste());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Tastes of all stale fruits:");
                    for (Fruit fruit : basket) {
                        if (fruit != null && !fruit.isFresh()) {
                            System.out.println(fruit.getName() + " (Stale), Taste: " + fruit.taste());
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter the index of the fruit to mark as stale: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < basket.length && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println(basket[index].getName() + " has been marked as stale.");
                    } else {
                        System.out.println("Invalid index or empty slot!");
                    }
                    break;

                case 8:
                    System.out.println("Marking all sour fruits as stale...");
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.taste().equals("sour")) {
                            fruit.setFresh(false);
                            System.out.println(fruit.getName() + " has been marked as stale.");
                        }
                    }
                    break;

                case 10:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
