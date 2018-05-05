package com.java.tictactoe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class tictactoeForm {

	private JFrame frmTicTacToe;
	private static JButton btn0_0;
	private static JButton btn0_1;
	private static JButton btn0_2;
	private static JButton btn1_0;
	private static JButton btn1_1;
	private static JButton btn1_2;
	private static JButton btn2_0;
	private static JButton btn2_1;
	private static JButton btn2_2;
	private static JButton btnRefresh;
	private static JComboBox comboBoxTurn;
	private static tictactoe ttt=new tictactoe();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoeForm window = new tictactoeForm();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tictactoeForm() {
		initialize();
		comboBoxTurn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 	JComboBox comboBox = (JComboBox) e.getSource();
	                Object selected = comboBox.getSelectedItem();
	                if(selected.toString().equals("Turn1")) {
	                ttt.turnPlay=1;
	                }
	                else if(selected.toString().equals("Turn2")) {
	                	ttt.turnPlay=2;
	    				if(ttt.turnPlay==2) {
	    					viTri vt=ttt.danh(2);
	    					if(vt.x==0&&vt.y==0) {
	    						btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==0&&vt.y==1) {
	    						btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==0&&vt.y==2) {
	    						btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==1&&vt.y==0) {
	    						btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==1&&vt.y==1) {
	    						btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==1&&vt.y==2) {
	    						btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==2&&vt.y==0) {
	    						btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==2&&vt.y==1) {
	    						btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    					else if(vt.x==2&&vt.y==2) {
	    						btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
	    					}
	    				}
	                }
	                
	                
				
			}
		});
		
		
		btn0_0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[0][0]==0) {
					if(ttt.turnPlay==1) {
						btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[0][0]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[0][0]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btn0_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[0][1]==0) {
					if(ttt.turnPlay==1) {
						btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[0][1]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[0][1]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
				}
				
			}
		});
		
		btn0_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[0][2]==0) {
					if(ttt.turnPlay==1) {
						btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[0][2]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[0][2]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btn1_0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[1][0]==0) {
					if(ttt.turnPlay==1) {
						btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[1][0]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[1][0]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btn1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[1][1]==0) {
					if(ttt.turnPlay==1) {
						btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[1][1]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[1][1]=2;
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		btn1_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[1][2]==0) {
					if(ttt.turnPlay==1) {
						btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[1][2]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[1][2]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btn2_0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[2][0]==0) {
					if(ttt.turnPlay==1) {
						btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[2][0]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[2][0]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btn2_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[2][1]==0) {
					if(ttt.turnPlay==1) {
						btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[2][1]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[2][1]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btn2_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ttt.matrix[2][2]==0) {
					if(ttt.turnPlay==1) {
						btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						ttt.matrix[2][2]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						}
					}
					else {
						btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\O.png"));
						ttt.matrix[2][2]=2;
						
						
						viTri vt=ttt.danh(2);
						if(vt.x==0&&vt.y==0) {
							btn0_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==1) {
							btn0_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==0&&vt.y==2) {
							btn0_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==0) {
							btn1_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==1) {
							btn1_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==1&&vt.y==2) {
							btn1_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==0) {
							btn2_0.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==1) {
							btn2_1.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						else if(vt.x==2&&vt.y==2) {
							btn2_2.setIcon(new ImageIcon("C:\\Users\\trung\\Desktop\\eclipse-jee-oxygen-3a-win32-x86_64\\projects\\TriTueNhanTao\\image\\X.png"));
						}
						
					}
					
				}
				
			}
		});
		
		btnRefresh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn0_0.setIcon(null);
				btn0_1.setIcon(null);
				btn0_2.setIcon(null);
				btn1_0.setIcon(null);
				btn1_1.setIcon(null);
				btn1_2.setIcon(null);
				btn2_0.setIcon(null);
				btn2_1.setIcon(null);
				btn2_2.setIcon(null);
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						ttt.matrix[i][j]=0;
					}
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.setBounds(100, 100, 500, 500);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new GridLayout(3, 3, 0, 0));
		
		btn0_0 = new JButton("");
		btn0_0.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn0_0);
		
		btn0_1 = new JButton("");
		btn0_1.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn0_1);
		
		btn0_2 = new JButton("");
		btn0_2.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn0_2);
		
		btn1_0 = new JButton("");
		btn1_0.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn1_0);
		
		btn1_1 = new JButton("");
		btn1_1.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn1_1);
		
		btn1_2 = new JButton("");
		btn1_2.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn1_2);
		
		btn2_0 = new JButton("");
		btn2_0.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn2_0);
		
		btn2_1 = new JButton("");
		btn2_1.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn2_1);
		
		btn2_2 = new JButton("");
		btn2_2.setBackground(Color.WHITE);
		frmTicTacToe.getContentPane().add(btn2_2);
		
		JMenuBar menuBar = new JMenuBar();
		frmTicTacToe.setJMenuBar(menuBar);
		
		comboBoxTurn = new JComboBox();
		comboBoxTurn.setModel(new DefaultComboBoxModel(new String[] {"Choose Turn", "Turn1", "Turn2"}));
		menuBar.add(comboBoxTurn);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(btnRefresh);
	}

}
