/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproj;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
//import sql_table.Stores;
//import sql_table.Floor;


/**
 *
 * @author MTC
 */
public class Add_Advertising1 extends javax.swing.JFrame {

    /**
     * Creates new form Add_store
     */
    public Add_Advertising1() {
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("GUIprojPU").createEntityManager();
        ad2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ad1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ad6 = new javax.swing.JTextField();
        ad3 = new javax.swing.JTextField();
        addd = new javax.swing.JButton();
        canclee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ad4 = new javax.swing.JTextField();
        ad5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad2ActionPerformed(evt);
            }
        });
        getContentPane().add(ad2);
        ad2.setBounds(200, 100, 192, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Advertising Floor:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 90, 140, 33);

        ad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad1ActionPerformed(evt);
            }
        });
        getContentPane().add(ad1);
        ad1.setBounds(200, 60, 192, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Advertising Owner:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 50, 170, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Advertising Id :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 270, 185, 33);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Advertising PRICE :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 140, 136, 27);

        ad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad6ActionPerformed(evt);
            }
        });
        getContentPane().add(ad6);
        ad6.setBounds(200, 280, 192, 20);

        ad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad3ActionPerformed(evt);
            }
        });
        getContentPane().add(ad3);
        ad3.setBounds(200, 140, 192, 20);

        addd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addd.setText("Add");
        addd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddActionPerformed(evt);
            }
        });
        getContentPane().add(addd);
        addd.setBounds(120, 310, 171, 31);

        canclee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        canclee.setText("Cancel");
        canclee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleeActionPerformed(evt);
            }
        });
        getContentPane().add(canclee);
        canclee.setBounds(470, 340, 80, 31);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("     Add Advertising information");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 0, 220, 28);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Advertising Time:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 180, 185, 33);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Advertising Start Date :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 230, 185, 33);

        ad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad4ActionPerformed(evt);
            }
        });
        getContentPane().add(ad4);
        ad4.setBounds(200, 190, 192, 20);

        ad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad5ActionPerformed(evt);
            }
        });
        getContentPane().add(ad5);
        ad5.setBounds(200, 240, 192, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiproj/adddd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-230, 0, 860, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad2ActionPerformed

    private void ad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad1ActionPerformed

    private void ad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad6ActionPerformed

    private void ad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad3ActionPerformed


    private void adddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddActionPerformed
        
           
           EntityManager em1= Persistence.createEntityManagerFactory("GUIprojPU").createEntityManager();

            
             
          String adowne=ad1.getText();
           int floorad=Integer.parseInt(this.ad2.getText());
          int adprice=Integer.parseInt(this.ad3.getText());
          String adtime=ad4.getText();
            String date1=ad5.getText();
            
             int adid=Integer.parseInt(this.ad6.getText());
          Advertising ad = new Advertising();
          Floor f=new Floor();
          
          
           Query qr1=em1.createNamedQuery("Advertising.findAll");
      List<Advertising> allAdvertising=qr1.getResultList();
          
          Query qr2=em1.createNamedQuery("Floor.findAll");
          List<Floor> allfloor=qr2.getResultList();
          
           boolean t =false;
          
          
          for(Advertising ss:allAdvertising)
          {
          
          if(ss.getAdId()==adid)
          t =true;
         
         }
         
          if(t)
          {
           JOptionPane.showMessageDialog(null, " Id Advertising Already exists ");
           
           //this.setVisible(false);
          
          }
      else
          {
      
        
          for (Floor ff:allfloor)
          {
              
         if(ff.getFloorId()==floorad)
          t =true;
         
          }
          
           if(!t)
          {
           JOptionPane.showMessageDialog(null, " Id Floor Does not exist ");
           
           //this.setVisible(false);
          
          }
      else
          {
         
        ad.setAdOwner(adowne);
        
         f.setFloorId(floorad);
        ad.setAdFloor(f);
        
        ad.setAdPrice(adprice);
        ad.setAdTime(adtime);
          ad.setAdStartDate(date1);
          ad.setAdId(adid);
         em1.getTransaction().begin();
         
         
         em1.persist(ad);
         
         em1.getTransaction().commit();
         em1.close();
         
          JOptionPane.showMessageDialog(null, "Added");
          this.setVisible(false);
         
         
          }
          }//end else
        
    
            
     
     
           
        
    }//GEN-LAST:event_adddActionPerformed

    private void cancleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleeActionPerformed
      
  
        this.setVisible(false);
       
        
        
    }//GEN-LAST:event_cancleeActionPerformed

    private void ad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad4ActionPerformed

    private void ad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad5ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Advertising1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Advertising1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Advertising1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Advertising1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Add_Advertising1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad1;
    private javax.swing.JTextField ad2;
    private javax.swing.JTextField ad3;
    private javax.swing.JTextField ad4;
    private javax.swing.JTextField ad5;
    private javax.swing.JTextField ad6;
    private javax.swing.JButton addd;
    private java.awt.Button button1;
    private javax.swing.JButton canclee;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
