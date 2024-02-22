/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.presentacionbanco;

import com.mycompany.dominiobanco.Cliente;
import conexion.IConexion;
import dao.ClienteDAO;
import dao.CuentaDAO;
import dao.IClienteDAO;
import dao.ICuentaDAO;
import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utiles.EncriptarPassword;

/**
 *
 * @author ID145
 */
public class PantallaInicial extends javax.swing.JFrame {

    private final IClienteDAO clienteDAO;
    private final IConexion conexion;

    /**
     * Creates new form PantallaInicial
     */
    public PantallaInicial(IClienteDAO clienteDAO, IConexion conexion) {
        initComponents();
        this.clienteDAO = clienteDAO;
        this.conexion = conexion;
    }
    
                                      

    /**
     * Se encarga de verificar si elcliente existe y la contraseña sea la del cliente
     *
     * @return Cliente loggeado o si falla, regresa nulo
     * @throws PersistenciaException por si falla en accesar a los datos
     */
    private Cliente login() {
        Cliente cliente = null;
        try {
            String usuario = this.txtUsuario.getText();
            char[] contrasena = this.pasContraseñaUsuario.getPassword();
            cliente = this.clienteDAO.consultarCliente(Integer.valueOf(usuario));
            if (cliente == null) {
                return null;
            }
            if (!EncriptarPassword.comprobarContrasena(String.valueOf(contrasena), cliente.getContrasena())) {
                return null;
            }

        } catch (PersistenciaException ex) {
            Logger.getLogger(PantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;

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
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        txtIDdeUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pasContraseñaUsuario = new javax.swing.JPasswordField();
        btnRetiroSinCuenta = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();
        txtTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/klipartz.com.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.setText("Banco");

        txtIDdeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtIDdeUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtIDdeUsuario.setText("ID de usuario:");

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtContraseña.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        pasContraseñaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pasContraseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasContraseñaUsuarioActionPerformed(evt);
            }
        });
        pasContraseñaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pasContraseñaUsuarioKeyTyped(evt);
            }
        });

        btnRetiroSinCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRetiroSinCuenta.setText("Retiro sin cuenta");
        btnRetiroSinCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroSinCuentaActionPerformed(evt);
            }
        });

        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnAcceder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        txtTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo1.setText("Inicio de sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDdeUsuario)
                            .addComponent(txtContraseña))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pasContraseñaUsuario)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(txtTitulo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRetiroSinCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAcceder)))
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIDdeUsuario)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContraseña)
                    .addComponent(pasContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetiroSinCuenta)
                    .addComponent(btnRegistrarse)
                    .addComponent(btnAcceder))
                .addGap(135, 135, 135))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetiroSinCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroSinCuentaActionPerformed
        FormRetiroSinCuenta rsc = new FormRetiroSinCuenta(clienteDAO, conexion);
        rsc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetiroSinCuentaActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        RegistroCliente rc = new RegistroCliente((ClienteDAO) clienteDAO, conexion);
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
         if (txtUsuario.getText().equals("") || String.valueOf(pasContraseñaUsuario.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(this, "Todo los campos deben estar llenos");
            return;
        }

        Cliente cliente = login();
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "El usuario o la contraseña no coinciden");
            return;

        }
        ICuentaDAO cuentaDAO = new CuentaDAO(conexion);
        MenuPrincipal mp = new MenuPrincipal(cliente, cuentaDAO, conexion);
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void pasContraseñaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasContraseñaUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pasContraseñaUsuarioKeyTyped

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void pasContraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasContraseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasContraseñaUsuarioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnRetiroSinCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pasContraseñaUsuario;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtIDdeUsuario;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
