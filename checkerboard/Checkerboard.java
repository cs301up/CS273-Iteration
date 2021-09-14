/*****************************************************************
 * Checkerboard.java - Defines a Java app that draws some boxes
 *
 * Name: ****PUT YOUR NAME HERE****
 * Date: ****PUT THE DATE OF COMPLETTION HERE****
 * Status: incomplete
 *****************************************************************/

import java.awt.*;

/*****************************************************************
 * The class Checkerboard displays an NxN checkerboard on the screen. It extends
 * the CheckerboardMain class which handles all the mouse interactions.
 *
 * This class inherits the numSquares variable from CheckerboardMain. That
 * variable specifies the number of squares along one side of the checkerboard.
 * So, for an NxN checkerboard, numSquares = N. The CheckerboardMain class will
 * modify this variable in response to mouse-clicks.
 *****************************************************************/
public class Checkerboard extends CheckerboardMain {

    /**
     * Paints the app's image on the graphics window.
     *
     * @param g - The app's Graphics object
     */
    public void drawCheckerboard(Graphics g) {
        //for(initial value; condition; change)
        
        
        
        for(int i = 0; i < numSquares; i++) { 
            System.out.println(i);
            
        }
        
        // i = 0,  numSquares = 5
        // printout: 0
        // i = 1, numSquares = 5
        // printout: 1
        // i = 2, numSquares = 5
        // printout: 2
        // i = 3, numSquares = 5
        // printout: 3
        // i = 4, numSquares = 5
        // printout: 4        
        // i = 5, numSquares = 5

        
        
        
        
        
        //Do nothing for now
    }//drawCheckerboard
}//class Checkerboard
