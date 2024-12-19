import java.util.ArrayList;
import java.util.Scanner;

public class quanlisach {
    private ArrayList<Sach> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    int autoid = 1;
     public void themsach(){
//         System.out.print("Hãy nhập id: ");
//         int id = sc.nextInt();
//         sc.nextLine();

         System.out.print("Hãy nhập tên sách: ");
         String sach =sc.nextLine();

         System.out.print("Hãy nhập tên tác giả: ");
         String tacgia = sc.nextLine();

         System.out.print("Hãy nhập tên nhà xuất bản: ");
         String nhaxuatban = sc.nextLine();

         Sach newsach = new Sach(autoid,sach,tacgia,nhaxuatban );
         autoid ++;
         list.add(newsach);
         System.out.println("Thêm thành công");
     }

     public void hienthi(){
         System.out.println("DANH SÁCH SÁCH");
         for (int i = 0; i <this.list.size() ; i++) {
             Sach sach = list.get(i);
             sach.chitiet();
         }
     }

     public void sua(){
         System.out.print("Hãy nhập id cần tìm: ");
         int ID = sc.nextInt();
         sc.nextLine();
         for (int i = 0; i <this.list.size() ; i++) {
             Sach sach = list.get(i);
             if(sach.getId() == ID){
                 System.out.println("Hãy nhập tên sách mới: ");
                 String newsach = sc.nextLine();

                 System.out.println("Hãy nhập tên tác giả mới: ");
                 String newtacgia = sc.nextLine();

                 System.out.println("Hãy nhập tên nhà xuất bản mới: ");
                 String newnhaxuatban = sc.nextLine();

                 sach.setTensach(newsach);
                 sach.setTacgia(newtacgia);
                 sach.setNhaxuatbang(newnhaxuatban);

                 System.out.println("Sửa thành công");
                 return;
             }
         }

         System.out.println("Không tìm thấy");
     }

     public void xoa(){
         System.out.print("Hãy nhập id cần tìm: ");
         int ID = sc.nextInt();
         sc.nextLine();
         for (int i = 0; i <this.list.size() ; i++) {
             Sach sach = list.get(i);
             if(sach.getId() == ID){
               list.remove(sach);
                 System.out.println("xóa thành công");
                 return;
             }
         }
         System.out.println("Không tìm thấy ");
     }
      public void timtheonhaxuatban(){
          System.out.println("Hãy nhập tên nhà xuất bảng cần tìm: ");
          String NXB = sc.nextLine();
          int count =0;
          for (int i = 0; i < this.list.size() ; i++) {
              Sach sach = list.get(i);
              if(sach.getNhaxuatbang().toLowerCase().contains(NXB)){
                  sach.chitiet();
                  count ++;
              }
          }
          if(count == 0){
              System.out.println("Không tìm thấy");
          }
      }
}
