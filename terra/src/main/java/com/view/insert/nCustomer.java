package com.view.insert;

import com.view.BasicFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;

public class nCustomer extends BasicFrame
{

    /**
     * 
     */
    private static final long serialVersionUID=-4335890936895806232L;
    private JTextField textName;
    private JTextField textPhone;
    private JTextField textPhoneowner;
    private JLabel label_2;
    private JTextField textRemark;
    private JLabel label_1;
    private JTextField textAddr;
    private JLabel label_3;
    private JTextField textID;
    private JButton btnCreate;

    public nCustomer(String name)
    {
	super(name);
	getContentPane().setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), },new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

	JLabel lblNewLabel=new JLabel("客戶名稱：");
	lblNewLabel.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(lblNewLabel,"2, 2, right, default");

	textName=new JTextField();
	textName.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(textName,"4, 2, left, default");
	textName.setColumns(10);

	JLabel label=new JLabel("客戶電話：");
	label.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label,"2, 4, right, default");

	textPhone=new JTextField();
	textPhone.setFont(new Font("細明體",Font.PLAIN,16));
	textPhone.setColumns(10);
	getContentPane().add(textPhone,"4, 4, left, default");

	JLabel lblid=new JLabel("聯絡人：");
	lblid.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(lblid,"2, 6, right, default");

	textPhoneowner=new JTextField();
	textPhoneowner.setFont(new Font("細明體",Font.PLAIN,16));
	textPhoneowner.setColumns(10);
	getContentPane().add(textPhoneowner,"4, 6, left, default");

	label_3=new JLabel("客戶ID：");
	label_3.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_3,"2, 8, right, default");

	textID=new JTextField();
	textID.setFont(new Font("細明體",Font.PLAIN,16));
	textID.setColumns(10);
	getContentPane().add(textID,"4, 8, left, default");

	label_1=new JLabel("客戶住址：");
	label_1.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_1,"2, 10, right, default");

	textAddr=new JTextField();
	textAddr.setFont(new Font("細明體",Font.PLAIN,16));
	textAddr.setColumns(10);
	getContentPane().add(textAddr,"4, 10, fill, default");

	label_2=new JLabel("備註：");
	label_2.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(label_2,"2, 12, right, default");

	textRemark=new JTextField();
	textRemark.setFont(new Font("細明體",Font.PLAIN,16));
	textRemark.setColumns(10);
	getContentPane().add(textRemark,"4, 12, fill, default");

	btnCreate=new JButton("建立");
	btnCreate.setFont(new Font("細明體",Font.PLAIN,16));
	getContentPane().add(btnCreate,"4, 14, left, default");

    }

    @Override
    public void initialize()
    {
	textName.setText("");
	textPhone.setText("");
	textPhoneowner.setText("");
	textRemark.setText("");
	textAddr.setText("");
	textID.setText("");
    }
}
