package pojo;

/**
 * RcJl entity. @author MyEclipse Persistence Tools
 */

public class RcJl implements java.io.Serializable {

	// Fields

	private Integer id;
	private RcUser rcUser;

	// Constructors

	/** default constructor */
	public RcJl() {
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