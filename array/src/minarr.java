public class minarr {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {3,4,5},
                {5,6,7},
                {7,8,9}
        };
        System.out.println("min là "+minarr(arr));
    }
    public static int  minarr(int [][] arrs){
        int min = arrs[0][0];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (arrs[i][j]<min){
                    min = arrs[i][j];
                }
            }
        }
        return min;
    }
}
