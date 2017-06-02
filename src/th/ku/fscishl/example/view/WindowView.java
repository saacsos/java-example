package th.ku.fscishl.example.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowView extends JFrame {
	private String windowTitle;
	private String result;

	public WindowView(String windowTitle) {
		this.windowTitle = windowTitle;
	}

	public void render() {
		setTitle(windowTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		add(resultPanel());
		pack();
	}

	public void setResult(String result) {
		this.result = result;
	}

	private JPanel resultPanel() {
		JPanel panel = new JPanel();
		JTextArea taResult = new JTextArea();
		taResult.setText(result);
		panel.add(taResult);
		return panel;
	}
}