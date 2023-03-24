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
public class Queue {

    public Node peek;
    public Node last;
	public Node save;
    public int size;

    public Queue() {
        this.peek = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return peek == null;
    }

    public void empty() {
        this.peek = null;
        this.last = null;
        this.size = 0;
    }

    public void add(Node nuevo) {
        if (isEmpty()) {
            last = peek = nuevo;
        } else {
            last.setNext(nuevo);
            last = nuevo;
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("No hay elementos para desenconlar.");
        } else if (size == 1) {
            empty();
        } else {
            peek = peek.getNext();
            size--;
        }
    }

	public Node peek() {
		return peek;
	}

	public Node poll() {
        if (size == 1) {
            save = peek;
			empty();
			return save;
        } else {
			save = peek;
            peek = peek.getNext();
            size--;
			return save;
        }
    }

	public Node checkNodes(int i){
		if(isEmpty()){
			System.out.println("No hay nada bro");
			return null;
		}else{
			int num=0;
			Node newNode = peek;
			while(i != num ){
				newNode = newNode.getNext();
				num++;
				System.out.println("bro entro pe");
			}
			return save;
		}
	}
	
	public String[] getList(){
        String[] output = new String[75];
        Node temp = this.peek;
        int i = 0;
        while (temp != null && i < 75){
            output[i] = temp.getId();
            temp = temp.getNext();
            i++;
        }
        return output;
    }

	public Object[] getListObject(){
        Object[] output = new String[75];
        Node temp = this.peek;
        int i = 0;
        while (temp != null && i < 75){
            output[i] = temp;
            temp = temp.getNext();
            i++;
        }
        return output;
    }

//	public void actualizarContador(Queue q){
//		if(isEmpty()){
//			System.out.println("ESTA fallando o q??");
//		}else{
//			while(peek.getNext() != null){
//				save = peek;
//				if(save.getCountdown()<8){
//					save.setCountdown(save.getCountdown()+1);
//				}else{
//					save.setCountdown(0);
//					remove();
//					q.add(save);
//					System.out.println("soy muy crack?");
//				}
//			}
//		}
//	}
	
	
}
