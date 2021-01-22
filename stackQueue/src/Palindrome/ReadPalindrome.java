package Palindrome;

import java.util.*;

public class ReadPalindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input String");
        String string = Sc.nextLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.toLowerCase().charAt(i));
            queue.add(string.toLowerCase().charAt(i));
        }
        boolean status = false;
        for (int i = 0; i < string.length(); i++) {
            status = false;
            if (Character.toString(stack.pop()).equals(Character.toString(queue.remove()))){
                status = true;
            }
        }
        if (status){
            System.out.println("Palindrome");
        }
    }
}
