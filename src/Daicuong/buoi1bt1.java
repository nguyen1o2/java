import java.util.Scanner;

import static java.util.Scanner.*;

public class buoi1bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap a= ");
        a=scanner.nextInt();
        System.out.println("Nhap b= ");
        b=scanner.nextInt();
        System.out.println("Nhap c= ");
        c=scanner.nextInt();
        int max1=a>b?a:b;
        int max2=b>c?b:c;
        int max3=max1>max2?max1:max2;
        System.out.println("max = "+max3);
    }
}
