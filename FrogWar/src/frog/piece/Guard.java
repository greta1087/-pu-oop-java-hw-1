package frog.piece;

import java.awt.*;

public class Guard {

    private int guardSize = 50;

    public Guard() {

    }

    /**
     * Визуализира гардовете
     *
     */
    public void render(Graphics g) {

        //Жълти гардове
        g.setColor(Color.yellow);
        g.fillOval(25,25,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.drawOval(25,25,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.fillOval(125,25,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.drawOval(125,25,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.fillOval(225,25,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.drawOval(225,25,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.fillOval(325,25,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.drawOval(325,25,this.guardSize, this.guardSize);
        //Зелени гардове
        g.setColor(Color.green);
        g.fillOval(125,425,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.drawOval(125,425,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.fillOval(225,425,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.drawOval(225,425,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.fillOval(325,425,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.drawOval(325,425,this.guardSize, this.guardSize);
        g.setColor(Color.green);
        g.fillOval(425,425,this.guardSize, this.guardSize);
        g.setColor(Color.yellow);
        g.drawOval(425,425,this.guardSize, this.guardSize);

    }
}
