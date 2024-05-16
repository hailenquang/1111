package Menu_Admin_3.SanPham;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.MediaTracker;
import javax.swing.JOptionPane;

public class From_TTSSZFO5 extends javax.swing.JFrame {

    public From_TTSSZFO5() {
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
    private String[] imagePaths = {"/imageIP/fo5.jpg","/imageIP/fo51.jpg","/imageIP/fo52.jpg","/imageIP/fo53.jpg","/imageIP/fo54.jpg","/imageIP/fo55.jpg","/imageIP/fo56.jpg","/imageIP/fo57.jpg"};
    private int currentImagePathIndex = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTAvata = new javax.swing.JPanel();
        Avata = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel2.setText(">");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("xiaowei", 3, 48)); // NOI18N
        jLabel3.setText("<");
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TTAvata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TTAvata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                From_TTSSZFO5 form = new From_TTSSZFO5();

                String imagePath1 = "/imageIP/fo5.jpg";
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
