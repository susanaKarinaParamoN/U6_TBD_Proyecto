/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Modelos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author karin
 */
public class Juego extends javax.swing.JFrame {

    int id;
    SQLJuegos jue = new SQLJuegos();
    Juegos js = new Juegos();
    String[] da;

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
    }

    public Juego(int id, String[] datos) {
        initComponents();
        this.id = id;
        js = jue.compra(id);
        da = datos;
        inicializar(js);

    }

    public Juego(Juegos objJuego) {
        initComponents();
        inicializar(objJuego);
    }

    public void inicializar(Juegos objJuego) {
        lbNombre.setText(objJuego.getNombre());
        lbConsola.setText(lbConsola.getText() + objJuego.getConsola() + " " + objJuego.getModelo_Consola());
        lbIdioma.setText(lbIdioma.getText() + objJuego.getIdioma());
        lbClasificacion.setText(lbClasificacion.getText() + objJuego.getClasificacion_Edad());
        lbCategoria1.setText(objJuego.getCategoria1());
        lbPrecio.setText("$" + objJuego.getPrecio());

        if (objJuego.getCategoria2().equals("")) {
            lbCategoria2.setVisible(false);
        } else {
            lbCategoria2.setText(objJuego.getCategoria2());
        }
        if (objJuego.getCategoria3().equals("")) {
            lbCategoria3.setVisible(false);
        } else {
            lbCategoria3.setText(objJuego.getCategoria3());
        }
        txtSinopsis.setText(objJuego.getSinopsis());
        lbDesarrollador.setText(lbDesarrollador.getText() + objJuego.getDesarrollador());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbConsola = new javax.swing.JLabel();
        lbIdioma = new javax.swing.JLabel();
        lbClasificacion = new javax.swing.JLabel();
        lbCategoria1 = new javax.swing.JLabel();
        lbCategoria2 = new javax.swing.JLabel();
        lbCategoria3 = new javax.swing.JLabel();
        lbValoracion = new javax.swing.JLabel();
        lbSinopsis = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbDesarrollador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        btnComprar = new javax.swing.JButton();
        estrella1 = new javax.swing.JLabel();
        estrella2 = new javax.swing.JLabel();
        estrella3 = new javax.swing.JLabel();
        estrella4 = new javax.swing.JLabel();
        estrella5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maquina-de-arcade.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbNombre.setText("Nombre");

        lbConsola.setText("Consola");

        lbIdioma.setText("Idioma");

        lbClasificacion.setText("Clasificacion");

        lbCategoria1.setText("Cat1");

        lbCategoria2.setText("Cat2");

        lbCategoria3.setText("cat3");

        lbValoracion.setText("Valoracion");

        lbSinopsis.setText("Sinopsis");

        lbPrecio.setText("$");

        lbDesarrollador.setText("Desarrollador");

        txtSinopsis.setEditable(false);
        txtSinopsis.setColumns(20);
        txtSinopsis.setRows(5);
        jScrollPane1.setViewportView(txtSinopsis);

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta-de-credito.png"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        estrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrella.png"))); // NOI18N

        estrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrella.png"))); // NOI18N

        estrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrella.png"))); // NOI18N

        estrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrella.png"))); // NOI18N

        estrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estrella.png"))); // NOI18N

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbValoracion)
                            .addComponent(lbCategoria1)
                            .addComponent(lbSinopsis, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(lbCategoria2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCategoria3)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(estrella1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estrella2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella5)
                                .addContainerGap(154, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDesarrollador)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNombre)
                    .addComponent(lbConsola)
                    .addComponent(lbIdioma)
                    .addComponent(lbClasificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprar)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbNombre)
                        .addGap(18, 18, 18)
                        .addComponent(lbConsola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbIdioma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lbPrecio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbClasificacion)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCategoria2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCategoria1)
                        .addComponent(lbCategoria3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(estrella5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(estrella4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbValoracion)
                    .addComponent(estrella1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estrella2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estrella3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSinopsis)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDesarrollador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        SQLJuegos agregar = new SQLJuegos();
        agregar.insertar(da[6], Integer.parseInt(da[0]));
        System.out.println(da[0]);
        JOptionPane.showMessageDialog(null, "compra exitosa");
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal p = new Principal(da);
        p.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JToggleButton btnRegresar;
    private javax.swing.JLabel estrella1;
    private javax.swing.JLabel estrella2;
    private javax.swing.JLabel estrella3;
    private javax.swing.JLabel estrella4;
    private javax.swing.JLabel estrella5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCategoria1;
    private javax.swing.JLabel lbCategoria2;
    private javax.swing.JLabel lbCategoria3;
    private javax.swing.JLabel lbClasificacion;
    private javax.swing.JLabel lbConsola;
    private javax.swing.JLabel lbDesarrollador;
    private javax.swing.JLabel lbIdioma;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbSinopsis;
    private javax.swing.JLabel lbValoracion;
    private javax.swing.JTextArea txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
