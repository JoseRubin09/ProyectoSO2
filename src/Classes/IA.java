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
public class IA {
    
    public void decide(){
        Node n1;
        Node n2;
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;

        n1 = Constants.admin.checkFight1();
        n2 = Constants.admin.checkFight2();
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
            Constants.admin.backToEnd(n1);
            Constants.admin.backToEnd(n2);
        }else{
            //Refuerzo
            System.out.println("refuerzo");
            Constants.admin.setQueueRefuerzo(n1, n2);
        }
        
    }
    
    public void fight(Node n1, Node n2){
        
        int points1 = getPoints(n1);
        int points2 = getPoints(n2);
        if (points1 > points2){
            //FALTA AGREGAR AL GANADOR EN EL TXT
            //meterentxt(n1)
            Constants.interfaceFunct.Ganador1();
            Constants.admin.deadNode(n1);
            Constants.admin.deadNode(n2);
//            write.writeData(n1.getTipo());
            
        }else{
            //meterentxt(n2)
            Constants.admin.deadNode(n1);
            Constants.admin.deadNode(n2);
            Constants.interfaceFunct.Ganador2();
//            write.writeData(n2.getTipo());
        }
    }

	public int getPoints(Node n){
        
        int points = 0;
        points += getCharPoints(n.getChar1());
        points += getCharPoints(n.getChar2());
        points += getCharPoints(n.getChar3());
        points += getCharPoints(n.getChar4());
        points += getCharPoints(n.getChar5());
        points += getCharPoints(n.getChar6());
        return points;
    }
    
    public int getCharPoints(String char) {
        int num = 0;
        switch(char){
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
