package ��ĩ����;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class All extends JFrame {
	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
	String USER = "root";
	String PASS = "123456";
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet res = null;
	JTable jtable;
	JScrollPane js = new JScrollPane();
	Vector columnNames = null;//��̬���� ��ͷ
	Vector rowData = null;//ÿһ�е�����
	public void add() throws Exception {
	   columnNames = new Vector();//����һ��Ĭ��ֵΪ10������
		columnNames.add("���к�");
		columnNames.add("ѧ��");
		columnNames.add("����");
		columnNames.add("�Ա�");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("ѧԺ");
		columnNames.add("רҵ");
		rowData = new Vector();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//���ݿ�����
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			ps = conn.prepareStatement("SELECT * FROM student");//student��
			res = ps.executeQuery();
			while (res.next()) {
				Vector hang = new Vector();
				hang.add(res.getString(1));
				hang.add(res.getString(2));
				hang.add(res.getString(3));
				hang.add(res.getString(4));
				hang.add(res.getString(5));
				hang.add(res.getString(6));
				hang.add(res.getString(7));
				hang.add(res.getString(8));
				rowData.add(hang);
			}
			System.out.println("�ɹ�����");
		} catch (Exception q) {
			q.printStackTrace();
			System.out.println("ʧ��");
		} finally {
			try {
				res.close();
				ps.close();
				conn.close();
				System.out.println("�ɹ��ر�");
			} catch (SQLException o) {
				o.printStackTrace();
				System.out.println("�ر�ʧ��");
			}
		}
		jtable = new JTable(rowData, columnNames);//�Ա����ʽ���֣�
		jtable.setGridColor(Color.BLACK);//������Ϊ��ɫ
		jtable.getTableHeader().setResizingAllowed(false);//��Ԫ��񲻿ɸ��Ĵ�С
		js = new JScrollPane(jtable);
		add(js);
		setTitle("���ѧ����Ϣ");
		setBounds(400, 150, 1000, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(2);
	}
	}