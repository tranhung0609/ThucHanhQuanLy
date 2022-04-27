package thidaihoc;

public interface QuanLy<T> {
    void add(T t);

    int findById(int id);

    T find(int id);

    void display();

    void exit();

}
