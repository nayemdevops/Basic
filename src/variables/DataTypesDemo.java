package variables;

import java.awt.*;
import java.util.Date;

public class DataTypesDemo {
    public static void main(String[] args) {

        //byte
        byte myByte = 30;
        //System.out.println(myByte);

        //short
        short myShort = 31;

        //int *****
        int viewCount = 123_456_789;

        // Long
        long myLongNumber = 3_123_456_789L;

        //Float ***
        float shirtPrice = 10.99F;
        //System.out.println(shirtPrice);

        //Double *****
        double hatPrice = 10.99;

        //Char ***
        char myPattern = 'A';
        //System.out.println(myPattern);

        //Boolean *****
        boolean enoughEggStock = true;
        //System.out.println(enoughEggStock);



        //Reference Type
        Date now = new Date();
        //System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        //System.out.println(point1);
        //System.out.println(point2);

        String message = new String("Hello World " + "Java");
        //System.out.println(message);
        //System.out.println(message.toLowerCase(Locale.ROOT));

        String myName = "  Nayem  ";
        System.out.println(myName);
        System.out.println(myName.trim());













    }
}
