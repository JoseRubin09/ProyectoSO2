/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionss;

import Classes.Node;
import static Classes.main.Interfaz;
import static Utils.Constants.cola1P1;
import static Utils.Constants.cola1P2;
import static Utils.Constants.cola2P1;
import static Utils.Constants.cola2P2;
import static Utils.Constants.cola3P1;
import static Utils.Constants.cola3P2;
import static Utils.Constants.colaRefuerzoP1;
import static Utils.Constants.colaRefuerzoP2;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jose Rubin
 */
public class interfaceFunctions {
	public void resetTextPanes(){
		String text1 = "	";
		for(Node item: cola1P1){
			text1+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.Cola1Jose.setText(text1);
		String text2 = "	";
		for(Node item: cola2P1){
			text2+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.Cola2Jose.setText(text2);
		String text3 = "	";
		for(Node item: cola3P1){
			text3+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.Cola3Jose.setText(text3);
		String text4 = "	";
		for(Node item: colaRefuerzoP1){
			text4+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.RefuerzoJose.setText(text4);
		
		String text5 = "	";
		for(Node item: cola1P2){
			text5+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.Cola1Jose1.setText(text5);
		String text6 = "	";
		for(Node item: cola2P2){
			text6+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.Cola2Jose1.setText(text6);
		String text7 = "	";
		for(Node item: cola3P2){
			text7+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.Cola3Jose1.setText(text7);
		String text8 = "	";
		for(Node item: colaRefuerzoP2){
			text8+="    \n-----\n    "+item.getId()+item.getTipo();
		}
		Interfaz.RefuerzoJose.setText(text8);

		

	}

	public void ResetDetallesBatalla(Node n1, Node n2){
        Interfaz.Serie1.setText(n1.getId());
        Interfaz.Carta1Jose.setText(n1.getChar1());
        Interfaz.Carta2Jose.setText(n1.getChar2());
        Interfaz.Carta3Jose.setText(n1.getChar3());
        Interfaz.Carta4Jose.setText(n1.getChar4());
        Interfaz.Carta5Jose.setText(n1.getChar5());
        Interfaz.Carta6Jose.setText(n1.getChar6());
        
        
        Interfaz.Serie2.setText(n2.getId());
        Interfaz.Carta1Jose1.setText(n2.getChar1());
        Interfaz.Carta2Jose1.setText(n2.getChar2());
        Interfaz.Carta3Jose1.setText(n2.getChar3());
        Interfaz.Carta4Jose1.setText(n2.getChar4());
        Interfaz.Carta5Jose1.setText(n2.getChar5());
        Interfaz.Carta6Jose1.setText(n2.getChar6());
    }

	public void EmptyDetallesBatalla(){
        Interfaz.Serie1.setText("");
        Interfaz.Carta1Jose.setText("");
        Interfaz.Carta2Jose.setText("");
        Interfaz.Carta3Jose.setText("");
        Interfaz.Carta4Jose.setText("");
        Interfaz.Carta5Jose.setText("");
        Interfaz.Carta6Jose.setText("");
        Interfaz.ganador1.setText("");
        
        Interfaz.Serie2.setText("");
		Interfaz.Carta1Jose1.setText("");
        Interfaz.Carta2Jose1.setText("");
        Interfaz.Carta3Jose1.setText("");
        Interfaz.Carta4Jose1.setText("");
        Interfaz.Carta5Jose1.setText("");
        Interfaz.Carta6Jose1.setText("");
        Interfaz.ganador2.setText("");
    }
	
	public void Ganador1(){
		Interfaz.ganador1.setText("Ganador");
    }
 
	public void Ganador2(){
        Interfaz.ganador2.setText("Ganador");
    }

	public void ActualizoContador(){
		//cola2 pa cola1 P1
        ArrayList arrayCola2P1 = new ArrayList();
        Node n;
        Object[] objects =  cola2P1.toArray();
        arrayCola2P1.addAll(Arrays.asList(objects));
        for(int i = 0; i<arrayCola2P1.size();i++){
            n = (Node) arrayCola2P1.get(i);
            if (n.getCountdown()<8){
                n.setCountdown(n.getCountdown()+1);
            }else{
                n.setCountdown(0);
                cola2P1.remove(n);
                cola1P1.add(n);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n.getId());
            }
        }
        
        //cola3 pa cola2 P1
       ArrayList arrayCola3P1 = new ArrayList();
        Node n2;
        Object[] objects2 =  cola3P1.toArray();
        arrayCola3P1.addAll(Arrays.asList(objects2));
        for(int i = 0; i<arrayCola3P1.size();i++){
            n2 = (Node) arrayCola3P1.get(i);
            if (n2.getCountdown()<8){
                n2.setCountdown(n2.getCountdown()+1);
            }else{
                n2.setCountdown(0);
                cola3P1.remove(n2);
                cola2P1.add(n2);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n2.getId());
            }
        }

        //cola2 pa cola1 P2
        ArrayList arrayCola2P2 = new ArrayList();
        Node n3;
        Object[] objects3 =  cola2P2.toArray();
        arrayCola2P2.addAll(Arrays.asList(objects3));
        for(int i = 0; i<arrayCola2P2.size();i++){
            n3 = (Node) arrayCola2P2.get(i);
            if (n3.getCountdown()<8){
                n3.setCountdown(n3.getCountdown()+1);
            }else{
                n3.setCountdown(0);
                cola2P2.remove(n3);
                cola1P2.add(n3);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n3.getId());
            }
        }



        //cola3 pa cola2 p2
        ArrayList arrayCola3P2 = new ArrayList();
        Node n4;
        Object[] objects4 =  cola3P2.toArray();
        arrayCola3P2.addAll(Arrays.asList(objects4));
        for(int i = 0; i<arrayCola3P2.size();i++){
            n4 = (Node) arrayCola3P2.get(i);
            if (n4.getCountdown()<8){
                n4.setCountdown(n4.getCountdown()+1);
            }else{
                n4.setCountdown(0);
                cola3P2.remove(n4);
                cola2P2.add(n4);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n4.getId());
            }
        }
	}

}
