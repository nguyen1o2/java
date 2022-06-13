import java.util.Scanner;

public class dequy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(sum2(5));
    }

    public static int sum(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n+sum(n-1);
    }

    public static float giaithua(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*giaithua(n-1);
    }

    public static float sum2(int n){
        if(n==1){
            return 1;
        }
        return (float)sum(n)/giaithua(n) + sum2(n-1);
    }
}
