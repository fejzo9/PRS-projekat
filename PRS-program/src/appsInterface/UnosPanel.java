package appsInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class UnosPanel extends JPanel implements ActionListener{
	public UnosPanel() {
		JButton unosNiz = new JButton("Unesite niz");
		JButton randomNiz = new JButton("Random niz");
		
		unosNiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		
		randomNiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
								
			}
		});
		
		this.add(unosNiz);
		this.add(randomNiz);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
