/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocanon;

import javax.swing.JOptionPane;

/**
 *
 * @author treyfambrough
 */
public class addNewMember extends javax.swing.JFrame {

    /**
     * Creates new form addNewMember
     */
    public addNewMember() {
        initComponents();
    }

    String memFirstName = "";
    String memLastName = "";
    String memDOB = "";
    String memEmail = "";
    String memStreetAddress = "";
    String memCity = "";
    String memState = "";
    String memZip = "";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_Back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_addMem = new javax.swing.JButton();
        label_Name = new javax.swing.JLabel();
        txt_memFirstName = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        txt_memEmail = new javax.swing.JTextField();
        label_DOB = new javax.swing.JLabel();
        label_Address = new javax.swing.JLabel();
        txt_memStreetAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_memLastName = new javax.swing.JTextField();
        label_Address1 = new javax.swing.JLabel();
        label_Address2 = new javax.swing.JLabel();
        label_Address3 = new javax.swing.JLabel();
        selector_State = new javax.swing.JComboBox<>();
        txt_City = new javax.swing.JTextField();
        txt_dateOfBirth = new javax.swing.JTextField();
        txt_zipCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Member");
        setBackground(new java.awt.Color(200, 200, 200));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btn_addMem.setText("Add Member");
        btn_addMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMemActionPerformed(evt);
            }
        });

        label_Name.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_Name.setText("First Name:");

        txt_memFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_memFirstNameActionPerformed(evt);
            }
        });

        label_email.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_email.setText("Email:");

        label_DOB.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_DOB.setText("Date Of Birth:");

        label_Address.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_Address.setText("Sreet Address:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        label_Address1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_Address1.setText("City:");

        label_Address2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_Address2.setText("State:");

        label_Address3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_Address3.setText("Zip Code:");

        selector_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "IllinoisIndiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "MontanaNebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "PennsylvaniaRhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        txt_zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_zipCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btn_addMem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_memEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_memLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_memFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Address)
                            .addComponent(label_Address2)
                            .addComponent(label_Address3)
                            .addComponent(label_Address1)
                            .addComponent(label_DOB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_memStreetAddress)
                            .addComponent(selector_State, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_City)
                            .addComponent(txt_dateOfBirth)
                            .addComponent(txt_zipCode))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_memFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_memLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_memEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_DOB)
                    .addComponent(txt_dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_memStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Address))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Address1)
                    .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Address2)
                    .addComponent(selector_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Address3)
                    .addComponent(txt_zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btn_addMem)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Add New Member");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_Back)
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Back)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_memFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_memFirstNameActionPerformed

    }//GEN-LAST:event_txt_memFirstNameActionPerformed

    
    private void btn_addMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMemActionPerformed
        memFirstName = txt_memFirstName.getText();
        memLastName = txt_memLastName.getText();
        memDOB = txt_dateOfBirth.getText();
        memEmail = txt_memEmail.getText();
        String memAddress = txt_memStreetAddress.getText() + " " + txt_City.getText() + ", " + selector_State.getSelectedItem() + " " + txt_zipCode.getText();
        if(verifyFields()){
            this.setVisible(false);
            new memberAdded(memFirstName, memLastName, memDOB, memEmail, memAddress).setVisible(true);
        }
    }//GEN-LAST:event_btn_addMemActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.setVisible(false);
        //new win_main().setVisible(true);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void txt_zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_zipCodeActionPerformed

    //Function to Verify feilds
    public boolean verifyFields(){
        memFirstName = txt_memFirstName.getText();
        memLastName = txt_memLastName.getText();
        memDOB = txt_dateOfBirth.getText();
        memEmail = txt_memEmail.getText();
        memStreetAddress = txt_memStreetAddress.getText();
        memCity = txt_City.getText();
        memZip = txt_zipCode.getText();
        
        if(memFirstName.trim().equals("") || memLastName.trim().equals("") || memDOB.trim().equals("") || memEmail.trim().equals("") || memStreetAddress.trim().equals("")
               || memCity.trim().equals("") || memZip.trim().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;
        }
        else
            return true;
    }
    
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
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_addMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_Address;
    private javax.swing.JLabel label_Address1;
    private javax.swing.JLabel label_Address2;
    private javax.swing.JLabel label_Address3;
    private javax.swing.JLabel label_DOB;
    private javax.swing.JLabel label_Name;
    private javax.swing.JLabel label_email;
    private javax.swing.JComboBox<String> selector_State;
    private javax.swing.JTextField txt_City;
    private javax.swing.JTextField txt_dateOfBirth;
    private javax.swing.JTextField txt_memEmail;
    private javax.swing.JTextField txt_memFirstName;
    private javax.swing.JTextField txt_memLastName;
    private javax.swing.JTextField txt_memStreetAddress;
    private javax.swing.JTextField txt_zipCode;
    // End of variables declaration//GEN-END:variables
}
