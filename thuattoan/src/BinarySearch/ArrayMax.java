package BinarySearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String string = Sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 1; i <string.length() ; i++) {
            if (string.charAt(i)>list.getLast()){
                list.add(string.charAt(i));
            }
        }
        for (Character character : list) {
            System.out.print(character);
        }
    }
}
