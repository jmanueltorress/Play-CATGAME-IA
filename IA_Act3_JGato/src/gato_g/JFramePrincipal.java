package gato_g;

import Ventanas.InterfaceJuego;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFramePrincipal extends JFrame {

    InterfaceJuego PanelNuevo;

    public JFramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelNuevo = new InterfaceJuego();
        insertarPanel(PanelNuevo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jugar Gato");
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    // Declaracion de funciones no modificar el contenido
    public void insertarPanel(JPanel panel) {
        this.getContentPane().add(panel);
        panel.setSize(676, 500);
        this.setVisible(true);
        this.repaint();
    }
}
