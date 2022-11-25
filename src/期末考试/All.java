package 期末考试;
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
	Vector columnNames = null;//动态数组 表头
	Vector rowData = null;//每一行的数据
	public void add() throws Exception {
	   columnNames = new Vector();//创建一个默认值为10的向量
		columnNames.add("序列号");
		columnNames.add("学号");
		columnNames.add("姓名");
		columnNames.add("性别");
		columnNames.add("年龄");
		columnNames.add("籍贯");
		columnNames.add("学院");
		columnNames.add("专业");
		rowData = new Vector();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//数据库连接
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			ps = conn.prepareStatement("SELECT * FROM student");//student表
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
			System.out.println("成功载入");
		} catch (Exception q) {
			q.printStackTrace();
			System.out.println("失败");
		} finally {
			try {
				res.close();
				ps.close();
				conn.close();
				System.out.println("成功关闭");
			} catch (SQLException o) {
				o.printStackTrace();
				System.out.println("关闭失败");
			}
		}
		jtable = new JTable(rowData, columnNames);//以表格形式呈现，
		jtable.setGridColor(Color.BLACK);//坐标线为黑色
		jtable.getTableHeader().setResizingAllowed(false);//单元表格不可更改大小
		js = new JScrollPane(jtable);
		add(js);
		setTitle("浏览学生信息");
		setBounds(400, 150, 1000, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(2);
	}
	}