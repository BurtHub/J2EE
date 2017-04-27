package pojo;

/**
 * RcZp entity. @author MyEclipse Persistence Tools
 */

public class RcZp implements java.io.Serializable {

	// Fields

	private Integer id;
	private RcCompany CId;
	private String zpInformation;

	// Constructors

	/** default constructor */
	public RcZp() {
	}

	/** minimal constructor */
	public RcZp(Integer id, RcCompany CId) {
		this.id = id;
		this.CId = CId;
	}

	/** full constructor */
	public RcZp(Integer id, RcCompany CId, String zpInformation) {
		this.id = id;
		this.CId = CId;
		this.zpInformation = zpInformation;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RcCompany getCId() {
		return this.CId;
	}

	public void setCId(RcCompany CId) {
		this.CId = CId;
	}

	public String getZpInformation() {
		return this.zpInformation;
	}

	public void setZpInformation(String zpInformation) {
		this.zpInformation = zpInformation;
	}
	@Override
	public String toString() {
	return this.zpInformation;
	}
}