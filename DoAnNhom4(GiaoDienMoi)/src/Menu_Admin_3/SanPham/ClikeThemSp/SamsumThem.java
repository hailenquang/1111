/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu_Admin_3.SanPham.ClikeThemSp;
import MenuAdmin.QuanLiSP.ClikeThemSp.Danhsach1;
import Menu_Admin_3.SanPham.Form_QLSanPham;
import java.awt.Font;
import java.awt.Image;
import java.awt.MediaTracker;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
public class SamsumThem extends javax.swing.JFrame {
    private List<Danhsach1> list = new ArrayList<>();
    private Danhsach1 y;
    private static int pos = 0;
    private static int check = 0;
    private JPanel panel;
    public SamsumThem() {
      initComponents();
        init();
        String imagePath = "/icon/rm1.jpg";
        this.getRootPane().setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        list.add(new Danhsach1("Samsung Galaxy S23 Ultra  ", "Androi ", "Chụp ảnh và chơi game", "8G","256G ","Sac sieu nhanh", "Chống va đập và chống thấm nước ", 24990000, "/icon/sm1.jpg" ));
        list.add(new Danhsach1(" Samsung Galaxy S23 ", "Androi ", "Chụp ảnh và chơi game", "12G","256G ", "Sac sieu nhanh", "Chống va đập và chống thắm nước",32190000, "/icon/sm2.jpg"));
        list.add(new Danhsach1("Samsung Galaxy S23", "Androi ", "Chụp ảnh và chơi game", "8G"," 256G","Sac sieu nhanh", "Chống va đập vfa chống thấm nước ", 21990000, "/icon/sm3.jpg"));
        list.add(new Danhsach1("Samsung Galaxy Z Fold5", "Androi ", "Chụp ảnh và chơi game", "12G","456G ","Sac sieu nhanh", "Chống va đập và chống thấm nước ", 35990000, "/icon/sm4.jpg"));
        list.add(new Danhsach1("Samsung Galaxy Z ", "Androi ", "Chụp ảnh và chơi game", "8G","256G ","Sac sieu nhanh", "Chống va đập và chống thấm nước ", 31390000, "/icon/sm5.jpg"));
        View();
        ViewTable();
    }
     public void View(){
        y = list.get(pos);
        this.txthang.setText(y.getHang());
    this.txtdt.setText(y.getDt());
    this.txtnc.setText(y.getNc());
    this.txtram.setText(y.getRam());
    this.txtdl.setText(y.getDl());
    this.txttn.setText(y.getTn());
    this.txttndb.setText(y.getTndb());
    this.txtgia.setText("" + y.getGia());
    this.FileAvata.setText(y.getFileAvata());
    OnOff(true, false);
    setImage(y.getFileAvata());
    tblDanhsach.setRowSelectionInterval(pos, pos);
    }
    public void ViewTable(){
        DefaultTableModel model = (DefaultTableModel) this.tblDanhsach.getModel();
    model.setNumRows(0);
    int n = 1;
    for (Danhsach1 y : list) {
model.addRow(new Object[]{n++, y.getHang(),  y.getDt(), y.getNc(), y.getRam(), y.getDl(), y.getTn(), y.getTndb(),y.getGia(), y.getFileAvata()});
    }
    this.tblDanhsach.setRowHeight(20);
    tblDanhsach.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event) {
            if (!event.getValueIsAdjusting()) {
                pos = tblDanhsach.getSelectedRow();
                if (pos >= 0 && pos < list.size()) {
                    View();
                }
            }
        }
    });
    }

    public void OnOff(boolean a, boolean b) {
        this.btnSave.setVisible(b);
        this.btnCancel.setVisible(b);
        //+++++++++++
        this.btnAdd.setVisible(a);
        this.btnedit.setVisible(a);
        this.btnDelete.setVisible(a);
    }

     public void init()
     {
//         setImage(); 
     }
     public void setImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
    if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
        // Xử lý trường hợp không tìm thấy hình ảnh
        icon = new ImageIcon(getClass().getResource("/icon/default.jpg"));
    }
    Image img = icon.getImage().getScaledInstance(Avata.getWidth(), Avata.getHeight(), Image.SCALE_SMOOTH);
    Avata.setIcon(new ImageIcon(img));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhsach = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Thongtinh = new javax.swing.JTextField();
        Anhadd = new javax.swing.JPanel();
        Avata = new javax.swing.JLabel();
        Thongtinh2 = new javax.swing.JTextField();
        Thongtinh3 = new javax.swing.JTextField();
        Thongtinh4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txthang = new javax.swing.JTextField();
        txtdt = new javax.swing.JTextField();
        txtnc = new javax.swing.JTextField();
        txtram = new javax.swing.JTextField();
        txtdl = new javax.swing.JTextField();
        txttn = new javax.swing.JTextField();
        txttndb = new javax.swing.JTextField();
        txtgia = new javax.swing.JTextField();
        FileAvata = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("THÊM SẢN PHẨM");

        tblDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Hãng", " Loại", "Nhu Cầu", "RAM", "Dung lương lưu trữ", "Tính năng sạc", "Tính năng đặc biệt", "Giá", "Ảnh"
            }
        ));
        tblDanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachMouseClicked(evt);
            }
        });
        tblDanhsach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDanhsachKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhsach);

        jLabel3.setText("Hãng ");

        jLabel4.setText("Loại");

        jLabel5.setText("Nhu cầu");

        jLabel6.setText("Ram");

        jLabel7.setText("Dung lương lưu trữ");

        jLabel8.setText("Tính năng sạc ");

        jLabel9.setText("Tính năng dặc biệt");

        jLabel10.setText("Giá");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Thongtinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongtinhMouseClicked(evt);
            }
        });
        Thongtinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongtinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AnhaddLayout = new javax.swing.GroupLayout(Anhadd);
        Anhadd.setLayout(AnhaddLayout);
        AnhaddLayout.setHorizontalGroup(
            AnhaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnhaddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avata, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        AnhaddLayout.setVerticalGroup(
            AnhaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnhaddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Avata, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );

        Thongtinh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thongtinh2MouseClicked(evt);
            }
        });
        Thongtinh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thongtinh2ActionPerformed(evt);
            }
        });

        Thongtinh3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thongtinh3MouseClicked(evt);
            }
        });
        Thongtinh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thongtinh3ActionPerformed(evt);
            }
        });

        Thongtinh4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Thongtinh4MouseClicked(evt);
            }
        });
        Thongtinh4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thongtinh4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Anhadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Thongtinh3)
                    .addComponent(Thongtinh)
                    .addComponent(Thongtinh2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thongtinh4, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Anhadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Thongtinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Thongtinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Thongtinh3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Thongtinh4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jLabel11.setText("Ảnh");

        txtgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgiaActionPerformed(evt);
            }
        });

        FileAvata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileAvataActionPerformed(evt);
            }
        });

        btnedit.setText("Sửa");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Hủy bỏ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Quay lại");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jToggleButton1)
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSave)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnAdd)
                                .addGap(92, 92, 92)
                                .addComponent(btnCancel)
                                .addGap(81, 81, 81)
                                .addComponent(btnDelete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtdl)
                                        .addComponent(txttn)
                                        .addComponent(txttndb)
                                        .addComponent(txtgia)
                                        .addComponent(FileAvata, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                        .addComponent(txthang)
                                        .addComponent(txtnc)
                                        .addComponent(txtram))
                                    .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btnedit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txttndb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(FileAvata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnAdd)
                            .addComponent(btnCancel)
                            .addComponent(btnDelete)
                            .addComponent(btnedit)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachMouseClicked
        pos = this.tblDanhsach.getSelectedRow();
        if (pos >= 0) { // Check if a row is selected
            Danhsach1 selectedProduct = list.get(pos);
            this.txthang.setText(selectedProduct.getHang());
            this.txtdt.setText(selectedProduct.getDt());
            this.txtnc.setText(selectedProduct.getNc());
            this.txtdl.setText(selectedProduct.getDl());
            this.txttn.setText(selectedProduct.getTn());
            this.txttndb.setText(selectedProduct.getTndb());
            this.txtram.setText(selectedProduct.getRam());
            this.txtgia.setText(String.valueOf(selectedProduct.getGia()));
            this.FileAvata.setText(selectedProduct.getFileAvata());
        }
    }//GEN-LAST:event_tblDanhsachMouseClicked

    private void tblDanhsachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDanhsachKeyReleased
        pos = this.tblDanhsach.getSelectedRow();
        View();
    }//GEN-LAST:event_tblDanhsachKeyReleased

    private void ThongtinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongtinhMouseClicked
        Thongtinh.setText(txthang.getText());
    }//GEN-LAST:event_ThongtinhMouseClicked

    private void ThongtinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongtinhActionPerformed

    }//GEN-LAST:event_ThongtinhActionPerformed

    private void Thongtinh2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thongtinh2MouseClicked
        Thongtinh2.setText(txtnc.getText());
    }//GEN-LAST:event_Thongtinh2MouseClicked

    private void Thongtinh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thongtinh2ActionPerformed

    }//GEN-LAST:event_Thongtinh2ActionPerformed

    private void Thongtinh3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thongtinh3MouseClicked
        Thongtinh3.setText(txttndb.getText());
    }//GEN-LAST:event_Thongtinh3MouseClicked

    private void Thongtinh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thongtinh3ActionPerformed

    }//GEN-LAST:event_Thongtinh3ActionPerformed

    private void Thongtinh4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Thongtinh4MouseClicked
        Thongtinh4.setText(txtgia.getText()+" đ");
    }//GEN-LAST:event_Thongtinh4MouseClicked

    private void Thongtinh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thongtinh4ActionPerformed

    }//GEN-LAST:event_Thongtinh4ActionPerformed

    private void txtgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgiaActionPerformed

    }//GEN-LAST:event_txtgiaActionPerformed

    private void FileAvataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileAvataActionPerformed
        //         setImage();
    }//GEN-LAST:event_FileAvataActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        OnOff(false,true);
        check = -1;
    }//GEN-LAST:event_btneditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        UIManager.put("OptionPane.massageFont", new FontUIResource(new Font("Aria",Font.BOLD,20)));
        int n = JOptionPane.showConfirmDialog(panel,"Ban muon xoa khong ?","Alert",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
            list.remove(pos);
            if(pos >list.size()-1)
            pos = pos -1;
            if(pos<0)
            pos = 0;
            View();
            ViewTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.txthang.setText("");
        this.txtgia.setText("");
        this.txtdt.setText("");
        this.txtnc.setText("");
        this.txtdl.setText("");
        this.txttn.setText("");
        this.txttndb.setText("");
        this.txtram.setText("");
        this.FileAvata.setText("");
        OnOff(false,true);
        check = 1;
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String hang = this.txthang.getText();
        int gia = Integer.parseInt(this.txtgia.getText());
        String dt = this.txtdt.getText();
        String nc = this.txtnc.getText();
        String dl = this.txtdl.getText();
        String tn = this.txttn.getText();
        String tndb = this.txttndb.getText();
        String ram = this.txtram.getText();
        String fileAvata = this.FileAvata.getText();

        if (check == 1) {
            list.add(new Danhsach1(hang, dt, nc, ram, dl, tn, tndb, gia, fileAvata));

            setImage(fileAvata);
        }
        if (check == -1) {
            list.set(pos, new Danhsach1(hang, dt, nc, ram, dl, tn, tndb, gia, fileAvata));
        }

        View();
        ViewTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Form_QLSanPham menuSp = new Form_QLSanPham(); 
    menuSp.setVisible(true); 
    this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SamsumThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SamsumThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SamsumThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SamsumThem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SamsumThem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anhadd;
    private javax.swing.JLabel Avata;
    private javax.swing.JTextField FileAvata;
    private javax.swing.JTextField Thongtinh;
    private javax.swing.JTextField Thongtinh2;
    private javax.swing.JTextField Thongtinh3;
    private javax.swing.JTextField Thongtinh4;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblDanhsach;
    private javax.swing.JTextField txtdl;
    private javax.swing.JTextField txtdt;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txthang;
    private javax.swing.JTextField txtnc;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txttn;
    private javax.swing.JTextField txttndb;
    // End of variables declaration//GEN-END:variables
}
