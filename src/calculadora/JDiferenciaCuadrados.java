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

public class JDiferenciaCuadrados extends javax.swing.JFrame {

    public JDiferenciaCuadrados() {
        initComponents();
        setLocationRelativeTo(null);
            setResizable(false);
        setTitle("DIFERENCIA DE CUBOS");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ja = new javax.swing.JTextField();
        Jb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        a1R = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        b1R = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        a2R = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        b2R = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbActionPerformed(evt);
            }
        });

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        a1R.setColumns(20);
        a1R.setLineWrap(true);
        a1R.setRows(1);
        a1R.setTabSize(9);
        jScrollPane5.setViewportView(a1R);

        b1R.setColumns(20);
        b1R.setLineWrap(true);
        b1R.setRows(1);
        b1R.setTabSize(9);
        jScrollPane6.setViewportView(b1R);

        a2R.setColumns(20);
        a2R.setLineWrap(true);
        a2R.setRows(1);
        a2R.setTabSize(9);
        jScrollPane7.setViewportView(a2R);

        b2R.setColumns(20);
        b2R.setLineWrap(true);
        b2R.setRows(1);
        b2R.setTabSize(9);
        jScrollPane8.setViewportView(b2R);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("RESULTADO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("DIFERNCIA DE CUADRADOS");

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
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ja, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(Bsave)
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel2)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(Bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel2)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int identificador=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NOSE ns=new NOSE();
        double aDou=Double.parseDouble(Ja.getText());
        double bDou=Double.parseDouble(Jb.getText());
        aDou=Double.parseDouble(ns.decimales(ns.raizn(aDou,2)));
        bDou=Double.parseDouble(ns.decimales(ns.raizn(bDou,2)));
        double x=aDou%1;//VER SI ES ENTERO
        double y=bDou%1;//VER SI ES ENTERO
        if((x!=0)||(y!=0)){
            JOptionPane.showMessageDialog(null, "RAIZ NO EXACTA");
        }else{
            a1R.setText(String.valueOf(aDou));
            b1R.setText(String.valueOf(bDou));
            a2R.setText(String.valueOf(aDou));
            b2R.setText(String.valueOf(bDou));
        }       
        
        Calendar fecha = new GregorianCalendar();
        /**//**/
        String resultado="A="+this.a1R.getText()+"; B="+this.b1R.getText()+";; A2="+this.b2R.getText()+"; B="+this.a2R.getText();
        //OPERACION
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        //IDENTIFICADOR
        if (identificador < datos.length) {
            if (datos[identificador] == null) {
                datos[identificador] = new ParaAlmacen(resultado, "Diferencia de cuadrados", dia, mes, hora, minuto,4,0);
                identificador++;
            } else {
                for (int a = identificador; a < datos.length; a++) {//4 TAMÑAO ACTUAL
                    if (datos[a] == null) {
                        datos[a] = new ParaAlmacen(resultado, "Diferencia de cuadrados", dia, mes, hora, minuto,4,0);
                        //identificador = a;
                        break;
                    } else {

                    }
                }

            }
        }else{
            for(int z=1;z<datos.length;z++){
                datos[z-1]=datos[z];
            }datos[datos.length-1]=new ParaAlmacen(resultado, "Diferencia de cuadrados", dia, mes, hora, minuto,4,0);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbActionPerformed
    
    JTemp temp=new JTemp();
    private int contador=temp.Reg_FAV();
    private int DDC=temp.REG_DDC();
    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        Calendar fecha = new GregorianCalendar();
        /**//**/
        String resultado=this.a1R.getText()+";"+this.b1R.getText()+";;"+this.b2R.getText()+";"+this.a2R.getText();
        //OPERACION
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        //IDENTIFICADOR
        DDC++;
        temp.IN_DDC(DDC);
        System.out.println(temp.REG_DDC());
        
        if(contador<fav.length){
            if(fav[contador]==null){
                fav[contador]=new ParaAlmacen(resultado, "Diferencia de cuadrados", dia, mes, hora, minuto,4,temp.REG_DDC());
                contador++;
                System.out.println(contador);
            }else{
                for(int z=contador;z<fav.length;z++){//4 TAMÑAO ACTUAL
                    if(fav[z]==null){
                        fav[z]=new ParaAlmacen(resultado, "Diferencia de cuadrados", dia, mes, hora, minuto,4,temp.REG_DDC());
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
            }fav[fav.length-1]=new ParaAlmacen(resultado, "Diferencia de cuadrados", dia, mes, hora, minuto,4,temp.REG_DDC());
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
            java.util.logging.Logger.getLogger(JDiferenciaCuadrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDiferenciaCuadrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDiferenciaCuadrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDiferenciaCuadrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDiferenciaCuadrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsave;
    private javax.swing.JTextField Ja;
    private javax.swing.JTextField Jb;
    private javax.swing.JTextArea a1R;
    private javax.swing.JTextArea a2R;
    private javax.swing.JTextArea b1R;
    private javax.swing.JTextArea b2R;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    // End of variables declaration//GEN-END:variables
}
