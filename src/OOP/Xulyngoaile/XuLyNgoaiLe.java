package OOP.Xulyngoaile;

import java.util.Scanner;

public class XuLyNgoaiLe {
    public static void main(String[] args) {
        String numberPhone;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dien thoai: ");
        numberPhone=scanner.nextLine();
//        try {
//            Integer.parseInt(numberPhone);
//            System.out.print("thong tin sdt la: "+numberPhone);
//        }
//        catch (NumberFormatException e){
//            System.out.println("Dinh dang so dien thoai khong dung");
//        }
        char c[] = {'@','?','!'};
        boolean check = true;
        for(int i=0;i<numberPhone.length();i++){
            for (int j = 0; j < c.length; j++) {
                if(numberPhone.charAt(i)==c[j]){
                    System.out.println("Ten khong hop le");
                    check = false;
                    break;
                }
            }
        }
        if(check){
            System.out.println("ten hop le");
        }
    }
}
