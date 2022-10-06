/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  Touti;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author liamsi
 */
public class Recu_achat extends javax.swing.JFrame {
ResultSet rs;
    db_connection db;
    /**
     * Creates new form Recu
     */
    public Recu_achat() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
         inporter();
        date();
    }

     public void inporter() {
       String colon[] = {"ID_Produit","reference","prix_vente","stock_sortie","Total"};
        rs = db.fcSelectCommand(colon, "achat", "id=?" );
        tbleImp.setModel(new ResultSetTableModel(rs));
        lbltotal.setText(Vente.txttot.getText());
        lblcash.setText(Vente.txtcas.getText());
        payapres();
    }
   
     public void bill() 
			{
				//DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				//LocalDateTime now = LocalDateTime.now();
				//String date = dt.format(now);
				//String nm = labelname.getText();
				//String total = txttcost.getText();
				//String pay = txtpay.getText();
				//String bal = txtbal.getText();
				//String nc = txtidclient.getText(); 
				/*String ct = txtct.getText(); tel
				String cnn = txtcnn.getText(); nom
				String ad = txtad.getText(); adres*/
				
				
				DefaultTableModel model = new DefaultTableModel();
				model = (DefaultTableModel)tbleImp.getModel();
				
				jTextArea1.setText(jTextArea1.getText()+"******  \n");
				jTextArea1.setText(jTextArea1.getText()+"*                TOUTI OPTIQUE            *  \n");
				jTextArea1.setText(jTextArea1.getText()+"*    Vente des verres correcteurs anti-reflets, progressif, double foyer   *  \n");
				jTextArea1.setText(jTextArea1.getText()+"*   Kalaban Garantiguibougou 5èmè plaque          Tel: +223 78 38 74 78          *   \n");
				jTextArea1.setText(jTextArea1.getText()+"******   \n");
				jTextArea1.setText(jTextArea1.getText()+"                                                  \n");
				
				
				
				//jTextArea1.setText(jTextArea1.getText()+"  FACTURE  n° 0000012 " \n" );
				jTextArea1.setText(jTextArea1.getText()+"                                                  \n");

				
				//jTextArea1.setText(jTextArea1.getText()+ "Client: "+  nc  +" \n" );
				jTextArea1.setText(jTextArea1.getText()+"                                                       \n");
				
				
				jTextArea1.setText(jTextArea1.getText()+ "Produit"+"\t" +"Prix"+"\t"+"Qte " +"   Total U" +"\n");
				
				for (int i= 0; i < tbleImp.getRowCount(); i++)
				{
					String pname = (String)tbleImp.getValueAt(i, 1);
					String price = (String)tbleImp.getValueAt(i, 2);
					int qty = (int)tbleImp.getValueAt(i, 3);
					int amount = (int)tbleImp.getValueAt(i, 4);
				 	
					jTextArea1.setText(jTextArea1.getText()+ pname +  "\t"     +     price + "\t"+     qty + "\t"+amount +"\n");	
					
				}
				jTextArea1.setText(jTextArea1.getText()+"\n");
				jTextArea1.setText(jTextArea1.getText()+"\n");

				
				//txtbill.setText(txtbill.getText()+"\t" + "\t" + "Somme re�ue :"+ pay +"\n" );
				//txtbill.setText(txtbill.getText()+"\t" + "\t" + "Somme rendue:"+ bal +"\n" );
				jTextArea1.setText(jTextArea1.getText()+"                                      \n");
				jTextArea1.setText(jTextArea1.getText()+"                                             \n");
				
				jTextArea1.setText(jTextArea1.getText()+"                                             \n");
				//jTextArea1.setText(jTextArea1.getText()+"\t" + "\t" + "             TOTAL :"+ total +"\n" );

				jTextArea1.setText(jTextArea1.getText()+"                                            \n " );
				jTextArea1.setText(jTextArea1.getText()+"*****\n");
				jTextArea1.setText(jTextArea1.getText()+"                                             \n");
				//txtbill.setText(txtbill.getText()+"                                             \n");
				jTextArea1.setText(jTextArea1.getText()+"                                             \n");
				jTextArea1.setText(jTextArea1.getText()+"                                             \n");
				
				jTextArea1.setText(jTextArea1.getText()+" Merci pour votre confiance  \n");
				//txtcn.setText("");
				/*txtct.setText("");
				txtcnn.setText("");
				txtad.setText("");*/
			}
		
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbleImp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblpay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblcash = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblheure = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 227, 222));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Recu");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 10, 150, 50);

        tbleImp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code_produit", "reference", "Prix de vente", "Stock sortire", "total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbleImp);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 100, 630, 90);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Payé aprés :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 290, 120, 28);

        lblpay.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblpay.setText("xx");
        lblpay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblpay);
        lblpay.setBounds(470, 290, 160, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Cash  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 250, 83, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("total :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 210, 83, 28);

        lbltotal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbltotal.setText("xx");
        jPanel1.add(lbltotal);
        lbltotal.setBounds(480, 210, 140, 30);

        lblcash.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblcash.setText("xx");
        jPanel1.add(lblcash);
        lblcash.setBounds(480, 250, 130, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 260, 140, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Imprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 210, 140, 40);

        lblheure.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblheure.setText("date :");
        jPanel1.add(lblheure);
        lblheure.setBounds(110, 75, 170, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText(" Heure :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(340, 70, 70, 22);

        lbldate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbldate.setText("date :");
        jPanel1.add(lbldate);
        lbldate.setBounds(450, 60, 130, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Date :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 60, 70, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(-4, -4, 750, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        //this.printComponents(null);
        
        
        
        jTextArea1.print();
        
        } catch (PrinterException ex) {
        Logger.getLogger(Recu_achat.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        /* //pour impression
        MessageFormat hedear new MessageFormat("Facture");
        MessageFormat footer new MessageFormat("Page{0,number,integer]");

        try {
        MessageFormat header;
        tbleImp.print(JTable.PrintMode.NORMAL, header,footer);
        } 
        catch (java.awt.print.PrinterException e) {
        System.err.format("Erreur d'impression", e.getMessage());
        }
        
        // Récupère un PrinterJob
        PrinterJob job = PrinterJob.getPrinterJob();
        // Définit son contenu à imprimer
        job.setPrintable(tbleImp.getPrintable(PrintMode.NORMAL, null, null));
        // Affiche une boîte de choix d'imprimante
        if (job.printDialog()) {
        try {
        // Effectue l'impression
        job.print();
        } catch (PrinterException ex) {
        ex.printStackTrace();
        }
    }*/ 
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Vente s = new Vente();
s.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
     public void date(){
         
        lbldate.setText(Vente.lbl1.getText());
        lblheure.setText(Vente.lbl2.getText());
    }

    public void payapres() {
        int a = Integer.parseInt(Vente.txttot.getText());
        int b = Integer.parseInt(Vente.txtcas.getText());
        int c = b - a;
        lblpay.setText(Integer.toString(c));
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
            java.util.logging.Logger.getLogger(Recu_achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recu_achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recu_achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recu_achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recu_achat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel lblcash;
    public javax.swing.JLabel lbldate;
    public javax.swing.JLabel lblheure;
    public javax.swing.JLabel lblpay;
    public javax.swing.JLabel lbltotal;
    public javax.swing.JTable tbleImp;
    // End of variables declaration//GEN-END:variables
}
