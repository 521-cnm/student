package ��ĩ����;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  Xitong extends JFrame{
	 JPanel pan,pan1,pan2,pan3;
	public void exam() {
		  setLayout(null);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		  setBounds(400, 150, 500, 500);
		JLabel lab1=new JLabel("����Ա�˺ţ�"); 
		JLabel lab2=new JLabel("���룺"); 
		JLabel lab3=new JLabel("DSѧ������ϵͳ��¼����");
		JTextArea text1=new JTextArea();//�����˺�
		JTextArea text2=new JTextArea();//��������
		JButton btn1=new JButton("��¼");
		//�趨͸��Ч��
		 btn1.setOpaque(false);  
		 //ȥ���������Ч��
		btn1.setContentAreaFilled(false);  
		 //ȥ���߿�
		 btn1.setBorder(null); 
		 lab3.setFont(new Font("�����п�",Font.ITALIC+Font.BOLD,32));
		 btn1.setFont(new Font("",Font.BOLD,20));
		 //������ɫ����
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
		   //�������λ��
		 lab1.setBounds(95, 160, 110, 20);
		 lab2.setBounds(120, 220, 70, 20);
		 lab3.setBounds(60, 60, 400, 60);
		 text1.setBounds(180, 163, 200, 20);
		 text2.setBounds(180, 220, 200, 20);
		 btn1.setBounds(230, 280, 70, 20);
		 //��ɫ����
		 JLabel lab5=new JLabel();
			//�趨͸��Ч��
		 lab5.setOpaque(false);
		 lab5.setBounds(0, 0, 500, 500);
		 add(lab5);
		//��ȡһ��ͼƬ
		 ImageIcon square4=new ImageIcon("C:\\Users\\��ɣ\\Desktop\\����\\��.jpg");
		 //����ͼƬ�Ĵ�С
		 square4.setImage(square4.getImage().getScaledInstance(500,500, 0));
		 //��ͼƬ�ŵ���ť��	
		lab5.setIcon(square4);
		 setVisible(true);//������ӻ�
		 //����¼��Ӽ�����
		 btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 String mima= "293015",zhanghao="2104191324";//���ӽ�����,�˺�;
					 String mimas= "dongsiru123",zhanghaos="dsr01";//��˼������,�˺�;
					 String account=text1.getText();//��ȡ�˺�
					 String password=text2.getText();//��ȡ����
					 if(password.equals(mima)&&account.equals(zhanghao)||password.equals(mimas)&&account.equals(zhanghaos)) {
						 setVisible(false);
							LogIn a =new LogIn();
							a.logIn();	
					 }
					 else {
						 JFrame jf=new JFrame("֪ͨ");
							JLabel lab=new JLabel("�˺Ż��������",JLabel.CENTER);//�м���ʾ���󾯸�
							Font font5 = new Font("����", Font.PLAIN, 20);//�������� ��ɫ 20��
							lab.setFont(font5);
							lab.setForeground(Color.red);
							JButton W=new JButton("ȷ��");
							W.addActionListener(new ActionListener() {

								public void actionPerformed(ActionEvent e) {
									
									jf.dispose();
									
								}});
							jf.add(W,BorderLayout.SOUTH);
							jf.add(lab,BorderLayout.CENTER);
							jf.setVisible(true);
							jf.setResizable(false);//�����С���ɱ༭
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
