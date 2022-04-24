/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava2;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*; 
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.MessageFormat;
import org.jfree.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
public class acceuil extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    public acceuil() {
        initComponents();
        affichagepanel(titre);
        affichagepanelcentre(acceuil) ; 
        
    }

   public void affichagepanel (JPanel panel) {
       tache.removeAll(); 
       tache.add(panel) ; 
       tache.repaint();
       tache.revalidate();}
   public void affichagepanelcentre (JPanel panel) {
         affichage.removeAll(); 
         affichage.add(panel) ; 
         affichage.repaint();
         affichage.revalidate();}
   
   
   public void affichergouver(){
  DefaultTableModel table1 = (DefaultTableModel) table.getModel(); 
 
       try{
   String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ;
    Statement stmt = con.createStatement( );
    SimpleDateFormat dr = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = dr.format(date.getDate()) ; 
     String SQL = "SELECT * FROM datepays1 d , gouvernorat g WHERE d.num_g = ? AND d.date1=? AND g.id_g= ? ";
     PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setInt(1,listgouver.getSelectedIndex());
     ps.setString(2,date1);
     ps.setInt(3,listgouver.getSelectedIndex());
     ResultSet rs = ps.executeQuery();
     int actif=0;
     String nb_act;
     
      int x=table1.getRowCount();
     for(int i=0;i<x;i++)
     {table1.removeRow(0);}
     
     while (rs.next()){
         actif = rs.getInt("nbr_t")-rs.getInt("nbr_deces")-rs.getInt("nbr_gueris") ;
         nb_act=""+actif;
         String[] ch ={ rs.getString("nom_g"),rs.getString("nbr_t"),rs.getString("nbr_n_cas"),rs.getString("nbr_deces"),rs.getString("nbr_gueris"),nb_act} ; 
     table1.addRow(ch);}
      }
       catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());
           
           
       }}
   

    
   
   
   
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        consulterpays = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        suivre = new javax.swing.JButton();
        consulter = new javax.swing.JButton();
        acceuil1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        suivre1 = new javax.swing.JButton();
        suivre2 = new javax.swing.JButton();
        tache = new javax.swing.JPanel();
        titre = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        consult = new javax.swing.JPanel();
        infogouver = new javax.swing.JButton();
        infopays = new javax.swing.JButton();
        infogouver1 = new javax.swing.JButton();
        suiv = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        affichage = new javax.swing.JPanel();
        listhosp = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        acceuil2 = new javax.swing.JButton();
        acceuil3 = new javax.swing.JButton();
        acceuil4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        list_gouv = new javax.swing.JComboBox();
        listepays = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        infopays1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        acceuil5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        acceuil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        acceuil10 = new javax.swing.JButton();
        acceuil11 = new javax.swing.JButton();
        acceuil12 = new javax.swing.JButton();
        listegouv = new javax.swing.JPanel();
        infopays2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        listgouver = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        infopays4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        date = new com.toedter.calendar.JDateChooser();
        infopays7 = new javax.swing.JButton();
        consultermonde = new javax.swing.JPanel();
        acceuil6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        infopays3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        datep = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablep = new javax.swing.JTable();
        choixpays = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        infopays5 = new javax.swing.JButton();
        infopays6 = new javax.swing.JButton();
        datepays = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablepays = new javax.swing.JTable();
        listpays = new javax.swing.JComboBox();

        jFormattedTextField1.setText("jFormattedTextField1");

        consulterpays.setBackground(new java.awt.Color(26, 25, 62));

        javax.swing.GroupLayout consulterpaysLayout = new javax.swing.GroupLayout(consulterpays);
        consulterpays.setLayout(consulterpaysLayout);
        consulterpaysLayout.setHorizontalGroup(
            consulterpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1308, Short.MAX_VALUE)
        );
        consulterpaysLayout.setVerticalGroup(
            consulterpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(31, 30, 68));

        suivre.setBackground(new java.awt.Color(31, 30, 68));
        suivre.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        suivre.setForeground(new java.awt.Color(255, 255, 255));
        suivre.setText(" SUIVI PANDEMIE DANS LE MONDE");
        suivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivreActionPerformed(evt);
            }
        });

        consulter.setBackground(new java.awt.Color(31, 30, 68));
        consulter.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        consulter.setForeground(new java.awt.Color(255, 255, 255));
        consulter.setText("SUIVI PANDEMIE EN TUNISIE");
        consulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterActionPerformed(evt);
            }
        });

        acceuil1.setBackground(new java.awt.Color(31, 30, 68));
        acceuil1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil1.setForeground(new java.awt.Color(255, 255, 255));
        acceuil1.setText("ACCEUIL");
        acceuil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava2/logo.jpg"))); // NOI18N

        suivre1.setBackground(new java.awt.Color(31, 30, 68));
        suivre1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        suivre1.setForeground(new java.awt.Color(255, 255, 255));
        suivre1.setText("QUITTER");
        suivre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivre1ActionPerformed(evt);
            }
        });

        suivre2.setBackground(new java.awt.Color(31, 30, 68));
        suivre2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        suivre2.setForeground(new java.awt.Color(255, 255, 255));
        suivre2.setText("CONNECTER TANT QUE ADMIN");
        suivre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivre2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suivre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suivre2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(consulter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceuil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suivre, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(acceuil1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(consulter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(suivre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(suivre2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(suivre1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel4.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 680));

        tache.setBackground(new java.awt.Color(26, 25, 62));

        titre.setBackground(new java.awt.Color(26, 25, 62));

        jLabel3.setBackground(new java.awt.Color(36, 241, 224));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 241, 224));
        jLabel3.setText("BIENVENUE DANS CORON.APP");

        javax.swing.GroupLayout titreLayout = new javax.swing.GroupLayout(titre);
        titre.setLayout(titreLayout);
        titreLayout.setHorizontalGroup(
            titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titreLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        titreLayout.setVerticalGroup(
            titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        consult.setBackground(new java.awt.Color(26, 25, 62));

        infogouver.setBackground(new java.awt.Color(26, 25, 62));
        infogouver.setForeground(new java.awt.Color(255, 255, 255));
        infogouver.setText("LES INFORMATIONS DU GOUVERNORAT");
        infogouver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infogouverActionPerformed(evt);
            }
        });

        infopays.setBackground(new java.awt.Color(26, 25, 62));
        infopays.setForeground(new java.awt.Color(255, 255, 255));
        infopays.setText("CONSULTER LES INFORMATIONS EN TUNISIE");
        infopays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopaysActionPerformed(evt);
            }
        });

        infogouver1.setBackground(new java.awt.Color(26, 25, 62));
        infogouver1.setForeground(new java.awt.Color(255, 255, 255));
        infogouver1.setText("CONSULTER LES INFORMATIONS DES HOPITAUX");
        infogouver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infogouver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultLayout = new javax.swing.GroupLayout(consult);
        consult.setLayout(consultLayout);
        consultLayout.setHorizontalGroup(
            consultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultLayout.createSequentialGroup()
                .addGroup(consultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infopays)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infogouver))
                    .addGroup(consultLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(infogouver1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        consultLayout.setVerticalGroup(
            consultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(consultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infopays)
                    .addComponent(infogouver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infogouver1)
                .addGap(7, 7, 7))
        );

        suiv.setBackground(new java.awt.Color(26, 25, 62));

        jButton1.setBackground(new java.awt.Color(26, 25, 62));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LES INFORMATIONS SUR TOUT LES PAYS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(26, 25, 62));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LES INFORMATIONS SUR UNE PAYS SELECTIONNER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suivLayout = new javax.swing.GroupLayout(suiv);
        suiv.setLayout(suivLayout);
        suivLayout.setHorizontalGroup(
            suivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suivLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(suivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        suivLayout.setVerticalGroup(
            suivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suivLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout tacheLayout = new javax.swing.GroupLayout(tache);
        tache.setLayout(tacheLayout);
        tacheLayout.setHorizontalGroup(
            tacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tacheLayout.createSequentialGroup()
                .addComponent(suiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 193, Short.MAX_VALUE))
            .addGroup(tacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tacheLayout.createSequentialGroup()
                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 190, Short.MAX_VALUE)))
            .addGroup(tacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tacheLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        tacheLayout.setVerticalGroup(
            tacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tacheLayout.createSequentialGroup()
                .addComponent(suiv, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(tacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tacheLayout.createSequentialGroup()
                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 16, Short.MAX_VALUE)))
            .addGroup(tacheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tacheLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(tache, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 750, 80));

        jPanel6.setBackground(new java.awt.Color(26, 24, 58));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 750, 10));

        affichage.setBackground(new java.awt.Color(34, 33, 74));

        listhosp.setBackground(new java.awt.Color(34, 33, 74));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava2/hopital.jpg"))); // NOI18N

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Nombre de cas actif", "Nombre des lits disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        acceuil2.setBackground(new java.awt.Color(31, 30, 68));
        acceuil2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil2.setForeground(new java.awt.Color(255, 255, 255));
        acceuil2.setText("AFFICHER LES INFORMATION");
        acceuil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil2ActionPerformed(evt);
            }
        });

        acceuil3.setBackground(new java.awt.Color(31, 30, 68));
        acceuil3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil3.setForeground(new java.awt.Color(255, 255, 255));
        acceuil3.setText("imprimer les données");
        acceuil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil3ActionPerformed(evt);
            }
        });

        acceuil4.setBackground(new java.awt.Color(31, 30, 68));
        acceuil4.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil4.setForeground(new java.awt.Color(255, 255, 255));
        acceuil4.setText("Imprimer dans un fichier");
        acceuil4.setToolTipText("");
        acceuil4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil4ActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(36, 241, 224));
        jLabel21.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 241, 224));
        jLabel21.setText("consulter les informations des hopitaux  ");

        jLabel22.setBackground(new java.awt.Color(36, 241, 224));
        jLabel22.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(36, 241, 224));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Selectionner un gouvernorat");

        list_gouv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ariana", "Béja\t", "Ben Arous", "Bizerte\t", "Gabès\t", "Gafsa\t", "Jendouba\t", "Kairouan\t", "Kasserine", "Kébili\t", "Le Kef\t", "Mahdia\t", "La Manouba\t", "Médenine\t", "Monastir\t", "Nabeul\t", "Sfax\t", "Sidi Bouzid\t", "Siliana\t", "Sousse\t", "Tataouine\t", "Tozeur\t", "Tunis\t", "Zaghouan" }));

        javax.swing.GroupLayout listhospLayout = new javax.swing.GroupLayout(listhosp);
        listhosp.setLayout(listhospLayout);
        listhospLayout.setHorizontalGroup(
            listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listhospLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listhospLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGroup(listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listhospLayout.createSequentialGroup()
                                .addGap(398, 398, 398)
                                .addComponent(jLabel22))
                            .addGroup(listhospLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))))
                    .addGroup(listhospLayout.createSequentialGroup()
                        .addGroup(listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acceuil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceuil4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceuil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
            .addGroup(listhospLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(listhospLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(list_gouv, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listhospLayout.setVerticalGroup(
            listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listhospLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addGroup(listhospLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addGap(31, 31, 31)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(listhospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listhospLayout.createSequentialGroup()
                        .addComponent(list_gouv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(acceuil2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(acceuil3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acceuil4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        listepays.setBackground(new java.awt.Color(34, 33, 74));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATE :  ");

        jLabel12.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOMBRE TOTAL DES CAS");

        jLabel13.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EN TUNISIE");

        infopays1.setBackground(new java.awt.Color(26, 25, 62));
        infopays1.setForeground(new java.awt.Color(255, 255, 255));
        infopays1.setText("AFFICHER LES INFORMATIONS");
        infopays1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays1ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(36, 241, 224));
        jLabel14.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 241, 224));
        jLabel14.setText("Consulter les informations générales ");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava2/Tunisia.jpg"))); // NOI18N

        acceuil5.setBackground(new java.awt.Color(31, 30, 68));
        acceuil5.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil5.setForeground(new java.awt.Color(255, 255, 255));
        acceuil5.setText("IMPRIMER LES DONNEES");
        acceuil5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE TOTAL", "NOMBRE GUERIS", "NOMBRE DECES", "NOUVEAU CAS", "NOMBRE CAS ACTIF", "NOMBRE DE TESTS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout listepaysLayout = new javax.swing.GroupLayout(listepays);
        listepays.setLayout(listepaysLayout);
        listepaysLayout.setHorizontalGroup(
            listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listepaysLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listepaysLayout.createSequentialGroup()
                        .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(listepaysLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(listepaysLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14)
                            .addGroup(listepaysLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infopays1)
                                    .addComponent(acceuil5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(listepaysLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel15)
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(488, Short.MAX_VALUE))
        );
        listepaysLayout.setVerticalGroup(
            listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listepaysLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(listepaysLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16)
                        .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listepaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listepaysLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(listepaysLayout.createSequentialGroup()
                        .addComponent(infopays1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acceuil5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        acceuil.setBackground(new java.awt.Color(34, 33, 74));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE TOTAL DES CAS");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DANS LE MONDE");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava2/monde.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE TOTAL DES CAS");

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EN TUNISIE");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava2/Tunisia.jpg"))); // NOI18N

        acceuil10.setBackground(new java.awt.Color(31, 30, 68));
        acceuil10.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil10.setForeground(new java.awt.Color(255, 255, 255));
        acceuil10.setText("Afficher evolution");
        acceuil10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil10ActionPerformed(evt);
            }
        });

        acceuil11.setBackground(new java.awt.Color(31, 30, 68));
        acceuil11.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil11.setForeground(new java.awt.Color(255, 255, 255));
        acceuil11.setText("Afficher participation de chaque gouvernorat");
        acceuil11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil11ActionPerformed(evt);
            }
        });

        acceuil12.setBackground(new java.awt.Color(31, 30, 68));
        acceuil12.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        acceuil12.setForeground(new java.awt.Color(255, 255, 255));
        acceuil12.setText("Afficher part de chaque pays");
        acceuil12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acceuilLayout = new javax.swing.GroupLayout(acceuil);
        acceuil.setLayout(acceuilLayout);
        acceuilLayout.setHorizontalGroup(
            acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceuilLayout.createSequentialGroup()
                .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acceuilLayout.createSequentialGroup()
                        .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(acceuilLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel9)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acceuilLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(acceuilLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)))
                        .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(acceuilLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(acceuilLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acceuil11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceuil10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceuil12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(741, Short.MAX_VALUE))
        );
        acceuilLayout.setVerticalGroup(
            acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceuilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(acceuilLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(acceuilLayout.createSequentialGroup()
                        .addGroup(acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(acceuil10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceuil11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceuil12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        listegouv.setBackground(new java.awt.Color(34, 33, 74));
        listegouv.setMaximumSize(new java.awt.Dimension(100, 100));

        infopays2.setBackground(new java.awt.Color(26, 25, 62));
        infopays2.setForeground(new java.awt.Color(255, 255, 255));
        infopays2.setText("IMPRIMER LES DONNEES");
        infopays2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays2ActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(36, 241, 224));
        jLabel19.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(36, 241, 224));
        jLabel19.setText("consulter les informations pour un gouvernorat déterminé  ");

        listgouver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ariana", "Béja\t", "Ben Arous", "Bizerte\t", "Gabès\t", "Gafsa\t", "Jendouba\t", "Kairouan\t", "Kasserine", "Kébili\t", "Le Kef\t", "Mahdia\t", "La Manouba\t", "Médenine\t", "Monastir\t", "Nabeul\t", "Sfax\t", "Sidi Bouzid\t", "Siliana\t", "Sousse\t", "Tataouine\t", "Tozeur\t", "Tunis\t", "Zaghouan" }));

        jLabel20.setBackground(new java.awt.Color(36, 241, 224));
        jLabel20.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(36, 241, 224));

        infopays4.setBackground(new java.awt.Color(26, 25, 62));
        infopays4.setForeground(new java.awt.Color(255, 255, 255));
        infopays4.setText("AFFICHER LES INFORMATIONS");
        infopays4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "NOMBRE DE CAS TOTAL", "NOMBRE DE NOUVEAUX CAS", "NOMBRE DES DECES", "NOMBRE GUERIS", "NOMBRE DE CAS ACTIFS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        infopays7.setBackground(new java.awt.Color(26, 25, 62));
        infopays7.setForeground(new java.awt.Color(255, 255, 255));
        infopays7.setText("IMPRIMER LES DONNEES DANS UN FICHIER ");
        infopays7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listegouvLayout = new javax.swing.GroupLayout(listegouv);
        listegouv.setLayout(listegouvLayout);
        listegouvLayout.setHorizontalGroup(
            listegouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listegouvLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(694, 694, 694))
            .addGroup(listegouvLayout.createSequentialGroup()
                .addGroup(listegouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listegouvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addGroup(listegouvLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listegouvLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(listgouver, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(infopays4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(infopays2))
                    .addGroup(listegouvLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listegouvLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(infopays7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listegouvLayout.setVerticalGroup(
            listegouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listegouvLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(13, 13, 13)
                .addGroup(listegouvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listgouver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infopays4)
                    .addComponent(infopays2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infopays7)
                .addGap(150, 150, 150))
        );

        consultermonde.setBackground(new java.awt.Color(34, 33, 74));

        acceuil6.setBackground(new java.awt.Color(31, 30, 68));
        acceuil6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acceuil6.setForeground(new java.awt.Color(255, 255, 255));
        acceuil6.setText("imprimer les données");
        acceuil6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceuil6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATE :  ");

        infopays3.setBackground(new java.awt.Color(26, 25, 62));
        infopays3.setForeground(new java.awt.Color(255, 255, 255));
        infopays3.setText("AFFICHER LES INFORMATIONS");
        infopays3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays3ActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(36, 241, 224));
        jLabel24.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(36, 241, 224));
        jLabel24.setText("Consulter la situation globale des pays du monde");

        jLabel17.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NOMBRE TOTAL DES CAS");

        jLabel25.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DANS LE MONDE");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava2/monde.jpg"))); // NOI18N

        tablep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "NOMBRE TOTAL", "NOMBRE GUERIS", "NOMBRE DECES", "NOMBRE DE NOUVEAU CAS"
            }
        ));
        jScrollPane7.setViewportView(tablep);

        javax.swing.GroupLayout consultermondeLayout = new javax.swing.GroupLayout(consultermonde);
        consultermonde.setLayout(consultermondeLayout);
        consultermondeLayout.setHorizontalGroup(
            consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultermondeLayout.createSequentialGroup()
                .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultermondeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(consultermondeLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(consultermondeLayout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))))
                        .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultermondeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(datep, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(consultermondeLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(acceuil6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(infopays3)))
                            .addGroup(consultermondeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(consultermondeLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel24)))
                .addContainerGap(531, Short.MAX_VALUE))
        );
        consultermondeLayout.setVerticalGroup(
            consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultermondeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(consultermondeLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultermondeLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(consultermondeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(datep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(infopays3))
                .addGroup(consultermondeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultermondeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultermondeLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(acceuil6)))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        choixpays.setBackground(new java.awt.Color(34, 33, 74));
        choixpays.setPreferredSize(new java.awt.Dimension(750, 590));

        jLabel23.setBackground(new java.awt.Color(36, 241, 224));
        jLabel23.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(36, 241, 224));
        jLabel23.setText("consulter les informations pour une pays déterminé  ");

        infopays5.setBackground(new java.awt.Color(26, 25, 62));
        infopays5.setForeground(new java.awt.Color(255, 255, 255));
        infopays5.setText("AFFICHER LES INFORMATIONS");
        infopays5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays5ActionPerformed(evt);
            }
        });

        infopays6.setBackground(new java.awt.Color(26, 25, 62));
        infopays6.setForeground(new java.awt.Color(255, 255, 255));
        infopays6.setText("IMPRIMER LES DONNEES");
        infopays6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infopays6ActionPerformed(evt);
            }
        });

        tablepays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", " NOMBRE DE CAS TOTAL", "NOMBRE GUERIS", "NOMBRE DECES", "NOMBRE DE NOUVEAU CAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablepays);

        listpays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Afrique du Sud", "Akrotiri", "Albanie", "Algérie", "Allemagne", "Andorre", "Angola", "Anguilla", "Antarctique", "Antigua-et-Barbuda", "Arabie saoudite", "Arctic Ocean", "Argentine", "Arménie", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Australie", "Autriche", "Azerbaïdjan", "Bahamas", "Bahreïn", "Bangladesh", "Barbade", "Belau", "Belgique", "Belize", "Bénin", "Bermudes", "Bhoutan", "Biélorussie", "Birmanie", "Bolivie", "Bosnie-Herzégovine", "Botswana", "Brésil", "Brunei", "Bulgarie", "Burkina Faso", "Burundi", "Cambodge", "Cameroun", "Canada", "Cap-Vert", "Chili", "Chine", "Chypre", "Clipperton Island", "Colombie", "Comores", "Congo", "Coral Sea Islands", "Corée du Nord", "Corée du Sud", "Costa Rica", "Côte d'Ivoire", "Croatie", "Cuba", "Curacao", "Danemark", "Dhekelia", "Djibouti", "Dominique", "Égypte", "Émirats arabes unis", "Équateur", "Érythrée", "Espagne", "Estonie", "États-Unis", "Éthiopie", "ex-République yougoslave de Macédoine", "Finlande", "France", "Gabon", "Gambie", "Gaza Strip", "Géorgie", "Ghana", "Gibraltar", "Grèce", "Grenade", "Groenland", "Guam", "Guatemala", "Guernsey", "Guinée", "Guinée équatoriale", "Guinée-Bissao", "Guyana", "Haïti", "Honduras", "Hong Kong", "Hongrie", "Ile Bouvet", "Ile Christmas", "Ile Norfolk", "Iles Cayman", "Iles Cook", "Iles des Cocos (Keeling)", "Iles Falkland", "Iles Féroé", "Iles Fidji", "Iles Géorgie du Sud et Sandwich du Sud", "Iles Heard et McDonald", "Iles Marshall", "Iles Pitcairn", "Iles Salomon", "Iles Svalbard et Jan Mayen", "Iles Turks-et-Caicos", "Iles Vierges américaines", "Iles Vierges britanniques", "Inde", "Indian Ocean", "Indonésie", "Iran", "Iraq", "Irlande", "Islande", "Israël", "Italie", "Jamaïque", "Jan Mayen", "Japon", "Jersey", "Jordanie", "Kazakhstan", "Kenya", "Kirghizistan", "Kiribati", "Kosovo", "Koweït", "Laos", "Lesotho", "Lettonie", "Liban", "Liberia", "Libye", "Liechtenstein", "Lituanie", "Luxembourg", "Macao", "Madagascar", "Malaisie", "Malawi", "Maldives", "Mali", "Malte", "Man, Isle of", "Mariannes du Nord", "Maroc", "Maurice", "Mauritanie", "Mexique", "Micronésie", "Moldavie", "Monaco", "Monde", "Mongolie", "Monténégro", "Montserrat", "Mozambique", "Namibie", "Nauru", "Navassa Island", "Népal", "Nicaragua", "Niger", "Nigeria", "Nioué", "Norvège", "Nouvelle-Calédonie", "Nouvelle-Zélande", "Oman", "Ouganda", "Ouzbékistan", "Pacific Ocean", "Pakistan", "Panama", "Papouasie-Nouvelle-Guinée", "Paracel Islands", "Paraguay", "Pays-Bas", "Pérou", "Philippines", "Pologne", "Polynésie française", "Porto Rico", "Portugal", "Qatar", "République centrafricaine", "République démocratique du Congo", "République dominicaine", "Roumanie", "Royaume-Uni", "Russie", "Rwanda", "Sahara occidental", "Saint-Barthélemy", "Saint-Christophe-et-Niévès", "Sainte-Hélène", "Sainte-Lucie", "Saint-Marin", "Saint-Martin", "Saint-Pierre-et-Miquelon", "Saint-Siège", "Saint-Vincent-et-les-Grenadines", "Salvador", "Samoa", "Samoa américaines", "Sao Tomé-et-Principe", "Sénégal", "Serbie", "Seychelles", "Sierra Leone", "Singapour", "Sint Maarten", "Slovaquie", "Slovénie", "Somalie", "Soudan", "Soudan du Sud", "Southern Ocean", "Spratly Islands", "Sri Lanka", "Suède", "Suisse", "Suriname", "Swaziland", "Syrie", "Tadjikistan", "Taïwan", "Tanzanie", "Tchad", "Terres australes françaises", "Territoire britannique de l'Océan Indien", "Thaïlande", "Timor Oriental", "Togo", "Tokélaou", "Tonga", "Trinité-et-Tobago", "Tunisie", "Turkménistan", "Turquie", "Tuvalu", "Ukraine", "Union européenne", "Uruguay", "Vanuatu", "Venezuela", "Viêt Nam", "Wake Island", "Wallis-et-Futuna", "West Bank", "Yémen", "Zambie", "Zimbabwe" }));

        javax.swing.GroupLayout choixpaysLayout = new javax.swing.GroupLayout(choixpays);
        choixpays.setLayout(choixpaysLayout);
        choixpaysLayout.setHorizontalGroup(
            choixpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choixpaysLayout.createSequentialGroup()
                .addGroup(choixpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(choixpaysLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel23))
                    .addGroup(choixpaysLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(choixpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listpays, 0, 0, Short.MAX_VALUE)
                            .addComponent(datepays, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                    .addGroup(choixpaysLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(choixpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(infopays6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infopays5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(choixpaysLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        choixpaysLayout.setVerticalGroup(
            choixpaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choixpaysLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addGap(70, 70, 70)
                .addComponent(datepays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listpays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(infopays5)
                .addGap(31, 31, 31)
                .addComponent(infopays6)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout affichageLayout = new javax.swing.GroupLayout(affichage);
        affichage.setLayout(affichageLayout);
        affichageLayout.setHorizontalGroup(
            affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acceuil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listepays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listegouv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(consultermonde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(affichageLayout.createSequentialGroup()
                    .addComponent(choixpays, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 527, Short.MAX_VALUE)))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, affichageLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listhosp, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(571, Short.MAX_VALUE)))
        );
        affichageLayout.setVerticalGroup(
            affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(acceuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listepays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listegouv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(consultermonde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(affichageLayout.createSequentialGroup()
                    .addComponent(choixpays, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(affichageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, affichageLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(listhosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.add(affichage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 750, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceuil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil1ActionPerformed
       affichagepanel(titre);
       affichagepanelcentre(acceuil) ; 
       
    }//GEN-LAST:event_acceuil1ActionPerformed

    private void consulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterActionPerformed
        affichagepanel(consult) ; 
       
        
    }//GEN-LAST:event_consulterActionPerformed

    private void suivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivreActionPerformed
        affichagepanel(suiv);        
    }//GEN-LAST:event_suivreActionPerformed

    private void infopaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopaysActionPerformed
        affichagepanelcentre(listepays);
    }//GEN-LAST:event_infopaysActionPerformed

    private void infogouverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infogouverActionPerformed
        affichagepanelcentre(listegouv);
    
    }//GEN-LAST:event_infogouverActionPerformed

    private void suivre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivre1ActionPerformed
     Voice v ;
     VoiceManager vm =  VoiceManager.getInstance();
     
     v= vm.getVoice("kevin16");
     v.allocate();
     v.speak("Stay home . Stay safe     . Good-bye");
     System.exit(0);
     this.hide();
    }//GEN-LAST:event_suivre1ActionPerformed

    private void suivre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivre2ActionPerformed
        login f1 = new login () ; 
        f1.setVisible(true);
        this.hide() ; 
    }//GEN-LAST:event_suivre2ActionPerformed

    private void infogouver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infogouver1ActionPerformed
        affichagepanelcentre(listhosp);
    }//GEN-LAST:event_infogouver1ActionPerformed

        public void search_tun(){
            
             DefaultTableModel tab_tn = (DefaultTableModel) jTable1.getModel(); 
     try{
   String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ;
   
     SimpleDateFormat dr = new SimpleDateFormat("yyyy-MM-dd");
      
    Statement stmt = con.createStatement( );
    String SQL = "SELECT sum(nbr_n_cas) a,sum(nbr_test) b,sum(nbr_gueris) c,sum(nbr_deces) d,sum(nbr_t) e from datepays1 where date1=?";
      PreparedStatement ps=con.prepareStatement(SQL); 
  // ps.setString(1,dr.format(date1));
        
    ps.setString(1,dr.format(jDateChooser1.getDate()));
     int x=tab_tn.getRowCount();
     for(int i=0;i<x;i++)
     {tab_tn.removeRow(0);}


   ResultSet rs = ps.executeQuery()  ;
     while (rs.next()){ 
        int actif= rs.getInt("e")-rs.getInt("c")-rs.getInt("d");
        String act = ""+actif;
        JOptionPane.showMessageDialog(null, actif);
         String[] ch ={ rs.getString("e"),rs.getString("c"),rs.getString("d"),rs.getString("a"),rs.getString("b"),act} ; 
     tab_tn.addRow(ch);
     }
   
   }  catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());
           
           
       }}
    private void infopays1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays1ActionPerformed
         search_tun();
    }//GEN-LAST:event_infopays1ActionPerformed

    
    
          public void search(){
            
             DefaultTableModel tab_hop1 = (DefaultTableModel) jTable3.getModel(); 
     try{
   String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ;
    Statement stmt = con.createStatement( );
    String SQL = "SELECT nom_hosp,nbr_cas_hosp,nbr_lits_dispo from hopital where num_g=?";
      PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setInt(1,list_gouv.getSelectedIndex());
   
     int x=tab_hop1.getRowCount();
     for(int i=0;i<x;i++)
     {tab_hop1.removeRow(0);}
    

   ResultSet rs = ps.executeQuery()  ;
     while (rs.next()){
         String[] ch ={ rs.getString("nom_hosp"),rs.getString("nbr_cas_hosp"),rs.getString("nbr_lits_dispo")} ; 
     tab_hop1.addRow(ch);
     }
   
   }  catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());
           
           
       }}
    private void acceuil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil2ActionPerformed
       search();
    }//GEN-LAST:event_acceuil2ActionPerformed

    private void acceuil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil3ActionPerformed
         MessageFormat header = new MessageFormat("Les informations sur les hopitaux "+list_gouv.getSelectedItem());
       MessageFormat footer = new MessageFormat("");
       try {
           jTable3.print(JTable.PrintMode.NORMAL,header,footer);
       }
       catch(java.awt.print.PrinterException e) {
           System.err.format("Cannot print %s%n",e.getMessage());
       }
    }//GEN-LAST:event_acceuil3ActionPerformed

    private void acceuil4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil4ActionPerformed
    PrintWriter writer = null;
           
         try {
           writer = new PrintWriter(new FileWriter("hopitaux.txt"));
            writer.println("Les Hopitaux dans le gouvernorat  "+list_gouv.getSelectedItem()+ " sont"); 
          
           

            
            String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ; 
    
   String SQL = "SELECT nom_hosp,nbr_cas_hosp,nbr_lits_dispo from hopital where num_g=?";
      PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setInt(1,list_gouv.getSelectedIndex());
     ResultSet rs = ps.executeQuery();
     
      while (rs.next()){
       
      
       writer.print("L'hopital :  "+rs.getString("nom_hosp") ); 
       writer.print(" contient un nombre d'infecté égal à   "+rs.getString("nom_hosp")); 
       writer.println("ce qui resulte un nombre de lits disponibles égale à  "+rs.getString("nom_hosp")); 
      
      
      } 
          
            writer.close();
           JOptionPane.showMessageDialog(null,"Creation du fichier gouvernorats reussite");

         } 
         catch (Exception e)
         {
             
         }
    }//GEN-LAST:event_acceuil4ActionPerformed

    private void acceuil5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil5ActionPerformed
       MessageFormat header = new MessageFormat("Les informations sur les hopitaux "+list_gouv.getSelectedItem());
       MessageFormat footer = new MessageFormat("");
       try {
           jTable1.print(JTable.PrintMode.NORMAL,header,footer);
       }
       catch(java.awt.print.PrinterException e) {
           System.err.format("Cannot print %s%n",e.getMessage());
       }
    }//GEN-LAST:event_acceuil5ActionPerformed

    private void acceuil6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil6ActionPerformed
    MessageFormat header = new MessageFormat("Les informations sur les hopitaux "+list_gouv.getSelectedItem());
       MessageFormat footer = new MessageFormat("");
       try {
           tablep.print(JTable.PrintMode.NORMAL,header,footer);
       }
       catch(java.awt.print.PrinterException e) {
           System.err.format("Cannot print %s%n",e.getMessage());
       }
    }//GEN-LAST:event_acceuil6ActionPerformed
       
    public boolean exist(){
    
       try{
   String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ;
    Statement stmt = con.createStatement( );
    SimpleDateFormat dr = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = dr.format(datep.getDate()) ; 
    String SQL = "SELECT * FROM datemonde d , pays p   WHERE d.date=? and p.id_pays = d.id_pays   ";
     PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setString(1,date1);
     ResultSet rs = ps.executeQuery();
       return rs.next() ; 
       }
     catch (SQLException e ){
     return false ; 
     }
    
    
    
    }
    
    
    
    
    
    
    public void consultpays(){
  DefaultTableModel table1 = (DefaultTableModel) tablep.getModel(); 
    try{
   String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ;
    Statement stmt = con.createStatement( );
    SimpleDateFormat dr = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = dr.format(datep.getDate()) ; 
    String SQL = "SELECT * FROM datemonde d , pays p   WHERE d.date=? and p.id_pays = d.id_pays   ";
     PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setString(1,date1);
     ResultSet rs = ps.executeQuery();
     if(datep.getDate()==null){
     JOptionPane.showMessageDialog(this,"vous devez choisir une date ") ; 
     }
     else if (exist () == false ){
      JOptionPane.showMessageDialog(this,"PAs d'informations à cette date  ") ; 
     }
     else{ 
         
      
         
         
       
     while (rs.next()){
         String[] ch ={ rs.getString("nom_pays"),rs.getString("nbr_tot"),rs.getString("nbr_gueris"),rs.getString("nbr_deces"),rs.getString("nbr_n_cas")} ; 
     table1.addRow(ch);}
      }}
       catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());
           
           
       }}
    
    private void infopays3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays3ActionPerformed
        consultpays() ; 
    }//GEN-LAST:event_infopays3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      affichagepanelcentre(consultermonde) ; 
    }//GEN-LAST:event_jButton1ActionPerformed

    
      public void afficherpays(){
  DefaultTableModel table1 = (DefaultTableModel) tablepays.getModel(); 
    try{
   String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    
    con = DriverManager.getConnection(host,nom,mdp) ;
    Statement stmt = con.createStatement( );
    SimpleDateFormat dr = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = dr.format(datepays.getDate()) ; 
    
    if(listpays.getSelectedItem()=="Tunisie")
    {
          String SQL1 = "SELECT sum(nbr_n_cas) a,sum(nbr_test) b,sum(nbr_gueris) c,sum(nbr_deces) d,sum(nbr_t) e from datepays1 where date1=?";
      PreparedStatement ps1=con.prepareStatement(SQL1); 
        
    ps1.setString(1,dr.format(datepays.getDate()));
   
   ResultSet rs1 = ps1.executeQuery()  ;
     while (rs1.next()){ 
         String[] ch ={ "Tunisia",rs1.getString("e"),rs1.getString("c"),rs1.getString("d"),rs1.getString("b")} ; 
     table1.addRow(ch);
     }
    }
    else {
    String SQL = "SELECT * FROM datemonde d , pays p WHERE d.id_pays = ? AND d.date=? AND p.id_pays= ? ";
     PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setInt(1,listpays.getSelectedIndex());
     ps.setString(2,date1);
     ps.setInt(3,listpays.getSelectedIndex());
     ResultSet rs = ps.executeQuery();
     
     while (rs.next()){
         String[] ch ={ rs.getString("nom_pays"),rs.getString("nbr_tot"),rs.getString("nbr_gueris"),rs.getString("nbr_deces"),rs.getString("nbr_n_cas")} ; 
     table1.addRow(ch);}
      }
    }
       catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());  
       }
    
    }
   
    
    private void infopays5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays5ActionPerformed
      afficherpays();
    }//GEN-LAST:event_infopays5ActionPerformed

    private void infopays6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays6ActionPerformed
        MessageFormat header = new MessageFormat("Les informations sur les hopitaux "+list_gouv.getSelectedItem());
       MessageFormat footer = new MessageFormat("");
       try {
          tablepays.print(JTable.PrintMode.NORMAL,header,footer);
       }
       catch(java.awt.print.PrinterException e) {
           System.err.format("Cannot print %s%n",e.getMessage());
       }
    }//GEN-LAST:event_infopays6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       affichagepanelcentre(choixpays) ;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void infopays4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays4ActionPerformed
       affichergouver() ; 
    }//GEN-LAST:event_infopays4ActionPerformed

    private void infopays2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays2ActionPerformed
          MessageFormat header = new MessageFormat("Les informations sur gouvernorat "+listgouver.getSelectedItem());
       MessageFormat footer = new MessageFormat("");
       try {
           table.print(JTable.PrintMode.NORMAL,header,footer);
       }
       catch(java.awt.print.PrinterException e) {
           System.err.format("Cannot print %s%n",e.getMessage());
       }
    }//GEN-LAST:event_infopays2ActionPerformed

    private void infopays7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infopays7ActionPerformed
         PrintWriter writer = null;
           
         try {
           writer = new PrintWriter(new FileWriter("gouvernorat.txt"));
         SimpleDateFormat dr = new SimpleDateFormat("yyyy-MM-dd");
          String date1 = dr.format(date.getDate()) ;
            writer.println("Les données du gouvernorat "+listgouver.getSelectedItem()+ " à la date  "+date1+ " sont"); 
          
           

            
            String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    con = DriverManager.getConnection(host,nom,mdp) ;
     String SQL = "SELECT * FROM datepays1 d , gouvernorat g WHERE d.num_g = ? AND d.date1=? AND g.id_g= ? ";
     PreparedStatement ps=con.prepareStatement(SQL); 
     ps.setInt(1,listgouver.getSelectedIndex());
     ps.setString(2,date1);
     ps.setInt(3,listgouver.getSelectedIndex());
     ResultSet rs = ps.executeQuery();
     int actif=0;
     int nb_tot=0,nb_gue=0,nb_dec=0;
     
     
     while (rs.next()){
         actif = rs.getInt("nbr_t")-rs.getInt("nbr_deces")-rs.getInt("nbr_gueris") ;
         nb_tot=rs.getInt("nbr_t");
         nb_gue=rs.getInt("nbr_gueris") ;
         nb_dec =rs.getInt("nbr_deces");
     }
 
                JOptionPane.showMessageDialog(null,actif);

     
       writer.println("Le nombre total de cas est :  "+nb_tot); 
       writer.println("Les cas gueris est :  "+nb_gue); 
       writer.println("Le nombre de deces est :  "+nb_dec); 
       writer.println("Ce qui resulte un nombre de cas actif  "+actif); 

            
            writer.close();
           JOptionPane.showMessageDialog(null,"Creation du fichier gouvernorats reussite");

         } 
         catch (Exception e)
         {
             
         }
    }//GEN-LAST:event_infopays7ActionPerformed

    private void acceuil10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil10ActionPerformed
       DefaultCategoryDataset barchatdata = new DefaultCategoryDataset(); 
      try {
             String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    
    con = DriverManager.getConnection(host,nom,mdp) ;
      
    String SQL1 = "SELECT sum(nbr_t)-sum(nbr_gueris)-sum(nbr_deces) e,date1 b from DATEPAYS1 Group by date1 ";
    PreparedStatement ps1=con.prepareStatement(SQL1); 
   ResultSet rs1 = ps1.executeQuery()  ;
    while (rs1.next()){ 
         barchatdata.setValue(rs1.getInt("e"), "Nombre de cas actif", rs1.getString("b")); }
         
   JFreeChart  chart = ChartFactory.createLineChart("Evolution de pendémie  ", "Daily", "Nombre", barchatdata,PlotOrientation.VERTICAL,false,true,true);
      
      
     BarRenderer rendere = null; 
     CategoryPlot plot = null;
     rendere = new BarRenderer();
     ChartFrame frame = new ChartFrame("Evolution", chart);
     frame.setVisible(true);
     frame.setSize(400, 650);
   
    
     
     
      } 
      catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());  
       }
    }//GEN-LAST:event_acceuil10ActionPerformed

    private void acceuil11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil11ActionPerformed
           DefaultCategoryDataset barchatdata = new DefaultCategoryDataset(); 
      try {
             String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    
    con = DriverManager.getConnection(host,nom,mdp) ;
      
    String SQL1 = "SELECT nbre_cas,nom_g from gouvernorat  ";
    PreparedStatement ps1=con.prepareStatement(SQL1); 
   ResultSet rs1 = ps1.executeQuery()  ;
    while (rs1.next()){ 
         barchatdata.setValue(rs1.getInt("nbre_cas"), "Nombre de cas actif", rs1.getString("nom_g")); }
         
   JFreeChart  chart = ChartFactory.createBarChart3D("Part de chaque gouvernorat ", "Gouvernorat", "Nombre de cas", barchatdata,PlotOrientation.VERTICAL,false,true,false);
      
      
     BarRenderer rendere = null; 
     CategoryPlot plot = null;
     rendere = new BarRenderer();
     ChartFrame frame = new ChartFrame("Evolution", chart);
     frame.setVisible(true);
     frame.setSize(400, 650);
   
    
     
     
      } 
      catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());  
       }
    }//GEN-LAST:event_acceuil11ActionPerformed

    private void acceuil12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceuil12ActionPerformed
           DefaultPieDataset barchatdata = new DefaultPieDataset(); 
      try {
             String host = "jdbc:derby://localhost:1527/coronavirus" ; 
    String nom = "user1" ; 
    String mdp = "hr" ; 
    
    con = DriverManager.getConnection(host,nom,mdp) ;
      
    String SQL1 = "SELECT nbr_cas,nom_pays from pays  ";
    PreparedStatement ps1=con.prepareStatement(SQL1); 
   ResultSet rs1 = ps1.executeQuery()  ;
    while (rs1.next()){ 
         barchatdata.setValue( rs1.getString("nom_pays"),rs1.getInt("nbr_cas")); }
         
    String SQL = "SELECT sum(nbre_cas) a from gouvernorat  ";
    PreparedStatement ps=con.prepareStatement(SQL); 
   ResultSet rs = ps.executeQuery()  ;
           int tot=0;
   while (rs.next())
   {
       tot=rs.getInt("a");
   }
    barchatdata.setValue( "Tunisie",tot); 
   JFreeChart  chart = ChartFactory.createPieChart("Part de chaque gouvernorat ", barchatdata,true,true,true);
      
      
     BarRenderer rendere = null; 
     CategoryPlot plot = null;
     rendere = new BarRenderer();
     ChartFrame frame = new ChartFrame("Evolution", chart);
     frame.setVisible(true);
     frame.setSize(400, 650);
   
    
     
     
      } 
      catch(SQLException e ){
           JOptionPane.showMessageDialog(this,e.getMessage());  
       }
    }//GEN-LAST:event_acceuil12ActionPerformed

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
            java.util.logging.Logger.getLogger(acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acceuil;
    private javax.swing.JButton acceuil1;
    private javax.swing.JButton acceuil10;
    private javax.swing.JButton acceuil11;
    private javax.swing.JButton acceuil12;
    private javax.swing.JButton acceuil2;
    private javax.swing.JButton acceuil3;
    private javax.swing.JButton acceuil4;
    private javax.swing.JButton acceuil5;
    private javax.swing.JButton acceuil6;
    private javax.swing.JPanel affichage;
    private javax.swing.JPanel choixpays;
    private javax.swing.JPanel consult;
    private javax.swing.JButton consulter;
    private javax.swing.JPanel consultermonde;
    private javax.swing.JPanel consulterpays;
    private com.toedter.calendar.JDateChooser date;
    private com.toedter.calendar.JDateChooser datep;
    private com.toedter.calendar.JDateChooser datepays;
    private javax.swing.JButton infogouver;
    private javax.swing.JButton infogouver1;
    private javax.swing.JButton infopays;
    private javax.swing.JButton infopays1;
    private javax.swing.JButton infopays2;
    private javax.swing.JButton infopays3;
    private javax.swing.JButton infopays4;
    private javax.swing.JButton infopays5;
    private javax.swing.JButton infopays6;
    private javax.swing.JButton infopays7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JComboBox list_gouv;
    private javax.swing.JPanel listegouv;
    private javax.swing.JPanel listepays;
    private javax.swing.JComboBox listgouver;
    private javax.swing.JPanel listhosp;
    private javax.swing.JComboBox listpays;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel suiv;
    private javax.swing.JButton suivre;
    private javax.swing.JButton suivre1;
    private javax.swing.JButton suivre2;
    private javax.swing.JTable table;
    private javax.swing.JTable tablep;
    private javax.swing.JTable tablepays;
    private javax.swing.JPanel tache;
    private javax.swing.JPanel titre;
    // End of variables declaration//GEN-END:variables
}
