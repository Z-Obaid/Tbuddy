package tbuddy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zabdulsa6826
 */
public class Students extends javax.swing.JFrame {

    public Students() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sback.setText("Back");
        sback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbackActionPerformed(evt);
            }
        });

        studentable.setBackground(new java.awt.Color(153, 153, 153));
        studentable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        studentable.setForeground(new java.awt.Color(255, 255, 255));
        studentable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentable.setRowHeight(25);
        studentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 662, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbackActionPerformed
        MainMenu menu=new MainMenu();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_sbackActionPerformed

    private void studentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentableMouseClicked
        IndividualStudentPage page =new IndividualStudentPage();
        this.setVisible(false);
        page.setVisible(true);
        int x=studentable.getSelectedRow();
        String name=studentable.getValueAt(x, 0)+"";
        
        
        
        try {
            IndividualStudentPage.setable();
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            IndividualStudentPage.filemark(x ,name);
        } catch (IOException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studentableMouseClicked

    
    public static void addnames() throws FileNotFoundException, IOException{
        BufferedReader read=new BufferedReader(new FileReader("names.txt"));
        DefaultTableModel stable = (DefaultTableModel)studentable.getModel();
        String names="";
        while((names=read.readLine())!=null){
            stable.addRow(new Object[]{names});
        }
        read.close();
        //center
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)studentable.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment( SwingConstants.CENTER );
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sback;
    private static javax.swing.JTable studentable;
    // End of variables declaration//GEN-END:variables
}
