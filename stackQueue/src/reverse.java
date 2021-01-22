import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        ArrayList<Integer> myListReverse = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : myList) {
            stack.push(integer);
        }
        for (int i = 0; i < myList.size(); i++) {
            myListReverse.add(stack.pop());
        }
        System.out.println(Arrays.toString(myListReverse.toArray()));
        ArrayList<String> myList1 = new ArrayList<>();
        myList1.add("a");
        myList1.add("b");
        myList1.add("c");
        myList1.add("d");
        myList1.add("e");
        ArrayList<String> myListReverse1 = new ArrayList<>();
        Stack<String> stack1 = new Stack<>();
        for (String s : myList1) {
            stack1.push(s);
        }
        for (int i = 0; i < myList1.size(); i++) {
            myListReverse1.add(stack1.pop());
        }
        System.out.println(Arrays.toString(myListReverse1.toArray()));
    }
}
