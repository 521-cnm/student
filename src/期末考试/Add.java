package ��ĩ����;
import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Add extends JFrame {
	public Add() {
			JLabel q=new JLabel("���кţ�");
			JTextField p=new JTextField();
			add(p).setBounds(120,25,170,20);
			add(q).setBounds(70,10,70,50);
			q.setForeground(Color.CYAN);
			JLabel q1=new JLabel("ѧ�ţ�");
			JTextField p1=new JTextField();
			add(p1).setBounds(120,65,170,20);
			add(q1).setBounds(80,50,50,50);
			q1.setForeground(Color.CYAN);
			JLabel q2=new JLabel("������");
			JTextField p2=new JTextField();
			add(p2).setBounds(120,105,170,20);
			add(q2).setBounds(80,90,50,50);
			q2.setForeground(Color.CYAN);
			JLabel q3=new JLabel("�Ա�");
			JTextField p3=new JTextField();
			add(p3).setBounds(120,145,170,20);
			add(q3).setBounds(80,130,50,50);
			q3.setForeground(Color.CYAN);
			JLabel q4=new JLabel("���䣺");
			JTextField p4=new JTextField();
			add(p4).setBounds(120,185,170,20);
			add(q4).setBounds(80,170,50,50);
			q4.setForeground(Color.CYAN);
			JLabel q5=new JLabel("���᣺");
			JTextField p5=new JTextField();
			add(p5).setBounds(120,225,170,20);
			add(q5).setBounds(80,210,50,50);
			q5.setForeground(Color.CYAN);
			JLabel q6=new JLabel("ѧԺ��");
			JTextField p6=new JTextField();
			add(p6).setBounds(120,265,170,20);
			add(q6).setBounds(80,250,50,50);
			q6.setForeground(Color.CYAN);
			//p6.setEditable(false);
			JLabel q7=new JLabel("רҵ��");
			JTextField p7=new JTextField();
			add(p7).setBounds(120,305,170,20);
			add(q7).setBounds(80,290,50,50);
		    q7.setForeground(Color.CYAN);
			//p7.setEditable(false);
			JButton bu1=new JButton("���");
			add(bu1).setBounds(165,350,70,30);
			bu1.setForeground(Color.CYAN);
			//�趨͸��Ч��
			 bu1.setOpaque(false);  
			 //ȥ���������Ч��
			bu1.setContentAreaFilled(false);  
			 //ȥ���߿�
			 bu1.setBorder(null); 
			 setLayout(null);
			setVisible(true);
			setBounds(200,200,400,450);
			//��ɫ����
			 JLabel lab5=new JLabel();
				//�趨͸��Ч��
			 lab5.setOpaque(false);
			 lab5.setBounds(0, 0, 500, 500);
			 add(lab5);
			//��ȡһ��ͼƬ
			 ImageIcon square4=new ImageIcon("C:\\Users\\��ɣ\\Desktop\\����\\��ɫ.jpg");
			 //����ͼƬ�Ĵ�С
			 square4.setImage(square4.getImage().getScaledInstance(500,500, 0));
			 //��ͼƬ�ŵ���ǩ��	
			lab5.setIcon(square4);
			add(lab5);
			setResizable(false);
			setDefaultCloseOperation(2);
			bu1.addActionListener(new ActionListener() {//��Ӱ�ť����
				public void actionPerformed(ActionEvent e) {
					 try{
				            //����Class.forName()����������������
				            Class.forName("com.mysql.cj.jdbc.Driver");
				            System.out.println("�ɹ�����MySQL������");
				        }catch(ClassNotFoundException e1){
				            System.out.println("�Ҳ���MySQL����!");
				            e1.printStackTrace();
				        }
				        String url="jdbc:mysql://localhost:3306/student";    //JDBC��URL    
				        //����DriverManager�����getConnection()���������һ��Connection����
				        Connection conn;
				        try {
				            conn = DriverManager.getConnection(url,    "root","123456");
				            //����һ��Statement����
				            Statement stmt = conn.createStatement(); //����Statement����
				      ResultSet rs =stmt.executeQuery("select * from student");
				      PreparedStatement pst = conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");//����ִ��SQL����ѯ����sql������Ԥ���봦��
						String g=p.getText();
						String g1=p1.getText();
						String g2=p2.getText();
						String g3=p3.getText();
						String g4=p4.getText();
						String g5=p5.getText();
						String g6=p6.getText();
						String g7=p7.getText();
				        pst.setString(1, g);
						pst.setString(2, g1);
						pst.setString(3, g2);
						pst.setString(4, g3);
						pst.setString(5, g4);
						pst.setString(6, g5);
						pst.setString(7, g6);
						pst.setString(8, g7);
						pst.executeUpdate();
				            System.out.print("�ɹ����ӵ����ݿ⣡");
				            stmt.close();
				            conn.close();
				        } catch (SQLException e1){
				            e1.printStackTrace();
				        }
				   
				}});
	}
}