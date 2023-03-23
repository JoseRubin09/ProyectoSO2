/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionss;
import Classes.Node;
import Utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jose Rubin
 */
public class randomFunctions {
	public void ActualizarContador(){
		ArrayList arrayCola2P1 = new ArrayList();
		Node n;
		Object[] objects =  Constants.cola2P1.toArray();
		arrayCola2P1.addAll(Arrays.asList(objects));
		for(int i = 0; i<arrayCola2P1.size();i++){
			n = (Node) arrayCola2P1.get(i);
			if (n.getCountdown()<8){
				n.setCountdown(n.getCountdown()+1);
			}else{
				n.setCountdown(0);
				Constants.cola2P1.remove(n);
				Constants.cola1P1.add(n);
				System.out.println("LO AGREGUE A LA OTRA COLA?? " + n.getId());
			}
		}
		//cola3 pa cola2 P1
		ArrayList arrayCola3P1 = new ArrayList();
		Node n2;
		Object[] objects2 =  Constants.cola3P1.toArray();
		arrayCola3P1.addAll(Arrays.asList(objects2));
		for(int i = 0; i<arrayCola3P1.size();i++){
			n2 = (Node) arrayCola3P1.get(i);
			if (n2.getCountdown()<8){
				n2.setCountdown(n2.getCountdown()+1);
			}else{
				n2.setCountdown(0);
				Constants.cola3P1.remove(n2);
				Constants.cola2P1.add(n2);
				System.out.println("LO AGREGUE A LA OTRA COLA?? " + n2.getId());
			}
		}
		//cola2 pa cola1 P2
		ArrayList arrayCola2P2 = new ArrayList();
		Node n3;
		Object[] objects3 =  Constants.cola2P2.toArray();
		arrayCola2P2.addAll(Arrays.asList(objects3));
		for(int i = 0; i<arrayCola2P2.size();i++){
			n3 = (Node) arrayCola2P2.get(i);
			if (n3.getCountdown()<8){
				n3.setCountdown(n3.getCountdown()+1);
			}else{
				n3.setCountdown(0);
				Constants.cola2P2.remove(n3);
				Constants.cola1P2.add(n3);
				System.out.println("LO AGREGUE A LA OTRA COLA?? " + n3.getId());
			}
		}
		//cola3 pa cola2 p2
		ArrayList arrayCola3P2 = new ArrayList();
		Node n4;
		Object[] objects4 =  Constants.cola3P2.toArray();
		arrayCola3P2.addAll(Arrays.asList(objects4));
		for(int i = 0; i<arrayCola3P2.size();i++){
			n4 = (Node) arrayCola3P2.get(i);
			if (n4.getCountdown()<8){
				n4.setCountdown(n4.getCountdown()+1);
			}else{
				n4.setCountdown(0);
				Constants.cola3P2.remove(n4);
				Constants.cola2P2.add(n4);
				System.out.println("LO AGREGUE A LA OTRA COLA?? " + n4.getId());
			}
		}
	}
}
