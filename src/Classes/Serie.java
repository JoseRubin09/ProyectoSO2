/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class Serie {
	String id; 
    int tiempo;
    int estudio;
    int countdown;
    String tipo;
    String char1;
    String char2;
    String char3;
    String char4;
	String char5;
	String char6;
    int idserie = 0;

	public String getNewId(){
		id = Integer.toString(idserie);
		idserie++;
		return id;
	}

	private int getPriority(int estudio){
		int numRandom;
		Random random = new Random();
		tiempo = 0;
		if (estudio == 1){
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 80) tiempo+=30;
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 75) tiempo+=30;
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 84) tiempo+=30;
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 85) tiempo+=30;
            
        }else{
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 80) tiempo+=30;
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 75) tiempo+=30;
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 84) tiempo+=30;
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 85) tiempo+=30;
        }
        return tiempo;
	}

	public void shuffleChar(){
		for (int i=1;i<6;i++){
			String [] arr={"EvilMorty", "poppybutthole", "RickPrime", "SuperNova","MortySmith","RickSanchez"};
			Random random = new Random();
            // randomly selects an index from the arr
            int select = random.nextInt(arr.length); 
            switch (String.valueOf(i)){
                case "1":
                    char1 = arr[select];
                    break;
                case "2":
                    char2 = arr[select];
                    break;
                case "3":
                    char3 = arr[select];
                    break;
                case "4":
                    char4 = arr[select];
                    break;
				case "5":
                    char5 = arr[select];
                    break;
				case "6":
					char6 = arr[select];
					break;
            }
	}
	}
}