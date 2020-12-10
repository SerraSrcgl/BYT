public class Person {
	public String last;

	public String first;

	public String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
	}

	@Override
	public String toString() {
		return first == null ? first + " " : "" + last == null ? last + " " : "" + middle == null ? middle + " " : "";
	}
}