package DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class DB_Connection {

	public static final Connection getConnection(String TableName){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		return conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+TableName, "root", "root");
		
		}catch(Exception e) 
		{System.out.println("�����쳣");
		return conn;}
	}

}
/******************************************//*
public List<Blog> findAll(){
	String sql="select * from "+TableName;
	ArrayList<Blog> list=null;
	try {
		pst=conn.prepareStatement(sql);
		rs= pst.executeQuery();
		list=new ArrayList<Blog>();
		Blog blog;
		while(rs.next()){
			blog=new Blog();
			blog.setId(rs.getInt("id"));//id
			blog.setTitle(rs.getString("title"));//title
			blog.setContent(rs.getString("content"));//content
			blog.setCategory(rs.getInt("category"));//category
			blog.setTime(rs.getTime("time"));//time
			blog.setAuthor(rs.getString("author"));//author
			list.add(blog);
		}
		System.out.println("��ѯ�ɹ�");
		
	} catch (SQLException e) {System.out.println("��ѯʧ��");}
	return list;
}		*/
/****************************ע�ͷָ���***************************/
		/*public void find(String username){
			String sql="select password from "+TableName+" where userName=?";
			try {
				pst=conn.prepareStatement(sql);
				pst.setString(1, username);
				rs= pst.executeQuery();
				System.out.println("��ѯ���˳ɹ�");
			} catch (SQLException e) {System.out.println("��ѯ����ʧ��");}
				
		}
		public void update(String username,String password){
			String sql="update "+TableName+" set password=? where username=?";
			try {
				pst=conn.prepareStatement(sql);
				pst.setString(1, password);
				pst.setString(2, username);
				pst.executeUpdate();
				System.out.println("���³ɹ�");
			} catch (SQLException e) {System.out.println("����ʧ��");}
				
		}
		public void delete(String username){
			String sql="delete from "+TableName+" where userName=?";
			try {
				pst=conn.prepareStatement(sql);
				pst.setString(1, username);
				pst.execute();
				System.out.println("ɾ���ɹ�");
			} catch (SQLException e) {System.out.println("ɾ��ʧ��");}
				
		}
		public void insert(String username,String password){
			String sql="insert into "+TableName+" (username,password) values(?,?)";
			try {
				pst=conn.prepareStatement(sql);
				pst.setString(1, username);
				pst.setString(2, password);
				pst.execute();
				System.out.println("����ɹ�");
			} catch (SQLException e) {System.out.println("����ʧ��");}
				
		}*/
		
		
		
