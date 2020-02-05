package views;

import colors.Colors;
import presenter.Presenter;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

public class CreateView extends JFrame {

    private Presenter presenter;

    private JPanel createPanel;
    private JButton createButton;
    private JButton backButton;

    private JLabel tankNameLabel;
    private JLabel tankOwnerLabel;
    private JLabel tankTypeLabel;

    private JTextField tankNameTextField;
    private JTextField tankOwnerTextField;
    private JTextField tankTypeTextField;

    private Colors colors;

    public CreateView() {
        setTitle("CreateView");
        setBounds(0, 0, 2000, 1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        colors = new Colors();

        createPanel = new JPanel();
        createPanel.setLayout(null);
        createPanel.setBackground(colors.getDrape());
        createPanel.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        createPanel.setOpaque(true);
        add(createPanel);

        createButton = new JButton();
        createButton.setBounds(500, 650, 300, 70);
        createButton.setFont(new Font("Verdana", Font.BOLD, 25));
        createButton.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        createButton.setText("Create");
        createButton.setBackground(colors.getGold());
        createButton.setForeground(Color.WHITE);
        createButton.addActionListener(e -> {
            this.presenter.createTank(
                    tankNameTextField.getText(),
                    tankOwnerTextField.getText(),
                    tankTypeTextField.getText()
            );
        });
        createPanel.add(createButton);

        backButton = new JButton();
        backButton.setBounds(810, 650, 300, 70);
        backButton.setFont(new Font("Verdana", Font.BOLD, 25));
        backButton.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        backButton.setText("Back");
        backButton.setBackground(colors.getGold());
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> {

        });
        createPanel.add(backButton);

        tankNameLabel = new JLabel("Name:");
        tankNameLabel.setBounds(500, 100, 100, 30);
        tankNameLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        tankNameLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        tankNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        tankNameLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        tankNameLabel.setBackground(colors.getFog());
        tankNameLabel.setForeground(Color.white);
        tankNameLabel.setOpaque(true);
        createPanel.add(tankNameLabel);

        tankOwnerLabel = new JLabel("Owner:");
        tankOwnerLabel.setBounds(500, 140, 100, 30);
        tankOwnerLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        tankOwnerLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        tankOwnerLabel.setHorizontalAlignment(SwingConstants.LEFT);
        tankOwnerLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        tankOwnerLabel.setBackground(colors.getFog());
        tankOwnerLabel.setForeground(Color.white);
        tankOwnerLabel.setOpaque(true);
        createPanel.add(tankOwnerLabel);

        tankTypeLabel = new JLabel("Type:");
        tankTypeLabel.setBounds(500, 180, 100, 30);
        tankTypeLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        tankTypeLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        tankTypeLabel.setHorizontalAlignment(SwingConstants.LEFT);
        tankTypeLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        tankTypeLabel.setBackground(colors.getFog());
        tankTypeLabel.setForeground(Color.white);
        tankTypeLabel.setOpaque(true);
        createPanel.add(tankTypeLabel);

        tankNameTextField = new JTextField();
        tankNameTextField.setBounds(610, 100, 500, 30);
        tankNameTextField.setFont(new Font("Verdana", Font.BOLD, 20));
        tankNameTextField.setHorizontalAlignment(SwingConstants.LEFT);
        tankNameTextField.setBackground(colors.getFog());
        tankNameTextField.setForeground(Color.WHITE);
        tankNameTextField.setOpaque(true);
        createPanel.add(tankNameTextField);

        tankOwnerTextField = new JTextField();
        tankOwnerTextField.setBounds(610, 140, 500, 30);
        tankOwnerTextField.setFont(new Font("Verdana", Font.BOLD, 20));
        tankOwnerTextField.setHorizontalAlignment(SwingConstants.LEFT);
        tankOwnerTextField.setBackground(colors.getFog());
        tankOwnerTextField.setForeground(Color.WHITE);
        tankOwnerTextField.setOpaque(true);
        createPanel.add(tankOwnerTextField);

        tankTypeTextField = new JTextField();
        tankTypeTextField.setBounds(610, 180, 500, 30);
        tankTypeTextField.setFont(new Font("Verdana", Font.BOLD, 20));
        tankTypeTextField.setHorizontalAlignment(SwingConstants.LEFT);
        tankTypeTextField.setBackground(colors.getFog());
        tankTypeTextField.setForeground(Color.WHITE);
        tankTypeTextField.setOpaque(true);
        createPanel.add(tankTypeTextField);

        presenter = new Presenter(this);

        repaint();
    }
}
