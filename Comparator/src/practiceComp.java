import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class practiceComp {

	public static void main(String[] args) {
		Product p1 = new Product(1001, "Bottle", 250, 4);
		Product p2 = new Product(1001, "Bottle", 250, 4);
		Product p3 = new Product(1002, "Earbuds", 250, 5);
		Product p4 = new Product(1003, "Charger", 1000, 3);
		
		priceComparator pc = new priceComparator();
		Set<Product> nameSet = new TreeSet<Product>(pc);
		nameSet.add(p4);
		nameSet.add(p3);
		nameSet.add(p2);
		nameSet.add(p1);
		
		System.out.println(nameSet);
	}
}

class priceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) { // highest rating 
		return o2.getRating()-o1.getRating();
	}
	
}
class productComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) { //highest price if same then rating
		if(o1.getPrice() == o2.getPrice()) {
			return o2.getRating()-o1.getRating();
		}
		return (int) (o2.getPrice()-o1.getPrice());
	}
	
}
class nameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) { //name sorting
		return o1.getName().compareTo(o2.getName());
	}	
}
class Product{
	private int id;
	private String name;
	private double price;
	private int rating;
	
	public Product(int id, String name, double price, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Product) {
			Product p = (Product) obj;
			if(id == p.getId()) {
				return true;
			}
		}
		return false;
	}
	
	public int hashcode() {
		return Objects.hash(id);
	}
	
}
