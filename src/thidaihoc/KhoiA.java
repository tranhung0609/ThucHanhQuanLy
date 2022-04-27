package thidaihoc;

public class KhoiA extends ThiSinh {
    private static final String monToan= "toan";
    private static final String monLy= "toan";
    private static final String monHoa= "toan";

    public KhoiA() {
    }

    public KhoiA(int soBaoDanh, String ten, String diaChi, int doUuTien) {
        super(soBaoDanh, ten, diaChi, doUuTien);
    }

    @Override
    public String toString() {
        return "KhoiA{}";
    }

    public static void main(String[] args) {

    }
}
