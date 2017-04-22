package pojo;

/**
 * RcZp entity. @author MyEclipse Persistence Tools
 */

public class RcZp implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer CId;
	private String zpInformation;

	// Constructors

	/** default constructor */
	public RcZp() {
	}

	/** minimal constructor */
	public RcZp(Integer CId) {
		this.CId = CId;
	}

	/** full constructor */
	public RcZp(Integer CId, String zpInformation) {
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

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public String getZpInformation() {
		return this.zpInformation;
	}

	public void setZpInformation(String zpInformation) {
		this.zpInformation = zpInformation;
	}

}