/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaryInterface;

import com.formdev.flatlaf.IntelliJTheme;
import javax.swing.UIManager;
import model.CompositeEmployee;
import model.LeafEmployee;

/**
 *
 * @author HP
 */

public class ABCDNursingHomeSalary extends javax.swing.JFrame {

    LeafEmployee jayan;
    LeafEmployee nimni;
    LeafEmployee lakindu;
    LeafEmployee ravindu;
    CompositeEmployee nimesh;
    CompositeEmployee uvindu;
    CompositeEmployee ridhmi;
    CompositeEmployee namal;
    CompositeEmployee anjan;

   
    public ABCDNursingHomeSalary() {
        initComponents();

        jayan = new LeafEmployee("Jayan", "Nurse", 100000.00);
        nimni = new LeafEmployee("Nimni", "Nurse", 100000.00);
        lakindu = new LeafEmployee("Lakindu", "Nurse", 100000.00);
        ravindu = new LeafEmployee("Ravindu", "Nurse", 100000.00);

        nimesh = new CompositeEmployee("Nimesh", "Doctor", 180000.0);
        uvindu = new CompositeEmployee("Uvindu", "Doctor", 180000.0);
        ridhmi = new CompositeEmployee("Ridhmi", "Doctor", 180000.0);

        namal = new CompositeEmployee("Andrew", "Manager", 250000.0);
        anjan = new CompositeEmployee("Anjan", "Manager", 500000.0);
        nimesh.addEmployee(jayan);
        uvindu.addEmployee(nimni);
        uvindu.addEmployee(lakindu);
        ridhmi.addEmployee(ravindu);

        namal.addEmployee(nimesh);
        namal.addEmployee(uvindu);
        namal.addEmployee(ridhmi);
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
        jPanel2 = new javax.swing.JPanel();
        allEmployeesButton = new javax.swing.JButton();
        namalButton = new javax.swing.JButton();
        nimeshButton = new javax.swing.JButton();
        uvinduButton = new javax.swing.JButton();
        ridhmiButton = new javax.swing.JButton();
        jayanButton = new javax.swing.JButton();
        nimniButton = new javax.swing.JButton();
        lakinduButton = new javax.swing.JButton();
        ravinduButton = new javax.swing.JButton();
        nimeshAndTeamButton = new javax.swing.JButton();
        uvinduAndTeamButton = new javax.swing.JButton();
        ridhmiAndTeamButton = new javax.swing.JButton();
        anjanButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Allion Software Solutions PVT LTD / Salary Calculator");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("ABCD Nursing Home PVT LTD / Salary Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calculate Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        allEmployeesButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        allEmployeesButton.setText("All Employees");
        allEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEmployeesButtonActionPerformed(evt);
            }
        });

        namalButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namalButton.setText("Namal");
        namalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namalButtonActionPerformed(evt);
            }
        });

        nimeshButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nimeshButton.setText("Nimesh");
        nimeshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimeshButtonActionPerformed(evt);
            }
        });

        uvinduButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uvinduButton.setText("Uvindu");
        uvinduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvinduButtonActionPerformed(evt);
            }
        });

        ridhmiButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ridhmiButton.setText("Ridhmi");
        ridhmiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridhmiButtonActionPerformed(evt);
            }
        });

        jayanButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jayanButton.setText("Jayan");
        jayanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jayanButtonActionPerformed(evt);
            }
        });

        nimniButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nimniButton.setText("Nimni");
        nimniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimniButtonActionPerformed(evt);
            }
        });

        lakinduButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lakinduButton.setText("Lakindu");
        lakinduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakinduButtonActionPerformed(evt);
            }
        });

        ravinduButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ravinduButton.setText("Ravindu");
        ravinduButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ravinduButtonActionPerformed(evt);
            }
        });

        nimeshAndTeamButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nimeshAndTeamButton.setText("Nimesh And Team");
        nimeshAndTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimeshAndTeamButtonActionPerformed(evt);
            }
        });

        uvinduAndTeamButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uvinduAndTeamButton.setText("Uvindu And Team");
        uvinduAndTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvinduAndTeamButtonActionPerformed(evt);
            }
        });

        ridhmiAndTeamButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ridhmiAndTeamButton.setText("Ridhmi And Team");
        ridhmiAndTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridhmiAndTeamButtonActionPerformed(evt);
            }
        });

        anjanButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anjanButton.setText("Anjan");
        anjanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anjanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nimeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uvinduButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ridhmiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jayanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nimniButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ravinduButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(namalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nimeshAndTeamButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uvinduAndTeamButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(lakinduButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ridhmiAndTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anjanButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allEmployeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lakinduButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anjanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimeshAndTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uvinduAndTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ridhmiAndTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimeshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uvinduButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ridhmiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jayanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nimniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ravinduButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Salary : ");

        salaryLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        salaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salaryLabel.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void allEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEmployeesButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(namal.getSalary(true) + " LKR");
    }//GEN-LAST:event_allEmployeesButtonActionPerformed

    private void namalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namalButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(namal.getSalary(false) + " LKR");
    }//GEN-LAST:event_namalButtonActionPerformed

    private void nimeshAndTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimeshAndTeamButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(nimesh.getSalary(true) + " LKR");
    }//GEN-LAST:event_nimeshAndTeamButtonActionPerformed

    private void uvinduAndTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvinduAndTeamButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(uvindu.getSalary(true) + " LKR");
    }//GEN-LAST:event_uvinduAndTeamButtonActionPerformed

    private void ridhmiAndTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridhmiAndTeamButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(ridhmi.getSalary(true) + " LKR");
    }//GEN-LAST:event_ridhmiAndTeamButtonActionPerformed

    private void nimeshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimeshButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(nimesh.getSalary(false) + " LKR");
    }//GEN-LAST:event_nimeshButtonActionPerformed

    private void uvinduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvinduButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(uvindu.getSalary(false) + " LKR");
    }//GEN-LAST:event_uvinduButtonActionPerformed

    private void ridhmiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridhmiButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(ridhmi.getSalary(false) + " LKR");
    }//GEN-LAST:event_ridhmiButtonActionPerformed

    private void jayanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jayanButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(jayan.getSalary(false) + " LKR");
    }//GEN-LAST:event_jayanButtonActionPerformed

    private void nimniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimniButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(nimni.getSalary(false) + " LKR");
    }//GEN-LAST:event_nimniButtonActionPerformed

    private void lakinduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakinduButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(lakindu.getSalary(false) + " LKR");
    }//GEN-LAST:event_lakinduButtonActionPerformed

    private void ravinduButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ravinduButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(ravindu.getSalary(false) + " LKR");
    }//GEN-LAST:event_ravinduButtonActionPerformed

    private void anjanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anjanButtonActionPerformed
        // TODO add your handling code here:
        salaryLabel.setText(anjan.getSalary(false) + " LKR");
    }//GEN-LAST:event_anjanButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            IntelliJTheme.setup(ABCDNursingHomeSalary.class.getResourceAsStream(
                    "/resources/themes/arc-theme.theme.json"));
            UIManager.put("Table.showHorizontalLines", true);
            UIManager.put("Table.showVerticalLines", true);
            UIManager.put("ScrollBar.showButtons", true);
            UIManager.put("ScrollBar.width", 16);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABCDNursingHomeSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allEmployeesButton;
    private javax.swing.JButton anjanButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jayanButton;
    private javax.swing.JButton lakinduButton;
    private javax.swing.JButton namalButton;
    private javax.swing.JButton nimeshAndTeamButton;
    private javax.swing.JButton nimeshButton;
    private javax.swing.JButton nimniButton;
    private javax.swing.JButton ravinduButton;
    private javax.swing.JButton ridhmiAndTeamButton;
    private javax.swing.JButton ridhmiButton;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JButton uvinduAndTeamButton;
    private javax.swing.JButton uvinduButton;
    // End of variables declaration//GEN-END:variables
}
