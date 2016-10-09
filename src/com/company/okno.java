package com.company;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class okno extends JFrame {
    private int count = 0;
    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Your name?");
    private JLabel metkaDva = new JLabel("");
    private JLabel metkaThree=new JLabel("");

    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();

            if(button instanceof JButton){
                count++;
                ((JButton)button).setText("Clicked " + count + " times");
                metkaDva.setText("Thank you, "+fio.getText()+"!");
                metkaThree.setText("Clicked "+count+" times");
            }
        }
    }

    class PushingListenerNew implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object button1=e.getSource();
            if (button1 instanceof JButton) {
                setSize(500, 500);
            }
        }
    }

    public okno(String title)
    {
        super(title);
        SozdatxOkno();
    }

    private void SozdatxOkno(){

        JButton button = new JButton(" Click me! ");
        button.setBounds(65,60,150,40);
        button.addActionListener(new PushingListener());

        JButton button1=new JButton("LabWork");
        button1.setBounds(65,120,150,40);
        button1.addActionListener(new PushingListenerNew());

        metka.setBounds(15,15,95,30);
        metkaDva.setBounds(15,200,200,30);
        metkaThree.setBounds(15,170,95,30);

        fio.setBounds(120, 15, 100, 30);

        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(button1);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(metkaThree);
        getContentPane().add(fio);

        setLocationRelativeTo(null);
    }
}
