package thuvien;

public interface Manage<T> {
    void add(T t);

    void eidt(int id, T t);

    void delete(int id);

    void display();

    T find(int id);

    void sort();

    int findById(int id);

}
