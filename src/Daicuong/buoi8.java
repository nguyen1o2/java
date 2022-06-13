import java.util.Scanner;

public class buoi8 {
    public static int so(String x){
        int i=0,dem=0;
        try {
            while (x.charAt(i) != '\0'){
                dem++;i++;
            }
        }
        catch (Exception e){

        }
        return dem;
    }
    public static void nhap(int a[][],int n,int m){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=scanner.nextInt();
            }
        }
    }
    public static void xuat(int a[][],int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int max(int a[][],int n,int m){
        int max=a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max<a[i][j]) max=a[i][j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        //String a="hello";
        //System.out.println(so(a));
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.print("Nhap n = ");
        n=scanner.nextInt();
        System.out.print("Nhap m = ");
        m=scanner.nextInt();
        int a[][]=new int[n][m];
        nhap(a,n,m);
        xuat(a,n,m);
        //System.out.print(max(a,n,m);
    }
}
