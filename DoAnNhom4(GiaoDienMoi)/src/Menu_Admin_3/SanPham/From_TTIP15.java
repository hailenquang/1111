package Menu_Admin_3.SanPham;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.MediaTracker;
import javax.swing.JOptionPane;

public class From_TTIP15 extends javax.swing.JFrame {

    public From_TTIP15() {
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
    private String[] imagePaths = {"/imageIP/15pl1.png", "/imageIP/15pl2.jpg", "/imageIP/15pl3.jpg", "/imageIP/15pl4.jpg", "/imageIP/15pl5.jpg", "/imageIP/15pl6.jpg", "/imageIP/15pl7.jpg", "/imageIP/15pl8.jpg", "/imageIP/15pl9.jpg", "/imageIP/15pl10.png","/imageIP/15pl11.png"};
    private int currentImagePathIndex = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TTAvata = new javax.swing.JPanel();
        Avata = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(TTAvata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                From_TTIP15 form = new From_TTIP15();

                String imagePath1 = "/imageIP/15pl1.png";
                form.setAvatarImage(imagePath1);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avata;
    private javax.swing.JPanel TTAvata;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
