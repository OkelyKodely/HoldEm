import eventsystem.ClickSystem;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import data.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import singleton.Singleton;
import views.Logo;

// Author - Daniel Cho
// www.github.com/okelykodely

public class TexasHoldEm {

    int dollars=500;
    
    boolean instruct = false;

    Singleton singleton;
    ArrayList<Card> ka = new ArrayList<>();
    boolean play = true;
    
    Cards cas = new Cards();
    ArrayList<Card> shuffledDeck;
    ArrayList<Card> cards = new ArrayList<>();
    
    JFrame jframe = new JFrame("SHREK EM");
    JPanel jpanel = new JPanel();
    
    Graphics gr;

    ArrayList<Card> stack1 = new ArrayList<>();
    ArrayList<Card> stack2 = new ArrayList<>();
    ArrayList<Card> stack3 = new ArrayList<>();
    ArrayList<Card> stack4 = new ArrayList<>();
    ArrayList<Card> stack5 = new ArrayList<>();

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

    void initCards() {
 
        cas = new Cards();
        cas.cars = new ArrayList<>();
        
        Singleton.getInstance().cas = cas;
        Singleton.getInstance().cas.cars = cas.cars;
 
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
    
    public TexasHoldEm() {

        singleton = Singleton.getInstance();
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);
        
        jframe.setBounds(0, 0, 1370, 900);
        jpanel.setBounds(0, 0, 1370, 900);
        
        jpanel.setBackground(Color.yellow);
        
        jframe.add(jpanel);
        jframe.setVisible(true);
        gr = jpanel.getGraphics();
        singleton.gr = gr;

        initCards();

        startGameplay();        
    }
    
    void startGameplay() {

        Singleton.getInstance().jframe = jframe;
        Singleton.getInstance().ka = ka;
        Singleton.getInstance().cas = cas;
        Singleton.getInstance().stack1 = stack1;
        Singleton.getInstance().stack2 = stack2;
        Singleton.getInstance().stack3 = stack3;
        Singleton.getInstance().stack4 = stack4;
        Singleton.getInstance().stack5 = stack5;
        
        ClickSystem cs = new ClickSystem();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        cs.drawStackCards();
                        cas.draw_All_TopOfStack();   
                        Thread.sleep(20);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        a.start();
        //jframe.addMouseMotionListener(cs);
        jframe.addMouseListener(cs);
        Thread t = new Thread() {
            public void run() {
                while(true) {
                    try {
                        ImageIcon i = new ImageIcon(getClass().getResource("loading-bar.gif"));
                        gr.drawImage(i.getImage(), 0, 0, 1300, 900, null);
                        Thread.sleep(10);
                        if(!play) {
                            gr.setColor(new Color(123, 191, 81));
                            gr.fillRect(0, 0, 1370, 900);
                            Singleton.getInstance().gr.setColor(new Color(23, 191, 11));
                            Singleton.getInstance().gr.fillRect(0, 600, 1370, 300);
                            ImageIcon ia = new ImageIcon(getClass().getResource("gradient.gif"));
                            gr.drawImage(ia.getImage(), 600, 600, 650, 300, null);
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                    if(!play) {
                        return;
                    }
                }
            }
        };
        t.start();
        Thread B = new Thread() {
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(10);
                        ImageIcon ii = new ImageIcon(this.getClass().getResource("dealbtn.gif"));
                        Image howtobtn = ii.getImage();
                        if(!play)
                            gr.drawImage(howtobtn, 50, 350, 134, 160, null);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        B.start();
        Thread q = new Thread() {
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(10);
                        ImageIcon ii = new ImageIcon(this.getClass().getResource("howtobtn.gif"));
                        Image howtobtn = ii.getImage();
                        if(!play)
                            gr.drawImage(howtobtn, 50, 270, 134, 60, null);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        q.start();
        jframe.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if(me.getX() > 50 && me.getX() < 184 &&
                        me.getY() > 350 && me.getY() < 510) {
                    Singleton.getInstance().cost1 = 0;
                    Singleton.getInstance().cost2 = 0;
                    Singleton.getInstance().cost3 = 0;
                    Singleton.getInstance().cost4 = 0;
                    Singleton.getInstance().stack1.clear();
                    Singleton.getInstance().stack2.clear();
                    gr.setColor(new Color(123, 191, 81));
                    gr.fillRect(0, 0, 1370, 900);
                    Singleton.getInstance().cas.cars.clear();
                    initCards();
                    gr.setColor(new Color(123, 191, 81));
                    gr.fillRect(0, 0, 1370, 900);
                    deal();
                    cs.drawStackCards();
                    play = false;
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        jframe.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if(me.getX() > 50 && me.getX() < 184 &&
                        me.getY() > 270 && me.getY() < 330) {
                    instruct = !instruct;
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        Thread title = new Thread() {
            public void run() {
                while(true) {
                    jframe.setTitle("Money: $" + Singleton.getInstance().dollars /100.00);
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {}
                }
            }
        };
        title.start();
        Thread tt = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(!play) {
                        ImageIcon ia2 = new ImageIcon(getClass().getResource("fallingcardsbg.gif"));
                        Singleton.getInstance().gr.drawImage(ia2.getImage(), 0, 0, 1370, 600, null);
                        Logo logo = new Logo();
                        logo.drawLogoMiddle();
                    }
                    try {
                        Thread.sleep(16);
                    } catch(Exception e) {}
                }
            }
        });
        tt.start();
        Thread thr = new Thread() {
            public void run() {
                while(true) {
                    try {
                        if(play) {
                            gr.setColor(new Color(123, 191, 81));
                            gr.fillRect(0, 0, 1370, 900);
                            initCards();
                            gr.setColor(new Color(123, 191, 81));
                            gr.fillRect(0, 0, 1370, 900);
                            deal();
                            gr.setColor(new Color(123, 191, 81));
                            gr.fillRect(0, 0, 1370, 900);
                            play = false;
                        }
                        cs.drawStackCards();
                        Thread.sleep(1200);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thr.start();
    }
    
    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    TexasHoldEm sl = new TexasHoldEm();
                }
            });
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}