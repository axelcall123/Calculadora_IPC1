/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.JVistaPrincipal.ayuda;
import static calculadora.JVistaPrincipal.datos;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JHistorial extends javax.swing.JFrame {
    JTemp temp = new JTemp();//ARREGLO DEL TAMAÑO DEL NUMERO
    JPanel  jpanel = (JPanel) this.getContentPane();          
    public JTextField[] text = new JTextField[20];    //Declaración del array de cajas de texto
 
    
    public JHistorial() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("SISTEMA DE ECUAIONES");
        int d = 0;//PARA BAJAR UNA CASILLA EN Y
            for (int i = 0; i < 20;i++) {//CILCO PAR IMPRIMIR LA
                text[i] = new JTextField();    //LLAMOS EL ARRAY A LA CAJA DE TEXTO
                text[i].setBackground(Color.gray);
                text[i].setEditable(false);
                text[i].setEditable(false);
                text[i].setBounds(new Rectangle(10/*POSICOIN X*/, 40 + d/*POSICOIN Y*/, 500, 30));
                jpanel.add(text[i], null);
                d = d + 35;
            } 
        setSize(600, 800);
        setVisible(true);
        for(int a=0;a<datos.length;a++){
            if(datos[a]==null){
                continue;
            }else{
                text[a].setText(datos[a].devulve());
                //text[a].setText(datos[a].getResultado()+"      "+datos[a].getOperacion()+"     "+datos[a].getHour()+"    horas con"+datos[a].getMinute()+"    minutos");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Res = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Res.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESULTADO", "FECHA" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String res=Res.getSelectedItem().toString();
        if (res.equals("RESULTADO")) {
            for (int b = 0; b < datos.length; b++) {
                for (int a = 1; a < datos.length; a++) {
                    if (datos[a] == null) {
                        continue;
                    } else {
                        if (datos[a - 1].getOther() > datos[a].getOther()) {
                            ayuda[0] = datos[a];
                            datos[a] = datos[a - 1];
                            datos[a - 1] = ayuda[0];
                        }
                    }

                }
            }
            for (int a = 0; a < datos.length; a++) {
                if (datos[a] == null) {
                    continue;
                } else {
                    text[a].setText(datos[a].devulve());
                    //text[a].setText(datos[a].getResultado()+"      "+datos[a].getOperacion()+"     "+datos[a].getHour()+"    horas con"+datos[a].getMinute()+"    minutos");
                }
            }
        } else {
            for (int b = 0; b < datos.length; b++) {
                for (int a = 1; a < datos.length; a++) {
                    if (datos[a] == null) {
                        continue;
                    } else {
                        if (datos[a - 1].getMinute() > datos[a].getMinute()) {
                            ayuda[0] = datos[a];
                            datos[a] = datos[a - 1];
                            datos[a - 1] = ayuda[0];
                        }
                    }

                }
            }
            for (int a = 0; a < datos.length; a++) {
                if (datos[a] == null) {
                    continue;
                } else {
                    text[a].setText(datos[a].devulve());
                    //text[a].setText(datos[a].getResultado()+"      "+datos[a].getOperacion()+"     "+datos[a].getHour()+"    horas con"+datos[a].getMinute()+"    minutos");
                }
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Res;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
