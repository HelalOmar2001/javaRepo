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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Examine extends javax.swing.JFrame {

    /**
     * Creates new form Appointment
     */
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    public Examine() {
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
        Drugtxt = new javax.swing.JTextField();
        statetxt = new javax.swing.JTextField();
        P_id = new javax.swing.JTextField();
        save_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Appointment_Table = new javax.swing.JTable();
        viewbtn = new javax.swing.JButton();
        p_idbtn = new javax.swing.JButton();
        d_idbtn = new javax.swing.JButton();
        srchd = new javax.swing.JTextField();
        srcpid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        statearea = new javax.swing.JTextArea();
        Showbtn = new javax.swing.JButton();
        stateid1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(146, 233, 251));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Examination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Examination Details ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Patient id");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Docotor id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Medicines");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("State");

        D_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_idActionPerformed(evt);
            }
        });

        Drugtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Drugtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugtxtActionPerformed(evt);
            }
        });

        statetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        statetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statetxtActionPerformed(evt);
            }
        });

        P_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_idActionPerformed(evt);
            }
        });

        save_btn.setBackground(new java.awt.Color(0, 102, 102));
        save_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statetxt)
                            .addComponent(Drugtxt))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Drugtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Appointment_Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Appointment_Table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                {null, null, null, null}
            },
            new String [] {
                "Doctor_id", "Patient_id", "Medicines", "State"
            }
        ));
        Appointment_Table.setRowHeight(20);
        Appointment_Table.setShowGrid(true);
        jScrollPane1.setViewportView(Appointment_Table);

        viewbtn.setBackground(new java.awt.Color(0, 102, 102));
        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View All");
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

        srchd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        srchd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchdActionPerformed(evt);
            }
        });

        srcpid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        srcpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcpidActionPerformed(evt);
            }
        });

        statearea.setColumns(20);
        statearea.setRows(5);
        statearea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "State Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        jScrollPane2.setViewportView(statearea);

        Showbtn.setBackground(new java.awt.Color(0, 102, 102));
        Showbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Showbtn.setForeground(new java.awt.Color(255, 255, 255));
        Showbtn.setText("Show State of Patient");
        Showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowbtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_idbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(d_idbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(srchd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(srcpid))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Showbtn)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(stateid1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_idbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(srcpid))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateid1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(d_idbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srchd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Showbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(25, 25, 25)
                .addComponent(viewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("EXAMINATION ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        
            
            if (P_id.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient id","Error", JOptionPane.ERROR_MESSAGE);
                return;
 
            }
            if (D_id.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;
 
            }
           
            if (Drugtxt.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (statetxt.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter time.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
          try{int pid= Integer.parseInt(P_id.getText());}
        catch (Exception e) {
        JOptionPane.showMessageDialog( this, "Your entry was invalid, please enter ID number","Error", JOptionPane.ERROR_MESSAGE);}
            
          Examineclass exm= new Examineclass();
          exm.Save_examine(Integer.parseInt(P_id.getText()),D_id.getText(),Drugtxt.getText(),statetxt.getText());

           // save_btn.setEnabled(false);
 
    }//GEN-LAST:event_save_btnActionPerformed

    private void D_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_idActionPerformed

    private void P_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_idActionPerformed

    private void statetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statetxtActionPerformed

    private void d_idbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_idbtnActionPerformed
    //to clear table before search
        DefaultTableModel model = (DefaultTableModel) Appointment_Table.getModel();
        model.setRowCount(0);
        
        String idD=srchd.getText();
        Examineclass exm= new Examineclass();
        
                DefaultTableModel tblmodel=(DefaultTableModel)Appointment_Table.getModel();
                tblmodel.addRow(exm.searchid_doctor(idD));
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
        
        try{String sql="select * from APP.EXAMINE";
            con=connect.connectdb();
            pst=con.prepareStatement(sql);
            rs= pst.executeQuery();
            
            while(rs.next()){
                String DoctorID=String.valueOf(rs.getString("DOCTOR_ID"));
                String PatientID=String.valueOf(rs.getInt("PATIENT_ID"));
                String drugs=String.valueOf(rs.getString("DRUGS"));
                String state=String.valueOf(rs.getString("STATE"));
                
                String tbdata[]={DoctorID,PatientID,drugs,state};
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
             int idp=0;
              try{idp= Integer.parseInt(srcpid.getText());}
        catch (Exception e) {
        JOptionPane.showMessageDialog( this, "Your entry was invalid, please enter ID number","Error", JOptionPane.ERROR_MESSAGE);}
             Examineclass exm= new Examineclass();
        
                DefaultTableModel tblmodel=(DefaultTableModel)Appointment_Table.getModel();
                tblmodel.addRow(exm.searchid_Patient(idp));
    }//GEN-LAST:event_p_idbtnActionPerformed

    private void ShowbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowbtnActionPerformed
      statearea.setText("");

            if (stateid1.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter PATIENT ID","Error", JOptionPane.ERROR_MESSAGE);
                return;}
            int stateid=Integer.parseInt(stateid1.getText());
            Examineclass exm= new Examineclass();
            statearea.append(exm.show_state(stateid));                             
        
    }//GEN-LAST:event_ShowbtnActionPerformed

    private void DrugtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugtxtActionPerformed

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
            java.util.logging.Logger.getLogger(Examine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Appointment_Table;
    private javax.swing.JTextField D_id;
    private javax.swing.JTextField Drugtxt;
    private javax.swing.JTextField P_id;
    private javax.swing.JButton Showbtn;
    private javax.swing.JButton d_idbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton p_idbtn;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField srchd;
    private javax.swing.JTextField srcpid;
    private javax.swing.JTextArea statearea;
    private javax.swing.JTextField stateid1;
    private javax.swing.JTextField statetxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
