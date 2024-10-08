/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pe;

import com.mycompany.dialog.AboutUsDialog;
import com.mycompany.dialog.LoginDialog;
import com.mycompany.dialog.SettingDialog;
import java.awt.Component;
import java.awt.event.KeyEvent;
import tabs.AddExpenditurePane;
import tabs.AddExpenditureTypePane;
import tabs.AddReceipTypePane;
import tabs.ListExpenditurePane;
import tabs.ListExpenditureTypePane;
import tabs.ListReceiptPane;
import tabs.ListReceiptTypePane;

/**
 *
 * @author huynh
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        toolbarAddExpenditure = new javax.swing.JButton();
        toolbarListExpenditure = new javax.swing.JButton();
        toolbarAddReceipt = new javax.swing.JButton();
        toolbarListReceipts = new javax.swing.JButton();
        toolbarLock = new javax.swing.JButton();
        toolbarClose = new javax.swing.JButton();
        tpnBoard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuLogOut = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuLock = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuSettings = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAddExpenditureType = new javax.swing.JMenuItem();
        menuListExpenditureType = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuAddNewExpenditure = new javax.swing.JMenuItem();
        menuListExpenditure = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuAddNewReceipt = new javax.swing.JMenuItem();
        menuListReceipts = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuAddReceiptType = new javax.swing.JMenuItem();
        menuListReceiptType = new javax.swing.JMenuItem();
        menuContent = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(519, 523));
        setSize(new java.awt.Dimension(544, 430));

        jToolBar1.setRollover(true);

        toolbarAddExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expenditure.png"))); // NOI18N
        toolbarAddExpenditure.setText("Add Expenditure");
        toolbarAddExpenditure.setFocusable(false);
        toolbarAddExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolbarAddExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarAddExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbarAddExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(toolbarAddExpenditure);

        toolbarListExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expenditure.png"))); // NOI18N
        toolbarListExpenditure.setText("List Expenditure");
        toolbarListExpenditure.setFocusable(false);
        toolbarListExpenditure.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolbarListExpenditure.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarListExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbarListExpenditureActionPerformed(evt);
            }
        });
        jToolBar1.add(toolbarListExpenditure);

        toolbarAddReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        toolbarAddReceipt.setText("Add Receipt");
        toolbarAddReceipt.setFocusable(false);
        toolbarAddReceipt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolbarAddReceipt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarAddReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbarAddReceiptActionPerformed(evt);
            }
        });
        jToolBar1.add(toolbarAddReceipt);

        toolbarListReceipts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list.png"))); // NOI18N
        toolbarListReceipts.setText("List Receipts");
        toolbarListReceipts.setFocusable(false);
        toolbarListReceipts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolbarListReceipts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarListReceipts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbarListReceiptsActionPerformed(evt);
            }
        });
        jToolBar1.add(toolbarListReceipts);

        toolbarLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png"))); // NOI18N
        toolbarLock.setText("Lock");
        toolbarLock.setFocusable(false);
        toolbarLock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolbarLock.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbarLockActionPerformed(evt);
            }
        });
        jToolBar1.add(toolbarLock);

        toolbarClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        toolbarClose.setText("Close");
        toolbarClose.setFocusable(false);
        toolbarClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolbarClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolbarCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(toolbarClose);

        tpnBoard.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        tpnBoard.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/icons/home.png")), jPanel1); // NOI18N

        jMenu1.setMnemonic(KeyEvent.VK_F);
        jMenu1.setText("File");

        menuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        menuLogin.setText("Login");
        jMenu1.add(menuLogin);
        jMenu1.add(jSeparator1);

        menuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        menuLogOut.setText("Logout");
        menuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogOut);
        jMenu1.add(jSeparator2);

        menuLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png"))); // NOI18N
        menuLock.setText("Lock");
        menuLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLockActionPerformed(evt);
            }
        });
        jMenu1.add(menuLock);
        jMenu1.add(jSeparator3);

        menuSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/setting.png"))); // NOI18N
        menuSettings.setText("Settings");
        menuSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSettingsActionPerformed(evt);
            }
        });
        jMenu1.add(menuSettings);
        jMenu1.add(jSeparator4);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic(KeyEvent.VK_M);
        jMenu2.setText("Manager");

        menuAddExpenditureType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        menuAddExpenditureType.setText("Add Expenditure Type");
        menuAddExpenditureType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddExpenditureTypeActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddExpenditureType);

        menuListExpenditureType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expenditure.png"))); // NOI18N
        menuListExpenditureType.setText("List Expenditure Type");
        menuListExpenditureType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListExpenditureTypeActionPerformed(evt);
            }
        });
        jMenu2.add(menuListExpenditureType);
        jMenu2.add(jSeparator5);

        menuAddNewExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        menuAddNewExpenditure.setText("Add New Expenditure");
        menuAddNewExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewExpenditureActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddNewExpenditure);

        menuListExpenditure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expenditure.png"))); // NOI18N
        menuListExpenditure.setText("List Expenditure");
        menuListExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListExpenditureActionPerformed(evt);
            }
        });
        jMenu2.add(menuListExpenditure);
        jMenu2.add(jSeparator6);

        menuAddNewReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        menuAddNewReceipt.setText("Add New Receipt");
        menuAddNewReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddNewReceiptActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddNewReceipt);

        menuListReceipts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        menuListReceipts.setText("List Receipts");
        menuListReceipts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListReceiptsActionPerformed(evt);
            }
        });
        jMenu2.add(menuListReceipts);
        jMenu2.add(jSeparator7);

        menuAddReceiptType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        menuAddReceiptType.setText("Add Receipt Type");
        menuAddReceiptType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddReceiptTypeActionPerformed(evt);
            }
        });
        jMenu2.add(menuAddReceiptType);

        menuListReceiptType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        menuListReceiptType.setText("List Receipt Type");
        menuListReceiptType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListReceiptTypeActionPerformed(evt);
            }
        });
        jMenu2.add(menuListReceiptType);

        jMenuBar1.add(jMenu2);

        menuContent.setMnemonic(KeyEvent.VK_H);
        menuContent.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/content.png"))); // NOI18N
        jMenuItem1.setText("Content");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuContent.add(jMenuItem1);
        menuContent.add(jSeparator8);

        menuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        menuAboutUs.setText("About Us");
        menuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutUsActionPerformed(evt);
            }
        });
        menuContent.add(menuAboutUs);

        jMenuBar1.add(menuContent);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tpnBoard, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpnBoard))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuListReceiptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListReceiptsActionPerformed
        // TODO add your handling code here:
        toolbarListReceiptsActionPerformed(evt);
        
    }//GEN-LAST:event_menuListReceiptsActionPerformed

    private void menuLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLockActionPerformed
        // TODO add your handling code here:
        menuLogOutActionPerformed(evt);
    }//GEN-LAST:event_menuLockActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuExitActionPerformed

    private void toolbarLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbarLockActionPerformed
        // TODO add your handling code here:
        menuLogOutActionPerformed(evt);
    }//GEN-LAST:event_toolbarLockActionPerformed

    private void toolbarAddExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbarAddExpenditureActionPerformed
        AddExpenditurePane pane= new AddExpenditurePane();
        tpnBoard.addTab("AddExpenditure", pane);
        tpnBoard.setSelectedComponent(pane);
        
    }//GEN-LAST:event_toolbarAddExpenditureActionPerformed

    private void toolbarCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbarCloseActionPerformed
        // TODO add your handling code here
        int selectedIndex =tpnBoard.getSelectedIndex();
        if (selectedIndex>0) {
            tpnBoard.remove(selectedIndex);
        }
    }//GEN-LAST:event_toolbarCloseActionPerformed

    private void menuAddNewExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewExpenditureActionPerformed
        // TODO add your handling code here:
        toolbarAddExpenditureActionPerformed(evt);
    }//GEN-LAST:event_menuAddNewExpenditureActionPerformed

    private void toolbarListExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbarListExpenditureActionPerformed
        // TODO add your handling code here:
        ListExpenditurePane pane =new ListExpenditurePane();
        tpnBoard.addTab("List Expenditure", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_toolbarListExpenditureActionPerformed

    private void menuListExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListExpenditureActionPerformed
        // TODO add your handling code here:
        toolbarListExpenditureActionPerformed(evt);
    }//GEN-LAST:event_menuListExpenditureActionPerformed

    private void toolbarAddReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbarAddReceiptActionPerformed
        // TODO add your handling code here:
        AddExpenditurePane pane= new AddExpenditurePane();
        tpnBoard.addTab("Add Receipt", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_toolbarAddReceiptActionPerformed

    private void menuAddNewReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddNewReceiptActionPerformed
        // TODO add your handling code here:
        toolbarAddReceiptActionPerformed(evt);
    }//GEN-LAST:event_menuAddNewReceiptActionPerformed

    private void toolbarListReceiptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolbarListReceiptsActionPerformed
        // TODO add your handling code here:
        ListReceiptPane pane =new ListReceiptPane();
        tpnBoard.addTab("List Receipt", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_toolbarListReceiptsActionPerformed

    private void menuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutUsActionPerformed
        // TODO add your handling code here:
        AboutUsDialog dialog=new AboutUsDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuAboutUsActionPerformed

    private void menuSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSettingsActionPerformed
        // TODO add your handling code here:
        SettingDialog dialog= new SettingDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuSettingsActionPerformed

    private void menuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogOutActionPerformed
        // TODO add your handling code here:
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuLogOutActionPerformed

    private void menuAddExpenditureTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddExpenditureTypeActionPerformed
        // TODO add your handling code here:
        AddExpenditureTypePane pane = new AddExpenditureTypePane(this);
        tpnBoard.addTab("Add Expeditrue Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuAddExpenditureTypeActionPerformed
    public void showListExpenditureType(){
        menuListExpenditureTypeActionPerformed(null);
    }
    public void showListExpenditureTypes(int id){
       AddExpenditureTypePane pane= new AddExpenditureTypePane(this,id);
        tpnBoard.addTab("Edit Expenditure Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }
    private void menuListExpenditureTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListExpenditureTypeActionPerformed
        // TODO add your handling code here:
        ListExpenditureTypePane pane= new ListExpenditureTypePane();
        tpnBoard.addTab("List Expenditure Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuListExpenditureTypeActionPerformed

    private void menuAddReceiptTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddReceiptTypeActionPerformed
        // TODO add your handling code here:
        AddReceipTypePane pane = new AddReceipTypePane();
        tpnBoard.addTab("Add Receipt Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuAddReceiptTypeActionPerformed

    private void menuListReceiptTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListReceiptTypeActionPerformed
        // TODO add your handling code here:
        ListReceiptTypePane pane = new ListReceiptTypePane();
        tpnBoard.addTab("List Receipt Type", pane);
        tpnBoard.setSelectedComponent(pane);
    }//GEN-LAST:event_menuListReceiptTypeActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuAboutUs;
    private javax.swing.JMenuItem menuAddExpenditureType;
    private javax.swing.JMenuItem menuAddNewExpenditure;
    private javax.swing.JMenuItem menuAddNewReceipt;
    private javax.swing.JMenuItem menuAddReceiptType;
    private javax.swing.JMenu menuContent;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuListExpenditure;
    private javax.swing.JMenuItem menuListExpenditureType;
    private javax.swing.JMenuItem menuListReceiptType;
    private javax.swing.JMenuItem menuListReceipts;
    private javax.swing.JMenuItem menuLock;
    private javax.swing.JMenuItem menuLogOut;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuSettings;
    private javax.swing.JButton toolbarAddExpenditure;
    private javax.swing.JButton toolbarAddReceipt;
    private javax.swing.JButton toolbarClose;
    private javax.swing.JButton toolbarListExpenditure;
    private javax.swing.JButton toolbarListReceipts;
    private javax.swing.JButton toolbarLock;
    private javax.swing.JTabbedPane tpnBoard;
    // End of variables declaration//GEN-END:variables
}
