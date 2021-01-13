import java.util.Arrays;
import java.util.Scanner;

public class addarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        Scanner check = new Scanner(System.in);
        System.out.println("nhập index");
        int a = check.nextInt();
        System.out.println("nhập số muốn add");
        int b = check.nextInt();
        System.out.println(Arrays.toString(addarr(arr,a,b)));
    }
    public static int[] addarr(int[] arr, int number,int numbers){
        int [] newarr = new int[arr.length+1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
            if (i==number){
                newarr[i] = numbers;
                for (int j = i+1; j < newarr.length; j++) {
                    newarr[j] = arr[j-1];
                }
                break;
            }
        }
        return newarr;
    }
}
