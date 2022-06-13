package OOP;

import java.util.Scanner;

public class main {
    public static void input(Student studen[],int n,Scanner sc){
        for (int i = 0; i < n; i++) {
                System.out.println("Nhap ten:");
                String name=sc.nextLine();
                System.out.println("Nhap tuoi:");
                int age=Integer.parseInt(sc.nextLine());
                System.out.println("nhap toan:");
                int math=Integer.parseInt(sc.nextLine());
                System.out.println("nhap li:");
                int physical=Integer.parseInt(sc.nextLine());
                System.out.println("nhap hoa:");
                int chemistry=Integer.parseInt(sc.nextLine());
                Student st=new Student(name,age,math,physical,chemistry);
                studen[i]=st;
        }
    }
    public static void output(Student studen[],int n){
        for (int i = 0; i < n; i++) {
            System.out.println(studen[i].toString());
            System.out.println("DTB : "+studen[i].AVG());
            System.out.println("------------------");
        }
    }
    public static void SX(Student studen[],int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(studen[i].AVG()<studen[j].AVG()){
                    Student st= studen[i];
                    studen[i]=studen[j];
                    studen[j]=st;
                }
            }
        }
        System.out.println("sv sau khi sap xep");
        output(studen,n);
    }
    public static float maxAVG(Student studen[],int n){
        float max=studen[0].AVG();
        for (int i = 0; i < n; i++) {
            if(max<studen[i].AVG())
                max=studen[i].AVG();
        }
        return max;
    }
    public static void searchMax(Student studen[],int n){
        for (int i = 0; i < n; i++) {
            if(studen[i].AVG()==maxAVG(studen,n)){
                System.out.println(studen[i].toString());
            }
        }
    }
    public static void main(String[] args) {
        Student student[] = new Student[100];
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so sinh vien : ");
        int n= Integer.parseInt(sc.nextLine());
        input(student,n,sc);
        System.out.println("Danh sach sinh vien vua nhap");
        output(student,n);
        SX(student,n);
        System.out.println("Danh sach sinh vien co diem cao nhat");
        searchMax(student,n);
    }
}
