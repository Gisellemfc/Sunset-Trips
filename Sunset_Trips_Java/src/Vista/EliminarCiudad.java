package Vista;

import Controlador.Lienzo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EliminarCiudad extends javax.swing.JFrame {
 
    //ATRIBUTO DEL MAPA
     private Lienzo mapa;
    
    //CONSTRUCTOR QUE RECIBE EL MAPA
    public EliminarCiudad(Lienzo m) {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Establecer operacion de cierre de ventana
        
        this.mapa = m; //Se establece el mapa que va a modificar la clase
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelLogoCiudad = new javax.swing.JLabel();
        jLabelEliminarCiudad = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelPedirInfo = new javax.swing.JLabel();
        jLabelNombreCiudad = new javax.swing.JLabel();
        txtNombreCiudad = new javax.swing.JTextField();
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
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 10;
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelLogoCiudad.setBackground(new java.awt.Color(219, 228, 238));
        jLabelLogoCiudad.setForeground(new java.awt.Color(219, 228, 238));
        jLabelLogoCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ciudad.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        jPanelSuperior.add(jLabelLogoCiudad, gridBagConstraints);

        jLabelEliminarCiudad.setBackground(new java.awt.Color(219, 228, 238));
        jLabelEliminarCiudad.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelEliminarCiudad.setForeground(new java.awt.Color(219, 228, 238));
        jLabelEliminarCiudad.setText("ELIMINAR CIUDAD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 20);
        jPanelSuperior.add(jLabelEliminarCiudad, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        jPanelSuperior.add(jLabelLogo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelPedirInfo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelPedirInfo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirInfo.setText("INGRESE LOS DATOS DE LA CIUDAD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelPedirInfo, gridBagConstraints);

        jLabelNombreCiudad.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelNombreCiudad.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNombreCiudad.setText("Nombre de la ciudad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
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
        gridBagConstraints.gridy = 35;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        jPanelInferior.add(txtNombreCiudad, gridBagConstraints);

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
        gridBagConstraints.gridy = 44;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 20;
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        this.dispose(); //Se cierra esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCiudadKeyTyped
        
        //Validación para que no pueda escribir numeros en ciudad

        char c = evt.getKeyChar(); //Se obtiene el caracter escrito

        //Si el caracter no es mayuscula, ni minuscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtNombreCiudadKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   
        //Si se da click al boton eliminar
        
        //Se guarda la info del txt field
        String ciudadEliminar = txtNombreCiudad.getText(); 
        
        if ((ciudadEliminar.equals(""))){        
           
            //Ventana de error
            JOptionPane.showMessageDialog(null, "Campo de Ciudad a eliminar inválida", "Error de datos", JOptionPane.ERROR_MESSAGE);
            
        } else{

        //Llamo método de eliminar
        mapa.getGrafo().eliminarCiudad(ciudadEliminar); 
        
        mapa.repaint(); //Repintar el mapa sin la ciudad eliminada
        
        //Cerrar ventana 
        this.dispose(); 
        } 
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEliminarCiudad;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogoCiudad;
    private javax.swing.JLabel jLabelNombreCiudad;
    private javax.swing.JLabel jLabelPedirInfo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    public javax.swing.JTextField txtNombreCiudad;
    // End of variables declaration//GEN-END:variables
}
