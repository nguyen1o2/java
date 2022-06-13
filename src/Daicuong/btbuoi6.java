import java.util.Scanner;

public class btbuoi6 {
    public static void main(String[] args) {
        int n,sum=0,du;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = scanner.nextInt();
        int m=n;
        while(m!=0){
            du=m%10;
            sum=sum*10+du;
            m=m/10;
        }
        if(sum==n){
            System.out.println("la so doi xung");
        }
        else System.out.println("ko la so doi xung");
    }
}
