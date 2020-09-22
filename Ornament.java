
import javax.swing.*;
import java.awt.*;

public class Ornament extends JPanel
{
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
        // to paint the background
        drawTriangles( g, 100, 80, 64 );
    }



    /**
     * Draws an ornament made of triangles in Graphics g with the base midpoint
     * at (x, y) and base half-length r
     */
    public void drawTriangles( Graphics g, int x, int y, int r )
    {
        if (r == 4) return;

        g.drawLine( x + r, y, x - r, y ); // (x1, y1)
        g.drawLine( x + r, y, x, y - r ); // (x2, y2)
        g.drawLine( x - r, y, x, y - r ); // (x3, y3)

        drawTriangles(g, x+r-r/2, y, r/2);
        drawTriangles(g, x-r/2, y, r/2);

    }


    public static void main( String[] args )
    {
        JFrame w = new JFrame( "Triangles" );
        w.setBounds( 300, 300, 200, 120 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Ornament panel = new Ornament();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( false );
        w.setVisible( true );
    }
}
