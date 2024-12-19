import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.printf("%10s %n","WELCOME");
        System.out.printf("%10s %n","1.THÊM SÁCH");
        System.out.printf("%10s %n","2.HIỂN THỊ SÁCH");
        System.out.printf("%10s %n","3.CẬP NHẬT SÁCH");
        System.out.printf("%10s %n","4.XÓA SÁCH");
        System.out.printf("%10s %n","5.TÌM THEO NHÀ XUẤT BẢN");
        System.out.printf("%10s %n","6.THOÁT");
    }
    public static Scanner sc = new Scanner(System.in);
    public static quanlisach ql = new quanlisach();
    public static void main(String[] args) {
        int show =0;
        while (true){
            Main.menu();
            System.out.println("Hãy chọn từ 1-6");
            show = sc.nextInt();
            sc.nextLine();

            switch (show){
                case 1:
                    ql.themsach();
                    break;
                case 2:
                    ql.hienthi();
                    break;
                case 3:
                    ql.sua();
                    break;
                case 4:
                    ql.xoa();
                    break;
                case 5:
                    ql.timtheonhaxuatban();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Không hợp lệ,xin chọn lại");
                    break;
            }
        }
    }
}