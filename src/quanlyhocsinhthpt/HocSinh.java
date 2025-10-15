package quanlyhocsinhthpt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class HocSinh {

    private String maHs;
    private String hoTen;
    private String lop;
    private Date ngaySinh;
    private boolean gioiTinh;
    private float diemToan;
    private float diemVan;
    private float diemAnh;

    public String getMaHs() {
        return maHs;
    }

    public void setMaHs(String maHs) {
        this.maHs = maHs;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(float diemAnh) {
        this.diemAnh = diemAnh;
    }
    

    public abstract String xepLoai();

    public HocSinh() {
    }

    public HocSinh(String maHs, String hoTen, String lop, Date ngaySinh, boolean gioiTinh, float diemToan, float diemVan, float diemAnh) {
        this.maHs = maHs;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Date chuyen_Chuoi_ngay(String ngay) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        } catch (Exception e) {
            System.out.println("Loi dinh dang");
        }
        return null;
    }

    public void Nhap() {
        System.out.print("Nhap ma hoc sinh: ");
        maHs = sc.nextLine();
        System.out.print("Nhap ho ten hoc sinh: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = chuyen_Chuoi_ngay(sc.nextLine());
        System.out.print("Nhap gioi tinh (T/F)");
        gioiTinh = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhap diem toan: ");
        diemToan = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem van: ");
        diemVan = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem anh: ");
        diemAnh = Float.parseFloat(sc.nextLine());
    }

    public void Xuat() {
        System.out.println("Ma Hoc Sinh: " + maHs);
        System.out.println("Ho va Ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi Tinh: " + gioiTinh);
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Van: " + diemVan);
        System.out.println("Diem Anh: " + diemAnh);
    }

    @Override
    public String toString() {
        return maHs + " " + hoTen + " " + lop + " " + sdf.format(ngaySinh) + " " + gioiTinh + " " + diemToan + " " + diemVan + " " + diemAnh;
    }

}
