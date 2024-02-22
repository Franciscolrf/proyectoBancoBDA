/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.presentacionbanco;

import com.mycompany.dominiobanco.Cliente;
import com.mycompany.dominiobanco.Cuenta;
import com.mycompany.dominiobanco.Transaccion;
import conexion.IConexion;
import dao.ICuentaDAO;
import dao.ITransaccionDAO;
import dao.TransaccionDAO;
import excepciones.PersistenciaException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ID145
 */
public class Movimientos extends javax.swing.JFrame {

    private Cliente cliente;
    private Cuenta cuenta;
    private final IConexion conexion;
    private ICuentaDAO cuentaDAO;
    private ITransaccionDAO transaccionDAO;

    /**
     * Creates new form Movimientos
     */
    public Movimientos(Cliente cliente, Cuenta cuenta, IConexion conexion, ICuentaDAO cuentaDAO) {
        initComponents();

        this.cliente = cliente;
        this.cuenta = cuenta;
        this.conexion = conexion;
        this.cuentaDAO = cuentaDAO;
        this.transaccionDAO = new TransaccionDAO(conexion);

        String saludo = txtSaludo.getText().replaceAll("Usuario", cliente.getNombres());
        txtSaludo.setText(saludo);

        txtIDeTarjeta.setText("Tarjeta " + cuenta.getNumero());

        insertarDatos();
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
        txtIDeTarjeta = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        txtSaludo = new javax.swing.JLabel();
        txtFiltrado = new javax.swing.JLabel();
        txtDesde = new javax.swing.JLabel();
        txtaaaammdd = new javax.swing.JLabel();
        txfDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JLabel();
        txtaaaammddd = new javax.swing.JLabel();
        txfHasta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabMoviemientos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

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

        txtIDeTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIDeTarjeta.setForeground(new java.awt.Color(51, 51, 51));
        txtIDeTarjeta.setText("Tarjetas");

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitulo.setText("Movimientos");

        txtSaludo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSaludo.setForeground(new java.awt.Color(51, 51, 51));
        txtSaludo.setText("¡Hola, Usuario!");

        txtFiltrado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtFiltrado.setForeground(new java.awt.Color(51, 51, 51));
        txtFiltrado.setText("Filtrado");

        txtDesde.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtDesde.setForeground(new java.awt.Color(51, 51, 51));
        txtDesde.setText("Desde");

        txtaaaammdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtaaaammdd.setForeground(new java.awt.Color(51, 51, 51));
        txtaaaammdd.setText("(aaaa-mm-dd)");

        txfDesde.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDesdeActionPerformed(evt);
            }
        });
        txfDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfDesdeKeyTyped(evt);
            }
        });

        txtHasta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtHasta.setForeground(new java.awt.Color(51, 51, 51));
        txtHasta.setText("Hasta");

        txtaaaammddd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtaaaammddd.setForeground(new java.awt.Color(51, 51, 51));
        txtaaaammddd.setText("(aaaa-mm-dd)");

        txfHasta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHastaActionPerformed(evt);
            }
        });
        txfHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfHastaKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(153, 153, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(153, 153, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        TabMoviemientos.setBackground(new java.awt.Color(204, 204, 204));
        TabMoviemientos.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        TabMoviemientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Movimientos", "Fecha y Hora", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabMoviemientos.setToolTipText("");
        TabMoviemientos.setGridColor(new java.awt.Color(2, 48, 71));
        TabMoviemientos.setSelectionBackground(new java.awt.Color(142, 202, 230));
        jScrollPane2.setViewportView(TabMoviemientos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTitulo)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIDeTarjeta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtHasta)
                                        .addGap(152, 152, 152))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtDesde)
                                                .addGap(26, 26, 26)
                                                .addComponent(txtaaaammdd))
                                            .addComponent(txtaaaammddd)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(btnBuscar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnVolver))
                                                .addComponent(txfHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(29, 29, 29))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSaludo)
                                    .addComponent(txtFiltrado)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo)
                    .addComponent(txtSaludo))
                .addGap(59, 59, 59)
                .addComponent(txtIDeTarjeta)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFiltrado)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesde)
                            .addComponent(txtaaaammdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHasta)
                            .addComponent(txtaaaammddd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver)
                            .addComponent(btnBuscar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String fechaDesde = txfDesde.getText();
        String fechaHasta = txfHasta.getText();

        if (!verificarFormatoFecha(fechaDesde) && !verificarFormatoFecha(fechaHasta)) {
            JOptionPane.showMessageDialog(this, "Las fechas tienen que estar en formato aaaa/mm/dd");
            return;
        }

        actualizarDatosFiltrados(fechaDesde, fechaHasta);
        actualizarDatosFiltrados(txfDesde.getText(), txfHasta.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Tarjeta ta = new Tarjeta(cliente, cuenta, conexion, cuentaDAO);
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    private void txfHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHastaActionPerformed

    private void txfDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDesdeActionPerformed

    private void txfDesdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDesdeKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '-') {
            evt.consume();
        }
    }//GEN-LAST:event_txfDesdeKeyTyped

    private void txfHastaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfHastaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '-') {
            evt.consume();
        }
    }//GEN-LAST:event_txfHastaKeyTyped

    /**
     * Inserta los datos de las transacciones en la Tabla "Tab Movimientos".
     */
    private void insertarDatos() {
        List<Transaccion> listaTransacciones;
        try {
            listaTransacciones = transaccionDAO.consultar(cuenta.getId_cuenta());
        } catch (PersistenciaException ex) {
            listaTransacciones = null;
            Logger
                    .getLogger(Movimientos.class
                            .getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel modelo = (DefaultTableModel) this.TabMoviemientos.getModel();
        modelo.setRowCount(0);
        listaTransacciones.forEach(transaccion -> {
            Object[] fila = new Object[3];
            fila[0] = transaccion.getTipo();
            fila[1] = transaccion.getFecha();
            fila[2] = "$ " + transaccion.getMonto();
            modelo.addRow(fila);
        });
    }

    /**
     * Actualiza los datos de las transacciones filtradas por un período
     *
     * @param desde La fecha de inicio del período de filtrado.
     * @param hasta La fecha de fin del período de filtrado.
     */
    private void actualizarDatosFiltrados(String desde, String hasta) {
        List<Transaccion> listaTransacciones;
        try {
            listaTransacciones = transaccionDAO.consultarPeriodo(cuenta.getId_cuenta(), desde, hasta);
        } catch (PersistenciaException ex) {
            listaTransacciones = null;
            Logger
                    .getLogger(Movimientos.class
                            .getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel modelo = (DefaultTableModel) this.TabMoviemientos.getModel();
        modelo.setRowCount(0);
        listaTransacciones.forEach(transaccion -> {
            Object[] fila = new Object[3];
            fila[0] = transaccion.getTipo();
            fila[1] = transaccion.getFecha();
            fila[2] = "$ " + transaccion.getMonto();
            modelo.addRow(fila);
        });
    }
    
    /**
     * Valida que la fecha tenga el formato correcto (AAAA-MM-DD).
     *
     * @param fecha La cadena de texto que se desea verificar.
     * @return true si la cadena tiene el formato de fecha esperado.
     */
    public static boolean verificarFormatoFecha(String fecha) {
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        return Pattern.matches(regex, fecha);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabMoviemientos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txfDesde;
    private javax.swing.JTextField txfHasta;
    private javax.swing.JLabel txtDesde;
    private javax.swing.JLabel txtFiltrado;
    private javax.swing.JLabel txtHasta;
    private javax.swing.JLabel txtIDeTarjeta;
    private javax.swing.JLabel txtSaludo;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtaaaammdd;
    private javax.swing.JLabel txtaaaammddd;
    // End of variables declaration//GEN-END:variables
}
