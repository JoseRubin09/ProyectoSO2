/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Utils.Constants;
import java.util.Random;

/**
 *
 * @author Jose Rubin
 */
public class Admin {
	Node serie11;
	Node serie22;

	public Node checkFight1(){
		//No se si esto funcione pq castie esta broma a Node xd
        if(!Constants.cola1P1.isEmpty()){
            serie11 = Constants.cola1P1.peek();
            serie11.setCola(11);
        }else if (!Constants.cola2P1.isEmpty()){
            serie11 = Constants.cola2P1.peek();
            serie11.setCola(21);
        }else if (!Constants.cola3P1.isEmpty()){
            serie11 = Constants.cola3P1.peek();
            serie11.setCola(31);
        }
        return serie11;
    }

	public Node checkFight2(){
        if(!Constants.cola1P2.isEmpty()){
            serie22 = Constants.cola1P2.peek();
            serie22.setCola(12);
        }else if (!Constants.cola2P2.isEmpty()){
            serie22 = Constants.cola2P2.peek();
            serie22.setCola(22);
        }else if (!Constants.cola3P2.isEmpty()){
            serie22 = Constants.cola3P2.peek();
            serie22.setCola(32);
        }

        return serie22;
    }

	public void asignarQueue(Node n){
        if (n.getEstudio() == 1){
            if(n.getTiempo() >= 90){
                Constants.cola1P1.add(n);
            } else if(n.getTiempo() >= 60){
                Constants.cola2P1.add(n);
            } else if(n.getTiempo() < 60){
                Constants.cola3P1.add(n);
            }
        }else{
            if(n.getTiempo() >= 90){
                Constants.cola1P2.add(n);
            } else if(n.getTiempo() >= 60){
                Constants.cola2P2.add(n);
            } else if(n.getTiempo() < 60){
                Constants.cola3P2.add(n);
            }
        }
    }

	public void createSerie(){
		System.out.println("createSerie");
        asignarQueue(Constants.serie1.settingNode(1));
        asignarQueue(Constants.serie1.settingNode(2));
        Constants.interfaceFunct.resetTextPanes();
    }

    public void createTelefRandom(){
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;
        if (numRandom <= 70){
           asignarQueue(Constants.serie1.settingNode(1));
           asignarQueue(Constants.serie1.settingNode(2)); 
        }
    }

	public void setQueueRefuerzo(Node n1, Node n2){
        switch (n1.getCola()) {
            case 11:
                Constants.cola1P1.remove();
                Constants.colaRefuerzoP1.add(n1);
                break;
            case 21:
                Constants.cola2P1.remove();
                Constants.colaRefuerzoP1.add(n1);
                break;
            case 31:
                Constants.cola3P1.remove();
                Constants.colaRefuerzoP1.add(n1);
                break;
            default:
                break;
        }
        
        switch (n2.getCola()) {
            case 12:
                Constants.cola1P2.remove();
                Constants.colaRefuerzoP2.add(n2);
                break;
            case 22:
                Constants.cola2P2.remove();
                Constants.colaRefuerzoP2.add(n2);
                break;
            case 32:
                Constants.cola3P2.remove();
                Constants.colaRefuerzoP2.add(n2);
                break;
            default:
                break;
        }
    }

	public void backToQueue(){
        if (!Constants.colaRefuerzoP1.isEmpty()) {
        Node n;
        Node n2;
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;
        if(numRandom <= 40){
            n = Constants.colaRefuerzoP1.poll();
            asignarQueue(n);
            
            n2 = Constants.colaRefuerzoP2.poll();
            asignarQueue(n2);
        }
        }
    }
    
    public void backToEnd(Node n){
        
            switch (n.getCola()) {
            case 11:
                Constants.cola1P1.add(Constants.cola1P1.poll());
                break;
            case 21:
                Constants.cola2P1.add(Constants.cola2P1.poll());
                break;
            case 31:
                Constants.cola3P1.add(Constants.cola3P1.poll());
               break;
            case 12:
                Constants.cola1P2.add(Constants.cola1P2.poll());
                break;
            case 22:
                Constants.cola2P2.add(Constants.cola2P2.poll());
                break;
            case 32:
                Constants.cola3P2.add(Constants.cola3P2.poll());
                break;
            default:
                break;
        }
    }      
    
    public void deadNode(Node n){
            switch (n.getCola()) {
            case 11:
                Constants.cola1P1.remove();
                break;
            case 21:
                Constants.cola2P1.remove();
                break;
            case 31:
                Constants.cola3P1.remove();
                break;
            case 12:
                Constants.cola1P2.remove();
                break;
            case 22:
                Constants.cola2P2.remove();
                break;
            case 32:
                Constants.cola3P2.remove();
                break;
            default:
                break;
        }
    }
}
