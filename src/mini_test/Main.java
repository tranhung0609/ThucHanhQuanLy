package mini_test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagePeson managePeson= new ManagePeson();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3.Cập nhật");
            System.out.println("4.Xóa");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Đọc từ file");
            System.out.println("7.Ghi vào file");
            System.out.println("8.Thoát");
            System.out.println("--------------------------------------");

            int choice = -1;
            while (choice == -1){
                try{
                    choice = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Hãy nhập số để chọn chức năng");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice){
                case 1:
                    managePeson.displayAll();
                    break;
                case 2:
                    System.out.println("Nhập thông tin của người dùng");
                    System.out.println("Nhập số điện thoại");
                    long phoneNumber = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Nhập nhóm của danh bạ");
                    String group = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Nhập họ tên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String sex = scanner.nextLine();
                    System.out.println("Nhập email");
                    String email = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    managePeson.addPerson(new Person(name,phoneNumber,address,email,group,sex));
                    break;
                case 3:
                    System.out.println("Nhập số điện thoại của người muốn sửa");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(managePeson.updateByid(id));
                    break;
                case 4:
                    System.out.println("Nhập số điện thoại của người dùng mà bạn muốn sửa");

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }
    }
}
