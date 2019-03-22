package classs;

import java.util.Date;

public class Game {
    String ten;
    String mota;
    Double gia;
    String ngay;
    String trangchu;

    public Game(String ten, String mota, double gia, String ngay, String trangchu) {
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.ngay = ngay;
        this.trangchu = trangchu;
    }
    public Game(){}

    @Override
    public String toString() {
        System.out.println(String.format("%15s| %15s| %15s| %15s| %15s\n", "Tên game", "Mô tả ", "Giá  ", "Ngày phát hành","Trang chủ"));
        return String.format("%15s| %15s| %15s| %15s| %15s\n", this.ten, this.mota, this.gia, this.ngay,this.trangchu);
    }
}
