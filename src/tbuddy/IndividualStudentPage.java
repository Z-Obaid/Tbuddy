package tbuddy;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZAY
 */
public class IndividualStudentPage extends javax.swing.JFrame {

    public static String [] commarray=null;
    public static int studentrow=0;
    public IndividualStudentPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        comment = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        ismtable = new javax.swing.JTable();
        studentpg = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        invisiblemark = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        finalmark = new javax.swing.JTable();
        editbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 204, 255));

        comment.setEditable(false);
        jScrollPane2.setViewportView(comment);

        ismtable.setBackground(new java.awt.Color(102, 102, 102));
        ismtable.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        ismtable.setForeground(new java.awt.Color(255, 255, 255));
        ismtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ismtable.setColumnSelectionAllowed(true);
        ismtable.setGridColor(new java.awt.Color(255, 255, 255));
        ismtable.setOpaque(false);
        ismtable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        ismtable.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(ismtable);
        ismtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ismtable.getAccessibleContext().setAccessibleParent(this);

        studentpg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        studentpg.setText("Student");

        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        invisiblemark.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        invisiblemark.setOpaque(false);
        jScrollPane4.setViewportView(invisiblemark);

        finalmark.setBackground(new java.awt.Color(102, 102, 102));
        finalmark.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        finalmark.setForeground(new java.awt.Color(255, 255, 255));
        finalmark.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Final Mark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        finalmark.setColumnSelectionAllowed(true);
        jScrollPane5.setViewportView(finalmark);
        finalmark.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editbutton)
                                .addGap(18, 18, 18)
                                .addComponent(savebutton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))))))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(studentpg, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbutton)
                .addGap(41, 41, 41)
                .addComponent(studentpg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editbutton)
                    .addComponent(savebutton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
        Students stud = new Students();
        stud.setVisible(true);
        try {
            Students.addnames();
        } catch (IOException ex) {
            Logger.getLogger(IndividualStudentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backbuttonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        comment.setEditable(true);
        //if only contains space remove space
        if(comment.getText().length()==1 && comment.getText().equals(" ")){
            comment.setText("");
        }
        //refocus and change button colours
        comment.requestFocusInWindow();
        editbutton.setBackground(Color.darkGray);
        editbutton.setForeground(Color.lightGray);
        savebutton.setForeground(Color.red);
    }//GEN-LAST:event_editbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        comment.setEditable(false);
        commarray[studentrow]=comment.getText();
        //overwrite file
        BufferedWriter wr=null;
            try {
                wr= new BufferedWriter(new FileWriter("comment.txt"));
            } catch (IOException ex) {
                Logger.getLogger(Mark.class.getName()).log(Level.SEVERE, null, ex);
            }
        for(int i=0; i<commarray.length; i++){
            try {
                if(commarray[i]!=null){
                    wr.write(commarray[i]);
                    wr.newLine();
                }
                else{
                    commarray[i]="";
                    wr.write(commarray[i]);
                    wr.newLine();
                }
            } catch (IOException ex) {
                Logger.getLogger(IndividualStudentPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            wr.close();
        } catch (IOException ex) {
            Logger.getLogger(IndividualStudentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return button colours to original state
        editbutton.setBackground(UIManager.getColor("Button.background"));
        editbutton.setForeground(UIManager.getColor("Button.foreground"));
        savebutton.setForeground(UIManager.getColor("Button.foreground"));
    }//GEN-LAST:event_savebuttonActionPerformed

    
    public static void setable() throws IOException{
         BufferedReader read=new BufferedReader(new FileReader("columns.txt"));
         DefaultTableModel stable = new DefaultTableModel();
         DefaultTableModel ivtable = new DefaultTableModel();
         //read into columns
         String column;
         stable.addColumn("Name");
         ivtable.addColumn("Name");
         while((column=read.readLine())!=null){
             stable.addColumn(column);
             ivtable.addColumn(column);
         }
         read.close();
         

         ismtable.setModel(stable);
         invisiblemark.setModel(ivtable);
}
    
    public static void filemark(int student, String name) throws IOException{
       
       //set student heading to student's name
       studentpg.setText(name);
       
       //set public row int to known row
       studentrow=student;
       
       DefaultTableModel ivtable = (DefaultTableModel)invisiblemark.getModel();
       DefaultTableModel stable = (DefaultTableModel)ismtable.getModel();
        
       //read names into rows
       BufferedReader read=new BufferedReader(new FileReader("names.txt"));
       
        String sname="";
                while((sname=read.readLine())!=null){
                    ivtable.addRow(new Object[]{sname});
                }
       
       read=new BufferedReader(new FileReader("marks.txt"));
        
        String mark="", singlem="";
        int row=0,column=1;
                while((mark=read.readLine())!=null){
                    for(int i=0; i<mark.length();i++){
                        
                        //if not space add to mark
                        if(mark.charAt(i)!=' '){
                            singlem+=mark.charAt(i);
                        }
                        //else add to graph and reset
                        else{
                            ivtable.setValueAt(singlem, row, column);
                            singlem="";
                            row++;
                        }
                    }
                    column++;
                    row=0;
                }  
            
        read.close();
        
        //addstudent name into row
        stable.addRow(new Object[]{});
        for( int i=0; i< stable.getColumnCount(); i++){
            stable.setValueAt(ivtable.getValueAt(student, i), 0, i);
        }
        
         invisiblemark.setVisible(false);
         IndividualStudentPage.CalcFinalMark();
         IndividualStudentPage.CommentFile(ivtable.getRowCount(),student);
         
   } 
    
    public static void CalcFinalMark(){
        DefaultTableModel ftable = (DefaultTableModel)finalmark.getModel();
        int sum=0, div=0;
        for(int i=1; i<ismtable.getColumnCount(); i++){
            //if contains num
            if(ismtable.getValueAt(0, i)!=null && !ismtable.getValueAt(0, i).equals("")){
                sum+=Float.parseFloat(ismtable.getValueAt(0, i)+"");
                div++;
            }
        }
        if(div>0 && sum!=0){
            float fin=sum/div;
            ftable.setValueAt((fin), 0, 0);
        }
        else if(div>0 && sum==0){
            ftable.setValueAt(("0"), 0, 0);
        }
        else {
            ftable.setValueAt((""),0,0);
        }
    }
    
    public static void CommentFile(int students,int row) throws FileNotFoundException, IOException{
        BufferedReader read=new BufferedReader(new FileReader("comment.txt"));
        commarray=new String[students];
        String comm;
        int x=0;
        while((comm=read.readLine())!=null){
            if(!comm.equals("")){
                commarray[x]=comm;
                x++;
            }
        }
        comment.setText(commarray[row]);
        read.close();
    }
    
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
            java.util.logging.Logger.getLogger(IndividualStudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualStudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualStudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualStudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndividualStudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private static javax.swing.JEditorPane comment;
    private javax.swing.JButton editbutton;
    private static javax.swing.JTable finalmark;
    private static javax.swing.JTable invisiblemark;
    private static javax.swing.JTable ismtable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton savebutton;
    private static javax.swing.JLabel studentpg;
    // End of variables declaration//GEN-END:variables

    private Writer FileWriter(String commenttxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
