/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Signal.Signal;
import java.awt.Graphics;

/**
 *
 * @author gustavolm
 */
public class ServerMainFrame extends javax.swing.JFrame {

    public ServerMainFrame() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        /* Initialize the cartesian planes */
        Signal.drawCartesianPlane(panelWave0.getGraphics(), 25, 20, 588, 150);
        Signal.drawCartesianPlane(panelWave1.getGraphics(), 25, 20, 588, 100);
        Signal.drawCartesianPlane(panelWave2.getGraphics(), 25, 20, 588, 100);
        Signal.drawCartesianPlane(panelWave3.getGraphics(), 25, 20, 588, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWave1 = new javax.swing.JPanel();
        panelWave2 = new javax.swing.JPanel();
        panelWave3 = new javax.swing.JPanel();
        panelWave0 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador CDM");
        setResizable(false);

        panelWave1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onda 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout panelWave1Layout = new javax.swing.GroupLayout(panelWave1);
        panelWave1.setLayout(panelWave1Layout);
        panelWave1Layout.setHorizontalGroup(
            panelWave1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelWave1Layout.setVerticalGroup(
            panelWave1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        panelWave2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onda 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.red));
        panelWave2.setPreferredSize(new java.awt.Dimension(588, 109));

        javax.swing.GroupLayout panelWave2Layout = new javax.swing.GroupLayout(panelWave2);
        panelWave2.setLayout(panelWave2Layout);
        panelWave2Layout.setHorizontalGroup(
            panelWave2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        panelWave2Layout.setVerticalGroup(
            panelWave2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        panelWave3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onda 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.red));
        panelWave3.setPreferredSize(new java.awt.Dimension(588, 109));

        javax.swing.GroupLayout panelWave3Layout = new javax.swing.GroupLayout(panelWave3);
        panelWave3.setLayout(panelWave3Layout);
        panelWave3Layout.setHorizontalGroup(
            panelWave3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        panelWave3Layout.setVerticalGroup(
            panelWave3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        panelWave0.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onda Recebida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.red));

        javax.swing.GroupLayout panelWave0Layout = new javax.swing.GroupLayout(panelWave0);
        panelWave0.setLayout(panelWave0Layout);
        panelWave0Layout.setHorizontalGroup(
            panelWave0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        panelWave0Layout.setVerticalGroup(
            panelWave0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelWave2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(panelWave1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelWave3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(panelWave0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelWave0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelWave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelWave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelWave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-624)/2, (screenSize.height-591)/2, 624, 591);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        ServerMainFrame mf = new ServerMainFrame();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelWave0;
    private javax.swing.JPanel panelWave1;
    private javax.swing.JPanel panelWave2;
    private javax.swing.JPanel panelWave3;
    // End of variables declaration//GEN-END:variables
}
