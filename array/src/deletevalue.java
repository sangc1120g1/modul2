import java.util.Arrays;
import java.util.Scanner;

public class deletevalue {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int[] arr = {2,4,1,1,2,7,1,2,1,4,1,0,1};
        System.out.println("nhập số muốn xóa");
        int a = check.nextInt();
        System.out.println(Arrays.toString(delete(arr,a)));
    }
    public static int[] delete(int [] arrays,int number) {
        boolean check = false;
        int [] arrs = new int[arrays.length-1];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = arrays[i];
        }
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i]==number){
                for (int j = i; j <arrays.length-1 ; j++) {
                    arrs[j] = arrays[j+1];
                    check = true;
                }
                break;
            }
        }
        if (check){
            return delete(arrs,number);
        }
        return arrs;
    }
}
