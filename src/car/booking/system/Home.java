package car.booking.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame{
    String username;
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    
    public Home(String username) {
        super("Car Booking System");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("car/booking/system/icons/main.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel l1 = new JLabel("cars4u");
	l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
	l1.setBounds(780, 60, 1000, 100);
	NewLabel.add(l1);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("CUSTOMER");
        m1.setForeground(Color.BLACK);
	menuBar.add(m1);
		
        JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
	m1.add(mi1);
        
        JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
	m1.add(mi3);
        
        JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER DETAILS");
	m1.add(mi4);
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomer().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteCustomer().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu m3 = new JMenu("BOOK INTERCITY CAR");
        m3.setForeground(Color.BLACK);
	menuBar.add(m3);
        
        JMenuItem mi8 = new JMenuItem("VIEW CARS");
	m3.add(mi8);
        
        JMenuItem mi9 = new JMenuItem("BOOK CAR");
	m3.add(mi9);
        
        JMenuItem mi10 = new JMenuItem("VIEW BOOKED CAR");
	m3.add(mi10);
        
        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new ViewCars().setVisible(true);
            }
	});
        
        
        
	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookIntercityCar(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewInterCityBookedCar().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        
        JMenu m9 = new JMenu("BILL");
        m9.setForeground(Color.BLACK);
	menuBar.add(m9);
        
        JMenuItem mi18 = new JMenuItem("CHECK BILL");
	m9.add(mi18);
        
        mi18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckBill().setVisible(true);
                }catch(Exception e){ }
            }
	});
        
        
        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.BLACK);
	menuBar.add(m5);
        
        JMenuItem mi12 = new JMenuItem("PROCEED TO PAYMENT");
	m5.add(mi12);
        
        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
	});
        
        JMenu m6 = new JMenu("UTILITY");
        m6.setForeground(Color.BLACK);
	menuBar.add(m6);
        
        JMenuItem mi13 = new JMenuItem("NOTEPAD");
	m6.add(mi13);
        
        JMenuItem mi14 = new JMenuItem("CALCULATOR");
	m6.add(mi14);
        
        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        
        mi14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});
        
        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLACK);
	menuBar.add(m7);
        
        JMenuItem mi15 = new JMenuItem("ABOUT");
	m7.add(mi15);
        
        mi15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new About().setVisible(true);
            }
	});
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
