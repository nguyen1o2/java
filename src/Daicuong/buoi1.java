import java.util.Scanner;

public class buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tong,a,b,c,d,e;
        do {
            System.out.println("nhap so co 5 chu so : ");
            n = scanner.nextInt();
        }while(n<10000 || n>99999);
        a = n % 10;
        b = (n / 10) % 10;
        c = (n / 100) % 10;
        d = (n / 1000) % 10;
        e = n / 10000;
        tong=a+b+c+d+e;
        int max = a;
        if (max < b) {
            max = b;
        }
        if(max<c) {
            max = c;
        }
        if(max<d){
            max=d;
        }
        if(max<e){
            max=e;
        }
        System.out.println("tong = "+tong);
        System.out.println("max = "+max);
    }
}
