/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.learn;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Admin
 */
public class Card extends JPanel{
    private static Card instance = null;
    private final ImageIcon iconDefault = ImageSize.ImageSize(300, new ImageIcon("icons/default_card.png"));
    public static Card getInstance()
    {
        if(instance == null)
        {
            instance = new Card();
            return instance;
        }else 
            return instance;
    }
    public ImageIcon icon;
    public final int WIDTH_CARD =300;
    public final int HEIGHT_CARD =420;
    private String Anh;
    private String Viet;

   

    public void setIconCard(ImageIcon icon) {
        if(icon ==null) this.icon = iconDefault;else 
            this.icon = icon;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getViet() {
        return Viet;
    }

    public void setViet(String Viet) {
        this.Viet = Viet;
    }
    private JLabel lblEng= new JLabel();
    private JLabel lblIcon= new JLabel();
    private JLabel lblVi= new JLabel();
    
     public Card(){
         init();
     }
    
    private void init()
    {
        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(box);
        
        lblEng.setHorizontalAlignment(JLabel.CENTER);// căn giữa cho lblEng
        lblVi.setHorizontalAlignment(JLabel.CENTER);// căn giữa cho lblVi  
        
        
        
        //icon = new ImageIcon("icons\\default_card.png");
        setPreferredSize(new Dimension(WIDTH_CARD,HEIGHT_CARD));
        add(lblIcon);
        add(lblEng);
        add(lblVi);
        hideExplan();
    }
    public void loadCard()
    {
        lblEng.setText("<html><h1 style='color:gray'>"+Anh+"</h1></html>");
        
        
        
        lblVi.setText("<html><h1 style='color:gray'>"+Viet+"</h1></html>");
              
        lblEng.setHorizontalAlignment(JLabel.CENTER);// căn giữa cho lblEng

        
        lblIcon.setIcon(icon);
        lblIcon.setPreferredSize(new Dimension(200,200));
        
    }
    public void hideExplan()
    {
        lblVi.setVisible(false);
    }
    public void showExplan()
    {
        lblVi.setVisible(true);
    }
    
    
}
