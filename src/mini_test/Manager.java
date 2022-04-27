package mini_test;

public interface Manager {
    void displayAll();

    void addPerson(Person person);

    Person seachById(int id);

    Person deleteById(int id);

    int updateByid(int id);
}
