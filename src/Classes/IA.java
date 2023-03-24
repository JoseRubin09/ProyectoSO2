/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.Interfaz;
import Utils.Constants;
import static Utils.Constants.write;
import java.util.Random;

/**
 *
 * @author Jose Rubin
 */
public class IA {
    
    public void decide(){
        Node n1;
        Node n2;
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;

        n1 = main.admin.checkFight1();
        n2 = main.admin.checkFight2();
        System.out.println("IA DECIDIENDO");
        
        //CONTADOR A 0
        n1.setCountdown(0);
        n2.setCountdown(0);
        //CONTADOR A 0

        if(numRandom <= 40){
            //FIGHTO
            Constants.interfaceFunct.ResetDetallesBatalla(n1, n2);
            System.out.println("pelearon");
            fight(n1,n2);

        }else if(numRandom > 40 && numRandom <= 67){
            //DRAW -> byebye
            System.out.println("empate");
            main.admin.backToEnd(n1);
            main.admin.backToEnd(n2);
        }else{
            //Refuerzo
            System.out.println("refuerzo");
            main.admin.setQueueRefuerzo(n1, n2);
        }
        
    }
    
    public void fight(Node n1, Node n2){
        
        int points1 = getPoints(n1);
        int points2 = getPoints(n2);
        if (points1 > points2){
            //FALTA AGREGAR AL GANADOR EN EL TXT
            //meterentxt(n1)
            Constants.interfaceFunct.Ganador1();
			String photo = n1.getPhoto(n1.getChar3());
			Interfaz.foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/"+photo)));
            main.admin.deadNode(n1);
            main.admin.deadNode(n2);
			String estudio = Integer.toString(n1.getEstudio());
            write.writeData(estudio);
            
        }else{
            //meterentxt(n2)
            main.admin.deadNode(n1);
            main.admin.deadNode(n2);
            Constants.interfaceFunct.Ganador2();
			String photo = n2.getPhoto(n2.getChar1());
			Interfaz.foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/"+photo)));
			String estudio = Integer.toString(n2.getEstudio());
            write.writeData(estudio);
//            write.writeData(n2.getTipo());
        }
    }

	public int getPoints(Node n){
        int points = 0;
        points += getCharPoints(n.getChar1());
        points += getCharPoints(n.getChar2());
        points += getCharPoints(n.getChar3());
        points += getCharPoints(n.getChar4());
        return points;
    }
    
    public int getCharPoints(String something) {
		int num = 0;
        switch(something){
            case "poppybutthole":
                num = 1;
                break;
            case "MortySmith":
                num = 2;
                break;
            case "RickSanchez":
                num = 3;
                break;
            case "EvilMorty":
                num = 4;
                break;
            case "RickPrime":
                num = 5;
                break;
            case "SuperNova":
                num = 6;
                break;
        }
        return num;
    }
    
}
