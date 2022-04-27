package thuvien.sach;

import thuvien.Manage;

import java.util.ArrayList;
import java.util.List;

public class QLSach implements Manage<Sach> {
    List<Sach> saches = new ArrayList<>();
    @Override
    public void add(Sach sach) {
        saches.add(sach);
    }

    @Override
    public void eidt(int id, Sach sach) {
        if (findById(id) != -1) {
            saches.set(findById(id), sach);
        } else {
            System.out.println("Không có trong danh sách");
        }

    }

    @Override
    public void delete(int id) {
        if(findById(id) != -1){
            saches.remove(findById(id));
        } else{
            System.out.println("Không có trong danh sách");
        }
    }

    @Override
    public void display() {
        for (int i =0;i<saches.size();i++){
            System.out.println(saches.get(i));
        }
    }

    @Override
    public Sach find(int id) {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public int findById(int id) {
        for (int i =0;i<saches.size();i++){
            if(saches.get(i).getMaTaiLieu() == id){
                return i;
            }
        }
        return -1;
    }
}
