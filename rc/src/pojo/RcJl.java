package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * RcJl entity. @author MyEclipse Persistence Tools
 */

public class RcJl implements java.io.Serializable {

	// Fields

	private Integer id;
	private RcUser rcUser;
	private String jlInformation;
	// Constructors

	

	public String getJlInformation() {
		return jlInformation;
	}

	public void setJlInformation(String jlInformation) {
		this.jlInformation = jlInformation;
	}

	/** default constructor */
	public RcJl() {
	}

	@Override
	public String toString() {
		return "RcJl [id=" + id + ", rcUser=" + rcUser + "]";
	}

	/** full constructor */
	public RcJl(RcUser rcUser) {
		this.rcUser = rcUser;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RcUser getRcUser() {
		return this.rcUser;
	}

	public void setRcUser(RcUser rcUser) {
		this.rcUser = rcUser;
	}

}