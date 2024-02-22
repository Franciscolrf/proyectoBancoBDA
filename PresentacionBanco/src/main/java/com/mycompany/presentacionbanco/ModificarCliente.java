/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.presentacionbanco;

import com.mycompany.dominiobanco.Cliente;
import com.mycompany.dominiobanco.Domicilio;
import static com.mycompany.presentacionbanco.Movimientos.verificarFormatoFecha;
import conexion.IConexion;
import dao.ClienteDAO;
import dao.DomicilioDAO;
import dao.IClienteDAO;
import dao.ICuentaDAO;
import dao.IDomicilioDAO;
import dto.ClienteNuevoDTO;
import dto.DomicilioNuevoDTO;
import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ID145
 */
public class ModificarCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private ICuentaDAO cuentaDAO;
    private final IConexion conexion;
    private IClienteDAO clienteDAO;
    private IDomicilioDAO domicilioDAO;
    private Domicilio domicilio;

    /**
     * Creates new form Modificar
     */
    public ModificarCliente(Cliente cliente, ICuentaDAO cuentaDAO, IConexion conexion) {
        initComponents();
        this.cliente = cliente;
        this.cuentaDAO = cuentaDAO;
        this.conexion = conexion;
        this.clienteDAO = new ClienteDAO(conexion);
        this.domicilioDAO = new DomicilioDAO(conexion);
        try {
            this.domicilio = domicilioDAO.consultar(cliente.getId());
        } catch (PersistenciaException ex) {
            Logger.getLogger(ModificarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        txfApellidoMaterno.setText(cliente.getApellido_materno());
        txfApellidoPaterno.setText(cliente.getApellido_paterno());
        txfNacimiento.setText(cliente.getNacimiento());
        txfNombre.setText(cliente.getNombres());
        txfCalle.setText(domicilio.getCalle());
        txfCodigoPostal.setText(domicilio.getCodigo_postal() + "");
        txfColonia.setText(domicilio.getColonia());
        txfNumExterior.setText(domicilio.getNumero_exterior() + "");
        txfNumInterior.setText(domicilio.getNumero_interior() + "");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtINombre = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JLabel();
        txtConfirmarContraseña = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        txfApellidoPaterno = new javax.swing.JTextField();
        txfApellidoMaterno = new javax.swing.JTextField();
        txfNacimiento = new javax.swing.JTextField();
        txfContraseña = new javax.swing.JTextField();
        txfConfirmarContraseña = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtCalle = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JLabel();
        txtColonia = new javax.swing.JLabel();
        txtNumExterior = new javax.swing.JLabel();
        txtNumInterior = new javax.swing.JLabel();
        txfNumExterior = new javax.swing.JTextField();
        txfNumInterior = new javax.swing.JTextField();
        txfColonia = new javax.swing.JTextField();
        txfCodigoPostal = new javax.swing.JTextField();
        txfCalle = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtINombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtINombre.setForeground(new java.awt.Color(51, 51, 51));
        txtINombre.setText("Nombres");
        getContentPane().add(txtINombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 199, -1, -1));

        txtApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtApellidoPaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoPaterno.setText("Apellido Paterno");
        getContentPane().add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 239, -1, -1));

        txtApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtApellidoMaterno.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidoMaterno.setText("Apellido Materno");
        getContentPane().add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 279, -1, -1));

        txtNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNacimiento.setForeground(new java.awt.Color(51, 51, 51));
        txtNacimiento.setText("Nacimiento (aaaa-mm-dd)");
        getContentPane().add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 319, -1, -1));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtContraseña.setText("Contraseña");
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 371, -1, -1));

        txtConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtConfirmarContraseña.setForeground(new java.awt.Color(51, 51, 51));
        txtConfirmarContraseña.setText("Confirmar Contraseña");
        getContentPane().add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 411, -1, -1));

        txfNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 202, 163, -1));

        txfApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txfApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 242, 163, -1));

        txfApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txfApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 282, 163, -1));

        txfNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txfNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 322, 163, -1));

        txfContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 374, 163, -1));

        txfConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txfConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 414, 163, -1));

        jPanel12.setBackground(new java.awt.Color(240, 242, 242));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitulo.setText("Datos Personales:");

        jPanel11.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        txtCalle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(51, 51, 51));
        txtCalle.setText("Calle");

        txtCodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCodigoPostal.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigoPostal.setText("Codigo Postal");

        txtColonia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(51, 51, 51));
        txtColonia.setText("Colonia");

        txtNumExterior.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNumExterior.setForeground(new java.awt.Color(51, 51, 51));
        txtNumExterior.setText("Num. Exterior");

        txtNumInterior.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNumInterior.setForeground(new java.awt.Color(51, 51, 51));
        txtNumInterior.setText("Num. Interior");

        txfNumExterior.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txfNumInterior.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txfColonia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txfCodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCodigoPostalActionPerformed(evt);
            }
        });
        txfCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCodigoPostalKeyTyped(evt);
            }
        });

        txfCalle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnVolver.setBackground(new java.awt.Color(153, 153, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(153, 153, 0));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumExterior)
                    .addComponent(txtColonia)
                    .addComponent(txtCalle)
                    .addComponent(txtCodigoPostal)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumInterior)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfNumInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(txtTitulo)
                .addGap(56, 56, 56)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle)
                    .addComponent(txfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPostal)
                    .addComponent(txfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColonia)
                    .addComponent(txfColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumExterior)
                    .addComponent(txfNumExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumInterior)
                    .addComponent(txfNumInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal pi = new MenuPrincipal(cliente, cuentaDAO, conexion);
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
      ClienteNuevoDTO clienteNuevoDTO = actaulizarCliente();

        DomicilioNuevoDTO domicilioNuevoDTO = new DomicilioNuevoDTO();
        domicilioNuevoDTO.setCalle(txfCalle.getText());
        domicilioNuevoDTO.setCodigo_postal(Integer.valueOf(txfCodigoPostal.getText()));
        domicilioNuevoDTO.setColonia(txfColonia.getText());
        domicilioNuevoDTO.setId_cliente(cliente.getId());
        domicilioNuevoDTO.setNumero_exterior(Integer.valueOf(txfNumExterior.getText()));
        domicilioNuevoDTO.setNumero_interior(Integer.valueOf(txfNumInterior.getText()));
        try {
            Cliente clienteAct = clienteDAO.actualizar(clienteNuevoDTO, cliente);

            Domicilio domicilioAct = domicilioDAO.actualizar(domicilioNuevoDTO, domicilio);

            JOptionPane.showMessageDialog(this, "Actualizacion de datos Correcta!");
            this.cliente = clienteAct;
            MenuPrincipal pi = new MenuPrincipal(cliente, cuentaDAO, conexion);
            pi.setVisible(true);
            this.dispose();
        } catch (PersistenciaException ex) {
            JOptionPane.showMessageDialog(this, "No se puede agregar al cliente.");
        }

    
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txfCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCodigoPostalActionPerformed
        
    }//GEN-LAST:event_txfCodigoPostalActionPerformed

    private void txfCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCodigoPostalKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txfCodigoPostal.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txfCodigoPostalKeyTyped
       
    /**
     * Actualiza la información del cliente utilizando los datos ingresados en
     * los campos de texto.
     *
     * @return Un objeto ClienteNuevoDTO con la información actualizada del
     * cliente.
     */
    private ClienteNuevoDTO actaulizarCliente() {
        ClienteNuevoDTO clienteNuevoDTO = new ClienteNuevoDTO();
        if (txfNombre.getText().equals("")) {
            clienteNuevoDTO.setNombres(cliente.getNombres());
        } else {
            clienteNuevoDTO.setNombres(txfNombre.getText());
        }

        if (txfApellidoPaterno.getText().equals("")) {
            clienteNuevoDTO.setApellido_paterno(cliente.getApellido_paterno());
        } else {
            clienteNuevoDTO.setApellido_paterno(txfApellidoPaterno.getText());
        }

        if (txfApellidoMaterno.getText().equals("")) {
            clienteNuevoDTO.setApellido_materno(cliente.getApellido_materno());
        } else {
            clienteNuevoDTO.setApellido_materno(txfApellidoMaterno.getText());
        }

        if (txfNacimiento.getText().equals("")) {
            clienteNuevoDTO.setNacimiento(cliente.getNacimiento());
        } else {
            clienteNuevoDTO.setNacimiento(txfNacimiento.getText());
        }
        return clienteNuevoDTO;
    }
  
    /**
     * Actualiza la información de la dirección utilizando los datos ingresados
     * en los campos de texto.
     *
     * @return Un objeto DomicilioNuevoDTO con la información actualizada de la
     * dirección.
     */
    private DomicilioNuevoDTO actualizarDireccion() {
        DomicilioNuevoDTO dn = new DomicilioNuevoDTO();

        if (!txfCalle.getText().equals("")) {
            dn.setCalle(txfCalle.getText());
        }
        if (!txfCodigoPostal.getText().equals("")) {
            dn.setCodigo_postal(Integer.valueOf(txfCodigoPostal.getText()));
        }
        if (!txfColonia.getText().equals("")) {
            dn.setColonia(txfColonia.getText());
        }
        if (!txfNumExterior.getText().equals("")) {
            dn.setNumero_exterior(Integer.valueOf(txfNumExterior.getText()));
        }
        if (!txfNumExterior.getText().equals("")) {
            dn.setNumero_interior(Integer.valueOf(txfNumInterior.getText()));
        }
        if (!txfNumExterior.getText().equals("")) {
            dn.setId_cliente(cliente.getId());
        }
        return dn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JTextField txfApellidoMaterno;
    private javax.swing.JTextField txfApellidoPaterno;
    private javax.swing.JTextField txfCalle;
    private javax.swing.JTextField txfCodigoPostal;
    private javax.swing.JTextField txfColonia;
    private javax.swing.JTextField txfConfirmarContraseña;
    private javax.swing.JTextField txfContraseña;
    private javax.swing.JTextField txfNacimiento;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfNumExterior;
    private javax.swing.JTextField txfNumInterior;
    private javax.swing.JLabel txtApellidoMaterno;
    private javax.swing.JLabel txtApellidoPaterno;
    private javax.swing.JLabel txtCalle;
    private javax.swing.JLabel txtCodigoPostal;
    private javax.swing.JLabel txtColonia;
    private javax.swing.JLabel txtConfirmarContraseña;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtINombre;
    private javax.swing.JLabel txtNacimiento;
    private javax.swing.JLabel txtNumExterior;
    private javax.swing.JLabel txtNumInterior;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
