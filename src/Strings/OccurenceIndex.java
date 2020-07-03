package Strings;

import java.util.Scanner;

public class OccurenceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();

        occurences(str, pattern);
    }

    public static void occurences(String str, String pattern) {
        int index = 0;

        while (true) {

            index = str.indexOf(pattern, index);

            if (index == -1) {
                break;
            }

            System.out.println(index);
            index = index + 1;

        }
    }
}
