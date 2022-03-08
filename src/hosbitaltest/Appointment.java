/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hosbitaltest;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Appointment extends javax.swing.JFrame {

    /**
     * Creates new form Appointment
     */
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    public Appointment() {
        initComponents();
        Appointment_Table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD , 14));
        Appointment_Table.getTableHeader().setOpaque(false);
        Appointment_Table.getTableHeader().setBackground(new Color (0,0,0));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        D_id = new javax.swing.JTextField();
        Datetxt = new javax.swing.JTextField();
        timetxt = new javax.swing.JTextField();
        P_id = new javax.swing.JTextField();
        set_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Appointment_Table = new javax.swing.JTable();
        viewbtn = new javax.swing.JButton();
        p_idbtn = new javax.swing.JButton();
        d_idbtn = new javax.swing.JButton();
        srchd = new javax.swing.JTextField();
        srcpid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(146, 233, 251));

        jPanel1.setBackground(new java.awt.Color(146, 233, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Appointments\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 51))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Make an Appointment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Patient id");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Doctor id");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Time");

        D_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        D_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_idActionPerformed(evt);
            }
        });

        Datetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Datetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetxtActionPerformed(evt);
            }
        });

        P_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        P_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_idActionPerformed(evt);
            }
        });

        set_btn.setBackground(new java.awt.Color(0, 102, 102));
        set_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        set_btn.setForeground(new java.awt.Color(255, 255, 255));
        set_btn.setText("Set Appointment");
        set_btn.setBorderPainted(false);
        set_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(set_btn)
                .addGap(0, 74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(Datetxt)
                    .addComponent(timetxt)
                    .addComponent(D_id))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(set_btn)
                .addGap(15, 15, 15))
        );

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        Appointment_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Appointment_Table.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Appointment_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor_id", "Patient_id", "Date", "Time"
            }
        ));
        Appointment_Table.setGridColor(new java.awt.Color(0, 0, 0));
        Appointment_Table.setRowHeight(20);
        Appointment_Table.setSelectionBackground(new java.awt.Color(51, 0, 153));
        Appointment_Table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Appointment_Table.setShowGrid(true);
        jScrollPane1.setViewportView(Appointment_Table);

        viewbtn.setBackground(new java.awt.Color(0, 102, 102));
        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View Appointments");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        p_idbtn.setBackground(new java.awt.Color(0, 102, 102));
        p_idbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_idbtn.setForeground(new java.awt.Color(255, 255, 255));
        p_idbtn.setText("Search Patient ID");
        p_idbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idbtnActionPerformed(evt);
            }
        });

        d_idbtn.setBackground(new java.awt.Color(0, 102, 102));
        d_idbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        d_idbtn.setForeground(new java.awt.Color(255, 255, 255));
        d_idbtn.setText("Search Doctor ID");
        d_idbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_idbtnActionPerformed(evt);
            }
        });

        srchd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        srchd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchdActionPerformed(evt);
            }
        });

        srcpid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        srcpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcpidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p_idbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(srcpid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(d_idbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(srchd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_idbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(srchd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_idbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srcpid))
                .addGap(18, 18, 18)
                .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void set_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_btnActionPerformed
       

            if (P_id.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient id","Error", JOptionPane.ERROR_MESSAGE);
                return;
 
            }
            if (D_id.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;
 
            }
           
            if (Datetxt.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (timetxt.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter time.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
          
            String pid=P_id.getText();
            String did= D_id.getText();
            String date=Datetxt.getText();
            String time=timetxt.getText();
            Appointmentclass app=new Appointmentclass();
            app.make_app(Integer.parseInt(P_id.getText()), did, date, time);
           // set_btn.setEnabled(false);
 
        
    }//GEN-LAST:event_set_btnActionPerformed

    private void D_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_idActionPerformed

    private void P_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_idActionPerformed

    private void timetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timetxtActionPerformed

    private void d_idbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_idbtnActionPerformed
    //to clear table before search
        DefaultTableModel model = (DefaultTableModel) Appointment_Table.getModel();
        model.setRowCount(0);
        String idD=srchd.getText();
        Appointmentclass app=new Appointmentclass();
        
                DefaultTableModel tblmodel=(DefaultTableModel)Appointment_Table.getModel();
                tblmodel.addRow(app.searchid_doctor(idD));
                //JOptionPane.showMessageDialog( this, "DOCTOR ID already exists","Error", JOptionPane.ERROR_MESSAGE);
                //txtID.setText("");
                //txtID.requestDefaultFocus();   
    }//GEN-LAST:event_d_idbtnActionPerformed

    private void srchdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srchdActionPerformed

    private void srcpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcpidActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        //to clear table before search
        DefaultTableModel model = (DefaultTableModel) Appointment_Table.getModel();
        model.setRowCount(0);
        
         try{String sql="Select * from APP.APPOINTMENTS";
            con=connect.connectdb();
            pst=con.prepareStatement(sql);
            rs= pst.executeQuery();
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            while(rs.next()){
                String DoctorID=String.valueOf(rs.getString("ID_DOCTOR"));
                String PatientID=String.valueOf(rs.getInt("ID_PATIENT"));
                String DATE=String.valueOf(rs.getString("DATE"));
                String TIME=String.valueOf(rs.getString("TIME"));
                
                String tbdata[]={DoctorID,PatientID,DATE,TIME};
                DefaultTableModel tblmodel=(DefaultTableModel)Appointment_Table.getModel();
                tblmodel.addRow(tbdata);
            }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }       
          
    }//GEN-LAST:event_viewbtnActionPerformed

    private void p_idbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idbtnActionPerformed
          //to clear table before search
        DefaultTableModel model = (DefaultTableModel) Appointment_Table.getModel();
        model.setRowCount(0);

            if (srcpid.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient id","Error", JOptionPane.ERROR_MESSAGE);
                return;}
            int idp=Integer.parseInt(srcpid.getText());
            Appointmentclass app=new Appointmentclass();
        
                DefaultTableModel tblmodel=(DefaultTableModel)Appointment_Table.getModel();
                tblmodel.addRow(app.searchid_Patient(idp));
    }//GEN-LAST:event_p_idbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Appointment_Table;
    private javax.swing.JTextField D_id;
    private javax.swing.JTextField Datetxt;
    private javax.swing.JTextField P_id;
    private javax.swing.JButton d_idbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton p_idbtn;
    private javax.swing.JButton set_btn;
    private javax.swing.JTextField srchd;
    private javax.swing.JTextField srcpid;
    private javax.swing.JTextField timetxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
