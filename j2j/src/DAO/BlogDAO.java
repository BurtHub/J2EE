package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import VO.Blog;

public class BlogDAO {
	private Connection conn;
	private final String TableName="blog";
	{conn= DB_Connection.getConnection(TableName);}
	
	
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	
	
	
	public void doCreate(){
		
	}
	public void doUpdate(){
		
	}
	public void update(){
		
	}
	public void doDelete(){
		
	}
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
				blog.setCategoryId(rs.getInt("category"));//category
				blog.setCreatedTime(rs.getTime("time"));//time
				blog.setAuthor(rs.getString("author"));//author
				list.add(blog);
			}
			System.out.println("查询成功");
			
		} catch (SQLException e) {System.out.println("查询失败");}
		return list;
		
	}
	public Blog findById(int id){
		Blog blog=null;
		String sql="select * from "+TableName+"where id=?";
		try {
			pst=this.conn.prepareStatement(sql);
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				blog=new Blog();
				blog.setId(rs.getInt("id"));//id
				blog.setTitle(rs.getString("title"));//title
				blog.setContent(rs.getString("content"));//content
				blog.setCategoryId(rs.getInt("category"));//category
				blog.setCreatedTime(rs.getTime("time"));//time
				blog.setAuthor(rs.getString("author"));//author
				
			}
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return blog;
		
	}
	public Blog findByCategoryId(int id){
		Blog blog=null;
		String sql="select * from "+TableName+"where id=?";
		try {
			pst=this.conn.prepareStatement(sql);
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				blog=new Blog();
				blog.setId(rs.getInt("id"));//id
				blog.setTitle(rs.getString("title"));//title
				blog.setContent(rs.getString("content"));//content
				blog.setCategoryId(rs.getInt("category"));//category
				blog.setCreatedTime(rs.getTime("time"));//time
				blog.setAuthor(rs.getString("author"));//author
			}
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {e.printStackTrace();}	
		return blog;
	}
	
	
	public List<Blog> findByKeywords(String Keywords){
		Blog blog=null;
		ArrayList<Blog> list=null;
		/*String sql="select * from "+TableName+" where  title like '%1%' or  content like '%不%' ";*/
		String sql="select * from "+TableName+" where  " +
		"title like ? or  content like ?";
		try {
			pst=conn.prepareStatement(sql);
			list=new ArrayList<Blog>();
			//?%'
			pst.setString(1,"%"+Keywords+"%");
			pst.setString(2,"%"+Keywords+"%");
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				blog=new Blog();
				blog.setId(rs.getInt("id"));//id
				System.out.println(blog.getId());
				blog.setTitle(rs.getString("title"));//title
				System.out.println(blog.getTitle());
				blog.setContent(rs.getString("content"));//content
				System.out.println(blog.getContent());
				//blog.setCategoryId(rs.getInt("category"));//category
				//blog.setCreatedTime(rs.getTime("time"));//time
				//blog.setAuthor(rs.getString("author"));//author
				list.add(blog);
			}
			System.out.println("chauxn cicic");
			rs.close();
			pst.close();
			conn.close();
		} catch (SQLException e) {e.printStackTrace();}
		return list;
	}
}
