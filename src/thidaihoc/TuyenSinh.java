package thidaihoc;

import java.util.LinkedList;

public class TuyenSinh implements QuanLy<ThiSinh> {
    LinkedList<ThiSinh> thisinhs= new LinkedList<>();


    @Override
    public void add(ThiSinh thisinh) {
        thisinhs.add(thisinh);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < thisinhs.size() ; i++) {
            if (thisinhs.get(i).getSoBaoDanh() == id){
                return i;
            }

        }
        return -1;
    }

    @Override
    public ThiSinh find(int id) {
        return null;
    }

    @Override
    public void display() {
        for (int i = 0; i < thisinhs.size();i++){
            System.out.println(thisinhs.get(i));
        }

    }

    @Override
    public void exit() {
        System.exit(0);

    }
}
