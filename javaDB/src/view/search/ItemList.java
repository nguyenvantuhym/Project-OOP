/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.search;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ItemList  extends JPanel{
    private String WordEng,WordVi;
    
    public String getWordEng() {
        return WordEng;
    }

    public String getWordVi() {
        return WordVi;
    }

    public void setWordEng(String WordEng) {
        this.WordEng = WordEng;
    }

    public void setWordVi(String WordVi) {
        this.WordVi = WordVi;
    }
    public ItemList(String _wordEng, String _wordVi,int index)
    {
        setWordEng(_wordEng);
        setPreferredSize(new Dimension(40, 50));
        setWordVi(_wordVi);
        setLayout( new GridLayout(1,0));
        BtnNone btn1= new BtnNone(WordEng);
        BtnNone btn2= new BtnNone(WordVi);
        if(index % 2 ==0)
        {
            btn1.setBackground(new Color(242, 242, 242));
            btn2.setBackground(new Color(242, 242, 242));
        }else 
        {
            btn1.setBackground(Color.white);
            btn2.setBackground(Color.white);
        }
        add(btn1);
        add(btn2);
    }
}
