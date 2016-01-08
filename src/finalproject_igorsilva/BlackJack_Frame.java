package finalproject_igorsilva;

import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JTextField;

/*
 *
 * @author Igor Henrique da Silva
 */
public class BlackJack_Frame extends javax.swing.JFrame{
    BlackJack bj = new BlackJack (); 
    double bet = 0.0;
    double wallet = 1000.0; //Total money of the user
    
    public BlackJack_Frame() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelWallet = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelShowPCards = new javax.swing.JLabel();
        jTextBet = new javax.swing.JTextField();
        jButtonBet = new javax.swing.JButton();
        jLabelShowDCards = new javax.swing.JLabel();
        jLabelShowPoints = new javax.swing.JLabel();
        jButtonHit = new javax.swing.JButton();
        jButtonStand = new javax.swing.JButton();
        jButtonNewGame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(526, 435));
        getContentPane().setLayout(null);

        jLabelWallet.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        jLabelWallet.setText("You have $1000.00 reamainig");
        getContentPane().add(jLabelWallet);
        jLabelWallet.setBounds(30, 70, 250, 30);
        jLabelWallet.getAccessibleContext().setAccessibleName("JLabelWallet");

        jLabel2.setFont(new java.awt.Font("Phosphate", 0, 24)); // NOI18N
        jLabel2.setText("Black Jack Game");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 10, 200, 31);

        jLabel3.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        jLabel3.setText("Enter a bet:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 90, 14);

        jLabelShowPCards.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        getContentPane().add(jLabelShowPCards);
        jLabelShowPCards.setBounds(10, 190, 520, 50);

        jTextBet.setFont(new java.awt.Font("LiHei Pro", 0, 18)); // NOI18N
        jTextBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBetActionPerformed(evt);
            }
        });
        getContentPane().add(jTextBet);
        jTextBet.setBounds(110, 120, 100, 31);

        jButtonBet.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        jButtonBet.setText("Bet!");
        jButtonBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBet);
        jButtonBet.setBounds(60, 170, 75, 29);

        jLabelShowDCards.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        getContentPane().add(jLabelShowDCards);
        jLabelShowDCards.setBounds(10, 210, 430, 60);

        jLabelShowPoints.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        getContentPane().add(jLabelShowPoints);
        jLabelShowPoints.setBounds(10, 250, 410, 50);

        jButtonHit.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        jButtonHit.setText("Hit!");
        jButtonHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHit);
        jButtonHit.setBounds(10, 320, 75, 29);

        jButtonStand.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        jButtonStand.setText("Stand!");
        jButtonStand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStandActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStand);
        jButtonStand.setBounds(220, 320, 87, 29);

        jButtonNewGame.setFont(new java.awt.Font("LiHei Pro", 1, 14)); // NOI18N
        jButtonNewGame.setText("New Game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNewGame);
        jButtonNewGame.setBounds(90, 350, 120, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject_igorsilva/Images/lucky_8_line.jpg"))); // NOI18N
        jLabel1.setText("asdasd");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, 0, 580, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBetActionPerformed

    private void jButtonBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBetActionPerformed
        bj.newGame();
        bet = Double.parseDouble(jTextBet.getText());
        bj.bet(bet, wallet);
        
        jLabelShowPCards.setText("Your cards are: "+ bj.showPlayer());
        jLabelShowDCards.setText("Dealers card: " + bj.showDealer().get(0));
        jLabelShowPoints.setText("You have " + bj.showPoints() + " points");
    }//GEN-LAST:event_jButtonBetActionPerformed

    private void jButtonHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitActionPerformed

        jLabelShowPCards.setText("Your cards are: "+ bj.moreCard());
        jLabelShowDCards.setText("Dealers card: " + bj.showDealer().get(0));
        jLabelShowPoints.setText("You have " + bj.showPoints() + " points");
        double walletAux = bj.checkPoints(wallet, bet);
        jLabelWallet.setText("You have $ "+ walletAux + " remaining");
        wallet = walletAux;
    }//GEN-LAST:event_jButtonHitActionPerformed

    private void jButtonStandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStandActionPerformed

        double walletAux = bj.finalScore(wallet, bet);
        jLabelWallet.setText("You have $ "+ bj.finalScore(wallet, bet) + " remaining");
        wallet = walletAux;
    }//GEN-LAST:event_jButtonStandActionPerformed

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        bj.newGame();
        jLabelShowPCards.setText("Your cards are: ");
        jLabelShowDCards.setText("Dealers card: ");
        jLabelShowPoints.setText("You have 0 points");
    }//GEN-LAST:event_jButtonNewGameActionPerformed

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
            java.util.logging.Logger.getLogger(BlackJack_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJack_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJack_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJack_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJack_Frame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBet;
    private javax.swing.JButton jButtonHit;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JButton jButtonStand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelShowDCards;
    private javax.swing.JLabel jLabelShowPCards;
    private javax.swing.JLabel jLabelShowPoints;
    private javax.swing.JLabel jLabelWallet;
    private javax.swing.JTextField jTextBet;
    // End of variables declaration//GEN-END:variables


    private double parseDouble(JTextField jTextBet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
