package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * RcCompany entity. @author MyEclipse Persistence Tools
 */

public class RcCompany implements java.io.Serializable {

	// Fields

	private Integer id;
	private String CName;
	
	private Set<RcZp> zpInfoSet =new HashSet<RcZp>();
	

	// Constructors

	public Set<RcZp> getZpInfoSet() {
		return zpInfoSet;
	}

	public void setZpInfoSet(Set<RcZp> zpInfoSet) {
		this.zpInfoSet = zpInfoSet;
	}

	/** default constructor */
	public RcCompany() {
	}

	/** full constructor */
	public RcCompany(String CName) {
		this.CName = CName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

}