package frog.war.game;

import frog.piece.Leader;
import frog.piece.Guard;
import javax.swing.*;
import java.awt.*;

/**
 * Клас, който наследява характеристиките на JFrame и създава рамката,
 * в която се визуализират игралната дъска и пионките
 */
public class GameBoard extends JFrame {

    public GameBoard() {

        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Frog War Game");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    /**
     * Визуализира игралната дъска и пионките
     *
     */
    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 5; row++) {
             for (int col = 0; col < 5; col++) {

                GameTile gameTile = new GameTile(row, col);
                gameTile.render(g);

             }
        }

                Guard guard = new Guard();
                guard.render(g);

                Leader leader = new Leader();
                leader.render(g);

    }
}