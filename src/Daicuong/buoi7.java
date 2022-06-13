import java.util.Arrays;
import java.util.Scanner;

public class buoi7 {
    public static void main(String[] args) {
        String hoTen;
        char kitu;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap hoten : ");
        hoTen=scanner.nextLine();
        System.out.print("Nhap vao ki tu: ");
        kitu=scanner.next().charAt(0);
        /*String result="";
        for(int i=0;i<hoTen.length();i++){
             char x=hoTen.charAt(i);
             int valueAscii=(int) x;
             if(valueAscii>=65&& valueAscii<=90){
                 int k=valueAscii+32;
                 char t=(char) k;
                 String temp= String.valueOf(t);
                 result=result+temp;
             }
             else if(valueAscii>=97&& valueAscii<=122){
                 int k=valueAscii-32;
                 char t=(char) k;
                 String temp= String.valueOf(t);
                 result=result+temp;
             }
             else{
                 result+=x;
             }
        }
        System.out.println(result);*/
        String []arrName=hoTen.split(" ");
        System.out.println(Arrays.toString(arrName));
        String ho=arrName[0];
        String ten=arrName[arrName.length-1];
        String tendem="";
        for (int i = 1; i < arrName.length-1; i++) {
            tendem+=arrName[i]+" ";
        }
        System.out.print("ho : "+ho);
        System.out.print("\ntendem : "+tendem);
        System.out.print("\nten : "+ten);
        boolean check=false;
        for (char x:hoTen.toCharArray()) {
           if(kitu==x)
               check=true;
           break;
        }
        System.out.println();
        System.out.print(check);
    }
}
