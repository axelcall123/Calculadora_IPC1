/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.JVistaPrincipal.datos;
import static calculadora.JVistaPrincipal.fav;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author axelc
 */
public class JSumR extends javax.swing.JFrame {

    /**
     * Creates new form JSumDifCubos
     */
    public JSumR() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("SUMA Y DIFERENCIA DE CUBOS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menOmas = new javax.swing.JComboBox<>();
        JLimiteIn = new javax.swing.JTextField();
        JLimiteSup = new javax.swing.JTextField();
        JDif = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Res = new javax.swing.JLabel();
        Bsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        menOmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CUADRATICA", "CUBICA", "EXPONENCIAL" }));
        menOmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOmasActionPerformed(evt);
            }
        });

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Res.setOpaque(true);

        Bsave.setText("GUARDAR");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bsave))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JLimiteSup)
                        .addComponent(JLimiteIn)
                        .addComponent(menOmas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JDif, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(JLimiteIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLimiteSup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menOmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JDif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        menOmas.getAccessibleContext().setAccessibleName("");
        menOmas.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menOmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOmasActionPerformed
        
    }//GEN-LAST:event_menOmasActionPerformed
    private int identificador=0;
    String operacion="";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NOSE ns=new NOSE();
        String simbolo=menOmas.getSelectedItem().toString();
        double inferior=Double.parseDouble(JLimiteIn.getText());
        double superior=Double.parseDouble(JLimiteSup.getText());
        double veces=Double.parseDouble(JDif.getText());
        double num=1;
        if (simbolo.equals("CUADRATICA")) {
            for(int a=0;a<veces;a++){
                num=num*ns.cuadrado(inferior, superior);
                
            }
            Res.setText(ns.decimales(num));
            
        } else if (simbolo.equals("CUBICA")) {
            for(int a=0;a<veces;a++){
                num=num*ns.cubica(inferior, superior);
                
            }
            Res.setText(ns.decimales(num));
            //System.out.println(String.valueOf(ns.cubica(inferior, superior)));
        } else if (simbolo.equals("EXPONENCIAL")) {
            for(int a=0;a<veces;a++){
                num=num*ns.expo(inferior, superior);
               
            }
            Res.setText(ns.decimales(num));
        }
        
        operacion=simbolo;
        Calendar fecha = new GregorianCalendar();
        /**//**/
        String resultado=this.Res.getText();
        //OPERACION
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        //IDENTIFICADOR
        if (identificador < datos.length) {
            if (datos[identificador] == null) {
                datos[identificador] = new ParaAlmacen(resultado, operacion + " Suma de Rienman", dia, mes, hora, minuto,1,0);
                identificador++;
            } else {
                for (int a = identificador; a < datos.length; a++) {//4 TAMÑAO ACTUAL
                    if (datos[a] == null) {
                        datos[a] = new ParaAlmacen(resultado, operacion + " Suma de Rienman", dia, mes, hora, minuto,1,0);
                        //identificador = a;
                        break;
                    } else {

                    }
                }

            }
        }else{
           for(int z=1;z<datos.length;z++){
                datos[z-1]=datos[z];
            }datos[datos.length-1]=new ParaAlmacen(resultado, operacion + " Suma de Rienman", dia, mes, hora, minuto,1,0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    
    JTemp temp=new JTemp();
    private int contador=temp.Reg_FAV();
    private int SR=temp.REG_SR();
    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        Calendar fecha = new GregorianCalendar();
        String simbolo=menOmas.getSelectedItem().toString();
        String resultado=this.Res.getText();
        operacion=simbolo;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        //IDENTIFICADOR
        SR++;
        temp.IN_SR(SR);
        System.out.println(temp.REG_SR());
        if(contador<fav.length){
            if(fav[contador]==null){
                fav[contador]=new ParaAlmacen(resultado, operacion + " Suma de Rienman", dia, mes, hora, minuto,1,temp.REG_SR());
                contador++;
                System.out.println(contador);
            }else{
                for(int z=contador;z<fav.length;z++){//4 TAMÑAO ACTUAL
                    if(fav[z]==null){
                        fav[z]=new ParaAlmacen(resultado, operacion + " Suma de Rienman", dia, mes, hora, minuto,1,temp.REG_SR());
                        //contador=z;
                        System.out.println(contador);
                        break;
                    }else{
                        contador=fav.length+10;
                    }
                }

            }
        }else{
            for(int z=1;z<fav.length;z++){
                fav[z-1]=fav[z];
            }fav[fav.length-1]=new ParaAlmacen(resultado, operacion + " Suma de Rienman", dia, mes, hora, minuto,1,temp.REG_SR());
        }System.out.println(contador);

        if(contador==fav.length-1){
            temp.In_FAV(fav.length);
        }
    }//GEN-LAST:event_BsaveActionPerformed

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
            java.util.logging.Logger.getLogger(JSumR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSumR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSumR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSumR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSumR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsave;
    private javax.swing.JTextField JDif;
    private javax.swing.JTextField JLimiteIn;
    private javax.swing.JTextField JLimiteSup;
    private javax.swing.JLabel Res;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> menOmas;
    // End of variables declaration//GEN-END:variables
}
