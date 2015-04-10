package com.view.insert;

import com.view.BasicFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class nProduct extends BasicFrame
{
    /**
     * 
     */
    private static final long serialVersionUID=-4757558325288385593L;
    private JTextField textName;
    private JTextField textColor;
    private JTextField textDesc;
    private JTextField textCount;
    private JTextField textPrice;

    public nProduct(String name)
    {
	super(name);
	getContentPane().setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), },new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

	JLabel lblNewLabel=new JLabel("品名：");
	lblNewLabel.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(lblNewLabel,"2, 2, right, default");

	textName=new JTextField();
	textName.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(textName,"4, 2, left, default");
	textName.setColumns(10);

	JLabel label=new JLabel("顏色：");
	label.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label,"2, 4, right, default");

	textColor=new JTextField();
	textColor.setFont(new Font("細明體",Font.PLAIN,16));
	textColor.setColumns(10);
	getContentPane().add(textColor,"4, 4, left, default");

	JLabel label_1=new JLabel("大小：");
	label_1.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_1,"2, 6, right, default");

	JComboBox comboBox=new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "SS", "S", "M", "XL", "2XL", "3XL" }));
	getContentPane().add(comboBox,"4, 6, left, default");

	JLabel label_2=new JLabel("描述：");
	label_2.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_2,"2, 8, right, default");

	textDesc=new JTextField();
	textDesc.setFont(new Font("細明體",Font.PLAIN,16));
	textDesc.setColumns(10);
	getContentPane().add(textDesc,"4, 8, fill, default");

	JLabel label_3=new JLabel("單價：");
	label_3.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_3,"2, 10, right, default");

	textPrice=new JTextField();
	textPrice.setFont(new Font("細明體",Font.PLAIN,16));
	textPrice.setColumns(10);
	getContentPane().add(textPrice,"4, 10, left, default");

	JLabel label_4=new JLabel("庫存：");
	label_4.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_4,"2, 12, right, default");

	textCount=new JTextField();
	textCount.setFont(new Font("細明體",Font.PLAIN,16));
	textCount.setColumns(10);
	getContentPane().add(textCount,"4, 12, left, default");

	JButton btnNewButton=new JButton("新增");
	btnNewButton.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(btnNewButton,"4, 14, left, default");
    }

    @Override
    public void initialize()
    {
	textName.setText("");
	textColor.setText("");
	textDesc.setText("");
	textCount.setText("");
	textPrice.setText("");
    }

}
