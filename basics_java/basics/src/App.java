import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Element;

public class App {
    public static void main(String[] args) throws Exception {
        /** 
        // so lets start for accepting some input from the user 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println(name);

        // I will skip variable declaration and basic math operators

        // first gui why all the tutorials have GUI pretty weird 

        String nameGui = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello" +nameGui);

        // convert to a integer 

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
        */

        // lets see something about randoms 
            Random random = new Random();
            int x = random.nextInt(6);
            double y = random.nextDouble();
            boolean z = random.nextBoolean();

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

        // also will skip if statemts bc it seems prett the same as any other language 
        // also will skip switch operators and && and || or ! not 

        // Here is the While loop 
        // Scanner scanner = new Scanner(System.in);
        // String name = "";
        // while (name.isBlank()) {
        //     System.out.println("Enter your name");
        //     name = scanner.nextLine();   
        // }

        // System.out.println("Hello"+name);

        // // do while 
        // String name2 = "";

        // do{
        //     System.out.println("Enter your name");
        //     name2 = scanner.nextLine();
        // }while (name2.isBlank());


        

        // System.out.println(name2);

        // // for loop seems pretty usual 
        // for(int i=0; i<10; i++){
        //     System.out.println(i);
        // }

        // // arrays of 1 dimesion 

        // String[] cars = new String[3];
        // cars[0] = "Camaro";
        // cars[1] = "Versa";

        // // now lets try something cool 

        // String[][] coolCars = {
        //     {"Civic", "Prius", "Golf"},
        //     {"Crv","Rav4","cx90"},
        //     {"Wrx","Nsx","model3"}
        // };

        // for(int i=0; i<coolCars.length; i++){
        //     System.out.println();
        //     for(int j=0; j<coolCars[i].length; j++){
        //         System.out.print(coolCars[i][j]+" ");
        //     }
        // }

        // When you need to do something else you could use wrappers like in the string to use methods and to do more stuff

        // primitive  wrappers
        // boolean    Boolean 
        // char       Character
        // int        Integer
        // double     Double

        
        // so more interesting stuff urray for this 

        // ArrayList = a resizable array.
        //                Elements can be added and removed after compilation phase
        //                store reference data types 


//         ArrayList<ArrayList<String>> food = new ArrayList<>();

//         ArrayList<String> healthyfood = new ArrayList<String>();
//         healthyfood.add("salad");
//         healthyfood.add("pasta");
        
//         for(int i=0; i<healthyfood.size(); i++){
//             System.out.println(healthyfood.get(i));
//         }

//         // and what about nested arrays just adding like below 

//         ArrayList<String> junkFood = new ArrayList<>();
//         junkFood.add("hot-dog");
//         junkFood.add("Chips");

//         food.add(healthyfood);
//         food.add(junkFood);

//         System.out.println(food);

        // for-each = traversing technique to iterate through the elements in an array/collection
        // less steps, more readable
        // less flexible 

        // so basically a different way to display a for loop 


        //String[] animals = {"cat","dog","rat","bird"};
        //for(String i : animals) { //this also works for arrayList
        //    System.out.println(i);
        //}

        // lets start with methods 

        // Static method can not use this or super keywords. 
        





}

}
