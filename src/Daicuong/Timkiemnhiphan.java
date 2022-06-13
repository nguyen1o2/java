import java.util.Scanner;

public class Timkiemnhiphan {
    public static void main(String[] args) {
        int arr[],x,n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap n: ");
        n=scanner.nextInt();
        arr=new int [n];
        nhap(arr,n);
        xuat(arr,n);
        sapxep(arr,n);
        System.out.println();
        xuat(arr,n);
        System.out.print("Nhap x = ");
        x=scanner.nextInt();
        System.out.println(banerySearch(arr,n,0,n-1,x));
    }
    public static void nhap(int arr[],int n){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"]=");
            arr[i]=scanner.nextInt();
        }
    }
    public static void xuat(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void sapxep(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static int banerySearch(int arr[],int n,int l,int r,int x){
        int mid;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]>x) r=mid-1;
            else if(arr[mid]<x) l=mid+1;
            else if (arr[mid]==x) return mid;
        }
        return -1;
    }
}
