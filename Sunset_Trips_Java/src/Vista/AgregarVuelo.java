package Vista;

import Controlador.Ciudad;
import Controlador.Lienzo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AgregarVuelo extends javax.swing.JFrame {

    //ATRIBUTO DEL MAPA
    private Lienzo mapa;
    
    //CCONSTRUCTOR QUE RECIBE EL MAPA
    public AgregarVuelo(Lienzo m) {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Establecer acción de cierre de ventana
    
        //Establecer el mapa
        this.mapa = m;

        //Se recorre la lista de ciudades del mapa y se agregan los items al combo box de ciudad origen y destino
        for(int i = 0; i < m.getGrafo().getCiudades().getTamaño(); i++){
            Ciudad item = (Ciudad) m.getGrafo().getCiudades().obtenerValorDe(i);
            cmbCiudadOrigen.addItem(item.getNombreCiudad());
            cmbCiudadDestino.addItem(item.getNombreCiudad());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelIconoAvion = new javax.swing.JLabel();
        jLabelAgregarVuelo = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelPedirInfo = new javax.swing.JLabel();
        jLabelCiudadOrigen = new javax.swing.JLabel();
        cmbCiudadOrigen = new javax.swing.JComboBox<>();
        jLabelCiudadDestino = new javax.swing.JLabel();
        cmbCiudadDestino = new javax.swing.JComboBox<>();
        jLabelDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabelNumeroVuelo = new javax.swing.JLabel();
        txtNumeroVuelo = new javax.swing.JTextField();
        jLabelLineaAerea = new javax.swing.JLabel();
        txtLineaAerea = new javax.swing.JTextField();
        jLabelCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
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
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanelSuperior.add(btnVolver, new java.awt.GridBagConstraints());

        jLabelIconoAvion.setBackground(new java.awt.Color(219, 228, 238));
        jLabelIconoAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avion.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        jPanelSuperior.add(jLabelIconoAvion, gridBagConstraints);

        jLabelAgregarVuelo.setBackground(new java.awt.Color(219, 228, 238));
        jLabelAgregarVuelo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelAgregarVuelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarVuelo.setText("AGREGAR VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 20);
        jPanelSuperior.add(jLabelAgregarVuelo, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        jPanelSuperior.add(jLabelLogo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelPedirInfo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelPedirInfo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirInfo.setText("INGRESE LOS DATOS SOBRE EL VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelPedirInfo, gridBagConstraints);

        jLabelCiudadOrigen.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadOrigen.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadOrigen.setText("Ciudad de origen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 54;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelCiudadOrigen, gridBagConstraints);

        cmbCiudadOrigen.setBackground(new java.awt.Color(219, 228, 238));
        cmbCiudadOrigen.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        cmbCiudadOrigen.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 60;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 5;
        jPanelInferior.add(cmbCiudadOrigen, gridBagConstraints);

        jLabelCiudadDestino.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadDestino.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadDestino.setText("Ciudad de destino:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 69;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelCiudadDestino, gridBagConstraints);

        cmbCiudadDestino.setBackground(new java.awt.Color(219, 228, 238));
        cmbCiudadDestino.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        cmbCiudadDestino.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 73;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 5;
        jPanelInferior.add(cmbCiudadDestino, gridBagConstraints);

        jLabelDuracion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelDuracion.setForeground(new java.awt.Color(6, 28, 75));
        jLabelDuracion.setText("Horas de duración:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 77;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelDuracion, gridBagConstraints);

        txtDuracion.setBackground(new java.awt.Color(219, 228, 238));
        txtDuracion.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtDuracion.setBorder(null);
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 79;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 5;
        jPanelInferior.add(txtDuracion, gridBagConstraints);

        jLabelNumeroVuelo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelNumeroVuelo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNumeroVuelo.setText("Número de vuelo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 82;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelNumeroVuelo, gridBagConstraints);

        txtNumeroVuelo.setBackground(new java.awt.Color(219, 228, 238));
        txtNumeroVuelo.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtNumeroVuelo.setBorder(null);
        txtNumeroVuelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroVueloKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 86;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 5;
        jPanelInferior.add(txtNumeroVuelo, gridBagConstraints);

        jLabelLineaAerea.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelLineaAerea.setForeground(new java.awt.Color(6, 28, 75));
        jLabelLineaAerea.setText("Línea aerea:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 88;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelLineaAerea, gridBagConstraints);

        txtLineaAerea.setBackground(new java.awt.Color(219, 228, 238));
        txtLineaAerea.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtLineaAerea.setBorder(null);
        txtLineaAerea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLineaAereaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 90;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 5;
        jPanelInferior.add(txtLineaAerea, gridBagConstraints);

        jLabelCosto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCosto.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCosto.setText("Costo de boleto ($):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 94;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelCosto, gridBagConstraints);

        txtCosto.setBackground(new java.awt.Color(219, 228, 238));
        txtCosto.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtCosto.setBorder(null);
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 97;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 5;
        jPanelInferior.add(txtCosto, gridBagConstraints);

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
        gridBagConstraints.gridy = 101;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 15, 0);
        jPanelInferior.add(btnRegistrar, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(221, 110, 110));
        jLabel1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanelInferior.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
     
        try{
            //Guardar los datos de los campos
            String ciudadOrigen = (String) cmbCiudadOrigen.getSelectedItem();
            String ciudadDestino = (String) cmbCiudadDestino.getSelectedItem();
            //Si la ciudad origen es igual a la ciudad destino

            if(cmbCiudadOrigen.getSelectedItem() == cmbCiudadDestino.getSelectedItem()){

                //Mensaje de error
                JOptionPane.showMessageDialog(null, "La ciudad de origen no puede ser igual a la ciudad de destino", "Error ciudades iguales", JOptionPane.ERROR_MESSAGE); 

            }else{


                //Si no son iguales las ciudades escogidas

                String duracion1 = txtDuracion.getText();
                String numeroVuelo1 =txtNumeroVuelo.getText();
                String lineaAerea1 = txtLineaAerea.getText();
                String costoVuelo1 = txtCosto.getText();

                 if ((duracion1.equals("")) || (numeroVuelo1.equals("")) || (lineaAerea1.equals("")) || (costoVuelo1.equals(""))){        

                //Ventana de error
                JOptionPane.showMessageDialog(null, "Numero de vuelo, duración, línea aérea o costo de vuelo inválida", "Error de datos", JOptionPane.ERROR_MESSAGE);

            }else{

                     //Guardar los datos de los campos

                int duracion = Integer.parseInt(txtDuracion.getText());
                int numeroVuelo = Integer.parseInt(txtNumeroVuelo.getText());
                String lineaAerea = txtLineaAerea.getText();
                int costoVuelo = Integer.parseInt(txtCosto.getText());
                //Recoger con el mapa la info del vuelo
                mapa.establecerNuevoVuelo(ciudadOrigen, ciudadDestino, duracion, numeroVuelo, lineaAerea, costoVuelo);

                this.dispose();//Cerrar esta vista
              }  
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no existen ciudades.", "Error mapa inexistente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
     
        this.dispose(); //Se cierra esta vista
       
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtLineaAereaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLineaAereaKeyTyped
        
        //Validación para que no pueda escribir numeros en la línea aerea.
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es minúscula, ni mayúscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtLineaAereaKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
       
        //Validacion para que no pueda escribir letras en el tiempo de duración
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
            
        }
        
        //Validación para evitar que el administrador coloque espacios en el campo de duracion
        
        char d = evt.getKeyChar(); //Obtiene el caracter escrito
        
        if(d == ' '){ //Si el caracter es un espacio
            
            evt.consume(); //Borra el caracter
            
        }
        
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtNumeroVueloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroVueloKeyTyped
    
        //Validacion para que no pueda escribir letras en el numero de vuelo
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
            
        }
        
        
        
        //Validación para evitar que el administrador coloque espacios en el campo de numero de vuelo
        
        char d = evt.getKeyChar(); //Obtiene el caracter escrito
        
        if(d == ' '){ //Si el caracter es un espacio
            
            evt.consume(); //Borra el caracter
            
        }
        
    }//GEN-LAST:event_txtNumeroVueloKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
       
        //Validacion para que no pueda escribir letras en el costo del vuelo
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
        }
        
        
        //Validación para evitar que el administrador coloque espacios en el campo de costo
        
        char d = evt.getKeyChar(); //Obtiene el caracter escrito
        
        if(d == ' '){ //Si el caracter es un espacio
            
            evt.consume(); //Borra el caracter
            
        }
        
    }//GEN-LAST:event_txtCostoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCiudadDestino;
    private javax.swing.JComboBox<String> cmbCiudadOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgregarVuelo;
    private javax.swing.JLabel jLabelCiudadDestino;
    private javax.swing.JLabel jLabelCiudadOrigen;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelDuracion;
    private javax.swing.JLabel jLabelIconoAvion;
    private javax.swing.JLabel jLabelLineaAerea;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNumeroVuelo;
    private javax.swing.JLabel jLabelPedirInfo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLineaAerea;
    private javax.swing.JTextField txtNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
