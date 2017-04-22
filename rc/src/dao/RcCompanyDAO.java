package dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pojo.RcCompany;

/**
 * A data access object (DAO) providing persistence and search support for
 * RcCompany entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see pojo.RcCompany
 * @author MyEclipse Persistence Tools
 */

public class RcCompanyDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RcCompanyDAO.class);

	public void save(RcCompany transientInstance) {
		log.debug("saving RcCompany instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RcCompany persistentInstance) {
		log.debug("deleting RcCompany instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RcCompany findById(java.lang.Integer id) {
		log.debug("getting RcCompany instance with id: " + id);
		try {
			RcCompany instance = (RcCompany) getSession().get("pojo.RcCompany",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RcCompany instance) {
		log.debug("finding RcCompany instance by example");
		try {
			List results = getSession().createCriteria("pojo.RcCompany")
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
		log.debug("finding RcCompany instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RcCompany as model where model."
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
		log.debug("finding all RcCompany instances");
		try {
			String queryString = "from RcCompany";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RcCompany merge(RcCompany detachedInstance) {
		log.debug("merging RcCompany instance");
		try {
			RcCompany result = (RcCompany) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RcCompany instance) {
		log.debug("attaching dirty RcCompany instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RcCompany instance) {
		log.debug("attaching clean RcCompany instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}