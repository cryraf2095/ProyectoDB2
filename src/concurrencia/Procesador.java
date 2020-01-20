
package concurrencia;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Procesador {
    
    private JButton procesador;
    
    public Procesador(JButton procesador) {
        this.procesador = procesador;
    }

    public synchronized void realizarInstruccion(Instruccion instruccion,JLabel labelInfo) {
        try {
            labelInfo.setText("Proceso " + instruccion.getIdProceso() + ": Ejecutando");
            System.out.println("Proceso " + instruccion.getIdProceso() + ": Ejecutando");
            switch (instruccion.getIdProceso()){
                case 1:
                    procesador.setBackground(Color.BLACK);
                    System.out.println("Proceso " + instruccion.getIdProceso() + ": Pintando Negro durante: " + instruccion.getTiempoEjecucion());
                    break;
                case 2:
                    procesador.setBackground(Color.GRAY);
                    System.out.println("Proceso " + instruccion.getIdProceso() + ": Pintando Gris durante: " + instruccion.getTiempoEjecucion());
                    break;
                case 3:
                    procesador.setBackground(Color.WHITE);
                    System.out.println("Proceso " + instruccion.getIdProceso() + ": Pintando Blanco durante: " + instruccion.getTiempoEjecucion());
                    break;    
                default:
            }
            procesador.setText(String.valueOf(instruccion.getTiempoEjecucion()));
            Thread.sleep(instruccion.getTiempoEjecucion());
            labelInfo.setText("Proceso " + instruccion.getIdProceso() + ": Bloqueado");
            System.out.println("Proceso " + instruccion.getIdProceso() + ": Bloqueado");
        } catch (InterruptedException ex) {
            Logger.getLogger(Procesador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JButton getProcesador() {
        return procesador;
    }
      
}
