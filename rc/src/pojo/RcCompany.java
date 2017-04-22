package pojo;

/**
 * RcCompany entity. @author MyEclipse Persistence Tools
 */

public class RcCompany implements java.io.Serializable {

	// Fields

	private Integer id;
	private String CName;

	// Constructors

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