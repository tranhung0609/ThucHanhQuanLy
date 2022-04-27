package thidaihoc;

public class KhoiC extends ThiSinh {
    private static final String monVan = "Van";
    private static final String monSu = "Su";
    private static final String monDia = "Dia";

    public KhoiC() {
    }

    public KhoiC(int soBaoDanh, String ten, String diaChi, int doUuTien) {
        super(soBaoDanh, ten, diaChi, doUuTien);
    }

    @Override
    public String toString() {
        return "KhoiC{}";
    }
}
