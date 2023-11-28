package in.ineuron.model;

public class Employee {

	private Integer eid;
	private String ename;
	private Integer eage;
	private String eaddress;
	private float salary;
	private float hike;

	public Integer getEid() {
		return eid;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getHike() {
		return hike;
	}

	public void setHike(float hike) {
		this.hike = hike;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eaddress=" + eaddress + ", salary="
				+ salary + ", hike=" + hike + "]";
	}

}
