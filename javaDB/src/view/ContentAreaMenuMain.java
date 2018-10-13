/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ContentAreaMenuMain extends JPanel{
     private static ContentAreaMenuMain instance = null;

    public static ContentAreaMenuMain getInstance() throws IOException {
        if (null == instance) {
            instance = new ContentAreaMenuMain();
        }
        return instance;
    }
    protected ContentAreaMenuMain() throws IOException 
    {   
        setBackground(Color.WHITE);
        setLayout(new CardLayout());
        //add(new JButton("sasas"));
        add(view.Card.CardContent.getInstance(),"ListCard");
        add(view.search.CollectionItem.getInstance(),"search");
        add(view.learn.LearnContent.getInstance(),"learn");
        add(view.exam.ExamContent.getInstance(),"exam");
    }
}
