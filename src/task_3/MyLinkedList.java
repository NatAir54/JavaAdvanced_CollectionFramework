package task_3;

import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the collection:");
        int n = input.nextInt();

        List<Integer> myList = new LinkedList<>();
        MyLinkedList.getIntegerList(n, myList);
        System.out.println(myList);
        System.out.println(MyLinkedList.getMinimum(myList));
    }


    // filling the list with n elements
    public static void getIntegerList(int n, List<Integer> list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number as the element of collection:");
            list.add(input.nextInt());
        }
    }

    // looking for the minimum element in the list
    public static Integer getMinimum(List<Integer> list) {
        Integer min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }
}
