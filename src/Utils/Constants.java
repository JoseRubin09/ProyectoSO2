/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Classes.IA;
import Classes.Node;
import Classes.Queue;
import Classes.Serie;
import Classes.ThreadStart;
import Functionss.interfaceFunctions;
import Functionss.randomFunctions;

/**
 *
 * @author Kevin
 */
public class Constants {

    public static Serie serie1 = new Serie();
    public static Serie serie2 = new Serie();
    public static ThreadStart startEverything = new ThreadStart();
    public static IA IA = new IA();
    public static Node newNode;
    public static Queue cola1P1 = new Queue();      
    public static Queue cola2P1 = new Queue();
    public static Queue cola3P1 = new Queue();
    public static Queue cola1P2 = new Queue();
    public static Queue cola2P2 = new Queue();
    public static Queue cola3P2 = new Queue();
    public static Queue colaRefuerzoP1 = new Queue();
    public static Queue colaRefuerzoP2 = new Queue();
    public static int tiempodia;
    public static ReadFile txtAction = new ReadFile();
    public static WriteFile write = new WriteFile();
    public static ThreadStart threadStart;
    public static interfaceFunctions interfaceFunct = new interfaceFunctions();
    public static randomFunctions randomFunct = new randomFunctions();

}