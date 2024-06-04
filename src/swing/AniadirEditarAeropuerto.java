package swing;

import Classes.Address;
import Classes.Airport;
import Classes.PrivateAirport;
import Utilidades.MetodosSueltos;
import javax.swing.JOptionPane;
import Classes.PublicAirport;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AniadirEditarAeropuerto extends javax.swing.JDialog {
    
    private Airport aeropuertoEditar;
      
    

    public AniadirEditarAeropuerto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        this.buttonGroup1.add(this.rdbPublico);
        this.buttonGroup1.add(this.rdbPrivado);
        
        this.setLocationRelativeTo(null);
    }
    /**
     * Creates new form AniadirAeropuerto
     * @param parent
     * @param modal
     * @param aeropuertoEditar
     */
    public AniadirEditarAeropuerto(java.awt.Frame parent, boolean modal, Airport aeropuertoEditar) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        this.buttonGroup1.add(this.rdbPublico);
        this.buttonGroup1.add(this.rdbPrivado);
        
        this.setLocationRelativeTo(null);
        
        this.aeropuertoEditar = aeropuertoEditar;
        cargarDatos();

    }
    
    private void cargarDatos(){
        
        this.txtNombre.setText(this.aeropuertoEditar.getNombre());
        this.txtPais.setText(this.aeropuertoEditar.getAddress().getPais());
        this.txtCiudad.setText(this.aeropuertoEditar.getAddress().getCiudad());
        this.txtCalle.setText(this.aeropuertoEditar.getAddress().getCalle());
        this.txtNumero.setText(this.aeropuertoEditar.getAddress().getNumero()+"");
        this.txtAnioInauguracion.setText(this.aeropuertoEditar.getAnioInauguracion()+"");
        this.txtCapacidad.setText(this.aeropuertoEditar.getCapacidad()+"");
        
        if (this.aeropuertoEditar instanceof PrivateAirport) {
            PrivateAirport aux = (PrivateAirport) this.aeropuertoEditar;
            
            this.txtSocios.setText(aux.getNumSocios()+"");
            rdbPrivado.setSelected(true);
            
            this.txtFinanciacion.setEnabled(false);
            this.txtDiscapacitados.setEnabled(false);
            this.txtSocios.setEnabled(true);
        }else{
            
            PublicAirport aux = (PublicAirport) this.aeropuertoEditar;
            
            this.txtFinanciacion.setText(aux.getNumTrabajadoresDiscapacitados()+"");
            this.txtDiscapacitados.setText(aux.getNumTrabajadoresDiscapacitados()+"");
            rdbPublico.setSelected(true);
            
            this.txtFinanciacion.setEnabled(true);
            this.txtDiscapacitados.setEnabled(true);
            this.txtSocios.setEnabled(false);
        }
        this.rdbPrivado.setEnabled(false);
        this.rdbPublico.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtDiscapacitados = new javax.swing.JTextField();
        txtFinanciacion = new javax.swing.JTextField();
        txtAnioInauguracion = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        rdbPublico = new javax.swing.JRadioButton();
        rdbPrivado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardarAccion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSocios = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        txtFinanciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinanciacionActionPerformed(evt);
            }
        });

        rdbPublico.setSelected(true);
        rdbPublico.setText("Público");
        rdbPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPublicoActionPerformed(evt);
            }
        });

        rdbPrivado.setText("Privado");
        rdbPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPrivadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("País");

        jLabel3.setText("Ciudad");

        jLabel4.setText("Calle");

        jLabel5.setText("Número");

        jLabel6.setText("Año Inauguración");

        jLabel7.setText("Empleados");

        jLabel8.setText("Financiación");

        jLabel9.setText("Socios");

        btnGuardarAccion.setText("Guardar");
        btnGuardarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAccionActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSocios.setEnabled(false);
        txtSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSociosActionPerformed(evt);
            }
        });

        jLabel10.setText("Capacidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rdbPrivado)
                            .addGap(36, 36, 36)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rdbPublico))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAnioInauguracion)
                        .addComponent(txtCalle)
                        .addComponent(txtNumero)
                        .addComponent(txtNombre)
                        .addComponent(txtCiudad)
                        .addComponent(txtPais)
                        .addComponent(txtFinanciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnGuardarAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtDiscapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnioInauguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(rdbPublico)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFinanciacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscapacitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rdbPrivado)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAccion)
                    .addComponent(btnCancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPrivadoActionPerformed
        this.txtFinanciacion.setEnabled(false);
        this.txtDiscapacitados.setEnabled(false);
        this.txtSocios.setEnabled(true);
    }//GEN-LAST:event_rdbPrivadoActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void rdbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPublicoActionPerformed
        this.txtFinanciacion.setEnabled(true);
        this.txtDiscapacitados.setEnabled(true);
        this.txtSocios.setEnabled(false);
    }//GEN-LAST:event_rdbPublicoActionPerformed

    private void txtSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSociosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSociosActionPerformed

    private void txtFinanciacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinanciacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinanciacionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAccionActionPerformed
        String errores = "";
        
        String nombre = this.txtNombre.getText();
        String pais = this.txtPais.getText();
        String ciudad = this.txtCiudad.getText();
        String calle = this.txtCalle.getText();
        String numero = this.txtNumero.getText();
        String anioInauguracion = this.txtAnioInauguracion.getText();
        String capacidad = this.txtCapacidad.getText();
  
        
        
        String financiacion = "", discapacitados = "", numSocios = "";
        
        if (nombre.isEmpty()){
            errores += " - El nombre no puede estar vacío \n";
        }
        if (pais.isEmpty()){
            errores += " - El país no puede estar vacío \n";
        }
        if (ciudad.isEmpty()){
            errores += " - Debes ingresar una ciudad  \n";
        }
        if (calle.isEmpty()){
            errores += " - Debes ingresar una calle \n";
        }
        if (numero.isEmpty()){
            errores += " - El número no puede estar vacío \n";
        }else{
            if (!MetodosSueltos.validaNumeroEntero_Exp(numero)) {
            errores += " - El número debe ser entero \n";
            }
        }
        if (anioInauguracion.isEmpty()){
            errores += " - El año no puede estar vacío \n";
        }else{
            if (!MetodosSueltos.validaNumeroEntero_Exp(anioInauguracion)) {
            errores += " - El año debe ser un número debe ser entero \n";
            }
        }
        if (capacidad.isEmpty()){
            errores += " - Tienes que ingresar una capacidad \n";
        }else{
            if (!MetodosSueltos.validaNumeroEntero_Exp(capacidad)) {
            errores += " - La capacidad debe ser un número debe ser entero \n";
            }
        } 
        if (this.rdbPublico.isSelected()){
            
            financiacion = this.txtFinanciacion.getText();
            discapacitados = this.txtDiscapacitados.getText();

            
            if (financiacion.isEmpty()){
                errores += " - Tienes que ingresar una financiación \n";
            }else{
                if (!MetodosSueltos.validaNumeroReal_Exp(financiacion)) {
                    errores += " - La financiación debe ser un número real \n";
                }
            } 
            if (discapacitados.isEmpty()){
                errores += " - Tienes que ingresar un número de empleados discapacitados \n";
            }else{
                if (!MetodosSueltos.validaNumeroEntero_Exp(discapacitados)) {
                    errores += " - La cantidad de empleados discapacitados debe ser un número debe ser un entero \n";
                }
            }
        }else{
            
            numSocios = this.txtSocios.getText();
            
            if (numSocios.isEmpty()){
                errores += " - Tienes que ingresar un número de socios \n";
            }else{
                if (!MetodosSueltos.validaNumeroEntero_Exp(numSocios)) {
                errores += " - La cantidad de socios debe ser un número debe ser un entero \n";
                }
            }  
        }
         
         
         
        if (errores.isEmpty()){
            int numeroAeropuerto = Integer.parseInt(numero);
            int anioInauguracionAeropuerto = Integer.parseInt(anioInauguracion);
            int capacidadAeropuerto = Integer.parseInt(capacidad);
            
    
            
            Address dir = new Address(pais, ciudad, calle, numeroAeropuerto);
            
            if (this.aeropuertoEditar!=null) {
               
                this.aeropuertoEditar.setNombre(nombre);
                this.aeropuertoEditar.setAddress(dir);
                this.aeropuertoEditar.setCapacidad(capacidadAeropuerto);
                this.aeropuertoEditar.setAnioInauguracion(anioInauguracionAeropuerto);

                if (this.rdbPublico.isSelected()) {
                  double financiacionAeropuerto = Double.parseDouble(financiacion);
                  int discapacitadosAeropuerto = Integer.parseInt(discapacitados);
                  
                  PublicAirport ap = (PublicAirport) this.aeropuertoEditar;
                  
                  ap.setFinanciacion(financiacionAeropuerto);
                  ap.setNumTrabajadoresDiscapacitados(discapacitadosAeropuerto);
                   
                  this.aeropuertoEditar = ap;
                }else{
                  int numSociosAeropuerto = Integer.parseInt(numSocios);
                  
                  PrivateAirport ap = (PrivateAirport) this.aeropuertoEditar;
                  
                  ap.setNumSocios(numSociosAeropuerto);
              
                  
                  this.aeropuertoEditar = ap;
            
                }
            
            }else{
   
                Airport aux;
                if (this.rdbPublico.isSelected()){
                    double financiacionAeropuerto = Double.parseDouble(financiacion);
                    int discapacitadosAeropuerto = Integer.parseInt(discapacitados);

                    aux = new PublicAirport(financiacionAeropuerto,
                                            discapacitadosAeropuerto,
                                            nombre,
                                            dir,
                                            anioInauguracionAeropuerto,
                                            capacidadAeropuerto);


                }else{
                    int numSociosAeropuerto = Integer.parseInt(numSocios);


                    aux = new PrivateAirport(numSociosAeropuerto,
                                            nombre,
                                            dir,
                                            anioInauguracionAeropuerto,
                                            capacidadAeropuerto);
                }
            
            
                try {
                    MetodosSueltos.escribirAeropuertos(aux, true);
                    JOptionPane.showMessageDialog(this, "Aeropuerto creado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {

                    JOptionPane.showMessageDialog(this, 
                            ex.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,
                                    errores,
                                    "error",
                                    JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnGuardarAccionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarAccion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdbPrivado;
    private javax.swing.JRadioButton rdbPublico;
    private javax.swing.JTextField txtAnioInauguracion;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDiscapacitados;
    private javax.swing.JTextField txtFinanciacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtSocios;
    // End of variables declaration//GEN-END:variables
}
