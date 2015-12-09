
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.border.MatteBorder;


@SuppressWarnings("serial")
public class CloudUi extends JFrame {
	 
	
	
	int hdfs=0;
	int swift=0;
	int ceph=0;
	//int flag1=0;
	//int flag2=0;
	//int flag3=0;
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	//private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	//private final ButtonGroup buttonGroup_10 = new ButtonGroup();
	private final ButtonGroup buttonGroup_11 = new ButtonGroup();
	//private final ButtonGroup buttonGroup_12 = new ButtonGroup();
	private final ButtonGroup buttonGroup_13 = new ButtonGroup();
	private final ButtonGroup buttonGroup_14 = new ButtonGroup();
	//private final ButtonGroup buttonGroup_15 = new ButtonGroup();
	//private final ButtonGroup buttonGroup_16 = new ButtonGroup();
	private final ButtonGroup buttonGroup_17 = new ButtonGroup();
	private final ButtonGroup buttonGroup_18 = new ButtonGroup();
	private final ButtonGroup buttonGroup_19 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CloudUi frame = new CloudUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CloudUi() {
		
		
		setResizable(false);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 649);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cloud File System");
		lblNewLabel.setBounds(326, 11, 189, 19);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of Files");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(-8, 54, 100, 14);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Few");
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(98, 50, 50, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Many");
		rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnNewRadioButton_1.setBounds(150, 50, 58, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		 final ButtonGroup editableGroup = new ButtonGroup();
		    editableGroup.add(rdbtnNewRadioButton);
		    editableGroup.add(rdbtnNewRadioButton_1);
		 
		    rdbtnNewRadioButton.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	hdfs+=3;
		        	swift+=1;
		        	ceph+=2;
		        	
		        }
		    });
   
		    rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	hdfs+=1;
		        	swift+=2;
		        	ceph+=3;
		        	
		        }
		    });
    
		
		
		JLabel lblRandomAcess = new JLabel("Random Acess");
		lblRandomAcess.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRandomAcess.setBounds(-8, 84, 100, 14);
		lblRandomAcess.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(lblRandomAcess);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Yes");
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(98, 80, 50, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("No");
		rdbtnNewRadioButton_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(150, 80, 45, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=3;
	        	ceph+=2;
	        	
	        }
	    });

	    rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=0;
	        	ceph+=0;
	        	
	        }
	    });

		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(214, 54, 1, 52);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Scalability");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(225, 54, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("low");
		rdbtnNewRadioButton_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnNewRadioButton_4.setBounds(326, 49, 50, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("High");
		rdbtnNewRadioButton_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnNewRadioButton_5.setBounds(378, 49, 58, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		final ButtonGroup editableGroup2 = new ButtonGroup();
	    editableGroup2.add(rdbtnNewRadioButton_4);
	    editableGroup2.add(rdbtnNewRadioButton_5);
	 
	    rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=3;
	        	swift+=2;
	        	ceph+=1;
	        	
	        }
	    });

	    rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });

		
		JLabel lblNewLabel_3 = new JLabel("File Size");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setBounds(457, 84, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnSmall.setBounds(535, 79, 58, 23);
		contentPane.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnMedium.setBounds(595, 79, 79, 23);
		contentPane.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setFont(new Font("Verdana", Font.PLAIN, 11));
		rdbtnLarge.setBounds(676, 79, 58, 23);
		contentPane.add(rdbtnLarge);
		
		final ButtonGroup editableGroup3 = new ButtonGroup();
	    editableGroup3.add(rdbtnSmall);
	    editableGroup3.add(rdbtnMedium);
	    editableGroup3.add(rdbtnLarge);
	 
	    rdbtnSmall.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=3;
	        	ceph+=1;
	        	
	        }
	    });

	    rdbtnMedium.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=1;
	        	ceph+=2;
	        	
	        }
	    });
	    rdbtnLarge.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=3;
	        	swift+=0;
	        	ceph+=2;
	        	
	        }
	    });

		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(442, 51, 1, 52);
		contentPane.add(separator_1);
		
		JLabel lblRedudantMetadataServer = new JLabel("Redudant Metadata Server");
		lblRedudantMetadataServer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRedudantMetadataServer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRedudantMetadataServer.setBounds(462, 54, 161, 14);
		contentPane.add(lblRedudantMetadataServer);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(644, 49, 50, 23);
		contentPane.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(691, 49, 50, 23);
		contentPane.add(rdbtnNo);
		rdbtnYes.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		rdbtnNo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=0;
	        	ceph+=0;
	        	
	        }
	    });

		
		JLabel lblMultiTenancy = new JLabel("Storage");
		lblMultiTenancy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMultiTenancy.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMultiTenancy.setBounds(250, 84, 50, 14);
		contentPane.add(lblMultiTenancy);
		
		JRadioButton rdbtnYes_1 = new JRadioButton("Block");
		rdbtnYes_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_2.add(rdbtnYes_1);
		rdbtnYes_1.setBounds(306, 79, 58, 23);
		contentPane.add(rdbtnYes_1);
		
		JRadioButton rdbtnNo_1 = new JRadioButton("Object");
		rdbtnNo_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_2.add(rdbtnNo_1);
		rdbtnNo_1.setBounds(366, 79, 70, 23);
		contentPane.add(rdbtnNo_1);
		
		rdbtnYes_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=3;
	        	swift+=0;
	        	ceph+=3;
	        	
	        }
	    });
		rdbtnNo_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=3;
	        	ceph+=3;
	        	
	        }
	    });

		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.DARK_GRAY);
		separator_2.setBounds(2, 109, 739, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.DARK_GRAY);
		separator_3.setBounds(2, 147, 739, 2);
		contentPane.add(separator_3);
		
		JLabel lblRead = new JLabel("Read");
		lblRead.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRead.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRead.setBounds(12, 160, 46, 14);
		contentPane.add(lblRead);
		
		JRadioButton rdbtnModerate = new JRadioButton("Moderate");
		rdbtnModerate.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_3.add(rdbtnModerate);
		rdbtnModerate.setBounds(68, 156, 81, 23);
		contentPane.add(rdbtnModerate);
		
		JRadioButton rdbtnHigh = new JRadioButton("High");
		rdbtnHigh.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_3.add(rdbtnHigh);
		rdbtnHigh.setBounds(150, 156, 58, 23);
		contentPane.add(rdbtnHigh);
		
		rdbtnModerate.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=3;
	        	swift+=2;
	        	ceph+=1;
	        	
	        }
	    });
		rdbtnHigh.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=3;
	        	ceph+=2;
	        	
	        }
	    });

		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(214, 157, 1, 52);
		contentPane.add(separator_4);
		
		JLabel lblWrite = new JLabel("Write");
		lblWrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblWrite.setBounds(12, 185, 46, 14);
		contentPane.add(lblWrite);
		
		JRadioButton radioButton = new JRadioButton("Moderate");
		radioButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_4.add(radioButton);
		radioButton.setBounds(67, 182, 81, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("High");
		radioButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_4.add(radioButton_1);
		radioButton_1.setBounds(150, 182, 58, 23);
		contentPane.add(radioButton_1);
		
		radioButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=3;
	        	swift+=2;
	        	ceph+=1;
	        	
	        }
	    });
		radioButton_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		
		JLabel lblReread = new JLabel("Re-Read");
		lblReread.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblReread.setHorizontalAlignment(SwingConstants.TRAILING);
		lblReread.setBounds(225, 160, 70, 14);
		contentPane.add(lblReread);
		
		JRadioButton radioButton_2 = new JRadioButton("Moderate");
		radioButton_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_5.add(radioButton_2);
		radioButton_2.setBounds(301, 156, 81, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("High");
		radioButton_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_5.add(radioButton_3);
		radioButton_3.setBounds(380, 156, 58, 23);
		contentPane.add(radioButton_3);
		
		radioButton_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=3;
	        	swift+=2;
	        	ceph+=1;
	        	
	        }
	    });
		radioButton_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=3;
	        	ceph+=2;
	        	
	        }
	    });
		
		JLabel lblRewrite = new JLabel("Re-Write");
		lblRewrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRewrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRewrite.setBounds(225, 185, 70, 14);
		contentPane.add(lblRewrite);
		
		JRadioButton radioButton_4 = new JRadioButton("Moderate");
		radioButton_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_6.add(radioButton_4);
		radioButton_4.setBounds(301, 181, 81, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("High");
		radioButton_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_6.add(radioButton_5);
		radioButton_5.setBounds(380, 181, 58, 23);
		contentPane.add(radioButton_5);
		
		radioButton_4.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_5.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(444, 157, 1, 52);
		contentPane.add(separator_5);
		
		JLabel lblRandomRead = new JLabel("Random Read");
		lblRandomRead.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRandomRead.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRandomRead.setBounds(447, 160, 100, 14);
		contentPane.add(lblRandomRead);
		
		JRadioButton radioButton_6 = new JRadioButton("Moderate");
		radioButton_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_7.add(radioButton_6);
		radioButton_6.setBounds(564, 156, 81, 23);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_8 = new JRadioButton("High");
		radioButton_8.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_7.add(radioButton_8);
		radioButton_8.setBounds(647, 156, 58, 23);
		contentPane.add(radioButton_8);
		
		radioButton_6.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=3;
	        	ceph+=2;
	        	
	        }
	    });
		radioButton_8.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=3;
	        	ceph+=2;
	        	
	        }
	    });
		
		JLabel lblRandomWrite = new JLabel("Random Write");
		lblRandomWrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRandomWrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRandomWrite.setBounds(455, 186, 92, 14);
		contentPane.add(lblRandomWrite);
		
		JRadioButton radioButton_7 = new JRadioButton("Moderate");
		radioButton_7.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_8.add(radioButton_7);
		radioButton_7.setBounds(564, 181, 81, 23);
		contentPane.add(radioButton_7);
		
		JRadioButton radioButton_9 = new JRadioButton("High");
		radioButton_9.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_8.add(radioButton_9);
		radioButton_9.setBounds(647, 181, 58, 23);
		contentPane.add(radioButton_9);
		
		radioButton_7.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_9.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		radioButton_9.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(Color.BLACK);
		separator_6.setBounds(214, 217, 1, 61);
		contentPane.add(separator_6);
		
		JLabel lblNewLabel_5 = new JLabel("Strided Read");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setBounds(0, 225, 79, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton radioButton_14 = new JRadioButton("Yes");
		radioButton_14.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_11.add(radioButton_14);
		radioButton_14.setBounds(90, 220, 58, 23);
		contentPane.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("No");
		radioButton_15.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_11.add(radioButton_15);
		radioButton_15.setBounds(150, 220, 50, 23);
		contentPane.add(radioButton_15);
		
		radioButton_14.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=1;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_15.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=2;
	        	swift+=1;
	        	ceph+=1;
	        	
	        }
	    });
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(444, 217, 1, 61);
		contentPane.add(separator_7);
		
		JLabel lblRecordRewrite = new JLabel("Record Rewrite");
		lblRecordRewrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecordRewrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRecordRewrite.setBounds(212, 225, 92, 14);
		contentPane.add(lblRecordRewrite);
		
		JRadioButton radioButton_18 = new JRadioButton("Moderate");
		radioButton_18.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_13.add(radioButton_18);
		radioButton_18.setBounds(301, 220, 81, 23);
		contentPane.add(radioButton_18);
		
		JRadioButton radioButton_21 = new JRadioButton("High");
		radioButton_21.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_13.add(radioButton_21);
		radioButton_21.setBounds(380, 220, 58, 23);
		contentPane.add(radioButton_21);
		
		radioButton_18.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_21.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblNewLabel_6 = new JLabel("Backward Read");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setBounds(455, 225, 92, 14);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton radioButton_19 = new JRadioButton("Moderate");
		radioButton_19.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_14.add(radioButton_19);
		radioButton_19.setBounds(564, 220, 81, 23);
		contentPane.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("High");
		radioButton_20.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_14.add(radioButton_20);
		radioButton_20.setBounds(647, 220, 58, 23);
		contentPane.add(radioButton_20);
		
		radioButton_19.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=1;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_20.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=0;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.DARK_GRAY);
		separator_8.setBounds(2, 289, 739, 2);
		contentPane.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.DARK_GRAY);
		separator_9.setBounds(-8, 331, 739, 2);
		contentPane.add(separator_9);
		
		JLabel lblNewLabel_8 = new JLabel("Access Control");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_8.setBounds(214, 344, 90, 15);
		contentPane.add(lblNewLabel_8);
		
		JRadioButton radioButton_26 = new JRadioButton("Moderate");
		radioButton_26.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_17.add(radioButton_26);
		radioButton_26.setBounds(310, 340, 79, 23);
		contentPane.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("High");
		radioButton_27.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_17.add(radioButton_27);
		radioButton_27.setBounds(386, 339, 50, 23);
		contentPane.add(radioButton_27);
		
		radioButton_26.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_27.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblNewLabel_9 = new JLabel("Look Up Time");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_9.setBounds(2, 344, 77, 14);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton radioButton_29 = new JRadioButton("Moderate");
		radioButton_29.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_18.add(radioButton_29);
		radioButton_29.setBounds(76, 340, 79, 23);
		contentPane.add(radioButton_29);
		
		JRadioButton radioButton_28 = new JRadioButton("High");
		radioButton_28.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_18.add(radioButton_28);
		radioButton_28.setBounds(158, 339, 50, 23);
		contentPane.add(radioButton_28);
		
		radioButton_29.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=3;
	        	ceph+=2;
	       	
	        }
	    });
		radioButton_28.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=3;
	        	ceph+=2;
	        	
	        }
	    });
		
		JLabel lblMetadataAcess = new JLabel("Metadata Access");
		lblMetadataAcess.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMetadataAcess.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMetadataAcess.setBounds(466, 344, 102, 14);
		contentPane.add(lblMetadataAcess);
		
		JRadioButton radioButton_30 = new JRadioButton("Moderate");
		radioButton_30.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_19.add(radioButton_30);
		radioButton_30.setBounds(570, 340, 79, 23);
		contentPane.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("High");
		radioButton_31.setFont(new Font("Verdana", Font.PLAIN, 11));
		buttonGroup_19.add(radioButton_31);
		radioButton_31.setBounds(647, 340, 58, 23);
		contentPane.add(radioButton_31);
		
		radioButton_30.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	/*hdfs+=1;
	        	swift+=2;
	        	ceph+=3;*/
	        	
	        }
	    });
		radioButton_31.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	/*hdfs+=1;
	        	swift+=2;
	        	ceph+=3;*/
	        	
	        }
	    });
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setForeground(Color.BLACK);
		separator_10.setBounds(442, 344, 1, 22);
		contentPane.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(214, 344, 1, 22);
		contentPane.add(separator_11);
		
		JLabel lblNewLabel_10 = new JLabel("HDFS");
		lblNewLabel_10.setBounds(268, 438, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Swift");
		lblNewLabel_11.setBounds(268, 477, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Ceph");
		lblNewLabel_12.setBounds(268, 513, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		final JButton btnNewButton = new JButton("Activate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  String[] env = {"./hdfsStart.sh"};
				  String cmd = "hdfsStart.sh";  //e.g test.sh -dparam1 -oout.txt
				  try {
					@SuppressWarnings("unused")
					Process process = Runtime.getRuntime().exec(cmd, env);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(306, 434, 89, 23);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Activate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] env = {"./swiftStart.sh"};
				  String cmd = "swiftStart.sh";  //e.g test.sh -dparam1 -oout.txt
				  try {
					@SuppressWarnings("unused")
					Process process = Runtime.getRuntime().exec(cmd, env);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/*
				  String[] env = {"PATH=/bin:/usr/bin/"};
				   String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt
				   Process process = Runtime.getRuntime().exec(cmd, env);
				*/
			}
		});
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(306, 473, 89, 23);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Activate");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] env = {"./cephStart.sh"};
				  String cmd = "cephStart.sh";  //e.g test.sh -dparam1 -oout.txt
				  try {
					@SuppressWarnings("unused")
					Process process = Runtime.getRuntime().exec(cmd, env);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			/*	
			    String[] env = {"PATH=/bin:/usr/bin/"};
				String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt
				Process process = Runtime.getRuntime().exec(cmd, env);
				
			*/
			}
		});
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(306, 509, 89, 23);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Recommend");
		
		final JButton btnNewButton_4 = new JButton("Deactivate");
		final JButton btnNewButton_5 = new JButton("Deactivate");
		final JButton btnNewButton_6 = new JButton("Deactivate");
		
		
		final JButton btnBestOfall = new JButton("Best Overall");
		btnBestOfall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				buttonGroup_6.clearSelection();
				buttonGroup_7.clearSelection();
				buttonGroup_8.clearSelection();
				//buttonGroup_9.clearSelection();
				//buttonGroup_10.clearSelection();
				buttonGroup_11.clearSelection();
				//buttonGroup_12.clearSelection();
				buttonGroup_13.clearSelection();
				buttonGroup_14.clearSelection();
				//buttonGroup_15.clearSelection();
				//buttonGroup_16.clearSelection();
				buttonGroup_17.clearSelection();
				buttonGroup_18.clearSelection();
				buttonGroup_19.clearSelection();	
				editableGroup.clearSelection();
				editableGroup2.clearSelection();
				editableGroup3.clearSelection();
				
				
				
				
				
				
				
				//btnNewButton.setEnabled(true); //hdfs
				//btnNewButton_1.setEnabled(true); //swift
				btnNewButton_3.setEnabled(false);  //ceph 
				btnNewButton_6.setEnabled(true);
				
				
				btnNewButton_2.setEnabled(true);
			}
		});
		
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							
				if(hdfs!=0 && swift!=0 && ceph!=0)
				{
					btnBestOfall.setEnabled(false);
					 int max =  Math.max(Math.max(hdfs,swift),ceph);
					if (max==hdfs)//if(hdfs>swift && hdfs>ceph )
					{
					btnNewButton.setEnabled(true);
					//flag1 = 1;
					btnNewButton_4.setEnabled(true);
					}
					else if(max==swift)//(swift>hdfs && swift>ceph)
					{
					btnNewButton_1.setEnabled(true);
					//flag2=1;
					btnNewButton_5.setEnabled(true);
					
					}
					else{
					btnNewButton_2.setEnabled(true);
					 //flag3=1;
					 btnNewButton_6.setEnabled(true);
					}
			    }
					
			}
		});
		btnNewButton_3.setBounds(386, 387, 115, 23);
		contentPane.add(btnNewButton_3);
		btnBestOfall.setBounds(268, 387, 108, 23);
		contentPane.add(btnBestOfall);
		
		JButton btnClear = new JButton("Reset");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				buttonGroup_6.clearSelection();
				buttonGroup_7.clearSelection();
				buttonGroup_8.clearSelection();
				//buttonGroup_9.clearSelection();
				//buttonGroup_10.clearSelection();
				buttonGroup_11.clearSelection();
				//buttonGroup_12.clearSelection();
				buttonGroup_13.clearSelection();
				buttonGroup_14.clearSelection();
				//buttonGroup_15.clearSelection();
				//buttonGroup_16.clearSelection();
				buttonGroup_17.clearSelection();
				buttonGroup_18.clearSelection();
				buttonGroup_19.clearSelection();	
				editableGroup.clearSelection();
				editableGroup2.clearSelection();
				editableGroup3.clearSelection();
				
				btnBestOfall.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				
				
				
			}
		});
		btnClear.setBounds(339, 547, 89, 23);
		contentPane.add(btnClear);
		
		//final JButton btnNewButton_4 = new JButton("Deactivate");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//if(flag1==1){
					btnNewButton_4.setEnabled(true);
					  String[] env = {"./hdfsStop.sh"};
					  String cmd = "hdfsStop.sh";  //e.g test.sh -dparam1 -oout.txt
					  try {
						@SuppressWarnings("unused")
						Process process = Runtime.getRuntime().exec(cmd, env);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				//}
				
			}
		});
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBounds(405, 434, 96, 23);
		contentPane.add(btnNewButton_4);
		
		//final JButton btnNewButton_5 = new JButton("Deactivate");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(flag2==1){
					btnNewButton_5.setEnabled(true);
					String[] env = {"./swiftStop.sh"};
					  String cmd = "swiftStop.sh";  //e.g test.sh -dparam1 -oout.txt
					  try {
						@SuppressWarnings("unused")
						Process process = Runtime.getRuntime().exec(cmd, env);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				//}
				
				
			}
			
		});
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.setBounds(405, 473, 96, 23);
		contentPane.add(btnNewButton_5);
		
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//if(flag3==1){
					
					String[] env = {"./cephStop.sh"};
					  String cmd = "cephStop.sh";  //e.g test.sh -dparam1 -oout.txt
					  try {
						@SuppressWarnings("unused")
						Process process = Runtime.getRuntime().exec(cmd, env);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				//}
				
			}
		});
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setBounds(405, 509, 96, 23);
		contentPane.add(btnNewButton_6);
	}
}
