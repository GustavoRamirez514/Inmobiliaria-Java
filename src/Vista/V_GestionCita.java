/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.C_Agenda;
import Controlador.C_Usuario;
import Modelo.M_Agenda;
import Modelo.M_Usuario;
import Utilidades.ConexionBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.sql.*;
/**
 *
 * @author GUSTAVO RAMIREZ
 */
public class V_GestionCita extends javax.swing.JPanel {
String Columna[] = {"ID", "IDInmueble", "Cliente", "Agente", "Estado", "Fecha", "Observaciones"};
    DefaultTableModel Modelo = new DefaultTableModel(Columna, 0);
    C_Agenda cu;
    M_Agenda bu;
    /**
     * Creates new form V_GestionCita
     */
    public V_GestionCita() {
        initComponents();
        
        bu = new M_Agenda();
        cu = new C_Agenda();
        
        cu.setIu_GestionCita(this);
        cu.ListarCitas();

    }

    public void AgregarFila(String datos[]) {
        Modelo.addRow(datos);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        G_Buscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        G_Filtro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        G_Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        G_BtnActualizar1 = new javax.swing.JButton();
        G_Modificadores = new javax.swing.JPanel();
        G_BtnEditar1 = new javax.swing.JButton();
        G_BtnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setText("Filtro:");

        G_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BuscarActionPerformed(evt);
            }
        });
        G_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                G_BuscarKeyReleased(evt);
            }
        });

        jLabel4.setText("Buscar:");

        G_Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificador", "ID Inmueble", "Cliente", "Agente", "Estado", "Fecha", "Observaciones" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(G_Buscar)
                    .addComponent(G_Filtro, 0, 118, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(G_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        G_Tabla.setModel(Modelo);
        jScrollPane1.setViewportView(G_Tabla);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("LISTADO DE CITAS");

        G_BtnActualizar1.setText("Actualizar Tabla");
        G_BtnActualizar1.setPreferredSize(new java.awt.Dimension(1356, 637));
        G_BtnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnActualizar1ActionPerformed(evt);
            }
        });

        G_Modificadores.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificadores "));

        G_BtnEditar1.setText("Editar");
        G_BtnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnEditar1ActionPerformed(evt);
            }
        });

        G_BtnEliminar.setText("Eliminar");
        G_BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout G_ModificadoresLayout = new javax.swing.GroupLayout(G_Modificadores);
        G_Modificadores.setLayout(G_ModificadoresLayout);
        G_ModificadoresLayout.setHorizontalGroup(
            G_ModificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(G_ModificadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(G_BtnEditar1)
                .addGap(18, 18, 18)
                .addComponent(G_BtnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        G_ModificadoresLayout.setVerticalGroup(
            G_ModificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(G_ModificadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(G_ModificadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G_BtnEditar1)
                    .addComponent(G_BtnEliminar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("GESTION DE CITA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(G_BtnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(G_Modificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(G_BtnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(G_Modificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void G_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G_BuscarActionPerformed

    private void G_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_G_BuscarKeyReleased
        TableRowSorter<DefaultTableModel> Sorter;
        Sorter = new TableRowSorter<>(Modelo);
        G_Tabla.setRowSorter(Sorter);
        Sorter.setRowFilter(RowFilter.regexFilter(G_Buscar.getText(),G_Filtro.getSelectedIndex()));

    }//GEN-LAST:event_G_BuscarKeyReleased

    private void G_BtnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnActualizar1ActionPerformed
        //CODIGO AL PRESIONAR EL BOTON ACTUALIZAR
        Modelo.setRowCount(0);
        cu.ListarCitas();
    }//GEN-LAST:event_G_BtnActualizar1ActionPerformed

    private void G_BtnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnEditar1ActionPerformed
        //CODIGO AL PRESIONAR EL BOTON EDITAR INMUEBLE

        try {
            if (JOptionPane.showConfirmDialog(null, "Se editara el registro, ¿desea continuar?") == JOptionPane.YES_OPTION) {
                int Identificador;
                Identificador = Integer.parseInt(Modelo.getValueAt(G_Tabla.getSelectedRow(), 0).toString());

                cu.ConsultarCitaId(Identificador);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccion un registro para editar");
        }
    }//GEN-LAST:event_G_BtnEditar1ActionPerformed

    private void G_BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_BtnEliminarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(null, "Se eliminará el registro, ¿desea continuar?") == JOptionPane.YES_OPTION) {
                String Identificador = Modelo.getValueAt(G_Tabla.getSelectedRow(), 0).toString();
                ConexionBD c = new ConexionBD();
                boolean exito = false;
                String sql = "update citas set Estado='Terminada'";
                sql += "where Identificador='" + Identificador + "'";

                try {
                    exito = c.ejecutarSql(sql);
                    c.cerrarConexion();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexion");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccion un registro para eliminar");

        }
    }//GEN-LAST:event_G_BtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton G_BtnActualizar1;
    private javax.swing.JButton G_BtnEditar1;
    private javax.swing.JButton G_BtnEliminar;
    private javax.swing.JTextField G_Buscar;
    private javax.swing.JComboBox<String> G_Filtro;
    private javax.swing.JPanel G_Modificadores;
    public static javax.swing.JTable G_Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
