package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import paint.Draw;

public class ControlLateral implements ActionListener {
	private Draw paint;
	public ControlLateral(Draw paint) {
		this.paint = paint;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String choose = e.getActionCommand();
		switch (choose) {
		case "ADD":
			paint.setFlag(false);
			break;
		case "MOVE":
			paint.setFlag(true);
			break;
		case "DELETE":
			paint.reset();
			break;
		case "LINEA":
			paint.setChoosed_figure(0);
			break;
		case "RECTANGULO":
			paint.setChoosed_figure(1);
			break;
		default:
			break;
		}
	}
	
	
}
