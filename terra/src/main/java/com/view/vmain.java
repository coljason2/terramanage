package com.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.view.detail.dOrder;
import com.view.detail.dProduct;
import com.view.insert.nCustomer;
import com.view.insert.nOrder;
import com.view.insert.nProduct;
import com.view.manage.mCustomer;
import com.view.manage.mOrder;
import com.view.manage.mProduct;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class vmain extends JFrame
{
    private static final long serialVersionUID=-101983680080740145L;
    private JFrame frame;
    private static final nProduct npview=new nProduct("新增產品");
    private static final mProduct mpview=new mProduct("產品管理");
    private static final mOrder moview=new mOrder("訂單管理");
    private static final nCustomer ncview=new nCustomer("新增顧客");
    private static final mCustomer mcview=new mCustomer("顧客管理");

    public vmain()
    {
	frame=new JFrame();
	frame.setTitle("泰羅訂單系統");
	frame.setBounds(100,100,600,450);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JMenuBar menuBar=new JMenuBar();
	frame.setJMenuBar(menuBar);

	JMenu menu=new JMenu("產品");
	menu.setFont(new Font("細明體",Font.PLAIN,21));
	menuBar.add(menu);

	JMenuItem menuItem_6=new JMenuItem("新增");
	menuItem_6.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent e)
	    {
		npview.initialize();
		npview.setVisible(true);
	    }
	});
	menuItem_6.setFont(new Font("細明體",Font.PLAIN,21));
	menu.add(menuItem_6);

	JMenuItem menuItem=new JMenuItem("管理");
	menuItem.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent arg0)
	    {
		mpview.initialize();
		mpview.setVisible(true);
	    }
	});
	menuItem.setFont(new Font("細明體",Font.PLAIN,21));
	menu.add(menuItem);

	JMenu menu_1=new JMenu("客戶");
	menu_1.setFont(new Font("細明體",Font.PLAIN,21));
	menuBar.add(menu_1);

	JMenuItem menuItem_5=new JMenuItem("新增");
	menuItem_5.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent arg0)
	    {
		ncview.initialize();
		ncview.setVisible(true);
	    }
	});
	menuItem_5.setFont(new Font("細明體",Font.PLAIN,21));
	menu_1.add(menuItem_5);

	JMenuItem menuItem_1=new JMenuItem("管理");
	menuItem_1.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent arg0)
	    {
		mcview.initialize();
		mcview.setVisible(true);
	    }
	});
	menuItem_1.setFont(new Font("細明體",Font.PLAIN,21));
	menu_1.add(menuItem_1);

	JMenu menu_2=new JMenu("訂單");
	menu_2.setFont(new Font("細明體",Font.PLAIN,21));
	menuBar.add(menu_2);

	JMenuItem menuItem_2=new JMenuItem("管理");
	menuItem_2.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent arg0)
	    {
		moview.initialize();
		moview.setVisible(true);
	    }
	});
	menuItem_2.setFont(new Font("細明體",Font.PLAIN,21));
	menu_2.add(menuItem_2);

	JMenu menu_3=new JMenu("關於");
	menu_3.setFont(new Font("細明體",Font.PLAIN,21));
	menuBar.add(menu_3);

	JMenuItem menuItem_3=new JMenuItem("版本");
	menuItem_3.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent arg0)
	    {
		JOptionPane.showMessageDialog(null,"Version 1.00");
	    }
	});
	menuItem_3.setFont(new Font("細明體",Font.PLAIN,21));
	menu_3.add(menuItem_3);

	JMenuItem menuItem_4=new JMenuItem("說明");
	menuItem_4.addMouseListener(new MouseAdapter()
	{
	    @Override
	    public void mousePressed(MouseEvent e)
	    {
		JOptionPane.showMessageDialog(null,"本系統只適用於泰羅服飾\n作者JunChiChen\n協同使用者 李憲宗");
	    }
	});
	menuItem_4.setFont(new Font("細明體",Font.PLAIN,21));
	menu_3.add(menuItem_4);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	frame.setVisible(true);
    }
}
