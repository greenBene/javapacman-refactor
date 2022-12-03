import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PacmanMouseListener implements MouseListener {

    PacmanMouseListener(Board b) {
        this.b = b;
    }

    Board b;
    /* This function detects user clicks on the menu items on the bottom of the screen */
    public void mousePressed(MouseEvent e){
        if (b.titleScreen || b.winScreen || b.overScreen)
        {
            /* If we aren't in the game where a menu is showing, ignore clicks */
            return;
        }

        /* Get coordinates of click */
        int x = e.getX();
        int y = e.getY();
        if ( 400 <= y && y <= 460)
        {
            if ( 100 <= x && x <= 150)
            {
                /* New game has been clicked */
                b.New = 1;
            }
            else if (180 <= x && x <= 300)
            {
                /* Clear high scores has been clicked */
                b.clearHighScores();
            }
            else if (350 <= x && x <= 420)
            {
                /* Exit has been clicked */
                System.exit(0);
            }
        }
    }


    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
}
