package ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList = new ArrayList<>();



    public void addFood(){
        // Create an object to Encapsulate food information
        Food food = new Food();
        //Scanner the food information
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your food name");
        String name = sc.next();
        food.setName(name);

        System.out.println("Please Enter your food price");
        double price = sc.nextDouble();
        food.setPrice(price);

        System.out.println("Please Enter your food description");
        String desc = sc.next();
        food.setDesc(desc);

        //input food information in the ArrayList
        foodList.add(food);

    }

    public void showFood(){
        if (foodList.size() ==0){
            System.out.println("We don't have any food now");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("--------------");
        }
    }

    public void start(){
        while(true){
            System.out.println("Please choose function");
            System.out.println("1.addfood");
            System.out.println("2.showfood");
            System.out.println("3.Exit the function");
            
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            
            switch(command){
                case "1":
                    addFood();
                    break;
                case "2" :
                    showFood();
                    break;
                case "3":
                    System.out.println("Goodbye!!!");
                    return;
                default :
                    System.out.println("Your command is not exsit");
            }
        }    
    }    
}
