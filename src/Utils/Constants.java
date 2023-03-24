/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Classes.IA;
import Classes.Node;
import Classes.Serie;
import Classes.ThreadStart;
import Functionss.interfaceFunctions;
import java.util.LinkedList;

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
    public static java.util.Queue<Node> cola1P1 = new LinkedList<>();
    public static java.util.Queue<Node> cola2P1 = new LinkedList<>();
    public static java.util.Queue<Node> cola3P1 = new LinkedList<>();
    public static java.util.Queue<Node> cola1P2 = new LinkedList<>();
    public static java.util.Queue<Node> cola2P2 = new LinkedList<>();
    public static java.util.Queue<Node> cola3P2 = new LinkedList<>();
    public static java.util.Queue<Node> colaRefuerzoP1 = new LinkedList<>();
    public static java.util.Queue<Node> colaRefuerzoP2 = new LinkedList<>();
    public static int tiempodia;
    public static ReadFile txtAction = new ReadFile();
    public static WriteFile write = new WriteFile();
    public static ThreadStart threadStart;
    public static interfaceFunctions interfaceFunct = new interfaceFunctions();

}