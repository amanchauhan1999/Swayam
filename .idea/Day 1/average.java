import java.util.*;
class Main {

    public static int average(long [][] arr,int n,int m){
        long sum = 0;
        double maxaverage = 0;
        int menu = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum = sum + arr[i][j];
            }
            double ave =(double) sum / m;

            if(maxaverage < ave){
                maxaverage = ave ;
                menu = i;
            }
            sum = 0;
        }
        return menu;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


        long[][] arr = new long[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextLong();
            }
        }
        System.out.println(average(arr,n,m));
    }
}
