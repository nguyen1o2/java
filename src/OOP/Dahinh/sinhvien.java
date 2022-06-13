package OOP.Dahinh;

public class sinhvien extends nguoi{
    private int MSV;
    private float dtb;

    public sinhvien(String ten, int tuoi, int MSV, float dtb) {
        super(ten, tuoi);
        this.MSV = MSV;
        this.dtb = dtb;
    }

    public int getMSV() {
        return MSV;
    }

    public void setMSV(int MSV) {
        this.MSV = MSV;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
}
