package quanlyhocsinhthpt;

import java.util.Date;

public class HocSinhXH extends HocSinh implements IHocSinh{
    private float diemSu;
    private float diemDia;

    public float getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(float diemSu) {
        this.diemSu = diemSu;
    }

    public float getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(float diemDia) {
        this.diemDia = diemDia;
    }

    public HocSinhXH() {
    }

    public HocSinhXH(String maHs, String hoTen, String lop, Date ngaySinh, boolean gioiTinh, float diemToan, float diemVan, float diemAnh,float diemSu, float diemDia) {
        super(maHs, hoTen, lop, ngaySinh, gioiTinh, diemToan, diemVan, diemAnh);
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    @Override
    public String toString() {
        return super.toString() + " " + diemSu + " " + diemDia + "Diem TB: " + String.format("%.2f", diemTB())+ " "  + "Xep loai: " + xepLoai();
    }
    
    
    @Override
    public String xepLoai() {
         String xepLoai;
       if(diemTB() >= 8.0){
           xepLoai = "Gioi";
       }else if(diemTB() >= 6.5){
           xepLoai = "Kha";
       }else if(diemTB() >= 5.0){
           xepLoai = "Trung binh";
       }else xepLoai = "Yeu";
       return xepLoai;
    }
    @Override
    public void Nhap() {
        System.out.println("Nhap thong tin hoc sinh khoi xa hoi");
        super.Nhap(); 
        System.out.print("Nhap diem dia: ");
        diemDia = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem su: ");
        diemSu = Float.parseFloat(sc.nextLine());
    }
    @Override
    public float diemTB() {
       return (getDiemToan() + getDiemVan() + getDiemAnh() + getDiemDia() + getDiemSu()) / 5;
    }
    
}
