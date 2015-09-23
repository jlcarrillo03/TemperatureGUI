/*
 *  ***************************************************************
 *     Polytechnic University of Puerto Rico                      *
 *     Electrical & Computer Engineering and                      *
 *          Computer Science Department                           *
 *                                                                *
 *      Student: Jorge Carrillo Rodriguez                         *
 *                ID: #74186                                      *
 *  ***************************************************************
 */
package edu.pupr.temperaturegui;

import javax.swing.JFrame;

/**
 * Program: <b><code>TemperatureGUI.java</code></b><br>
 * Date   : September 22, 2015<br>
 * Description: <br>Temperature Converter.<br>
 * @author Jorge Carrillo #74186
 */
public class TemperatureGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TemperatureConverter labelFrame = new TemperatureConverter();
        
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelFrame.setSize(560, 120);
        
        labelFrame.setVisible(true);
    }
    
}


