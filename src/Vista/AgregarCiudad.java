package Vista;

import Controlador.Lienzo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AgregarCiudad extends javax.swing.JFrame {

    //ATRIBUTO MAPA
    private Lienzo mapa;
    
    //CONSTRUCTOR QUE RECIBE EL MAPA
    public AgregarCiudad(Lienzo m) {
        
        initComponents();
        
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Establecer acción de cierre
        
        this.mapa = m; //Se establece el mapa que va a modificar la clase

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelLogoCiudad = new javax.swing.JLabel();
        jLabelAgregarCiudad = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelPedirInfo = new javax.swing.JLabel();
        jLabelNombreCiudad = new javax.swing.JLabel();
        txtNombreCiudad = new javax.swing.JTextField();
        jLabelAeropuerto = new javax.swing.JLabel();
        txtAeropuerto = new javax.swing.JTextField();
        jLabelPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBackground(new java.awt.Color(6, 28, 75));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(500, 50));
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
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelLogoCiudad.setBackground(new java.awt.Color(219, 228, 238));
        jLabelLogoCiudad.setForeground(new java.awt.Color(219, 228, 238));
        jLabelLogoCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ciudad.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        jPanelSuperior.add(jLabelLogoCiudad, gridBagConstraints);

        jLabelAgregarCiudad.setBackground(new java.awt.Color(219, 228, 238));
        jLabelAgregarCiudad.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelAgregarCiudad.setForeground(new java.awt.Color(219, 228, 238));
        jLabelAgregarCiudad.setText("AGREGAR CIUDAD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 20);
        jPanelSuperior.add(jLabelAgregarCiudad, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        jPanelSuperior.add(jLabelLogo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelPedirInfo.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelPedirInfo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirInfo.setText("INGRESE LOS DATOS DE LA CIUDAD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanelInferior.add(jLabelPedirInfo, gridBagConstraints);

        jLabelNombreCiudad.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelNombreCiudad.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNombreCiudad.setText("Nombre de la ciudad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 48;
        jPanelInferior.add(jLabelNombreCiudad, gridBagConstraints);

        txtNombreCiudad.setBackground(new java.awt.Color(219, 228, 238));
        txtNombreCiudad.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtNombreCiudad.setBorder(null);
        txtNombreCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCiudadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        jPanelInferior.add(txtNombreCiudad, gridBagConstraints);

        jLabelAeropuerto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelAeropuerto.setForeground(new java.awt.Color(6, 28, 75));
        jLabelAeropuerto.setText("Nombre del aeropuerto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 52;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelAeropuerto, gridBagConstraints);

        txtAeropuerto.setBackground(new java.awt.Color(219, 228, 238));
        txtAeropuerto.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtAeropuerto.setBorder(null);
        txtAeropuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAeropuertoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 61;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        jPanelInferior.add(txtAeropuerto, gridBagConstraints);

        jLabelPais.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelPais.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPais.setText("Nombre del país:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 64;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelPais, gridBagConstraints);

        txtPais.setBackground(new java.awt.Color(219, 228, 238));
        txtPais.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtPais.setBorder(null);
        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 75;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        jPanelInferior.add(txtPais, gridBagConstraints);

        btnRegistrar.setBackground(new java.awt.Color(221, 110, 110));
        btnRegistrar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(6, 28, 75));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 91;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 14, 0);
        jPanelInferior.add(btnRegistrar, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(221, 110, 110));
        jLabel1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        jPanelInferior.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        //Si se da click al boton registrar, se guarda la info de los txt field
        String nombreCiudad = txtNombreCiudad.getText();
        String aeropuerto = txtAeropuerto.getText();
        String pais = txtPais.getText();
        
         //Validacion de cajetines
         if ((nombreCiudad.equals("")) || (aeropuerto.equals("")) || (pais.equals(""))){        
           
            //Ventana de error
            JOptionPane.showMessageDialog(null, "Nombre de ciudad, aeropuerto o país es inválida", "Error en ingreso de datos", JOptionPane.ERROR_MESSAGE);
            
        }
         else{
         
        //Se recoge la información de la ciudad
        mapa.recogerInfoCiudad(nombreCiudad, aeropuerto, pais);
        
        //Mensaje de información
        JOptionPane.showMessageDialog(null, "Haga click izquierdo en la posición del mapa a su derecha donde desee insertar la ciudad.", "¿Cómo pintar la ciudad?", JOptionPane.INFORMATION_MESSAGE);
        this.dispose(); //Se cierra esta vista
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      
        //Si se da click al botón de volver
        this.dispose(); //Se cierra esta vista
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCiudadKeyTyped
       
        //Validación para que no pueda escribir numeros en el nombre de la ciudad
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es minúscula, ni mayúscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtNombreCiudadKeyTyped

    private void txtAeropuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAeropuertoKeyTyped
       
        //Validación para que no pueda escribir numeros en el nombre del aeropuerto
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es minúscula, ni mayúscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
        
    }//GEN-LAST:event_txtAeropuertoKeyTyped

    private void txtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyTyped
        
        //Validación para que no pueda escribir numeros en el nombre del país
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es minúscula, ni mayúscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
        
    }//GEN-LAST:event_txtPaisKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAeropuerto;
    private javax.swing.JLabel jLabelAgregarCiudad;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogoCiudad;
    private javax.swing.JLabel jLabelNombreCiudad;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelPedirInfo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    public javax.swing.JTextField txtAeropuerto;
    public javax.swing.JTextField txtNombreCiudad;
    public javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
