package quanlyhocsinhthpt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DanhSach {

    ArrayList<HocSinh> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Date chuoi_ngay(String day) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(day);
        } catch (Exception e) {
            System.out.println("Loi dinh dang!");
        }
        return null;
    }

    public void Nhap1() {
        String menu;
        do {
            System.out.println("Nhap 0: Thoat \n"
                    + " 1: Hoc sinh khoi tu nhien \n"
                    + " 2: Hoc sinh khoi xa hoi \n"
            );
            System.out.print("Moi ban lua chon: ");
            menu = sc.nextLine();

            if (menu == null || menu.trim().isEmpty()) {
                System.out.println("Vui long nhap lua chon!");
                continue;
            }

            menu = menu.trim().toLowerCase();

            switch (menu) {
                case "0":
                    break;
                case "1":
                    HocSinh tn = new HocSinhTN();
                    tn.Nhap();
                    ds.add(tn);
                    break;
                case "2":
                    HocSinh xh = new HocSinhXH();
                    xh.Nhap();
                    ds.add(xh);
                    break;
                default:
                    System.out.println("Vui long chon dung ki tu 0/1/2!");
            }
        } while (!menu.equals("0"));
    }

    public void Xuat() {
        for (HocSinh x : ds) {
            System.out.println(x.toString());
        }
    }

   public void Nhap2() {
    if (ds.isEmpty()) {
        ds.add(new HocSinhTN("TN01", "Tam", "10A2", chuoi_ngay("26/05/2005"), false, 8.2f, 9.0f, 8.6f, 7.5f, 9.0f));
        ds.add(new HocSinhTN("TN02", "Nhung", "10A3", chuoi_ngay("12/08/2005"), false, 8.6f, 8.8f, 6.5f, 7.0f, 8.1f));
        ds.add(new HocSinhTN("TN03", "Khuong", "10A2", chuoi_ngay("10/09/2005"), true, 9.2f, 8.1f, 7.6f, 7.2f, 8.0f));
        ds.add(new HocSinhTN("TN04", "Thinh", "10A2", chuoi_ngay("17/01/2005"), true, 7.9f, 8.0f, 8.1f, 7.9f, 9.2f));

        ds.add(new HocSinhXH("XH01", "Mai", "10A1", chuoi_ngay("27/07/2005"), false, 7.8f, 8.0f, 8.4f, 9.1f, 8.8f));
        ds.add(new HocSinhXH("XH02", "Tai", "10A3", chuoi_ngay("09/04/2005"), true, 8.9f, 8.1f, 8.0f, 8.2f, 8.0f));
        ds.add(new HocSinhXH("XH03", "Phuong", "10A1", chuoi_ngay("18/11/2005"), false, 7.6f, 6.5f, 5.0f, 6.4f, 5.9f));
        ds.add(new HocSinhXH("XH04", "Huy", "10A3", chuoi_ngay("12/11/2005"), true, 7.5f, 7.0f, 8.8f, 7.1f, 7.8f));
        
        System.out.println("Nhap 2 thanh cong!");
    } else {
        System.out.println("Danh sách đã có dữ liệu, không thêm nữa!");
    }
}

   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public void docFile(String tenFile) {
        ds = new ArrayList<>();
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Da tim thay file nay");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String maHS1 = line.next();
                    String hoTen1 = line.next();
                    String lop1 = line.next();
                    Date ngaySinh1 = chuoi_ngay(line.next());
                    boolean gioiTinh1 = Boolean.parseBoolean(line.next());
                    float diemToan1 = Float.parseFloat(line.next());
                    float diemVan1 = Float.parseFloat(line.next());
                    float diemAnh1 = Float.parseFloat(line.next());

                    if (maHS1.charAt(0) == 'T') {
                        float diemLy1 = Float.parseFloat(line.next());
                        float diemHoa1 = Float.parseFloat(line.next());
                        ds.add(new HocSinhTN(maHS1, hoTen1, lop1, ngaySinh1, gioiTinh1, diemToan1, diemVan1, diemAnh1, diemLy1, diemHoa1));
                    } else if (maHS1.charAt(0) == 'X') {
                        float diemDia1 = Float.parseFloat(line.next());
                        float diemSu1 = Float.parseFloat(line.next());
                        ds.add(new HocSinhXH(maHS1, hoTen1, lop1, ngaySinh1, gioiTinh1, diemToan1, diemVan1, diemAnh1, diemDia1, diemSu1));
                    }
                }
                System.out.println("Doc file thanh cong");
            } else {
                System.out.println("Doc file thanh cong");
            }
        } catch (Exception e) {
            System.out.println("Loi doc file");
        }
    }

    public void ghiFile(String tenFile) {
        try {
            FileWriter fW = new FileWriter(tenFile);
            BufferedWriter bW = new BufferedWriter(fW);
            for (HocSinh hs : ds) {
                bW.write(hs.toString());
                bW.newLine();
            }
            bW.close();
            fW.close();
            System.out.println("Ghi File thanh cong!");
        } catch (Exception e) {
            System.out.println("Loi doc file");
        }
    }
    public HocSinh tim(String maHS) {
        HocSinh n = null;
        for (HocSinh x : ds) {
            if (x.getMaHs().equalsIgnoreCase(maHS)) {
                n = x;
                System.out.println("Infor HS cần tìm");
                return n;
            }
        }
        System.out.println("Không tìm thấy");
        return n;
    }
    public void TimHS(String maHs) {
        int tim = 0;
        for (HocSinh hs : ds) {
            if (hs.getMaHs().equals(maHs)) {
                System.out.println("Da co thong tin hoc sinh can tim! ");
                System.out.println(hs.toString());
                tim = 1;
                break;
            }
        }
        if (tim == 0) {
            System.out.println("Khong tim thay thong tin hoc sinh nay!");
        }
    }

    public void XoaHs(String maHs) {
        int xoa = 0;
        for (HocSinh hs : ds) {
            if (hs.getMaHs().equals(maHs)) {
                System.out.println("Da xoa hoc sinh nay thanh cong!");
                ds.remove(hs);
                xoa = 1;
                break;
            }
        }

        if (xoa == 0) {
            System.out.println("Khong the xoa hoc sinh voi ma so nay!");
        }
    }
    ArrayList<HocSinh> locHs = new ArrayList<>();

    public ArrayList<HocSinh> LocHSG() {
        for (HocSinh hs : ds) {
            if (hs.xepLoai().equals("Gioi")) {
                locHs.add(hs);
            }
        }
        System.out.println("Danh sach sau khi loc la: ");
        for (HocSinh hs : locHs) {
            System.out.println(hs.toString());
        }
        return locHs;
    }
    ArrayList<HocSinh> locHsk = new ArrayList<>();

    public ArrayList<HocSinh> LocHSK() {
        for (HocSinh hs : ds) {
            if (hs.xepLoai().equals("Kha")) {
                locHsk.add(hs);
            }
        }
        System.out.println("Danh sach sau khi loc la: ");
        for (HocSinh hs : locHsk) {
            System.out.println(hs.toString());
        }
        return locHsk;
    }
    ArrayList<HocSinh> locHstb = new ArrayList<>();

    public ArrayList<HocSinh> LocHSTB() {
        for (HocSinh hs : ds) {
            if (hs.xepLoai().equals("Trung binh")) {
                locHstb.add(hs);
            }
        }
        System.out.println("Danh sach sau khi loc la: ");
        for (HocSinh hs : locHstb) {
            System.out.println(hs.toString());
        }
        return locHstb;
    }

    public void sapXepDTB() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if ((((IHocSinh) ds.get(i)).diemTB()) > (((IHocSinh) ds.get(j)).diemTB())) {
                    HocSinh tam = ds.get(j);
                    ds.set(j, ds.get(i));
                    ds.set(i, tam);
                }
            }
        }
        System.out.println("-------DS sau khi sx diem trung binh --------");
        Xuat();
    }

    public void SuaThongTinHocSinh() {
        System.out.print("Nhap ma hoc sinh can sua: ");
        String maHs = sc.nextLine();
        int sua = 0;

        for (HocSinh hs : ds) {
            if (hs.getMaHs().equals(maHs)) {
                sua = 1;
                System.out.println("Thong tin hoc sinh hien tai:");
                System.out.println(hs.toString());

                System.out.println("Chon thong tin hoc sinh can sua:");
                System.out.println("1. Ho ten");
                System.out.println("2. Lop");
                System.out.println("3. Ngay sinh");
                System.out.println("4. Gioi tinh");
                System.out.println("5. Diem Toan");
                System.out.println("6. Diem Van");
                System.out.println("7. Diem Anh");

                if (hs instanceof HocSinhTN) {
                    System.out.println("8. Diem ly");
                    System.out.println("9. Diem hoa");
                } else if (hs instanceof HocSinhXH) {
                    System.out.println("8. Diem dia");
                    System.out.println("9. Diem su");
                }
                System.out.print("Moi ban lua chon: ");
                try {
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.print("Nhap ho ten: ");
                            hs.setHoTen(sc.nextLine());
                            break;
                        case 2:
                            System.out.print("Nhap lop: ");
                            hs.setLop(sc.nextLine());
                            break;
                        case 3:
                            System.out.print("Nhap ngay sinh: ");
                            hs.setNgaySinh(chuoi_ngay(sc.nextLine()));
                            break;
                        case 4:
                            System.out.print("Nhap gioi tinh: ");
                            hs.setGioiTinh(Boolean.parseBoolean(sc.nextLine()));
                            break;
                        case 5:
                            System.out.print("Nhap diem toan: ");
                            hs.setDiemToan(Float.parseFloat(sc.nextLine()));
                            break;
                        case 6:
                            System.out.print("Nhap diem van: ");
                            hs.setDiemVan(Float.parseFloat(sc.nextLine()));
                            break;
                        case 7:
                            System.out.print("Nhap diem anh: ");
                            hs.setDiemAnh(Float.parseFloat(sc.nextLine()));
                            break;
                        case 8:
                            if (hs instanceof HocSinhTN) {
                                System.out.print("Nhap diem ly: ");
                                ((HocSinhTN) hs).setDiemLy(Float.parseFloat(sc.nextLine()));
                            } else if (hs instanceof HocSinhXH) {
                                System.out.print("Nhap diem su: ");
                                ((HocSinhXH) hs).setDiemSu(Float.parseFloat(sc.nextLine()));
                            }
                            break;
                        case 9:
                            if (hs instanceof HocSinhTN) {
                                System.out.print("Nhap diem hoa: ");
                                ((HocSinhTN) hs).setDiemHoa(Float.parseFloat(sc.nextLine()));
                            } else if (hs instanceof HocSinhXH) {
                                System.out.print("Nhap diem su: ");
                                ((HocSinhXH) hs).setDiemSu(Float.parseFloat(sc.nextLine()));
                            }
                            break;
                        default:
                            System.out.println("Lua chon khong hop !");
                    }
                } catch (Exception e) {
                    System.out.println("Loi: Vui long nhap so nguyen tu 1 -> 8!");
                }

                System.out.println("Cap nhat thong tin hoc sinh thanh cong!");
                System.out.println("Thong tin hoc sinh sau khi sua la: ");
                System.out.println(hs.toString());
                break;
            }
        }
        if (sua == 0) {
            System.out.println("Khong tim thay thong tin hoc sinh can sua");
        }
    }
    ArrayList<HocSinh> inDSLop;
    public ArrayList<HocSinh> InDSlop(String tenLop){
        inDSLop = new ArrayList<>();
        for(HocSinh hs : ds){
            if(hs.getLop().equals(tenLop)){
                inDSLop.add(hs);
            }
        }
        System.out.println("Danh sach lop: ");
        for(HocSinh x : inDSLop){
            System.out.println(x.toString());
        }
        return inDSLop;
    }
}
