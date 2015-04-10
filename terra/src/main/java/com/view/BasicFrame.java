package com.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public abstract class BasicFrame extends JFrame
{

    /**
	 * 
	 */
    private static final long serialVersionUID=1L;
    private JPanel contentPane;

    public BasicFrame(String name)
    {
	setTitle(name);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100,100,500,350);
	contentPane=new JPanel();
	contentPane.setBorder(new EmptyBorder(5,5,5,5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	setResizable(false);
	setLocationRelativeTo(null);
    }

    abstract public void initialize();
}
