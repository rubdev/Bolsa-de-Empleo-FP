/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsaempleo;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruben
 */
public class FormularioEnviar extends javax.swing.JDialog {

    /**
     * Creates new form FormularioEnviar
     */
    public FormularioEnviar(java.awt.Frame parent, boolean modal) {
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
        jScrollPane = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        labelCiclos = new javax.swing.JLabel();
        btnSeleccionarTodos = new javax.swing.JButton();
        labelEmails = new javax.swing.JLabel();
        labelAsunto = new javax.swing.JLabel();
        inputAsunto = new javax.swing.JTextField();
        labelContenido = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoContenido = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnEnviarMail = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextoEmails = new javax.swing.JTextArea();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enviar ofertas vía email");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout panelCabeceraLayout = new javax.swing.GroupLayout(panelCabecera);
        panelCabecera.setLayout(panelCabeceraLayout);
        panelCabeceraLayout.setHorizontalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 470));

        panelContenido.setToolTipText("");

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Enviar oferta de empleo");

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAlumnos.setToolTipText("<html>Selecciona algún alumno para activar el botón </b>añadir</b> <br>\ny añadirlo a la lista de alumnos a los que se enviará la oferta.<br>\nSi pulsas en el botón <b>seleccionar todos</b> se añadirá todos los<br>\nalumnos disponibles a la lista de envío de la oferta.");
        jTableAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicEnFila(evt);
            }
        });
        jScrollPane.setViewportView(jTableAlumnos);

        labelCiclos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelCiclos.setText("Alumnos con el ciclo formativo requerido:");

        btnSeleccionarTodos.setBackground(new java.awt.Color(232, 232, 232));
        btnSeleccionarTodos.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnSeleccionarTodos.setText("Seleccionar todos");
        btnSeleccionarTodos.setToolTipText("<html>Pulsa para <b>añadir a todos los alumnos</b> disponibles a la <b>lista de envío</b>");
        btnSeleccionarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTodosActionPerformed(evt);
            }
        });

        labelEmails.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelEmails.setText("Emails de alumnos seleccionados:");

        labelAsunto.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelAsunto.setText("Asunto del email:");

        inputAsunto.setToolTipText("<html>Introduce aquí el <b>asunto</b> del email");
        inputAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAsuntoActionPerformed(evt);
            }
        });

        labelContenido.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        labelContenido.setText("Contenido del mensaje:");

        TextoContenido.setColumns(20);
        TextoContenido.setRows(5);
        TextoContenido.setToolTipText("<html>Introduce aquí el contenido del mensaje que llegará a los alumnos.<br>\nPor defecto aparece la <b>información de la oferta</b>.");
        jScrollPane2.setViewportView(TextoContenido);

        btnCancelar.setBackground(new java.awt.Color(232, 232, 232));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("<html>Pulsa para </b>cancelar</b> y salir del formulario");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEnviarMail.setBackground(new java.awt.Color(232, 232, 232));
        btnEnviarMail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnEnviarMail.setText("Enviar");
        btnEnviarMail.setToolTipText("<html>Pulsa para </b>enviar la oferta</b>");
        btnEnviarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMailActionPerformed(evt);
            }
        });

        TextoEmails.setColumns(20);
        TextoEmails.setRows(5);
        TextoEmails.setToolTipText("<html>Estos son los <b>emails de los alumnos</b><br>que has seleccionado para enviarles la oferta");
        jScrollPane3.setViewportView(TextoEmails);

        btnSeleccionar.setBackground(new java.awt.Color(232, 232, 232));
        btnSeleccionar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnSeleccionar.setText("Añadir");
        btnSeleccionar.setToolTipText("<html>Pulsa para <b>añadir</b> el alumno seleccionado a la <b>lista de envío</b>");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(labelCiclos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeleccionarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)))
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelContenidoLayout.createSequentialGroup()
                            .addComponent(labelAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inputAsunto))
                        .addComponent(labelContenido)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarMail)))
                .addGap(40, 40, 40))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCiclos)
                    .addComponent(labelAsunto)
                    .addComponent(inputAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(labelContenido)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnviarMail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSeleccionarTodos)
                            .addComponent(btnSeleccionar))
                        .addGap(20, 20, 20)
                        .addComponent(labelEmails)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 770, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTodosActionPerformed
        System.out.println("MENSAJE: Añado todos los emails como destinatarios");
        String email;
        for (int i = 0; i < jTableAlumnos.getRowCount(); i++) {
            email = (String) jTableAlumnos.getValueAt(i, 1);
            emailsAlumnos.add(email);
        }
        TextoEmails.setText(emailsAlumnos.toString());
        btnSeleccionarTodos.setEnabled(false);
        jTableAlumnos.setEnabled(false);
        System.out.println(emailsAlumnos.toString());        
    }//GEN-LAST:event_btnSeleccionarTodosActionPerformed

    private void inputAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAsuntoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMailActionPerformed
        boolean correcto = true;
        String asunto, contenido, email = null, pass = null;
        asunto = inputAsunto.getText();
        contenido = TextoContenido.getText();
        // compruebo que haya emails, asunto y contenido para enviar
        if (emailsAlumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningún email de alumno al que enviar la oferta","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        if (asunto.equals("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar el asunto del email vacío","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        if (contenido.equals("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar el contenido del email vacío","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        
        }
        // compruebo que hay email y contraseña configurados
        try {
            ResultSet rs;
            PreparedStatement consulta;
            consulta = this.bd.dameConexion().prepareStatement("SELECT * FROM infoemail WHERE  id = ?");
            consulta.setInt(1, 1);
            rs = consulta.executeQuery();
            System.out.println(rs);
            if (rs.next()) {
                email = rs.getString("email");
                pass = rs.getString("password");
            }
            System.out.println("Email y contraseña configurada: "+email+" - "+pass);
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No tienes ninguna cuenta de email configurada, por favor configura primero una","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        }
        if (email == null && pass == null) {
            JOptionPane.showMessageDialog(null, "No tienes ninguna cuenta de email configurada, por favor configura primero una","Error", JOptionPane.WARNING_MESSAGE);
            correcto = false;
        } 
        // si todo es correcto se procede a enviar el email
        if (correcto) {
            String host;
            System.out.println("MENSAJE: Todo correcto, se procede a enviar la oferta a los alumnos seleccionados");
            if (email.contains("@gmail")) {
                host = "smtp.gmail.com";
            } else {
                host = "SMTP.Office365.com";
            }
            try {
                Properties props = new Properties();
                // Nombre del host de correo, es smtp.gmail.com
                props.setProperty("mail.smtp.host", host);
                // TLS si está disponible
                props.setProperty("mail.smtp.starttls.enable", "true");
                // Puerto de gmail para envio de correos
                props.setProperty("mail.smtp.port", "587");
                // Nombre del usuario
                props.setProperty("mail.smtp.user", email);
                // Si requiere o no usuario y password para conectarse.
                props.setProperty("mail.smtp.auth", "true");
                // Preparamos la sesion
                Session session = Session.getDefaultInstance(props);
                session.setDebug(true);
                 // Construimos el mensaje
                MimeMessage message = new MimeMessage(session);
                // Este es quien envía el correo
                message.setFrom(new InternetAddress(email));
                // Este es a quién va dirigido
                for (String emailAlumno : emailsAlumnos) {
                    message.addRecipient(
                        Message.RecipientType.TO,
                        new InternetAddress(emailAlumno));
                }
                // El contenido del mensaje
                message.setSubject(asunto);
                message.setText(contenido);
                // Lo enviamos.
                Transport t = session.getTransport("smtp");
                t.connect((String)props.get("mail.smtp.user"), pass);
                t.sendMessage(message, message.getAllRecipients());
                // Cierre.
                t.close();
            } catch (MessagingException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "La oferta de empleo se envió correctamente a los alumnos seleccionados", "Oferta enviada", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnEnviarMailActionPerformed

    private void clicEnFila(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicEnFila
        if (evt.getClickCount() == 2) {
            System.out.println("Selecciono email de alumno");
            
        } else if(evt.getClickCount() == 1) {
            System.out.println("Hago un solo clic en la tabla");
            btnSeleccionar.setEnabled(true);
        }
    }//GEN-LAST:event_clicEnFila

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        boolean esta=false;
        int fila = jTableAlumnos.getSelectedRow();
        String email = (String) jTableAlumnos.getModel().getValueAt(fila, 1);
        System.out.println("Email de alumno seleccionado: "+email);
        for (String emailAlumno : emailsAlumnos) {
            if (emailAlumno.equals(email)) {
                esta = true;
            }
        }
        if (!esta) {
            emailsAlumnos.add(email);
        }
        TextoEmails.setText(emailsAlumnos.toString());
        btnSeleccionar.setEnabled(false);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    
    void preparaFormulario(int cicloFormativo, int idEmpresa, String descripcion, String requisitos, String tipo) {
        this.setResizable(false);
        panelCabecera.setBackground(colorPanelCabecera);
        panelContenido.setBackground(colorPanelContenido);
        TextoEmails.setEditable(false);
        jTableAlumnos.setEnabled(true);
        modeloTabla = new DefaultTableModel();
        jTableAlumnos.setModel(modeloTabla);
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Email");
        DefaultTableModel model = (DefaultTableModel) this.jTableAlumnos.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            ResultSet rs;
            String mensaje;
            PreparedStatement consulta;
            consulta = this.bd.dameConexion().prepareStatement("SELECT * FROM alumno WHERE  ciclo_formativo = ?");
            consulta.setInt(1, cicloFormativo);
            rs = consulta.executeQuery();
            System.out.println(rs);
            if (rs.next()) {
                do {
                    model.addRow(new Object[]{
                        rs.getString("nombre"),
                        rs.getString("email")
                    });
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        emailsAlumnos.clear();
        btnSeleccionar.setEnabled(false);
        btnSeleccionarTodos.setEnabled(true);
        TextoEmails.setText("");
        inputAsunto.setText("");
        String nombreEmp = null, encargado = null, email = null, tipoStr, descripcionStr, requisitosStr; 
        try {
            ResultSet rs;
            String mensaje;
            PreparedStatement consulta;
            consulta = this.bd.dameConexion().prepareStatement("SELECT * FROM empresa WHERE  empresa_id = ?");
            consulta.setInt(1, idEmpresa);
            rs = consulta.executeQuery();
            System.out.println(rs);
            if (rs.next()) {
                nombreEmp = rs.getString("nombre");
                encargado = rs.getString("persona_encargada");
                email = rs.getString("email");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        descripcionStr = descripcion;
        requisitosStr  = requisitos;
        tipoStr = tipo;
        String poner = "Nombre de la empresa: "+nombreEmp+"\n"+
                        "Tipo de oferta: "+tipoStr+"\n"+
                        "Descripción: "+descripcionStr+"\n"+
                        "Requisitos: "+requisitosStr+"\n"+
                        "Persona de contacto: "+encargado+"\n"+
                        "Email: "+email;
        TextoContenido.setText(poner);
    }
    
    /**
     * Coge la conexión abierta a la BD por la aplicación
     * @param con 
     */
    public void darConexionAbierta(BD con) {
        System.out.println("AVISO: Paso la conexión BD a nuevo ciclo");
        this.bd = con;
    }
    
    // Clase BD
    private BD bd;
    
    // Colores del formulario
    Color colorPanelCabecera = new Color(85, 136, 163);
    Color colorPanelContenido = new Color(232, 232, 232);
    
     // Correos electronicos seleccionados de alumnos
    ArrayList<String> emailsAlumnos = new ArrayList<>();
    
    // modelo de tabla
    DefaultTableModel modeloTabla;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextoContenido;
    public javax.swing.JTextArea TextoEmails;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviarMail;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSeleccionarTodos;
    private javax.swing.JTextField inputAsunto;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JLabel labelAsunto;
    private javax.swing.JLabel labelCiclos;
    private javax.swing.JLabel labelContenido;
    private javax.swing.JLabel labelEmails;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
