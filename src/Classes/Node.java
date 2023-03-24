/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Kevin
 */
public class Node {

	private String id; 
    private int tiempo;
    private int estudio;
    private int countdown;
    private int cola;
    private String tipo;
    private String char1;
    private String char2;
    private String char3;
    private String char4;
    private String char5;
    private String char6;
	
    private Node next;
    
    public Node(String id,int tiempo,int estudio,int countdown,String tipo, String char1,String char2,String char3,String char4, String char5, String char6) {
    this.id = id;
    this.tiempo = tiempo;
    this.estudio = estudio;
    this.countdown = 0;
    this.char1 = char1;
    this.char2 = char2;
    this.char3 = char3;
    this.char4 = char4;
	this.char5 = char5;
	this.char6 = char6;
    }

    public Node() {
        this.next = null;
        
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}

	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	/**
	 * @return the estudio
	 */
	public int getEstudio() {
		return estudio;
	}

	/**
	 * @param estudio the estudio to set
	 */
	public void setEstudio(int estudio) {
		this.estudio = estudio;
	}

	/**
	 * @return the countdown
	 */
	public int getCountdown() {
		return countdown;
	}

	/**
	 * @param countdown the countdown to set
	 */
	public void setCountdown(int countdown) {
		this.countdown = countdown;
	}

	/**
	 * @return the cola
	 */
	public int getCola() {
		return cola;
	}

	/**
	 * @param cola the cola to set
	 */
	public void setCola(int cola) {
		this.cola = cola;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		if (this.getEstudio() == 1){
            if(this.getTiempo() >= 90){
                return " Alta Calidad ";
            } else if(this.getTiempo() >= 60){
                return " Calidad Media";
            } else if(this.getTiempo() < 60){
                return " Capitulo Cortico";
            }
        }else{
            if(this.getTiempo() >= 90){
                return " Alta Calidad ";
            } else if(this.getTiempo() >= 60){
                return " Calidad Media";
            } else if(this.getTiempo() < 60){
                return " Capitulo Cortico";
            }
        }
		return "null";
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the char1
	 */
	public String getChar1() {
		return char1;
	}

	/**
	 * @param char1 the char1 to set
	 */
	public void setChar1(String char1) {
		this.char1 = char1;
	}

	/**
	 * @return the char2
	 */
	public String getChar2(){
		return char2;
	}

	/**
	 * @param char2 the char2 to set
	 */
	public void setChar2(String char2) {
		this.char2 = char2;
	}

	/**
	 * @return the char3
	 */
	public String getChar3() {
		return char3;
	}

	/**
	 * @param char3 the char3 to set
	 */
	public void setChar3(String char3) {
		this.char3 = char3;
	}

	/**
	 * @return the char4
	 */
	public String getChar4() {
		return char4;
	}

	/**
	 * @param char4 the char4 to set
	 */
	public void setChar4(String char4) {
		this.char4 = char4;
	}

	/**
	 * @return the char5
	 */
	public String getChar5() {
		return char5;
	}

	/**
	 * @param char5 the char5 to set
	 */
	public void setChar5(String char5) {
		this.char5 = char5;
	}

	/**
	 * @return the char6
	 */
	public String getChar6() {
		return char6;
	}

	/**
	 * @param char6 the char6 to set
	 */
	public void setChar6(String char6) {
		this.char6 = char6;
	}

	public String getPhoto(String i) {
            // randomly selects an index from the arr
			String siu = new String();
            switch (i){
                case "EvilMorty":
                    siu = "evil_morty.png";
                    break;
                case "poppybutthole":
                    siu = "mr_poopybutthole.jpg";
                    break;
                case "RickPrime":
                    siu = "rick_prime.png";
                    break;
                case "SuperNova":
                    siu = "supernova.jpg";
                    break;
				case "MortySmith":
                    siu = "morty_smith.jpg";
                    break;
				case "RickSanchez":
					siu = "rick_sanchez.jpg";
					break;
            }
			return siu;
	}
}