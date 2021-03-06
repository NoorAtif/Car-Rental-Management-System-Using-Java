/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.finalproject;

import java.io.IOException;
import javax.swing.JOptionPane;
import oop.classes.BookingManagement;

/**
 *
 * @author Zeeshan
 */
public class unbookedCars extends javax.swing.JDialog {

    /**
     * Creates new form unbookedCars
     */
    public unbookedCars(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //populate comboboxes with all unbooked cars
        populateUnbookedCars();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unbookedCars_comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bookCar_btn = new javax.swing.JButton();

        unbookedCars_comboBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Select Car to Book from following unbooked cars");

        bookCar_btn.setText("Book Car");
        bookCar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(unbookedCars_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(bookCar_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(unbookedCars_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bookCar_btn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void populateUnbookedCars()
    {
        //declarations
        BookingManagement bookingManage = null;
        
        //initializations with handeled exceptions
        try {
            bookingManage = new BookingManagement();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "UnBookings does not Found!", 2);
        }
        //if no exception occured then proceed next operation
        if(bookingManage != null)
        {
            //get all current bookings 
            String[] unbookingsArray = bookingManage.getAllUnbookedCarNames();
            
            //show all bookings into combo boxes
            for (String unbookings_found : unbookingsArray) {
                unbookedCars_comboBox.addItem(unbookings_found);
            }
        }
    }
    private void bookCar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCar_btnActionPerformed
        String car_name = unbookedCars_comboBox.getSelectedItem().toString();
        new BookCar(car_name).setVisible(true);
    }//GEN-LAST:event_bookCar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookCar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> unbookedCars_comboBox;
    // End of variables declaration//GEN-END:variables
}
