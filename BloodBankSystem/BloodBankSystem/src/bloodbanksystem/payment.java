/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbanksystem;

import java.sql.Types;
import com.mysql.cj.jdbc.CallableStatement;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class payment extends javax.swing.JFrame {

    /**
     * Creates new form payment
     */
    public payment() {
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

        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfrid = new javax.swing.JTextField();
        tfbloodgroup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfunits = new javax.swing.JTextField();
        tfamount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfbill = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\BloodBankSystem\\src\\bloodbanksystem\\icons\\menu.gif")); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(180, 0, 1010, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, 100, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Recipient ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount to be deposited:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));
        getContentPane().add(tfrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 128, 390, -1));
        getContentPane().add(tfbloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 270, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Receipt Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Units Purchased:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Group:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));
        getContentPane().add(tfunits, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 270, 30));
        getContentPane().add(tfamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 270, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        jButton2.setText("Generate Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill No:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));
        getContentPane().add(tfbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 270, 30));
        getContentPane().add(tfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 270, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\BloodBankSystem\\src\\bloodbanksystem\\icons\\menu.gif")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
	mainp su = new mainp();
	su.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int rid = parseInt(tfrid.getText());
        int units = 0;
        int rate = 0;
        String bloodgroup = null;
        int amount = 0;
        
        try
            {
                Conn con = new Conn();
                                 
                                ResultSet rs = con.s.executeQuery("select * from recipient where id = '"+rid+"'");
                                if(rs.next())
                                {
                                bloodgroup = rs.getString(6);
                                units = rs.getInt(5);
                                }
                                
                                ResultSet rs2 = con.s.executeQuery("select * from bloodRate where bloodgroup = '"+bloodgroup+"'");
                                if(rs2.next())
                                {
                                rate = rs2.getInt(2);
                                }
                                
//                int amount = units * rate;  // Calculate the amount as an integer
//
//                    tfamount.setText(String.valueOf(amount));  
// Call the stored procedure to calculate the amount
            String calculateAmountProcedure = "{CALL CalculateAmount(?, ?, ?)}";
            try (CallableStatement cs = (CallableStatement) con.c.prepareCall(calculateAmountProcedure)) {
                cs.setInt(1, units);
                cs.setInt(2, rate);
                cs.registerOutParameter(3, Types.INTEGER);
                cs.execute();
                amount = cs.getInt(3);

                tfamount.setText(String.valueOf(amount));}
            catch(Exception e)
            {
                System.out.println(e);
            }

                        
                String sql = "insert into bill(Rid, amount) values(?, ?)";

		PreparedStatement st = con.c.prepareStatement(sql);
                                
		st.setInt(1, rid);  // Use setInt for integer values
                 st.setInt(2, amount); 
                 
                 ResultSet rs3 = con.s.executeQuery("select * from recipient where id = '"+rid+"'");
                    if(rs3.next()){
                        tfbloodgroup.setText(rs3.getString(6));  
                        tfunits.setText(rs3.getString(5));
                        tfname.setText(rs3.getString(2));
                    }
                 
                 int i = st.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(null, "Bill Made Successfully.");
           
        }
        
        ResultSet rs9;
                rs9 = con.s.executeQuery("select * from bill where amount = '"+amount+"'");
                    if(rs9.next()){
                        tfbill.setText(String.valueOf(rs9.getInt(1)));
                    }
                              
        }catch(Exception e){
                System.out.println(e);
 }
//        int rid = parseInt(tfrid.getText());
//        int units = 0;
//        int rate = 0;
//        String bloodgroup = null;
//        
//        try
//            {
//                Conn con = new Conn();
//                                 
//                                ResultSet rs = con.s.executeQuery("select * from recipient where id = '"+rid+"'");
//                                if(rs.next())
//                                {
//                                bloodgroup = rs.getString(6);
//                                units = rs.getInt(5);
//                                }
//                                
//                                ResultSet rs2 = con.s.executeQuery("select * from bloodRate where bloodgroup = '"+bloodgroup+"'");
//                                if(rs2.next())
//                                {
//                                rate = rs2.getInt(2);
//                                }
//                                
//                int amount = units * rate;  // Calculate the amount as an integer
//
//                    tfamount.setText(String.valueOf(amount));  
//
//                        
//                String sql = "insert into bill(Rid, amount) values(?, ?)";
//		PreparedStatement st = con.c.prepareStatement(sql);
//                                
//		st.setInt(1, rid);  // Use setInt for integer values
//                 st.setInt(2, amount); 
//                 
//                 ResultSet rs3 = con.s.executeQuery("select * from recipient where id = '"+rid+"'");
//                    if(rs3.next()){
//                        tfbloodgroup.setText(rs3.getString(6));  
//                        tfunits.setText(rs3.getString(5));
//                    }
//                 
//                 int i = st.executeUpdate();
//        if (i > 0) {
//            JOptionPane.showMessageDialog(null, "Bill Made Successfully.");
//           
//        }
//        
//        ResultSet rs9;
//                rs9 = con.s.executeQuery("select * from bill where amount = '"+amount+"'");
//                    if(rs9.next()){
//                        tfbill.setText(String.valueOf(rs9.getInt(1)));
//                    }
//                              
//        }catch(Exception e){
//                System.out.println(e);
// }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfamount;
    private javax.swing.JTextField tfbill;
    private javax.swing.JTextField tfbloodgroup;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfrid;
    private javax.swing.JTextField tfunits;
    // End of variables declaration//GEN-END:variables
}
