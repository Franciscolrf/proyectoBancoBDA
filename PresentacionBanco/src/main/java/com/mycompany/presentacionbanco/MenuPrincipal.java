/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.presentacionbanco;

import com.mycompany.dominiobanco.Cliente;
import com.mycompany.dominiobanco.Cuenta;
import conexion.IConexion;
import dao.ClienteDAO;
import dao.IClienteDAO;
import dao.ICuentaDAO;
import dto.CuentaNuevaDTO;
import excepciones.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author ID145
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private Cliente cliente;
    private ICuentaDAO cuentaDAO;
    private final IConexion conexion;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Cliente cliente, ICuentaDAO cuentaDAO, IConexion conexion) {
        initComponents();
        this.cliente = cliente;
        this.cuentaDAO = cuentaDAO;
        this.conexion = conexion;

        String saludo = txtSaludo.getText().replaceAll("Usuario", cliente.getNombres());
        txtSaludo.setText(saludo);

        listarCuentas();

        ListTarjetas.addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                int index = ListTarjetas.getSelectedIndex();
                if (index != -1) {
                    String cuenta = modeloLista.getElementAt(index);
                    Tarjeta tarjeta = new Tarjeta(cliente, consultarCuenta(Integer.valueOf(cuenta)), conexion, cuentaDAO);
                    tarjeta.setVisible(true);
                    this.dispose();
                }
            }
        });
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
        txtIDdeUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListTarjetas = new javax.swing.JList<>();
        txtSaludo = new javax.swing.JLabel();
        btnOpciones = new javax.swing.JButton();
        btnCrearTarjetas = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitulo.setText("Banco");

        txtIDdeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIDdeUsuario.setText("Tus Tarjetas");

        jScrollPane1.setViewportView(ListTarjetas);

        txtSaludo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSaludo.setText("¡Hola, Usuario!");

        btnOpciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnOpciones.setText("Actualizar Cliente");
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });

        btnCrearTarjetas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCrearTarjetas.setText("Crear Tarjeta");
        btnCrearTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTarjetasActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSaludo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIDdeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpciones)))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(btnCrearTarjetas)
                    .addContainerGap(566, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(558, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion)
                    .addGap(94, 94, 94)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtSaludo))))
                        .addGap(18, 18, 18)
                        .addComponent(txtIDdeUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(459, Short.MAX_VALUE)
                    .addComponent(btnCrearTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(460, Short.MAX_VALUE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        IClienteDAO clienteDAO = new ClienteDAO(conexion);
        PantallaInicial pi = new PantallaInicial(clienteDAO, conexion);
        pi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCrearTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTarjetasActionPerformed
        CuentaNuevaDTO cuentaNDTO = new CuentaNuevaDTO();
        cuentaNDTO.setSaldo(500);
        cuentaNDTO.setId_cliente(cliente.getId());
        cuentaNDTO.setEsta_activo(true);
        try {
            Cuenta cuenta = cuentaDAO.agregar(cuentaNDTO);
            JOptionPane.showMessageDialog(this, "Tarjeta agregada!");
        } catch (PersistenciaException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modeloLista.removeAllElements();
        listarCuentas();
    }//GEN-LAST:event_btnCrearTarjetasActionPerformed

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        ModificarCliente mc = new ModificarCliente(cliente, cuentaDAO, conexion);
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOpcionesActionPerformed

    /**
     * Lista las cuentas que tiene el cliente en "ListTarjetas"
     *
     * @throws PersistenciaException por si falla en accesar a los datos
     */
    private void listarCuentas() {

        List<Cuenta> cuentas = null;

        try {
            cuentas = cuentaDAO.consultar(cliente.getId());
        } catch (PersistenciaException pe) {
            pe.printStackTrace();
            // Manejar la excepción aquí
        }
        for (Cuenta cuenta : cuentas) {
            if (cuenta.isEsta_activo()) {
                modeloLista.addElement(String.valueOf(cuenta.getNumero()));
            }
        }
        ListTarjetas.setModel(modeloLista);
        jScrollPane1.setViewportView(ListTarjetas);
    }
    
    /**
     * Consulta la cuenta por medio del numero de cuenta (cuentaNum) y la
     * devuelve
     *
     * @param cuentaNum El número de cuenta usado para encontrar la cuenta;
     * @return Cuenta respecto al numero de cuenta, o null si no se encuentra
     * ninguna cuenta.
     * @throws PersistenciaException por si falla en accesar a los datos
     */
    private Cuenta consultarCuenta(int cuentaNum) {
        Cuenta cuenta = null;
        try {
            cuenta = this.cuentaDAO.consultarCuenta(cuentaNum);
        } catch (PersistenciaException ex) {
            Logger.getLogger(PantallaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenta;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListTarjetas;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearTarjetas;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtIDdeUsuario;
    private javax.swing.JLabel txtSaludo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
