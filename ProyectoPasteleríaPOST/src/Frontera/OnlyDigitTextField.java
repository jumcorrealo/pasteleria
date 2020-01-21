/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author enano
 */
public class OnlyDigitTextField extends JTextField{
    
    public int row;
    
    public OnlyDigitTextField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt){
                char c = evt.getKeyChar();
                if(!Character.isDigit(c))
                    evt.consume();
            }
        });

    }
}
