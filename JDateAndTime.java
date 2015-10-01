// Filename JDateAndTime.java
// Written by Chris Heavner
// Written on 7/28/13
// Ch 17 Ex4 - A JApplet that contains a JButton and a JTextfield that displays the date and time.
import java.util.*;  //Imports the GregorianCalendar
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JDateAndTime extends JApplet implements ActionListener
{
   GregorianCalendar today = new GregorianCalendar();
   int month = today.get(GregorianCalendar.MONTH);
   int day = today.get(GregorianCalendar.DAY_OF_MONTH);
   int year = today.get(GregorianCalendar.YEAR);
   int hour = today.get(GregorianCalendar.HOUR);
   int minute = today.get(GregorianCalendar.MINUTE);
   JLabel greeting = new JLabel("Click Press me for today's date and time.");
   Font font1 = new Font("Teen", Font.BOLD, 24);
   Font font2 = new Font("Teen", Font.ITALIC, 24);
   JTextField dateTime = new JTextField();
   JButton pressMe = new JButton("Press me");
   JLabel personalGreeting = new JLabel(" ");
   Container con = getContentPane();
   public void init()
   {
      greeting.setFont(font1);
      personalGreeting.setFont(font2);
      con.add(greeting);
      con.add(pressMe);
	  con.add(dateTime);
      con.setLayout(new FlowLayout());
      con.setBackground(Color.YELLOW);
      pressMe.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      dateTime.setEditable(false);
      con.remove(greeting);
      con.remove(pressMe);
      personalGreeting.setText("Go Atlanta Braves!");
	  dateTime.setText("Todays date is: " + (month + 1) + " - " + day + " - " + year + " and the time is: " +
	  hour + ":" + minute);
      con.add(personalGreeting);
      con.setBackground(Color.RED);
      validate();
   }
}
