package VO;

import java.util.Date;

public class Blog {
	//���ڣ����⣬���ݣ����ߣ����࣬
	//����(��������һ�����������ID���й���)
private int id;
private String title;
private String content;
private String author;
private int CategoryId;
private String CategoryName;
private Date CreatedTime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getCategoryId() {
	return CategoryId;
}
public void setCategoryId(int categoryId) {
	CategoryId = categoryId;
}
public String getCategoryName() {
	return CategoryName;
}
public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}
public Date getCreatedTime() {
	return CreatedTime;
}
public void setCreatedTime(Date createdTime) {
	CreatedTime = createdTime;
}



}
