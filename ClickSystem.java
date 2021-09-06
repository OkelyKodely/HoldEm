/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsystem;

import views.Logo;
import data.Card;
import singleton.Singleton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author d
 */
public class ClickSystem implements MouseMotionListener, MouseListener {

    ArrayList<Card> k = new ArrayList<>();

    public void deal() {
        Singleton.getInstance().stage = "The Flop";
        
        Singleton.getInstance().stack1.clear();
        Singleton.getInstance().stack2.clear();
        Singleton.getInstance().stack3.clear();
        Singleton.getInstance().stack4.clear();
        Singleton.getInstance().stack5.clear();
        
        Singleton.getInstance().st1.clear();
        Singleton.getInstance().st2.clear();
        
        ArrayList<Card> c = Singleton.getInstance().cas.crs;
        int count = 1;
        ArrayList<Card> controller = new ArrayList<>();
        for(int i=0; i<c.size(); i++) {
            controller = Singleton.getInstance().stack1;
            Card cd = c.get(i);
            Singleton.getInstance().stack1.add(cd);
            int x = 200+i*60 + i*10;
            int y = 600;
            cd.x = x;
            cd.y = y;
            cd.stackNeim = "stack1";
            count++;
            cd.drawCardAtLocation(cd.x, cd.y);
            c.remove(cd);
            if(count == 3)
                break;
        }
        count = 1;

        for(int i=0; i<c.size(); i++) {
            controller = Singleton.getInstance().stack2;
            Card cd = c.get(i);
            Singleton.getInstance().stack2.add(cd);
            int x = 200+1*60 + 10;
            if ( i== 0)
                x = -197 ;
            int y = 726;
            cd.x = x;
            cd.y = y;
            cd.stackNeim = "stack2";
            count++;
            cd.drawCardAtLocation(cd.x, cd.y);
            c.remove(cd);
            if(count == 3)
                break;
        }
        
        count = 1;

        for (int i = 0; i < c.size(); i++) {
            controller = Singleton.getInstance().stack3;
            Card cd = c.get(i);
            Singleton.getInstance().stack3.add(cd);
            int x = 450 + i * 60 + i*10;
            int y = 666;
            cd.x = x;
            cd.y = y;
            cd.stackNeim = "stack3";
            count++;
            cd.drawCardAtLocation(cd.x, cd.y);
            c.remove(cd);
            if (count == 4) {
                break;
            }
        }
        
    }
    
    public void mouseClicked(MouseEvent me) {
    }

    void initCards() {
 
        Singleton.getInstance().cas.cars.clear();
 
        int DECK_SIZE = 52;

        ArrayList<Integer> deck = new ArrayList<Integer>();

        for (int i = 0; i < DECK_SIZE; ++i) {
            deck.add(i);
        }
        
        int id = 0;
        ArrayList<Card> c = new ArrayList<Card>();
        for(int j=0; j<4; j++) {
            for(int i=0; i<13; i++) {
                Card cd = new Card();
                if(j == 0)
                    cd.suit = 1;
                else if(j == 1)
                    cd.suit = 2;
                else if(j == 2)
                    cd.suit = 3;
                else if(j == 3)
                    cd.suit = 4;
                cd.number = i+1;
                cd.id = id;
                Singleton.getInstance().cas.cars.add(cd);
                id++;
            }
        }

        Singleton.getInstance().cas.crs = new ArrayList<>();
        for(int i=0; i<24; i++) {
            Card cc = new Card();
            //cas.crs.add(cc);
        }
        
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();

        float a = new Random().nextFloat();
        while (deck.size() > 0) {
            int index = (int) (Math.random() * a * deck.size());
            int v = deck.remove(index);
            Card cc = Singleton.getInstance().cas.getCardByID(v);
            shuffledDeck.add(cc);
        } 
        Singleton.getInstance().cas.cars = shuffledDeck;
 
        //cas.crs.clear();

        for(int i=0; i<52; i++) {
            Singleton.getInstance().cas.crs.add(Singleton.getInstance().cas.cars.get(i));
        }
        
        for(int i=24; i<52; i++) {
            try {
                Singleton.getInstance().cas.cars.remove(Singleton.getInstance().cas.cars.get(i));
            } catch(Exception e) {
                
            }
        }
        
        
    }

    public void mousePressed(MouseEvent me) {
        int xx = 0;
        int yy = 0;

        xx = me.getX();
        yy = me.getY();
        
        if(xx > 900 && xx < 950 && yy > 510 && yy < 540 && !Singleton.getInstance().stage.equals("The River")) {

            ArrayList<Card> c = Singleton.getInstance().cas.crs;
            int count = 1;
            ArrayList<Card> controller = new ArrayList<>();

            controller = Singleton.getInstance().stack2;
            Card cd = c.get(0);
            Singleton.getInstance().stack3.add(cd);
            int x = 400+Singleton.getInstance().stack3.size()*70 + Singleton.getInstance().stack3.size()*20;
            int y = 666;
            cd.x = x;
            cd.y = y;
            cd.stackNeim = "stack";
            count++;
            cd.drawCardAtLocation(cd.x, cd.y);
            c.remove(cd);
            if(Singleton.getInstance().stage.equals("The Flop")) {
                Singleton.getInstance().stage = "The Turn";
            }
            else if(Singleton.getInstance().stage.equals("The Turn")) {
                Singleton.getInstance().stage = "The River";

               Singleton.getInstance().st1.clear();
               Singleton.getInstance().st2.clear();
               
                for(int i=0; i<Singleton.getInstance().stack1.size(); i++) {
                    Singleton.getInstance().stack4.add(Singleton.getInstance().stack1.get(i));
                }
       
                for(int i=0; i<Singleton.getInstance().stack3.size(); i++) {
                    Singleton.getInstance().stack4.add(Singleton.getInstance().stack3.get(i));
                }

                for(int i=0; i<Singleton.getInstance().stack2.size(); i++) {
                    Singleton.getInstance().stack5.add(Singleton.getInstance().stack2.get(i));
                }
            
                for(int i=0; i<Singleton.getInstance().stack3.size(); i++) {
                    Singleton.getInstance().stack5.add(Singleton.getInstance().stack3.get(i));
                }

                for(int i=0; i<Singleton.getInstance().stack5.size(); i++) {
                    Card ca = Singleton.getInstance().stack5.get(i);
                    int a = 0;
                    if(a==0){
                        Singleton.getInstance().st2.add(ca);
                        Singleton.getInstance().p0sc=1;
                        Singleton.getInstance().p0_sc=0;
                        if(ca.number > Singleton.getInstance().bb1 || ca.number == 1)
                            Singleton.getInstance().bb1 = ca.number;
                        if(Singleton.getInstance().bb1 == 1)
                            Singleton.getInstance().bb1 = 14;
                    }
                    if(a==0)
                        a = 1;
                    for(int j=i+1; j<Singleton.getInstance().stack5.size(); j++) {
                        if(ca.number == Singleton.getInstance().stack5.get(j).number) {
                            Singleton.getInstance().p0_sc++;

                            if(Singleton.getInstance().p0sc + Singleton.getInstance().p0_sc == 3) {
                                Singleton.getInstance().kind2 = "House: Three of a kind";
                            }
                            else if(Singleton.getInstance().p0sc + Singleton.getInstance().p0_sc == 4) {
                                Singleton.getInstance().kind2 = "House: Four of a kind";
                            }
                            else if(Singleton.getInstance().p0sc + Singleton.getInstance().p0_sc == 2) {
                                Singleton.getInstance().kind2 = "House: Two of a kind";
                                Singleton.getInstance().p0sc = -1;
                                Singleton.getInstance().p0_sc = -1;
                            }
                            else if(Singleton.getInstance().p0sc + Singleton.getInstance().p0_sc == 0 && Singleton.getInstance().kind2.equals("House: Two of a kind")) {
                                Singleton.getInstance().kind2 = "House: Two pair";
                                Singleton.getInstance().p0sc = 0;
                                Singleton.getInstance().p0_sc = 0;
                            }

                            Singleton.getInstance().st2.add(Singleton.getInstance().stack5.get(j));
                            Singleton.getInstance().stack5.remove(Singleton.getInstance().stack5.get(j));
                        }
                    }
                }

                for(int i=0; i<Singleton.getInstance().stack4.size(); i++) {
                    Card ca = Singleton.getInstance().stack4.get(i);
                    int a = 0;
                    if(a==0){
                        Singleton.getInstance().st1.add(ca);
                        Singleton.getInstance().t0sc=1;
                        Singleton.getInstance().t0_sc=0;
                        if(ca.number > Singleton.getInstance().aa1 || ca.number == 1)
                            Singleton.getInstance().aa1 = ca.number;
                        if(Singleton.getInstance().aa1 == 1)
                            Singleton.getInstance().aa1 = 14;
                    }
                    if(a==0)
                        a = 1;
                    for(int j=i+1; j<Singleton.getInstance().stack4.size()&&i!=j; j++) {
                        if(ca.number == Singleton.getInstance().stack4.get(j).number) {
                            Singleton.getInstance().t0_sc++;

                            if(Singleton.getInstance().t0sc + Singleton.getInstance().t0_sc == 3) {
                                Singleton.getInstance().kind1 = "Player: Three of a kind";
                            }
                            else if(Singleton.getInstance().t0sc + Singleton.getInstance().t0_sc == 4) {
                                Singleton.getInstance().kind1 = "Player: Four of a kind";
                            }
                            else if(Singleton.getInstance().t0sc + Singleton.getInstance().t0_sc == 2) {
                                Singleton.getInstance().kind1 = "Player: Two of a kind";
                                Singleton.getInstance().t0sc = -1;
                                Singleton.getInstance().t0_sc = -1;
                            }
                            else if(Singleton.getInstance().t0sc + Singleton.getInstance().t0_sc == 0 && Singleton.getInstance().kind1.equals("House: Two of a kind")) {
                                Singleton.getInstance().kind1 = "Player: Two pair";
                                Singleton.getInstance().t0sc = 0;
                                Singleton.getInstance().t0_sc = 0;
                            }
                            Singleton.getInstance().st1.add(Singleton.getInstance().stack4.get(j));
                            Singleton.getInstance().stack4.remove(Singleton.getInstance().stack4.get(j));
                        }
                    }
                }

                boolean winner = false;
                
                if(Singleton.getInstance().kind1.contains("Two of a")) {
                    if(!Singleton.getInstance().kind2.contains("Two of a") &&
                            Singleton.getInstance().kind2.length() > 0 &&
                            Singleton.getInstance().kind2.contains("House:")) {
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "House won");
                        Singleton.getInstance().dollars -= 0.25;
                    } else if(Singleton.getInstance().kind2.contains("Four of a") &&
                            Singleton.getInstance().kind2.length() > 0 &&
                            Singleton.getInstance().kind2.contains("House:")) {
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "House won");
                        Singleton.getInstance().dollars -= 0.25;
                    } else if(Singleton.getInstance().kind2.length() == 0) {
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "You won");
                        Singleton.getInstance().dollars += 0.25;
                    }
                }
                ///moot
                else if(Singleton.getInstance().kind1.contains("Three of a kind")) {
                    if(!Singleton.getInstance().kind2.contains("Two of a") &&
                            Singleton.getInstance().kind2.length() > 0 &&
                            Singleton.getInstance().kind2.contains("House:")) {
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "House won");
                        Singleton.getInstance().dollars -= 0.25;
                    } else if(Singleton.getInstance().kind2.contains("Three of a") &&
                            Singleton.getInstance().kind2.length() > 0 &&
                            Singleton.getInstance().kind2.contains("House:")) {
                        ///Singleton.getInstance().dollars += 0.25;
                        winner = true;
                    }
                }          
                else if(Singleton.getInstance().kind1.contains("Four of a ") ) {
                    if(!Singleton.getInstance().kind2.contains("Four") &&
                            Singleton.getInstance().kind2.length() > 0 &&
                            Singleton.getInstance().kind2.contains("House:")) {
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "You won");
                        Singleton.getInstance().dollars += 0.25;
                    //moot
                    } else if(Singleton.getInstance().kind2.contains("Four of a") &&
                            Singleton.getInstance().kind2.length() > 0 &&
                            Singleton.getInstance().kind2.contains("House:")) {
                        //Singleton.getInstance().dollars += 0.25;
                        winner = true;
                    }
                }
                
                if(winner) {
                    if(Singleton.getInstance().aa1 > Singleton.getInstance().bb1) {
                        Singleton.getInstance().dollars += 0.25;
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "House won");

                    } else if(Singleton.getInstance().aa1 < Singleton.getInstance().bb1) {
                        Singleton.getInstance().dollars -= 0.25;
                        javax.swing.JOptionPane.showMessageDialog(Singleton.getInstance().jframe, "You won.");

                    }
                }
            }
        }
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mouseMoved(MouseEvent me) {
    }

    public void drawStackCards() {
        final int x = 210;
        final int y = 726;
         Singleton.getInstance().gr.setColor(Color.blue);
        Singleton.getInstance().gr.fillRect(x, y, 60, 120);
        Singleton.getInstance().gr.setColor(Color.blue);
        Singleton.getInstance().gr.fillRect(x+70, y, 60, 120);
        Singleton.getInstance().gr.setColor(Color.RED);
        Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 12));
        Singleton.getInstance().gr.drawString("HOUSE:", 150, 756);
        Singleton.getInstance().gr.setColor(Color.RED);
        Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 12));
        Singleton.getInstance().gr.drawString("YOU:", 150, 666);
        Singleton.getInstance().gr.setColor(Color.RED);

        Singleton.getInstance().cost1 = 0;
        Singleton.getInstance().cost2 = 0;
        int did =0;
        for(int ii=0; ii<Singleton.getInstance().stack1.size(); ii++) {
            Singleton.getInstance().cost2 = Singleton.getInstance().cost1;
            Singleton.getInstance().cost1 += Singleton.getInstance().stack1.get(ii).number;
            if(Singleton.getInstance().stack1.get(ii).number == 11)
                Singleton.getInstance().cost1 -= 1;
            if(Singleton.getInstance().stack1.get(ii).number == 12)
                Singleton.getInstance().cost1 -= 2;
            if(Singleton.getInstance().stack1.get(ii).number == 13)
                Singleton.getInstance().cost1 -= 3;
            if(Singleton.getInstance().stack1.get(ii).number == 1){
                Singleton.getInstance().cost2 += 11;
                did =1;
            }
            Singleton.getInstance().stack1.get(ii).drawCardAtLocation(Singleton.getInstance().stack1.get(ii).x, Singleton.getInstance().stack1.get(ii).y);
        }

        Singleton.getInstance().cost3 = 0;
        Singleton.getInstance().cost4 = 0;
        int did2 = 0;
        for(int ii=0; ii<Singleton.getInstance().stack2.size(); ii++) {
            Singleton.getInstance().cost4 = Singleton.getInstance().cost3;
            Singleton.getInstance().cost3 += Singleton.getInstance().stack2.get(ii).number;
            if(Singleton.getInstance().stack2.get(ii).number == 11)
                Singleton.getInstance().cost3 -= 1;
            if(Singleton.getInstance().stack2.get(ii).number == 12)
                Singleton.getInstance().cost3 -= 2;
            if(Singleton.getInstance().stack2.get(ii).number == 13)
                Singleton.getInstance().cost3 -= 3;
            if(Singleton.getInstance().stack2.get(ii).number == 1){
                Singleton.getInstance().cost3 += 11;
                did2 = 1;
            }
        }

        for(int ii=0; ii<Singleton.getInstance().stack3.size(); ii++) {
            Singleton.getInstance().stack3.get(ii).drawCardAtLocation(Singleton.getInstance().stack3.get(ii).x, Singleton.getInstance().stack3.get(ii).y);
        }

        int _x = 180, _y = 50;
        int _x2 = 180, _y2 = 250;
        System.out.println("st1: " + Singleton.getInstance().st1.size());
        Singleton.getInstance().jframe.setTitle("Money: $" + Singleton.getInstance().dollars + ", " + Singleton.getInstance().kind1 + " and High Card: " + Singleton.getInstance().aa1 + ", " + Singleton.getInstance().kind2 + " and High Card: " + Singleton.getInstance().bb1);
        for(int ii=0; ii<Singleton.getInstance().st1.size(); ii++) {
            Singleton.getInstance().st1.get(ii).drawCardAtLocation(_x, _y);
            _x += 70;
        }

        System.out.println("st2: " + Singleton.getInstance().st2.size());
        for(int ii=0; ii<Singleton.getInstance().st2.size(); ii++) {
            Singleton.getInstance().st2.get(ii).drawCardAtLocation(_x2, _y2);
            _x2 += 70;
        }
        
    }

    public void mouseDragged(MouseEvent me) {
    }

    public ClickSystem() {
        this.k = new ArrayList<>();
        Singleton.getInstance().k = k;
    
    }
}    
