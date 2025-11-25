import java.util.HashSet;
import java.util.Objects;

public class Collections {
	
	public static void main(String arg[]) {
		Employee e1 = new Employee(123, "John", "pune");
		Employee e2 = new Employee(123, "John", "pune");
		Employee e3 = new Employee(124, "BAOB", "mumbai");
		
		HashSet s = new HashSet();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		System.out.println(s.toString());
		System.out.println(e1.equals(e2));
	}
	
}

class Employee{
	private int id;
	private String name;
	private String address;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Employee) {
			Employee e = (Employee) o;
			
		if(id == e.getId()) {
			return true;
		}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name, address);
	}
	
	
	
}
