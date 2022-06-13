import java.util.Scanner;

public class luabovaochuong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("Nhap n=");
        n=scanner.nextInt();
        luaga(n);
    }
    public static void luaga(int n){
        int so=n;
        int arr[]=new int[10];
        while(so!=0){
            arr[so%10]++;
            so/=10;
        }
        int max=arr[0],x=-1;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
                x=i;
            }
        }
        if(x!=-1){
            System.out.println("So xuat hien nhieu nhat la "+x);
        }
    }
}
