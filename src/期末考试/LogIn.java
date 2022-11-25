package 期末考试;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LogIn extends JFrame {
	public  void logIn() {
				setTitle("学生信息界面");
				setBounds(400, 150, 500, 500);
				 setLayout(null);//窗体布局为空
				 setDefaultCloseOperation(EXIT_ON_CLOSE);
				 JLabel lab1=new JLabel("查询");
				 JLabel lab2=new JLabel("全部");
				 JLabel lab3=new JLabel("添加");
				 JLabel lab4=new JLabel("修改");
			 //字体
			 lab1.setFont(new Font("华文行楷",Font.BOLD,40));
			 lab2.setFont(new Font("华文行楷",Font.BOLD,40));
			 lab3.setFont(new Font("华文行楷",Font.BOLD,40));
			 lab4.setFont(new Font("华文行楷",Font.BOLD,40));
			 JLabel  lab=new JLabel("欢迎来到DS学生管理系统");
			 lab.setFont(new Font("华文行楷",Font.ITALIC+Font.BOLD,32));
			 JButton btn2=new JButton();//查询
			//获取一个图片
			 ImageIcon square=new ImageIcon("C:\\Users\\倪桑\\Desktop\\表情\\挠头.gif");
			 //设置图片的大小
			 square.setImage(square.getImage().getScaledInstance(130,130, 0));
			 //把图片放到按钮上	
			btn2.setIcon(square);
			//设定透明效果
			 btn2.setOpaque(false);  
			 //去掉背景点击效果
			btn2.setContentAreaFilled(false);  
			 //去掉边框
			 btn2.setBorder(null); 
				 JButton btn3=new JButton();//查询
					//获取一个图片
					 ImageIcon square1=new ImageIcon("C:\\Users\\倪桑\\Desktop\\表情\\彩色.gif");
					 //设置图片的大小
					 square1.setImage(square1.getImage().getScaledInstance(130,130, 0));
					 //把图片放到按钮上	
					btn3.setIcon(square1);
					//设定透明效果
					 btn3.setOpaque(false);  
					 //去掉背景点击效果
					btn3.setContentAreaFilled(false);  
					 //去掉边框
					 btn3.setBorder(null); 
				 lab1.setBounds(310, 170, 130, 130);//全部
				  lab2.setBounds(95, 170, 130, 130);//查询
				  lab3.setBounds(95, 320, 130, 130);//添加
				  lab4.setBounds(310, 320, 130, 130);//修改
				 add(lab1);
				 add(lab2);
				 add(lab3);
				 add(lab4);
				 JButton btn11=new JButton();//添加
				//获取一个图片
				 ImageIcon square2=new ImageIcon("C:\\Users\\倪桑\\Desktop\\表情\\要饭.gif");
				 //设置图片的大小
				 square2.setImage(square2.getImage().getScaledInstance(130,130, 0));
				 //把图片放到按钮上	
				btn11.setIcon(square2);
				//设定透明效果
				 btn11.setOpaque(false);  
				 //去掉背景点击效果
				btn11.setContentAreaFilled(false);  
				 //去掉边框
				 btn11.setBorder(null); 
				 JButton btn13=new JButton();//修改
				//获取一个图片
				 ImageIcon square3=new ImageIcon("C:\\Users\\倪桑\\Desktop\\表情\\摇摆.gif");
				 //设置图片的大小
				 square3.setImage(square3.getImage().getScaledInstance(130,130, 0));
				 //把图片放到按钮上	
				btn13.setIcon(square3);
				//设定透明效果
				 btn13.setOpaque(false);  
				 //去掉背景点击效果
				btn13.setContentAreaFilled(false);  
				 //去掉边框
				 btn13.setBorder(null); 
				add(btn2);
				 add(btn3);
				 btn2.setBounds(290, 170, 130, 130);//查询
				 btn3.setBounds(75, 170, 130, 130);//全部
				 add(btn11);
				 add(btn13);
				 btn11.setBounds(75, 320, 130, 130);//添加
				 btn13.setBounds(290, 320, 130, 130);//修改
				 add(lab).setBounds(60, 100, 400, 40);
				 //景色背景
				 JLabel lab5=new JLabel();
					//设定透明效果
				 lab5.setOpaque(false);
				 lab5.setBounds(0, 0, 500, 500);
				 add(lab5);
				//获取一个图片
				 ImageIcon square4=new ImageIcon("C:\\Users\\倪桑\\Desktop\\表情\\景色.jpg");
				 //设置图片的大小
				 square4.setImage(square4.getImage().getScaledInstance(500,500, 0));
				 //把图片放到按钮上	
				lab5.setIcon(square4);
				 setResizable(false);
				 setVisible(true);
				 //给查询添加监听器
				 btn2.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					Find b=new Find();
		 					b.find();
		 				} 
		 			 });
				 //给全部 添加监听器
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
				 //给添加 添加监听器
				 btn11.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					Add b=new Add();
		 				} 
		 			 });
				 //给修改添加监听器
				 btn13.addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					// TODO Auto-generated method stub
		 					Change b=new Change();
		 				} 
		 			 });
	 		}
	 	}

