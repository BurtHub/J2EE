package dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.RcZp;

/**
 * A data access object (DAO) providing persistence and search support for RcZp
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see pojo.RcZp
 * @author MyEclipse Persistence Tools
 */

public class RcZpDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(RcZpDAO.class);

	public void save(RcZp transientInstance) {
		log.debug("saving RcZp instance");
		try {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			session.save(transientInstance);
			transaction.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RcZp persistentInstance) {
		log.debug("deleting RcZp instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RcZp findById(java.lang.Integer id) {
		log.debug("getting RcZp instance with id: " + id);
		try {
			RcZp instance = (RcZp) getSession().get("pojo.RcZp", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RcZp instance) {
		log.debug("finding RcZp instance by example");
		try {
			List results = getSession().createCriteria("pojo.RcZp")
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
		log.debug("finding RcZp instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RcZp as model where model."
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
		log.debug("finding all RcZp instances");
		try {
			String queryString = "from RcZp";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RcZp merge(RcZp detachedInstance) {
		log.debug("merging RcZp instance");
		try {
			RcZp result = (RcZp) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RcZp instance) {
		log.debug("attaching dirty RcZp instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RcZp instance) {
		log.debug("attaching clean RcZp instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}