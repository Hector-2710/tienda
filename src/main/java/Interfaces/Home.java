package Interfaces;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JFrame implements ActionListener {
    private JPanel home;
    private JButton decantsButton;
    private JButton perfumesButton;

    public Home() {
        add(home);
        setTitle("Home");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        decantsButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == decantsButton) {
            this.setVisible(false);
            new decants();
        }
        if (e.getSource() == perfumesButton) {
        }

}}
