
public class clonable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad = new Address("Mumbai");
		Person1 p1 = new Person1(1,ad);
		Person1 p2 = p1.clone();
		
		p2.address.setCity("pune");
		
		System.out.println("Shallow copy: ");
		System.out.println(p1);
		System.out.println(p2);
		
		Address adr = new Address("Mumbai");
		Person2 p3 = new Person2(2,adr);
		Person2 p4 = p3.clone();
		
		p4.address.setCity("pune");
		
		System.out.println("\nDeep copy: ");
		System.out.println(p3);
		System.out.println(p4);
		
		Address adrs = new Address("Mumbai");
		Person3 p5 = new Person3(3,adr);
		Person3 p6 = new Person3(p5);
		
		p6.address.setCity("pune");
		
		System.out.println("\nDeep copy using copy constructor: ");
		System.out.println(p5);
		System.out.println(p6);
		
	}
}

class Address{
	 String city;
	 Address(String city) {
		this.city = city;
	}
	 
	 Address(Address other){
		 this.city = other.city;
	 }
	 
	 public void setCity(String city) {
		// TODO Auto-generated method stub
		this.city = city;
	 }
	 @Override
	 public String toString() {
		return "Address [city=" + city + "]";
	 }	 	 	
}
class Person1 implements Cloneable{
	 int id;
	 Address address;
	
	Person1(int id, Address address) {
		this.id = id;
		this.address = address;
	}
	
	@Override
	public Person1 clone() throws CloneNotSupportedException {
		return (Person1) super.clone();
	}

	@Override
	public String toString() {
		return "Person1 [id=" + id + ", address=" + address + "]";
	}
		
}

class Person2 implements Cloneable{
	int id;
	Address address;
	
	Person2(int id, Address address) {
		this.id = id;
		this.address = address;
	}
	
	@Override
	public Person2 clone() throws CloneNotSupportedException {
		Person2 cloned =  (Person2) super.clone();
		cloned.address = new Address(this.address.city);
		return cloned;
	}

	@Override
	public String toString() {
		return "Person2 [id=" + id + ", address=" + address + "]";
	}
}

class Person3{
	int id;
	Address address;
	
	Person3(int id, Address address) {
		this.id = id;
		this.address = address;
	}
	
	Person3(Person3 other) {
        this.id = other.id;
        this.address = new Address(other.address); // deep copy
    }

	@Override
	public String toString() {
		return "Person3 [id=" + id + ", address=" + address + "]";
	}
}