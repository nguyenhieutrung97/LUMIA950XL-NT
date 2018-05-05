package com.java.baitoandonuoc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class baitoandonuocForm {

	private JFrame frame;
	private JTextField textFieldBT1;
	private JTextField textFieldBT2;
	private JTextField textFieldWaterNeed;
	private JTable table;
	private JButton btnKQ;
	private String[] columnNames={"Binh 1","Binh 2","Ap dung luat"};
	private static String[][] dulieu;
	public baitoandonuoc btdn=new baitoandonuoc();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baitoandonuocForm window = new baitoandonuocForm();
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
	public baitoandonuocForm() {
		initialize();
		btnKQ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btdn.setX(Integer.parseInt(textFieldBT1.getText()));
				btdn.setY(Integer.parseInt(textFieldBT2.getText()));
				btdn.setSlNuocCan(Integer.parseInt(textFieldWaterNeed.getText()));
				if(btdn.thoaDK()==false) {
					int output = JOptionPane.showConfirmDialog(frame
				               , "Khong the tinh!!! Du lieu vao khong thoa dieu kien!!!"
				               ,"Loi"
				               ,JOptionPane.CLOSED_OPTION,
				               JOptionPane.INFORMATION_MESSAGE);
				}
				else {
				btdn.tinhKQ();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1092, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIconBottle1 = new JLabel("");
		lblIconBottle1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\bottle.png"));
		lblIconBottle1.setBounds(44, 45, 174, 250);
		frame.getContentPane().add(lblIconBottle1);
		
		JLabel lblIconBottle2 = new JLabel("");
		lblIconBottle2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\bottle.png"));
		lblIconBottle2.setBounds(249, 45, 174, 250);
		frame.getContentPane().add(lblIconBottle2);
		
		JLabel lblBT1 = new JLabel("Dung tich Binh 1");
		lblBT1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBT1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBT1.setBounds(44, 169, 161, 28);
		frame.getContentPane().add(lblBT1);
		
		textFieldBT1 = new JTextField();
		textFieldBT1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldBT1.setBounds(66, 198, 116, 20);
		frame.getContentPane().add(textFieldBT1);
		textFieldBT1.setColumns(10);
		
		JLabel lblBT2 = new JLabel("Dung tich Binh2");
		lblBT2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBT2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBT2.setBounds(238, 169, 182, 21);
		frame.getContentPane().add(lblBT2);
		
		textFieldBT2 = new JTextField();
		textFieldBT2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldBT2.setBounds(270, 198, 116, 20);
		frame.getContentPane().add(textFieldBT2);
		textFieldBT2.setColumns(10);
		
		JLabel lblWaterWeNeed = new JLabel("So nuoc can lay:");
		lblWaterWeNeed.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWaterWeNeed.setBounds(66, 362, 116, 20);
		frame.getContentPane().add(lblWaterWeNeed);
		
		textFieldWaterNeed = new JTextField();
		textFieldWaterNeed.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldWaterNeed.setBounds(173, 362, 115, 20);
		frame.getContentPane().add(textFieldWaterNeed);
		textFieldWaterNeed.setColumns(10);
		
		table = new JTable(btdn.data,columnNames);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(472, 45, 422, 336);
		frame.getContentPane().add(scrollPane);
		
		btnKQ = new JButton("Huong dan");
		btnKQ.setBounds(298, 362, 104, 23);
		frame.getContentPane().add(btnKQ);
		
		
	}
}
