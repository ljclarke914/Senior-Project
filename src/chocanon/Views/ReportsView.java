/* 
    File: ReportsView.java
    Project: COSC-4360 Capstone Project Team #0
    University: McMurry University
    Course: COSC–4360 Spring 2021
    Instructor: Mr. Brozovic
    Programmer: Jacob Bremiller
    Created by: Jacob Bremiller
    Created: 2/23/2021
    Updated by: Jacob Bremiller
    Updated: 3/3/2021
    Compiler: Apache NetBeans IDE for Java SE
    Description: Contain buttons to different reports.
 */
package chocanon.Views;

import java.awt.event.ActionListener;


public class ReportsView extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public ReportsView() {
        initComponents();
    }

    //Setters
    public void setReportsBackButtonListener(ActionListener e){
        btn_ReportsBack.addActionListener(e);
    }
     public void setReportsSummaryReportButtonListener(ActionListener e){
        btn_GenerateSummaryReport.addActionListener(e);
    }
     public void setReportsProviderReportButtonListener(ActionListener e){
         btn_GenerateWeeklyProvider.addActionListener(e);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Reports = new javax.swing.JLabel();
        btn_ReportsBack = new javax.swing.JButton();
        btn_GenerateWeeklyMember = new javax.swing.JButton();
        btn_GenerateWeeklyProvider = new javax.swing.JButton();
        btn_GenerateSummaryReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reports");
        setResizable(false);

        lbl_Reports.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_Reports.setText("Reports");

        btn_ReportsBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/go-back-left-arrow.png"))); // NOI18N
        btn_ReportsBack.setBorderPainted(false);
        btn_ReportsBack.setContentAreaFilled(false);
        btn_ReportsBack.setFocusPainted(false);

        btn_GenerateWeeklyMember.setText("Generate Member Reports");

        btn_GenerateWeeklyProvider.setText("Generate Provider Reports");

        btn_GenerateSummaryReport.setText("Generate Summary Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ReportsBack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(lbl_Reports))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_GenerateWeeklyProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_GenerateWeeklyMember))
                        .addGap(32, 32, 32)
                        .addComponent(btn_GenerateSummaryReport)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ReportsBack)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Reports)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_GenerateSummaryReport, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_GenerateWeeklyMember, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_GenerateWeeklyProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
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
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GenerateSummaryReport;
    private javax.swing.JButton btn_GenerateWeeklyMember;
    private javax.swing.JButton btn_GenerateWeeklyProvider;
    private javax.swing.JButton btn_ReportsBack;
    private javax.swing.JLabel lbl_Reports;
    // End of variables declaration//GEN-END:variables
}
