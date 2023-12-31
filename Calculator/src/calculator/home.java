/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author vishnuneem
 */

import java.util.ArrayList;

public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jPanel1 = new javax.swing.JPanel();
        History = new javax.swing.JLabel();
        more = new javax.swing.JLabel();
        backspace = new javax.swing.JLabel();
        open = new javax.swing.JButton();
        close = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        model = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        miltiple = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        add = new javax.swing.JButton();
        negative = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        History.setText("History");

        more.setText("More");

        backspace.setText("<-");

        open.setText("(");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        close.setText(")");

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        model.setText("%");
        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });

        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        miltiple.setText("*");
        miltiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miltipleActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        negative.setText("+/-");
        negative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(negative, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(zero)
                                .addGap(18, 18, 18)
                                .addComponent(dot)
                                .addGap(18, 18, 18)
                                .addComponent(equal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clear)
                                        .addGap(18, 18, 18)
                                        .addComponent(open)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(History)
                                        .addGap(18, 18, 18)
                                        .addComponent(more)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backspace, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(close)
                                        .addGap(18, 18, 18)
                                        .addComponent(model)
                                        .addGap(18, 18, 18)
                                        .addComponent(divide)))))
                        .addGap(1, 1, 1)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(one)
                        .addGap(18, 18, 18)
                        .addComponent(two)
                        .addGap(18, 18, 18)
                        .addComponent(three)
                        .addGap(18, 18, 18)
                        .addComponent(add))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(four)
                            .addGap(18, 18, 18)
                            .addComponent(five)
                            .addGap(18, 18, 18)
                            .addComponent(six)
                            .addGap(18, 18, 18)
                            .addComponent(sub))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(seven)
                            .addGap(18, 18, 18)
                            .addComponent(eight)
                            .addGap(18, 18, 18)
                            .addComponent(nine)
                            .addGap(18, 18, 18)
                            .addComponent(miltiple))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(History)
                    .addComponent(more)
                    .addComponent(backspace))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(open)
                    .addComponent(divide)
                    .addComponent(model)
                    .addComponent(close)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(miltiple)
                    .addComponent(nine)
                    .addComponent(eight))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(sub)
                    .addComponent(six)
                    .addComponent(five))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(add)
                    .addComponent(three)
                    .addComponent(two))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negative)
                    .addComponent(equal)
                    .addComponent(dot)
                    .addComponent(zero))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        cal.add(Display);
        cal.add("/");
        display.setText("");
    }//GEN-LAST:event_divideActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        display.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("7");
        display.setText(Display);
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("8");
        display.setText(Display);
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("9");
        display.setText(Display);
    }//GEN-LAST:event_nineActionPerformed

    private void miltipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miltipleActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        cal.add(Display);
        cal.add("*");
        display.setText("");
    }//GEN-LAST:event_miltipleActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("4");
        display.setText(Display);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("5");
        display.setText(Display);
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("6");
        display.setText(Display);
    }//GEN-LAST:event_sixActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        cal.add(Display);
        cal.add("-");
        display.setText("");
    }//GEN-LAST:event_subActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("1");
        display.setText(Display);
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("2");
        display.setText(Display);
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("3");
        display.setText(Display);
    }//GEN-LAST:event_threeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        cal.add(Display);
        cal.add("+");
        display.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void negativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("(-");
        display.setText(Display);
    }//GEN-LAST:event_negativeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("0");
        display.setText(Display);
    }//GEN-LAST:event_zeroActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat(".");
        display.setText(Display);
    }//GEN-LAST:event_dotActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("");
        display.setText(Display);
    }//GEN-LAST:event_equalActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        Display.concat("(");
        display.setText(Display);
    }//GEN-LAST:event_openActionPerformed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
        String Display = display.getText();
        cal.add(Display);
        cal.add("%");
        display.setText("");
    }//GEN-LAST:event_modelActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    public static ArrayList<String> cal = new ArrayList<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel History;
    private javax.swing.JButton add;
    private javax.swing.JLabel backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton miltiple;
    private javax.swing.JButton model;
    private javax.swing.JLabel more;
    private javax.swing.JButton negative;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton open;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
