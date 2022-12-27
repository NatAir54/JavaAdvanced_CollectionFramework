package task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> families = new HashMap<>();
        families.put("Kyiv", "Kharchenko");
        families.put("Kharkiv", "Koval");
        families.put("Odesa", "Stepanenko");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a city among: Kyiv, Kharkiv, Odesa");
        System.out.println(families.get(input.next()));
    }
}
