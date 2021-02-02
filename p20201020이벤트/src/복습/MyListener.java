package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource(); 
		// 강제 형변환을 하는 이유는??
		// getSource()는 object 타입으로 반환한다. 근데 우리가 필요한 타입은 버튼타입, 그래서 앞에 JButton을 붙여서 형변환을 해줘야한다 이마리야
		
		String a = btn.getText();
		if(a.equals("Click")) {
			btn.setText("Complete");
		} else {
			btn.setText("Click");			
		}
	}
}
