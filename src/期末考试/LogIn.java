package ��ĩ����;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LogIn extends JFrame {
	public  void logIn() {
				setTitle("ѧ����Ϣ����");
				setBounds(400, 150, 500, 500);
				 setLayout(null);//���岼��Ϊ��
				 setDefaultCloseOperation(EXIT_ON_CLOSE);
				 JLabel lab1=new JLabel("��ѯ");
				 JLabel lab2=new JLabel("ȫ��");
				 JLabel lab3=new JLabel("���");
				 JLabel lab4=new JLabel("�޸�");
			 //����
			 lab1.setFont(new Font("�����п�",Font.BOLD,40));
			 lab2.setFont(new Font("�����п�",Font.BOLD,40));
			 lab3.setFont(new Font("�����п�",Font.BOLD,40));
			 lab4.setFont(new Font("�����п�",Font.BOLD,40));
			 JLabel  lab=new JLabel("��ӭ����DSѧ������ϵͳ");
			 lab.setFont(new Font("�����п�",Font.ITALIC+Font.BOLD,32));
			 JButton btn2=new JButton();//��ѯ
			//��ȡһ��ͼƬ
			 ImageIcon square=new ImageIcon("C:\\Users\\��ɣ\\Desktop\\����\\��ͷ.gif");
			 //����ͼƬ�Ĵ�С
			 square.setImage(square.getImage().getScaledInstance(130,130, 0));
			 //��ͼƬ�ŵ���ť��	
			btn2.setIcon(square);
			//�趨͸��Ч��
			 btn2.setOpaque(false);  
			 //ȥ���������Ч��
			btn2.setContentAreaFilled(false);  
			 //ȥ���߿�
			 btn2.setBorder(null); 
				 JButton btn3=new JButton();//��ѯ
					//��ȡһ��ͼƬ
					 ImageIcon square1=new ImageIcon("C:\\Users\\��ɣ\\Desktop\\����\\��ɫ.gif");
					 //����ͼƬ�Ĵ�С
					 square1.setImage(square1.getImage().getScaledInstance(130,130, 0));
					 //��ͼƬ�ŵ���ť��	
					btn3.setIcon(square1);
					//�趨͸��Ч��
					 btn3.setOpaque(false);  
					 //ȥ���������Ч��
					btn3.setContentAreaFilled(false);  
					 //ȥ���߿�
					 btn3.setBorder(null); 
				 lab1.setBounds(310, 170, 130, 130);//ȫ��
				  lab2.setBounds(95, 170, 130, 130);//��ѯ
				  lab3.setBounds(95, 320, 130, 130);//���
				  lab4.setBounds(310, 320, 130, 130);//�޸�
				 add(lab1);
				 add(lab2);
				 add(lab3);
				 add(lab4);
				 JButton btn11=new JButton();//���
				//��ȡһ��ͼƬ
				 ImageIcon square2=new ImageIcon("C:\\Users\\��ɣ\\Desktop\\����\\Ҫ��.gif");
				 //����ͼƬ�Ĵ�С
				 square2.setImage(square2.getImage().getScaledInstance(130,130, 0));
				 //��ͼƬ�ŵ���ť��	
				btn11.setIcon(square2);
				//�趨͸��Ч��
				 btn11.setOpaque(false);  
				 //ȥ���������Ч��
				btn11.setContentAreaFilled(false);  
				 //ȥ���߿�
				 btn11.setBorder(null); 
				 JButton btn13=new JButton();//�޸�
				//��ȡһ��ͼƬ
				 ImageIcon square3=new ImageIcon("C:\\Users\\��ɣ\\Desktop\\����\\ҡ��.gif");
				 //����ͼƬ�Ĵ�С
				 square3.setImage(square3.getImage().getScaledInstance(130,130, 0));
				 //��ͼƬ�ŵ���ť��	
				btn13.setIcon(square3);
				//�趨͸��Ч��
				 btn13.setOpaque(false);  
				 //ȥ���������Ч��
				btn13.setContentAreaFilled(false);  
				 //ȥ���߿�
				 btn13.setBorder(null); 
				add(btn2);
				 add(btn3);
				 btn2.setBounds(290, 170, 130, 130);//��ѯ
				 btn3.setBounds(75, 170, 130, 130);//ȫ��
				 add(btn11);
				 add(btn13);
				 btn11.setBounds(75, 320, 130, 130);//���
				 btn13.setBounds(290, 320, 130, 130);//�޸�
				 add(lab).setBounds(60, 100, 400, 40);
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
				 //��ͼƬ�ŵ���ť��	
				lab5.setIcon(square4);
				 setResizable(false);
				 setVisible(true);
				 //����ѯ��Ӽ�����
				 btn2.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					Find b=new Find();
		 					b.find();
		 				} 
		 			 });
				 //��ȫ�� ��Ӽ�����
				 btn3.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					 All a=new  All();
		 					 try {
								a.add();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		 				} 
		 			 });
				 //����� ��Ӽ�����
				 btn11.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					Add b=new Add();
		 				} 
		 			 });
				 //���޸���Ӽ�����
				 btn13.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					Change b=new Change();
		 				} 
		 			 });
	 		}
	 	}

