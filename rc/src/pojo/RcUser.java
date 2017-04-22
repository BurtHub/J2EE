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
	

	// Constructors

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