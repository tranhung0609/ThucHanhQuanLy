package demomenu;

import java.util.Scanner;

public class HienThiMenu {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        for (;;){
            System.out.println("1.Nhập");
            System.out.println("2.Xem");
            System.out.println("3.Thoát");

            do {
                System.out.println("Nhập 1/2/3 để chọn chứ năng");
                choice = sc.nextInt();
            } while ((choice<1||choice>3));

            switch (choice){
                case 1:
                    System.out.println("Nhập cái giề nhập đuê");
                    break;
                case 2:
                    System.out.println("Không có gì để xem đâu");
                    break;
                case 3:
                    System.out.println("Bye bye bé");
                    System.exit(0);
                    break;
            }
        }
//
//        String menu = "\n" +
//                "            ====================MENU====================\n" +
//                "            1.          ❤  THÊM SẢN PHẨM               | \n" +
//                "            2.            HIỂN THỊ DANH SÁCH            |\n" +
//                "            3.            TÌM KIẾM THEO TÊN             |\n" +
//                "            4.            TÌM THEO KHOẢNG GIÁ           |\n" +
//                "            5.               SỬA SẢN PHẨM               |\n" +
//                "            6.               XÓA SẢN PHẨM               |\n" +
//                "            7.             SẮP XẾP THEO GIÁ             |\n" +
//                "                                                        |\n" +
//                "            0.               >>>THOÁT<<<                |\n" +
//                "            --------------------------------------------\n" ;
//
//        System.out.println(menu);

//        while (true){
//            System.out.println("=============================");
//            System.out.println("1.Danh sách in ra là");
//            System.out.println("2. Thêm ");
//            System.out.println("3.Sửa");
//            System.out.println("4.Xóa");
//            System.out.println("5.Thoát");
//            System.out.println("=============================");
//            choice = sc.nextInt();
//
//            switch (choice){
//                case 1:
//                    System.out.println("Có anh thành thạo 7 ngôn ngữ thì có in ra không");
//                    break;
//                case 2:
//                    System.out.println("Có mỗi anh thành thạo 7 ngôn ngữ thôi");
//                    break;
//                case 3:
//                    System.out.println("Anh thành thạo 7 ngôn ngữ nên trình bày ngắn ngọn hơn");
//                    break;
//                case 4:
//                    System.out.println("Đừng xóa anh ấy.");
//                    break;
//                case 5:
//                    System.out.println("Gà");
//                    break;
//            }
        }
    }
