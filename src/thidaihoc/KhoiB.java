package thidaihoc;

public class KhoiB extends ThiSinh {
    private static final String monToan="Toan";
    private static final String monHoa="Hoa";
    private static final String monSinh="Sinh";

    public KhoiB() {
    }

    public KhoiB(int soBaoDanh, String ten, String diaChi, int doUuTien) {
        super(soBaoDanh, ten, diaChi, doUuTien);
    }

    @Override
    public String toString() {
        return "KhoiB{}";
    }
}
