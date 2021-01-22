package Bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input String");
        String string = Sc.nextLine();
        System.out.println(checkBracket(string));
    }
    public static String checkBracket(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)=='('||string.charAt(i)=='{'||string.charAt(i)=='<'||string.charAt(i)=='['){
                stack.push(string.charAt(i));
            } else if (string.charAt(i)==')'&&stack.peek()=='(' || string.charAt(i)=='}'&&stack.peek()=='{' ||
                    string.charAt(i)=='>'&&stack.peek()=='<' || string.charAt(i)==']'&&stack.peek()=='['){
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return "Well";
        }
        return "??????";
    }
}

