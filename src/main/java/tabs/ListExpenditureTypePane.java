/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tabs;

import com.mycompany.pe.MainFrame;
import dao.ExpenditureTypeDao;
import enitty.ExpenditureType;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.MessageBox;

/**
 *
 * @author Admin
 */
public class ListExpenditureTypePane extends javax.swing.JPanel {

    private DefaultTableModel model = null;
    private MainFrame mainFrame;
    /**
     * Creates new form ListExpenditurePane
     */
    public ListExpenditureTypePane(MainFrame mainFrame) {
        this.mainFrame=mainFrame;
        initComponents();
        initTable();
        loadData();
    }

    public ListExpenditureTypePane(MainFrame aThis, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ListExpenditureTypePane(MainFrame aThis, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void initTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Name"});
        tblListExpenditure.setModel(model);

    }

    public void loadData() {
        try {
            ExpenditureTypeDao dao = new ExpenditureTypeDao();
            List<ExpenditureType> list = dao.findAll();
            for (ExpenditureType item : list) {
                Object[] row = new Object[]{item.getId(), item.getName()};
                model.addRow(row);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            MessageBox.showErrorMessage(this, "Error", e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pumenuList = new javax.swing.JPopupMenu();
        pumenuEdit = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        pumenuDelete = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListExpenditure = new javax.swing.JTable();

        pumenuEdit.setText("Edit");
        pumenuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumenuEditActionPerformed(evt);
            }
        });
        pumenuList.add(pumenuEdit);
        pumenuList.add(jSeparator2);

        pumenuDelete.setText("Delete");
        pumenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumenuDeleteActionPerformed(evt);
            }
        });
        pumenuList.add(pumenuDelete);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("List Expenditure");

        tblListExpenditure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListExpenditure.setComponentPopupMenu(pumenuList);
        jScrollPane1.setViewportView(tblListExpenditure);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pumenuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumenuEditActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_pumenuEditActionPerformed

    private void pumenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pumenuDeleteActionPerformed
        // TODO add your handling code here:
        try {

            if (MessageBox.showComfirmMessages(this, "Do you want to delete?") == JOptionPane.NO_OPTION) {
                return;
            }
            ExpenditureTypeDao dao = new ExpenditureTypeDao();
            int selectedRow = tblListExpenditure.getSelectedRow();
            Object idObject = tblListExpenditure.getValueAt(selectedRow, 0);
            if (idObject != null) {
                int id = Integer.parseInt(idObject.toString());
                if (dao.delete(id)) {
                    MessageBox.showInformationMessage(this, "Information", "Deleted");
                    loadData();
                } else {
                    MessageBox.showErrorMessage(this, "error", "Can not delete");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageBox.showErrorMessage(this, e.getMessage(), "Error");
        }
    }//GEN-LAST:event_pumenuDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem pumenuDelete;
    private javax.swing.JMenuItem pumenuEdit;
    private javax.swing.JPopupMenu pumenuList;
    private javax.swing.JTable tblListExpenditure;
    // End of variables declaration//GEN-END:variables
}
