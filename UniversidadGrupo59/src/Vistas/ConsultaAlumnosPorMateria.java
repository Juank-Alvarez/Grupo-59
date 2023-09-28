
package Vistas;

import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class ConsultaAlumnosPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel model = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    
    private List<Materia> mater;
    private MateriaData mt;
    
    
    public ConsultaAlumnosPorMateria() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListadodealumnos = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jCAlumnosPorMateria = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Listado Alumnos Por Materia");

        jLabel2.setText("Seleccione una Materia");

        jtListadodealumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListadodealumnos);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAlumnosPorMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCAlumnosPorMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCAlumnosPorMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalir)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosPorMateriaActionPerformed
      borrarFilasTabla();
        cargarTabla();
    }//GEN-LAST:event_jCAlumnosPorMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Materia> jCAlumnosPorMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtListadodealumnos;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {

        model.addColumn("Id");
        model.addColumn("Dni");
        model.addColumn("Apellido");
        model.addColumn("Nombre");
        
        jtListadodealumnos.setModel(model);

}


    private void cargarCombo() {

        mt = new MateriaData();
        mater = mt.listarMateria();

        for (Materia mate : mater) {
            jCAlumnosPorMateria.addItem(mate);
        }
     
        
        
    }
    

    private void cargarTabla() {

        List<Alumno> alumnos = new ArrayList<>();
        InscripcionData insc = new InscripcionData();
        Materia mat = new Materia();
        mat = (Materia) jCAlumnosPorMateria.getSelectedItem();
       
        int idMateria = mat.getIdMateria();
        alumnos = (ArrayList<Alumno>) insc.obtenerAlumnosXMateria(idMateria);

             for (Alumno alumno : alumnos) {
            model.addRow(new Object[]{
                alumno.getIdAlumno(),
                alumno.getDni(),
                alumno.getApellido(),
                alumno.getNombre()
            });

            }

    }
  
    private void borrarFilasTabla() {
        int indice = model.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            model.removeRow(i);
    
    
    
}

    }   

     
}  
     
    
     








     
     
     

        






