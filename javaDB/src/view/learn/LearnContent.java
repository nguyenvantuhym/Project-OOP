/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.learn;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class LearnContent extends JPanel {
    private static LearnContent instance = null;
   
    public static LearnContent getInstance()
    {
        if(instance == null)
        {
            instance = new LearnContent();
            return instance;
        }else 
            return instance;
    }
    private LearnContent()
    {
        init();
    }
    private void init()
    {
        setLayout(null);
       
        setBackground(Color.white);
        LearnWord.getInstance().setBounds(270
                , 10, LearnWord.getInstance().WIDTH_, LearnWord.getInstance().HEIGHT_);
        add(LearnWord.getInstance(),BorderLayout.CENTER);
        
        
    }
    
    
    public static void main(String []args)
    {
        JFrame  fm = new JFrame();
        fm.setLayout(new BorderLayout());
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setSize(500, 500);
        fm.add(LearnContent.getInstance(),BorderLayout.CENTER);
        fm.setVisible(true);
    }
}
