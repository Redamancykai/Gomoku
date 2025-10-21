package com.mygomoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GomokuMain extends JFrame {
	
    public GomokuMain() {
        ChessBoard Chessboard = new ChessBoard();
        
        setLayout(new BorderLayout()); 
        setTitle("五子棋");
        add(Chessboard, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        JButton undoButton = new JButton("悔棋");
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chessboard.Undo(); 
            }
        });
        undoButton.setBackground(Color.WHITE);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(undoButton);
        add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.setBackground(new Color(245, 222, 179));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GomokuMain::new);
    }
}
