
package gui;

import concurrencia.Procesador;
import concurrencia.Proceso;
import herramientas.Herramienta;
import java.awt.Color;

public class MainFrame extends javax.swing.JFrame {

    public static final String MORADO = "#8000FF";
    public static final String DURAZNO = "#F6B8B8";
                    
    Procesador procesador;
    Proceso[] procesos = new Proceso[3];
            
    Herramienta herramienta = new Herramienta();
    
    public MainFrame() {
        initComponents();
        procesadorjButton.setBackground(Color.decode(MORADO));
        this.mainjPanel.setBackground(Color.decode(DURAZNO));
        this.procesador = new Procesador(procesadorjButton);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainjPanel = new javax.swing.JPanel();
        procesadorjButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instrucciones1TextArea = new javax.swing.JTextArea();
        infoP1Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        realizadas1TextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        infoP1Label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        instrucciones2TextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        realizadas2TextArea = new javax.swing.JTextArea();
        infoP1Label2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        realizadas3TextArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        instrucciones3TextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        proceso1jLabel = new javax.swing.JLabel();
        proceso2jLabel = new javax.swing.JLabel();
        proceso3jLabel = new javax.swing.JLabel();
        comenzarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainjPanel.setForeground(new java.awt.Color(153, 255, 153));

        infoLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        infoLabel.setText("* Ingreso el tiempo (milisegundos) para cada instruccion de cada Proceso");

        instrucciones1TextArea.setColumns(8);
        instrucciones1TextArea.setRows(5);
        jScrollPane1.setViewportView(instrucciones1TextArea);

        infoP1Label.setText("Pendientes:");

        realizadas1TextArea.setEditable(false);
        realizadas1TextArea.setColumns(8);
        realizadas1TextArea.setRows(5);
        jScrollPane2.setViewportView(realizadas1TextArea);

        jLabel1.setText("Realizadas:");

        infoP1Label1.setText("Pendientes:");

        jLabel2.setText("Realizadas:");

        instrucciones2TextArea.setColumns(8);
        instrucciones2TextArea.setRows(5);
        jScrollPane3.setViewportView(instrucciones2TextArea);

        realizadas2TextArea.setEditable(false);
        realizadas2TextArea.setColumns(8);
        realizadas2TextArea.setRows(5);
        jScrollPane4.setViewportView(realizadas2TextArea);

        infoP1Label2.setText("Pendientes:");

        realizadas3TextArea.setEditable(false);
        realizadas3TextArea.setColumns(8);
        realizadas3TextArea.setRows(5);
        jScrollPane5.setViewportView(realizadas3TextArea);

        instrucciones3TextArea.setColumns(8);
        instrucciones3TextArea.setRows(5);
        jScrollPane6.setViewportView(instrucciones3TextArea);

        jLabel3.setText("Realizadas:");

        proceso1jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        proceso1jLabel.setForeground(new java.awt.Color(0, 0, 0));
        proceso1jLabel.setText("Proceso 1");

        proceso2jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        proceso2jLabel.setForeground(new java.awt.Color(102, 102, 102));
        proceso2jLabel.setText("Proceso 2");

        proceso3jLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        proceso3jLabel.setForeground(new java.awt.Color(255, 255, 255));
        proceso3jLabel.setText("Proceso 3");

        comenzarButton.setText("Comenzar");
        comenzarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainjPanelLayout = new javax.swing.GroupLayout(mainjPanel);
        mainjPanel.setLayout(mainjPanelLayout);
        mainjPanelLayout.setHorizontalGroup(
            mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comenzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(procesadorjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainjPanelLayout.createSequentialGroup()
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainjPanelLayout.createSequentialGroup()
                                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(mainjPanelLayout.createSequentialGroup()
                                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(infoP1Label))
                                        .addGap(18, 18, 18)
                                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(proceso1jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(mainjPanelLayout.createSequentialGroup()
                                        .addComponent(infoP1Label1)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel2))
                                    .addGroup(mainjPanelLayout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(proceso2jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(mainjPanelLayout.createSequentialGroup()
                                        .addComponent(infoP1Label2)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel3))
                                    .addGroup(mainjPanelLayout.createSequentialGroup()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(proceso3jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(infoLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainjPanelLayout.setVerticalGroup(
            mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(procesadorjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceso1jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(proceso2jLabel)
                        .addComponent(proceso3jLabel)))
                .addGap(18, 18, 18)
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainjPanelLayout.createSequentialGroup()
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoP1Label)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainjPanelLayout.createSequentialGroup()
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoP1Label1)
                            .addComponent(jLabel2)
                            .addComponent(infoP1Label2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comenzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarButtonActionPerformed
                
        procesos[0] = new Proceso(1, procesador, herramienta.convertirTexto(instrucciones1TextArea.getText()),instrucciones1TextArea,realizadas1TextArea,proceso1jLabel);
        procesos[1] = new Proceso(2, procesador, herramienta.convertirTexto(instrucciones2TextArea.getText()),instrucciones2TextArea,realizadas2TextArea,proceso2jLabel);
        procesos[2] = new Proceso(3, procesador, herramienta.convertirTexto(instrucciones3TextArea.getText()),instrucciones3TextArea,realizadas3TextArea,proceso3jLabel);
          
        procesos[0].start();
        procesos[1].start();
        procesos[2].start();
              
    }//GEN-LAST:event_comenzarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comenzarButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoP1Label;
    private javax.swing.JLabel infoP1Label1;
    private javax.swing.JLabel infoP1Label2;
    private javax.swing.JTextArea instrucciones1TextArea;
    private javax.swing.JTextArea instrucciones2TextArea;
    private javax.swing.JTextArea instrucciones3TextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel mainjPanel;
    private javax.swing.JButton procesadorjButton;
    private javax.swing.JLabel proceso1jLabel;
    private javax.swing.JLabel proceso2jLabel;
    private javax.swing.JLabel proceso3jLabel;
    private javax.swing.JTextArea realizadas1TextArea;
    private javax.swing.JTextArea realizadas2TextArea;
    private javax.swing.JTextArea realizadas3TextArea;
    // End of variables declaration//GEN-END:variables
}
