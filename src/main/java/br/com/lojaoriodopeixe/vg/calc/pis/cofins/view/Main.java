package br.com.lojaoriodopeixe.vg.calc.pis.cofins.view;

import br.com.lojaoriodopeixe.vg.calc.pis.cofins.implementations.CalculatorImpl;
import br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.Utils;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author vagner
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        util.centerWindow(this);
        this.setAlwaysOnTop(true);
        //util.nextFieldWithEnter(this);
        this.getRootPane().setDefaultButton(BTgetCalc);
    }

    @Override
    public JRootPane getRootPane() {
        return super.getRootPane(); //To change body of generated methods, choose Tools | Templates.
    }
    Utils util = new Utils();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FirstValue = new javax.swing.JTextField();
        ThirdValue = new javax.swing.JTextField();
        SecondValue = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BTgetCalc = new javax.swing.JButton();
        BtClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TotalViewer = new br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.JNumberFormatField();
        PisViewer = new br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.JNumberFormatField();
        CofinsViewer = new br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.JNumberFormatField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de PIS/COFINS v0.9.1");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Valor 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Valor 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Valor 3");

        FirstValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstValueFocusGained(evt);
            }
        });
        FirstValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstValueActionPerformed(evt);
            }
        });
        FirstValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FirstValueKeyPressed(evt);
            }
        });

        ThirdValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ThirdValueFocusGained(evt);
            }
        });

        SecondValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SecondValueFocusGained(evt);
            }
        });

        jLabel4.setText("PIS");

        jLabel5.setText("CONFINS");

        jLabel6.setText("TOTAL");

        BTgetCalc.setText("Calcular");
        BTgetCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTgetCalcActionPerformed(evt);
            }
        });

        BtClear.setText("Limpar");
        BtClear.setMaximumSize(new java.awt.Dimension(71, 23));
        BtClear.setMinimumSize(new java.awt.Dimension(71, 23));
        BtClear.setPreferredSize(new java.awt.Dimension(71, 23));
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Calculadora de PIS/COFINS");

        TotalViewer.setEditable(false);
        TotalViewer.setText("");
        TotalViewer.setFocusable(false);
        TotalViewer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TotalViewer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalViewerActionPerformed(evt);
            }
        });

        PisViewer.setEditable(false);
        PisViewer.setFocusable(false);
        PisViewer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        CofinsViewer.setEditable(false);
        CofinsViewer.setFocusable(false);
        CofinsViewer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PisViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CofinsViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FirstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ThirdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTgetCalc)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel2)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel3)))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThirdValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTgetCalc)
                    .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TotalViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(PisViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CofinsViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        setBounds(0, 0, 396, 255);
    }// </editor-fold>//GEN-END:initComponents
    
    private void FirstValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstValueActionPerformed

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        FirstValue.setText("");
        SecondValue.setText("");
        ThirdValue.setText("");
        TotalViewer.setText("");
        TotalViewer.setBackground(Color.decode("-986896"));
        PisViewer.setText("");
        PisViewer.setBackground(Color.decode("-986896"));
        CofinsViewer.setText("");
        CofinsViewer.setBackground(Color.decode("-986896"));
    }//GEN-LAST:event_BtClearActionPerformed

    public Main(GraphicsConfiguration gc) {
        super(gc);
    }
        
    private void BTgetCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTgetCalcActionPerformed

        if (!FirstValue.getText().isEmpty() || !SecondValue.getText().isEmpty() || !ThirdValue.getText().isEmpty()) {
            BigDecimal stringFirstValue;
            BigDecimal stringSecondValue;
            BigDecimal stringThirdValue;
            List<BigDecimal> values = new ArrayList<BigDecimal>();
            try {
                if (!FirstValue.getText().isEmpty()) {
                    stringFirstValue = new BigDecimal(FirstValue.getText().replace(",", "."));
                    values.add(stringFirstValue);
                }
                if (!SecondValue.getText().isEmpty()) {
                    stringSecondValue = new BigDecimal(SecondValue.getText().replace(",", "."));
                    values.add(stringSecondValue);
                }
                if (!ThirdValue.getText().isEmpty()) {
                    stringThirdValue = new BigDecimal(ThirdValue.getText().replace(",", "."));
                    values.add(stringThirdValue);
                }

                CalculatorImpl c = new CalculatorImpl();
                String total = c.getTotalValue(values).toPlainString();
                String totalPis = c.getPIS(c.getTotalValue(values)).toPlainString();
                String totalConfins = c.getCONFINS(c.getTotalValue(values)).toPlainString();

                TotalViewer.setText("R$ " + total);
                TotalViewer.setForeground(Color.WHITE);
                TotalViewer.setBackground(Color.decode("101211"));
                PisViewer.setText(totalPis);
                PisViewer.setBackground(Color.RED);
                PisViewer.setForeground(Color.WHITE);
                CofinsViewer.setText(totalConfins);
                CofinsViewer.setBackground(Color.BLUE);
                CofinsViewer.setForeground(Color.WHITE);
                FirstValue.selectAll();
            } catch (NumberFormatException nfe) {
                this.setAlwaysOnTop(false);
                JOptionPane.showMessageDialog(null, "Atenção! Valor inválido informado!");
                TotalViewer.setText("");
                PisViewer.setText("");
                CofinsViewer.setText("");
                this.setAlwaysOnTop(true);
            }
        } else {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "É preciso haver pelo menos um valor!");
            this.setAlwaysOnTop(true);
        }

    }//GEN-LAST:event_BTgetCalcActionPerformed

    private void FirstValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstValueFocusGained
            FirstValue.selectAll();
    }//GEN-LAST:event_FirstValueFocusGained

    private void SecondValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SecondValueFocusGained
            SecondValue.selectAll();
    }//GEN-LAST:event_SecondValueFocusGained

    private void ThirdValueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ThirdValueFocusGained
            ThirdValue.selectAll();
    }//GEN-LAST:event_ThirdValueFocusGained

    private void FirstValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstValueKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) {  
         BTgetCalcActionPerformed(null);
    }  
    }//GEN-LAST:event_FirstValueKeyPressed

    private void TotalViewerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalViewerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalViewerActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTgetCalc;
    private javax.swing.JButton BtClear;
    private br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.JNumberFormatField CofinsViewer;
    private javax.swing.JTextField FirstValue;
    private br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.JNumberFormatField PisViewer;
    private javax.swing.JTextField SecondValue;
    private javax.swing.JTextField ThirdValue;
    private br.com.lojaoriodopeixe.vg.calc.pis.cofins.utils.JNumberFormatField TotalViewer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
