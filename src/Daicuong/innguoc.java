package Daicuong;

import java.util.Scanner;

public class innguoc {
    public static void daoChuoi(){
        Scanner scanner = new Scanner(System.in);
        char c;
        c=scanner.next().charAt(0);
        if(c!='\n'){
            daoChuoi();
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap chuoi: ");
        daoChuoi();
    }
}
