/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.presentacionbanco;

import com.mycompany.dominiobanco.Cuenta;
import com.mycompany.dominiobanco.SinCuenta;
import com.mycompany.dominiobanco.Transaccion;
import conexion.IConexion;
import dao.CuentaDAO;
import dao.IClienteDAO;
import dao.ICuentaDAO;
import dao.ISinCuentaDAO;
import dao.ITransaccionDAO;
import dao.SinCuentaDAO;
import dao.TransaccionDAO;
import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ID145
 */
public class FormRetiroSinCuenta extends javax.swing.JFrame {

    private final IClienteDAO clienteDAO;
    private final IConexion conexion;
    private final ISinCuentaDAO sinCuentaDAO;
    private final ITransaccionDAO transaccionDAO;
    private final ICuentaDAO cuentaDAO;

    /**
     * Creates new form FormRetiroSinCuenta
     */
    public FormRetiroSinCuenta(IClienteDAO clienteDAO, IConexion conexion) {
        initComponents();
        this.clienteDAO = clienteDAO;
        this.conexion = conexion;
        this.sinCuentaDAO = new SinCuentaDAO(conexion);
        this.transaccionDAO = new TransaccionDAO(conexion);
        this.cuentaDAO = new CuentaDAO(conexion);
    }                                          

    private void pasContraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                                                             

                                        
    /**
     * Obtiene una instancia de SinCuenta correspondiente al folio y contraseña
     * ingresados.
     *
     * @return La SinCuenta correspondiente al folio y contraseña ingresados, o
     * null si no se encuentra o está en estado "no cobrado" o "cobrado".
     */
    private SinCuenta obtenerSinCuenta() {
        SinCuenta sinCuenta = null;
        try {
            sinCuenta = this.sinCuentaDAO.consultarSinCuenta(Integer.parseInt(txfFolio.getText()), String.valueOf(pasContraseña.getPassword()));
            if (sinCuenta == null) {
                return null;
            }
            //sinCuenta.setEstado("pendiente");
            if (sinCuenta.getEstado().equalsIgnoreCase("no cobrado") || sinCuenta.getEstado().equalsIgnoreCase("cobrado")) {

                return null;
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(FormRetiroSinCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        //sinCuenta.setEstado("cobrado");
        return sinCuenta;
    }

    /**
     * Obtiene una instancia de Transaccion asociada a la SinCuenta obtenida.
     *
     * @return La Transaccion asociada a la SinCuenta obtenida, o null si no se
     * encuentra.
     */
    private Transaccion obtenerTransaccion() {
        Transaccion transaccion = null;
        SinCuenta sinCuenta = obtenerSinCuenta();
        if (sinCuenta == null) {
            return null;
        }
        try {
            transaccion = this.transaccionDAO.consultarTransaccion(sinCuenta.getId_transaccion());

        } catch (PersistenciaException ex) {
            Logger.getLogger(FormRetiroSinCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaccion;
    }

    /**
     * Realiza un retiro de la cuenta asociada a la Transaccion obtenida.
     *
     * @return true si el retiro se realiza correctamente, false si no se puede
     * obtener la Transaccion o la Cuenta asociada.
     */
    private boolean realizarRetiro() {
        Transaccion transaccion = obtenerTransaccion();
        if (transaccion == null) {
            return false;
        }
        Cuenta cuenta = null;
        try {
            cuenta = this.cuentaDAO.consultarCuentaId(transaccion.getId_cuenta());
            System.out.println(cuenta);
        } catch (PersistenciaException ex) {
            Logger.getLogger(PantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cuenta == null) {
            return false;
        }
        try {
            this.cuentaDAO.retirarSinCuenta(cuenta, transaccion.getMonto());

        } catch (PersistenciaException ex) {
            Logger.getLogger(FormRetiroSinCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
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
        jPanel2 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtIntroduzcaLosDatos = new javax.swing.JLabel();
        txtIntroduzcaLosDatos1 = new javax.swing.JLabel();
        txtIntroduzcaLosDatos2 = new javax.swing.JLabel();
        txfFolio = new javax.swing.JTextField();
        pasContraseña = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 238, 238));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitulo.setText("Retirar sin cuenta");

        txtIntroduzcaLosDatos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIntroduzcaLosDatos.setForeground(new java.awt.Color(51, 51, 51));
        txtIntroduzcaLosDatos.setText("Introduzca los siguientes datos...");

        txtIntroduzcaLosDatos1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIntroduzcaLosDatos1.setForeground(new java.awt.Color(51, 51, 51));
        txtIntroduzcaLosDatos1.setText("Folio:");

        txtIntroduzcaLosDatos2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIntroduzcaLosDatos2.setForeground(new java.awt.Color(51, 51, 51));
        txtIntroduzcaLosDatos2.setText("Contraseña:");

        txfFolio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfFolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfFolioKeyTyped(evt);
            }
        });

        pasContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pasContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pasContraseñaKeyTyped(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(153, 153, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(153, 153, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(txtIntroduzcaLosDatos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVolver)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIntroduzcaLosDatos1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAceptar)
                                    .addComponent(txtIntroduzcaLosDatos2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pasContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTitulo)
                .addGap(69, 69, 69)
                .addComponent(txtIntroduzcaLosDatos)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntroduzcaLosDatos1)
                    .addComponent(txtIntroduzcaLosDatos2)
                    .addComponent(txfFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pasContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnAceptar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!txfFolio.getText().equals("") && !String.valueOf(pasContraseña.getPassword()).equals("")) {
            if (!this.realizarRetiro()) {
                JOptionPane.showMessageDialog(this, "El folio ha caducado o ya fue retirado");

                return;
            }
            JOptionPane.showMessageDialog(this, "Se retiro correctamente");
            PantallaInicial pi = new PantallaInicial(clienteDAO, conexion);
            pi.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese los datos requeridos");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PantallaInicial pi = new PantallaInicial(clienteDAO, conexion);
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txfFolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFolioKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txfFolioKeyTyped

    private void pasContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasContraseñaKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_pasContraseñaKeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pasContraseña;
    private javax.swing.JTextField txfFolio;
    private javax.swing.JLabel txtIntroduzcaLosDatos;
    private javax.swing.JLabel txtIntroduzcaLosDatos1;
    private javax.swing.JLabel txtIntroduzcaLosDatos2;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
