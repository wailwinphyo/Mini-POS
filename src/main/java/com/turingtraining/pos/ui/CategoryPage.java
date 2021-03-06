/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.ui;

import com.turingtraining.pos.model.Category;
import com.turingtraining.pos.model.User;
import com.turingtraining.pos.service.CategoryService;
import com.turingtraining.pos.service.CategoryServiceImpl;
import com.turingtraining.pos.util.SystemUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wailwinphyo
 */
public class CategoryPage extends javax.swing.JFrame {

    /**
     * Creates new form AddCategory
     */
    CategoryService catService = new CategoryServiceImpl();

    public CategoryPage() {
        initComponents();
        loadData();
    }

    private void loadData() {
        List<Category> catList = catService.getCategoryList();
        DefaultTableModel model = (DefaultTableModel) this.jtCategories.getModel();
        int count = model.getRowCount();
        for (int i = 0; i < count - 1; i++) {
            model.removeRow(i);
        }
        catList.forEach(c -> {
            Object obj[] = {c.getId(), c.getName(), c.getDescription()};
            model.addRow(obj);
        });
        this.jtCategories.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jtfName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescription = new javax.swing.JTextArea();
        jlbDecription = new javax.swing.JLabel();
        jlbName = new javax.swing.JLabel();
        jbtCancel = new javax.swing.JButton();
        jbtAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCategories = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmiExit1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAddNewCashier = new javax.swing.JMenuItem();
        jmiProduct = new javax.swing.JMenuItem();
        jmiCategory = new javax.swing.JMenuItem();
        jmiAddStock = new javax.swing.JMenuItem();
        jmiStockReport = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmiSaleReport = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini POS");
        setPreferredSize(new java.awt.Dimension(800, 400));

        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });

        jtaDescription.setColumns(20);
        jtaDescription.setRows(5);
        jScrollPane1.setViewportView(jtaDescription);

        jlbDecription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbDecription.setLabelFor(jtaDescription);
        jlbDecription.setText("Description : ");

        jlbName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbName.setLabelFor(jtfName);
        jlbName.setText("Name : ");

        jbtCancel.setText("Back to home");
        jbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelActionPerformed(evt);
            }
        });

        jbtAdd.setText("Add");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbDecription, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jbtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDecription, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Add Category", jPanel1);

        jtCategories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Description"
            }
        ));
        jScrollPane2.setViewportView(jtCategories);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Category List", jPanel2);

        jMenu3.setText("File ");
        jMenu3.setMargin(new java.awt.Insets(3, 6, 3, 3));

        jmiExit1.setText("Exit");
        jmiExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExit1ActionPerformed(evt);
            }
        });
        jMenu3.add(jmiExit1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("View");

        jMenuItem1.setText("Sale Voucher");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        jMenu2.setText("System Preference");
        jMenu2.setMargin(new java.awt.Insets(3, 6, 3, 3));

        jmiAddNewCashier.setText("User Config");
        jmiAddNewCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddNewCashierActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddNewCashier);

        jmiProduct.setText("Product Config");
        jmiProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductActionPerformed(evt);
            }
        });
        jMenu2.add(jmiProduct);

        jmiCategory.setText("Category");
        jmiCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoryActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCategory);

        jmiAddStock.setText("Add Stock");
        jmiAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddStockActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddStock);

        jMenuBar2.add(jMenu2);

        jmiStockReport.setText("Reports");

        jMenuItem4.setText("Stock Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmiStockReport.add(jMenuItem4);

        jmiSaleReport.setText("Monthly Report");
        jmiSaleReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaleReportActionPerformed(evt);
            }
        });
        jmiStockReport.add(jmiSaleReport);

        jMenuItem7.setText("Sale Report");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jmiStockReport.add(jMenuItem7);

        jMenuBar2.add(jmiStockReport);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameActionPerformed

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        PageSwitcher.returnHome(this);
    }//GEN-LAST:event_jbtCancelActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        String msg;
        try {
            String name = this.jtfName.getText().trim();
            String desc = this.jtaDescription.getText();

            if (name == null) {
                throw new Exception("Category Name is empty");
            }

            Category cat = new Category(null, name, desc);
            catService.insertCategory(cat);
            msg = "Success !";
            loadData();
        } catch (Exception ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
            msg = "Failed !";
        }
        JOptionPane.showMessageDialog(this, msg, "Add Category", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jbtAddActionPerformed

    private void jmiExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiExit1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PageSwitcher.returnHome(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiAddNewCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddNewCashierActionPerformed
        User u = SystemUtil.getCurrentUser();
        if ("ROLE_ADMIN".equals(u.getUserType())) {
            PageSwitcher.registerNewCashier(this);
        } else {
            JOptionPane.showMessageDialog(null, "Only admin can add cashier", "UnAuthorized", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiAddNewCashierActionPerformed

    private void jmiProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductActionPerformed
        PageSwitcher.ItemPage(this);
    }//GEN-LAST:event_jmiProductActionPerformed

    private void jmiCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoryActionPerformed
        PageSwitcher.CategoryPage(this);
    }//GEN-LAST:event_jmiCategoryActionPerformed

    private void jmiAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddStockActionPerformed
        new StockPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiAddStockActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        PageSwitcher.showRemainingStock(this);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmiSaleReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaleReportActionPerformed
        PageSwitcher.showMonthlySaleReport(this);
    }//GEN-LAST:event_jmiSaleReportActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        PageSwitcher.showSaleReport(this);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JLabel jlbDecription;
    private javax.swing.JLabel jlbName;
    private javax.swing.JMenuItem jmiAddNewCashier;
    private javax.swing.JMenuItem jmiAddStock;
    private javax.swing.JMenuItem jmiCategory;
    private javax.swing.JMenuItem jmiExit1;
    private javax.swing.JMenuItem jmiProduct;
    private javax.swing.JMenuItem jmiSaleReport;
    private javax.swing.JMenu jmiStockReport;
    private javax.swing.JTable jtCategories;
    private javax.swing.JTextArea jtaDescription;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}
