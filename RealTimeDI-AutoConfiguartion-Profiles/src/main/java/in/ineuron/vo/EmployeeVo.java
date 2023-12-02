package in.ineuron.vo;

public class EmployeeVo {

	private Integer empNo;
	private String ename;
	private String job;
	private Double Sal;
	private Integer deptNo;
	private Integer mgrNo;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return Sal;
	}

	public void setSal(Double sal) {
		Sal = sal;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getMgrNo() {
		return mgrNo;
	}

	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}

	@Override
	public String toString() {
		return "EmployeeBO [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", Sal=" + Sal + ", deptNo="
				+ deptNo + ", mgrNo=" + mgrNo + "]";
	}

}
