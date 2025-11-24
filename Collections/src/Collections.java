
public class Collections {
	
	public static void main(String arg[]) {
		
		Employee e1 = new Employee("John","pune");
		Employee e2 = new Employee("bob", "pune");
		System.out.println(e1.toString());
		System.out.println(e1.equals(e2));
		
	}
	
}

class Employee{
	private String name;
	private String address;
	
	public Employee(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		
		if(e2.getName() == name && e2.getAddress() == address) {
			return true;
		}
		return false;
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
	
}
