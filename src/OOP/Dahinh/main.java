package OOP.Dahinh;

public class main {
    public static void main(String[] args) {
        nguoi ng=new nhanvien("nguyen van a",19,5000,20);
        System.out.println(ng.getTen());
        nguoi ng1= new sinhvien("nguyen van b",25,202651,9.5f);
        System.out.println(ng1.getTuoi());
    }
}
