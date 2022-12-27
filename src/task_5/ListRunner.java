package task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRunner {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        printOut();
        String param = input.nextLine();
        while(!param.equalsIgnoreCase("end")) {
            myList.add(param);
            printOut();
            param = input.nextLine();
        }
        
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    private static void printOut() {
        System.out.println("Enter a new string of the list." + " Enter 'end' for exit."
                + " AFTER INPUT PLEASE PRESS ENTER.");
    }
}
