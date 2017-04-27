package test;
import org.hibernate.Session;

import dao.RcCompanyDAO;
import dao.RcUserDAO;
import dao.RcZpDAO;
import pojo.RcCompany;
import pojo.RcUser;
import pojo.RcZp;

public class TestDao {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		/* 发布/修改
		* 个人投递简历
		* 个人删除简历
		* 公司发布招聘
		* 公司删除招聘*/
		
		/* 查询/分页
		 * 简历 1.时间查询 2.薪资查询 3.职位查询
		 * 招聘 1.公司查询 2.职位查询  3.地区查询
		 * 
		 * */
		RcUserDAO rcUserDAO = new RcUserDAO();
		
		//新建一个用户
		RcUser rcUser = new RcUser();
		rcUser.setName("burt1");
		rcUser.setPass("hello1");
		
		rcUserDAO.save(rcUser);
		//删除一个用户
		
		
		//RcZpDAO rcZpDAO = new RcZpDAO();

		//公司发布招聘信息
		/*RcZp rcZp = new RcZp();
		RcCompany company = new RcCompanyDAO().findById(1);
		rcZp.setCId(company);
		rcZp.setZpInformation("大风集团招聘董事长");
		rcZpDAO.save(rcZp);*/

		/*//公司删除招聘信息
		RcZp rcZp2 = rcZpDAO.findById(1);
		rcZpDAO.delete(rcZp2);
		 //System.out.println(rcZp2);
		 */		
		
		
		//RcCompanyDAO rcCompanyDAO = new RcCompanyDAO();
		//删除一个公司
		/*RcCompany company = rcCompanyDAO.findById(1);
		rcCompanyDAO.delete(company);*/
		//增加一个公司
		/*RcCompany rcCompany = new RcCompany();
		rcCompany.setCName("大风集团");
		rcCompanyDAO.save(rcCompany);*/
		

	}

}
