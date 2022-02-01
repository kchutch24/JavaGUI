import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccount extends JPanel implements ActionListener {

	JButton debit = new JButton("Debit");
	JButton credit = new JButton("Credit");
	JButton exit = new JButton("Exit");
	TextField t1, t2, output; // text fields
	Label debitAccount, creditAccount, balanceAmount; // labels
	double accountBalance = 0.0;

	public BankAccount(JFrame frame) {
		//creating label, setting boundaries, adding to frame
		debitAccount = new Label("Debit Amount:");
		debitAccount.setBounds(50, 100, 100, 50);
		frame.add(debitAccount);
		
		//creating text box, setting boundaries, adding to frame
		t1 = new TextField();
		t1.setBounds(150, 110, 100, 50);
		frame.add(t1);
		
		//creating label, setting boundaries, adding to frame
		creditAccount = new Label("Credit Amount:");
		creditAccount.setBounds(50, 180, 100, 50);
		frame.add(creditAccount);
		
		//creating text box, setting boundaries, adding to frame
		t2 = new TextField();
		t2.setBounds(150, 180, 100, 50);
		frame.add(t2);
		
		debit.addActionListener(this);
		debit.setBounds(150,250, 150,30);
		frame. add(debit);
		
		credit.addActionListener(this);
		credit.setBounds(300,250, 150,30);
		frame.add(credit);		
		
		//creating label, setting boundaries, adding to frame
		balanceAmount = new Label("Balance Amount:");
		balanceAmount.setBounds(300, 180, 120, 50);
		frame.add(balanceAmount);
		
		//creating text box, setting boundaries, adding to frame
		output = new TextField();
		output.setBounds(420, 180, 100, 50);
		frame.add(output);
		
		exit.addActionListener(this);
		exit.setBounds(450,250, 150,30); ;  
		frame.add(exit);  
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Bank Account");
		frame.getContentPane().add(new BankAccount(frame));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit frame when closing
		frame.setSize(700, 400); //frame size
		frame.setVisible(true); //make frame visible
	}

	public void actionPerformed(ActionEvent e) {
	
		if (e.getActionCommand().equals("Debit")) {
			System.out.println("Debit has been clicked"); //print to terminal
			String balanceAmount = t1.getText();
			double debitAmount = Double.parseDouble(balanceAmount);
			accountBalance += debitAmount; //add amount to balance
			output.setText(String.valueOf(accountBalance));
			t1.setText("");
		} else if (e.getActionCommand().equals("Credit")) {
			System.out.println("Credit has been clicked"); //print to terminal
			String balanceAmount = t2.getText();
			double creditAmount = Double.parseDouble(balanceAmount);
			accountBalance -= creditAmount; //subtract amount from balance
			output.setText(String.valueOf(accountBalance));
			t2.setText("");
		} else if(e.getActionCommand().equals("Exit")){
			System.out.println("You have exited the program"); //print to terminal
			System.exit(0);
		}
	}

} //class BankAccount

//CORRECTIONS:
//added some white space to separate elements