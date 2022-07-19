package Vista;

import Controlador.Lienzo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EliminarVuelo extends javax.swing.JFrame {

    //ATRIBUTO DEL MAPA
    private Lienzo mapa;
    
    //CONSTRUCTOR QUE RECIBE EL MAPA
    public EliminarVuelo(Lienzo m) {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Establecer operacion de cierre de ventana

        this.mapa = m; //Se establece el mapa 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelLogoCiudad = new javax.swing.JLabel();
        jLabelEliminarVuelo = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelPedirInfo = new javax.swing.JLabel();
        jLabelCiudadOrigen = new javax.swing.JLabel();
        txtCiudadOrigen = new javax.swing.JTextField();
        jLabelCiudadDestino = new javax.swing.JLabel();
        txtCiudadDestino = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
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

        jLabelLogoCiudad.setForeground(new java.awt.Color(219, 228, 238));
        jLabelLogoCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avion.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        jPanelSuperior.add(jLabelLogoCiudad, gridBagConstraints);

        jLabelEliminarVuelo.setBackground(new java.awt.Color(219, 228, 238));
        jLabelEliminarVuelo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelEliminarVuelo.setForeground(new java.awt.Color(219, 228, 238));
        jLabelEliminarVuelo.setText("ELIMINAR VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 1, 20);
        jPanelSuperior.add(jLabelEliminarVuelo, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        jPanelSuperior.add(jLabelLogo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelPedirInfo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelPedirInfo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirInfo.setText("INGRESE LOS DATOS DEL VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelInferior.add(jLabelPedirInfo, gridBagConstraints);

        jLabelCiudadOrigen.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadOrigen.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadOrigen.setText("Ciudad de origen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 3, 0);
        jPanelInferior.add(jLabelCiudadOrigen, gridBagConstraints);

        txtCiudadOrigen.setBackground(new java.awt.Color(219, 228, 238));
        txtCiudadOrigen.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtCiudadOrigen.setBorder(null);
        txtCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadOrigenActionPerformed(evt);
            }
        });
        txtCiudadOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadOrigenKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 35;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        jPanelInferior.add(txtCiudadOrigen, gridBagConstraints);

        jLabelCiudadDestino.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadDestino.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadDestino.setText("Ciudad de destino:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 41;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanelInferior.add(jLabelCiudadDestino, gridBagConstraints);

        txtCiudadDestino.setBackground(new java.awt.Color(219, 228, 238));
        txtCiudadDestino.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtCiudadDestino.setBorder(null);
        txtCiudadDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadDestinoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 49;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        jPanelInferior.add(txtCiudadDestino, gridBagConstraints);

        btnEliminar.setBackground(new java.awt.Color(221, 110, 110));
        btnEliminar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(6, 28, 75));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 54;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanelInferior.add(btnEliminar, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(221, 110, 110));
        jLabel1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        jPanelInferior.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Si se da click al boton eliminar
        
        //Se guarda la info de los txt field
        String ciudadOrigen = txtCiudadOrigen.getText(); 
        String ciudadDestino = txtCiudadDestino.getText(); 
        
         if ((ciudadOrigen.equals("")) || (ciudadDestino.equals(""))){        
           
            //Ventana de error
            JOptionPane.showMessageDialog(null, "Ciudad de origen o destino inválida", "Error de datos", JOptionPane.ERROR_MESSAGE);
            
        }else{
        
        
        //Llamo método de eliminar
        mapa.getGrafo().eliminarVuelo(ciudadOrigen,ciudadDestino); 
        
        //Repintar el mapa sin el vuelo eliminado
        mapa.repaint(); 
        
        //Cerrar ventana 
        this.dispose(); 
  }       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
         
        this.dispose(); 
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadOrigenActionPerformed

    private void txtCiudadOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadOrigenKeyTyped
      //Validación para que no pueda escribir numeros en ciudad

        char c = evt.getKeyChar(); //Se obtiene el caracter escrito

        //Si el caracter no es mayuscula, ni minuscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
    }//GEN-LAST:event_txtCiudadOrigenKeyTyped

    private void txtCiudadDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadDestinoKeyTyped
        //Validación para que no pueda escribir numeros en ciudad

        char c = evt.getKeyChar(); //Se obtiene el caracter escrito

        //Si el caracter no es mayuscula, ni minuscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtCiudadDestinoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCiudadDestino;
    private javax.swing.JLabel jLabelCiudadOrigen;
    private javax.swing.JLabel jLabelEliminarVuelo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogoCiudad;
    private javax.swing.JLabel jLabelPedirInfo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    public javax.swing.JTextField txtCiudadDestino;
    public javax.swing.JTextField txtCiudadOrigen;
    // End of variables declaration//GEN-END:variables
}
