/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsaempleo;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class FormularioCiclos extends javax.swing.JDialog {

    /**
     * Creates new form FormularioCiclos
     */
    public FormularioCiclos(java.awt.Frame parent, boolean modal) {
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

        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelCabecera = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelRama = new javax.swing.JLabel();
        labelImpartido = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        inputRama = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        inputCodigo = new javax.swing.JFormattedTextField();
        labelNivel = new javax.swing.JLabel();
        radioMedio = new javax.swing.JRadioButton();
        radioSuperior = new javax.swing.JRadioButton();
        checkImpartido = new javax.swing.JCheckBox();
        radioBasico = new javax.swing.JRadioButton();

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
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 420));

        labelCodigo.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelCodigo.setText("Código del ciclo:");

        labelNombre.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelNombre.setText("Nombre:");

        labelRama.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelRama.setText("Rama:");

        labelImpartido.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelImpartido.setText("¿Es impartido actualmente?");

        inputNombre.setToolTipText("<html>Introduce el <b>nombre</b> del ciclo formativo aquí");

        inputRama.setToolTipText("<html>Introduce la <b>rama</b> del ciclo formativo aquí");
        inputRama.setPreferredSize(new java.awt.Dimension(50, 26));

        btnCancelar.setBackground(new java.awt.Color(232, 232, 232));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("<html>Pulsa para </b>cancelar</b> y salir del formulario");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(232, 232, 232));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("<html>Pulsa para <b>guardar</b> o <b>modificar</b> los datos introducidos");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Añadir ciclo formativo");

        try {
            inputCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCodigo.setToolTipText("<html>Este código se compone de <b>5 números</b> y está <b>especificado por la Junta de Andalucía </b>");

        labelNivel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelNivel.setText("Grado:");

        radioMedio.setText("Medio");
        radioMedio.setToolTipText("<html>Seleccionalo si el ciclo formativo es de <b>grado medio</b></html>");

        radioSuperior.setText("Superior");
        radioSuperior.setToolTipText("<html>Seleccionalo si el ciclo formativo es de <b>grado superior</b></html>");

        checkImpartido.setToolTipText("<html>Seleccionalo si el ciclo formativo es <b>impartido actualmente</b></html>");

        radioBasico.setText("Básico");
        radioBasico.setToolTipText("<html>Seleccionalo si el ciclo formativo es de <b>grado medio</b></html>");

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelContenidoLayout.createSequentialGroup()
                                    .addComponent(labelImpartido)
                                    .addGap(104, 104, 104)
                                    .addComponent(checkImpartido))
                                .addGroup(panelContenidoLayout.createSequentialGroup()
                                    .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelRama)
                                        .addComponent(labelNombre)
                                        .addComponent(labelCodigo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputRama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(inputNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelContenidoLayout.createSequentialGroup()
                                    .addComponent(labelNivel)
                                    .addGap(20, 20, 20)
                                    .addComponent(radioBasico)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioMedio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioSuperior))))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo))
                .addGap(20, 20, 20)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRama)
                    .addComponent(inputRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelImpartido))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(checkImpartido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivel)
                    .addComponent(radioBasico)
                    .addComponent(radioMedio)
                    .addComponent(radioSuperior))
                .addGap(33, 33, 33)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        getContentPane().add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 340, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cierra el formulario
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    /**
     * Guardar ciclo formativo en base de datos
     * @param evt 
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean modificar = false;
        boolean correcto = true;
        String esAñadir = titulo.getText();
        String codigoText="", grado="";
        try {
            codigoText = (String) inputCodigo.getText();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("CODIGO TEXTO = "+codigoText);
        String nombre = inputNombre.getText();
        String rama = inputRama.getText();
        int impartido = 0, codigo = 0;
        // compruebo codigo
        if (codigoText.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo código no es correcto, verifica que son 5 números","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        } else {
            try {
                codigo = Integer.parseInt(codigoText);
            } catch(NumberFormatException nfe) {
                nfe.printStackTrace();
                JOptionPane.showMessageDialog(null, "El campo código no es correcto, verifica que son 5 números","Error", JOptionPane.WARNING_MESSAGE);
                correcto = false;
            }
            
        }
        // compruebo nombre
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar el campo nombre vacío","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        // compruebo rama
        if (rama.equals("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar el campo rama vacío","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        // compruebo seleccion impartido
        if (checkImpartido.isSelected() == true ) {
            impartido = 1;
        } else {
            impartido = 0;
        }
        if (radioMedio.isSelected() == true ) {
            grado = "Medio";
        } else if(radioSuperior.isSelected() == true) {
            grado = "Superior";
        } else if(radioBasico.isSelected() == true){
            grado = "Básico";
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar si el ciclo es grado medio o superior","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        // Compruebo si es añadir o modificar ciclo
        if (esAñadir.equals("Añadir ciclo formativo")) {
            modificar = false;
        } else {
            modificar = true;
        }
        System.out.println("VALOR MODIFICAR = "+modificar);
        System.out.println("VALOR CODIGO = "+codigo);
        if (correcto && !modificar) {
            System.out.println("MENSAJE: Voy a guardar ciclo");
            try {
                PreparedStatement insertar;
                insertar = this.bd.dameConexion().prepareStatement("INSERT INTO ciclo (codigo_junta,nombre,rama,nivel,impartido) VALUES (?,?,?,?,?)");
                insertar.setInt(1, codigo);
                insertar.setString(2, nombre);
                insertar.setString(3, rama);
                insertar.setString(4, grado);
                insertar.setInt(5, impartido);
                insertar.executeUpdate();
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Ciclo formativo guardado correctamente","Exito al guardar", JOptionPane.INFORMATION_MESSAGE);
                aplicacion.muestraTablaCiclos("", "", false);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error SQL", JOptionPane.WARNING_MESSAGE);
            }
            aplicacion.desactivarBotones();
        } else if (correcto && modificar) {
            System.out.println("MENSAJE: Voy a modificar datos del ciclo");
            try {
                PreparedStatement modificarSQL;
                modificarSQL = this.bd.dameConexion().prepareStatement("UPDATE ciclo SET nombre = ?, rama = ?, nivel = ?, impartido = ? WHERE codigo_junta = ?");
                modificarSQL.setString(1, nombre);
                modificarSQL.setString(2, rama);
                modificarSQL.setString(3, grado);
                modificarSQL.setInt(4, impartido);
                modificarSQL.setInt(5, codigo);
                modificarSQL.executeUpdate();
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Ciclo formativo modificado correctamente","Exito al modificar", JOptionPane.INFORMATION_MESSAGE);
                aplicacion.muestraTablaCiclos("", "", false);
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error SQL", JOptionPane.WARNING_MESSAGE);
            }
            aplicacion.desactivarBotones();
        } else {System.out.println("AQUÍ NO DEBERÍA DE ENTRAR");}
    }//GEN-LAST:event_btnGuardarActionPerformed


    /**
     * Configura el formulario para añadir un nuevo ciclo formativo
     */
    public void preparaFormNuevo() {
        this.setResizable(false);
        panelCabecera.setBackground(colorPanelCabecera);
        panelContenido.setBackground(colorPanelContenido);
        titulo.setText("Añadir ciclo formativo");
        this.setTitle("Añadir ciclo formativo");
        inputCodigo.setText("");
        inputNombre.setText("");
        inputRama.setText("");
        checkImpartido.setSelected(false);
        radioMedio.setSelected(false);
        radioSuperior.setSelected(false);
        inputCodigo.setEditable(true);
        buttonGroup2.add(radioMedio);
        buttonGroup2.add(radioSuperior);
        buttonGroup2.add(radioBasico);
    }
    
    /**
     * Configura el formulario para modificar un ciclo formativo
     * @param codigo
     * @param nombre
     * @param rama
     * @param nivel
     * @param impartido
     */
    public void preparaFormMod(int codigo, String nombre, String rama, String nivel, int impartido) {
        this.setResizable(false);
        panelCabecera.setBackground(colorPanelCabecera);
        panelContenido.setBackground(colorPanelContenido);
        titulo.setText("Modificar ciclo formativo");
        this.setTitle("Modificar ciclo formativo");
        inputCodigo.setText(Integer.toString(codigo));
        inputNombre.setText(nombre);
        inputRama.setText(rama);
        if (impartido == 1) {
            checkImpartido.setSelected(true);
        } else {
            checkImpartido.setSelected(false);
        }
        if (nivel.equals("Superior")) {
            radioSuperior.setSelected(true);
            radioMedio.setSelected(false);
            radioBasico.setSelected(false);
        } else if (nivel.equals("Medio")){
            radioMedio.setSelected(true);
            radioSuperior.setSelected(false);
            radioBasico.setSelected(false);
        } else {
            radioMedio.setSelected(false);
            radioSuperior.setSelected(false);
            radioBasico.setSelected(true);
        }
        buttonGroup2.add(radioMedio);
        buttonGroup2.add(radioSuperior);
        buttonGroup2.add(radioBasico);
        Dimension tamInput = new Dimension(150,26);
        inputCodigo.setPreferredSize(tamInput);
        inputCodigo.setMaximumSize(tamInput);
        inputCodigo.setMinimumSize(tamInput);
        inputNombre.setPreferredSize(tamInput);
        inputNombre.setMaximumSize(tamInput);
        inputNombre.setMinimumSize(tamInput);
        inputRama.setPreferredSize(tamInput);
        inputRama.setMaximumSize(tamInput);
        inputRama.setMinimumSize(tamInput);
    }
    
    /**
     * Coge la conexión abierta a la BD por la aplicación
     * @param con 
     */
    public void darConexionAbierta(BD con) {
        System.out.println("AVISO: Paso la conexión BD a nuevo ciclo");
        this.bd = con;
    }
    
    /**
     * Me permite pasar la ventana de la aplicación abierta
     * @param aplicacion
     */
    public void darVentanaApp(App aplicacion) {
        System.out.println("Paso la ventana de aplicación abierta");
        this.aplicacion = aplicacion;
    }
    
    // Clase APP
    private App aplicacion;
    
    // Clase BD
    private BD bd;
    
    // Colores del formulario
    Color colorPanelCabecera = new Color(85, 136, 163);
    Color colorPanelContenido = new Color(232, 232, 232);
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkImpartido;
    public javax.swing.JFormattedTextField inputCodigo;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputRama;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelImpartido;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRama;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JRadioButton radioBasico;
    private javax.swing.JRadioButton radioMedio;
    private javax.swing.JRadioButton radioSuperior;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
