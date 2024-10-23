package Provincias;

import java.awt.Image;
import java.awt.Toolkit;

public class FrmProvincias extends javax.swing.JFrame {

    public FrmProvincias() {
        initComponents();
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ubicacion.png")); // se define la img del programa 
        this.setIconImage(img);
        this.setLocationRelativeTo(null); //centra la pestaña
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplProvincias = new javax.swing.JPanel();
        chbGuanacaste = new javax.swing.JCheckBox();
        chbSanJose = new javax.swing.JCheckBox();
        chbLimon = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        chbCartago = new javax.swing.JCheckBox();
        chbHeredia = new javax.swing.JCheckBox();
        chbAlajuela = new javax.swing.JCheckBox();
        chbPuntarenas = new javax.swing.JCheckBox();
        jplBotones = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplProvincias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CostaRica\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        chbGuanacaste.setText("Guanacaste");

        chbSanJose.setText("San Jose");
        chbSanJose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSanJoseActionPerformed(evt);
            }
        });

        chbLimon.setText("Limon ");
        chbLimon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbLimonActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Cuáles son las provincias más grandes de Costa Rica?");

        chbCartago.setText("Cartago");

        chbHeredia.setText("Heredia");

        chbAlajuela.setText("Alajuela");

        chbPuntarenas.setText("Puntarenas");

        javax.swing.GroupLayout jplProvinciasLayout = new javax.swing.GroupLayout(jplProvincias);
        jplProvincias.setLayout(jplProvinciasLayout);
        jplProvinciasLayout.setHorizontalGroup(
            jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplProvinciasLayout.createSequentialGroup()
                .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jplProvinciasLayout.createSequentialGroup()
                        .addComponent(chbCartago)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jplProvinciasLayout.createSequentialGroup()
                        .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chbLimon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chbSanJose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chbGuanacaste, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbHeredia)
                            .addComponent(chbAlajuela)
                            .addComponent(chbPuntarenas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jplProvinciasLayout.setVerticalGroup(
            jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplProvinciasLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbGuanacaste)
                    .addComponent(chbHeredia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbSanJose)
                    .addComponent(chbAlajuela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplProvinciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbLimon)
                    .addComponent(chbPuntarenas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbCartago)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jplBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplBotonesLayout = new javax.swing.GroupLayout(jplBotones);
        jplBotones.setLayout(jplBotonesLayout);
        jplBotonesLayout.setHorizontalGroup(
            jplBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplBotonesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jplBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jplBotonesLayout.setVerticalGroup(
            jplBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplBotonesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jplProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jplBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jplProvincias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jplBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbLimonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbLimonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbLimonActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String mensaje = "Las provincias selecionadas son: "; // se creo una variable tipo cadena que se va a llamar mensaje
        if (chbGuanacaste.isSelected()) {   // si selecciona el checkBoxs guanacaste
            mensaje = mensaje + "Guanacaste, ";  // agarra el texto y lo va mostrar en el panel
        }
        if (chbSanJose.isSelected()) {            // si selecciona el checkBoxs san jose
            mensaje = mensaje + "San jose, ";     // agarra el texto y lo va mostrar en el panel 
        }
        if (chbLimon.isSelected()) {      // si selecciona el checkBoxs limon
            mensaje = mensaje + "Limon, ";  // se muestra el mensaje y de agregacion 
        }
        if (chbCartago.isSelected()) { // si selecciona el checkBoxs Carga
            mensaje = mensaje + "Cartago, ";  // se muestra el mensaje y de agregacion 
        }
        if (chbHeredia.isSelected()) { // si selecciona el checkBoxs heredia
            mensaje = mensaje + "Heredia, ";  // se muestra el mensaje y de agregacion 
        }
        if (chbAlajuela.isSelected()) { //si selecciona el checkBoxs alajuela
            mensaje = mensaje + "Alajuela, ";   // se muestra el mensaje y de agregacion 
        }
        if (chbPuntarenas.isSelected()) { //si selecciona el checkBoxs puntarenas
            mensaje = mensaje + "Puntarenas, ";   // se muestra el mensaje y de agregacion 
        }
        lblResultado.setText(mensaje);   // muestra el resultado de todo seleccionado
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        chbGuanacaste.setSelected(false); // reinicia el check para poder volverlo a seleccionar
        chbSanJose.setSelected(false);  // reinicia el check para poder volverlo a seleccionar
        chbLimon.setSelected(false);    // reinicia el check para poder volverlo a seleccionar
        chbCartago.setSelected(false); // reinicia el check para poder volverlo a seleccionar
        chbHeredia.setSelected(false); // reinicia el check para poder volverlo a seleccionar
        chbAlajuela.setSelected(false); // reinicia el check para poder volverlo a seleccionar
        chbPuntarenas.setSelected(false); // reinicia el check para poder volverlo a seleccionar
        lblResultado.setText(""); // El labol se reinicia y pasa a blanco
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose(); // metodo para cerrar el programa
    }//GEN-LAST:event_btnSalirActionPerformed

    private void chbSanJoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSanJoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbSanJoseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProvincias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProvincias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProvincias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProvincias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProvincias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chbAlajuela;
    private javax.swing.JCheckBox chbCartago;
    private javax.swing.JCheckBox chbGuanacaste;
    private javax.swing.JCheckBox chbHeredia;
    private javax.swing.JCheckBox chbLimon;
    private javax.swing.JCheckBox chbPuntarenas;
    private javax.swing.JCheckBox chbSanJose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jplBotones;
    private javax.swing.JPanel jplProvincias;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
