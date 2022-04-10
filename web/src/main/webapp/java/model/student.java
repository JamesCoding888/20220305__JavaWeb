package model;
public class student {
	// field --> column 
	private Integer id;
	private String name;
	private String chi;
	private String eng;
	private String sum;
	public student() {
		super();
	}
	public student(String name, String chi, String eng, String sum) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.sum = sum;
	}
	public student(Integer id, String name, String chi, String eng, String sum) {
		super();
		this.id = id;
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.sum = sum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChi() {
		return chi;
	}
	public void setChi(String chi) {
		this.chi = chi;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", chi=" + chi + ", eng=" + eng + ", sum=" + sum + "]";
	}	
}
