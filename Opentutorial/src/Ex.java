public class Ex {
	public static void main(String[] args) {
		PolyList A = new PolyList();
		PolyList B = new PolyList();
		PolyList C = new PolyList();
		
		PolyNode A2 = A.getHead();
		PolyNode B2 = B.getHead();
		
		A2 = A.appendTerm(4, 6, A2);
		A2 = A.appendTerm(5, 5, A2);
		A2 = A.appendTerm(3, 2, A2);
		A2 = A.appendTerm(5, 1, A2);
		A2 = A.appendTerm(8, 0, A2);
		System.out.printf("A(x) = ");
		A.printPoly();
		
		B2 = B.appendTerm(4, 5, B2);
		B2 = B.appendTerm(3, 2, B2);
		B2 = B.appendTerm(5, 1, B2);
		System.out.printf("B(x) = ");
		B.printPoly();
		
		C.addPoly(A, B);
		System.out.printf("C(x) = ");
		C.printPoly();
		System.exit(0);
	}
}

class PolyList {
	private PolyNode head;

	public PolyList() {
		head = null;
	}

	public PolyNode getHead() {
		return this.head;
	}

	public PolyNode appendTerm(float coef, int expo, PolyNode last) {
		PolyNode newNode = new PolyNode(coef, expo);
		if (head == null) {
			this.head = newNode;
		} else {
			last.link = newNode;
		}
		last = newNode;
		return (last);
	}
	
	public void addPoly(PolyList A, PolyList B) {
			PolyNode a = A.head;
			PolyNode b = B.head;
			PolyNode c = this.head;
			while(a != null && b != null) {
				if(a.getExpo() == b.getExpo()) {
					c = this.appendTerm(a.getCoef() + b.getCoef(), a.getExpo(), c);
					a = a.link;
					b = b.link;
				} else if(a.getExpo() < b.getExpo()) {
					c = this.appendTerm(b.getCoef(), b.getExpo(), c);
					b = b.link;
				} else {
					c = this.appendTerm(a.getCoef(), a.getExpo(), c);
					a = a.link;
				}
			}
			while (a != null) {
				c = this.appendTerm(a.getCoef(), a.getExpo(), c);
				a = a.link;
			}
			while (b != null) {
				c = this.appendTerm(b.getCoef(), b.getExpo(), c);
				b = b.link;
			}
		}

	public void printPoly() {
		PolyNode temp = this.head;
		while (temp != null) {
			System.out.printf("%2.0fx^%d", temp.getCoef(), temp.getExpo());
			temp = temp.link;
			if (temp != null) {
				System.out.print(" +");
			}
		}
		System.out.println();
	}
}

class PolyNode {
	private float coef;
	private int expo;
	public PolyNode link;

	public PolyNode() {
		this.link = null;
	}

	public PolyNode(float coef, int expo) {
		this.coef = coef;
		this.expo = expo;
		this.link = null;
	}

	public float getCoef() {
		return this.coef;
	}

	public int getExpo() {
		return this.expo;
	}
}
