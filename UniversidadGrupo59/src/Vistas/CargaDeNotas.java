/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import accesoADatos.Conexion;
import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
//import java.util.List;
import javax.swing.table.DefaultTableModel;


public class CargaDeNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private ArrayList<Materia> listaM;
//    private ArrayList<Alumno> listaA;
    private MateriaData mData;
//    private AlumnoData ad;
    
   // private DefaultTableModel modelo;
    
    
    public CargaDeNotas() {
        initComponents();
//        listaA =(ArrayList<Alumno>)ad.listarAlumnos();
//        modelo=new DefaultTableModel();
        armarCabecera();
        cargarCombo();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCargaNotas = new javax.swing.JTable();

        setClosable(true);
        setTitle("                                             Carga Notas");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno");

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTCargaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTCargaNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jBSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
       
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
//        InscripcionData insc=new InscripcionData();
        
        int cantfilas = jTCargaNotas.getRowCount();
        for (int i = 0; i < cantfilas; i++) {
            if (jTCargaNotas.getModel().getValueAt(i, 2) == null) {
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacíos.");
            } else {
                try {
                    double nota = Double.parseDouble(jTCargaNotas.getModel().getValueAt(i, 2).toString());
                    Object seleccion = jcbAlumnos.getItemAt(jcbAlumnos.getSelectedIndex());
                    Alumno aux = (Alumno) seleccion;
                    int codal = aux.getIdAlumno();
                    int cod = Integer.parseInt(jTCargaNotas.getValueAt(i, 0).toString());
                    
                    InscripcionData acceso = new InscripcionData();
                    acceso.actualizarNota(codal,cod,nota);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error en el campo.");
                }
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCargaNotas;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    // End of variables declaration//GEN-END:variables

 private void armarCabecera() {
//        ArrayList<Object> filaCabecera=new ArrayList<>();

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        
//            filaCabecera.add("Codigo");
//            filaCabecera.add("Nombre");
//            filaCabecera.add("Nota");
//            for (Object it: filaCabecera){
//                modelo.addColumn(it);
//            }
        
        jTCargaNotas.setModel(modelo);
        
    }

 private void cargarCombo() {

        
        AlumnoData ad = new AlumnoData();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos = (ArrayList<Alumno>) ad.listarAlumnos();

        for (Alumno alu : alumnos) {
            jcbAlumnos.addItem(alu);
        }

    }
 private void borrarFilaTabla(){
     int indice =modelo.getRowCount()-1;
     for (int i =indice;i>=0;i--){
         modelo.removeRow(i);
     }
 }

 private void actualizar() {

        borrarFilasTabla();
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        Alumno alum = (Alumno) jcbAlumnos.getSelectedItem();
        InscripcionData inscd = new InscripcionData();
        MateriaData mat = new MateriaData();

        inscripciones = (ArrayList<Inscripcion>) inscd.obtenerInscripcionesPorAlumno(alum.getIdAlumno());

        for (Inscripcion insc : inscripciones) {
            if (alum.getIdAlumno() == insc.getAlumno().getIdAlumno()) {
                modelo.addRow(new Object[]{insc.getMateria().getIdMateria(),
                    mat.buscarNombreMateria(insc.getMateria().getIdMateria()),
                    insc.getNota()});
            }
        }
    }
 
 private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
 
//    private void CargarTabla() {
//        InscripcionData insc = new InscripcionData();
//        ArrayList<Inscripcion> lista = new ArrayList<>();
//        ArrayList<Materia> mate=new ArrayList();
//        Alumno alu = new Alumno();
//        Alumno alumno = (Alumno) jcbAlumnos.getSelectedItem();
//        int id = alumno.getIdAlumno();
//        mate=(ArrayList<Materia>) insc.obtenerMateriasCursadas(id);
//        lista = (ArrayList<Inscripcion>) insc.obtenerInscripcionesPorAlumno(id);
//        
//        for (Materia nota : mate) {
//            
//            modelo.addRow(new Object[]{nota.getIdMateria(), nota.getNombre(),});
//
//        }
//    }

}
