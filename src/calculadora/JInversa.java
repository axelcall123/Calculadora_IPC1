/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JInversa extends javax.swing.JFrame {
    NOSE ns=new NOSE();
    JTemp temp = new JTemp();//ARREGLO DEL TAMAÑO DEL NUMERO
    JPanel jpanel = (JPanel) this.getContentPane();          
    public JTextField[] text = new JTextField[temp.REG_tamañoo()*temp.REG_tamañoo()+temp.REG_tamañoo()];    //Declaración del array de cajas de texto
    public double[][] matriz= new double[temp.REG_tamañoo()][temp.REG_tamañoo()];
    double[][] partes= new double[temp.REG_tamañoo()-1][temp.REG_tamañoo()];
    //Border border = BorderFactory.createLineBorder(Color.black, 1);
    
    public JInversa() {
        initComponents();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("INVERSA");
        int d = 0;//PARA BAJAR UNA CASILLA EN Y
        int id = 0;//ID DE LA CAJA PARA QUE SEA DIFERENTE
        for (int a = 0; a < temp.REG_tamañoo(); a++) {
            for (int i = 0 + id; i < temp.REG_tamañoo() + id; i++) {//CILCO PAR IMPRIMIR LA
                text[i] = new JTextField();    //LLAMOS EL ARRAY A LA CAJA DE TEXTO
                text[i].setBounds(new Rectangle((i + 1- id) * (35+40)/*POSICOIN X*/, 40 + d/*POSICOIN Y*/, 35, 20));
                
                jpanel.add(text[i], null);
            }
            id = id + temp.REG_tamañoo();
            d = d + 30;
        }
        setSize(590, 510);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(391, Short.MAX_VALUE))
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
        int kk = 0;//pasa a una matriz
        double[] resultado = new double[temp.REG_tamañoo() * temp.REG_tamañoo()];
        double deter = 0;
        if (temp.REG_tamañoo() == 2) {
            for (int a = temp.REG_tamañoo() - 1; a >= 0; a--) {//PASA LOS TEXFIELD A UNA MATRIZ
                for (int b = temp.REG_tamañoo() - 1; b >= 0; b--) {
                    JTextField texto = text[kk];//toma el texto de la matriz
                    String mat = texto.getText();
                    matriz[a][b] = Double.parseDouble(mat);
                    //System.out.println(b+";"+a+";"+kk);
                    kk++;
                }
                deter = ns.Matriz_2(matriz);//DETERMINANTE GENERAL

            }

            kk = 0;
            for (int a = 0; a < temp.REG_tamañoo(); a++) {//RECORRE LA MATRIZ PARA IMPRIMIRLA
                for (int b = 0; b < temp.REG_tamañoo(); b++) {
                    if ((a == 0) && (b == 0) || (a == 1) && (b == 1)) {
                        text[kk].setText(String.valueOf(1 * matriz[b][a] / deter));
                    } else {
                        text[kk].setText(String.valueOf(-1 * matriz[b][a] / deter));
                    }
                    kk++;
                }
            }

        } else {
            for (int a = 0; a < temp.REG_tamañoo(); a++) {//PASA LOS TEXFIELD A UNA MATRIZ
                for (int b = 0; b < temp.REG_tamañoo(); b++) {
                    JTextField texto = text[kk];//toma el texto de la matriz
                    double mat = Double.parseDouble(texto.getText());
                    matriz[a][b] = mat;
                    kk++;
                }
                deter = ns.Matriz_2(matriz);
            }
            kk = 0;
            for (int convertir = 0; convertir < temp.REG_tamañoo(); convertir++) {
                for (int a = 0; a < temp.REG_tamañoo(); a++) {
                    for (int b = 0; b < temp.REG_tamañoo(); b++) {
                        if (convertir == temp.REG_tamañoo() - 1) {
                            if (b == convertir) {
                                continue;
                            } else {
                                partes[b][a] = matriz[a][b];
                            }
                        } else {
                            if (b == convertir) {
                                continue;
                            } else {
                                if (b < convertir) {
                                    partes[b][a] = matriz[a][b];
                                } else {
                                    partes[b - 1][a] = matriz[a][b];
                                }
                            }
                        }
                    }
                }
                double rest[] = ns.matriz(partes, temp.REG_tamañoo() - 1, temp.REG_tamañoo() - 1, temp.REG_tamañoo(), temp.REG_tamañoo());
                for (int a = 0; a < temp.REG_tamañoo(); a++) {
                    //System.out.println(rest[a]);
                    resultado[kk] = rest[a];
                    kk++;
                }

            }
            for(int a=0;a<temp.REG_tamañoo()*temp.REG_tamañoo();a++){
                if(temp.REG_tamañoo()==3){
                    if(a%2==0){
                        text[a].setText(String.valueOf(1*resultado[a]/deter));
                    }else{
                        text[a].setText(String.valueOf(-1*resultado[a]/deter));
                    }
                }else{
                    if(a<4||a>7&&a<12){
                        if(a%2==0){
                            text[a].setText(String.valueOf(1*resultado[a]/deter));
                        }else{
                            text[a].setText(String.valueOf(-1*resultado[a]/deter));
                        }
                    }else{
                       if(a%2==0){
                            text[a].setText(String.valueOf(-1*resultado[a]/deter));
                        }else{
                            text[a].setText(String.valueOf(1*resultado[a]/deter));
                        }
                    }
                }
            }
            
            
        }
        /*System.out.println(deter+" determinante");
        for(int a=0;a<9;a++){
                System.out.println(resultado[a]);
        }*/
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(JInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JInversa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}