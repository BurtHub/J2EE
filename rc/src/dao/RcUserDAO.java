package dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.RcUser;

/**
 * A data access object (DAO) providing persistence and search support for
 * RcUser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see pojo.RcUser
 * @author MyEclipse Persistence Tools
 */

public class RcUserDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(RcUserDAO.class);

	public void save(RcUser transientInstance) {
		log.debug("saving RcUser instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RcUser persistentInstance) {
		log.debug("deleting RcUser instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RcUser findById(java.lang.Integer id) {
		log.debug("getting RcUser instance with id: " + id);
		try {
			RcUser instance = (RcUser) getSession().get("pojo.RcUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RcUser instance) {
		log.debug("finding RcUser instance by example");
		try {
			List results = getSession().createCriteria("pojo.RcUser")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RcUser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RcUser as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RcUser instances");
		try {
			String queryString = "from RcUser";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RcUser merge(RcUser detachedInstance) {
		log.debug("merging RcUser instance");
		try {
			RcUser result = (RcUser) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RcUser instance) {
		log.debug("attaching dirty RcUser instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RcUser instance) {
		log.debug("attaching clean RcUser instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}