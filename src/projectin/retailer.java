/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectin;
import connecttoDB1.connectdb1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Birjot Singh
 */
public class retailer extends javax.swing.JFrame {

    /**
     * Creates new form retailer
     */
    public retailer() {
        initComponents();
         setSize(850,700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Retailer's Order");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 130, 140, 25);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Colour:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(400, 260, 74, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Item Required:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(400, 210, 120, 17);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shirt", "T-Shirt", "Jean" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(612, 214, 198, 22);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Blue", "Grey" }));
        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(612, 254, 198, 22);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ID:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(400, 180, 22, 17);

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton9.setText("SUBMIT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(400, 390, 89, 27);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Price per unit:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(400, 350, 96, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Quantity:  ");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(400, 300, 73, 17);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(612, 174, 198, 22);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(612, 347, 198, 22);

        jButton10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton10.setText("NEW");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(400, 450, 82, 27);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(612, 299, 198, 22);

        jPanel1.setBackground(new java.awt.Color(69, 15, 219));

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton2.setText("RETAILER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setText("SUPPLIER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton3.setText("CUSTOMER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton4.setText("BILLING");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addGap(79, 79, 79)
                .addComponent(jButton3)
                .addGap(72, 72, 72)
                .addComponent(jButton4)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 107, 254, 540);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\gurpr\\Desktop\\www.png")); // NOI18N
        jLabel2.setText("LOGO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\gurpr\\Desktop\\111.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 790, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
        switch (jComboBox8.getSelectedItem().toString()) {
            case "Shirt":
                jTextField8.setText("450");
                break;
            case "T-Shirt":
                jTextField8.setText("400");
                break;
            default:
                jTextField8.setText("500");
                break;
        
        }
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         rnew rn=new rnew();
        this.setVisible(false);
        rn.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String id=jTextField7.getText().trim();
        String item=jComboBox8.getSelectedItem().toString();
         String colour=jComboBox9.getSelectedItem().toString();
         String quantity=jTextField1.getText().trim();
         String price=jTextField8.getText().trim();
         
         if(quantity.equals("") || price.equals("") || id.equals("") || item.equals("") || colour.equals(""))
        {
         JOptionPane.showMessageDialog(getRootPane(), "Enter All Values");
        }
        else
        {     int q=Integer.parseInt(jTextField1.getText());
             int p=Integer.parseInt(jTextField8.getText());
             int total=p*q;
            try{
            
                Connection conn=connectdb1.getConnection();
                String query1="insert into retailer values(?,?,?,?,?,?)";
            PreparedStatement ps1=conn.prepareStatement(query1);
            ps1.setString(1,id);
            ps1.setString(2,item);
            ps1.setString(3,colour);
            ps1.setString(4,quantity);
            ps1.setString(5,price);
            ps1.setString(6,""+total);
            ps1.executeUpdate();
          JOptionPane.showMessageDialog(getRootPane(), "Successfully Registered");  
           
            }
              catch(Exception e){
                System.out.println(e);
           JOptionPane.showMessageDialog(getRootPane(), "Error");
           
                
            }
                    
        }
        
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        rlogin rl=new rlogin();
        this.setVisible(false);
        rl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        slogin sl=new slogin();
        this.setVisible(false);
        sl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        customer c=new customer();

        this.setVisible(false);
        c.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        bill bl=new bill();
        this.setVisible(false);
        bl.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
                                 

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
            java.util.logging.Logger.getLogger(retailer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(retailer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(retailer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(retailer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new retailer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
