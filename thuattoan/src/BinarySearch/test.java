package BinarySearch;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int number = 5;
        System.out.println( tests(arr,number,0,arr.length-1));
    }
    public static int tests(int[] arr,int number,int low , int high) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] > number) {
                return tests(arr, number, low, mid - 1);
            }
            if (arr[mid] < number) {
                return tests(arr, number, mid + 1, high);
            }
            if (arr[mid] == number) {
                return arr[mid];
            }
        }
        return -1;
    }
}
