
package pr4;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DB_con extends javax.swing.JFrame {

    public DB_con() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        F_Name = new javax.swing.JTextField();
        L_Name = new javax.swing.JTextField();
        EN_NO = new javax.swing.JTextField();
        Sem = new javax.swing.JTextField();
        M_NO = new javax.swing.JTextField();
        BTN_INS = new javax.swing.JButton();
        BTN_UPDATE = new javax.swing.JButton();
        BTN_DELETE = new javax.swing.JButton();
        BTN_SELECT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First_name");

        jLabel2.setText("Last_name");

        jLabel4.setText("Enrolment No");

        jLabel5.setText("Sem");

        jLabel6.setText("Mobile_no");

        F_Name.setName("JT1"); // NOI18N
        F_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_NameActionPerformed(evt);
            }
        });

        L_Name.setName("JT2"); // NOI18N

        EN_NO.setMaximumSize(new java.awt.Dimension(12, 12));
        EN_NO.setMinimumSize(new java.awt.Dimension(12, 12));
        EN_NO.setName("JT3"); // NOI18N

        Sem.setName("JT4"); // NOI18N

        M_NO.setMaximumSize(new java.awt.Dimension(10, 10));
        M_NO.setMinimumSize(new java.awt.Dimension(10, 10));
        M_NO.setName("JT5"); // NOI18N

        BTN_INS.setText("INSERT");
        BTN_INS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_INSActionPerformed(evt);
            }
        });

        BTN_UPDATE.setText("UPDATE");
        BTN_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UPDATEActionPerformed(evt);
            }
        });

        BTN_DELETE.setText("DELETE");
        BTN_DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DELETEActionPerformed(evt);
            }
        });

        BTN_SELECT.setText("SELECT");
        BTN_SELECT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SELECTActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(50, 50, 50)
                                .addComponent(Sem))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(F_Name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(8, 8, 8)
                                .addComponent(EN_NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(23, 23, 23)
                                .addComponent(M_NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(BTN_INS)
                        .addGap(34, 34, 34)
                        .addComponent(BTN_UPDATE)
                        .addGap(49, 49, 49)
                        .addComponent(BTN_DELETE)
                        .addGap(34, 34, 34)
                        .addComponent(BTN_SELECT)))
                .addContainerGap(499, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(F_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(L_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(EN_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(M_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_INS)
                    .addComponent(BTN_UPDATE)
                    .addComponent(BTN_DELETE)
                    .addComponent(BTN_SELECT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void F_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_NameActionPerformed
        
    }//GEN-LAST:event_F_NameActionPerformed

    private void BTN_INSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_INSActionPerformed
        try{
            try {
                Class.forName("com.mysql.jdbcDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DB_con.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            jTextArea1.setText("");
            String sql = "INSERT INTO Student"+"(F_Name, L_Name, EN_NO,Sem,M_NO)"+"VALUES (?,?,?,?,?)";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STU","root","");
            PreparedStatement pst = con.prepareStatement(sql);
            if(!"".equals(EN_NO.getText())&&!"".equals(F_Name.getText())&&!"".equals(L_Name.getText())&&!"".equals(Sem.getText())&&!"".equals(M_NO.getText())){
            pst.setString(1,F_Name.getText());
            pst.setString(2,L_Name.getText());
            if(EN_NO.getText().toString().length()==12){
            pst.setString(3,EN_NO.getText());
            pst.setString(4,Sem.getText());
            if(M_NO.getText().toString().length()==10){
            pst.setString(5,M_NO.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");}
            else{
                JOptionPane.showMessageDialog(null, "Enter 10 digit Mobile Number");
            }}
            else{
                JOptionPane.showMessageDialog(null, "Enter 12 digit Endrollment Number");
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter your Details");
            }
            jTextArea1.setText("");
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_BTN_INSActionPerformed

    private void BTN_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UPDATEActionPerformed
        try{
            jTextArea1.setText("");
        String sql = "UPDATE Student SET F_Name=?,L_Name=?,Sem=?,M_NO=? WHERE EN_NO=?";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STU","root","");
            if(!"".equals(EN_NO.getText())){
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,F_Name.getText());
            pst.setString(2,L_Name.getText());
            pst.setString(3,EN_NO.getText());
            pst.setString(4,Sem.getText());
            pst.setString(5,M_NO.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "updated successfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter your Endrollment");
            }
 

 jTextArea1.setText("");
 }
 catch(SQLException | HeadlessException ex){
 JOptionPane.showMessageDialog(null, ex);
 }
    }//GEN-LAST:event_BTN_UPDATEActionPerformed

    private void BTN_DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DELETEActionPerformed
        try{
            jTextArea1.setText("");
            String sql = "DELETE FROM Student WHERE EN_NO =?";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STU","root","");
            if(!"".equals(EN_NO.getText())){
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,EN_NO.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "delete successfully");}
            else{
                JOptionPane.showMessageDialog(null, "Enter your Endrolment");
            }
            jTextArea1.setText("");

}
catch(SQLException | HeadlessException ex){
JOptionPane.showMessageDialog(null, ex);
}
    }//GEN-LAST:event_BTN_DELETEActionPerformed

    private void BTN_SELECTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SELECTActionPerformed
        Connection con;
        try {
            jTextArea1.setText("");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STU","root","");
            String sql = "SELECT * FROM Student";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
            jTextArea1.append(rs.getString(1));
            jTextArea1.append("\t");
            jTextArea1.append(rs.getString(2));
            jTextArea1.append("\t");
            jTextArea1.append(rs.getString(3));
            jTextArea1.append("  \t");
            jTextArea1.append(rs.getString(4));
            jTextArea1.append("\t");
            jTextArea1.append(rs.getString(5));
            jTextArea1.append("\n");
            }
            JOptionPane.showMessageDialog(null, "Select successfully");
            
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);

}

    }//GEN-LAST:event_BTN_SELECTActionPerformed

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
            java.util.logging.Logger.getLogger(DB_con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DB_con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DB_con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DB_con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DB_con().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_DELETE;
    private javax.swing.JButton BTN_INS;
    private javax.swing.JButton BTN_SELECT;
    private javax.swing.JButton BTN_UPDATE;
    private javax.swing.JTextField EN_NO;
    private javax.swing.JTextField F_Name;
    private javax.swing.JTextField L_Name;
    private javax.swing.JTextField M_NO;
    private javax.swing.JTextField Sem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
