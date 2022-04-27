package quanly;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();

        quanLyCanBo.add(new CanBo("Hưng", 24, "Nam", "NĐ"));
        quanLyCanBo.add(new CanBo("Tuệ", 24, "Nữ", "HT"));
        quanLyCanBo.add(new CanBo("Kiên", 24, "Nam", "HN"));
        quanLyCanBo.add(new CanBo("Chương tó", 22, "Nữ", "PT"));
        quanLyCanBo.add(new CanBo("Hoa tó", 21, "Nữ", "NA"));
        quanLyCanBo.add(new CanBo("Hường", 28, "Nữ", "NA"));

        System.out.println("-------------------");
        quanLyCanBo.display();
        System.out.println("-------------------");
        quanLyCanBo.find("hưng");
        quanLyCanBo.display();
        System.out.println("-------------------");
    }
}
