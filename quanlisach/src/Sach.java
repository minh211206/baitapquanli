public class Sach {
    private int id;
    private String tensach;
    private String tacgia;
    private String nhaxuatbang;

    public Sach(int id, String tensach, String tacgia, String nhaxuatbang) {
        this.id = id;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nhaxuatbang = nhaxuatbang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNhaxuatbang() {
        return nhaxuatbang;
    }

    public void setNhaxuatbang(String nhaxuatbang) {
        this.nhaxuatbang = nhaxuatbang;
    }

    public void chitiet(){
        System.out.printf("%10s %10s %10s %10s %n",this.getId(),this.getTensach(),this.getTacgia(),this.getNhaxuatbang());
    }
}
