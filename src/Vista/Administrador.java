package Vista;

import Controlador.ArchivoTxt;
import static Vista.SeleccionAdm.mapa;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Administrador extends javax.swing.JFrame {

    //CONSTRUCTOR
    public Administrador(){
        
        initComponents();
        
        this.setVisible(false); //Visibilidad        
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton2 = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();
        jPanelInferiorSuperior = new javax.swing.JPanel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabelSolicitud = new javax.swing.JLabel();
        jSeparador = new javax.swing.JLabel();
        jPanelInferiorCentro = new javax.swing.JPanel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jPanelInferiorInferior = new javax.swing.JPanel();
        jLabelIconoNota = new javax.swing.JLabel();
        jLabelNota2 = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelIconoAdministrador = new javax.swing.JLabel();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));
        setSize(new java.awt.Dimension(600, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jPanelInferiorSuperior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferiorSuperior.setLayout(new java.awt.GridBagLayout());

        jLabelBienvenida.setFont(new java.awt.Font("Rockwell", 1, 44)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(6, 28, 75));
        jLabelBienvenida.setText("¡Bienvenido de nuevo!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 13, 0);
        jPanelInferiorSuperior.add(jLabelBienvenida, gridBagConstraints);

        jLabelSolicitud.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabelSolicitud.setForeground(new java.awt.Color(6, 28, 75));
        jLabelSolicitud.setText("Inicia sesión con tus datos de administrador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        jPanelInferiorSuperior.add(jLabelSolicitud, gridBagConstraints);

        jSeparador.setBackground(new java.awt.Color(221, 110, 110));
        jSeparador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparador.setForeground(new java.awt.Color(221, 110, 110));
        jSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferiorSuperior.add(jSeparador, gridBagConstraints);

        jPanelInferior.add(jPanelInferiorSuperior, new java.awt.GridBagConstraints());

        jPanelInferiorCentro.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferiorCentro.setLayout(new java.awt.GridBagLayout());

        jLabelNombreUsuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNombreUsuario.setText("Ingrese su nombre de usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(36, 0, 20, 15);
        jPanelInferiorCentro.add(jLabelNombreUsuario, gridBagConstraints);

        jLabelContraseña.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(6, 28, 75));
        jLabelContraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelContraseña.setText("Ingrese su contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 15, 15);
        jPanelInferiorCentro.add(jLabelContraseña, gridBagConstraints);

        txtNombreUsuario.setBackground(new java.awt.Color(219, 228, 238));
        txtNombreUsuario.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(6, 28, 75));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(21, 0, 5, 0);
        jPanelInferiorCentro.add(txtNombreUsuario, gridBagConstraints);

        txtContraseña.setBackground(new java.awt.Color(219, 228, 238));
        txtContraseña.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(6, 28, 75));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferiorCentro.add(txtContraseña, gridBagConstraints);

        btnEntrar.setBackground(new java.awt.Color(221, 110, 110));
        btnEntrar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(6, 28, 75));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(40, 10, 20, 10);
        jPanelInferiorCentro.add(btnEntrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanelInferior.add(jPanelInferiorCentro, gridBagConstraints);

        jPanelInferiorInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferiorInferior.setLayout(new java.awt.GridBagLayout());

        jLabelIconoNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contrasena_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInferiorInferior.add(jLabelIconoNota, gridBagConstraints);

        jLabelNota2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabelNota2.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNota2.setText("NOTA : La contraseña es \"clave\".");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 8);
        jPanelInferiorInferior.add(jLabelNota2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        jPanelInferior.add(jPanelInferiorInferior, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        jPanelSuperior.setBackground(new java.awt.Color(6, 28, 75));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        btnVolver.setBackground(new java.awt.Color(221, 110, 110));
        btnVolver.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(219, 228, 238));
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelIconoAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdministradorPequeno_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 2);
        jPanelSuperior.add(jLabelIconoAdministrador, gridBagConstraints);

        jLabelAdministrador.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(219, 228, 238));
        jLabelAdministrador.setText("ADMINISTRADOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 50);
        jPanelSuperior.add(jLabelAdministrador, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanelSuperior.add(jLabelLogo, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Si se hace click en el boton volver, se regresa a la ventana de bienvenida
        
        Bienvenida nuevaBienvenida = new Bienvenida(this, Bienvenida.client); //Se crea otra vez la bienvenida con este admin y el cliente que ya tenia bienvenida
        nuevaBienvenida.setVisible(true); //Se hace visible la bienvenida
        this.setVisible(false);//Ocultar esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //Si se da click a entrar se verifica la información del administrador
        
        //Guardar el nombre de usuario y la contraseña
        String nombreUsuario = txtNombreUsuario.getText();
        String contraseña = txtContraseña.getText();
            
        //Si se ingreso una contraseña incorrecta o se dejó el nombre de usuario vacio
        if ((!contraseña.equals("clave")) || (nombreUsuario.equals(""))){        
           
            //Ventana de error
            JOptionPane.showMessageDialog(null, "Nombre de usuario y/o clave inválida", "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
            
        }else{ //En cambio, si se ingresaron los datos correctamente
            
            //Si los datos son correctos se ingresa al panel del administrador
            SeleccionAdm accionAdministrador = new SeleccionAdm(SeleccionAdm.mapa); //Se crea la ventana de control del administrador con el mapa asignado en la clase principal
            accionAdministrador.setVisible(true); //Se hace visible la ventana de control del admin
            this.setVisible(false); //Se oculta esta ventana
            
        }
        
        //Reiniciar los text field
        txtNombreUsuario.setText("");  
        txtContraseña.setText("");
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyTyped
        //Validación para evitar que el administrador coloque espacios en el campo del nombre de usuario
        
        char c = evt.getKeyChar(); //Obtiene el caracter escrito
        
        if(c == ' '){ //Si el caracter es un espacio
            
            evt.consume(); //Borra el caracter
            
        }
        
    }//GEN-LAST:event_txtNombreUsuarioKeyTyped

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelIconoAdministrador;
    private javax.swing.JLabel jLabelIconoNota;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelNota2;
    private javax.swing.JLabel jLabelSolicitud;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInferiorCentro;
    private javax.swing.JPanel jPanelInferiorInferior;
    private javax.swing.JPanel jPanelInferiorSuperior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JLabel jSeparador;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
