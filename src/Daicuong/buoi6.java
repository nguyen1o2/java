import java.util.Scanner;

public class buoi6 {
    public static void nhap(int arrayA[],int n){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            arrayA[i]=scanner.nextInt();
        }
    }
    public static void xuat(int arrayA[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arrayA[i]+" ");
        }
    }
    public static int tongChan(int arrayA[],int n){
        int tong=0;
        for (int i = 0; i < n; i++) {
            if(arrayA[i]%2==0){
                tong+=arrayA[i];
            }
        }
        return tong;
    }
    public static boolean check(int arrayA[],int n,int x){
        for (int i = 0; i < n; i++) {
            if(arrayA[i]==x){
                return true;
            }
        }
       return false;
    }
    public static boolean ktsnt(int n){
        if(n<=1){
            return false;
        }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
                return true;
    }
    public static void xuatsnt(int arrayA[],int n){
        for (int i = 0; i < n; i++) {
            if(ktsnt(arrayA[i])){
                System.out.print(arrayA[i]+"\t");
            }
        }
    }
    public static void daomang(int arrayA[],int n){
        for (int i = 0; i< n/2 ; i++) {
            int temp= arrayA[n-i-1];
            arrayA[n-i-1]=arrayA[i];
            arrayA[i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrayA[i]+"\t");
        }
    }
    public static void threeMax(int arrayA[],int n){
        int max1=-100000001,max2=-100000001,max3=-100000001;
        for(int i=0;i<n;i++){
            if(max1<arrayA[i]){
                max3=max2;
                max2=max1;
                max1=arrayA[i];
            }
            else if(max2<arrayA[i]){
                max3=max2;
                max2=arrayA[i];
            }
            else if (max3<arrayA[i]){
                max3=arrayA[i];
            }
        }
        System.out.println(max1+" "+max2+" "+max3);
    }
    public static void main(String[] args) {
      int n,arrayA[],x;
      Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap n = ");
        n=scanner.nextInt();
        arrayA=new int [n];
        nhap(arrayA,n);
        xuat(arrayA,n);
        System.out.print("tong chan = "+tongChan(arrayA,n));
        System.out.println("\nNhap so can kiem tra ");
        x=scanner.nextInt();
        System.out.println(check(arrayA,n,x));
        xuatsnt(arrayA,n);
        System.out.println();
        daomang(arrayA,n);
        System.out.println();
        threeMax(arrayA,n);
}
}
