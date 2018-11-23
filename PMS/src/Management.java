import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Management {

	private JFrame frmPms;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management window = new Management();
					window.frmPms.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPms = new JFrame();
		frmPms.getContentPane().setBackground(Color.DARK_GRAY);
		frmPms.setTitle("PMS");
		frmPms.setBounds(100, 100, 450, 300);
		frmPms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPms.getContentPane().setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("USE THE SYSTEM AS...");
		lblNewJgoodiesTitle.setForeground(Color.WHITE);
		lblNewJgoodiesTitle.setToolTipText("");
		lblNewJgoodiesTitle.setFont(new Font("Gungsuh", Font.BOLD | Font.ITALIC, 16));
		lblNewJgoodiesTitle.setBackground(Color.WHITE);
		lblNewJgoodiesTitle.setBounds(131, 22, 253, 14);
		frmPms.getContentPane().add(lblNewJgoodiesTitle);
		
		JButton operator = new JButton("Operator");
		operator.setBounds(184, 68, 89, 23);
		frmPms.getContentPane().add(operator);
		
		JButton member = new JButton("Member");
		member.setBounds(184, 102, 89, 23);
		frmPms.getContentPane().add(member);
		
		JButton visitor = new JButton("Visitor");
		visitor.setBounds(184, 138, 89, 23);
		frmPms.getContentPane().add(visitor);
	}
}
