import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1003,"John");
		Employee e2 = new Employee(1003,"John");
		Employee e3 = new Employee(1001,"Sam");
		Employee e4 = new Employee(1002,"Emily");
		
		System.out.println(e4);  //internally uses toString
//--------------------------------------------------------------------------------------------------
		Set<Employee> hashset = new HashSet<Employee>(); 
		hashset.add(e1);
		hashset.add(e2);
		hashset.add(e3);
		hashset.add(e4);
		
		System.out.println(hashset); // to remove duplicates override equals and hashcode method
//--------------------------------------------------------------------------------------------------
		Set<Employee> linkedHashSet = new LinkedHashSet<Employee>(); //insertion manner
		linkedHashSet.add(e1);
		linkedHashSet.add(e4);
		linkedHashSet.add(e2);
		linkedHashSet.add(e3);
		
		System.out.println(linkedHashSet); // to remove duplicates override equals and hashcode method
//--------------------------------------------------------------------------------------------------
		Set<Employee> treeSet = new TreeSet<Employee>(); //sorting
		treeSet.add(e4);
		treeSet.add(e2);
		treeSet.add(e1);
		treeSet.add(e3);
		
		System.out.println(treeSet); // implements comparable for single compare and override compareTo()
	}
}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String address;
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
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Employee) {
			Employee e2 = (Employee)obj;
			if(id == e2.getId()) {
				if(name == e2.getName()) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public int compareTo(Employee o) {
		return id-o.getId();
	}	
}
