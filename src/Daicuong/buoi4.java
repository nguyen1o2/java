import java.util.Scanner;

public class buoi4 {
    public static void main(String[] args) {
        int n,i,a=0,b=0;
        float sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n = ");
        n = scanner.nextInt();
        for(;n!=0;){
           a=n%10;
           b=b*10+a;
           n/=10;
        }
        System.out.println(b);
    }
}
