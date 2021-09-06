/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author d
 */
public class Card {
    public int id;
    public int x;
    public int y;
    public int suit;
    public int number;
    public String stackNeim = "steckstner1";

    Image back;

    Image image1_1;
    Image image2_1;
    Image image3_1;
    Image image4_1;

    Image image1_2;
    Image image2_2;
    Image image3_2;
    Image image4_2;

    Image image1_3;
    Image image2_3;
    Image image3_3;
    Image image4_3;

    Image image1_4;
    Image image2_4;
    Image image3_4;
    Image image4_4;

    Image image1_5;
    Image image2_5;
    Image image3_5;
    Image image4_5;

    Image image1_6;
    Image image2_6;
    Image image3_6;
    Image image4_6;

    Image image1_7;
    Image image2_7;
    Image image3_7;
    Image image4_7;

    Image image1_8;
    Image image2_8;
    Image image3_8;
    Image image4_8;

    Image image1_9;
    Image image2_9;
    Image image3_9;
    Image image4_9;

    Image image1_10;
    Image image2_10;
    Image image3_10;
    Image image4_10;

    Image image1_11;
    Image image2_11;
    Image image3_11;
    Image image4_11;

    Image image1_12;
    Image image2_12;
    Image image3_12;
    Image image4_12;

    Image image1_13;
    Image image2_13;
    Image image3_13;
    Image image4_13;

    Graphics gr;
    
    public Card() {
        gr = singleton.Singleton.getInstance().gr;
        try {
            //back = ImageIO.read(this.getClass().getResource("../back.jpg"));

            image1_1 = ImageIO.read(this.getClass().getResource("../1-1.png"));
            image2_1 = ImageIO.read(this.getClass().getResource("../2-1.png"));
            image3_1 = ImageIO.read(this.getClass().getResource("../3-1.png"));
            image4_1 = ImageIO.read(this.getClass().getResource("../4-1.png"));

            image1_2 = ImageIO.read(this.getClass().getResource("../1-2.png"));
            image2_2 = ImageIO.read(this.getClass().getResource("../2-2.png"));
            image3_2 = ImageIO.read(this.getClass().getResource("../3-2.png"));
            image4_2 = ImageIO.read(this.getClass().getResource("../4-2.png"));

            image1_3 = ImageIO.read(this.getClass().getResource("../1-3.png"));
            image2_3 = ImageIO.read(this.getClass().getResource("../2-3.png"));
            image3_3 = ImageIO.read(this.getClass().getResource("../3-3.png"));
            image4_3 = ImageIO.read(this.getClass().getResource("../4-3.png"));

            image1_4 = ImageIO.read(this.getClass().getResource("../1-4.png"));
            image2_4 = ImageIO.read(this.getClass().getResource("../2-4.png"));
            image3_4 = ImageIO.read(this.getClass().getResource("../3-4.png"));
            image4_4 = ImageIO.read(this.getClass().getResource("../4-4.png"));

            image1_5 = ImageIO.read(this.getClass().getResource("../1-5.png"));
            image2_5 = ImageIO.read(this.getClass().getResource("../2-5.png"));
            image3_5 = ImageIO.read(this.getClass().getResource("../3-5.png"));
            image4_5 = ImageIO.read(this.getClass().getResource("../4-5.png"));

            image1_6 = ImageIO.read(this.getClass().getResource("../1-6.png"));
            image2_6 = ImageIO.read(this.getClass().getResource("../2-6.png"));
            image3_6 = ImageIO.read(this.getClass().getResource("../3-6.png"));
            image4_6 = ImageIO.read(this.getClass().getResource("../4-6.png"));

            image1_7 = ImageIO.read(this.getClass().getResource("../1-7.png"));
            image2_7 = ImageIO.read(this.getClass().getResource("../2-7.png"));
            image3_7 = ImageIO.read(this.getClass().getResource("../3-7.png"));
            image4_7 = ImageIO.read(this.getClass().getResource("../4-7.png"));

            image1_8 = ImageIO.read(this.getClass().getResource("../1-8.png"));
            image2_8 = ImageIO.read(this.getClass().getResource("../2-8.png"));
            image3_8 = ImageIO.read(this.getClass().getResource("../3-8.png"));
            image4_8 = ImageIO.read(this.getClass().getResource("../4-8.png"));

            image1_9 = ImageIO.read(this.getClass().getResource("../1-9.png"));
            image2_9 = ImageIO.read(this.getClass().getResource("../2-9.png"));
            image3_9 = ImageIO.read(this.getClass().getResource("../3-9.png"));
            image4_9 = ImageIO.read(this.getClass().getResource("../4-9.png"));

            image1_10 = ImageIO.read(this.getClass().getResource("../1-10.png"));
            image2_10 = ImageIO.read(this.getClass().getResource("../2-10.png"));
            image3_10 = ImageIO.read(this.getClass().getResource("../3-10.png"));
            image4_10 = ImageIO.read(this.getClass().getResource("../4-10.png"));

            image1_11 = ImageIO.read(this.getClass().getResource("../1-11.png"));
            image2_11 = ImageIO.read(this.getClass().getResource("../2-11.png"));
            image3_11 = ImageIO.read(this.getClass().getResource("../3-11.png"));
            image4_11 = ImageIO.read(this.getClass().getResource("../4-11.png"));

            image1_12 = ImageIO.read(this.getClass().getResource("../1-12.png"));
            image2_12 = ImageIO.read(this.getClass().getResource("../2-12.png"));
            image3_12 = ImageIO.read(this.getClass().getResource("../3-12.png"));
            image4_12 = ImageIO.read(this.getClass().getResource("../4-12.png"));

            image1_13 = ImageIO.read(this.getClass().getResource("../1-13.png"));
            image2_13 = ImageIO.read(this.getClass().getResource("../2-13.png"));
            image3_13 = ImageIO.read(this.getClass().getResource("../3-13.png"));
            image4_13 = ImageIO.read(this.getClass().getResource("../4-13.png"));
        } catch(Exception e) {}
    }
    public void drawTopOfStack() {
        gr.drawImage(back, 100, 670, 60, 90, null);
    }

    public void drawCardAtLocationDealer(int x, int  y) {
    }

    public void drawCardAtLocation(int x, int  y) {
        switch(number) {
            case 1:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_1, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_1, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_1, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_1, x, y, 60, 120, null);
                        break;
                }
                break;
            case 2:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_2, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_2, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_2, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_2, x, y, 60, 120, null);
                        break;
                }
                break;
            case 3:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_3, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_3, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_3, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_3, x, y, 60, 120, null);
                        break;
                }
                break;
            case 4:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_4, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_4, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_4, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_4, x, y, 60, 120, null);
                        break;
                }
                break;
            case 5:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_5, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_5, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_5, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_5, x, y, 60, 120, null);
                        break;
                }
                break;
            case 6:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_6, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_6, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_6, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_6, x, y, 60, 120, null);
                        break;
                }
                break;
            case 7:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_7, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_7, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_7, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_7, x, y, 60, 120, null);
                        break;
                }
                break;
            case 8:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_8, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_8, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_8, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_8, x, y, 60, 120, null);
                        break;
                }
                break;
            case 9:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_9, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_9, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_9, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_9, x, y, 60, 120, null);
                        break;
                }
                break;
            case 10:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_10, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_10, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_10, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_10, x, y, 60, 120, null);
                        break;
                }
                break;
            case 11:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_11, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_11, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_11, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_11, x, y, 60, 120, null);
                        break;
                }
                break;
            case 12:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_12, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_12, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_12, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_12, x, y, 60, 120, null);
                        break;
                }
                break;
            case 13:
                switch(suit) {
                    case 1:
                        gr.drawImage(image1_13, x, y, 60, 120, null);
                        break;
                    case 2:
                        gr.drawImage(image2_13, x, y, 60, 120, null);
                        break;
                    case 3:
                        gr.drawImage(image3_13, x, y, 60, 120, null);
                        break;
                    case 4:
                        gr.drawImage(image4_13, x, y, 60, 120, null);
                        break;
                }
                break;
        }
    }
}