package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSpinner;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JTextField;

public class ProjectFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private Items item;
	private SpinnerModel model = new SpinnerNumberModel(1, 1, 100, 1);
	private JSpinner spinner = new JSpinner(model);
	private FileHandler fileHandler = new FileHandler();
	private Purchase purchase;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectFrame frame = new ProjectFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// FRAME OF THE PROJECT
	public ProjectFrame() {
		setTitle("Bootleg Bodega");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	// BUTTONS FOR THE PROJECT
		JButton waterBtn = new JButton("Water");
		waterBtn.addActionListener(this);
		waterBtn.setBounds(25, 203, 116, 53);
		contentPane.add(waterBtn);
		
		JButton gumBtn = new JButton("Gum");
		gumBtn.addActionListener(this);
		gumBtn.setBounds(161, 203, 116, 53);
		contentPane.add(gumBtn);
		
		JButton sodaBtn = new JButton("Soda");
		sodaBtn.setBounds(294, 267, 116, 53);
		sodaBtn.addActionListener(this);
		contentPane.add(sodaBtn);
		
		JButton chips = new JButton("Chips");
		chips.addActionListener(this);
		chips.setBounds(25, 267, 116, 53);
		contentPane.add(chips);
		
		JButton Fruit = new JButton("Fruit");
		Fruit.addActionListener(this);
		Fruit.setBounds(151, 267, 116, 53);
		contentPane.add(Fruit);
		
		JButton IceCream = new JButton("Ice Cream");
		IceCream.addActionListener(this);
		IceCream.setBounds(294, 203, 116, 53);
		contentPane.add(IceCream);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(this);
		Cancel.setForeground(new Color(255, 0, 0));
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Cancel.setBounds(90, 347, 89, 23);
		contentPane.add(Cancel);
		
		JButton Complete = new JButton("Complete");
		Complete.addActionListener(this);
		Complete.setForeground(new Color(0, 255, 0));
		Complete.setBounds(90, 393, 89, 34);
		contentPane.add(Complete);
		
	// SPINNER FOR THE PROJECT
		spinner.setBounds(300, 377, 84, 20);
		contentPane.add(spinner);
		
		
	//TEXTFIELD / SCREEN FOR THE PROJECT
		textField = new JTextField();
		textField.setBackground(new Color(210, 180, 140));
		textField.setBounds(25, 11, 385, 155);
		contentPane.add(textField);
		textField.setColumns(10);
		
	}
	
	
	//ACTIONS FOR THE BUTTONS
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		switch(command) {
		case "Water":
			
			item = new Items(command, 1.00);
			System.out.println(item.toString());
			textField.setText(command + ": $1.00");
			break;
			
		case "Gum":
			
			item = new Items(command, .50);
			System.out.println(item.toString());
			textField.setText(command + ": $0.50");
			break;
			
		case "Soda":
			
			item = new Items(command, 1.50);
			System.out.println(item.toString());
			textField.setText(command + ": $1.50");
			break;
			
		case "Chips":
	
			item = new Items(command, 1.00);
			System.out.println(item.toString());
			textField.setText(command + ": $1.00");
			break;
	
		case "Fruit":
	
			item = new Items(command, .25);
			System.out.println(item.toString());
			textField.setText(command + ": $0.25");
			break;
	
		case "Ice Cream":
	
			item = new Items(command, 2.50);
			System.out.println(item.toString());
			textField.setText(command + ": $2.50");
			break;
	
		case "Cancel":
			textField.setText("");
			break;
	
		case "Complete":
			int quantity = (Integer)spinner.getValue();
			//System.out.println(quantity);
			
			// exception when someone doesnt choose an item
			try {
				textField.setText(command + " $" + (item.getPrice() * quantity));
			}
			catch (Exception z) {
				System.out.println("Need to choose an item");
			}
			purchase = new Purchase(item, quantity);
			System.out.println(purchase.toString());
			String lastLine = null;
			try {
				lastLine = fileHandler.getCurrentID();
				System.out.println(lastLine);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			fileHandler.generateIDs();
			fileHandler.setCurrentID();
			fileHandler.appendToFile("invoice.txt", purchase.toString());
			break;
			
		}
		
	}
}