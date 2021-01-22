package Decimal;

import java.util.Scanner;
import java.util.Stack;

public class convert {
    public static void main(String[] args) {
        System.out.println(binaryConvertDecimal());
    }
    public static StringBuilder decimalConvertBinary(){
        Scanner check = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Input Number");
        int number = Integer.parseInt(check.nextLine());
        do {
            int surplus = (number%2);
            stack.push(surplus);
            number=number/2;
        } while (number!=1);
        stack.push(number%2);
        StringBuilder Number = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            Number.append(stack.pop());
        }
        return Number;
    }
    public static int binaryConvertDecimal(){
        Scanner check = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Input Number");
        int number = Integer.parseInt(check.nextLine());
        do {
            int surplus = (number%10);
            stack.push(surplus);
            number=number/10;
        } while (number!=0);
        int Number = 0;
        int size = stack.size();
        int checkSize = stack.size();
        checkSize--;
        for (int i = 0; i < size; i++) {
            Number+=(stack.pop()*Math.pow(2,checkSize));
            checkSize--;
        }
        return Number;
    }
}
