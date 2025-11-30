import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		Doctor d1 = new Doctor(1001, "John");
		Doctor d2 = new Doctor(1002, "Bob");
		Doctor d3 = new Doctor(1003, "Emily");
		Doctor d4 = new Doctor(1004, "Sam");

		idComparator idComp = new idComparator();
		Set<Doctor> idTree = new TreeSet<Doctor>(idComp);
		idTree.add(d1);
		idTree.add(d3);
		idTree.add(d4);
		idTree.add(d2);

		System.out.println(idTree);

		nameComparator nameComp = new nameComparator();
		Set<Doctor> nameTree = new TreeSet<Doctor>(nameComp);
		nameTree.add(d3);
		nameTree.add(d2);
		nameTree.add(d1);
		nameTree.add(d4);

		System.out.println(nameTree);
	}
}

class nameComparator implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class idComparator implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		return o1.getId() - o2.getId();
	}

}

class Doctor {
	private int id;
	private String name;
	private String spl;

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

	public String getSpl() {
		return spl;
	}

	public void setSpl(String spl) {
		this.spl = spl;
	}

	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + "]";
	}

}