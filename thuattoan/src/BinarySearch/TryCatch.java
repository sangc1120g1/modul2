package BinarySearch;

import java.util.Scanner;

public class TryCatch{
    public static void check() throws Exception {
        try {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Input side1");
            int side1 = Sc.nextInt();
            System.out.println("Input side2");
            int side2 = Sc.nextInt();
            System.out.println("Input side3");
            int side3 = Sc.nextInt();
            if (side1<=0||side2<=0||side3<=0){
                throw new Exception("nhap sai roi");
            }
        }catch (Exception e){
            e.printStackTrace();
            check();
        }
    }

    public static void main(String[] args) throws Exception {
        check();
    }
}