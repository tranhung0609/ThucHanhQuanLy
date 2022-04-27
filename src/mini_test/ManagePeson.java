package mini_test;

import java.util.List;
import java.util.Scanner;

public class ManagePeson implements Manager {
    private List<Person> personList;
    private final Scanner scanner = new Scanner(System.in);


    @Override
    public void displayAll() {
        for (Person person :
                personList) {
            System.out.println(person);
        }
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
    }

    @Override
    public Person seachById(int id) {
        for (Person person :
                personList) {
            if (person.getPhoneNumber() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person deleteById(int id) {
        Person person = null;
        for (Person p :
                personList) {
            if (p.getPhoneNumber() == id) {
                person = p;
            }
        }
        personList.remove(person);
        System.out.println("Xóa thành công !");
        return person;
    }

    @Override
    public int updateByid(int id) {
        for (int i = 0; i < personList.size(); i++){
            if (personList.get(i).getPhoneNumber()==id){
                return i;
            }
        }
            return -1;
    }
}
