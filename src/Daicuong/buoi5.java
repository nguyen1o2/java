import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class buoi5 {
    public static void main(String[] args) {
        int n,arrayA[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = scanner.nextInt();
        arrayA = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i +"]=");
            arrayA[i]= scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arrayA[i]+"\t");
        }
        int max=arrayA[0];
        for(int i=0;i<n;i++){
            if(max<arrayA[i])
                max=arrayA[i];
        }
        System.out.println("Max="+max);
        //sapxep
        for(int i=0;i<n-1;i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayA[i] > arrayA[j]) {
                    int tml = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j] = tml;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arrayA[i]+"\t");
        }
    }
}
