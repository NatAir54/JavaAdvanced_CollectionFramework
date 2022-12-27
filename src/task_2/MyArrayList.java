package task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArrayList<T>{
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the word as the element of the collection:");
            myList.add(input.next());
        }
        System.out.println(myList);

        myList = doubleValues(myList);
        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    // method doubling each element of the collection
    public static <T> List<T> doubleValues(List<T> list) {
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
            newList.add(list.get(i));
        }
        return newList;
    }
}
