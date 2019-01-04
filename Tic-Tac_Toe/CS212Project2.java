package cs212.project.pkg2;

import java.awt.event.*;
import javax.swing.*;

public class CS212Project2 {
    public static void main(String[] args) 
    {
        JFrame menu = new JFrame();
        JPanel menuP = new JPanel();
        JButton P1P2 = new JButton("Player vs Player");
        JButton P1comp = new JButton("Player vs Computer");
        
        P1P2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    P1vP2 game1 = new P1vP2();
                    game1.initialize();
                    menu.setVisible(false);
            }
        });
        P1comp.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                    P1vComp game = new P1vComp();
                    game.initialize();
                    menu.setVisible(false);
            }
        });
        
        menu.setSize(500,150);
        menuP.setSize(500,500);
        menuP.add(P1P2);
        menuP.add(P1comp);
        menu.add(menuP);
        menu.setVisible(true);
    }   
}
