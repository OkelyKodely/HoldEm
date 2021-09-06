/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import data.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author d
 */
public class Singleton {
    public int p0sc = 0;
    public int p0_sc = 0;
    public int t0sc = 0;
    public int t0_sc = 0;
    public String kind1 = "_";
    public String kind2 = "=";
    public int a1 = 0;
    public int a2 = 0;
    public int a3 = 0;
    public int a4 = 0;
    public int b1 = 0;
    public int b2 = 0;
    public int b3 = 0;
    public int b4 = 0;
    public int aa1 = 0;
    public int bb1 = 0;
    public String stage = "The Flop";
    public int wins;
    public int losses;
    public JFrame jframe;
    public long dollars = 500;
    public boolean reached = false;
    public int cost1 = 0;
    public int cost2 = 0;
    public int cost3 = 0;
    public int cost4 = 0;
    public MouseEvent themouseevent;
    public String yeoyaee = "";
    public Graphics gr;
    public String st;
    public ArrayList<Card> stack1;
    public ArrayList<Card> stack2;
    public ArrayList<Card> stack3;
    public ArrayList<Card> stack4;
    public ArrayList<Card> stack5;
    public ArrayList<Card> st1 = new ArrayList<>();
    public ArrayList<Card> st2 = new ArrayList<>();
    public ArrayList<Card> ka;
    public ArrayList<Card> k;
    public Cards cas;
    public int rt;
    static Singleton singleton;
    private Singleton() {}
    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
