package contactbook;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.UIManager;
/**
 *
 * @author akanksh belchada
 */

class ListData extends AbstractListModel {
        String[] strings;
        public ListData(String[] strings_) {            
            strings=strings_;
        }
        public int getSize() {
          return strings.length;
        }
        public Object getElementAt(int index) {
          return strings[index];
        }
}


public class MyFrame extends javax.swing.JFrame {


 
    public MyFrame() {
        
          
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteContactDialog = new javax.swing.JDialog(this,"Delete Contact");
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        deleteNoButton = new javax.swing.JButton();
        deleteYesButton = new javax.swing.JButton();
        modifyContactDialog = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        modifyNoButton = new javax.swing.JButton();
        modifyYesButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        addDialog = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        addNoButton = new javax.swing.JButton();
        addYesButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        deleteNoButton1 = new javax.swing.JButton();
        deleteYesButton1 = new javax.swing.JButton();
        mandatoryDialog = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        resetDialog = new javax.swing.JDialog();
        jLabel44 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        resetButtonNo = new javax.swing.JButton();
        resetButtonYes = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        HomePanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new JList();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        contactCountLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel14 = new javax.swing.JPanel();
        pb_mnameField = new javax.swing.JTextField();
        pb_fnameField = new javax.swing.JTextField();
        pb_lnameField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        dateTypeDropdown = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel16 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        addTypeDropdown = new JComboBox();
        jLabel29 = new javax.swing.JLabel();
        pb_stAddressField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        pb_cityField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        pb_stateField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        pb_zipcodeField = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        deleteContactButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        contactTypeDropdown = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        pb_phoneNumberField = new javax.swing.JTextField();
        AddPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        add_lnameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add_mnameField = new javax.swing.JTextField();
        add_fnameField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        birthDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jTextField31 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jTextField36 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        calDateChooser = new com.toedter.calendar.JDateChooser();
        jScrollBar1 = new javax.swing.JScrollBar();

        jLabel23.setText("Confirm Delete from Phonebook");

        deleteNoButton.setText("No");
        deleteNoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteNoButtonMousePressed(evt);
            }
        });
        deleteNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNoButtonActionPerformed(evt);
            }
        });

        deleteYesButton.setText("Yes");
        deleteYesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteYesButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(deleteYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteNoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteYesButton)
                    .addComponent(deleteNoButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout deleteContactDialogLayout = new javax.swing.GroupLayout(deleteContactDialog.getContentPane());
        deleteContactDialog.getContentPane().setLayout(deleteContactDialogLayout);
        deleteContactDialogLayout.setHorizontalGroup(
            deleteContactDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteContactDialogLayout.createSequentialGroup()
                .addGroup(deleteContactDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteContactDialogLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteContactDialogLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel23)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        deleteContactDialogLayout.setVerticalGroup(
            deleteContactDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteContactDialogLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        modifyNoButton.setText("No");
        modifyNoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifyNoButtonMousePressed(evt);
            }
        });
        modifyNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyNoButtonActionPerformed(evt);
            }
        });

        modifyYesButton.setText("Yes");
        modifyYesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifyYesButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(modifyYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifyNoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyYesButton)
                    .addComponent(modifyNoButton))
                .addContainerGap())
        );

        jLabel11.setText("Confirm updating contact");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout modifyContactDialogLayout = new javax.swing.GroupLayout(modifyContactDialog.getContentPane());
        modifyContactDialog.getContentPane().setLayout(modifyContactDialogLayout);
        modifyContactDialogLayout.setHorizontalGroup(
            modifyContactDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyContactDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modifyContactDialogLayout.setVerticalGroup(
            modifyContactDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyContactDialogLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel24.setText("Confirm adding contact ");

        addNoButton.setText("No");
        addNoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addNoButtonMousePressed(evt);
            }
        });
        addNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNoButtonActionPerformed(evt);
            }
        });

        addYesButton.setText("Yes");
        addYesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addYesButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(addYesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addNoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addYesButton)
                    .addComponent(addNoButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        deleteNoButton1.setText("No");
        deleteNoButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteNoButton1MousePressed(evt);
            }
        });
        deleteNoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNoButton1ActionPerformed(evt);
            }
        });

        deleteYesButton1.setText("Yes");
        deleteYesButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteYesButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(deleteYesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteNoButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteYesButton1)
                    .addComponent(deleteNoButton1))
                .addContainerGap())
        );

        jLabel25.setText("Mandatory fields are blank!");

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\ab1997\\Documents\\NetBeansProjects\\ContactBook\\icons\\alert.png")); // NOI18N

        Ok.setText("Ok");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mandatoryDialogLayout = new javax.swing.GroupLayout(mandatoryDialog.getContentPane());
        mandatoryDialog.getContentPane().setLayout(mandatoryDialogLayout);
        mandatoryDialogLayout.setHorizontalGroup(
            mandatoryDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mandatoryDialogLayout.createSequentialGroup()
                .addGroup(mandatoryDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mandatoryDialogLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel26))
                    .addGroup(mandatoryDialogLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel25))
                    .addGroup(mandatoryDialogLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(Ok)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        mandatoryDialogLayout.setVerticalGroup(
            mandatoryDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mandatoryDialogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel44.setText("Confirm restting all fields");

        resetButtonNo.setText("No");
        resetButtonNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetButtonNoMousePressed(evt);
            }
        });
        resetButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonNoActionPerformed(evt);
            }
        });

        resetButtonYes.setText("Yes");
        resetButtonYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetButtonYesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(resetButtonYes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButtonNo, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButtonYes)
                    .addComponent(resetButtonNo))
                .addContainerGap())
        );

        javax.swing.GroupLayout resetDialogLayout = new javax.swing.GroupLayout(resetDialog.getContentPane());
        resetDialog.getContentPane().setLayout(resetDialogLayout);
        resetDialogLayout.setHorizontalGroup(
            resetDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetDialogLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(resetDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        resetDialogLayout.setVerticalGroup(
            resetDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resetDialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phonebook");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Phonebook"));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextField10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField10.setText(" Search ");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ab1997\\Documents\\NetBeansProjects\\ContactBook\\icons\\search.png")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        contactCountLabel.setText("Contacts Found:");

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ab1997\\Documents\\NetBeansProjects\\ContactBook\\icons\\undo.png")); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backButtonMousePressed(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactCountLabel)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                        .addGap(6, 6, 6))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactCountLabel)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Details"));

        pb_mnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_mnameFieldActionPerformed(evt);
            }
        });

        pb_fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_fnameFieldActionPerformed(evt);
            }
        });

        pb_lnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_lnameFieldActionPerformed(evt);
            }
        });

        jLabel19.setText("Middle Name:");

        jLabel12.setText("First Name:");

        jLabel13.setText("Last Name:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pb_fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pb_lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(pb_mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Calendar"));

        jLabel33.setText("Type:");

        dateTypeDropdown.setEditable(true);
        dateTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTypeDropdownActionPerformed(evt);
            }
        });

        jLabel34.setText("Date");

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateTypeDropdown, 0, 184, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(dateTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Address"));

        jLabel28.setText(" Type:");

        addTypeDropdown.setEditable(true);
        addTypeDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTypeDropdownMouseClicked(evt);
            }
        });
        addTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTypeDropdownActionPerformed(evt);
            }
        });

        jLabel29.setText("Street Address:");

        pb_stAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_stAddressFieldActionPerformed(evt);
            }
        });

        jLabel30.setText("City:");

        pb_cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_cityFieldActionPerformed(evt);
            }
        });

        jLabel31.setText("State:");

        pb_stateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_stateFieldActionPerformed(evt);
            }
        });

        jLabel32.setText("Zip Code");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb_zipcodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(pb_stateField)
                    .addComponent(addTypeDropdown, 0, 184, Short.MAX_VALUE)
                    .addComponent(pb_stAddressField)
                    .addComponent(pb_cityField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(addTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pb_stAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pb_cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(pb_stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(pb_zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        deleteContactButton.setText("Delete");
        deleteContactButton.setMaximumSize(new java.awt.Dimension(61, 23));
        deleteContactButton.setMinimumSize(new java.awt.Dimension(61, 23));
        deleteContactButton.setPreferredSize(new java.awt.Dimension(61, 23));
        deleteContactButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteContactButtonMouseClicked(evt);
            }
        });
        deleteContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContactButtonActionPerformed(evt);
            }
        });

        modifyButton.setText("Modify");
        modifyButton.setMaximumSize(new java.awt.Dimension(61, 23));
        modifyButton.setMinimumSize(new java.awt.Dimension(61, 23));
        modifyButton.setPreferredSize(new java.awt.Dimension(61, 23));
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteContactButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contact"));

        jLabel14.setText("Type:");

        contactTypeDropdown.setEditable(true);
        contactTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTypeDropdownActionPerformed(evt);
            }
        });

        jLabel16.setText("Number:");

        pb_phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_phoneNumberFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addGap(53, 53, 53)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactTypeDropdown, 0, 184, Short.MAX_VALUE)
                    .addComponent(pb_phoneNumberField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(contactTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(pb_phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Display", HomePanel);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Details"));

        jLabel2.setText("Middle Name:");

        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("First Name:");

        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Last Name:");

        add_mnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_mnameFieldActionPerformed(evt);
            }
        });

        add_fnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fnameFieldActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Date of Birth:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(add_mnameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(add_fnameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_lnameField)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add_fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(add_mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(add_lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contact"));

        jLabel4.setText("Personal:");

        jLabel5.setText("Home:");

        jLabel6.setText("Work:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setText("-");

        jLabel9.setText("-");

        jLabel10.setText("-");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel20.setText("-");

        jTextField19.setText("Other");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addComponent(jTextField14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Additional Address"));

        jLabel17.setText("City:");

        jLabel18.setText("Address:");

        jLabel21.setText("State:");

        jLabel22.setText("Zip:");

        jLabel42.setText("Type:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jTextField18)
                    .addComponent(jTextField22)
                    .addComponent(jTextField40)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddButton.setText("Add");
        AddButton.setMaximumSize(new java.awt.Dimension(61, 23));
        AddButton.setMinimumSize(new java.awt.Dimension(61, 23));
        AddButton.setPreferredSize(new java.awt.Dimension(61, 23));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resetButtonMousePressed(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Home Address"));

        jLabel27.setText("City:");

        jLabel35.setText("Address:");

        jLabel36.setText("State:");

        jLabel37.setText("Zip:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jTextField33)
                    .addComponent(jTextField34)
                    .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Work Address"));

        jLabel38.setText("City:");

        jLabel39.setText("Address:");

        jLabel40.setText("State:");

        jLabel41.setText("Zip:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField36, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jTextField37)
                    .addComponent(jTextField38)
                    .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add Calendar Events"));

        jLabel15.setText("Date:");

        jLabel43.setText("Type:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(calDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(calDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPanelLayout.createSequentialGroup()
                                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        jTabbedPane1.addTab("Add", AddPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_fnameFieldActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void add_mnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_mnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_mnameFieldActionPerformed
 
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        addTypeDropdown.removeAllItems(); //Life-saver!
        contactTypeDropdown.removeAllItems(); //Life-saver!
        dateTypeDropdown.removeAllItems();//Life-saver!
        String query;
        
//        String oldCommand = jComboBox3.getActionCommand();
//        System.out.println(oldCommand);
//        jComboBox3.removeAllItems();
//        jComboBox3.setActionCommand("cmdIgnore");
//        jComboBox3.removeAllItems();
//        jComboBox3.setActionCommand(oldCommand);
        //jComboBox3.setEditable(true);
        System.out.println("The selected item is "+addTypeDropdown.getSelectedItem());
        String selection = jList1.getSelectedValue();
        System.out.println("Console>>>You selected: "+ selection);
        String[] split_arr=selection.split(" ");  //Uft encoding error yet to e fixed !
        
        
        int pbl_cont_id=Integer.valueOf(split_arr[0]); 
        keys.key_contid=pbl_cont_id;
        String pbl_fname=" ";
        String pbl_lname=" ";
        String pbl_mname=" ";
        
       try{
            query="select * from pb_contact where cont_id=?";
            PreparedStatement st = myConn.prepareStatement(query);
            st.setInt(1,pbl_cont_id);
            ResultSet pbl_namesRS=st.executeQuery();
            
            while(pbl_namesRS.next()){
                 pbl_fname=pbl_namesRS.getString("fname");
                 pbl_lname=pbl_namesRS.getString("lname");
                 pbl_mname=pbl_namesRS.getString("mname");}
           
            st.close();
            }
        catch (Exception exc) {
            exc.printStackTrace();
        }   
        pb_fnameField.setText(pbl_fname);
        pb_lnameField.setText(pbl_lname);
        pb_mnameField.setText(pbl_mname);
        
        //-------select query for populating the Address type dropdown!---------
                try{
                  query=("SELECT DISTINCT pb_address.address_type PBL_ADDTYPES\n" +
                          "FROM pb_contact\n" +
                          "JOIN pb_address\n" +
                          "  ON pb_contact.cont_id = pb_address.cont_id \n" +
                          "WHERE pb_contact.cont_id=?");
                  PreparedStatement st = myConn.prepareStatement(query);
                  
                  
                  st.setInt(1,pbl_cont_id);
                  ResultSet addressTypesRS=st.executeQuery();


                  ArrayList<String> addTypesList= new ArrayList<String>();
                  while(addressTypesRS.next()){
                      addTypesList.add(addressTypesRS.getString("PBL_ADDTYPES"));}

                  String addTypesList_arr[] = new String[addTypesList.size()];
                  
                         for (int j = 0; j < addTypesList.size(); j++) {
                             addTypesList_arr[j] = addTypesList.get(j);
                             System.out.println(addTypesList_arr[j]);
                             addTypeDropdown.addItem(addTypesList_arr[j]);
                             }  
                  }
                
                 
                catch (Exception exc) {
                    exc.printStackTrace();
                }
            //-----------Query for populating address details of selected addresses-------------------
           // jComboBox3.setEditable(true);
                   Object obj = addTypeDropdown.getSelectedItem(); 
                   System.out.println("Console>>>You selected Address type: "+obj.toString());
                   String selectedAddressType=obj.toString();
                try{
                   query="SELECT pb_address.st_address,\n" +
                            "       pb_address.city,\n" +
                            "       pb_address.state,\n" +
                            "       pb_address.zipcode\n" +
                            "FROM pb_contact\n" +
                            "JOIN pb_address\n" +
                            "  ON pb_contact.cont_id = pb_address.cont_id \n" +
                            "WHERE pb_contact.cont_id=? and pb_address.address_type=?";
                   PreparedStatement st = myConn.prepareStatement(query);
                   st.setInt(1,pbl_cont_id);
                   st.setString(2,selectedAddressType);
                   ResultSet addressDetailsRS=st.executeQuery();
                    String pbl_st_address="";
                    String pbl_city="";
                    String pbl_state="";
                    String pbl_zipcode="";
                   while(addressDetailsRS.next()){
                         pbl_st_address=addressDetailsRS.getString("st_address");
                         pbl_city=addressDetailsRS.getString("city");
                         pbl_state=addressDetailsRS.getString("state");
                         pbl_zipcode=addressDetailsRS.getString("zipcode");}
                   st.close();
                    pb_stAddressField.setText(pbl_st_address);
                    pb_cityField.setText(pbl_city);
                    pb_stateField.setText(pbl_state);
                    pb_zipcodeField.setText(pbl_zipcode);
                   
                }
               catch (Exception exc) {
                    exc.printStackTrace();
                }
         //-------select query for populating the phone type dropdown!---------
                try{
                  query=("""
                         SELECT DISTINCT pb_phone.phone_type PBL_PHTYPES
                         FROM pb_contact
                         JOIN pb_phone
                           ON pb_contact.cont_id = pb_phone.cont_id 
                         WHERE pb_contact.cont_id=?""");
                  PreparedStatement st = myConn.prepareStatement(query);
                  st.setInt(1,pbl_cont_id);
                  ResultSet phoneTypesRS=st.executeQuery();


                  ArrayList<String> phoneTypesList= new ArrayList<String>();
                  while(phoneTypesRS.next()){
                      phoneTypesList.add(phoneTypesRS.getString("PBL_PHTYPES"));}

                  String phoneTypesList_arr[] = new String[phoneTypesList.size()];
                  
                         for (int j = 0; j < phoneTypesList.size(); j++) {
                             phoneTypesList_arr[j] = phoneTypesList.get(j);
                             System.out.println(phoneTypesList_arr[j]);
                             contactTypeDropdown.addItem(phoneTypesList_arr[j]);
                             }  
                  }
                
                 
                catch (SQLException exc) {
                }
         //-----------Query for populating phone details of selected phone type------------------- 
                   Object obj2 = contactTypeDropdown.getSelectedItem(); 
                   System.out.println("Console>>>You selected phone type: "+obj2.toString());
                   String selectedPhoneType=obj2.toString();
                try{
                   query=("SELECT CONCAT(pb_phone.area_code,pb_phone.number) PBL_NUMBER \n" +
                        "FROM pb_contact\n" +
                        "JOIN pb_phone\n" +
                        "  ON pb_contact.cont_id = pb_phone.cont_id \n" +
                        "WHERE pb_contact.cont_id=? AND pb_phone.phone_type=?");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setInt(1,pbl_cont_id);
                    st.setString(2,selectedPhoneType);
                    ResultSet phoneDetailsRS=st.executeQuery();
                    String pbl_phoneNumber="";
                    
                   while(phoneDetailsRS.next()){
                         pbl_phoneNumber=phoneDetailsRS.getString("PBL_NUMBER");}
                   st.close();
                    pb_phoneNumberField.setText(pbl_phoneNumber);
                    
                   
                }
               catch (SQLException exc) {
                }
         //-------select query for populating the date type dropdown!---------
                try{
                  query=("""
                         SELECT DISTINCT pb_date.date_type PBL_PHTYPES
                         FROM pb_contact
                         JOIN pb_date
                           ON pb_contact.cont_id = pb_date.cont_id 
                         WHERE pb_contact.cont_id=?""");
                  PreparedStatement st = myConn.prepareStatement(query);
                  st.setInt(1,pbl_cont_id);
                  ResultSet calendarTypesRS=st.executeQuery();

                  ArrayList<String> calendarTypesList= new ArrayList<String>();
                  while(calendarTypesRS.next()){
                      calendarTypesList.add(calendarTypesRS.getString("PBL_PHTYPES"));}

                  String calendarTypesList_arr[] = new String[calendarTypesList.size()];
                  
                         for (int j = 0; j < calendarTypesList.size(); j++) {
                             calendarTypesList_arr[j] = calendarTypesList.get(j);
                             System.out.println(calendarTypesList_arr[j]);
                             dateTypeDropdown.addItem(calendarTypesList_arr[j]);
                             }  
     
                  } 
                catch (SQLException exc) {
                }
           
         //-----------Query for populating date details of selected calendar day------------------- 
                   Object obj4 = dateTypeDropdown.getSelectedItem(); 
                   System.out.println("Console>>>You selected date type: "+obj4.toString());
                   String selectedDateType=obj4.toString();
                try{
                   query=("""
                          SELECT  pb_date.date 
                          FROM pb_contact
                          JOIN pb_date
                            ON pb_contact.cont_id = pb_date.cont_id 
                          WHERE pb_contact.cont_id=? and pb_date.date_type=?""");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setInt(1,pbl_cont_id);
                    st.setString(2,selectedDateType);
                    ResultSet dateRS=st.executeQuery();
                    String pbl_date="";
                    
                   while(dateRS.next()){
                         pbl_date=dateRS.getString("date");}
                   st.close();
                   
                   
                   if(pbl_date==null){jDateChooser1.setCalendar(null);}
                   else{
                    java.util.Date date2 = new SimpleDateFormat("yyyy-mm-dd").parse(pbl_date);
                    jDateChooser1.setDate(date2);
                   }
                   
                }
               catch (Exception exc) {
                    exc.printStackTrace();
                }
         
         
    }//GEN-LAST:event_jList1MouseClicked

    private void pb_lnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_lnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_lnameFieldActionPerformed

    private void pb_fnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_fnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_fnameFieldActionPerformed

    private void pb_mnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_mnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_mnameFieldActionPerformed

    private void contactTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTypeDropdownActionPerformed
        // TODO add your handling code here:
       // System.out.print(keys.key_contid);
        int pbl_cont_id=keys.key_contid;
        Object obj2 = contactTypeDropdown.getSelectedItem(); 
        if(obj2!=null)
        {
                  
                   System.out.println("Console>>>You selected phone type: "+obj2.toString());
                   String selectedPhoneType=obj2.toString();
                try{
                   String query=("""
                                 SELECT CONCAT(pb_phone.area_code,pb_phone.number) PBL_NUMBER 
                                 FROM pb_contact
                                 JOIN pb_phone
                                   ON pb_contact.cont_id = pb_phone.cont_id 
                                 WHERE pb_contact.cont_id=? AND pb_phone.phone_type=?""");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setInt(1,pbl_cont_id);
                    st.setString(2,selectedPhoneType);
                    ResultSet phoneDetailsRS=st.executeQuery();
                    String pbl_phoneNumber="";
                    
                   while(phoneDetailsRS.next()){
                         pbl_phoneNumber=phoneDetailsRS.getString("PBL_NUMBER");}
                   st.close();
                    pb_phoneNumberField.setText(pbl_phoneNumber);
                    
                   
                }
               catch (Exception exc) {
                    exc.printStackTrace();
                }
        }
    }//GEN-LAST:event_contactTypeDropdownActionPerformed

    private void pb_phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_phoneNumberFieldActionPerformed

    private void addTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTypeDropdownActionPerformed
            //System.out.print(keys.key_contid);
            int pbl_cont_id=keys.key_contid;
            Object obj = addTypeDropdown.getSelectedItem(); 
            if(obj!=null)
            {
                   System.out.println("Console>>>You selected Address type: "+obj.toString());
                   String selectedAddressType=obj.toString();
                try{
                   String query="""
                                SELECT pb_address.st_address,
                                       pb_address.city,
                                       pb_address.state,
                                       pb_address.zipcode
                                FROM pb_contact
                                JOIN pb_address
                                  ON pb_contact.cont_id = pb_address.cont_id 
                                WHERE pb_contact.cont_id=? and pb_address.address_type=?""";
                   PreparedStatement st = myConn.prepareStatement(query);
                   st.setInt(1,pbl_cont_id);
                   st.setString(2,selectedAddressType);
                   ResultSet addressDetailsRS=st.executeQuery();
                    String pbl_st_address="";
                    String pbl_city="";
                    String pbl_state="";
                    String pbl_zipcode="";
                   while(addressDetailsRS.next()){
                         pbl_st_address=addressDetailsRS.getString("st_address");
                         pbl_city=addressDetailsRS.getString("city");
                         pbl_state=addressDetailsRS.getString("state");
                         pbl_zipcode=addressDetailsRS.getString("zipcode");}
                   st.close();
                    pb_stAddressField.setText(pbl_st_address);
                    pb_cityField.setText(pbl_city);
                    pb_stateField.setText(pbl_state);
                    pb_zipcodeField.setText(pbl_zipcode);
                   
                }
               catch (Exception exc) {
                    exc.printStackTrace();
                }        
            }
    }//GEN-LAST:event_addTypeDropdownActionPerformed

    private void pb_stAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_stAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_stAddressFieldActionPerformed

    private void pb_cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_cityFieldActionPerformed

    private void pb_stateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_stateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_stateFieldActionPerformed

    private void dateTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTypeDropdownActionPerformed
            Object obj4 = dateTypeDropdown.getSelectedItem(); 
            int pbl_cont_id=keys.key_contid;
            if (obj4!=null){         
            System.out.println("Console>>>You selected date type: "+obj4.toString());
            String selectedDateType=obj4.toString();
                try{
                   String query=("SELECT  pb_date.date \n" +
                        "FROM pb_contact\n" +
                        "JOIN pb_date\n" +
                        "  ON pb_contact.cont_id = pb_date.cont_id \n" +
                        "WHERE pb_contact.cont_id=? and pb_date.date_type=?");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setInt(1,pbl_cont_id);
                    st.setString(2,selectedDateType);
                    ResultSet dateRS=st.executeQuery();
                    String pbl_date="";
                    
                   while(dateRS.next()){
                         pbl_date=dateRS.getString("date");}
                   st.close();
                   
                   
                   if(pbl_date==null ||pbl_date==" " ){jDateChooser1.setCalendar(null);}
                   else{
                    System.out.println("The upd:"+pbl_date);
                    java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(pbl_date);
                    jDateChooser1.setDate(date2);
                   }
                   
                }
               catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
    }//GEN-LAST:event_dateTypeDropdownActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
       //  System.out.println("The selected Date is"+jDateChooser1.getDate());
        modifyContactDialog.pack();
        modifyContactDialog.setLocationRelativeTo(null);
        modifyContactDialog.setVisible(true);
         
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContactButtonActionPerformed
        // TODO add your handling code here:
        //------------------CALLING THE STORED-PROC FOR DELETING CONTACT-----
//         CREATE DEFINER=`uh3hfr8kr8chwzhn`@`%` PROCEDURE 
//         `DELETE_CONTACT`(IN `pb_cont_id` INT) NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER 
//                 BEGIN 
//                 SELECT * FROM pb_contact WHERE cont_id=pb_cont_id;
//                 DELETE FROM pb_address where cont_id=pb_cont_id; 
//                 DELETE FROM pb_phone where cont_id=pb_cont_id; 
//                 DELETE FROM pb_date where cont_id=pb_cont_id; 
//                 DELETE FROM pb_contact where cont_id=pb_cont_id;
//                END
        deleteContactDialog.pack();
        deleteContactDialog.setLocationRelativeTo(null);
        deleteContactDialog.setVisible(true);
      //  System.out.println("Visible???");
        
        
    }//GEN-LAST:event_deleteContactButtonActionPerformed

    private void addTypeDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTypeDropdownMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addTypeDropdownMouseClicked

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
       // System.out.println("The selected Date is"+jDateChooser1.getDate());
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void deleteContactButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteContactButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteContactButtonMouseClicked

    private void deleteNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteNoButtonActionPerformed

    private void deleteYesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteYesButtonMousePressed
        // TODO add your handling code here:
          int pbl_cont_id=keys.key_contid;
        
             try{
                   String query=("CALL DELETE_CONTACT(?)");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setInt(1,pbl_cont_id);
                    st.executeQuery();
                    deleteContactDialog.setVisible(false);
                    System.out.println("Console>>>Contact Deleted: "+String.valueOf(pbl_cont_id));
                }
               catch (SQLException exc) {
                }
        //-------------------------Update the contact count------------------------
            try{
             String query="select count(*) CONTACT_COUNT from pb_contact ";
             PreparedStatement st = myConn.prepareStatement(query);
             ResultSet pbl_countRS=st.executeQuery();
             pbl_countRS.next();
             int contactCount= pbl_countRS.getInt("CONTACT_COUNT");
             keys.totalContacts=contactCount;
             contactCountLabel.setText("Contacts Found: "+keys.totalContacts+"/"+keys.totalContacts);      
             st.close();
             }
         catch (SQLException exc) {
         }   
           //-----------------Repopulate the phonebook list with updated (after deletion) contact list
           try{
            ResultSet phonebookListContents=myStmt.executeQuery("select * from pb_contact order by cont_id");
            ArrayList<String> pbl_records= new ArrayList<>();
            while(phonebookListContents.next()){
                pbl_records.add(String.valueOf(phonebookListContents.getInt("cont_id"))+"  "+
                phonebookListContents.getString("fname")+"  "+phonebookListContents.getString("lname"));}



                String pbl_record_arr[] = new String[pbl_records.size()];
                       for (int j = 0; j < pbl_records.size(); j++) {
                           pbl_record_arr[j] = pbl_records.get(j);
                         //  System.out.println(pbl_record_arr[j]);
                       }
             ListData ld = new ListData(pbl_record_arr );
             jList1.setModel(ld);
             
            }

            catch (Exception exc) {
                exc.printStackTrace();
            }
           
    }//GEN-LAST:event_deleteYesButtonMousePressed

    private void deleteNoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteNoButtonMousePressed
        // TODO add your handling code here:
        deleteContactDialog.setVisible(false);
    }//GEN-LAST:event_deleteNoButtonMousePressed

    private void modifyNoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyNoButtonMousePressed
        // TODO add your handling code here:
        modifyContactDialog.setVisible(false);
    }//GEN-LAST:event_modifyNoButtonMousePressed

    private void modifyNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyNoButtonActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_modifyNoButtonActionPerformed

    private void modifyYesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyYesButtonMousePressed
        // TODO add your handling code here:
        //-----------------Reading the contents of the DisplayPanel of  JTabbed Panel-------------------
        int pbl_cont_id=keys.key_contid;
        String gui_fname=pb_fnameField.getText();
        String gui_lname=pb_lnameField.getText();
        String gui_mname=pb_mnameField.getText();
        String gui_address_type=addTypeDropdown.getSelectedItem().toString();
        String gui_st_address=pb_stAddressField.getText();       
        String gui_city=pb_cityField.getText(); 
        String gui_state=pb_stateField.getText(); 
        String gui_zipcode=pb_zipcodeField.getText(); 
        String gui_phone_type=contactTypeDropdown.getSelectedItem().toString();
        String temp=pb_phoneNumberField.getText();
        System.out.println("Bug!!!!"+temp);
        String gui_areaCode=null;
        String gui_number=null;
        if(temp!=null && temp.length()==10){
           gui_areaCode=String.valueOf(temp.charAt(0))+temp.charAt(1)+temp.charAt(2);
           gui_number=String.valueOf(temp.charAt(3))+temp.charAt(4)+temp.charAt(5)+String.valueOf(temp.charAt(6))+temp.charAt(7)+temp.charAt(8)+String.valueOf(temp.charAt(9));
        }
        String gui_date_type=dateTypeDropdown.getSelectedItem().toString();
       	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        String gui_date="";
        if((Objects.isNull(jDateChooser1.getDate())))
        {
           gui_date=null;
        }
        else{
	  gui_date= formatter.format(jDateChooser1.getDate());
          System.out.println("***************"+gui_date);
        }
        System.out.println("Console:gui_fname>>> Form:"+" "+gui_lname+" "+gui_mname+" "+gui_address_type+" "+gui_st_address+" "+gui_city+" "+gui_state+" "+gui_zipcode+" "+gui_phone_type+" "+gui_areaCode+" "+gui_number+" "+gui_date);
        
        //-------------------------Hitting my awesome Stored Proc-----------------------------------------
//                CREATE DEFINER=`uh3hfr8kr8chwzhn`@`%` PROCEDURE `MODIFY_CONTACT`
//                (IN `pb_cont_id` INT,
//                 IN `gui_fname` VARCHAR(20) CHARSET utf8,
//                 IN `gui_lname` VARCHAR(20) CHARSET utf8,
//                 IN `gui_mname` VARCHAR(20) CHARSET utf8,
//                 IN `gui_address_type` VARCHAR(10) CHARSET utf8,
//                 IN `gui_st_address` VARCHAR(30) CHARSET utf8, 
//                 IN `gui_city` VARCHAR(12) CHARSET utf8,
//                 IN `gui_state` VARCHAR(10) CHARSET utf8, 
//                 IN `gui_zipcode` VARCHAR(10) CHARSET utf8, 
//                 IN `gui_phone_type` VARCHAR(10) CHARSET utf8, 
//                 IN `gui_areaCode` VARCHAR(3) CHARSET utf8,
//                 IN `gui_number` VARCHAR(7) CHARSET utf8,
//                 IN `gui_date_type` VARCHAR(10) CHARSET utf8,
//                 IN `gui_date` DATE) NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER 
//                 BEGIN
//                        DECLARE rowsFound INT DEFAULT 0;
//                        UPDATE pb_contact
//                        SET pb_contact.fname=gui_fname,pb_contact.lname=gui_lname,pb_contact.mname=gui_mname 
//                        WHERE pb_contact.cont_id=pb_cont_id;
//
//                        UPDATE pb_address 
//                        SET pb_address.st_address=gui_st_address,pb_address.city=gui_city,pb_address.state=gui_state,pb_address.zipcode=gui_zipcode
//                        WHERE pb_address.cont_id = pb_cont_id AND pb_address.address_type=gui_address_type;
//                        SELECT ROW_COUNT() INTO rowsFound;
//                        IF rowsFound<1
//                        THEN
//                           INSERT INTO pb_address (cont_id,address_type,st_address,city,state,zipcode)
//                           VALUES (pb_cont_id,gui_address_type,gui_st_address,gui_city,gui_state,gui_zipcode);
//                        END IF;
//
//                        UPDATE pb_phone 
//                        SET pb_phone.area_code=gui_areaCode,pb_phone.number=gui_number
//                        WHERE pb_phone.cont_id = pb_cont_id AND pb_phone.phone_type=gui_phone_type;
//                        SELECT ROW_COUNT() INTO rowsFound;
//                        IF rowsFound<1
//                        THEN
//                           INSERT INTO pb_phone (cont_id,phone_type,area_code,number)
//                           VALUES(pb_cont_id,gui_phone_type,gui_areaCode,gui_number);
//                        END IF;
//
//                        UPDATE pb_date 
//                        SET pb_date.date=gui_date
//                        WHERE pb_date.cont_id = pb_cont_id AND pb_date.date_type=gui_date_type;
//                        SELECT ROW_COUNT() INTO rowsFound;
//                        IF rowsFound<1
//                        THEN
//                           INSERT INTO pb_date (cont_id,date_type,date)
//                           VALUES (pb_cont_id,gui_date_type,gui_date);
//                        END IF;
//
//                 END
//-------------------I was born ready Mr. Shelby ! Hit it  !-------------------------
             try{
                   String query=("CALL MODIFY_CONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setInt(1,pbl_cont_id);
                     st.setString(2,gui_fname);
                      st.setString(3,gui_lname);
                       st.setString(4,gui_mname);
                        st.setString(5,gui_address_type);
                         st.setString(6,gui_st_address);
                          st.setString(7,gui_city);
                           st.setString(8,gui_state);
                            st.setString(9,gui_zipcode);
                             st.setString(10,gui_phone_type);
                              st.setString(11,gui_areaCode);
                               st.setString(12,gui_number);
                                st.setString(13,gui_date_type);
                                 st.setString(14,gui_date);              
                    st.executeQuery();
                    modifyContactDialog.setVisible(false);
                    System.out.println("Console>>>Contact Modified: "+String.valueOf(pbl_cont_id));
                }
               catch (SQLException exc) {
                }
             
    //-----------------Repopulate the phonebook list with updated (after modification) contact list
           try{
            ResultSet phonebookListContents=myStmt.executeQuery("select * from pb_contact order by cont_id");
            ArrayList<String> pbl_records= new ArrayList<String>();
            while(phonebookListContents.next()){
                pbl_records.add(String.valueOf(phonebookListContents.getInt("cont_id"))+"  "+
                phonebookListContents.getString("fname")+"  "+phonebookListContents.getString("lname"));}



                String pbl_record_arr[] = new String[pbl_records.size()];
                       for (int j = 0; j < pbl_records.size(); j++) {
                           pbl_record_arr[j] = pbl_records.get(j);
                         //  System.out.println(pbl_record_arr[j]);
                       }
             ListData ld = new ListData(pbl_record_arr );
             jList1.setModel(ld);
             
            }

            catch (Exception exc) {
                exc.printStackTrace();
            }
             
       
    }//GEN-LAST:event_modifyYesButtonMousePressed

    private void deleteNoButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteNoButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteNoButton1MousePressed

    private void deleteNoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteNoButton1ActionPerformed

    private void deleteYesButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteYesButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteYesButton1MousePressed

    private void addNoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNoButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNoButtonMousePressed

    private void addNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNoButtonActionPerformed
        // TODO add your handling code here:
        addDialog.setVisible(false);
    }//GEN-LAST:event_addNoButtonActionPerformed

    private void addYesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYesButtonMousePressed
        // TODO add your handling code here:
        
        String gui_fname=add_fnameField.getText();
       String gui_lname=add_lnameField.getText();
        String gui_mname=add_mnameField.getText();
        String gui_birthDate;
        System.out.println("JDC::::"+birthDateChooser.getDate());
        if((Objects.isNull(birthDateChooser.getDate())))
        {
           gui_birthDate=null;
        }
        
        else{
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	  gui_birthDate= formatter.format(birthDateChooser.getDate());   
          System.out.println("DOB::::"+gui_birthDate);
        }
        String gui_home_stAddress=jTextField35.getText();
        String gui_home_city=jTextField33.getText();
        String gui_home_state=jTextField31.getText();
        String gui_home_zip=jTextField34.getText();
        String gui_work_stAddress=jTextField39.getText();
        String gui_work_city=jTextField37.getText();
        String gui_work_state=jTextField36.getText();
        String gui_work_zip=jTextField38.getText();
        String gui_address_type=jTextField30.getText();
        String gui_type_stAddress=jTextField40.getText();
        String gui_type_city=jTextField18.getText();
        String gui_type_state=jTextField17.getText();
        String gui_type_zip=jTextField22.getText();
        String gui_home_areaCode=jTextField6.getText();
        String gui_homeNumber=jTextField7.getText();
        String gui_personal_areaCode=jTextField5.getText();
        String gui_personalNumber=jTextField8.getText();
        String gui_work_areaCode=jTextField4.getText ();
        String gui_workNumber=jTextField9.getText();
        String gui_other_type=jTextField19.getText();
        String gui_other_areaCode=jTextField14.getText();
        String gui_other_number=jTextField16.getText();
        String gui_cal_type=jTextField41.getText();
        
        String gui_cal_date;
        if((Objects.isNull(calDateChooser.getDate())))
        {
           gui_cal_date=null;
        }
        else{
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	  gui_cal_date= formatter.format(calDateChooser.getDate());  
          System.out.println("CAL::::"+gui_cal_date);
        }
        
         try{
             //---------------------Calling the Add Contact Stored Procedure-------------------
                //CREATE DEFINER=`uh3hfr8kr8chwzhn`@`%` PROCEDURE `ADD_CONTACT`(IN `gui_fname` VARCHAR(20) CHARSET utf8, IN `gui_lname` VARCHAR(20) CHARSET utf8, IN `gui_mname` VARCHAR(20) CHARSET utf8, IN `gui_birthDate` DATE, IN `gui_home_stAddress` VARCHAR(30) CHARSET utf8, IN `gui_home_city` VARCHAR(12) CHARSET utf8, IN `gui_home_state` VARCHAR(10) CHARSET utf8, IN `gui_home_zip` VARCHAR(10) CHARSET utf8, IN `gui_work_stAddress` VARCHAR(30) CHARSET utf8, IN `gui_work_city` VARCHAR(12) CHARSET utf8, IN `gui_work_state` VARCHAR(10) CHARSET utf8, IN `gui_work_zip` VARCHAR(10) CHARSET utf8, IN `gui_address_type` VARCHAR(10) CHARSET utf8, IN `gui_type_stAddress` VARCHAR(30) CHARSET utf8, IN `gui_type_city` VARCHAR(12) CHARSET utf8, IN `gui_type_state` VARCHAR(10) CHARSET utf8, IN `gui_type_zip` VARCHAR(10) CHARSET utf8, IN `gui_home_areaCode` VARCHAR(3) CHARSET utf8, IN `gui_homeNumber` VARCHAR(7) CHARSET utf8, IN `gui_personal_areaCode` VARCHAR(3) CHARSET utf8, IN `gui_personalNumber` VARCHAR(7) CHARSET utf8, IN `gui_work_areaCode` VARCHAR(3) CHARSET utf8, IN `gui_workNumber` VARCHAR(7) CHARSET utf8, IN `gui_other_type` VARCHAR(10) CHARSET utf8, IN `gui_other_areaCode` VARCHAR(3) CHARSET utf8, IN `gui_other_Number` VARCHAR(7) CHARSET utf8, IN `gui_cal_type` VARCHAR(10) CHARSET utf8, IN `gui_cal_date` DATE) NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER BEGIN
                //DECLARE pb_cont_id INT DEFAULT 0;
                //
                //INSERT INTO pb_contact (pb_contact.fname,pb_contact.mname,pb_contact.lname) VALUES(gui_fname,gui_mname,gui_lname);
                //
                //SELECT pb_contact.cont_id
                //from pb_contact 
                //where pb_contact.fname=gui_fname 
                //    AND pb_contact.mname=gui_Mname 
                //    AND pb_contact.lname=gui_Lname
                //INTO pb_cont_id;
                //
                //INSERT INTO pb_address (pb_address.cont_id,pb_address.address_type,pb_address.st_address,pb_address.city,pb_address.state,pb_address.zipcode) 
                //VALUES (pb_cont_id,"Home",gui_home_stAddress,gui_home_city,gui_home_state,gui_home_zip);
                //
                //INSERT INTO pb_address (pb_address.cont_id,pb_address.address_type,pb_address.st_address,pb_address.city,pb_address.state,pb_address.zipcode) 
                //VALUES (pb_cont_id,"Work",gui_work_stAddress,gui_work_city,gui_work_state,gui_work_zip);
                //
                //INSERT INTO pb_address (pb_address.cont_id,pb_address.address_type,pb_address.st_address,pb_address.city,pb_address.state,pb_address.zipcode) 
                //VALUES (pb_cont_id,gui_address_type,gui_type_stAddress,gui_type_city,gui_type_state,gui_type_zip);
                //
                //INSERT INTO pb_phone (pb_phone .cont_id,pb_phone .phone_type,pb_phone .area_code,pb_phone .number)
                //VALUES (pb_cont_id,"Home",gui_home_areaCode,gui_homeNumber);
                //
                //INSERT INTO pb_phone (pb_phone .cont_id,pb_phone .phone_type,pb_phone .area_code,pb_phone .number)
                //VALUES (pb_cont_id,"Personal",gui_personal_areaCode,gui_personalNumber);
                //
                //INSERT INTO pb_phone (pb_phone .cont_id,pb_phone .phone_type,pb_phone .area_code,pb_phone .number) 
                //VALUES (pb_cont_id,"Work",gui_work_areaCode,gui_workNumber);
                //
                //INSERT INTO pb_phone (pb_phone .cont_id,pb_phone .phone_type,pb_phone .area_code,pb_phone .number) 
                //VALUES (pb_cont_id,gui_other_type,gui_other_areaCode,gui_other_Number);
                //
                //
                //
                //INSERT INTO pb_date (pb_date.cont_id,pb_date.date_type,pb_date.date)
                //VALUES (pb_cont_id,"Birth date",gui_birthDate);
                //
                //INSERT INTO pb_date (pb_date.cont_id,pb_date.date_type,pb_date.date) 
                //VALUES (pb_cont_id,gui_cal_type,gui_cal_date);
                //
                //END
                   String query=("CALL ADD_CONTACT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    PreparedStatement st = myConn.prepareStatement(query);
                    st.setString(1,gui_fname);
                    st.setString(2,gui_lname);
                    st.setString(3,gui_mname);
                    st.setString(4,gui_birthDate);
                    st.setString(5,gui_home_stAddress);
                    st.setString(6,gui_home_city);
                    st.setString(7,gui_home_state);
                    st.setString(8,gui_home_zip);
                    st.setString(9,gui_work_stAddress);
                    st.setString(10,gui_work_city);
                    st.setString(11,gui_work_state);
                    st.setString(12,gui_work_zip);
                    st.setString(13,gui_address_type);
                    st.setString(14,gui_type_stAddress);
                    st.setString(15,gui_type_city);
                    st.setString(16,gui_type_state);
                    st.setString(17,gui_type_zip);
                    st.setString(18,gui_home_areaCode);
                    st.setString(19,gui_homeNumber);
                    st.setString(20,gui_personal_areaCode);
                    st.setString(21,gui_personalNumber);
                    st.setString(22,gui_work_areaCode);
                    st.setString(23,gui_workNumber);
                    st.setString(24,gui_other_type);
                    st.setString(25,gui_other_areaCode);
                    st.setString(26,gui_other_number);
                    st.setString(27,gui_cal_type);
                    st.setString(28,gui_cal_date);                               
                    st.executeQuery();
                    modifyContactDialog.setVisible(false);
                
                }
               catch (Exception exc) {
                    exc.printStackTrace();
                }
         keys.totalContacts+=1;
         contactCountLabel.setText("Contacts Found: "+  keys.totalContacts+"/"+  keys.totalContacts);
        
        addDialog.setVisible(false);
        //-----------Repopulate the phone book list with the new updated entry----------
          try{
            ResultSet phonebookListContents=myStmt.executeQuery("select * from pb_contact order by cont_id");
            ArrayList<String> pbl_records= new ArrayList<String>();
            while(phonebookListContents.next()){
                pbl_records.add(String.valueOf(phonebookListContents.getInt("cont_id"))+"  "+
                phonebookListContents.getString("fname")+"  "+phonebookListContents.getString("lname"));}



                String pbl_record_arr[] = new String[pbl_records.size()];
                       for (int j = 0; j < pbl_records.size(); j++) {
                           pbl_record_arr[j] = pbl_records.get(j);
                         //  System.out.println(pbl_record_arr[j]);
                       }
             ListData ld = new ListData(pbl_record_arr );
             jList1.setModel(ld);
             
            }

            catch (Exception exc) {
                exc.printStackTrace();
            }
             
    }//GEN-LAST:event_addYesButtonMousePressed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        
        String gui_fname=add_fnameField.getText();
        String gui_lname=add_lnameField.getText();
        
        if(gui_fname.length()==0 ||gui_lname.length()==0 )
        {
          
            mandatoryDialog.pack();
            mandatoryDialog.setLocationRelativeTo(null);
            mandatoryDialog.setVisible(true);
        }
        else{       
            addDialog.pack();
            addDialog.setLocationRelativeTo(null);
            addDialog.setVisible(true);
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        // TODO add your handling code here:
        mandatoryDialog.setVisible(false);
    }//GEN-LAST:event_OkActionPerformed

    private void resetButtonNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonNoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonNoMousePressed

    private void resetButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonNoActionPerformed
        // TODO add your handling code here:
        addDialog.setVisible(false);
    }//GEN-LAST:event_resetButtonNoActionPerformed

    private void resetButtonYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonYesMousePressed
        // TODO add your handling code here:
       add_fnameField.setText(null);
       add_lnameField.setText(null);
       add_mnameField.setText(null);
       birthDateChooser.setDate(null);
        
       jTextField35.setText(null);
       jTextField33.setText(null);
       jTextField31.setText(null);
       jTextField34.setText(null);
       jTextField39.setText(null);
       jTextField37.setText(null);
       jTextField36.setText(null);
       jTextField38.setText(null);
       jTextField30.setText(null);
       jTextField40.setText(null);
       jTextField18.setText(null);
       jTextField17.setText(null);
       jTextField22.setText(null);
       jTextField6.setText(null);
       jTextField7.setText(null);
       jTextField5.setText(null);
       jTextField8.setText(null);
       jTextField4.setText(null);
       jTextField9.setText(null);
       jTextField19.setText(null);
       jTextField14.setText(null);
       jTextField16.setText(null);
       jTextField41.setText(null);
       calDateChooser.setDate(null);
       resetDialog.setVisible(false);
       
    }//GEN-LAST:event_resetButtonYesMousePressed

    private void resetButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMousePressed
            resetDialog.pack();
            resetDialog.setLocationRelativeTo(null);
            resetDialog.setVisible(true);
    }//GEN-LAST:event_resetButtonMousePressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        //-----------------Calling the search contact stored procedure------------------------
//        CREATE DEFINER=`uh3hfr8kr8chwzhn`@`%` PROCEDURE `SEARCH_CONTACT`
//                (IN `search_key` VARCHAR(20) CHARSET utf8) 
//                NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER
//                select C.cont_id,C.fname,C.mname,C.lname from (((pb_contact C  left join pb_address A on C.cont_id=A.cont_id) 
//                left join pb_phone P on C.cont_id=P.cont_id) 
//                left join pb_date D on C.cont_id=D.cont_id)  
//                where C.fname like search_key 
//                        or C.mname like search_key 
//                        or C.lname like search_key 
//                        or A.st_address like search_key 
//                        or A.city like search_key 
//                        or A.state like search_key 
//                        or A.zipcode like search_key 
//                        or P.area_code like search_key 
//                        or P.number like search_key 
//                        or D.date like search_key  group by cont_id
        try{
        String search_key="%"+jTextField10.getText()+"%";
       
        String query3="CALL SEARCH_CONTACT(?)";
        
                PreparedStatement st = myConn.prepareStatement(query3);
          
            st.setString(1,search_key);
//             st.setString(2,search_key);
//              st.setString(3,search_key);
//               st.setString(4,search_key);
//                st.setString(5,search_key);
//                 st.setString(6,search_key);
//                  st.setString(7,search_key);
//                   st.setString(8,search_key);
//                    st.setString(9,search_key);
//                     st.setString(10,search_key);
                    
            ResultSet searchResults=st.executeQuery();
            System.out.println(searchResults);
            ArrayList<String> result_list= new ArrayList<String>();
//            System.out.println("Here now!");   
            while(searchResults.next()){
//                System.out.println("Here once");
//                System.out.println("Listing"+String.valueOf(searchResults.getInt("cont_id"))+"  "+
//                searchResults.getString("fname")+"  "+searchResults.getString("lname"));
//                
                result_list.add(String.valueOf(searchResults.getInt("cont_id"))+"  "+
                searchResults.getString("fname")+"  "+searchResults.getString("lname"));
            }
            
                
                String search_result_arr[] = new String[result_list.size()];
                       for (int j = 0; j < result_list.size(); j++) {
                           search_result_arr[j] = result_list.get(j);
                           System.out.println(search_result_arr[j]);
                       }
                       
                       //Update these !!!!!!!
                       
            int contactCount=result_list.size();         
            contactCountLabel.setText("Contacts Found: "+contactCount+"/"+keys.totalContacts);          
             ListData ld2 = new ListData(search_result_arr );
             jList1.removeAll();
             jList1.setModel(ld2);
          
        }
          catch (SQLException exc) {
            }
        
                    
    }//GEN-LAST:event_jButton3MouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        // TODO add your handling code here:
         //----------select query for populating phonebook list-----------------    
            try{
            ResultSet phonebookListContents=myStmt.executeQuery("select * from pb_contact order by cont_id");
            ArrayList<String> pbl_records= new ArrayList<String>();
            while(phonebookListContents.next()){
                pbl_records.add(String.valueOf(phonebookListContents.getInt("cont_id"))+"  "+
                phonebookListContents.getString("fname")+"  "+phonebookListContents.getString("lname"));}
                String pbl_record_arr[] = new String[pbl_records.size()];
                       for (int j = 0; j < pbl_records.size(); j++) {
                           pbl_record_arr[j] = pbl_records.get(j);
                           System.out.println(pbl_record_arr[j]);
                       }
            int contactCount=pbl_records.size();         
            keys.totalContacts=contactCount;
            contactCountLabel.setText("Contacts Found: "+  keys.totalContacts+"/"+  keys.totalContacts);          
             ListData ld = new ListData(pbl_record_arr );
             jList1.setModel(ld);
            }
            catch (SQLException exc) {
                exc.printStackTrace();
            }
    }//GEN-LAST:event_backButtonMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //UIManager.getSystemLookAndFeelClassName()
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//               
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }

              // 1. com.jtattoo.plaf.texture.TextureLookAndFeel
              // 2. com.jtattoo.plaf.smart.SmartLookAndFeel 
              // 3. com.jtattoo.plaf.noire.NoireLookAndFeel
              // 4. "com.jtattoo.plaf.acryl.AcrylLookAndFeel"
              // 5. "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"
              // 6. "com.jtattoo.plaf.luna.LunaLookAndFeel"
              //7. "com.jtattoo.plaf.mint.MintLookAndFeel"
              
            try{javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");}
             catch (Exception exc) {
                exc.printStackTrace();
            }
            
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MyFrame().setVisible(true);
            }
        });

        
        System.out.println("Hello World");  
        
//        Connection myConn = null;
//        Statement myStmt = null;
        ResultSet myRs = null;	
        try {           
            myConn = DriverManager.getConnection("jdbc:mysql://bubvhjcwfocodkgqw8py-mysql.services.clever-cloud.com", "uh3hfr8kr8chwzhn" , "sRpGpFx1adXL7ZKy5gnC");
            myStmt = myConn.createStatement();
            System.out.println(myStmt);
            myStmt.executeUpdate("USE bubvhjcwfocodkgqw8py;");
            
            //Creating Contact Table
            myStmt.executeUpdate("create table  if not exists pb_contact (cont_id INT NOT NULL AUTO_INCREMENT,\n" +
"              fname VARCHAR(20) NOT NULL,\n" +
"              lname VARCHAR(20) NOT NULL,\n" +
"              mname VARCHAR(20),\n" +
"              CONSTRAINT user_info UNIQUE(lname,fname,mname),\n" +
"              PRIMARY KEY (cont_id) );"); 
            myStmt.executeUpdate("ALTER TABLE pb_contact AUTO_INCREMENT = 1000;");
            
            //Create address table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_address (add_id INT NOT NULL AUTO_INCREMENT,
                                               cont_id INT(5) NOT NULL,
                                               address_type VARCHAR(10),
                                               st_address VARCHAR(30),
                                               city VARCHAR(12),
                                               state VARCHAR(10),
                                               zipcode VARCHAR(10),
                                               PRIMARY KEY (add_id),
                                               FOREIGN KEY (cont_id) REFERENCES pb_contact(cont_id));""");
            
            //Create phone table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_phone (phone_id INT NOT NULL AUTO_INCREMENT,
                                               cont_id INT NOT NULL,
                                               phone_type VARCHAR(10),
                                               area_code VARCHAR(3),
                                               number VARCHAR(7),
                                               PRIMARY KEY (phone_id),
                                               FOREIGN KEY (cont_id) REFERENCES pb_contact(cont_id));""");
           
            //Create date table
            myStmt.executeUpdate("""
                                 create table  if not exists pb_date (date_id INT NOT NULL  AUTO_INCREMENT,
                                               cont_id INT NOT NULL,
                                               date_type VARCHAR(10),
                                               date date,
                                               PRIMARY KEY (date_id),
                                               FOREIGN KEY (cont_id) REFERENCES pb_contact(cont_id));""");
            
            myRs=myStmt.executeQuery("Show tables");
            while(myRs.next()){
                 System.out.println(myRs.getString("Tables_in_bubvhjcwfocodkgqw8py"));
             }
             
        //----------select query for populating phonebook list-----------------    
            try{
            ResultSet phonebookListContents=myStmt.executeQuery("select * from pb_contact order by cont_id");
            ArrayList<String> pbl_records= new ArrayList<String>();
            while(phonebookListContents.next()){
                pbl_records.add(String.valueOf(phonebookListContents.getInt("cont_id"))+"  "+
                phonebookListContents.getString("fname")+"  "+phonebookListContents.getString("lname"));}
                String pbl_record_arr[] = new String[pbl_records.size()];
                       for (int j = 0; j < pbl_records.size(); j++) {
                           pbl_record_arr[j] = pbl_records.get(j);
                           System.out.println(pbl_record_arr[j]);
                       }
            int contactCount=pbl_records.size();         
            keys.totalContacts=contactCount;
            contactCountLabel.setText("Contacts Found: "+  keys.totalContacts+"/"+  keys.totalContacts);          
             ListData ld = new ListData(pbl_record_arr );
             jList1.setModel(ld);
            }
            catch (SQLException exc) {
                exc.printStackTrace();
            }
      } 
    catch (Exception exc) {
         exc.printStackTrace();
     }
        
        
        
        
        
        
        
        
    }
    
    
    //Delete if doesnt work!
   public static Connection myConn;
   public static Statement myStmt;
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel AddPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton Ok;
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton addNoButton;
    public static javax.swing.JComboBox<String> addTypeDropdown;
    private javax.swing.JButton addYesButton;
    private javax.swing.JTextField add_fnameField;
    private javax.swing.JTextField add_lnameField;
    private javax.swing.JTextField add_mnameField;
    private javax.swing.JButton backButton;
    private com.toedter.calendar.JDateChooser birthDateChooser;
    private com.toedter.calendar.JDateChooser calDateChooser;
    public static javax.swing.JLabel contactCountLabel;
    private javax.swing.JComboBox<String> contactTypeDropdown;
    private javax.swing.JComboBox<String> dateTypeDropdown;
    private javax.swing.JButton deleteContactButton;
    private javax.swing.JDialog deleteContactDialog;
    private javax.swing.JButton deleteNoButton;
    private javax.swing.JButton deleteNoButton1;
    private javax.swing.JButton deleteYesButton;
    private javax.swing.JButton deleteYesButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JDialog mandatoryDialog;
    private javax.swing.JButton modifyButton;
    private javax.swing.JDialog modifyContactDialog;
    private javax.swing.JButton modifyNoButton;
    private javax.swing.JButton modifyYesButton;
    private javax.swing.JTextField pb_cityField;
    private javax.swing.JTextField pb_fnameField;
    private javax.swing.JTextField pb_lnameField;
    private javax.swing.JTextField pb_mnameField;
    private javax.swing.JTextField pb_phoneNumberField;
    private javax.swing.JTextField pb_stAddressField;
    private javax.swing.JTextField pb_stateField;
    private javax.swing.JTextField pb_zipcodeField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton resetButtonNo;
    private javax.swing.JButton resetButtonYes;
    private javax.swing.JDialog resetDialog;
    // End of variables declaration//GEN-END:variables
}
