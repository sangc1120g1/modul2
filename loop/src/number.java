public class number {
    public static void main(String[] args) {
        int n = 3;
        boolean b;
        while (n<101){
            b = true;
            for (int i = 2; i<n; i++) {
                if (n%i==0){
                    b = false;
                }
            }
            if (b){
                System.out.println(n);
            }
            n++;
        }
    }
}
