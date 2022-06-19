package calculator;

import java.awt.Toolkit;

/**
 *
 * @author dougbruno
 */
public class CalculatorGUI extends javax.swing.JFrame {

    public CalculatorGUI() {
        initComponents();
        Seticon();
        hideButtons();
    }

    double number1, number2;
    String operation;

    private void hideButtons() {
        //this function hide the buttons
         btnOne.setContentAreaFilled(false);
         btnTwo.setContentAreaFilled(false);
         btnThree.setContentAreaFilled(false);
         btnFour.setContentAreaFilled(false);
         btnFive.setContentAreaFilled(false);
         btnSix.setContentAreaFilled(false);
         btnSeven.setContentAreaFilled(false);
         btnEight.setContentAreaFilled(false);
         btnNine.setContentAreaFilled(false);
         btnSum.setContentAreaFilled(false);
         btnSub.setContentAreaFilled(false);
         btnMult.setContentAreaFilled(false);
         btnDiv.setContentAreaFilled(false);
         btnEqual.setContentAreaFilled(false);
         btnZero.setContentAreaFilled(false);
         btnCe.setContentAreaFilled(false);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResult = new javax.swing.JTextField();
        lblBg = new javax.swing.JLabel();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnCe = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(340, 542));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(txtResult);
        txtResult.setBounds(20, 70, 300, 140);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DM2.png"))); // NOI18N
        lblBg.setPreferredSize(new java.awt.Dimension(340, 542));
        getContentPane().add(lblBg);
        lblBg.setBounds(0, 0, 340, 600);

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        getContentPane().add(btnOne);
        btnOne.setBounds(10, 250, 70, 60);

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTwo);
        btnTwo.setBounds(100, 250, 60, 60);

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        getContentPane().add(btnThree);
        btnThree.setBounds(180, 250, 70, 60);

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        getContentPane().add(btnFour);
        btnFour.setBounds(10, 330, 70, 70);

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        getContentPane().add(btnFive);
        btnFive.setBounds(100, 330, 60, 70);

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        getContentPane().add(btnSix);
        btnSix.setBounds(180, 330, 60, 70);

        btnSum.setText("+");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });
        getContentPane().add(btnSum);
        btnSum.setBounds(260, 250, 70, 60);

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub);
        btnSub.setBounds(260, 330, 70, 70);

        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeven);
        btnSeven.setBounds(10, 420, 70, 60);

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        getContentPane().add(btnEight);
        btnEight.setBounds(100, 420, 60, 60);

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        getContentPane().add(btnNine);
        btnNine.setBounds(180, 420, 70, 60);

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiv);
        btnDiv.setBounds(270, 420, 60, 70);

        btnCe.setText("CE");
        btnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCe);
        btnCe.setBounds(10, 500, 70, 70);

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        getContentPane().add(btnZero);
        btnZero.setBounds(100, 500, 60, 70);

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(btnEqual);
        btnEqual.setBounds(180, 500, 70, 70);

        btnMult.setText("*");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        getContentPane().add(btnMult);
        btnMult.setBounds(270, 500, 60, 70);

        setBounds(0, 0, 356, 622);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "1");
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "3");
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "2");
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        // TODO add your handling code here: 
        number1 = Double.parseDouble(txtResult.getText());
        operation = "sum";
        txtResult.setText("");
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(txtResult.getText());
        operation = "sub";
        txtResult.setText("");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "6");
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "5");
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "4");
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "7");
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "8");
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "9");
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(txtResult.getText());
        operation = "div";
        txtResult.setText("");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeActionPerformed
        // TODO add your handling code here:
        txtResult.setText("");
        number1 = 0;
        number2 = 0;
    }//GEN-LAST:event_btnCeActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
        txtResult.setText(txtResult.getText() + "0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
        number2 = Double.parseDouble(txtResult.getText());
        if (operation.equals("sum")) {
            txtResult.setText(String.valueOf(number1 + number2));
            number1 = 0;
            number2 = 0;
        } else if (operation.equals("sub")) {
            txtResult.setText(String.valueOf(number1 - number2));
            number1 = 0;
            number2 = 0;
        } else if (operation.equals("div")) {
            txtResult.setText(String.valueOf(number1 / number2));
            number1 = 0;
            number2 = 0;
        } else if (operation.equals("mult")) {
            txtResult.setText(String.valueOf(number1 * number2));
            number1 = 0;
            number2 = 0;
        }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        number1 = Double.parseDouble(txtResult.getText());
        operation = "mult";
        txtResult.setText("");
    }//GEN-LAST:event_btnMultActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCe;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    public static javax.swing.JButton btnMult;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnSum;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel lblBg;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/calculator.png")));
    }
}
