/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Juan
 */
public class UniversidadView extends javax.swing.JFrame {

    /**
     * Creates new form UniversidadView
     */
    public UniversidadView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm1 = new javax.swing.JMenu();
        jmFormularioAlumno = new javax.swing.JMenuItem();
        jm2 = new javax.swing.JMenu();
        jmFormularioMateria = new javax.swing.JMenuItem();
        jm3 = new javax.swing.JMenu();
        jmManejoInscripcion = new javax.swing.JMenuItem();
        jmManipulaciondeNotas = new javax.swing.JMenuItem();
        jm4 = new javax.swing.JMenu();
        jmAlumnosporMateria = new javax.swing.JMenuItem();
        jmbSalir = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jm1.setText("Alumno");

        jmFormularioAlumno.setText("Formulario Alumno");
        jm1.add(jmFormularioAlumno);

        jMenuBar1.add(jm1);

        jm2.setText("Materia");

        jmFormularioMateria.setText("Formulario Materia");
        jmFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriaActionPerformed(evt);
            }
        });
        jm2.add(jmFormularioMateria);

        jMenuBar1.add(jm2);

        jm3.setText("Administracion");

        jmManejoInscripcion.setText("Manejo Inscripcion");
        jm3.add(jmManejoInscripcion);

        jmManipulaciondeNotas.setText("Manipulacion de notas");
        jmManipulaciondeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulaciondeNotasActionPerformed(evt);
            }
        });
        jm3.add(jmManipulaciondeNotas);

        jMenuBar1.add(jm3);

        jm4.setText("Consultas");

        jmAlumnosporMateria.setText("Alumnos por Materia");
        jm4.add(jmAlumnosporMateria);

        jMenuBar1.add(jm4);

        jmbSalir.setText("Salir");
        jMenuBar1.add(jmbSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioMateriaView bpn=new FormularioMateriaView();
        bpn.setVisible(true);
        Escritorio.add(bpn);
        Escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jmFormularioMateriaActionPerformed

    private void jmManipulaciondeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulaciondeNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmManipulaciondeNotasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UniversidadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversidadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversidadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversidadView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniversidadView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu jm1;
    private javax.swing.JMenu jm2;
    private javax.swing.JMenu jm3;
    private javax.swing.JMenu jm4;
    private javax.swing.JMenuItem jmAlumnosporMateria;
    private javax.swing.JMenuItem jmFormularioAlumno;
    private javax.swing.JMenuItem jmFormularioMateria;
    private javax.swing.JMenuItem jmManejoInscripcion;
    private javax.swing.JMenuItem jmManipulaciondeNotas;
    private javax.swing.JMenu jmbSalir;
    // End of variables declaration//GEN-END:variables
}
