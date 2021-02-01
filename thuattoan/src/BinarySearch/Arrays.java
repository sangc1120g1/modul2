package BinarySearch;

import java.util.LinkedList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String string = Sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            if (list.size()>0&&list.getLast()>string.charAt(i)){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
