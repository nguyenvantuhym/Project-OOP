package view;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageEditAndAdd extends JPanel implements ActionListener {
    private static MessageEditAndAdd instance = null;
    public static MessageEditAndAdd getInstance()
    {
        if(instance == null)
        {
            instance = new MessageEditAndAdd();
            return instance;
        }else
            return instance;
    }
    JTextField txBoxAnh = new JTextField();
    JTextField txBoxVi = new JTextField();

    JButton btnOK = new JButton("OK");

    JButton btnCANCEL = new JButton("CANCEL");

    public final int _width =400;
    public final int _height =180;
    public int getTypeMessage() {
        return typeMessage;
    }

    public void setTypeMessage(int typeMessage) {
        this.typeMessage = typeMessage;
    }
    public String TiengAnh;
    public String TiengViet;

    public String getTiengAnh() {
        return TiengAnh;
    }


    public String getTiengViet() {
        return TiengViet;
    }


    int typeMessage;
    JLabel Title;
    public void run(){
        if(typeMessage ==1)
            Title = new JLabel("Chỉnh Sửa Từ");
        else
            Title = new JLabel("Thêm  Từ");
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        add(Title,BorderLayout.PAGE_START);
        add(GridComponentCenter(),BorderLayout.CENTER);
        add(ComponentBottom(),BorderLayout.PAGE_END);
        add(GridComponentLeft(),BorderLayout.LINE_START);
    }

    public MessageEditAndAdd()
    {
        setLayout(new BorderLayout(15,5));
        setPreferredSize(new Dimension(_width,_height));


    }
    public JPanel GridComponentLeft()
    {
        JPanel panel = new JPanel(new GridLayout(2,1,10,10));
        JLabel lblAnh = new JLabel("Từ Tiếng Anh");

        lblAnh.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel lblViet = new JLabel("Từ Tiếng Việt");
        lblViet.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(lblAnh);
        panel.add(lblViet);

        return panel;
    }
    public void upDateAnhViet()
    {
        TiengViet = txBoxVi.getText();
        TiengAnh = txBoxAnh.getText();
    }
    public void resetAnhViet()
    {
        TiengAnh =null;
        TiengViet = null;
    }
    public JPanel GridComponentCenter()
    {
        JPanel panel = new JPanel(new GridLayout(2,1,10,10));



        panel.add(txBoxAnh);
        panel.add(txBoxVi);

        return panel;
    }
    public JPanel ComponentBottom()
    {
        JPanel panel = new JPanel(new FlowLayout());

        btnOK.addActionListener(Controller.getInstance());
        btnOK.setActionCommand("btnOKForm");
        panel.add(btnOK);
        panel.add(btnCANCEL);

        return panel;
    }

    public static void main(String[] args) {

        JFrame form = new JFrame();
        form.setSize(400, 180);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MessageEditAndAdd.getInstance().setTypeMessage(2);
        MessageEditAndAdd.getInstance().run();
        form.add(MessageEditAndAdd.getInstance());
        form.setVisible(true);
        JOptionPane message = new JOptionPane();
        //message.showMessageDialog(null, "jhgjhg" ,"áds",0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
