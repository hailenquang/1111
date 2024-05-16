package Menu_Admin_3.SanPham;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.MediaTracker;
import javax.swing.JOptionPane;

public class From_TTSanPham extends javax.swing.JFrame {

    public From_TTSanPham() {
        initComponents();
    }

    public void setAvatarImage(String imagePath) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(Avata.getWidth(), Avata.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
            Avata.setIcon(scaledImageIcon);
        } catch (Exception e) {
            System.out.println("Image not found: " + e.getMessage());
        }
    }
    private String[] imagePaths = {"/imageIP/p1.jpg", "/imageIP/p2.jpg", "/imageIP/p3.jpg", "/imageIP/p4.jpg", "/imageIP/p5.jpg", "/imageIP/p6.jpg", "/imageIP/p7.jpg", "/imageIP/p8.jpg", "/imageIP/p9.jpg", "/imageIP/p10.jpg", "/imageIP/p11.png"};
    private int currentImagePathIndex = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTAvata = new javax.swing.JPanel();
        Avata = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 400));

        TTAvata.setBackground(new java.awt.Color(204, 204, 204));
        TTAvata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TTAvataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TTAvataLayout = new javax.swing.GroupLayout(TTAvata);
        TTAvata.setLayout(TTAvataLayout);
        TTAvataLayout.setHorizontalGroup(
            TTAvataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTAvataLayout.createSequentialGroup()
                .addComponent(Avata, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        TTAvataLayout.setVerticalGroup(
            TTAvataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTAvataLayout.createSequentialGroup()
                .addComponent(Avata, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("xiaowei", 3, 48)); // NOI18N
        jLabel2.setText("<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("xiaowei", 3, 48)); // NOI18N
        jLabel3.setText(">");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(TTAvata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(807, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TTAvata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(jLabel3)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        currentImagePathIndex = (currentImagePathIndex + 1) % imagePaths.length;
        String newImagePath = imagePaths[currentImagePathIndex];

        setAvatarImage(newImagePath);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void TTAvataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTAvataMouseClicked

    }//GEN-LAST:event_TTAvataMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        currentImagePathIndex = (currentImagePathIndex - 1 + imagePaths.length) % imagePaths.length;
    String newImagePath = imagePaths[currentImagePathIndex];

    setAvatarImage(newImagePath);
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                From_TTSanPham form = new From_TTSanPham();

                String imagePath1 = "/imageIP/p1.jpg";
                form.setAvatarImage(imagePath1);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avata;
    private javax.swing.JPanel TTAvata;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
