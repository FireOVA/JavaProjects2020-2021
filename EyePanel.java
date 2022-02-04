
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EyePanel extends JPanel implements MouseMotionListener {

    private int y;

    public EyePanel() {
    	
          setPreferredSize(new Dimension(600, 300));
          setDoubleBuffered(true);
          addMouseMotionListener(this);
          
    }

    public void drawOval(Graphics g, int x, int y, int radiusX, int radiusY, boolean isFilled) {

          if (isFilled) {

                g.fillOval(x - radiusX, y - radiusY, radiusX * 2, radiusY * 2);

          } else {

                g.drawOval(x - radiusX, y - radiusY, radiusX * 2, radiusY * 2);

          }
    }

    protected void paintComponent(Graphics g) {

          super.paintComponent(g);
          super.setBackground(Color.BLUE);
          int centerX = getWidth() / 2;
          int centerY = getHeight() / 2;     
          int radiusXOuter = (int) (centerX * (3.0 / 4.0)) / 2;
          int radiusXInner = radiusXOuter / 2;
          int radiusYOuter = centerY / 2;
          int radiusYInner = radiusYOuter / 2;   
          int x1 = centerX / 2;

          drawOval(g, x1, centerY, radiusXOuter, radiusYOuter, false);
         
          int x2 = centerX + centerX / 2;

          drawOval(g, x2, centerY, radiusXOuter, radiusYOuter, false);

          if (y < (centerY - radiusXOuter)) {

                drawOval(g, x1, centerY - radiusYInner, radiusXInner, radiusYInner,

                            true);
                
                drawOval(g, x2, centerY - radiusYInner, radiusXInner, radiusYInner,

                            true);
          }

         

          else if (y > (centerY + radiusXOuter)) {

                drawOval(g, x1, centerY + radiusYInner, radiusXInner, radiusYInner,

                            true);

                drawOval(g, x2, centerY + radiusYInner, radiusXInner, radiusYInner,

                            true);

          } else {

                drawOval(g, x1, centerY, radiusXInner, radiusYInner, true);

                drawOval(g, x2, centerY, radiusXInner, radiusYInner, true);
          }
    }

    public static void main(String[] args) {

          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(new EyePanel());
          frame.pack();
          frame.setVisible(true);
    }

    public void mouseDragged(MouseEvent arg0) { }

    public void mouseMoved(MouseEvent me) {

          y = me.getY();
          repaint();
    }
}