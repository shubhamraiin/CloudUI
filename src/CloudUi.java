
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

import javax.swing.border.MatteBorder;


@SuppressWarnings("serial")
public class CloudUi extends JFrame {
	
	
	int hdfs=0;
	int swift=0;
	int ceph=0;

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
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	private final ButtonGroup buttonGroup_10 = new ButtonGroup();
	private final ButtonGroup buttonGroup_11 = new ButtonGroup();
	private final ButtonGroup buttonGroup_12 = new ButtonGroup();
	private final ButtonGroup buttonGroup_13 = new ButtonGroup();
	private final ButtonGroup buttonGroup_14 = new ButtonGroup();
	private final ButtonGroup buttonGroup_15 = new ButtonGroup();
	private final ButtonGroup buttonGroup_16 = new ButtonGroup();
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
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 610);
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
		rdbtnNewRadioButton.setBounds(98, 50, 50, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Many");
		rdbtnNewRadioButton_1.setBounds(150, 50, 58, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		 ButtonGroup editableGroup = new ButtonGroup();
		    editableGroup.add(rdbtnNewRadioButton);
		    editableGroup.add(rdbtnNewRadioButton_1);
		 
		    rdbtnNewRadioButton.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	hdfs+=1;
		        	swift+=2;
		        	ceph+=3;
		        	
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
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(98, 80, 50, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("No");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(150, 80, 45, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });

	    rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
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
		lblNewLabel_2.setBounds(522, 54, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("low");
		rdbtnNewRadioButton_4.setBounds(607, 50, 50, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("High");
		rdbtnNewRadioButton_5.setBounds(659, 50, 82, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		ButtonGroup editableGroup2 = new ButtonGroup();
	    editableGroup2.add(rdbtnNewRadioButton_4);
	    editableGroup2.add(rdbtnNewRadioButton_5);
	 
	    rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
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
		lblNewLabel_3.setBounds(225, 84, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setBounds(299, 80, 58, 23);
		contentPane.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setBounds(359, 80, 86, 23);
		contentPane.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setBounds(447, 80, 58, 23);
		contentPane.add(rdbtnLarge);
		
		ButtonGroup editableGroup3 = new ButtonGroup();
	    editableGroup3.add(rdbtnSmall);
	    editableGroup3.add(rdbtnMedium);
	    editableGroup3.add(rdbtnLarge);
	 
	    rdbtnSmall.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });

	    rdbtnMedium.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
	    rdbtnLarge.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });

		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(511, 51, 1, 52);
		contentPane.add(separator_1);
		
		JLabel lblRedudantMetadataServer = new JLabel("Redudant Metadata Server");
		lblRedudantMetadataServer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRedudantMetadataServer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRedudantMetadataServer.setBounds(221, 54, 161, 14);
		contentPane.add(lblRedudantMetadataServer);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(388, 50, 50, 23);
		contentPane.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(447, 50, 50, 23);
		contentPane.add(rdbtnNo);
		rdbtnYes.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		rdbtnNo.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });

		
		JLabel lblMultiTenancy = new JLabel("Multi Tenancy");
		lblMultiTenancy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMultiTenancy.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMultiTenancy.setBounds(514, 84, 94, 14);
		contentPane.add(lblMultiTenancy);
		
		JRadioButton rdbtnYes_1 = new JRadioButton("Yes");
		buttonGroup_2.add(rdbtnYes_1);
		rdbtnYes_1.setBounds(607, 80, 50, 23);
		contentPane.add(rdbtnYes_1);
		
		JRadioButton rdbtnNo_1 = new JRadioButton("No");
		buttonGroup_2.add(rdbtnNo_1);
		rdbtnNo_1.setBounds(659, 80, 50, 23);
		contentPane.add(rdbtnNo_1);
		
		rdbtnYes_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		rdbtnNo_1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
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
		buttonGroup_3.add(rdbtnModerate);
		rdbtnModerate.setBounds(68, 156, 81, 23);
		contentPane.add(rdbtnModerate);
		
		JRadioButton rdbtnHigh = new JRadioButton("High");
		buttonGroup_3.add(rdbtnHigh);
		rdbtnHigh.setBounds(150, 156, 58, 23);
		contentPane.add(rdbtnHigh);
		
		rdbtnModerate.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		rdbtnHigh.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
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
		buttonGroup_4.add(radioButton);
		radioButton.setBounds(67, 182, 81, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("High");
		buttonGroup_4.add(radioButton_1);
		radioButton_1.setBounds(150, 182, 58, 23);
		contentPane.add(radioButton_1);
		
		radioButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
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
		buttonGroup_5.add(radioButton_2);
		radioButton_2.setBounds(301, 156, 81, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("High");
		buttonGroup_5.add(radioButton_3);
		radioButton_3.setBounds(380, 156, 58, 23);
		contentPane.add(radioButton_3);
		
		radioButton_2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblRewrite = new JLabel("Re-Write");
		lblRewrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRewrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRewrite.setBounds(225, 185, 70, 14);
		contentPane.add(lblRewrite);
		
		JRadioButton radioButton_4 = new JRadioButton("Moderate");
		buttonGroup_6.add(radioButton_4);
		radioButton_4.setBounds(301, 181, 81, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("High");
		buttonGroup_6.add(radioButton_5);
		radioButton_5.setBounds(380, 181, 58, 23);
		contentPane.add(radioButton_5);
		
		radioButton_4.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_5.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
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
		buttonGroup_7.add(radioButton_6);
		radioButton_6.setBounds(564, 156, 81, 23);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_8 = new JRadioButton("High");
		buttonGroup_7.add(radioButton_8);
		radioButton_8.setBounds(647, 156, 58, 23);
		contentPane.add(radioButton_8);
		
		radioButton_6.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_8.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblRandomWrite = new JLabel("Random Write");
		lblRandomWrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRandomWrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRandomWrite.setBounds(455, 186, 92, 14);
		contentPane.add(lblRandomWrite);
		
		JRadioButton radioButton_7 = new JRadioButton("Moderate");
		buttonGroup_8.add(radioButton_7);
		radioButton_7.setBounds(564, 181, 81, 23);
		contentPane.add(radioButton_7);
		
		JRadioButton radioButton_9 = new JRadioButton("High");
		buttonGroup_8.add(radioButton_9);
		radioButton_9.setBounds(647, 181, 58, 23);
		contentPane.add(radioButton_9);
		
		radioButton_7.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
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
		
		JLabel lblNewLabel_4 = new JLabel("F-Read");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_4.setBounds(2, 224, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton radioButton_10 = new JRadioButton("Moderate");
		buttonGroup_9.add(radioButton_10);
		radioButton_10.setBounds(67, 220, 81, 23);
		contentPane.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("High");
		buttonGroup_9.add(radioButton_11);
		radioButton_11.setBounds(150, 220, 58, 23);
		contentPane.add(radioButton_11);
		
		radioButton_9.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_11.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		
		
		JLabel lblFwrite = new JLabel("F-Write");
		lblFwrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFwrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFwrite.setBounds(2, 249, 56, 14);
		contentPane.add(lblFwrite);
		
		JRadioButton radioButton_12 = new JRadioButton("Moderate");
		buttonGroup_10.add(radioButton_12);
		radioButton_12.setBounds(67, 246, 81, 23);
		contentPane.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("High");
		buttonGroup_10.add(radioButton_13);
		radioButton_13.setBounds(150, 246, 58, 23);
		contentPane.add(radioButton_13);
		
		
		
		radioButton_12.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_13.addActionListener(new ActionListener() {
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
		separator_6.setBounds(214, 217, 1, 80);
		contentPane.add(separator_6);
		
		JLabel lblNewLabel_5 = new JLabel("Strided Read");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setBounds(214, 224, 79, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton radioButton_14 = new JRadioButton("Moderate");
		buttonGroup_11.add(radioButton_14);
		radioButton_14.setBounds(301, 220, 81, 23);
		contentPane.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("High");
		buttonGroup_11.add(radioButton_15);
		radioButton_15.setBounds(380, 220, 58, 23);
		contentPane.add(radioButton_15);
		
		radioButton_14.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_15.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(444, 217, 1, 80);
		contentPane.add(separator_7);
		
		JLabel lblRandomMix = new JLabel("Random Mix");
		lblRandomMix.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRandomMix.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRandomMix.setBounds(225, 249, 70, 14);
		contentPane.add(lblRandomMix);
		
		JRadioButton radioButton_16 = new JRadioButton("Moderate");
		buttonGroup_12.add(radioButton_16);
		radioButton_16.setBounds(301, 245, 81, 23);
		contentPane.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("High");
		buttonGroup_12.add(radioButton_17);
		radioButton_17.setBounds(380, 245, 58, 23);
		contentPane.add(radioButton_17);
		
		radioButton_16.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_17.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblRecordRewrite = new JLabel("Record Rewrite");
		lblRecordRewrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecordRewrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRecordRewrite.setBounds(455, 224, 92, 14);
		contentPane.add(lblRecordRewrite);
		
		JRadioButton radioButton_18 = new JRadioButton("Moderate");
		buttonGroup_13.add(radioButton_18);
		radioButton_18.setBounds(564, 224, 81, 23);
		contentPane.add(radioButton_18);
		
		JRadioButton radioButton_21 = new JRadioButton("High");
		buttonGroup_13.add(radioButton_21);
		radioButton_21.setBounds(647, 224, 58, 23);
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
		lblNewLabel_6.setBounds(455, 249, 92, 14);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton radioButton_19 = new JRadioButton("Moderate");
		buttonGroup_14.add(radioButton_19);
		radioButton_19.setBounds(564, 245, 81, 23);
		contentPane.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("High");
		buttonGroup_14.add(radioButton_20);
		radioButton_20.setBounds(647, 245, 58, 23);
		contentPane.add(radioButton_20);
		
		radioButton_19.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_20.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblNewLabel_7 = new JLabel("FRe-read");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_7.setBounds(2, 283, 56, 14);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton radioButton_22 = new JRadioButton("Moderate");
		buttonGroup_15.add(radioButton_22);
		radioButton_22.setBounds(67, 279, 81, 23);
		contentPane.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("High");
		buttonGroup_15.add(radioButton_23);
		radioButton_23.setBounds(150, 279, 58, 23);
		contentPane.add(radioButton_23);
		
		radioButton_22.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_23.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		
		JLabel lblFrewrite = new JLabel("FRe-Write");
		lblFrewrite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrewrite.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFrewrite.setBounds(477, 283, 70, 14);
		contentPane.add(lblFrewrite);
		
		JRadioButton radioButton_24 = new JRadioButton("Moderate");
		buttonGroup_16.add(radioButton_24);
		radioButton_24.setBounds(564, 279, 81, 23);
		contentPane.add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton("High");
		buttonGroup_16.add(radioButton_25);
		radioButton_25.setBounds(647, 279, 58, 23);
		contentPane.add(radioButton_25);
		
		radioButton_24.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_25.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.DARK_GRAY);
		separator_8.setBounds(2, 309, 739, 2);
		contentPane.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(Color.DARK_GRAY);
		separator_9.setBounds(2, 350, 739, 2);
		contentPane.add(separator_9);
		
		JLabel lblNewLabel_8 = new JLabel("Access Control");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_8.setBounds(2, 363, 90, 14);
		contentPane.add(lblNewLabel_8);
		
		JRadioButton radioButton_26 = new JRadioButton("Moderate");
		buttonGroup_17.add(radioButton_26);
		radioButton_26.setBounds(102, 359, 79, 23);
		contentPane.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("High");
		buttonGroup_17.add(radioButton_27);
		radioButton_27.setBounds(182, 359, 50, 23);
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
		lblNewLabel_9.setBounds(238, 363, 77, 14);
		contentPane.add(lblNewLabel_9);
		
		JRadioButton radioButton_29 = new JRadioButton("Moderate");
		buttonGroup_18.add(radioButton_29);
		radioButton_29.setBounds(321, 359, 81, 23);
		contentPane.add(radioButton_29);
		
		JRadioButton radioButton_28 = new JRadioButton("High");
		buttonGroup_18.add(radioButton_28);
		radioButton_28.setBounds(404, 359, 50, 23);
		contentPane.add(radioButton_28);
		
		radioButton_29.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_28.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JLabel lblMetadataAcess = new JLabel("Metadata Access");
		lblMetadataAcess.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMetadataAcess.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMetadataAcess.setBounds(468, 363, 102, 14);
		contentPane.add(lblMetadataAcess);
		
		JRadioButton radioButton_30 = new JRadioButton("Moderate");
		buttonGroup_19.add(radioButton_30);
		radioButton_30.setBounds(576, 359, 79, 23);
		contentPane.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("High");
		buttonGroup_19.add(radioButton_31);
		radioButton_31.setBounds(651, 359, 58, 23);
		contentPane.add(radioButton_31);
		
		radioButton_30.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		radioButton_31.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	hdfs+=1;
	        	swift+=2;
	        	ceph+=3;
	        	
	        }
	    });
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setForeground(Color.BLACK);
		separator_10.setBounds(461, 360, 1, 22);
		contentPane.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(238, 360, 1, 22);
		contentPane.add(separator_11);
		
		JLabel lblNewLabel_10 = new JLabel("HDFS");
		lblNewLabel_10.setBounds(288, 454, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Swift");
		lblNewLabel_11.setBounds(288, 492, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Ceph");
		lblNewLabel_12.setBounds(288, 533, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		final JButton btnNewButton = new JButton("Activate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				  String[] env = {"PATH=/bin:/usr/bin/"};
				  String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt
				  Process process = Runtime.getRuntime().exec(cmd, env);
				*/
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(365, 450, 89, 23);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Activate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				  String[] env = {"PATH=/bin:/usr/bin/"};
				   String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt
				   Process process = Runtime.getRuntime().exec(cmd, env);
				*/
			}
		});
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(365, 488, 89, 23);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Activate");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			/*	
			    String[] env = {"PATH=/bin:/usr/bin/"};
				String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt
				Process process = Runtime.getRuntime().exec(cmd, env);
				
			*/
			}
		});
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(365, 529, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Recommend");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hdfs!=0 && swift!=0 && ceph!=0)
				{
				
					if(hdfs>=swift && hdfs>=ceph )
					{
					btnNewButton.setEnabled(true);
					}
					else if(swift>=hdfs && swift>=ceph){
					btnNewButton_1.setEnabled(true);
					}
					else
					btnNewButton_2.setEnabled(true);
			    }
					
			}
		});
		btnNewButton_3.setBounds(293, 402, 161, 23);
		contentPane.add(btnNewButton_3);
	}
}
