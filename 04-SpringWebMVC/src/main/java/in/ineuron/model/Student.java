package in.ineuron.model;

public class Student {

	private Integer sid;
	private String name;
	private String address;
	
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
