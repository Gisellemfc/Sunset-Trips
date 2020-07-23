package Vista;

import Controlador.Ciudad;
import Controlador.Lienzo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ModificarVuelo extends javax.swing.JFrame {
    
    //ATRIBUTO DEL MAPA
    private Lienzo mapa;

    //CONSTRUCTOR QUE RECIBE EL MAPA
    public ModificarVuelo(Lienzo m) {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Establecer operacion de cierre de ventana

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
        jLabelLogoVuelo = new javax.swing.JLabel();
        jLabelModificarVuelo = new javax.swing.JLabel();
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
        btnModificar = new javax.swing.JButton();
        jLabelPedirInfo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelLogoVuelo.setForeground(new java.awt.Color(219, 228, 238));
        jLabelLogoVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avion.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 5);
        jPanelSuperior.add(jLabelLogoVuelo, gridBagConstraints);

        jLabelModificarVuelo.setBackground(new java.awt.Color(219, 228, 238));
        jLabelModificarVuelo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelModificarVuelo.setForeground(new java.awt.Color(219, 228, 238));
        jLabelModificarVuelo.setText("MODIFICAR VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 1, 31);
        jPanelSuperior.add(jLabelModificarVuelo, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanelSuperior.add(jLabelLogo, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(129, 164, 205));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelPedirInfo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelPedirInfo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirInfo.setText("INGRESE EL VUELO QUE DESEA MODIFICAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelPedirInfo, gridBagConstraints);

        jLabelCiudadOrigen.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadOrigen.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadOrigen.setText("Ciudad de origen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 77;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelCiudadOrigen, gridBagConstraints);

        cmbCiudadOrigen.setBackground(new java.awt.Color(219, 228, 238));
        cmbCiudadOrigen.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 82;
        gridBagConstraints.ipadx = 150;
        jPanelInferior.add(cmbCiudadOrigen, gridBagConstraints);

        jLabelCiudadDestino.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadDestino.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadDestino.setText("Ciudad de destino:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 86;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferior.add(jLabelCiudadDestino, gridBagConstraints);

        cmbCiudadDestino.setBackground(new java.awt.Color(219, 228, 238));
        cmbCiudadDestino.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 88;
        gridBagConstraints.ipadx = 150;
        jPanelInferior.add(cmbCiudadDestino, gridBagConstraints);

        jLabelDuracion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelDuracion.setForeground(new java.awt.Color(6, 28, 75));
        jLabelDuracion.setText("Horas de duración:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelDuracion, gridBagConstraints);

        txtDuracion.setBackground(new java.awt.Color(219, 228, 238));
        txtDuracion.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 107;
        gridBagConstraints.ipadx = 200;
        jPanelInferior.add(txtDuracion, gridBagConstraints);

        jLabelNumeroVuelo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelNumeroVuelo.setForeground(new java.awt.Color(6, 28, 75));
        jLabelNumeroVuelo.setText("Número de vuelo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 110;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferior.add(jLabelNumeroVuelo, gridBagConstraints);

        txtNumeroVuelo.setBackground(new java.awt.Color(219, 228, 238));
        txtNumeroVuelo.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtNumeroVuelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroVueloKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 114;
        gridBagConstraints.ipadx = 200;
        jPanelInferior.add(txtNumeroVuelo, gridBagConstraints);

        jLabelLineaAerea.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelLineaAerea.setForeground(new java.awt.Color(6, 28, 75));
        jLabelLineaAerea.setText("Línea aerea:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 119;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferior.add(jLabelLineaAerea, gridBagConstraints);

        txtLineaAerea.setBackground(new java.awt.Color(219, 228, 238));
        txtLineaAerea.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtLineaAerea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLineaAereaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 122;
        gridBagConstraints.ipadx = 200;
        jPanelInferior.add(txtLineaAerea, gridBagConstraints);

        jLabelCosto.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCosto.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCosto.setText("Costo de boleto ($):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 126;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferior.add(jLabelCosto, gridBagConstraints);

        txtCosto.setBackground(new java.awt.Color(219, 228, 238));
        txtCosto.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 130;
        gridBagConstraints.ipadx = 200;
        jPanelInferior.add(txtCosto, gridBagConstraints);

        btnModificar.setBackground(new java.awt.Color(221, 110, 110));
        btnModificar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(6, 28, 75));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 132;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(11, 1, 16, 1);
        jPanelInferior.add(btnModificar, gridBagConstraints);

        jLabelPedirInfo2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelPedirInfo2.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirInfo2.setText("INGRESE LOS NUEVOS DATOS DEL VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 93;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        jPanelInferior.add(jLabelPedirInfo2, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(221, 110, 110));
        jLabel1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 68;
        jPanelInferior.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(221, 110, 110));
        jLabel2.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 99;
        jPanelInferior.add(jLabel2, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        
        //Validacion para que no pueda escribir letras en el tiempo de duración
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtNumeroVueloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroVueloKeyTyped
       
        //Validacion para que no pueda escribir letras en el numero de vuelo
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtNumeroVueloKeyTyped

    private void txtLineaAereaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLineaAereaKeyTyped
        
        //Validación para que no pueda escribir numeros en la línea aerea.
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es minúscula, ni mayúscula, ni espacio
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')){
            
            evt.consume(); //Se borra el caracter
            
        }
        
    }//GEN-LAST:event_txtLineaAereaKeyTyped

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        
        //Validacion para que no pueda escribir letras en el costo del vuelo
        
        char c = evt.getKeyChar(); //Obtener el caracter escrito
        
        //Si el caracter no es un número
        if(c < '0' || c > '9'){
            
            evt.consume(); //Se borra el caracter
        }
        
    }//GEN-LAST:event_txtCostoKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        try{
            
            //Si se da click al boton modificar

            //Si la ciudad origen es igual a la ciudad destino
            if(cmbCiudadOrigen.getSelectedItem() == cmbCiudadDestino.getSelectedItem()){

                //Mensaje de error
                JOptionPane.showMessageDialog(null, "La ciudad de origen no puede ser igual a la ciudad de destino", "Error ciudades iguales", JOptionPane.ERROR_MESSAGE); 

            }else{ //Si no son iguales las ciudades escogidas

                //Guardar los datos de los campos
                String ciudadOrigen = (String) cmbCiudadOrigen.getSelectedItem();
                String ciudadDestino = (String) cmbCiudadDestino.getSelectedItem();
                String duracion1 = txtDuracion.getText();
                String numeroVuelo1 = txtNumeroVuelo.getText();
                String lineaAerea1 = txtLineaAerea.getText();
                String costoVuelo1 = txtCosto.getText();

                if ((duracion1.equals("")) || (numeroVuelo1.equals("")) || (lineaAerea1.equals("")) || (costoVuelo1.equals(""))){        

                //Ventana de error
                JOptionPane.showMessageDialog(null, "Numero de vuelo, duración, línea aérea o costo de vuelo inválida", "Error de datos", JOptionPane.ERROR_MESSAGE);

            }else{
                int duracion = Integer.parseInt(txtDuracion.getText());
                int numeroVuelo = Integer.parseInt(txtNumeroVuelo.getText());
                String lineaAerea = txtLineaAerea.getText();
                int costoVuelo = Integer.parseInt(txtCosto.getText());

                //Llamar al metodo modificar
                this.mapa.getGrafo().modificarVuelo(ciudadOrigen, ciudadDestino, duracion, numeroVuelo, lineaAerea, costoVuelo);

                //Repintar el grafo con los datos modificados del vuelo
                this.mapa.repaint();

                this.dispose();//Cerrar esta vista
              }  
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no hay un mapa cargado.", "Error mapa inexistente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCiudadDestino;
    private javax.swing.JComboBox<String> cmbCiudadOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCiudadDestino;
    private javax.swing.JLabel jLabelCiudadOrigen;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelDuracion;
    private javax.swing.JLabel jLabelLineaAerea;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogoVuelo;
    private javax.swing.JLabel jLabelModificarVuelo;
    private javax.swing.JLabel jLabelNumeroVuelo;
    private javax.swing.JLabel jLabelPedirInfo;
    private javax.swing.JLabel jLabelPedirInfo2;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLineaAerea;
    private javax.swing.JTextField txtNumeroVuelo;
    // End of variables declaration//GEN-END:variables
}
