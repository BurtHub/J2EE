package dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.RcJl;

/**
 * A data access object (DAO) providing persistence and search support for RcJl
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see pojo.RcJl
 * @author MyEclipse Persistence Tools
 */

public class RcJlDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(RcJlDAO.class);

	public void save(RcJl transientInstance) {
		log.debug("saving RcJl instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RcJl persistentInstance) {
		log.debug("deleting RcJl instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RcJl findById(java.lang.Integer id) {
		log.debug("getting RcJl instance with id: " + id);
		try {
			RcJl instance = (RcJl) getSession().get("pojo.RcJl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RcJl instance) {
		log.debug("finding RcJl instance by example");
		try {
			List results = getSession().createCriteria("pojo.RcJl")
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
		log.debug("finding RcJl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RcJl as model where model."
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
		log.debug("finding all RcJl instances");
		try {
			String queryString = "from RcJl";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RcJl merge(RcJl detachedInstance) {
		log.debug("merging RcJl instance");
		try {
			RcJl result = (RcJl) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RcJl instance) {
		log.debug("attaching dirty RcJl instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RcJl instance) {
		log.debug("attaching clean RcJl instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}