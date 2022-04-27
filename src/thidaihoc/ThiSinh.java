package thidaihoc;

public class ThiSinh {
    private int soBaoDanh;
    private String ten;
    private String diaChi;
    private int doUuTien;

    public ThiSinh() {
    }

    public ThiSinh(int soBaoDanh, String ten, String diaChi, int doUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.ten = ten;
        this.diaChi = diaChi;
        this.doUuTien = doUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDoUuTien() {
        return doUuTien;
    }

    public void setDoUuTien(int doUuTien) {
        this.doUuTien = doUuTien;
    }

    @Override
    public String toString() {
        return "thisinh{" +
                "soBaoDanh=" + soBaoDanh +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", doUuTien=" + doUuTien +
                '}';
    }
}
