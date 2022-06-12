package tokyo.ramune.window;

import tokyo.ramune.window.listener.ButtonListener;

import javax.swing.*;
import java.awt.*;

public class WindowManager {

    private static JFrame frame;
    private static JPanel panel;

    public static void creteWindow() {
        initializeWindow();
    }

    private static void initializeWindow() {
        frame = new JFrame("電卓");
        panel = new JPanel();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        panel.setLayout(null);
        frame.setSize(315, 540);
        frame.setResizable(false);

        addButton();

        frame.setVisible(true);
    }

    private static void addButton() {
        frame.add(getButton("0", 0, 440, 150, 60));
        frame.add(getButton("・", 150, 440, 75, 60));
        frame.add(getButton("=", 225, 440, 75, 60));

        frame.add(getButton("1", 0, 380, 75, 60));
        frame.add(getButton("2", 75, 380, 75, 60));
        frame.add(getButton("3", 150, 380, 75, 60));
        frame.add(getButton("+", 225, 380, 75, 60));

        frame.add(getButton("4", 0, 320, 75, 60));
        frame.add(getButton("5", 75, 320, 75, 60));
        frame.add(getButton("6", 150, 320, 75, 60));
        frame.add(getButton("-", 225, 320, 75, 60));

        frame.add(getButton("7", 0, 260, 75, 60));
        frame.add(getButton("8", 75, 260, 75, 60));
        frame.add(getButton("9", 150, 260, 75, 60));
        frame.add(getButton("✗", 225, 260, 75, 60));

        frame.add(getButton("AC", 0, 200, 75, 60));
        frame.add(getButton("+/-", 75, 200, 75, 60));
        frame.add(getButton("%", 150, 200, 75, 60));
        frame.add(getButton("÷", 225, 200, 75, 60));
    }

    private static JButton getButton(String title, int x, int y, int width, int height) {
        JButton jButton = new JButton(title);
        jButton.setBounds(x, y, width, height);
        jButton.addActionListener(new ButtonListener());
        return jButton;
    }
}
