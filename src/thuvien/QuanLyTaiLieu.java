package thuvien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu implements Manage<TaiLieu> {
    List<TaiLieu> taiLieus = new ArrayList<>();
    private int maTaiLieu;

    @Override
    public void add(TaiLieu taiLieu) {
        taiLieus.add(taiLieu);
    }

    @Override
    public void eidt(int id, TaiLieu taiLieu) {
        if (findById(id) != -1) {
            taiLieus.set(findById(id), taiLieu);
        } else {
            System.out.println("Không có trong danh sách");
        }

    }

    @Override
    public void delete(int id) {
        if(findById(id) != -1){
            taiLieus.remove(findById(id));
        } else{
            System.out.println("Không có trong danh sách");
        }
    }

    @Override
    public void display() {
        for (int i =0;i<taiLieus.size();i++){
            System.out.println(taiLieus.get(i));
        }
    }

    @Override
    public TaiLieu find(int id) {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public int findById(int id) {
        for (int i =0;i<taiLieus.size();i++){
            if(taiLieus.get(i).getMaTaiLieu() == maTaiLieu){
                return i;
            }
        }
        return -1;
    }

//    @Override
//    public void add(TaiLieu taiLieu) {
//        taiLieus.add(taiLieu);
//    }
//
//    @Override
//    public TaiLieu find(String name) {
//        for (int i = 0; i < taiLieus.size(); i++) {
//            if (taiLieus.get(i).getNhaXuatBan().equals(name)) {
//                return taiLieus.get(i);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void display() {
//        for (int i = 0; i < taiLieus.size(); i++) {
//            System.out.println(taiLieus.get(i));
//        }
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public void exit() {
//        System.exit(0);
//    }
//
//    public void findByTaiLieu(TaiLieu taiLieu) {
//        for (TaiLieu tl : taiLieus) {
//            System.out.println(tl);
//        }
//    }
}
