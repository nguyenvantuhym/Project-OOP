/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.search;

import Model.*;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Admin
 */
public class CollectionItem extends JPanel{
     protected static CollectionItem instance = null;
     public static CollectionItem getInstance() throws IOException
    {
        if(instance == null)
        {
            instance = new CollectionItem();
            return instance;
        }else 
            return instance;
    }
    protected static ArrayList<ItemList> collItems = new ArrayList();
    public CollectionItem() throws IOException
    {
        init();
    }
    protected void init() throws IOException
    {
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        DictionaryManagement.getInstance();
        for(int i =0; i<Dictionary.getInstance().size(); i++)
        {
            panel.add(new ItemList(Dictionary.getInstance().get(i).getWord_target(),Dictionary.getInstance().get(i).getWord_explain(),i));
        }
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane,BorderLayout.CENTER);
    }
    
}
