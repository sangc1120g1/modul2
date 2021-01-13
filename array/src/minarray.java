public class minarray {
    public static void main(String[] args) {
        int [] arr = {5,8,7,5,9,6};
        System.out.println("min = "+minarray(arr));
    }
    public static int minarray(int []  array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
