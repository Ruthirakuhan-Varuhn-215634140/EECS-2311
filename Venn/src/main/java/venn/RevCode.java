package venn;

import javax.*;
import javax.swing.JLabel;

public class RevCode {

	public static JLabel title[] = new JLabel[1];

	// Initiated Class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	// This code runs when user clicks the finish button when they create a label
	public static void addLabel(JLabel newLabel, JLabel Array[]) {
		JLabel result[] = new JLabel[title.length + 1];
		for (int i = 0; i < result.length; i++) {
			if (i == title.length) {
				result[i] = newLabel;
			} else {
				result[i] = Array[i];
			}
		}
	}

	static void removeLabel() {

	}

}
