/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Brian
 */
public class AddEmployee extends javax.swing.JFrame {
 JDBC db=new JDBC();
    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();
        setLocationRelativeTo(null);
        
        for(int i = 1900; i<2014; i++){
            BirthYear.addItem(i);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BirthDay = new javax.swing.JComboBox();
        BirthMonth = new javax.swing.JComboBox();
        BirthYear = new javax.swing.JComboBox();
        NameText = new javax.swing.JTextField();
        IdText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        AddressText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AddEmp = new javax.swing.JButton();
        SexText = new javax.swing.JComboBox();
        DepartmentText = new javax.swing.JComboBox();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Employee");
        setResizable(false);

        jLabel1.setText("FULLNAME");

        jLabel2.setText("ID");

        jLabel3.setText("BIRTHDAY");

        jLabel6.setText("PHONE");

        jLabel7.setText("ADDRESS");

        jLabel8.setText("DEPARTMENT");

        BirthDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DD", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "22", "26", "27", "28", "29", "30", "31", " " }));

        BirthMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MM", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        BirthYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YYYY" }));

        jLabel9.setText("SEX");

        AddEmp.setText("Add Employee");
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        SexText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        DepartmentText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT", "IS", "CS" }));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PhoneText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AddressText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DepartmentText, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SexText, javax.swing.GroupLayout.Alignment.LEADING, 0, 90, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AddEmp)
                            .addGap(18, 18, 18)
                            .addComponent(Back)
                            .addGap(34, 34, 34))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameText)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PhoneText)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddressText)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartmentText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmp)
                    .addComponent(Back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
    /*  try{
        String url = "jdbc:derby://localhost:1527/EmployeeTest";
      //String drivername = "COM.ibm.db2os390.sqlj.jdbc.DB2SQLJDriver";       
      //String url = "jdbc:db2://LocalHost:50000/JAVA";   
        String username = "Brian";
        String password = "pass";
        Connection con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();
        
       // String Query1 = "create table EMPLOYEE(ID varchar(50) NOT NULL,NAME varchar(50),BIRTHDAY varchar(2),BIRTHMONTH varchar(2),BRITHYEAR varchar(4),PHONE varchar(50),ADDRESS varchar(50))";
        String Query = "INSERT INTO EMPLOYEE (ID, NAME, BIRTHDAY, BIRTHMONTH, BIRTHYEAR, PHONE, ADDRESS, SEX, DEPARTMENT) VALUES "
                + "('"+IdText.getText()+"' , '"+NameText.getText()+"' , '"+BirthDay.getSelectedItem()+"' , '"+BirthMonth.getSelectedItem()+"' , '"+BirthYear.getSelectedItem()+"' ,"
                + " '"+PhoneText.getText()+"' , '"+AddressText.getText()+"' , '"+SexText.getSelectedItem()+"' , '"+DepartmentText.getSelectedItem()+"' )";
       
        stmt.execute(Query);
      //  stmt.execute(Query1);
   */
          db.putData("INSERT INTO EMPLOYEE (ID, NAME, BIRTHDAY, BIRTHMONTH, BIRTHYEAR, PHONE, ADDRESS, SEX, DEPARTMENT) VALUES "
                + "('"+IdText.getText()+"' , '"+NameText.getText()+"' , '"+BirthDay.getSelectedItem()+"' , '"+BirthMonth.getSelectedItem()+"' , '"+BirthYear.getSelectedItem()+"' ,"
                + " '"+PhoneText.getText()+"' , '"+AddressText.getText()+"' , '"+SexText.getSelectedItem()+"' , '"+DepartmentText.getSelectedItem()+"' )"
       );
                  
       JOptionPane.showMessageDialog(null, "Employee added to database");
        NameText.setText(null);
        BirthDay.setSelectedItem("DD");
        BirthMonth.setSelectedItem("MM");
        BirthYear.setSelectedItem("YYYY");
        IdText.setText(null);
        PhoneText.setText(null);
        AddressText.setText(null);
        SexText.setSelectedItem("Male");
        DepartmentText.setSelectedIndex(0);
        
      }
      
      /*
         catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.toString());
    } 
    }//GEN-LAST:event_AddEmpActionPerformed
    */
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       Main m = new Main();
       m.setVisible(true);
       dispose();
    }//GEN-LAST:event_BackActionPerformed
   


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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JTextField AddressText;
    private javax.swing.JButton Back;
    private javax.swing.JComboBox BirthDay;
    private javax.swing.JComboBox BirthMonth;
    private javax.swing.JComboBox BirthYear;
    private javax.swing.JComboBox DepartmentText;
    private javax.swing.JTextField IdText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JComboBox SexText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
