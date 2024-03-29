/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  Touti;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mariam
 */
public class Vente extends javax.swing.JFrame {

    /**
     * Creates new form cachier
     */
    
   
    ResultSet rs;
    db_connection db;
    int old, dec, now;
    public Vente() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        
        initComponents();
        table();
        client();
        jam();
    }

    public void table() {
        String colon[] = {"ID_Produit","Désignation","Prix","Quantité_Stockée"};
        rs = db.querySelect(colon, "produit");
        tbl_res.setModel(new ResultSetTableModel(rs));
    }
     public void client() {
        String colon[] = {"ID_Client","Prénom","Nom","Sexe","Adresse","Téléphone","Email"};
        rs = db.querySelect(colon, "client");
        jTable_client.setModel(new ResultSetTableModel(rs));
    }

    /*public void importer() {
        String colon[] = {"id","ID_Produit","reference","prix_vente","stock_sortie","Total"};
        rs = db.fcSelectCommand(colon, "achat", "id=?");
        tbl_ven.setModel(new ResultSetTableModel(rs));
    }*/

    /**
     *
     */

   
    
    private void  one() {
    try {
           Connection con = null;
        ResultSet resultat = null;
        PreparedStatement ps = null;
           con = ConnexionDB.connexion();
           initComponents();
            importer();
           
           //afficherTable("cmd",jTable3);
           
            this.setIconImage(ImageIO.read(new File("C:\\Users\\LENOVO I5\\Documents\\ToutiOptique\\src\\Touti\\logo.png")));
            
        } catch (Exception ex) {
            Logger.getLogger(Statistiques.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
        
        
    }
        
    private void importer() {
        
       
    }
        
       
        
       public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl1.setText(jam.format(s));
        lbl2.setText(tgl.format(s));}
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_res = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comrech = new javax.swing.JComboBox();
        txtrech = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtref = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpri = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtrem = new javax.swing.JTextField();
        txtnou = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtidclient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_ajout = new javax.swing.JButton();
        btn_vente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txttot = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtcas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_client = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ven = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbltot1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("resultat");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 10, 100, 24);

        tbl_res.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code_produit", "Designation", "Prix", "Stock "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_resMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_res);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 40, 990, 90);

        jButton7.setText("actualiser");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(840, 0, 80, 20);

        jButton8.setText("sortire");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(920, 0, 70, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 990, 140);

        jPanel2.setBackground(new java.awt.Color(239, 252, 253));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("recherche par catégorie :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 0, 250, 20);

        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID_Produit", "Désignation", "Prix", "Quantité_stockée", " ", " " }));
        comrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comrechActionPerformed(evt);
            }
        });
        jPanel2.add(comrech);
        comrech.setBounds(50, 30, 240, 30);
        jPanel2.add(txtrech);
        txtrech.setBounds(150, 70, 180, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Id_Client:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 110, 100, 20);

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel2.add(txtcod);
        txtcod.setBounds(150, 150, 160, 30);

        txtref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrefActionPerformed(evt);
            }
        });
        jPanel2.add(txtref);
        txtref.setBounds(150, 190, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Désignation");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 190, 100, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Prix        :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 240, 100, 30);

        txtpri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriActionPerformed(evt);
            }
        });
        jPanel2.add(txtpri);
        txtpri.setBounds(150, 240, 160, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("remise     :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 290, 110, 30);

        txtrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremActionPerformed(evt);
            }
        });
        jPanel2.add(txtrem);
        txtrem.setBounds(150, 290, 160, 30);

        txtnou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnouActionPerformed(evt);
            }
        });
        jPanel2.add(txtnou);
        txtnou.setBounds(150, 340, 160, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("nouveau Prix  :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 340, 100, 17);

        txtsto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstoActionPerformed(evt);
            }
        });
        txtsto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstoKeyReleased(evt);
            }
        });
        jPanel2.add(txtsto);
        txtsto.setBounds(150, 390, 160, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Quantité");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 390, 100, 17);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setText("recherche ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 70, 131, 30);

        txtidclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclientActionPerformed(evt);
            }
        });
        jPanel2.add(txtidclient);
        txtidclient.setBounds(150, 110, 160, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("code_produit :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 150, 100, 20);

        btn_ajout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_ajout.setText("Ajouter au panier");
        btn_ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ajout);
        btn_ajout.setBounds(120, 430, 180, 30);

        btn_vente.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btn_vente.setText("Ajouter à la vente");
        btn_vente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_vente);
        btn_vente.setBounds(70, 500, 240, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 150, 360, 550);

        jPanel3.setBackground(new java.awt.Color(240, 249, 252));
        jPanel3.setLayout(null);

        txttot.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txttot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttot.setText("0");
        jPanel3.add(txttot);
        txttot.setBounds(350, 350, 190, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Somme à rendre");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(280, 380, 120, 30);
        jPanel3.add(txtpay);
        txtpay.setBounds(400, 380, 130, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Somme Payé :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(20, 380, 110, 30);

        txtcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcasActionPerformed(evt);
            }
        });
        txtcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcasKeyReleased(evt);
            }
        });
        jPanel3.add(txtcas);
        txtcas.setBounds(140, 380, 130, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(140, 440, 350, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Total ");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(270, 350, 110, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setText("annuler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(140, 480, 350, 30);

        jTable_client.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_client);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(30, 0, 600, 100);

        tbl_ven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produit", "Désignation", "Prix Unitaire", "Quantité", "Montant"
            }
        ));
        jScrollPane2.setViewportView(tbl_ven);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(0, 220, 550, 130);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(370, 150, 640, 550);

        jPanel4.setBackground(new java.awt.Color(253, 230, 250));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setText("Vente");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl1.setText("jLabel12");

        lbl2.setText("jLabel17");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(360, 710, 630, 70);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("MONTANT:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 720, 110, 30);

        lbltot1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot1.setText("0");
        getContentPane().add(lbltot1);
        lbltot1.setBounds(170, 720, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Recu_achat n = new Recu_achat();
        n.setVisible(true);
        
        payaprés();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void txtrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrefActionPerformed

    private void txtpriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriActionPerformed

    private void txtremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtremActionPerformed

    private void txtnouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnouActionPerformed

    private void txtstoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoActionPerformed
//Rechercheproduit
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP completez le champ de recherche");
        } else {
            if (comrech.getSelectedItem().equals("ID_Produit")) {
                String colon[] = {"ID_Produit","Désignation","Prix","Quantité_Stockée"};
                rs = db.fcSelectCommand(colon, "produit", "ID_Produit LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Désignation")) {
                String colon[] = {"ID_Produit","Désignation","Prix","Quantité_Stockée"};
                rs = db.fcSelectCommand(colon, "produit", "Désignation LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Prix")) {
                String colon[] = {"ID_Produit","Désignation","Prix","Quantité_Stockée"};
                rs = db.fcSelectCommand(colon, "produit", "Prix LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
                } else if (comrech.getSelectedItem().equals("Quantité_Stockée")) {
                String colon[] = {"ID_Produit","Désignation","Prix","Quantité_Stockée"};
                rs = db.fcSelectCommand(colon, "produit", "Quantité_Stockée LIKE '" + txtrech.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            } 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_venteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venteActionPerformed
int pay;
				
				
				if (txtcas.getText().equals("")) {
						pay = 0;
					JOptionPane.showMessageDialog(null, "Veuillez saisir la somme reçue ");
				}else {
					// pay = Integer.parseInt(txttot.getText());
		         add();
			}
				//int subtotal = Integer.parseInt(txtcas.getText());
				////int bal = pay-subtotal;
				//txtpay.setText(String.valueOf(bal));

    }//GEN-LAST:event_btn_venteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*String invoice = txtfac.getText();
        if (JOptionPane.showConfirmDialog(this,"est ce que tu es sure que tu veux supprimer ","attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("achat", "id=" + invoice);
        } else {
            return;
        }
        
        importer();*/
       // total();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtstoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstoKeyReleased
 subtotal();        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoKeyReleased

    private void txtcasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcasKeyReleased
payaprés();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcasKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     table();
     client();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void comrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comrechActionPerformed

    private void txtcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcasActionPerformed

    private void tbl_resMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_resMouseClicked
        txtcod.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 0)));
        txtref.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 1)));
        //txtran.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), )));
        //txtrem.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 5)));
        txtpri.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 2)));
        cout();
    }//GEN-LAST:event_tbl_resMouseClicked

    private void jTable_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientMouseClicked
        int a=jTable_client.getSelectedRow();
        String spt1= jTable_client.getValueAt(a, 0).toString(); txtidclient.setText(spt1);
    }//GEN-LAST:event_jTable_clientMouseClicked

    private void txtidclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclientActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        txtidclient.setText("");
        txtcod.setText("");
        txtref.setText("");
        txtrem.setText("");
        txtpri.setText("");
        txtnou.setText("");
        txtsto.setText("");
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        txtidclient.setText("");
        txtcod.setText("");
        txtref.setText("");
        txtrem.setText("");
        txtpri.setText("");
        txtnou.setText("");
        txtsto.setText("");
    }//GEN-LAST:event_jPanel1MouseClicked

    public void add() {
	try {
		Connection con = null;
		PreparedStatement stm ;
		PreparedStatement stm1 ;
		PreparedStatement stm2 ;

		//DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	//LocalDateTime now = LocalDateTime.now();
	//String date = dt.format(now);
	
		String idclient,idprod, des;
		String price,qty;
		
		int total ;
	String subtotal = txttot.getText();
	String pay = txtcas.getText();
	String bal = txtpay.getText();
	
		String query2 = "insert into achat( ID_Client, ID_Produit, reference, prix_vente, stock_sortie, Total) values(?,?,?,?,?,?)";
		stm1 = ConnexionDB.connexion().prepareStatement(query2);
		for(int i=0; i< tbl_ven.getRowCount(); i++) {
                        idprod = (String)tbl_ven.getValueAt(i, 0);
                        des = (String) tbl_ven.getValueAt(i, 1);
			price = (String)tbl_ven.getValueAt(i, 2);
			qty = (String)tbl_ven.getValueAt(i, 3);
			total = (int)tbl_ven.getValueAt(i, 4);
                        idclient = txtidclient.getText();
                        
			stm1.setString(1, idclient);
			stm1.setString(2, idprod);
			stm1.setString(4, price);
			stm1.setString(3, des);
			stm1.setInt(6, total);
                        stm1.setString(5, qty);
			//stm1.setString(5, date);	
		     stm1.executeUpdate();	
				//txttcost.setText("");
				//txtbal.setText("");
				//txtpay.setText("");
				//JOptionPane.showMessageDialog(null,"ventes effectuée avec succès!! ");
			}
		
		
			JOptionPane.showMessageDialog(null,"ventes effectuée avec succès!! ");
			String query3 = "update produit set Quantité_stockée = Quantité_stockée - ? WHERE ID_Produit =?";
			stm2 = ConnexionDB.connexion().prepareStatement(query3);
			for(int k = 0; k<tbl_ven.getRowCount(); k++) {
				
				idprod = (String)tbl_ven.getValueAt(k, 0);
				qty = (String)tbl_ven.getValueAt(k, 3);
				
				stm2.setString(1, qty);
				stm2.setString(2, idprod);
				stm2.executeUpdate();
			
		}
		
		
	} catch (SQLException e) { 
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
    
    
    private void btn_ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajoutActionPerformed

		String pcode = txtcod.getText();
		try {
		
                        Connection con = null;
                ResultSet resultat = null;
                PreparedStatement ps = null;
                   con = ConnexionDB.connexion();
                   ps = con.prepareStatement("select*from produit where ID_Produit = ?");
                   ps.setString(1, pcode);
                   resultat=ps.executeQuery();
		 while (resultat.next())
			{
				int currentqty;
				currentqty = resultat.getInt("Quantité_stockée");
				
				int price = Integer.parseInt(txtnou.getText());
				int qty = Integer.parseInt(txtsto.getText().toString());
				
				int tot = price * qty;
				
				
				if (qty>=currentqty)
				{
					JOptionPane.showMessageDialog(null,"Quantite indisponible en Stock! ");	
				}
				else {
					DefaultTableModel model = new DefaultTableModel();
					model = (DefaultTableModel)tbl_ven.getModel();
					model.addRow(new Object[] 
							{
						txtcod.getText(),
						txtref.getText(),
						txtnou.getText(),
						txtsto.getText(),
						tot
				
							});
					
				}
				
			}
                		
		int sum = 0;
		
		for(int i = 0; i<tbl_ven.getRowCount(); i++) {
			
			sum = sum + Integer.parseInt(tbl_ven.getValueAt(i, 4).toString());
			
		
			txttot.setText(String.valueOf(sum));
		}
		
		
		txtcod.setText("");
		txtref.setText("");
		txtnou.setText("");
		txtsto.setText("");

	
	
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}        

    }//GEN-LAST:event_btn_ajoutActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void cout() {
        int a =  Integer.parseInt(txtpri.getText());
        int b = Integer.parseInt(txtrem.getText());
        int remise = a * b/100;
        int c = a - remise;
        txtnou.setText(String.valueOf(c));
    }
     public void subtotal() {
        double a = Double.parseDouble(txtnou.getText());
        double b = Double.parseDouble(txtsto.getText());
        double c = a * b;
        lbltot1.setText(String.valueOf(c));}
     
     /* public void total() {
        rs = db.exécutionQuery("SELECT SUM(Total) as Total FROM achat WHERE id");
        try {
            rs.next();
            txttot.setText(rs.getString("Total"));
        } catch (SQLException ex) {
            Logger.getLogger(Vente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
       public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("produit","ID_Produit='" + txtcod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Quantité_Stockée");
        }
        dec = Integer.parseInt(txtsto.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;
    }

    public void def() throws SQLException {
        rs = db.querySelectAll("produit", "ID_Produit='" + txtcod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Quantité_Stockée");
        }
        dec = Integer.parseInt(txtsto.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"Quantité_Stockée"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produit", colon, isi, "ID_Produit='" + txtcod.getText() + "'"));
    }
    
    

    public void payaprés() {
        int a = Integer.parseInt(txttot.getText());
        int b = Integer.parseInt(txtcas.getText());
        int c = b - a;
        txtpay.setText(Integer.toString(c));
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
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_ajout;
    public static javax.swing.JButton btn_vente;
    public static javax.swing.JComboBox comrech;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_client;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbltot1;
    public static javax.swing.JTable tbl_res;
    private javax.swing.JTable tbl_ven;
    public static javax.swing.JTextField txtcas;
    public static javax.swing.JTextField txtcod;
    public static javax.swing.JTextField txtidclient;
    public static javax.swing.JTextField txtnou;
    public static javax.swing.JTextField txtpay;
    public static javax.swing.JTextField txtpri;
    public static javax.swing.JTextField txtrech;
    public static javax.swing.JTextField txtref;
    public static javax.swing.JTextField txtrem;
    public static javax.swing.JTextField txtsto;
    public static javax.swing.JLabel txttot;
    // End of variables declaration//GEN-END:variables
}
