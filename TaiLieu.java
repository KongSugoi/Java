public class TaiLieu implements ITaiLieu {
    public static int id = 1;
    private String ma,tenNhaXB;
    private int soBanPH,soAnPham;
    public TaiLieu(){
    }

    public TaiLieu(String tenNhaXB, int soBanPH) {
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }
    public void setMa()
    {

    }
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public void setSoAnPham(int soAnPham) {
        this.soAnPham = soAnPham;
    }

    @Override
    public int getSoAnPham() {
        return 0;
    }
}
