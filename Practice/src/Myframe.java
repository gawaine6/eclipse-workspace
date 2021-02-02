import javax.swing.JFrame;

public class Myframe extends JFrame {
	Myframe() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mypanel p = new Mypanel();
		add(p);
		setVisible(true);
	}
}
