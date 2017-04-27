package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * RcUser entity. @author MyEclipse Persistence Tools
 */

public class RcUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String pass;
	
	@Override
	public String toString() {
		return "RcUser [id=" + id + ", name=" + name + ", pass=" + pass
				+ ", zpInfoSet=" + zpInfoSet + "]";
	}

	private Set<RcJl> zpInfoSet =new HashSet<RcJl>();

	// Constructors

	public Set<RcJl> getZpInfoSet() {
		return zpInfoSet;
	}

	public void setZpInfoSet(Set<RcJl> zpInfoSet) {
		this.zpInfoSet = zpInfoSet;
	}

	/** default constructor */
	public RcUser() {
	}

	/** minimal constructor */
	public RcUser(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

}