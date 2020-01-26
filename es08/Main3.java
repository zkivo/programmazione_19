package es08;

import es06.Rectangle;
import es06.Square;

public class Main3 {

    public static void main(String args[]) {
        try {
            Rectangle rettangolo1 = new Rectangle(0, 1.34f);
            Rectangle rettangolo2 = new Rectangle(1,-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Rectangle Quadrato1 = new Rectangle(0, 1.34f);
            Rectangle Quadrato2 = new Rectangle(-4,2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}