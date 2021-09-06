package views;

import java.awt.Color;
import java.awt.Font;
import singleton.Singleton;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author d
 */
public class Logo {
    int x = 293, y = 25;
    public void drawLogoMiddle() {
        try {

            Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 30));
            Singleton.getInstance().gr.drawString(Singleton.getInstance().stage, 500, 610);

            Singleton.getInstance().gr.drawString("CHECK!", 900, 510);

            Singleton.getInstance().gr.setColor(Color.DARK_GRAY);
            Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 40));
            Singleton.getInstance().gr.drawString("Shrek Em", 280, 510);
            Singleton.getInstance().gr.setColor(Color.GRAY);
            Singleton.getInstance().gr.fillRect(870, 450, 170, 66);
            Singleton.getInstance().gr.setColor(Color.RED);
            Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 30));
            Singleton.getInstance().gr.drawString("CHECK!", 900, 510);
            Singleton.getInstance().gr.setColor(Color.BLACK);
            Singleton.getInstance().gr.fillRect(900, 550, 170, 36);
            Singleton.getInstance().gr.setColor(Color.PINK);Singleton.getInstance().gr.setColor(Color. PINK);
            Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 20));
            Singleton.getInstance().gr.drawString("LOST. ("+Singleton.getInstance().losses+")", 900, 570);
            Singleton.getInstance().gr.setColor(Color.BLACK);
            Singleton.getInstance().gr.fillRect(900, 600, 170, 36);
            Singleton.getInstance().gr.setColor(Color.PINK);Singleton.getInstance().gr.setColor(Color. PINK);
            Singleton.getInstance().gr.setFont(new Font("arial", Font.BOLD, 20));
            Singleton.getInstance().gr.drawString("WIN. ("+Singleton.getInstance().wins+")", 900, 620);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

