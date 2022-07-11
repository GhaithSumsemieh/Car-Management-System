package car.booking.system;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class CheckBill extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBill frame = new CheckBill();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public CheckBill() throws SQLException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 220, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("car/booking/system/icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("car/booking/system/icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
		table = new JTable();
		table.setBounds(0, 40, 900, 350);
		contentPane.add(table);
                
                try{
                    Conn c = new Conn();
                        String displaycar_rentalsql = "select first_name, last_name, car, price from car_rental";
                        ResultSet rs = c.s.executeQuery(displaycar_rentalsql);
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(390, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblAvailability = new JLabel("Name");
		lblAvailability.setBounds(0, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("Second Name");
		lblCleanStatus.setBounds(225, 15, 100, 14);
		contentPane.add(lblCleanStatus);
		
		lblNewLabel = new JLabel("Car");
		lblNewLabel.setBounds(450, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setBounds(675, 15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		
                
               
                getContentPane().setBackground(Color.WHITE);
	}

}