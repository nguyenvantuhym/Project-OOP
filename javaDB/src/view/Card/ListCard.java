/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Card;
import view.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.WrapLayout;
import view.mainFrame;
import view.search.ItemList;

/**
 *
 * @author Admin
 */
public class ListCard extends JPanel{
    public static ArrayList<ItemList> list = new ArrayList();
    private JPanel panel = new JPanel();
    private JScrollPane scrollPane = new JScrollPane(panel);
    public void setListCard() {
        
       for(int i =0; i< 10; i++)
       {
           list.add(new ItemList("hello" +i, "xin chào" +i, i));
       }
        
    }
    private static ListCard instance = null;
    public static ListCard getInstance()
    {
        if(instance == null)
        {
            instance = new ListCard();
            return instance;
        }else 
            return instance;
    }
    protected ListCard()
    {
        setListCard();
        init();
    }
    private void init()
    {
        
       BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
       panel.setLayout(boxLayout);
        setLayout(new BorderLayout());
        setBackground(Color.white);
        loadData();
        
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane,BorderLayout.CENTER);
        
    }
    public void loadData()
    {
        if(list !=null)
        {
            for(int i = 0; i < list.size(); i++)
            {
                panel.add(list.get(i));
            }
            
        }
    }
    public void removeOneItem(int index) throws IOException
    {
        System.out.println("remove1");
        panel.remove(index);
        
        panel.updateUI();
        
    }
    public void removeAllItems()
    {
        System.out.println("remove");
        panel.removeAll();
        panel.repaint();
        
        
    }
}
