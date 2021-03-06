/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsaempleo;

import java.awt.Color;
import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruben
 */
public class FormularioBusquedaEmpresas extends javax.swing.JDialog {

    /**
     * Creates new form FormularioBusquedaEmpresas
     */
    public FormularioBusquedaEmpresas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabecera = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelSector = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        comboSector = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPaneResultado = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnSelecciona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelCabeceraLayout = new javax.swing.GroupLayout(panelCabecera);
        panelCabecera.setLayout(panelCabeceraLayout);
        panelCabeceraLayout.setHorizontalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 380));

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Buscar empresa");
        titulo.setToolTipText("");

        labelNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelNombre.setText("Nombre:");

        labelSector.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelSector.setText("Sector:");

        inputNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        inputNombre.setToolTipText("Introduce el nombre de la empresa si lo sabes, si no deja este campo en blanco.");

        comboSector.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        comboSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnología", "Turismo", "Hostelería", "Educación", "Comercio", "Construcción", "Moda", "Farmacéutica", "Otros" }));
        comboSector.setToolTipText("Selecciona el sector al que pertenece la empresa que quieres buscar y se activará el botón buscar");
        comboSector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cogeCombo(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(232, 232, 232));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Pulsa aquí para realizar la búsqueda con los parámetros seleccionados");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableResultados.setToolTipText("Selecciona la empresa que quieres para activar el botón seleccionar");
        jTableResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cogeEmpresa(evt);
            }
        });
        jScrollPaneResultado.setViewportView(jTableResultados);

        btnCancelar.setBackground(new java.awt.Color(232, 232, 232));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela y cierra el formulario de búsqueda de empresa");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecciona.setBackground(new java.awt.Color(232, 232, 232));
        btnSelecciona.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnSelecciona.setText("Seleccionar");
        btnSelecciona.setToolTipText("Selecciona la empresa de la tabla y la pone en el formulario de oferta de empleo");
        btnSelecciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnSelecciona, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelContenidoLayout.createSequentialGroup()
                                        .addComponent(labelNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelContenidoLayout.createSequentialGroup()
                                        .addComponent(labelSector)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboSector, 0, 145, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPaneResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSector)
                            .addComponent(comboSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscar)))
                .addGap(20, 20, 20)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecciona, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 510, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSeleccionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionaActionPerformed
        int fila, idEmpresa;
        String nombre;
        fila = jTableResultados.getSelectedRow();
        idEmpresa = (Integer) jTableResultados.getModel().getValueAt(fila, 0);
        nombre = (String) jTableResultados.getModel().getValueAt(fila, 1);
        System.out.println("ID EMPRESA: "+idEmpresa+" - NOMBRE: "+nombre);
        formularioNuevaOferta.ponerDatosEmpresas(nombre, idEmpresa);
        this.setVisible(false);
    }//GEN-LAST:event_btnSeleccionaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String nombre, combo="";
       nombre = inputNombre.getText();
       try {
           combo = comboSector.getSelectedItem().toString();
       } catch(Exception e) {
           System.out.println("ERROR: "+e.getMessage());
       }
       listaResultadoBusqueda(nombre, combo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cogeCombo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cogeCombo
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_cogeCombo

    private void cogeEmpresa(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cogeEmpresa
        btnSelecciona.setEnabled(true);
    }//GEN-LAST:event_cogeEmpresa

    /**
     * Prepara el formulario para buscar empresa
     */
    public void preparaFormBusqueda() {
        this.setResizable(false);
        panelCabecera.setBackground(colorPanelCabecera);
        panelContenido.setBackground(colorPanelContenido);
        this.setTitle("Buscar empresa");
        inputNombre.setText("");
        comboSector.setSelectedIndex(-1);
        btnCancelar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnSelecciona.setEnabled(false);
        modeloTabla = new DefaultTableModel();
        jTableResultados.setModel(modeloTabla);
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Sector");
    }
    
    private void listaResultadoBusqueda(String nombre, String sector) {
        DefaultTableModel model = (DefaultTableModel) this.jTableResultados.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            ResultSet rs;
            String mensaje;
            PreparedStatement consulta;
            nombre = "%" + nombre + "%";
            consulta = this.bd.dameConexion().prepareStatement("SELECT * FROM empresa WHERE nombre LIKE ? AND sector = ?");
            consulta.setString(1, nombre);
            consulta.setString(2, sector);
            rs = consulta.executeQuery();
            System.out.println(rs);
            if (!rs.next()) {
                mensaje = "No se han encontrado coincidencias en la búsqueda con los parámetros indicados.";
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, mensaje, "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                do {
                    model.addRow(new Object[]{
                        rs.getInt("empresa_id"),
                        rs.getString("nombre"),
                        rs.getString("sector")
                    });
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        this.setVisible(true);
    }
    
    /**
     * Coge la conexión abierta a la BD por la aplicación
     * @param con 
     */
    public void darConexionAbierta(BD con) {
        System.out.println("AVISO: Paso la conexión BD a Buscar empresas");
        this.bd = con;
    }
    
    /**
     * Me permite pasar la ventana del formulario de ofertas abierto
     * @param formularioNuevaOferta 
     */
    public void darVentanaApp(FormularioOfertas formularioNuevaOferta) {
        System.out.println("Paso la ventana de aplicación abierta");
        this.formularioNuevaOferta = formularioNuevaOferta;
    }
    
    // Formulario nueva oferta
    private FormularioOfertas formularioNuevaOferta;
    
    // Clase BD
    private BD bd;
    
    // Modelo de la tabla
    private DefaultTableModel modeloTabla;
    
    // Colores del formulario
    Color colorPanelCabecera = new Color(85, 136, 163);
    Color colorPanelContenido = new Color(232, 232, 232);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecciona;
    private javax.swing.JComboBox<String> comboSector;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JScrollPane jScrollPaneResultado;
    private javax.swing.JTable jTableResultados;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSector;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
