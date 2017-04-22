package test;
import org.hibernate.Session;

import dao.RcZpDAO;
import pojo.RcZp;

public class TestDao {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RcZp rcZp = new RcZp();
		rcZp.setCId(2);
		
		rcZp.setZpInformation("大风集团招聘董事长");
		RcZpDAO rcZpDAO = new RcZpDAO();
		
		rcZpDAO.save(rcZp);

	}

}
