/* 
    File: EditAddProviderView.java
    Project: COSC-4360 Capstone Project Team #0
    University: McMurry University
    Course: COSC–4360 Spring 2021
    Instructor: Mr. Brozovic
    Programmer: Jacob Bremiller
    Created by: Jacob Bremiller
    Created: 3/6/2021
    Updated by: Jacob Bremiller
    Updated: 3/6/2021
    Compiler: Apache NetBeans IDE for Java SE
    Description: Provides the user a way to edit and add new providers
 */
package chocanon.Views;

import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jakeb
 */
public class EditAddProviderView extends javax.swing.JFrame {

    /**
     * Creates new form NewProviderView
     */
    public EditAddProviderView() {
        initComponents();
    }
    //Setters
    public void setEditAddProviderSaveListener(ActionListener e){
        btn_Save.addActionListener(e);
    }
    public void setEditAddProviderCancelListener(ActionListener e){
        btn_Cancel.addActionListener(e);
    }
    public void setProviderFirstName(String firstName){
        txt_FirstName.setText(firstName);
    }
    public void setProviderLastName(String lastName){
        txt_LastName.setText(lastName);
    }
    public void setProviderStreetAddress(String streetAddress){
        txt_StreetAddress.setText(streetAddress);
    }
    public void setProviderCity(String city){
        txt_City.setText(city);
    }
    public void setProviderZipCode(String zipCode){
        txt_ZipCode.setText(zipCode);
    }
    public void setProviderEmailAddress(String emailAddress){
        txt_EmailAddress.setText(emailAddress);
    }
    public void setProviderNumber(String providerNumber){
        txt_ProviderNumber.setText(providerNumber);
    }
    public void setProviderState(String state){
        cbx_State.setSelectedItem(state);
    }
    public void setProviderType(String providerType){
        cbx_Type.setSelectedItem(providerType);
    }
    
    //Combo Box Updates
    public void addProviderType(String providerType){
        cbx_Type.addItem(providerType);
    }
    public void clearProviderTypes(){
        cbx_Type.removeAllItems();
    }
    
    
    //Getters
    public String getProviderFirstName(){
        return txt_FirstName.getText();
    }
    public String getProviderLastName(){
        return txt_LastName.getText();
    }
    public String getProviderStreetAddress(){
        return txt_StreetAddress.getText();
    }
    public String getProviderCity(){
        return txt_City.getText();
    }
    public String getProviderZipCode(){
        return txt_ZipCode.getText();
    }
    public String getProviderEmailAddress(){
        return txt_EmailAddress.getText();
    }
    public String getProviderNumber(){
        return txt_ProviderNumber.getText();
    }
    public String getProviderState(){
        return cbx_State.getSelectedItem().toString();
    }
    public String getProviderType(){
        return cbx_Type.getSelectedItem().toString();
    }
    
    //Methods
    public void showMessageBox(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    public void resetForm(){
        txt_FirstName.setText("");
        txt_LastName.setText("");
        txt_StreetAddress.setText("");
        txt_City.setText("");
        txt_ZipCode.setText("");
        txt_EmailAddress.setText("");
        txt_ProviderNumber.setText("");
        cbx_State.setSelectedItem("");
        cbx_Type.setSelectedItem(""); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_FirstName = new javax.swing.JLabel();
        lbl_LastName = new javax.swing.JLabel();
        lbl_StreetAddress = new javax.swing.JLabel();
        lbl_City = new javax.swing.JLabel();
        lbl_ZipCode = new javax.swing.JLabel();
        lbl_EmailAdress = new javax.swing.JLabel();
        lbl_ProviderNumber = new javax.swing.JLabel();
        lbl_State = new javax.swing.JLabel();
        lbl_ProviderType = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        txt_LastName = new javax.swing.JTextField();
        txt_StreetAddress = new javax.swing.JTextField();
        txt_City = new javax.swing.JTextField();
        txt_ZipCode = new javax.swing.JTextField();
        txt_EmailAddress = new javax.swing.JTextField();
        txt_ProviderNumber = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        cbx_State = new javax.swing.JComboBox(new String[]{
            "","Alabama", "Alaska", "Arizona", "Arkansas", "California",
            "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
            "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
            "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
            "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
            "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
            "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
            "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
            "Wisconsin", "Wyoming"
        });
        cbx_Type = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_FirstName.setText("First Name");

        lbl_LastName.setText("Last Name");

        lbl_StreetAddress.setText("Street Address");

        lbl_City.setText("City");

        lbl_ZipCode.setText("Zip Code");

        lbl_EmailAdress.setText("Email Address");

        lbl_ProviderNumber.setText("Provider Number");

        lbl_State.setText("State");

        lbl_ProviderType.setText("Provider Type");

        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/save.png"))); // NOI18N
        btn_Save.setText("Save");

        btn_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete.png"))); // NOI18N
        btn_Cancel.setText("Cancel");

        cbx_State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_StateActionPerformed(evt);
            }
        });

        cbx_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_TypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_ProviderNumber)
                            .addComponent(lbl_ZipCode)
                            .addComponent(lbl_City)
                            .addComponent(lbl_StreetAddress)
                            .addComponent(lbl_LastName)
                            .addComponent(lbl_FirstName)
                            .addComponent(lbl_State)
                            .addComponent(lbl_EmailAdress)
                            .addComponent(lbl_ProviderType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_LastName)
                            .addComponent(txt_StreetAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ProviderNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_City, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_EmailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ZipCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_State, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FirstName)
                    .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_LastName)
                    .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StreetAddress)
                    .addComponent(txt_StreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_City)
                    .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ZipCode)
                    .addComponent(txt_ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_State)
                    .addComponent(cbx_State, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProviderNumber)
                    .addComponent(txt_ProviderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_EmailAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProviderType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txt_LastName.getAccessibleContext().setAccessibleName("");
        txt_StreetAddress.getAccessibleContext().setAccessibleName("");
        txt_City.getAccessibleContext().setAccessibleName("");
        txt_ZipCode.getAccessibleContext().setAccessibleName("");
        txt_EmailAddress.getAccessibleContext().setAccessibleName("");
        txt_ProviderNumber.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_StateActionPerformed

    private void cbx_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_TypeActionPerformed

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
            java.util.logging.Logger.getLogger(EditAddProviderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAddProviderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAddProviderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAddProviderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAddProviderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.JComboBox<String> cbx_State;
    private javax.swing.JComboBox<String> cbx_Type;
    private javax.swing.JLabel lbl_City;
    private javax.swing.JLabel lbl_EmailAdress;
    private javax.swing.JLabel lbl_FirstName;
    private javax.swing.JLabel lbl_LastName;
    private javax.swing.JLabel lbl_ProviderNumber;
    private javax.swing.JLabel lbl_ProviderType;
    private javax.swing.JLabel lbl_State;
    private javax.swing.JLabel lbl_StreetAddress;
    private javax.swing.JLabel lbl_ZipCode;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_EmailAddress;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_LastName;
    private javax.swing.JTextField txt_ProviderNumber;
    private javax.swing.JTextField txt_StreetAddress;
    private javax.swing.JTextField txt_ZipCode;
    // End of variables declaration//GEN-END:variables
}