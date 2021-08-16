
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kirishanthy
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null, rs2 = null;
    public StudentRegistration() {
       
            initComponents();
            con = DataBase.database.ConnectDb();   
            Object columns[] = {"StudentName","FatherName","Phone","DateOfBirth","Gender","School","Class","AddmissinDate","NICNo","Mail","Address"};        
    defaultTableModel.setColumnIdentifiers(columns);
    jTable1.setModel(defaultTableModel);
    jTable1.setDefaultEditor(Object.class, null);
  
    loadData();
    }
    
    public void loadData()
    {
    String sql = "SELECT `studentname`, `fathername`, `phone`, `dateofbirth`, `gender`, `school`, `class`, `admissiondate`, `nicno`, `mail`, `address` FROM `student`"; 
    try {
    pst = con.prepareStatement(sql);
    rs = pst.executeQuery();
    Object columnData[] = new Object[11];
    while(rs.next()) {
    
    
    columnData[0] = rs.getString("studentname");
    columnData[1] = rs.getString("fathername");
    columnData[2] = rs.getString("Phone");
    columnData[3] = rs.getString("dateofbirth");
    columnData[4] = rs.getString("gender");
    columnData[5] = rs.getString("school");
    columnData[6] = rs.getString("class");
    columnData[7] = rs.getString("admissiondate");
    columnData[8] = rs.getString("nicno");
    columnData[9] = rs.getString("mail");
    columnData[10] = rs.getString("address");
     defaultTableModel.addRow(columnData);
    
    }
    
    
    }   catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            txtsname.setText(null);
            txtfname.setText(null);
            txtpnum.setText(null);
            txtdob.setDate(null);
            cbogender.setSelectedIndex(-1);
            cboschool.setSelectedIndex(-1);
            cboclass.setSelectedIndex(-1);
            txtadmission.setDate(null);
            txtnic.setText(null);
            txtmail.setText(null);
            txtadd.setText(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdob = new com.toedter.calendar.JDateChooser();
        txtpnum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbogender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboschool = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboclass = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtadmission = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Student Registration System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(362, 362, 362))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Student Name");

        txtsname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Father Name");

        txtfname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Phone Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Date Of Birth");

        txtpnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender");

        cbogender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("School");

        cboschool.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboschool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engineering", "Business", "IT and Computing", "Teaching", "Nursing", "Music", "FashionDesigning" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Class");

        cboclass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st year 1st Semester", "1st year 2nd Semester", "2nd year 1st Semester", "2nd year 2nd Semester", "3rd year 1st Semester", "3rd year 2nd Semester", "4th year 1st Semester", "4th year 2nd Semester", "Intern" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Admission Date");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("NIC Number");

        txtnic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Address");

        txtmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Mail Address");

        txtadd.setColumns(20);
        txtadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 4));

        btninsert.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btninsert.setText("Insert");
        btninsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninsertMouseClicked(evt);
            }
        });
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnupdate)
                    .addComponent(btninsert))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        btnback.setBackground(new java.awt.Color(0, 153, 153));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon("E:\\Document\\netbeans\\icons\\edit icons\\gback.jpg")); // NOI18N
        btnback.setMaximumSize(new java.awt.Dimension(161, 137));
        btnback.setMinimumSize(new java.awt.Dimension(161, 137));
        btnback.setPreferredSize(new java.awt.Dimension(161, 137));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon("E:\\Document\\netbeans\\icons\\edit icons\\rexit.jpg")); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbogender, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(cboschool, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(cboclass, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtadmission, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpnum, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(29, 29, 29)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtpnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(37, 37, 37)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbogender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboclass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboschool, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtadmission, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
       JFrame frame = new JFrame(" Exit");
       if(JOptionPane.showConfirmDialog(frame, "Confirm if you want exit?",
               "Student Registration System",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
       {
       System.exit(0);
       }
        
        
    }//GEN-LAST:event_btnexitActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here: c
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM `student` WHERE nicno = '"+txtnic.getText()+"'";
         try {
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Student " + txtsname.getText()  + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            this.dispose();
            new StudentRegistration().setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Student nicid " + txtsname.getText()  + " not found");
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
             
        int row = jTable1.getSelectedRow();
        txtsname.setText(jTable1.getValueAt(row, 0).toString());
        txtfname.setText(jTable1.getValueAt(row, 1).toString());
            txtpnum.setText(jTable1.getValueAt(row, 2).toString());
            txtdob.setDate(null);
           cbogender.setSelectedItem(jTable1.getValueAt(row, 4).toString());
            cboschool.setSelectedItem(jTable1.getValueAt(row, 5).toString());
            cboclass.setSelectedItem(jTable1.getValueAt(row, 6).toString());
            txtadmission.setDate(null);
            txtnic.setText(jTable1.getValueAt(row, 8).toString());
            txtmail.setText(jTable1.getValueAt(row, 9).toString());
            txtadd.setText(jTable1.getValueAt(row, 10).toString());
            
              try {
             java.util.Date h = new SimpleDateFormat("yyyy-MM-dd").parse((String)jTable1.getValueAt(row, 3).toString());
              txtdob.setDate(h);
              java.util.Date hh = new SimpleDateFormat("yyyy-MM-dd").parse((String)jTable1.getValueAt(row, 7).toString());
              txtadmission.setDate(hh);

    } catch (ParseException ex) {
        Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
    }
           
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btninsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseClicked
        // TODO add your handling code here:
        String name = txtsname.getText();
            String fname = txtfname.getText();
            String phone = txtpnum.getText();
            SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
            String date = date_format.format(txtdob.getDate());
            String gender = cbogender.getSelectedItem().toString();
            String school = cboschool.getSelectedItem().toString();
            String cllass = cboclass.getSelectedItem().toString();
            SimpleDateFormat date_f = new SimpleDateFormat("yyyy-MM-dd");
            String admission = date_f.format(txtadmission.getDate());
            String nic = txtnic.getText();
            String mail = txtmail.getText();
            String address = txtadd.getText();
            
            if(name.equals("") || fname.equals("") || phone.equals("") || date.equals("") || gender.equals("") || 
                    school.equals("") || cllass.equals("") || admission.equals("") || nic.equals("") || mail.equals("") || address.equals("") ) {
            
                JOptionPane.showMessageDialog(null, "Complete Your Information", "Missing Information", 2);
                
            }
            else {
            String sql = "INSERT INTO `student`(`studentname`, `fathername`, `phone`, `dateofbirth`, `gender`, `school`, `class`, `admissiondate`, `nicno`, `mail`, `address`) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    if(con != null){
        try {
    
    pst = con.prepareStatement(sql);
            pst.setString(1, txtsname.getText());
            pst.setString(2, txtfname.getText());
            pst.setString(3, txtpnum.getText());
            pst.setString(4, date);
            pst.setString(5, (String) cbogender.getSelectedItem());
            pst.setString(6, (String) cboschool.getSelectedItem());
            pst.setString(7, (String) cboclass.getSelectedItem());
            pst.setString(8, admission);
            pst.setString(9, txtnic.getText());
            pst.setString(10, txtmail.getText());
           pst.setString(11, txtadd.getText());
            
            pst.execute();
            defaultTableModel.getDataVector().removeAllElements();
                    defaultTableModel.fireTableDataChanged();
                    loadData();
                    this.dispose();
                    new StudentRegistration().setVisible(true);
                    JOptionPane.showMessageDialog(null, "Your Data Inserted Successfully !");
            
    }           catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                    
                }
    }
 }
            
    }//GEN-LAST:event_btninsertMouseClicked

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        // TODO add your handling code here:
        String name = txtsname.getText();
            String fname = txtfname.getText();
            String phone = txtpnum.getText();
            SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
            String date = date_format.format(txtdob.getDate());
            String gender = cbogender.getSelectedItem().toString();
            String school = cboschool.getSelectedItem().toString();
            String cllass = cboclass.getSelectedItem().toString();
            SimpleDateFormat date_f = new SimpleDateFormat("yyyy-MM-dd");
            String admission = date_f.format(txtadmission.getDate());
            String nic = txtnic.getText();
            String mail = txtmail.getText();
            String address = txtadd.getText();
            
            if(name.equals("") || fname.equals("") || phone.equals("") || date.equals("") || 
                    gender.equals("") || school.equals("") || cllass.equals("") || 
                    admission.equals("") || nic.equals("") || mail.equals("") || address.equals("") ) {
            
                JOptionPane.showMessageDialog(null, "Complete Your Information", "Missing Information", 2);
                
            }
            else {
                
               String sql = "UPDATE `student` SET `studentname` = '"+name+"',`fathername` = '"+fname+"',"
                       + " `phone` = '"+phone+"', `dateofbirth` = '"+date+"', `gender` = '"+gender+"',"
                       + " `school` = '"+school+"', `class` = '"+cllass+"', `admissiondate` = '"+admission+"', "
                       + "`nicno` = '"+nic+"', `mail` = '"+mail+"', `address` = '"+address+"' WHERE nicno = '"+nic+"' ";
    if(con != null){
    
    try {
        pst = con.prepareStatement(sql);
         pst.execute();
                    defaultTableModel.getDataVector().removeAllElements();
                    defaultTableModel.fireTableDataChanged();
                    loadData();
                    this.dispose();
                    new StudentRegistration().setVisible(true);
                    JOptionPane.showMessageDialog(null, "Your Data Update Successfully !!");
    }catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);

                }
            }
            }
        
    }//GEN-LAST:event_btnupdateMouseClicked

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cboclass;
    private javax.swing.JComboBox<String> cbogender;
    private javax.swing.JComboBox<String> cboschool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtadd;
    private com.toedter.calendar.JDateChooser txtadmission;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtpnum;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
