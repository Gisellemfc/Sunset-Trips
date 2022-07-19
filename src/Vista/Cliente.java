
package Vista;

import Controlador.ArchivoTxt;
import static Vista.SeleccionAdm.mapa;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {
 
    private String cedula;
    private String nombre;
    private String apellido;
    
    public Cliente() {
        
        initComponents();
        this.setVisible(false); //Visibilidad
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel8 = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelIconoCliente = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelInferiorSuperior = new javax.swing.JPanel();
        jLabelPedirDatos2 = new javax.swing.JLabel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabelPedirDatos1 = new javax.swing.JLabel();
        jSeparador = new javax.swing.JLabel();
        jPanelInferiorCentral = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbCedula = new javax.swing.JComboBox<>();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jPanelInferiorInferior = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jLabelImagencita = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelSuperior.setBackground(new java.awt.Color(6, 28, 75));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        btnVolver.setBackground(new java.awt.Color(221, 110, 110));
        btnVolver.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(219, 228, 238));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelIconoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 5);
        jPanelSuperior.add(jLabelIconoCliente, gridBagConstraints);

        jLabelCliente.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(219, 228, 238));
        jLabelCliente.setText("CLIENTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jPanelSuperior.add(jLabelCliente, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanelSuperior.add(jLabelLogo, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jPanelInferiorSuperior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferiorSuperior.setLayout(new java.awt.GridBagLayout());

        jLabelPedirDatos2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabelPedirDatos2.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirDatos2.setText("ingresa los siguientes datos: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanelInferiorSuperior.add(jLabelPedirDatos2, gridBagConstraints);

        jLabelBienvenida.setFont(new java.awt.Font("Rockwell", 1, 44)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(6, 28, 75));
        jLabelBienvenida.setText("¡Bienvenido cliente!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanelInferiorSuperior.add(jLabelBienvenida, gridBagConstraints);

        jLabelPedirDatos1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabelPedirDatos1.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirDatos1.setText("Para continuar con su actividad por favor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 4, 4);
        jPanelInferiorSuperior.add(jLabelPedirDatos1, gridBagConstraints);

        jSeparador.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jSeparador.setForeground(new java.awt.Color(221, 110, 110));
        jSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferiorSuperior.add(jSeparador, gridBagConstraints);

        jPanelInferior.add(jPanelInferiorSuperior, new java.awt.GridBagConstraints());

        jPanelInferiorCentral.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferiorCentral.setLayout(new java.awt.GridBagLayout());

        jLabelNombre.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        jPanelInferiorCentral.add(jLabelNombre, gridBagConstraints);

        jLabelApellido.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(6, 28, 75));
        jLabelApellido.setText("Apellido:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        jPanelInferiorCentral.add(jLabelApellido, gridBagConstraints);

        jLabelCedula.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCedula.setText("Cédula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        jPanelInferiorCentral.add(jLabelCedula, gridBagConstraints);

        txtNombre.setBackground(new java.awt.Color(219, 228, 238));
        txtNombre.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(6, 28, 75));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 10);
        jPanelInferiorCentral.add(txtNombre, gridBagConstraints);

        cmbCedula.setBackground(new java.awt.Color(219, 228, 238));
        cmbCedula.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        cmbCedula.setForeground(new java.awt.Color(6, 28, 75));
        cmbCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V -", "E -" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPanelInferiorCentral.add(cmbCedula, gridBagConstraints);

        txtApellido.setBackground(new java.awt.Color(219, 228, 238));
        txtApellido.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(6, 28, 75));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 10);
        jPanelInferiorCentral.add(txtApellido, gridBagConstraints);

        txtCedula.setBackground(new java.awt.Color(219, 228, 238));
        txtCedula.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(6, 28, 75));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 12, 10);
        jPanelInferiorCentral.add(txtCedula, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanelInferior.add(jPanelInferiorCentral, gridBagConstraints);

        jPanelInferiorInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferiorInferior.setLayout(new java.awt.GridBagLayout());

        btnAceptar.setBackground(new java.awt.Color(221, 110, 110));
        btnAceptar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(6, 28, 75));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        jPanelInferiorInferior.add(btnAceptar, gridBagConstraints);

        jLabelImagencita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Adorno.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 5, 0);
        jPanelInferiorInferior.add(jLabelImagencita, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanelInferior.add(jPanelInferiorInferior, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        //Si se da click al boton volver se regresa a la ventana de bienvenida
        
        Bienvenida volbien = new Bienvenida(Bienvenida.admin, this); //Se crea una ventana de bienvenida con el admin que tenia y con este cliente
        volbien.setVisible(true); //Se hace visible la bienvenida
        this.setVisible(false); //Se oculta esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
         
        //Si se da aceptar, se guarda la informacion del cliente y se activa el panel de cliente
        
        //Guardar datos de cliente
        cedula = ((String)cmbCedula.getSelectedItem()) + txtCedula.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        
        //Validacion de cajetines de cliente vacios
         if ((nombre.equals("")) || (cedula.equals("")) || (apellido.equals(""))){        
           
            //Ventana de error
            JOptionPane.showMessageDialog(null, "Nombre de usuario, apellido o cédula inválida", "Error de Inicio de cliente", JOptionPane.ERROR_MESSAGE);
            
        }
         else{
        
        //Vaciar los text field
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        
        //Cerrar ventana actual y abrir ventana cliente
        SeleccionCliente panCliente = new SeleccionCliente();
        panCliente.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
        //Validación para que no pueda escribir números en el nombre
        
        char c = evt.getKeyChar(); //Se obtiene el caracter escrito
        
        //Si el caracter no es mayuscula ni minuscula
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
    
        //Validacion para que no pueda escribir letras en el numero de cedula
        
        char c = evt.getKeyChar(); //Se obtiene el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        
        //Validación para que no pueda escribir numeros en el apellido
        
        char c = evt.getKeyChar(); //Se obtiene el caracter escrito
        
        //Si el caracter no es mayuscula ni minuscula
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        int seleccion = JOptionPane.showOptionDialog(
                        null, "¿Desea guardar los datos antes de salir?", "Atención!", 1, 2, null, new Object[]{"Si", "No"}, "Si");
            
                        ArchivoTxt at = new ArchivoTxt();
                switch(seleccion){
                    case 0://Si elegimos "Si"
                        at.actualizarRepositorio(new File("Archivo.txt"), mapa.getGrafo());//Llamamos al método que escribe los datos
                        System.exit(0);//Y cerramos el programa
                        break;
                    case 1://Si elegimos "No"
                         System.exit(0);//Cerramos el programa
                        break;
                           //Si elegimos "Cancelar", pues nada...
                }
            }//GEN-LAST:event_formWindowClosing

    //GETTERS Y SETTERS DE LOS DATOS DEL CLIENTE
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCedula;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelIconoCliente;
    private javax.swing.JLabel jLabelImagencita;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPedirDatos1;
    private javax.swing.JLabel jLabelPedirDatos2;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInferiorCentral;
    private javax.swing.JPanel jPanelInferiorInferior;
    private javax.swing.JPanel jPanelInferiorSuperior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JLabel jSeparador;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
