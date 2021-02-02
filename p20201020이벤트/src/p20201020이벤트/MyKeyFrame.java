package p20201020이벤트;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyKeyFrame extends JFrame {
	public MyKeyFrame(String name) {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(name);
		
		// TextField Component create
		JTextField jtf = new JTextField(20);

		// Listener Object create
		MyKeyListener listener = new MyKeyListener();
		
		// TextField Component Event Object create
		jtf.addKeyListener(listener);
		
		// TextField Component add to Frame
		add(jtf);
		setVisible(true);
	}
}
