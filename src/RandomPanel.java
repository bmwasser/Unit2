import java.awt.*;
import javax.swing.*;

public class RandomPanel extends JPanel{
  static final long serialVersionUID = 1;

  public RandomPanel(){
    setPreferredSize(new Dimension(640,640));
    setBackground(Color.WHITE);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    int stepSize = 10;
    int width = getWidth();
    int height = getHeight();
    int currX = getWidth()/2;
    int currY = getHeight()/2;

    g.setColor(Color.BLUE);

    while (currX >= 0 && currX <= width - stepSize && currY >= 0 && currY <= height - stepSize) {
       int nextDirection = getLcgNum(8);

            int newX = currX;
            int newY = currY;

            if (nextDirection == 0) { // Up
                newY -= stepSize;
            } else if (nextDirection == 1) { // Down
                newY += stepSize;
            } else if (nextDirection == 2) { // Left
                newX -= stepSize;
            } else if (nextDirection == 3) { // Right
                newX += stepSize;
            } else if (nextDirection == 4) { // Up-Right
                newY -= stepSize;
                newX += stepSize;
            } else if (nextDirection == 5) { // Up-Left
                newY -= stepSize;
                newX += stepSize;
            } else if (nextDirection == 6) { // Down-Right
                newY += stepSize;
                newX += stepSize;
            } else { // Down-Left
                newY += stepSize;
                newX -= stepSize;
            }

            g.drawLine(currX, currY, newX, newY);

            currX = newX;
            currY = newY;
     }
    }

    public static int getLcgNum(int range){
      long seed = (((System.nanoTime() / 10) / 10));
      final long a = 1664525;
      final long c = 1013904223;
      final long m = 4294967296L;
      seed = (a * seed * c) % m; 
      return (int) (Math.abs(seed) % range);
    }
}
