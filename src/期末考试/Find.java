package ��ĩ����;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Find extends JFrame {
	JLabel q,q1,q2,q3,q4,q5,q6;
	JLabel id,names,sex,age,address,collage,major;
	JButton btn2=new JButton("��ѯ");
	 JLabel lab3=new JLabel("����������"); 
	 JTextField text3=new JTextField(20);
	public  void find() {
		setTitle("ѧ����Ϣ����");
	 setBounds(400, 150, 1500, 1800);
		setLayout(null);
		    JPanel jp=new JPanel();
		  //�趨͸��Ч��
		    jp.setOpaque(false);
		    jp.setLayout(null);//�м����Ĳ���Ϊ��
		    jp.setBounds(10, 30, 300, 300);
				 q1=new JLabel("���к�");
				  id=new JLabel();
				jp.add(id).setBounds(120,65,170,20);
				jp.add(q1).setBounds(80,10,50,50);
				id.setForeground(Color.CYAN);
				q1.setForeground(Color.CYAN);
				q=new JLabel("ѧ�ţ�");
				names=new JLabel();
				jp.add(names).setBounds(120,25,170,20);
				jp.add(q).setBounds(80,50,50,50);
				names.setForeground(Color.CYAN);
				q.setForeground(Color.CYAN);
				 q2=new JLabel("�Ա�");
				 sex=new JLabel();
				jp.add(sex).setBounds(120,105,170,20);
				jp.add(q2).setBounds(80,90,50,50);
				sex.setForeground(Color.CYAN);
				q2.setForeground(Color.CYAN);
				 q3=new JLabel("���䣺");
				 age=new JLabel();
				jp.add(age).setBounds(120,145,170,20);
				jp.add(q3).setBounds(80,130,50,50);
				age.setForeground(Color.CYAN);
				q3.setForeground(Color.CYAN);
				 q4=new JLabel("���᣺");
				 address=new JLabel();
				jp.add(address).setBounds(120,185,170,20);
				jp.add(q4).setBounds(80,170,50,50);
				address.setForeground(Color.CYAN);
				q4.setForeground(Color.CYAN);
				 q5=new JLabel("ѧԺ��");
				 collage=new JLabel();
			    jp. add(collage).setBounds(120,225,170,20);
				jp.add(q5).setBounds(80,210,50,50);
				collage.setForeground(Color.CYAN);
				q5.setForeground(Color.CYAN);
				 q6=new JLabel("רҵ��");
				 major=new JLabel();
				jp.add(major).setBounds(120,265,170,20);
			     jp.add(q6).setBounds(80,250,50,50);
			    major.setForeground(Color.CYAN);
			    q6.setForeground(Color.CYAN);
				 add(btn2).setBounds(270, 15, 60, 20);
				 btn2.setForeground(Color.CYAN);
					//�趨͸��Ч��
					 btn2.setOpaque(false);  
					 //ȥ���������Ч��
					btn2.setContentAreaFilled(false);  
					 //ȥ���߿�
					 btn2.setBorder(null); 
				 add(lab3).setBounds(60, 17, 80, 20);
				 add(text3).setBounds(140, 17, 120, 20);
				add(jp);
		       setVisible(true);
		       setBounds(200,200,400,400);
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
		       setDefaultCloseOperation(3);
		   btn2.addActionListener(new ActionListener() {//��ѯ��ť����
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//���ݿ�����
		    Statement stmt = null;
		    ResultSet rs = null;
		    Connection conn = null;
		    String sql = "select * from student";
			try {
				// 1. ע�����ݿ������
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			// 2.ͨ��DriverManager��ȡ���ݿ�����
			String url = "jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
			String username = "root";
			String password = "123456";
			try {
			conn = DriverManager.getConnection(url, username, password);
			// 3.ͨ��Connection�����ȡStatement����
			stmt = conn.createStatement();
			// 4.ʹ��Statementִ��SQL��䡣
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
						 if(rs.getString("name").equals(text3.getText())) {
							names.setText(rs.getString("stuNum"));
							id.setText(rs.getString("id"));
							sex.setText(rs.getString("sex"));
							age.setText(rs.getString("age"));
							address.setText(rs.getString("address"));
							collage.setText(rs.getString("collage"));
							major.setText(rs.getString("major"));
							break;
						 }
						 else {
							 names.setText("��");
								id.setText("��");
								sex.setText("��");
								age.setText("��");
								address.setText("��");
								collage.setText("��");
								major.setText("��");
						 } 
					}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally {
						try {
							conn.close();
						} catch (SQLException ar) {
							ar.printStackTrace();
						}
					}
				}
			});
		   setDefaultCloseOperation(2);
	}
	 	}

