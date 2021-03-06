/* 
    File: ProvideAServiceView.java
    Project: COSC-4360 Capstone Project Team #0
    University: McMurry University
    Course: COSC–4360 Spring 2021
    Instructor: Mr. Brozovic
    Programmer: Jacob Bremiller
    Created by: Lydia Clarke
    Created: 2/02/2021
    Updated by: Jacob Bremiller
    Updated: 3/3/2021
    Compiler: Apache NetBeans IDE for Java SE
    Description: Provides a simulation of the provider swiping a members card.
 */
package ProviderTerminal.Views;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ljcla
 */
public class SwipeMemberCardView extends javax.swing.JFrame {

    /**
     * Creates new form SwipeMemberCard
     */
    public SwipeMemberCardView() {
        initComponents();
    }
    //Setters
    public void setSearchButtonListener(ActionListener e){
        btn_CardNumberSubmit.addActionListener(e);
    }
    public void setBackCardSwipeButtonListener(ActionListener e){
        btn_BackCardSwipe.addActionListener(e);
    }
    
    public void setMessageLabel(String feedbackMessage, Color messageColor){
        lbl_FeedbackMessage.setForeground(messageColor);
        lbl_FeedbackMessage.setText(feedbackMessage);
    }
    
    public void setCardNumberText(String text){
        txt_CardNumber.setText(text);
    }
    
    //Getters
    public String getMemberCardNumber(){
        return txt_CardNumber.getText();
    }
    
    //Methods
    public void showMessageBox(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public int showBillDialog(){
        int selectedChoice = JOptionPane.showConfirmDialog(null, "Would you like to bill ChocAn?", "Service Bill", JOptionPane.YES_NO_OPTION);
        return selectedChoice;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_SwipeMemberCard = new javax.swing.JLabel();
        btn_CardNumberSubmit = new javax.swing.JButton();
        txt_CardNumber = new javax.swing.JTextField();
        lbl_FeedbackMessage = new javax.swing.JLabel();
        btn_BackCardSwipe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Card Swipe");
        setResizable(false);

        lbl_SwipeMemberCard.setText("Please Swipe or Enter Member Card Number");

        btn_CardNumberSubmit.setText("Confirm Membership");

        lbl_FeedbackMessage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btn_BackCardSwipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/go-back-left-arrow.png"))); // NOI18N
        btn_BackCardSwipe.setBorderPainted(false);
        btn_BackCardSwipe.setContentAreaFilled(false);
        btn_BackCardSwipe.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_BackCardSwipe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_FeedbackMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_SwipeMemberCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CardNumberSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_CardNumber))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbl_SwipeMemberCard))
                    .addComponent(btn_BackCardSwipe))
                .addGap(18, 18, 18)
                .addComponent(txt_CardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CardNumberSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_FeedbackMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SwipeMemberCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwipeMemberCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwipeMemberCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwipeMemberCardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwipeMemberCardView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BackCardSwipe;
    private javax.swing.JButton btn_CardNumberSubmit;
    private javax.swing.JLabel lbl_FeedbackMessage;
    private javax.swing.JLabel lbl_SwipeMemberCard;
    private javax.swing.JTextField txt_CardNumber;
    // End of variables declaration//GEN-END:variables
}
