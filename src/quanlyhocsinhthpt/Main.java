package quanlyhocsinhthpt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DanhSach danhsach = new DanhSach();
        Scanner sc = new Scanner(System.in);
        String luaChon;

        do {
            System.out.println("Nhap 0: Thoat\n"
                    + "Nhap 1: Nhap 1\n"
                    + "Nhap 2: Nhap 2 (data co san)\n"
                    + "Nhap 3: Xuat thong tin hoc sinh\n"
                    + "Nhap 4: Doc File\n"
                    + "Nhap 5: Ghi File\n"
                    + "Nhap 6: Tim Hoc sinh\n"
                    + "Nhap 7: Xoa Hoc Sinh\n"
                    + "Nhap 8: Loc HSG\n"
                    + "Nhap 9: Loc HSK\n"
                    + "Nhap 10: Loc HSTB\n"
                    + "Nhap 11: Sap xep ds theo DTB\n"
                    + "Nhap 12: Sua thong tin hoc sinh\n"
                    + "Nhap 13: In danh sach lop"
            );
            System.out.print("Moi ban lua chon: ");
            luaChon = sc.nextLine();
            luaChon = luaChon.trim().toLowerCase();

            switch (luaChon) {
                case "0":
                    System.out.println("Da thoat khoi chuong trinh! Hen gap lai");
                    break;
                case "1":
                    danhsach.Nhap1();
                    break;
                case "2":
                    danhsach.Nhap2();
                    break;
                case "3":
                    danhsach.Xuat();
                    break;
                case "4":
                    danhsach.docFile("DocFile1.txt");
                    break;
                case "5":
                    danhsach.ghiFile("GhiFile1.txt");
                    break;
                case "6":
                    danhsach.TimHS("");
                    break;
                case "7":
                    danhsach.XoaHs("TN01");
                    break;
                case "8":
                    danhsach.LocHSG();
                    break;
                case "9":
                    danhsach.LocHSK();
                    break;
                case "10":
                    danhsach.LocHSTB();
                    break;
                case "11":
                    danhsach.sapXepDTB();
                    break;
                    case"12":
                        danhsach.SuaThongTinHocSinh();
                        break;
                    case"13":
                        danhsach.InDSlop("");
                        break;
                default:
                    System.out.println("Chi duoc nhap tu 0 -> 12. Vui long thu lai");
            }
        } while (!luaChon.equals("0"));
    }
}
