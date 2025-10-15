package quanlyhocsinhthpt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HocSinh_GUI extends javax.swing.JFrame {

    DefaultTableModel da;
    DanhSach lopds = new DanhSach();

    public HocSinh_GUI() {
        initComponents();
        table1.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 16));
        da = new DefaultTableModel();
        da.setColumnIdentifiers(new Object[]{"Ma HS", "Ho Ten", "Lop", "Ngay sinh", "Gioi Tinh", "Diem Toan", "Diem Van", "Diem Anh", "Diem Ly", "Diem hoa", "Diem dia", "Diem su","ĐTB"});
        table1.setModel(da);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btndoc = new javax.swing.JButton();
        btn_ghiFile = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_tim = new javax.swing.JButton();
        btn_lochsg = new javax.swing.JButton();
        btn_lochsk = new javax.swing.JButton();
        btn_lochstb = new javax.swing.JButton();
        btn_sapxep = new javax.swing.JButton();
        brn_in = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.setRowHeight(40);
        jScrollPane1.setViewportView(table1);

        btndoc.setBackground(new java.awt.Color(255, 153, 255));
        btndoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndoc.setText("Đọc FIle");
        btndoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocActionPerformed(evt);
            }
        });

        btn_ghiFile.setBackground(new java.awt.Color(255, 153, 255));
        btn_ghiFile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ghiFile.setText("Ghi File");
        btn_ghiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghiFileActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(255, 153, 255));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_xoa.setText("Xóa HS");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_tim.setBackground(new java.awt.Color(255, 153, 255));
        btn_tim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_tim.setText("Tìm HS");
        btn_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timActionPerformed(evt);
            }
        });

        btn_lochsg.setBackground(new java.awt.Color(255, 153, 255));
        btn_lochsg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_lochsg.setText("Lọc HSG");
        btn_lochsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lochsgActionPerformed(evt);
            }
        });

        btn_lochsk.setBackground(new java.awt.Color(255, 153, 255));
        btn_lochsk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_lochsk.setText("Lọc HSK");
        btn_lochsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lochskActionPerformed(evt);
            }
        });

        btn_lochstb.setBackground(new java.awt.Color(255, 153, 255));
        btn_lochstb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_lochstb.setText("Lọc HSTB");
        btn_lochstb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lochstbActionPerformed(evt);
            }
        });

        btn_sapxep.setBackground(new java.awt.Color(255, 153, 255));
        btn_sapxep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sapxep.setText("Sắp Xếp");
        btn_sapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sapxepActionPerformed(evt);
            }
        });

        brn_in.setBackground(new java.awt.Color(255, 153, 255));
        brn_in.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        brn_in.setText("In DS Lớp");
        brn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_inActionPerformed(evt);
            }
        });

        btn_thoat.setBackground(java.awt.Color.lightGray);
        btn_thoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btndoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ghiFile)
                                .addGap(18, 18, 18)
                                .addComponent(btn_xoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_tim)
                                .addGap(18, 18, 18)
                                .addComponent(btn_lochsg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_lochsk)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_lochstb)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sapxep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brn_in)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ghiFile, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lochsg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lochsk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lochstb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brn_in, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<HocSinh> alDoc;
    private void btndocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocActionPerformed
        lopds.docFile("DocFile1.txt");
        alDoc = lopds.ds;
        napVaoDa(alDoc);
    }//GEN-LAST:event_btndocActionPerformed
    public void xoaBang() {
    da = (DefaultTableModel)table1.getModel();
    da.setRowCount(0);
    }
    private void btn_ghiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghiFileActionPerformed
        lopds.ghiFile("GUI_GHIFILE1.txt");
        JOptionPane.showMessageDialog(null, "Ghi File thành công. Vào thư mục để kiểm tra thông tin chi tiết!");
    }//GEN-LAST:event_btn_ghiFileActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
         String maNVXoa = JOptionPane.showInputDialog("Nhập vào mã học sinh để xóa");
    if (maNVXoa == null || maNVXoa.trim().isEmpty()) {
        return; // Người dùng bấm Hủy hoặc không nhập gì
    }

   int soLuongTruoc = lopds.ds.size();  
    lopds.XoaHs(maNVXoa.trim());        
    int soLuongSau = lopds.ds.size(); 

    if (soLuongSau < soLuongTruoc) {
        JOptionPane.showMessageDialog(null, "Xóa học sinh thành công!");
    } else {
        JOptionPane.showMessageDialog(null, "Không tìm thấy học sinh để xóa!");
    }

    napVaoDa(lopds.ds);
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timActionPerformed
        String maNVTim = JOptionPane.showInputDialog("Nhập vào mã học sinh để tìm");
        HocSinh hs = lopds.tim(maNVTim);
        ArrayList<HocSinh> aLTim = new ArrayList<>();
        
        if(hs != null){
            aLTim.add(hs);
            napVaoDa(aLTim);
        }else{
            JOptionPane.showMessageDialog(null, "Khong co");
        }
    }//GEN-LAST:event_btn_timActionPerformed

    private void btn_lochsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lochsgActionPerformed
        napVaoDa(lopds.LocHSG());
    }//GEN-LAST:event_btn_lochsgActionPerformed

    private void btn_lochskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lochskActionPerformed
        napVaoDa(lopds.LocHSK());
    }//GEN-LAST:event_btn_lochskActionPerformed

    private void btn_lochstbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lochstbActionPerformed
        napVaoDa(lopds.LocHSTB());
    }//GEN-LAST:event_btn_lochstbActionPerformed

    private void btn_sapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sapxepActionPerformed
        lopds.sapXepDTB();
        ArrayList<HocSinh> alSX = lopds.ds;
        napVaoDa(alSX);
    }//GEN-LAST:event_btn_sapxepActionPerformed

    private void brn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brn_inActionPerformed
        String tenLop = JOptionPane.showInputDialog("Nhập tên lớp để in danh sách");
        napVaoDa(lopds.InDSlop(tenLop));
    }//GEN-LAST:event_brn_inActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        int i=JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát hay không?", "Thông báo!", JOptionPane.YES_NO_OPTION);
        if(i==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HocSinh_GUI().setVisible(true);
            }
        });
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void napVaoDa(ArrayList<HocSinh> AL) {
    while (da.getRowCount() > 0) {
        da.removeRow(0);
    }
    for (HocSinh hs : AL) {
        if (hs instanceof HocSinhTN) {
            da.addRow(new Object[]{
                hs.getMaHs(), hs.getHoTen(), hs.getLop(), sdf.format(hs.getNgaySinh()), hs.isGioiTinh(),
                hs.getDiemToan(), hs.getDiemVan(), hs.getDiemAnh(),
                ((HocSinhTN) hs).getDiemLy(), ((HocSinhTN) hs).getDiemHoa(), "...", "...",
                String.format("%.2f", ((HocSinhTN) hs).diemTB())
            });
        } else if (hs instanceof HocSinhXH) {
            da.addRow(new Object[]{
                hs.getMaHs(), hs.getHoTen(), hs.getLop(), sdf.format(hs.getNgaySinh()), hs.isGioiTinh(),
                hs.getDiemToan(), hs.getDiemVan(), hs.getDiemAnh(),
                "...", "...", ((HocSinhXH) hs).getDiemDia(), ((HocSinhXH) hs).getDiemSu(),
                String.format("%.2f", ((HocSinhXH) hs).diemTB())
            });
        }
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brn_in;
    private javax.swing.JButton btn_ghiFile;
    private javax.swing.JButton btn_lochsg;
    private javax.swing.JButton btn_lochsk;
    private javax.swing.JButton btn_lochstb;
    private javax.swing.JButton btn_sapxep;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_tim;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton btndoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
