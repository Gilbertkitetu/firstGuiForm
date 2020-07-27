package firstGuiformPac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class firstGuiAppW {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstGuiAppW window = new firstGuiAppW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public firstGuiAppW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1.PERSONAL DETAILS");
		lblNewLabel.setBounds(10, 0, 477, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(10, 25, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(83, 25, 137, 14);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Middle Name");
		lblNewLabel_2.setBounds(230, 25, 83, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(306, 23, 86, 17);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Surname:");
		lblNewLabel_3.setBounds(414, 25, 57, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(470, 25, 122, 14);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(10, 50, 77, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 50, 513, 14);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telephone:");
		lblNewLabel_5.setBounds(10, 75, 77, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email:");
		lblNewLabel_6.setBounds(303, 75, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(72, 75, 146, 14);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(402, 75, 190, 14);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Gender: (M/F)");
		lblNewLabel_7.setBounds(10, 100, 86, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(99, 100, 188, 14);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Date of Birth:");
		lblNewLabel_8.setBounds(308, 100, 97, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(404, 100, 188, 14);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Nationality:");
		lblNewLabel_9.setBounds(10, 125, 86, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(79, 125, 168, 14);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("ID/passport No:");
		lblNewLabel_10.setBounds(275, 125, 117, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(404, 125, 188, 14);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("2. INDICATE THE PROGRAMME APPLIED IN ORDER OF PREFERENCE");
		lblNewLabel_11.setBounds(10, 150, 461, 20);
		frame.getContentPane().add(lblNewLabel_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 582, 75);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1.", null},
				{"2.", null},
				{"3", null},
			},
			new String[] {
				"CHOICE", "COURSE/PROGRAMME"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(199);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_12 = new JLabel("School/Department");
		lblNewLabel_12.setBounds(10, 267, 125, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		textField_10 = new JTextField();
		textField_10.setBounds(145, 267, 447, 14);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Projected Reporting/Starting Date: (Choose one by Ticking appropriately)");
		lblNewLabel_13.setBounds(10, 292, 461, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("May, 2020");
		lblNewLabel_14.setBounds(10, 330, 109, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(73, 317, 46, 27);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("September, 2020");
		lblNewLabel_15.setBounds(161, 330, 126, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(275, 317, 38, 27);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("January, 2021");
		lblNewLabel_16.setBounds(349, 330, 122, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		textField_13 = new JTextField();
		textField_13.setBounds(472, 324, 46, 27);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Mode of Study (Choose one by Ticking appropriately)");
		lblNewLabel_17.setBounds(11, 367, 395, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Full Time");
		lblNewLabel_18.setBounds(10, 392, 77, 14);
		frame.getContentPane().add(lblNewLabel_18);
		
		textField_14 = new JTextField();
		textField_14.setBounds(76, 389, 46, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Part Time");
		lblNewLabel_19.setBounds(200, 392, 105, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		textField_15 = new JTextField();
		textField_15.setBounds(328, 389, 46, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("3. EDUCATION BACKGROUND");
		lblNewLabel_20.setBounds(10, 417, 295, 14);
		frame.getContentPane().add(lblNewLabel_20);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 442, 580, 75);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"SCHOOLS ATTENDED", "DATES", "QUALIFICATIONS /AWARD"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(111);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(149);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_21 = new JLabel("N/B: Attach certified copies of the relevant Academic Certificationsand two passport size photographs.");
		lblNewLabel_21.setBounds(22, 528, 582, 14);
		frame.getContentPane().add(lblNewLabel_21);
	}
}
