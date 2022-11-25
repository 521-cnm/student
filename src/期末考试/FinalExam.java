package 期末考试;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  Xitong extends JFrame{
	 JPanel pan,pan1,pan2,pan3;
	public void exam() {
		  setLayout(null);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setBounds(400, 150, 500, 500);
		JLabel lab1=new JLabel("管理员账号："); 
		JLabel lab2=new JLabel("密码："); 
		JLabel lab3=new JLabel("DS学生管理系统登录界面");
		JTextArea text1=new JTextArea();//输入账号
		JTextArea text2=new JTextArea();//输入密码
		JButton btn1=new JButton("登录");
		//设定透明效果
		 btn1.setOpaque(false);  
		 //去掉背景点击效果
		btn1.setContentAreaFilled(false);  
		 //去掉边框
		 btn1.setBorder(null); 
		 lab3.setFont(new Font("华文行楷",Font.ITALIC+Font.BOLD,32));
		 btn1.setFont(new Font("",Font.BOLD,20));
		 //字体颜色设置
		 lab1.setForeground(Color.CYAN);
		 lab2.setForeground(Color.CYAN);
		 lab3.setForeground(Color.CYAN);
		 btn1.setForeground(Color.CYAN);
		   add(lab1);
		   add(lab2);
		   add(lab3);
		   add(text1);
		   add(text2);
		   add(btn1);
		   //设置组件位置
		 lab1.setBounds(95, 160, 110, 20);
		 lab2.setBounds(120, 220, 70, 20);
		 lab3.setBounds(60, 60, 400, 60);
		 text1.setBounds(180, 163, 200, 20);
		 text2.setBounds(180, 220, 200, 20);
		 btn1.setBounds(230, 280, 70, 20);
		 //纯色背景
		 JLabel lab5=new JLabel();
			//设定透明效果
		 lab5.setOpaque(false);
		 lab5.setBounds(0, 0, 500, 500);
		 add(lab5);
		//获取一个图片
		 ImageIcon square4=new ImageIcon("C:\\Users\\倪桑\\Desktop\\表情\\心.jpg");
		 //设置图片的大小
		 square4.setImage(square4.getImage().getScaledInstance(500,500, 0));
		 //把图片放到按钮上	
		lab5.setIcon(square4);
		 setVisible(true);//窗体可视化
		 //给登录添加监听器
		 btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 String mima= "293015",zhanghao="2104191324";//邵子建密码,账号;
					 String mimas= "dongsiru123",zhanghaos="dsr01";//董思汝密码,账号;
					 String account=text1.getText();//获取账号
					 String password=text2.getText();//获取密码
					 if(password.equals(mima)&&account.equals(zhanghao)||password.equals(mimas)&&account.equals(zhanghaos)) {
						 setVisible(false);
							LogIn a =new LogIn();
							a.logIn();	
					 }
					 else {
						 JFrame jf=new JFrame("通知");
							JLabel lab=new JLabel("账号或密码错误！",JLabel.CENTER);//中间显示错误警告
							Font font5 = new Font("黑体", Font.PLAIN, 20);//字体设置 红色 20号
							lab.setFont(font5);
							lab.setForeground(Color.red);
							JButton W=new JButton("确定");
							W.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {
									
									jf.dispose();
									
								}});
							jf.add(W,BorderLayout.SOUTH);
							jf.add(lab,BorderLayout.CENTER);
							jf.setVisible(true);
							jf.setResizable(false);//窗体大小不可编辑
							jf.setBounds(400,400,350,200);
							jf.setDefaultCloseOperation(3);
					 }
	  }
		 });
  }
}
public class FinalExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Xitong a=new Xitong();
	         a.exam();
	}
}
