package Arithmetic_GeneratorHW;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window {

	/*
	 * This method creates a message.
	 */
	public void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	/*
	 * This method displays the text given in the parameter
	 * in a dialog box.
	 */
	public int option(Object[] options, Object msg) {
		return JOptionPane.showOptionDialog(
				null, 
				msg, // my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, // possible options
                options[0]); // default option
	}
	
	/*
	 * This method sets up a JPanel with an "OK" button and a label, 
	 * and if the user inputed text, it returns it.
	 */
	public String findUserInput(String text, String title){
		String[] options = {"OK"};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(text);
		JTextField txt = new JTextField(10);
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, title, JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);

		if(selectedOption == 0)
		    return txt.getText();
		return "";
	}
	
}
