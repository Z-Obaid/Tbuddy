package tbuddy;

import java.awt.Cursor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZAY
 */
public class NewMarkStudents extends javax.swing.JFrame {

    ArrayList <String> marks =new ArrayList();
    BufferedWriter wr = new BufferedWriter(new FileWriter("marks.txt",true));
    int i=1;
    
    public NewMarkStudents() throws IOException{
        initComponents();
        
        namelabel.setText(""+Mark.markstable.getValueAt(0, 0));
        i=1;
        marktext.requestFocusInWindow();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelabel = new javax.swing.JLabel();
        marktext = new javax.swing.JTextField();
        marklabel = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        namelabel.setText("Name");

        marklabel.setText("Mark as percentage");

        nextbutton.setText("Next");
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(namelabel)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marklabel)
                    .addComponent(marktext, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextbutton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(marklabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel)
                    .addComponent(marktext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(nextbutton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
      
        
        try {
            wr.write(marktext.getText()+" ");
            marks.add(marktext.getText());
        } catch (IOException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // add mark to file
        if(nextbutton.getText()=="Next"){
        
        //clear text
        marktext.setText("");
        marktext.requestFocusInWindow();
        namelabel.setText(""+Mark.markstable.getValueAt(i, 0));
        i++;
        
        if (i==Mark.markstable.getRowCount()){
            nextbutton.setText("EXIT");
        }
        }
        else if(nextbutton.getText()=="EXIT"){
        //close this window and close writer
        this.dispose();
            try {
                wr.newLine();
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(NewMarkStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Mark.addmarks(marks);
            } catch (IOException ex) {
                Logger.getLogger(NewMarkStudents.class.getName()).log(Level.SEVERE, null, ex);
            }
            Mark.CalcFinalMark();
        }
    }//GEN-LAST:event_nextbuttonActionPerformed

   
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
            java.util.logging.Logger.getLogger(NewMarkStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMarkStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMarkStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMarkStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewMarkStudents().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NewMarkStudents.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel marklabel;
    private javax.swing.JTextField marktext;
    private javax.swing.JLabel namelabel;
    private javax.swing.JButton nextbutton;
    // End of variables declaration//GEN-END:variables

}
