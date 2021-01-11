public class numbers {
    public static void main(String[] args) {
        int a = 0;
        int n = 3;
        boolean b;
        while (a<20){
            b = true;
            for (int i = 2; i<n; i++) {
                if (n%i==0){
                    b = false;
                }
            }
            if (b){
                System.out.println(n);
                a++;
            }
            n++;
        }
    }
}
