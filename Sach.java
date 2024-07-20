public class Sach extends TaiLieu{
    private String tenSach,tenTG;
    private int soTrang;
    public Sach(){};

    public Sach(String tenSach, String tenTG,String tenNhaXB, int soTrang,int soBanPH) {
        super(tenNhaXB, soBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    @Override
    public void setMa() {
        String s = this.getTenTG().trim().toUpperCase();
        String[] ds = s.split("\\s+");
        String res = ds[ds.length-1];
        String x = String.valueOf(id);
        id++;
        while (x.length()<3) x="0"+x;
        setMa(res+x);
    }

    @Override
    public String toString() {
        return this.getMa()+" "+this.getTenSach()+" "+this.getTenTG()+" "+this.getTenNhaXB()+" "+this.getSoBanPH()+" "+this.getSoAnPham();
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public int getSoAnPham() {
        int cnt = this.getSoBanPH();
        int ans=0;
        if(cnt>=0 && cnt<=200)
        {
            ans=cnt*5/100;
        }
        else if(cnt>=201 && cnt<=500)
        {
            ans=cnt*8/100;
        }
        else if(cnt>500)
        {
            ans=cnt*10/100;
        }
        if(this.getTenNhaXB().equals("giao duc")){
            ans-=(ans*2/100);
        }
        return ans;
    }
}
