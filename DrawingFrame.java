import java.awt.*;
import javax.swing.*;

public class DrawingFrame extends JFrame {// Natanauan,Carlos   January 19  Computer Programming 2

    DrawingPanel panel;
    DrawingFrame() {
        panel = new DrawingPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    class DrawingPanel extends JPanel {

        Image image;
        String logoLoc = "E:\\Courses Notes\\Computer Prgramming 2\\logo.png";

        DrawingPanel() {
            image = new ImageIcon(logoLoc).getImage();
            this.setPreferredSize(new Dimension(900, 700));
        }

        public void paint(Graphics g) {
            Graphics2D gg = (Graphics2D) g;

            gg.setColor(Color.red);
            gg.setStroke(new BasicStroke(11));
            gg.drawRect(5, 6, 890, 685);
            gg.setColor(new Color(66, 164, 245));
            gg.fillRect(6, 6, 888, 685);

            gg.setStroke(new BasicStroke(7));
            gg.setColor(Color.black);

            gg.drawOval(300, 45, 270, 250);//face primmary
            gg.setColor(new Color(66, 164, 245));
            gg.fillOval(300, 45, 271, 250);

            gg.setStroke(new BasicStroke(4));
            gg.setColor(Color.black);
            gg.drawOval(350, 290, 165, 165);//primary pocket
            gg.setColor(new Color(230, 239, 245));
            gg.fillOval(350, 290, 165, 165);
            gg.setColor(Color.black);
            gg.drawArc(364, 320, 135, 120, 180, 180);//secondary pocket
            gg.setColor(new Color(206, 214, 208));
            gg.fillArc(364, 320, 135, 120, 180, 180);

            gg.setColor(Color.black);
            gg.drawArc(330, 180, 210, 130, 180, 180);
            gg.setColor(new Color(241, 48, 47));//collar
            gg.fillArc(330, 180, 210, 130, 180, 180);

            gg.setStroke(new BasicStroke(4));//face secondary
            gg.setColor(Color.black);
            gg.drawOval(310, 95, 250, 200);
            gg.setColor(new Color(230, 239, 245));
            gg.fillOval(310, 95, 250, 200);

            gg.setColor(Color.black);//eyes line
            gg.drawOval(380, 65, 50, 54);
            gg.setColor(Color.black);
            gg.drawOval(433, 65, 50, 54);

            gg.setColor(new Color(230, 239, 245));//eyes fill
            gg.fillOval(380, 65, 50, 54);
            gg.setColor(new Color(230, 239, 245));
            gg.fillOval(433, 65, 50, 54);

            gg.setStroke(new BasicStroke(2));//eyeball
            gg.setColor(Color.black);
            gg.drawArc(396, 90, 23, 20, 0, 180);
            gg.drawArc(440, 90, 23, 20, 0, 180);

            gg.drawOval(412, 108, 39, 40);//nose
            gg.setColor(new Color(241, 48, 47));
            gg.fillOval(412, 108, 39, 40);

            gg.setColor(Color.black);//mouth
            gg.drawLine(432, 150, 432, 255);
            gg.drawArc(340, 144, 190, 110, 180, 180);
            gg.drawLine(360, 130, 410, 150);//left
            gg.drawLine(340, 160, 410, 160);
            gg.drawLine(340, 190, 410, 175);

            gg.drawLine(450, 150, 510, 130);//right
            gg.drawLine(450, 160, 530, 160);
            gg.drawLine(450, 175, 520, 190);

            gg.drawOval(407, 294, 50, 50);//bell
            gg.setColor(new Color(244, 206, 55));
            gg.fillOval(407, 294, 50, 50);
            gg.setColor(Color.black);
            gg.drawLine(432, 320, 432, 343);
            gg.setColor(Color.DARK_GRAY);
            gg.fillOval(425, 310, 15, 15);

            gg.setColor(Color.black);
            gg.setStroke(new BasicStroke(3));
            //body
            gg.drawArc(300, 300, 30, 220, 90, 180);
            gg.drawArc(540, 300, 30, 220, 270, 180);

            gg.setStroke(new BasicStroke(6));
            gg.drawOval(210, 370, 90, 90);//right hand
            gg.drawOval(570, 370, 90, 90);//left hand
            gg.setColor(new Color(230, 239, 245));
            gg.fillOval(210, 370, 90, 90);
            gg.fillOval(570, 370, 90, 90);
            gg.setStroke(new BasicStroke(3));
            gg.setColor(Color.black);
            gg.drawLine(226, 380, 330, 253);//right arm
            gg.drawLine(541, 253, 645, 380);//left arm

            gg.setStroke(new BasicStroke(6));
            gg.drawOval(440, 516, 170, 60);////left foot
            gg.drawOval(270, 517, 170, 60);//right
            gg.setColor(new Color(230, 239, 245));
            gg.fillOval(440, 516, 170, 60);
            gg.fillOval(270, 517, 170, 60);

            gg.setStroke(new BasicStroke(3));
            gg.setColor(Color.black);
            gg.drawLine(440, 550, 440, 500);//crotch
            gg.drawArc(430, 494, 20, 5, 180, 180);

            gg.drawImage(image, 165, 544, 550, 160, null);//logo
            gg.setColor(new Color(64, 65, 69));
            gg.setFont(new Font("Ink Free", Font.BOLD, 30));
            gg.drawString("Carlos Natanauan", 10, 30);
        }

    }

    public static void main(String[] args) {
        new DrawingFrame();
    }

}
