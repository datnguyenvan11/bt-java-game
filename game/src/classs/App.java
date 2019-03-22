package classs;

import java.util.Scanner;

public class App {
    public void gamether() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên game ");
        String ten = scanner.nextLine();
        System.out.println("Nhập mô tả ngắn ");
        String mota =scanner.nextLine();
        System.out.println("Nhập giá game ");
        int gia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập  phát hành ");
        String ngay =scanner.nextLine();
        System.out.println("Nhập trang chủ");
        String trangchu=scanner.nextLine();
        Game game = new Game(ten, mota, gia, ngay, trangchu);
        System.out.println(game.toString());
    }

}
