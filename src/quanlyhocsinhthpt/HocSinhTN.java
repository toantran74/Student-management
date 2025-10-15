package quanlyhocsinhthpt;

import java.util.Date;

public class HocSinhTN extends HocSinh implements IHocSinh {

    private float diemLy;
    private float diemHoa;

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public HocSinhTN() {
    }

    public HocSinhTN(String maHs, String hoTen, String lop, Date ngaySinh, boolean gioiTinh, float diemToan, float diemVan, float diemAnh, float diemLy, float diemHoa) {
        super(maHs, hoTen, lop, ngaySinh, gioiTinh, diemToan, diemVan, diemAnh);
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + diemLy + " " + diemHoa + " Diem TB: " + String.format("%.2f", diemTB()) + " " + " Xep loai: " + xepLoai();
    }

    @Override
    public String xepLoai() {
        String xepLoai;
        if (diemTB() >= 8.0) {
            xepLoai = "Gioi";
        } else if (diemTB() >= 6.5) {
            xepLoai = "Kha";
        } else if (diemTB() >= 5.0) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Yeu";
        }
        return xepLoai;
    }

    @Override
    public void Nhap() {
        System.out.println("Nhap thong tin hoc sinh khoi tu nhien");
        super.Nhap();
        System.out.print("Nhap diem ly: ");
        diemLy = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem hoa: ");
        diemHoa = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void Xuat() {
        System.out.println("Xuat thong tin hoc sinh khoi tu nhien ");
        super.Xuat();
        System.out.print("Diem ly: " + diemLy);
        System.out.print("Diem hoa: " + diemHoa);
    }

    @Override
    public float diemTB() {
        return (getDiemToan() + getDiemVan() + getDiemAnh() + getDiemLy() + getDiemHoa()) / 5;
    }

}
