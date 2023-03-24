/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.Interfaz;

/**
 *
 * @author Jose Rubin
 */
public class main {
	
	public static Interfaz Interfaz = new Interfaz();
	public static ThreadStart start;
	public static Admin admin = new Admin();

	public static void main(String[] args) {
		Interfaz.setVisible(true);
	}
	
}
