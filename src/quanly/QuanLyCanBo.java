package quanly;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements QuanLy<CanBo>{
    List<CanBo> quanLyList = new ArrayList<>();

    @Override
    public void add(CanBo canBo) {
        quanLyList.add(canBo);
    }

    @Override
    public CanBo find(String name) {
        for(int i =0; i <quanLyList.size();i++){
            if(quanLyList.get(i).getName().equals(name)){
                return quanLyList.get(i);
            }
        }
        return null;
    }

    @Override
    public void display() {
        for(int i =0; i<quanLyList.size();i++){
            System.out.println(quanLyList.get(i));
        }
    }


    @Override
    public void exit() {
        System.exit(0);
    }

}
