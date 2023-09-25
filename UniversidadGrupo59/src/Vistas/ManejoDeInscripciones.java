/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import accesoADatos.AlumnoData;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan
 */
public class ManejoDeInscripciones extends javax.swing.JInternalFrame {
    private DefaultTableModel model= new DefaultTableModel();

    /**
     * Creates new form ManejoDeInscripciones
     */
    public ManejoDeInscripciones() {
        initComponents();
                
        armarCabecera();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jrbMateriasInscriptas = new javax.swing.JRadioButton();
        jrbMateriasnoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtIncripciones = new javax.swing.JTable();
        ibInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Inscripciones");

        jLabel2.setText("Seleccione a un alumno");

        jrbMateriasInscriptas.setText("Materias Inscriptas");
        jrbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscriptasActionPerformed(evt);
            }
        });

        jrbMateriasnoInscriptas.setText("Materias no Inscriptas");
        jrbMateriasnoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasnoInscriptasActionPerformed(evt);
            }
        });

        jtIncripciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtIncripciones);

        ibInscribir.setText("Inscribir");

        jbAnularInscripcion.setText("Anular Inscripcion");

        jbSalir.setText("Salir");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Listado de Materias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jrbMateriasInscriptas))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbMateriasnoInscriptas))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ibInscribir)
                        .addGap(45, 45, 45)
                        .addComponent(jbAnularInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasInscriptas)
                    .addComponent(jrbMateriasnoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibInscribir)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMateriasnoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasnoInscriptasActionPerformed
        Alumno selec= (Alumno)jcbAlumnos.getSelectedItem();
        ArrayList<Materia> materias=new ArrayList<>();
        InscripcionData inscd=new InscripcionData();
        materias=(ArrayList<Materia>) inscd.obtenerMateriasNoCursadas(selec.getIdAlumno());
        if(jrbMateriasnoInscriptas.isSelected()){
            for(Materia m: materias){
                jtIncripciones.setModel(model);
                model.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
            }
            
        }
    }//GEN-LAST:event_jrbMateriasnoInscriptasActionPerformed

    private void jrbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscriptasActionPerformed
        
        Alumno selec= (Alumno)jcbAlumnos.getSelectedItem();
        InscripcionData inscd=new InscripcionData();
        List<Materia> lista=inscd.obtenerMateriasCursadas(selec.getIdAlumno());
        if(jrbMateriasInscriptas.isSelected()){
            for(Materia m: lista){
                model.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
            }
        }
    }//GEN-LAST:event_jrbMateriasInscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ibInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbMateriasInscriptas;
    private javax.swing.JRadioButton jrbMateriasnoInscriptas;
    private javax.swing.JTable jtIncripciones;
    // End of variables declaration//GEN-END:variables


private void armarCabecera (){
    
    model.addColumn("Id");
    model.addColumn("Nombre");
    model.addColumn("Año");
    jtIncripciones.setModel(model);
}

private void cargarCombo(){

        AlumnoData ad=new AlumnoData();
        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos=(ArrayList<Alumno>)ad.listarAlumnos();
    
    for(Alumno alu : alumnos){
        jcbAlumnos.addItem(alu);
    }
    
}
private void borrarFilasTabla(){
    int indice=model.getRowCount()-1;
    
    for (int i= indice;i>=0;i--){
        model.removeRow(i);
    }
}

}
