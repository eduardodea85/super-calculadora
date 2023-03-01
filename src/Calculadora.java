
import javax.swing.JSpinner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduar
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        panCalc.setVisible(false);
    }
    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCalc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblResRD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResEC = new javax.swing.JLabel();
        lblRsRQ = new javax.swing.JLabel();
        lblRsRC = new javax.swing.JLabel();
        lblResVA = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Resto da divisão por 2");

        jLabel4.setText("Raiz Quadrada");

        jLabel5.setText("Raiz cúbica");

        lblResRD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResRD.setForeground(new java.awt.Color(0, 0, 255));
        lblResRD.setText("0");

        jLabel3.setText("Elevado ao cubo");

        lblResEC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResEC.setForeground(new java.awt.Color(0, 0, 255));
        lblResEC.setText("0");

        lblRsRQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRsRQ.setForeground(new java.awt.Color(0, 0, 255));
        lblRsRQ.setText("0");

        lblRsRC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRsRC.setForeground(new java.awt.Color(0, 0, 255));
        lblRsRC.setText("0");

        lblResVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResVA.setForeground(new java.awt.Color(0, 0, 255));
        lblResVA.setText("0");

        jLabel6.setText("Valor absoluto");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(70, 70, 70)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblResRD)
                    .addComponent(lblResEC)
                    .addComponent(lblRsRQ)
                    .addComponent(lblRsRC)
                    .addComponent(lblResVA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblResRD)
                        .addGap(18, 18, 18)
                        .addComponent(lblResEC)
                        .addGap(18, 18, 18)
                        .addComponent(lblRsRQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRsRC)
                        .addGap(18, 18, 18)
                        .addComponent(lblResVA))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Informe um valor");

        txtValor.setModel(new javax.swing.SpinnerNumberModel());

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalc)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalc))
                .addGap(18, 18, 18)
                .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        int num = Integer.parseInt(txtValor.getValue().toString());
        // Resto da divisão por 2
        int r = num % 2;
        lblResRD.setText(Integer.toString(r));
        
        // Elevado ao cubo
        double c = Math.pow(num, 3);
        lblResEC.setText(Double.toString(c));
        
        // Raiz Quadrada
        double rq = Math.sqrt(num);
        lblRsRQ.setText(String.format("%.2f", rq));//Formata duas casas do resultado  //lblRsRq.setText(Double.toString(rq));
        
        // Raiza Cúbica
        double rc = Math.cbrt(num);
        lblRsRC.setText(String.format("%.2f", rc));  //lblRsRC.setText(Double.toString(rc));
        
        int va = Math.abs(num);
        lblResVA.setText(Integer.toString(va));
        
        
        
        panCalc.setVisible(true);
       
        
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResEC;
    private javax.swing.JLabel lblResRD;
    private javax.swing.JLabel lblResVA;
    private javax.swing.JLabel lblRsRC;
    private javax.swing.JLabel lblRsRQ;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
