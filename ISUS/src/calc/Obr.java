package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Obr implements ActionListener{
	
	GUI gui;


	public void actionPerformed(ActionEvent o) {
		float x, y, z, r, s;
		String a;
		try {
			x = Float.parseFloat(gui.t1.getText());
			y = Float.parseFloat(gui.t2.getText());
			z = Float.parseFloat(gui.t3.getText());
			r = x/100*y;
			s = r*z;
			a = "������ ������� �� " + y + " ��. ����� " + Math.round(r) + " �. �� " + Math.round(s) + " �.";
			gui.l5.setText(a);
		} catch(NumberFormatException e) {
			gui.l5.setText("�� ��������� ������� ��������");
		}
		
	}
	
}

