package generic;

public class Case<M, D> {
	private M month;
	private D day;
	
	public Case(M month, D day) {
		this.month = month;
		this.day = day;
	}
	public M getM() { return month; }
	public D getD() { return day; }
	
	public static void main(String[] args) {
		Case<String, Integer> c = new Case<String, Integer>("December", 25);
		System.out.println(c.getM() + "/" + c.getD());

	}
}
