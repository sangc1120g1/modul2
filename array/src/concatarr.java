import java.util.Arrays;
import java.util.Scanner;

public class concatarr {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(array(arr1,arr3,arr2)));
    }
    public static int[] array(int [] arrs1,int [] arrs3,int[] arrs2){
        for (int i = 0; i < arrs1.length; i++) {
            arrs3[i] = arrs1[i];
        }
        for (int i = arrs2.length-1; i >=0; i--) {
            arrs3[i+arrs1.length] = arrs2[i];
        }
        return arrs3;
    }
}
