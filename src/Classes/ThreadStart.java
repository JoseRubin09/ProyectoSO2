/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.main.Interfaz;
import static Classes.main.admin;
import Utils.Constants;
import static Utils.Constants.interfaceFunct;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Rubin
 */
public class ThreadStart extends Thread{
	public boolean stop;
    
    public ThreadStart (){
        this.stop = true;
    }

    public void stopToggle(){
        this.stop = !this.stop;
    }

    public void run(){
		while (this.stop){
			try {
				Constants.tiempodia = Integer.parseInt(Interfaz.timeText.getText());
				Interfaz.adminStatus.setText("Creando Telefonos");
				Interfaz.iaStatus.setText("Espera");
				admin.createSerie();
				Constants.interfaceFunct.resetTextPanes();
				Thread.sleep(1000);

				admin.backToQueue();
				Interfaz.adminStatus.setText("Regresando a colas los refuerzos");
				Interfaz.iaStatus.setText("Espera");
				Thread.sleep(1000);

				System.out.println("holaaaa");

				Constants.IA.decide();
				Interfaz.adminStatus.setText("Espera");
				Interfaz.iaStatus.setText("Decidiendo Ganador");
				Thread.sleep(11000/Constants.tiempodia);

				interfaceFunct.ActualizoContador();
				Constants.interfaceFunct.resetTextPanes();
				Constants.interfaceFunct.EmptyDetallesBatalla();

        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
}
