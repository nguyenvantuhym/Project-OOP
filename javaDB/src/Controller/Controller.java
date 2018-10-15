package Controller;


import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Dictionary;
import view.MessageEditAndAdd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Controller implements ActionListener{
     private static Controller instance = null;
    public static Controller getInstance() 
    {
        if(instance ==null)
        {
            instance = new Controller();
            return instance;
        }
        else return instance;
    }
    protected Controller()
    {
        init();
    }
    private void init()
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String command = e.getActionCommand();
        if (command.equals("btnSearch")) {
            System.out.println("ád");
        } else if (command.equals("btnMenuSearch")) {
            CardLayout cardLayout = null;
            try {
                cardLayout = (CardLayout) view.ContentAreaMenuMain.getInstance().getLayout();
                cardLayout.show(view.ContentAreaMenuMain.getInstance(), "search");
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (command.equals("card")) {
            CardLayout cardLayout = null;
            try {
                cardLayout = (CardLayout) view.ContentAreaMenuMain.getInstance().getLayout();
                cardLayout.show(view.ContentAreaMenuMain.getInstance(), "ListCard");
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (command.equals("learn")) {
            System.out.println("learn");
            CardLayout cardLayout = null;
            try {
                cardLayout = (CardLayout) view.ContentAreaMenuMain.getInstance().getLayout();
                cardLayout.show(view.ContentAreaMenuMain.getInstance(), "learn");
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (command.equals("exam")) {
            System.out.println("exam");
            CardLayout cardLayout = null;
            try {
                cardLayout = (CardLayout) view.ContentAreaMenuMain.getInstance().getLayout();
                cardLayout.show(view.ContentAreaMenuMain.getInstance(), "exam");
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (command.startsWith("addWordItem#", 0)) {
            for (int i = 0; i < Dictionary.getInstance().size(); i++) {
                if (command.equals("addWordItem#" + i)) {
                    System.out.println("add " + i);
                }
            }
        } else if (command.startsWith("editWordItem#", 0)) {
            for (int i = 0; i < Dictionary.getInstance().size(); i++) {
                if (command.equals("editWordItem#" + i)) {
                    System.out.println("edit " + i);
                }
            }
        } else if (command.startsWith("deleteWordItem#", 0)) {
            for (int i = 0; i < Dictionary.getInstance().size(); i++) {
                if (command.equals("deleteWordItem#" + i)) {
                    System.out.println("delete " + i);
                }
            }
        }else if (command.equals("btnOKForm"))
        {
            MessageEditAndAdd.getInstance().upDateAnhViet();
            if(MessageEditAndAdd.getInstance().TiengAnh !=""&&MessageEditAndAdd.getInstance().TiengViet!="")
            {
                System.out.println(MessageEditAndAdd.getInstance().TiengAnh+"asdasd "+MessageEditAndAdd.getInstance().TiengViet);
                MessageEditAndAdd.getInstance().resetAnhViet();
            }
        }
    }
}
