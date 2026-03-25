package ntu.huy.ngdngmenunhhng;

public class MonAn {
    private String TenMonAn;
    private double donGia;
    private String moTa;
    private int idAnhMinhHoa;

    public MonAn(String tenMonAn,double donGia, String moTa, int idAnhMinhHoa) {
        TenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
    //getter and setter

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
