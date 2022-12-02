import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Transport2 extends JFrame implements ActionListener {
	// declaring all the frames
	JFrame login_page = new JFrame();
	JFrame create_acc = new JFrame();
	JFrame booking_page = new JFrame();
	JFrame ticket = new JFrame();

	// declaring an image icon in jlabel to set it as background
	ImageIcon img = new ImageIcon("bg.jpg");
	JLabel bg = new JLabel("", img, JLabel.CENTER);

	// widgets to be used in login page
	JLabel login_welcm = new JLabel("Welcome to Fast Bus Transports");
	JLabel login_title = new JLabel("Login to continue forward");
	JLabel login_user1 = new JLabel("Username");
	JTextField login_user2 = new JTextField();
	JLabel login_pass1 = new JLabel("Password");
	JPasswordField login_pass2 = new JPasswordField();
	JCheckBox login_showpass = new JCheckBox("Show Password");
	JButton login_button = new JButton("Login");
	JButton create_acc_Button = new JButton("Create Account");

	// widgets to be used in creating account page
	JLabel create_title = new JLabel("Create your username and password.");
	JLabel create_name1 = new JLabel("Name");
	JTextField create_name2 = new JTextField();
	JLabel create_age1 = new JLabel("Age");
	JTextField create_age2 = new JTextField();
	JLabel create_contact1 = new JLabel("Contact");
	JTextField create_contact2 = new JTextField();
	JLabel create_user1 = new JLabel("Create Username");
	JTextField create_user2 = new JTextField();
	JLabel create_pwd1 = new JLabel("Create Password");
	JTextField create_pwd2 = new JTextField();
	JButton create_submit = new JButton("Create");

	// widgets to be used in booking page
	JLabel booking_title1 = new JLabel("Now you have successfully logged in");
	JLabel booking_title2 = new JLabel("Fill the Details below to book your ticket asap!");
	String stops[] = { "Bandra", "Dadar", "Ghatkopar", "Kalyan", "Thane" };
	JLabel start1 = new JLabel("From");
	JComboBox start2 = new JComboBox(stops);
	JLabel end1 = new JLabel("To");
	JComboBox end2 = new JComboBox(stops);
	JLabel booking_date1 = new JLabel("Date(In dd-mm-yyyy format)");
	JTextField booking_date2 = new JTextField();
	JLabel booking_person1 = new JLabel("No. of Person");
	JTextField booking_person2 = new JTextField();
	JButton book_button = new JButton("Book");

	public void login_page_func() {
		login_page.setBounds(0, 0, 1300, 900);
		login_page.setVisible(true);
		login_page.setLayout(null);
		login_page.setLocationRelativeTo(null);
		login_page.setTitle("Fast Bus Transports");

		login_welcm.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
		login_title.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
		login_user1.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
		login_pass1.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
		login_showpass.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		login_button.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_acc_Button.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));

		bg.setBounds(0, 0, 1300, 900);
		login_welcm.setBounds(30, 50, 500, 40);
		login_title.setBounds(30, 90, 400, 40);
		login_user1.setBounds(30, 150, 140, 30);
		login_user2.setBounds(145, 150, 200, 30);
		login_pass1.setBounds(30, 200, 140, 30);
		login_pass2.setBounds(145, 200, 200, 30);
		login_showpass.setBounds(30, 250, 200, 50);
		login_button.setBounds(30, 300, 100, 50);
		create_acc_Button.setBounds(150, 300, 180, 50);

		login_showpass.setOpaque(false);

		login_button.addActionListener(this);
		create_acc_Button.addActionListener(this);
		login_showpass.addActionListener(this);

		login_page.add(login_welcm);
		login_page.add(login_title);
		login_page.add(login_user1);
		login_page.add(login_user2);
		login_page.add(login_pass1);
		login_page.add(login_pass2);
		login_page.add(login_showpass);
		login_page.add(login_button);
		login_page.add(create_acc_Button);
		login_page.add(bg);
	}

	public void create() {
		create_acc.setBounds(0, 0, 1300, 900);
		create_acc.setVisible(true);
		create_acc.setLayout(null);
		create_acc.setLocationRelativeTo(null);
		create_acc.setTitle("Fast Bus Transports");

		create_title.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_name1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_age1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_contact1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_user1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_pwd1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		create_submit.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));

		create_title.setBounds(30, 50, 400, 40);
		create_name1.setBounds(30, 100, 140, 30);
		create_name2.setBounds(145, 100, 200, 30);
		create_age1.setBounds(30, 150, 140, 30);
		create_age2.setBounds(145, 150, 200, 30);
		create_contact1.setBounds(30, 200, 140, 30);
		create_contact2.setBounds(145, 200, 200, 30);
		create_user1.setBounds(30, 260, 200, 30);
		create_user2.setBounds(200, 260, 200, 30);
		create_pwd1.setBounds(30, 310, 200, 30);
		create_pwd2.setBounds(200, 310, 200, 30);
		create_submit.setBounds(30, 360, 100, 30);

		create_submit.addActionListener(this);

		create_acc.add(create_title);
		create_acc.add(create_name1);
		create_acc.add(create_name2);
		create_acc.add(create_contact1);
		create_acc.add(create_contact2);
		create_acc.add(create_age1);
		create_acc.add(create_age2);
		create_acc.add(create_user1);
		create_acc.add(create_user2);
		create_acc.add(create_pwd1);
		create_acc.add(create_pwd2);
		create_acc.add(create_submit);
		create_acc.add(bg);
	}

	public void booking_func() {
		booking_page.setSize(1300, 900);
		booking_page.setVisible(true);
		booking_page.setLayout(null);
		booking_page.setLocationRelativeTo(null);
		booking_page.setTitle("Fast Bus Transports");

		booking_title1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		booking_title2.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		start1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		end1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		booking_date1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		booking_person1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		book_button.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));

		booking_title1.setBounds(30, 40, 500, 30);
		booking_title2.setBounds(30, 70, 500, 30);
		start1.setBounds(30, 200, 80, 30);
		start2.setBounds(90, 200, 180, 30);
		end1.setBounds(280, 200, 40, 30);
		end2.setBounds(320, 200, 180, 30);
		booking_date1.setBounds(30, 240, 350, 30);
		booking_date2.setBounds(290, 240, 200, 30);
		booking_person1.setBounds(30, 280, 130, 30);
		booking_person2.setBounds(160, 280, 200, 30);
		book_button.setBounds(200, 330, 100, 30);

		book_button.addActionListener(this);

		booking_page.add(booking_title1);
		booking_page.add(booking_title2);
		booking_page.add(start1);
		booking_page.add(start2);
		booking_page.add(end1);
		booking_page.add(end2);
		booking_page.add(booking_date1);
		booking_page.add(booking_date2);
		booking_page.add(booking_person1);
		booking_page.add(booking_person2);
		booking_page.add(book_button);
		booking_page.add(bg);
	}

	public void print_ticket(String name, String contact, String date, int no_of_person, int price, String pickup,
			String destination) {
		ticket.setLayout(null);
		ticket.setSize(600, 600);
		ticket.setVisible(true);
		ticket.setLocationRelativeTo(null);
		ticket.setTitle("Fast Bus Transports");

		// widgets to be used in ticket frame
		JLabel company_name = new JLabel("Fast Bus Transports");
		JLabel print_name = new JLabel("Name: " + name);
		JLabel print_contact = new JLabel("Contact: " + contact);
		JLabel print_date = new JLabel("Date: " + date);
		JLabel print_travel = new JLabel("From " + pickup + " To " + destination);
		JLabel print_person = new JLabel("No of Person: " + no_of_person);
		JLabel print_price = new JLabel("Ticket price: " + price);
		JLabel print_validation = new JLabel("Ticket validate till for 1 day only!!");

		String[] print_timing = timing(pickup);
		JLabel timings_title = new JLabel("Your bus timings from " + pickup + " are: ");
		JLabel timings1 = new JLabel("1st Bus: " + print_timing[0]);
		JLabel timings2 = new JLabel("2nt Bus: " + print_timing[1]);
		JLabel timings3 = new JLabel("3rd Bus: " + print_timing[2]);
		JLabel timings4 = new JLabel("4th Bus: " + print_timing[3]);
		JLabel timings5 = new JLabel("5th Bus: " + print_timing[4]);

		company_name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
		print_name.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		print_contact.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		print_date.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		print_person.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		print_price.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		print_validation.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		print_travel.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		timings_title.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		timings1.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		timings2.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		timings3.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		timings4.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		timings5.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));

		company_name.setBounds(200, 50, 300, 30);
		print_name.setBounds(100, 80, 200, 30);
		print_contact.setBounds(100, 110, 200, 30);
		print_date.setBounds(100, 140, 200, 30);
		print_person.setBounds(100, 170, 200, 30);
		print_price.setBounds(100, 200, 200, 30);
		print_validation.setBounds(100, 230, 250, 30);
		print_travel.setBounds(100, 260, 200, 30);
		timings_title.setBounds(100, 290, 230, 30);
		timings1.setBounds(100, 320, 200, 30);
		timings2.setBounds(100, 350, 200, 30);
		timings3.setBounds(100, 380, 200, 30);
		timings4.setBounds(100, 410, 200, 30);
		timings5.setBounds(100, 440, 200, 30);

		ticket.add(company_name);
		ticket.add(print_name);
		ticket.add(print_contact);
		ticket.add(print_date);
		ticket.add(print_person);
		ticket.add(print_price);
		ticket.add(print_validation);
		ticket.add(print_travel);
		ticket.add(timings_title);
		ticket.add(timings1);
		ticket.add(timings2);
		ticket.add(timings3);
		ticket.add(timings4);
		ticket.add(timings5);
	}

	// calculating ticket price
	public int ticket_price(String starting_point, String destination, int n) {
		int price = 0, total_price;
		if (starting_point == destination) {
			JOptionPane.showMessageDialog(this, "Please select the starting and Destination point !!");
		} else {
			if (starting_point == "Kalyan") {
				if (destination == "Thane") {
					price = 10;
				} else {
					price = 20;
				}
			} else if (starting_point == "Thane") {
				if (destination == "Kalyan" || destination == "Ghatkopar") {
					price = 10;
				} else {
					price = 20;
				}
			} else if (starting_point == "Ghatkopar") {
				if (destination == "Kalyan") {
					price = 20;
				} else {
					price = 10;
				}
			} else if (starting_point == "Bandra") {
				if (destination == "Dadar") {
					price = 5;
				} else if (destination == "Ghatkopar") {
					price = 10;
				} else {
					price = 20;
				}
			} else if (starting_point == "Dadar") {
				if (destination == "Bandra") {
					price = 5;
				} else if (destination == "Ghatkopar") {
					price = 10;
				} else {
					price = 20;
				}
			}
		}

		total_price = price * n;
		return total_price;

	}

	// setting bus timings
	public String[] timing(String start) {
		String bus_timings[] = new String[5];
		if (start == "Kalyan") {
			bus_timings[0] = "10:30";
			bus_timings[1] = "12:00";
			bus_timings[2] = "13:30";
			bus_timings[3] = "15:00";
			bus_timings[4] = "17:00";
		} else if (start == "Thane") {
			bus_timings[0] = "11:20";
			bus_timings[1] = "12:50";
			bus_timings[2] = "14:20";
			bus_timings[3] = "15:50";
			bus_timings[0] = "17:50";
		} else if (start == "Ghatkopar") {
			bus_timings[0] = "12:00";
			bus_timings[1] = "13:30";
			bus_timings[2] = "15:00";
			bus_timings[3] = "16:30";
			bus_timings[4] = "18:30";
		} else if (start == "Bandra") {
			bus_timings[0] = "12:35";
			bus_timings[1] = "14:05";
			bus_timings[2] = "15:35";
			bus_timings[3] = "17:05";
			bus_timings[4] = "19:35";
		} else if (start == "Dadar") {
			bus_timings[0] = "12:40";
			bus_timings[1] = "14:10";
			bus_timings[2] = "15:40";
			bus_timings[3] = "17:10";
			bus_timings[4] = "19:40";
		}
		return bus_timings;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login_showpass) {
			if (login_showpass.isSelected()) {
				login_pass2.setEchoChar((char) 0);
			} else {
				login_pass2.setEchoChar('*');
			}
		}
		if (e.getSource() == create_acc_Button) {
			login_page.setVisible(false);
			create();
		}
		if (e.getSource() == create_submit) {
			create_acc.dispose();
			login_page.add(bg);
			login_page.setVisible(true);
		}
		if (e.getSource() == login_button) {
			String createpage_user = create_user2.getText();
			String createpage_pass = create_pwd2.getText();
			String loginpage_user = login_user2.getText();
			String loginpage_pass = new String(login_pass2.getPassword());
			if (loginpage_user.equals(createpage_user) && loginpage_pass.equals(createpage_pass)) {
				login_page.dispose();
				booking_func();
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}
		}
		if (e.getSource() == book_button) {
			String pickuppoint = start2.getSelectedItem().toString();
			String destinationpoint = end2.getSelectedItem().toString();
			String name = create_name2.getText();
			String contact = create_contact2.getText();
			String date = booking_date2.getText();
			int no_of_person = Integer.parseInt(booking_person2.getText());
			String[] options = { "Edit", "Print Ticket" };
			int price = ticket_price(pickuppoint, destinationpoint, no_of_person);

			int result = JOptionPane.showOptionDialog(this,
					"Your Ticket Details \n\nName: " + name + "\nContact Number: "
							+ contact + "\nDate of Journey: " + date
							+ "\nNumber of persons: " + no_of_person + "\nStarting: " + pickuppoint
							+ "\nDestination: " + destinationpoint + "\nTicket Price: " + price,
					"Fast Transports",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE,
					null, options,
					options[0]);

			if (result == JOptionPane.NO_OPTION) {
				print_ticket(name, contact, date, no_of_person, price, pickuppoint, destinationpoint);

			}
		}
	}
}

class Transport {
	public static void main(String args[]) {
		Transport2 f = new Transport2();
		f.login_page_func();
	}
}