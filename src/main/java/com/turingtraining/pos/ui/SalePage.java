/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.ui;

import com.turingtraining.pos.model.Item;
import com.turingtraining.pos.model.User;
import com.turingtraining.pos.service.CategoryService;
import com.turingtraining.pos.service.CategoryServiceImpl;
import com.turingtraining.pos.service.ItemService;
import com.turingtraining.pos.service.ItemServiceImpl;
import com.turingtraining.pos.service.StockService;
import com.turingtraining.pos.service.StockServiceImpl;
import com.turingtraining.pos.util.SystemUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wailwinphyo
 */
public class SalePage extends javax.swing.JFrame {

    /**
     * Creates new form SalePage
     */
    Item tempItem = null;
    CategoryService catService = new CategoryServiceImpl();
    ItemService itemService = new ItemServiceImpl();
    StockService stockService = new StockServiceImpl();

    Map<String, Item> cartMap = new HashMap<>();

    public SalePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdvoucher = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVoucher = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jtfPTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlCashier = new javax.swing.JLabel();
        jlDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jspQty = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtAddItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCart = new javax.swing.JTable();
        jbtRemove = new javax.swing.JButton();
        jbtPrint = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfItemName = new javax.swing.JTextField();
        jtfItemCode = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
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

        jdvoucher.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jdvoucher.setMinimumSize(new java.awt.Dimension(800, 500));
        jdvoucher.setModal(true);
        jdvoucher.setLocationRelativeTo(null);

        jtVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Quantity", "Price", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVoucher.setFocusable(false);
        jtVoucher.setMinimumSize(new java.awt.Dimension(800, 400));
        jtVoucher.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtVoucherComponentAdded(evt);
            }
        });
        jtVoucher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtVoucherFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jtVoucher);
        if (jtVoucher.getColumnModel().getColumnCount() > 0) {
            jtVoucher.getColumnModel().getColumn(2).setResizable(false);
            jtVoucher.getColumnModel().getColumn(3).setResizable(false);
            jtVoucher.getColumnModel().getColumn(4).setResizable(false);
            jtVoucher.getColumnModel().getColumn(4).setPreferredWidth(35);
        }

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total : ");

        jtfPTotal.setEditable(false);
        jtfPTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfPTotal.setText("0");
        jtfPTotal.setPreferredSize(new java.awt.Dimension(23, 35));

        jLabel7.setText("Cashier : ");

        jLabel8.setText("Date : ");

        jlDate.setText(" ");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdvoucherLayout = new javax.swing.GroupLayout(jdvoucher.getContentPane());
        jdvoucher.getContentPane().setLayout(jdvoucherLayout);
        jdvoucherLayout.setHorizontalGroup(
            jdvoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdvoucherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdvoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdvoucherLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addComponent(jtfPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdvoucherLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCashier)
                        .addGap(301, 301, 301)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdvoucherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jdvoucherLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel6, jlCashier, jtfPTotal});

        jdvoucherLayout.setVerticalGroup(
            jdvoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdvoucherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdvoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlCashier)
                    .addComponent(jlDate)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdvoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdvoucherLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel6, jLabel7, jLabel8, jlCashier, jlDate, jtfPTotal});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini POS");

        jspQty.setPreferredSize(new java.awt.Dimension(150, 35));

        jLabel1.setText("Item Code");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel2.setText("Item");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel3.setLabelFor(jspQty);
        jLabel3.setText("Quantity");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));

        jbtAddItem.setText("Add Item");
        jbtAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddItemActionPerformed(evt);
            }
        });

        jtCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Quantity", "Price", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCart.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtCartComponentAdded(evt);
            }
        });
        jtCart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCartFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtCart);
        if (jtCart.getColumnModel().getColumnCount() > 0) {
            jtCart.getColumnModel().getColumn(2).setResizable(false);
            jtCart.getColumnModel().getColumn(3).setResizable(false);
            jtCart.getColumnModel().getColumn(4).setResizable(false);
            jtCart.getColumnModel().getColumn(4).setPreferredWidth(35);
        }

        jbtRemove.setText("Remove Item");
        jbtRemove.setEnabled(false);
        jbtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveActionPerformed(evt);
            }
        });

        jbtPrint.setText("Print");
        jbtPrint.setEnabled(false);
        jbtPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrintActionPerformed(evt);
            }
        });

        jLabel4.setText("Total : ");

        jtfTotal.setEditable(false);
        jtfTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfTotal.setText("0");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sale Voucher");

        jtfItemName.setEditable(false);

        jtfItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfItemCodeActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jspQty, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jspQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAddItem)
                    .addComponent(jbtRemove)
                    .addComponent(jbtPrint)
                    .addComponent(jtfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jLabel4, jbtAddItem, jbtPrint, jbtRemove, jspQty, jtfItemCode, jtfItemName, jtfTotal});

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddItemActionPerformed
        Item item = tempItem;
        Integer qty = (Integer) this.jspQty.getValue();

        if (item != null && qty > 0) {
            DefaultTableModel cartModel = (DefaultTableModel) this.jtCart.getModel();
            int rowCount = cartModel.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                if (item.getCode().equals(cartModel.getValueAt(i, 0))) {
                    ((DefaultTableModel) this.jtCart.getModel()).removeRow(i);
                    qty += this.cartMap.get(item.getCode()).getQuantity();
                }
            }
            item.setQuantity(qty);
            Double subTotal = qty * item.getPrice();
            Object[] obj = {item.getCode(), item.getName(), qty, item.getPrice(), subTotal};
            cartModel.addRow(obj);
            this.cartMap.put(item.getCode(), item);
            changedCart();
            tempItem = null;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Input", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtAddItemActionPerformed

    private void jbtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveActionPerformed
        int index = this.jtCart.getSelectedRow();
        String code = (String) this.jtCart.getValueAt(index, 0);
        this.cartMap.remove(code);
        ((DefaultTableModel) this.jtCart.getModel()).removeRow(index);
        changedCart();
    }//GEN-LAST:event_jbtRemoveActionPerformed

    private void jtCartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCartFocusGained
        this.jbtRemove.setEnabled(true);
    }//GEN-LAST:event_jtCartFocusGained

    private void jbtPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrintActionPerformed
        try {
            stockService.purchaseItem(new ArrayList<>(cartMap.values()));
            DefaultTableModel cModel = (DefaultTableModel) this.jtCart.getModel();
            this.jtVoucher.setModel(cModel);
            this.jlCashier.setText(SystemUtil.getCurrentUser().getUsername());
            this.jlDate.setText(SystemUtil.getCurrentDateString());
            this.jtfPTotal.setText(this.jtfTotal.getText());
            this.jdvoucher.setVisible(true);
            ((DefaultTableModel) this.jtCart.getModel()).setRowCount(0);
        } catch (Exception ex) {
            Logger.getLogger(SalePage.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }//GEN-LAST:event_jbtPrintActionPerformed


    private void jtCartComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtCartComponentAdded

    }//GEN-LAST:event_jtCartComponentAdded

    private void jtVoucherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtVoucherFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVoucherFocusGained

    private void jtVoucherComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtVoucherComponentAdded

    }//GEN-LAST:event_jtVoucherComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jdvoucher.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfItemCodeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String code = this.jtfItemCode.getText();
        Item item = itemService.getItemDetail(code);
        if (item.getId() == null) {
            JOptionPane.showMessageDialog(null, "Item not found", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else if (item.getQuantity() < 1) {
            JOptionPane.showMessageDialog(null, "Stock run out!", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            this.jtfItemName.setText(item.getName());
            this.tempItem = item;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtAddItem;
    private javax.swing.JButton jbtPrint;
    private javax.swing.JButton jbtRemove;
    private javax.swing.JDialog jdvoucher;
    private javax.swing.JLabel jlCashier;
    private javax.swing.JLabel jlDate;
    private javax.swing.JMenuItem jmiAddNewCashier;
    private javax.swing.JMenuItem jmiAddStock;
    private javax.swing.JMenuItem jmiCategory;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiExit1;
    private javax.swing.JMenuItem jmiProduct;
    private javax.swing.JMenuItem jmiSaleReport;
    private javax.swing.JMenu jmiStockReport;
    private javax.swing.JSpinner jspQty;
    private javax.swing.JTable jtCart;
    private javax.swing.JTable jtVoucher;
    private javax.swing.JTextField jtfItemCode;
    private javax.swing.JTextField jtfItemName;
    private javax.swing.JTextField jtfPTotal;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables

    private void changedCart() {
        if (this.jtCart.getRowCount() == 0) {
            this.jbtPrint.setEnabled(false);
            this.jtfTotal.setText("0");
        } else {
            Double total = 0.0;
            total = this.cartMap.values().stream()
                    .map((item) -> item.getPrice() * item.getQuantity())
                    .reduce(total, (accumulator, _item) -> accumulator + _item);

            this.jtfTotal.setText(total.toString());
            this.jspQty.setValue(0);
            this.jtfItemCode.setText("");
            this.jtfItemName.setText("");
            this.jbtPrint.setEnabled(true);
        }
    }
}
