/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.learn;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import view.search.BtnNone;

/**
 *
 * @author Admin
 */
public class LearnWord extends JPanel implements ActionListener{
    
    private static LearnWord instance = null;
    
    public final int WIDTH_ =Card.getInstance().WIDTH_CARD;
    public final int HEIGHT_ =Card.getInstance().HEIGHT_CARD +70;
    
    BtnNone btnGiaiThich =new BtnNone("Xem giải Thích");
    BtnNone btnThuoc = new BtnNone("Đã Thuộc");
    
    ArrayList<String> tiengViet = new  ArrayList();
    ArrayList<String> tienganh = new  ArrayList();
    int index =0;
    private void loaddata()
    {
        tiengViet.add("gà");
        tienganh.add("chicken");
        tiengViet.add("chó");
        tienganh.add("dog");
        tiengViet.add("chim");
        tienganh.add("bird");
        tiengViet.add("cây");
        tienganh.add("tree");
        tiengViet.add("bút");
        tienganh.add("pen");
    }
   
    public static LearnWord getInstance()
    {
        if(instance == null)
        {
            instance = new LearnWord();
            return instance;
        }else 
            return instance;
    }
    private LearnWord()
    {
        loaddata();
        init();
    }
    private void init()
    {
        
        setLayout(null);
        Border border = LineBorder.createGrayLineBorder();
        setBorder(border);
        Card.getInstance().setIconCard(new ImageIcon("icons/default_card.png"));
        //Card.getInstance().set
        load();
        Card.getInstance().setBounds(0,0,Card.getInstance().WIDTH_CARD,Card.getInstance().HEIGHT_CARD);
        
        
        //BtnNone btnGiaiThich =new BtnNone("Xem giải Thích");
        btnGiaiThich.addActionListener(this);
        
        
        btnThuoc.setForeground(Color.white);
        btnThuoc.setBackground(new Color(0, 123, 255));
        btnThuoc.setActionCommand("daThuoc");
        btnThuoc.addActionListener(Controller.Controller.getInstance());
        
        
        JPanel panel = new JPanel(new GridLayout(0,1));
        
        panel.add(btnGiaiThich);
        panel.add(btnThuoc);
        panel.setBounds(0,Card.getInstance().HEIGHT_CARD,Card.getInstance().WIDTH_CARD,70);
        add(Card.getInstance());
        add(panel);
    }
    public  void load()
    {
        if(index < tiengViet.size())
        {
            btnGiaiThich.setVisible(true);
            System.out.println(index);
            Card.getInstance().setAnh(tienganh.get(index));
            Card.getInstance().setViet(tiengViet.get(index));
            Card.getInstance().setIconCard(null);
            Card.getInstance().loadCard();
            Card.getInstance().repaint();
            Card.getInstance().hideExplan();
            index ++;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        btnGiaiThich.setVisible(false);
        Card.getInstance().showExplan();
        
    }
}
