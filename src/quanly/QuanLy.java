package quanly;

public interface QuanLy<T> {
    void add(T t);

    T find(String name);

    void display();


    void exit();

}
