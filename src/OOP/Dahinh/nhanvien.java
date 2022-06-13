package OOP.Dahinh;

public class nhanvien extends nguoi{
    private int luong;
    private int ngayCong;

    public nhanvien(String ten, int tuoi, int luong, int ngayCong) {
        super(ten, tuoi);
        this.luong = luong;
        this.ngayCong = ngayCong;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }
}
