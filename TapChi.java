public class TapChi extends TaiLieu{
    private String thang;
    public TapChi(){};

    public TapChi(String tenNhaXB, int soBanPH, String thang) {
        super(tenNhaXB, soBanPH);
        this.thang = thang;
    }

    @Override
    public void setMa() {
        String s = this.getTenNhaXB().trim().toUpperCase();
        String[] ds = s.split("\\s+");
        String res = "";
        for(String x : ds)
        {
            res+=x.charAt(0);
        }
        String x = String.valueOf(id);
        id++;
        while (x.length()<3) x="0"+x;
        setMa(res+x);
    }

    @Override
    public String toString() {
        return this.getMa()+" "+this.getTenNhaXB()+" " +this.getSoBanPH()+" " +this.getThang()+" "+this.getSoAnPham();
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    @Override
    public int getSoAnPham() {
        int cnt = this.getSoBanPH();
        int ans=0;
        if(cnt>=0 && cnt<=100)
        {
            ans=cnt*2/100;
        }
        else if(cnt>=101 && cnt<=200)
        {
            ans=cnt*5/100;
        }
        else if(cnt>200)
        {
            ans=cnt*8/100;
        }
        if(this.getTenNhaXB().equals("KHCNTT TT")){
            ans+=(ans*2/100);
        }
        return ans;
    }
}
