/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Image;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author d
 */
public class Cards {
    public ArrayList<Card> cars = new ArrayList<>();
    public ArrayList<Card> crs = new ArrayList<>();
    public void draw_All_TopOfStack() {
        for(int i=0; i<crs.size(); i++) {
            crs.get(i).drawTopOfStack();
        }
    }
    public Card getCardByID(int id) {
        for(int i=0; i<cars.size(); i++) {
            if(cars.get(i).id == id) {
                Card cd = cars.get(i);
                return cd;
            }
        }
        return null;
    }
}