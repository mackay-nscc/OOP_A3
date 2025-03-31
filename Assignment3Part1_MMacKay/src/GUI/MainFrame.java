package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 750);
        setTitle("DND Game");

        JPanel mainPanel = new JPanel();

        JLabel titleLabel = new JLabel("Dungeon and Dragon", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Old English Text MT", Font.BOLD, 48));
        mainPanel.add(titleLabel);
        mainPanel.setBackground(Color.WHITE);


        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        subPanel.setBackground(Color.WHITE);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/startPage.jpg"));
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        subPanel.add(Box.createRigidArea(new Dimension(0, 100)));
        subPanel.add(imageLabel);

        JButton startButton = new JButton("Build A Character");
        startButton.addActionListener(e -> {
            // Add the code to handle button click and change to the next page here
            SecondFrame secondFrame = new SecondFrame();
            secondFrame.setVisible(true);
            dispose();
        });

        startButton.setPreferredSize(new Dimension(300, 50));
        startButton.setMaximumSize(new Dimension(300, 50));
        startButton.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        subPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        subPanel.add(startButton);
        subPanel.add(Box.createVerticalGlue());

        mainPanel.add(subPanel, BorderLayout.CENTER);
        add(mainPanel);

        setVisible(true);
    }}
