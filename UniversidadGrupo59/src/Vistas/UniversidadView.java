
package Vistas;

import javax.swing.JOptionPane;


public class UniversidadView extends javax.swing.JFrame {

   
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
        jm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm1ActionPerformed(evt);
            }
        });

        jmFormularioAlumno.setText("Formulario Alumno");
        jmFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnoActionPerformed(evt);
            }
        });
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
        jmManejoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionActionPerformed(evt);
            }
        });
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
        jmAlumnosporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosporMateriaActionPerformed(evt);
            }
        });
        jm4.add(jmAlumnosporMateria);

        jMenuBar1.add(jm4);

        jmbSalir.setText("Salir");
        jmbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmbSalirMouseClicked(evt);
            }
        });
        jmbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSalirActionPerformed(evt);
            }
        });
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
       
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDeNotas bpn=new CargaDeNotas();
        bpn.setVisible(true);
        Escritorio.add(bpn);
        Escritorio.moveToFront(bpn);
        
        
    }//GEN-LAST:event_jmManipulaciondeNotasActionPerformed

    private void jmbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSalirActionPerformed
      
    }//GEN-LAST:event_jmbSalirActionPerformed

    private void jmManejoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionActionPerformed
        
        Escritorio.removeAll();
        Escritorio.repaint();
        ManejoDeInscripciones bpn=new ManejoDeInscripciones();
        bpn.setVisible(true);
        Escritorio.add(bpn);
        Escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jmManejoInscripcionActionPerformed

    private void jm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jm1ActionPerformed

    private void jmFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnoActionPerformed
        
        Escritorio.removeAll();
        Escritorio.repaint();
        GestiónAlumnosView bpn=new GestiónAlumnosView();
        bpn.setVisible(true);
        Escritorio.add(bpn);
        Escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jmFormularioAlumnoActionPerformed

    private void jmAlumnosporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosporMateriaActionPerformed
         Escritorio.removeAll();
        Escritorio.repaint();
        ConsultaAlumnosPorMateria bpn=new ConsultaAlumnosPorMateria();
        bpn.setVisible(true);
        Escritorio.add(bpn);
        Escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jmAlumnosporMateriaActionPerformed

    private void jmbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmbSalirMouseClicked
        cerrar();
    }//GEN-LAST:event_jmbSalirMouseClicked

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


    public void cerrar() {
        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicación?", "Título", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se canceló el cierre.");
        }
    }
}


