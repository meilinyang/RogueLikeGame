/*
 Roguelike Game,  An adventure to eat as much cake
 Using Java Swing
Resource:http://gamedevelopment.tutsplus.com/tutorials/how-to-make-your-first-roguelike--gamedev-13677
 First, generate the map.
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class CakeVenture {

    int sizeX = 400, sizeY = 550;
    int rows = 10, cols = 15;
    JTextArea map;
    char mapArr[][];

    public CakeVenture() {
        JFrame jfrm = new JFrame("CakeVenture!!");
        jfrm.setSize(400, 450);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());

        GenerateNewMap();
        UpdateMap();
        AddKeyListeners();

        jfrm.getContentPane().add(map);
        jfrm.setVisible(true);
    }

    private void GenerateNewMap() {
        map = new JTextArea();
        map.setFont(new Font("Courier New", Font.PLAIN, 32));
        map.setForeground(Color.WHITE);
        map.setBackground(Color.BLACK);
        map.setCaretColor(Color.BLACK);
        mapArr = new char[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(Math.random() > 0.8) {
                    mapArr[i][j] = '#';
                } else {
                    mapArr[i][j] = '.';
                }
            }
        }
    }
    
    private void UpdateMap() {
        String strMap = "";
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                strMap += mapArr[i][j];
            }
            strMap += "\n";
        }
        System.out.println(strMap);
        map.setText(strMap);
        
    }

    private void AddKeyListeners() {

        map.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent ke) {
                //do something
                switch (ke.getID()) {
                    case KeyEvent.VK_UP:
                        break;
                    case KeyEvent.VK_DOWN:
                        break;
                    case KeyEvent.VK_LEFT:
                        break;
                    case KeyEvent.VK_RIGHT:
                        break;
                    default:
                        //ignore
                        break;
                }
            }

            public void keyPressed(KeyEvent ke) {
                //do nothing
            }

            public void keyReleased(KeyEvent ke) {
                //do nothing
            }
        });
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CakeVenture();
            }
        });
    }
}
