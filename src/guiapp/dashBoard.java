/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp;

import java.awt.Color;
import internalPage.*;
import internalPage.dashBoardPage;
/**
 *
 * @author SCC-COMLAB
 */
public class dashBoard extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
        initComponents();
    }
    Color navcolor = new Color(153,153,153);
    Color headcolor = new Color(0,153,153);
    Color bodycolor = new Color(0,204,204);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userpane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reportspane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        building = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(153, 153, 153));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(153, 153, 153));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 160, -1));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 50));

        userpane.setBackground(new java.awt.Color(153, 153, 153));
        userpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpaneMouseExited(evt);
            }
        });
        userpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER PAGE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        userpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 160, -1));

        navbar.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, 50));

        reportspane.setBackground(new java.awt.Color(153, 153, 153));
        reportspane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportspaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportspaneMouseExited(evt);
            }
        });
        reportspane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REPORTS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        reportspane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 160, -1));

        navbar.add(reportspane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/logo.png"))); // NOI18N
        navbar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 180, 120));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 180, 540);

        header.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(598, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header);
        header.setBounds(180, 0, 680, 40);

        maindesktop.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("STUDENT'S ATTENDANCE");

        building.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        building.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/building1.png"))); // NOI18N

        maindesktop.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        maindesktop.setLayer(building, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maindesktopLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(maindesktopLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(building, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maindesktopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(building, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(180, 40, 680, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
    dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
      
    }//GEN-LAST:event_jLabel1MouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
       dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void userpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseEntered
         userpane.setBackground(bodycolor);
    }//GEN-LAST:event_userpaneMouseEntered

    private void userpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseExited
        userpane.setBackground(navcolor);
    }//GEN-LAST:event_userpaneMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void reportspaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspaneMouseEntered
           reportspane.setBackground(bodycolor);
    }//GEN-LAST:event_reportspaneMouseEntered

    private void reportspaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspaneMouseExited
      reportspane.setBackground(navcolor);
    }//GEN-LAST:event_reportspaneMouseExited

    private void userpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseClicked
        userPage up = new userPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_userpaneMouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked

        dashBoardPage dbp = new dashBoardPage();
    maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
setState(ICONIFIED); 
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel building;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportspane;
    private javax.swing.JPanel userpane;
    // End of variables declaration//GEN-END:variables
}
