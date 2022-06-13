import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class buoi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap a = ");
        a = scanner.nextInt();
        System.out.println("Nhap b = ");
        b = scanner.nextInt();
        System.out.println("Nhap c = ");
        c = scanner.nextInt();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("pt vo so nghiem");
                }
                else System.out.println("pt vo nghiem");
            }
            else System.out.println("nghiem cua pt x = "+(float)-c/b);
        }
        else {
            double delta,x1,x2;
            delta=b*b-4*a*c;
            if(delta>0){
                x1=(-b+Math.sqrt(delta))/2*a;
                x2=(-b-Math.sqrt(delta))/2*a;
                System.out.println("pt co 2 nghiem\nx1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            else if(delta==0){
                System.out.println("pt co nghiem kep x="+(float)-b/2*a);
            }
            else System.out.println("pt vo nghiem");
        }
    }
}
