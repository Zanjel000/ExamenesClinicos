/*       
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AngelCoavas.Examenes.version.Front_end.vistas;

import AngelCoavas.Examenes.version.controllers.LaboratiorioJpaController;
import AngelCoavas.Examenes.version.models.Laboratiorio;
import java.awt.Color;
import java.sql.*;
import java.util.Calendar;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import AngelCoavas.Examenes.version.Front_end.vistas.ListaDeEnsayos;

 
/**
 *
 * @author HP5
 * 
 */


public class Panel_1 extends javax.swing.JPanel {

    /**
     * Creates new form Panel_1
     */
    ListaDeEnsayos labori;
    Integer idEncontrado;
    
    public Panel_1() {
        initComponents();
        TextPrompt txt1 = new TextPrompt("Ingresa el nombre", txtNombre);
        TextPrompt txt2 = new TextPrompt("Ingresa el nombre del ensayo", txtNombreEnsayo);
        TextPrompt txt3 = new TextPrompt("Ingrese el tipo de contenido", txtTipoDeContenido);
        TextPrompt txt4 = new TextPrompt("Ingresa la id de su ensayo", txtBuscar);

        txt1.setForeground(Color.GRAY);
        txt2.setForeground(Color.GRAY);
        txt3.setForeground(Color.GRAY);
        txt4.setForeground(Color.GRAY);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        btnVaciar = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNombreEnsayo = new javax.swing.JTextField();
        txtTipoDeContenido = new javax.swing.JTextField();
        DatoDeFecha = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(626, 532));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(626, 532));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LABORATORIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nombre de ensayo:");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Tipo de contenido:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Fecha de ensayo:");

        btnAgregar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        btnVaciar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(0, 0, 255));
        btnVaciar.setText("Vaciar");
        btnVaciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 255));
        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 224));
        jLabel6.setText("Buscar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAgregar)
                        .addGap(115, 115, 115)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(btnVaciar)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTipoDeContenido))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DatoDeFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreEnsayo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreEnsayo)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTipoDeContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DatoDeFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnVaciar))
                .addGap(25, 25, 25))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //conexion con base de datos y agregar datos
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        if (!txtNombre.getText().equals("")
                && !txtNombreEnsayo.getText().equals("")
                && !txtTipoDeContenido.getText().equals("")){

            //Definir EntityManagerFactory
            EntityManagerFactory emf = new Persistence().createEntityManagerFactory("Examenes_clinicosPU");
            //Definir la instancia del controlador
            LaboratiorioJpaController controller = new LaboratiorioJpaController(emf);

            //Obtener los valores de todos los campos
            String Nombre = txtNombre.getText();
            String NombreDeEnsayo = txtNombreEnsayo.getText();
            String TipoDeContenido = txtTipoDeContenido.getText();
           

            //Instanciar una universidad y darle todos los valores segun los obtenidos arriba
            Laboratiorio lab = new Laboratiorio();
            lab.setNombre(Nombre);
            lab.setNombreDeEnsayo(NombreDeEnsayo);
            lab.setTipoDeContenido(TipoDeContenido);
            lab.setFechadeensayo(DatoDeFecha.getLinkDay());
            //Definir un try catch
            try {
                //Accedemos al metodo crear del controlador y le pasamos la universidad creada arriba
                controller.create(lab);
                //Si sale bien mostramos
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO ");
            } catch (Exception e) {
                //Si sale mal mostramos
                JOptionPane.showMessageDialog(null, "Hubo error, intentelo nuevamente");
            }
        }

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (txtBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escriba un id para buscar");
        } else {
            //Definir EntityManagerFactory
            EntityManagerFactory emf = new Persistence().createEntityManagerFactory("Examenes_clinicosPU");
            //Definir la instancia del controlador
            LaboratiorioJpaController controller = new LaboratiorioJpaController(emf);

            //obtener el id del campo de texto
            Integer id = Integer.parseInt(txtBuscar.getText());

            try {
                //Una variable 
                Laboratiorio labEncontrada = controller.findLaboratiorio(id);
                idEncontrado = labEncontrada.getId();

                txtNombre.setText(labEncontrada.getNombre());
                txtNombreEnsayo.setText(labEncontrada.getNombreDeEnsayo());
                txtTipoDeContenido.setText(labEncontrada.getTipoDeContenido());
                txtBuscar.setText(String.valueOf(labEncontrada.getId()));
                JOptionPane.showMessageDialog(null, "Encontrada");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se encontro");
            }

        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnVaciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarMouseClicked
        txtNombre.setText("");
        txtNombreEnsayo.setText("");
        txtTipoDeContenido.setText("");
        DatoDeFecha.setDate(new java.util.Date());
    }//GEN-LAST:event_btnVaciarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (txtBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Escriba un id para buscar");
        } else {
            EntityManagerFactory emf = new Persistence().createEntityManagerFactory("Examenes_clinicosPU");
            LaboratiorioJpaController controller = new LaboratiorioJpaController(emf);

            Integer id = Integer.parseInt(txtBuscar.getText());
            try {
                controller.destroy(id);
                JOptionPane.showMessageDialog(null, "Uusuario Eliminado ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error, intente nuevamente");
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(Color.GRAY);
        btnAgregar.setForeground(Color.red);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited

        btnAgregar.setBackground(new Color(255, 255, 255));
        btnAgregar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.GRAY);
        btnEliminar.setForeground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255, 255, 255));
        btnEliminar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnVaciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarMouseEntered
        btnVaciar.setBackground(Color.GRAY);
        btnVaciar.setForeground(Color.red);
    }//GEN-LAST:event_btnVaciarMouseEntered

    private void btnVaciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarMouseExited
        btnVaciar.setBackground(new Color(255, 255, 255));
        btnVaciar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnVaciarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatoDeFecha;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEnsayo;
    private javax.swing.JTextField txtTipoDeContenido;
    // End of variables declaration//GEN-END:variables
}
