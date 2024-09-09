package MY_CLAC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI  extends JFrame{
	
	public GUI() 
	{
		showgui();
	}
	// OBJETCS ON FRAME
	JPanel P1 = new JPanel();
	/*
	// sum
	Button B1 = new Button("CLEAR");
	JTextField T1 = new JTextField();
	JLabel L1 = new JLabel("+");
	JTextField T11 = new JTextField();
	Button B11 = new Button("=");
	JTextField T111 = new JTextField();
	// sub
	Button B2 = new Button("CLEAR");
	JTextField T2 = new JTextField();
	JLabel L2 = new JLabel("-");
	JTextField T22 = new JTextField();
	Button B22 = new Button("=");
	JTextField T222 = new JTextField();
	// mult
	Button B3 = new Button("CLEAR");
	JTextField T3 = new JTextField();
	JLabel L3 = new JLabel("x");
	JTextField T33 = new JTextField();
	Button B33 = new Button("=");
	JTextField T333 = new JTextField();
	// div
	Button B4 = new Button("CLEAR");
	JTextField T4 = new JTextField();
	JLabel L4 = new JLabel("/");
	JTextField T44 = new JTextField();
	Button B44 = new Button("=");
	JTextField T444 = new JTextField();
	//___________________________________________________________________________________________________
	// AND
	Button BB1 = new Button("CLEAR");
	JTextField TT1 = new JTextField();
	JLabel LL1 = new JLabel("&");
	JTextField TT11 = new JTextField();
	Button BB11 = new Button("=");
	JLabel LL11 = new JLabel("DEC");
	JTextField TT111 = new JTextField();
	JLabel LL111 = new JLabel("HEX");
	JTextField TT1111 = new JTextField();
	JLabel LL1111 = new JLabel("BIN");
	JTextField TT11111 = new JTextField();
	// OR
	Button BB2 = new Button("CLEAR");
	JTextField TT2 = new JTextField();
	JLabel LL2 = new JLabel("|");
	JTextField TT22 = new JTextField();
	Button BB22 = new Button("=");
	JLabel LL22 = new JLabel("DEC");
	JTextField TT222 = new JTextField();
	JLabel LL222 = new JLabel("HEX");
	JTextField TT2222 = new JTextField();
	JLabel LL2222 = new JLabel("BIN");
	JTextField TT22222 = new JTextField();
	// LEFT SHIFT
	Button BB3 = new Button("CLEAR");
	JTextField TT3 = new JTextField();
	JLabel LL3 = new JLabel("<<");
	JTextField TT33 = new JTextField();
	Button BB33 = new Button("=");
	JLabel LL33 = new JLabel("DEC");
	JTextField TT333 = new JTextField();
	JLabel LL333 = new JLabel("HEX");
	JTextField TT3333 = new JTextField();
	JLabel LL3333 = new JLabel("BIN");
	JTextField TT33333 = new JTextField();
	// RIGHT SHIFT
	Button BB4 = new Button("CLEAR");
	JTextField TT4 = new JTextField();
	JLabel LL4 = new JLabel(">>");
	JTextField TT44 = new JTextField();
	Button BB44 = new Button("=");
	JLabel LL44 = new JLabel("DEC");
	JTextField TT444 = new JTextField();
	JLabel LL444 = new JLabel("HEX");
	JTextField TT4444 = new JTextField();
	JLabel LL4444 = new JLabel("BIN");
	JTextField TT44444 = new JTextField();
	// NOT
	Button BB5 = new Button("CLEAR");
	JTextField TT5 = new JTextField();
	JLabel LL5 = new JLabel("~");
	Button BB55 = new Button("=");
	JLabel LL55 = new JLabel("DEC");
	JTextField TT555 = new JTextField();
	JLabel LL555 = new JLabel("HEX");
	JTextField TT5555 = new JTextField();
	JLabel LL5555 = new JLabel("BIN");
	JTextField TT55555 = new JTextField();
	*/
	
	//___________________________________________________________________________________________________
	public void showgui()
	{
		setTitle("MY_CALCULATOR"); 
		setSize(1040, 780); 
		setLocation(270,30);
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setResizable(false); 
		this.add(P1);
		P1.setLayout(null);
	        
	        // Set background color for the panel
	        P1.setBackground(Color.DARK_GRAY);

	        // Font for the buttons and labels
	        Font font = new Font("Arial", Font.BOLD, 16);
	        Font font_2 = new Font("Arial", Font.BOLD, 30);
	        Font resultFont = new Font("Arial", Font.PLAIN, 14);

	        // Title Label
	        JLabel LL = new JLabel("Calculator");
	        Button BB = new Button("CLEAR ALL");
	        BB.setBounds(750, 200, 200, 50);
	        BB.setFont(new Font("Arial", Font.BOLD, 20));
	        BB.setForeground(Color.RED);
	        BB.setBackground(Color.white);
	        P1.add(BB);
	        LL.setBounds(730,100, 400, 50);
	        LL.setFont(new Font("Arial", Font.BOLD, 50));
	        LL.setForeground(Color.YELLOW);
	        P1.add(LL);
	        
	        // SUM
	        Button B1 = new Button("CLEAR");
	        JTextField T1 = new JTextField();
	        JLabel L1 = new JLabel("+");
	        JTextField T11 = new JTextField();
	        Button B11 = new Button("=");
	        Label T111 = new Label();
	        
	        B1.setBounds(20, 60, 100, 40);
	        B1.setFont(font);
	        B1.setForeground(Color.YELLOW);
	        B1.setBackground(new Color(165, 42, 42));
	        T1.setBounds(140, 60, 100, 40);
	        T1.setFont(font);
	        L1.setBounds(270, 60, 100, 40);
	        L1.setFont(font_2);
	        L1.setForeground(Color.WHITE);
	        T11.setBounds(320, 60, 100, 40);
	        T11.setFont(font);
	        B11.setBounds(440, 60, 100, 40);
	        B11.setFont(font_2);
	        B11.setForeground(Color.GREEN);
	        B11.setBackground(Color.white);
	        T111.setBounds(560, 60, 100, 40);
	        T111.setFont(resultFont);
	        T111.setBackground(Color.WHITE);
	        T111.setForeground(Color.black);

	        P1.add(B1);
	        P1.add(T1);
	        P1.add(L1);
	        P1.add(T11);
	        P1.add(B11);
	        P1.add(T111);

	        // SUB
	        Button B2 = new Button("CLEAR");
	        JTextField T2 = new JTextField();
	        JLabel L2 = new JLabel("-");
	        JTextField T22 = new JTextField();
	        Button B22 = new Button("=");
	        Label T222 = new Label();

	        B2.setBounds(20, 130, 100, 40);
	        B2.setFont(font);
	        B2.setForeground(Color.YELLOW);
	        B2.setBackground(new Color(165, 42, 42));
	        T2.setBounds(140, 130, 100, 40);
	        T2.setFont(font);
	        L2.setBounds(270, 130, 100, 40);
	        L2.setFont(font_2);
	        L2.setForeground(Color.WHITE);
	        T22.setBounds(320, 130, 100, 40);
	        T22.setFont(font);
	        B22.setBounds(440, 130, 100, 40);
	        B22.setFont(font_2);
	        B22.setForeground(Color.GREEN);
	        B22.setBackground(Color.white);
	        T222.setBounds(560, 130, 100, 40);
	        T222.setFont(resultFont);
	        T222.setBackground(Color.WHITE);
	        T222.setForeground(Color.black);

	        P1.add(B2);
	        P1.add(T2);
	        P1.add(L2);
	        P1.add(T22);
	        P1.add(B22);
	        P1.add(T222);

	        // MULT
	        Button B3 = new Button("CLEAR");
	        JTextField T3 = new JTextField();
	        JLabel L3 = new JLabel("*");
	        JTextField T33 = new JTextField();
	        Button B33 = new Button("=");
	        Label T333 = new Label();

	        B3.setBounds(20, 200, 100, 40);
	        B3.setFont(font);
	        B3.setForeground(Color.YELLOW);
	        B3.setBackground(new Color(165, 42, 42));
	        T3.setBounds(140, 200, 100, 40);
	        T3.setFont(font);
	        L3.setBounds(270, 200, 100, 40);
	        L3.setFont(font_2);
	        L3.setForeground(Color.WHITE);
	        T33.setBounds(320, 200, 100, 40);
	        T33.setFont(font);
	        B33.setBounds(440, 200, 100, 40);
	        B33.setFont(font_2);
	        B33.setForeground(Color.GREEN);
	        B33.setBackground(Color.white);
	        T333.setBounds(560, 200, 100, 40);
	        T333.setFont(resultFont);
	        T333.setBackground(Color.WHITE);
	        T333.setForeground(Color.black);

	        P1.add(B3);
	        P1.add(T3);
	        P1.add(L3);
	        P1.add(T33);
	        P1.add(B33);
	        P1.add(T333);

	        // DIV
	        Button B4 = new Button("CLEAR");
	        JTextField T4 = new JTextField();
	        JLabel L4 = new JLabel("/");
	        JTextField T44 = new JTextField();
	        Button B44 = new Button("=");
	        Label T444 = new Label();

	        B4.setBounds(20, 270, 100, 40);
	        B4.setFont(font);
	        B4.setForeground(Color.YELLOW);
	        B4.setBackground(new Color(165, 42, 42));
	        T4.setBounds(140, 270, 100, 40);
	        T4.setFont(font);
	        L4.setBounds(270, 270, 100, 40);
	        L4.setFont(font_2);
	        L4.setForeground(Color.WHITE);
	        T44.setBounds(320, 270, 100, 40);
	        T44.setFont(font);
	        B44.setBounds(440, 270, 100, 40);
	        B44.setFont(font_2);
	        B44.setForeground(Color.GREEN);
	        B44.setBackground(Color.white);
	        T444.setBounds(560, 270, 100, 40);
	        T444.setFont(resultFont);
	        T444.setBackground(Color.WHITE);
	        T444.setForeground(Color.black);

	        P1.add(B4);
	        P1.add(T4);
	        P1.add(L4);
	        P1.add(T44);
	        P1.add(B44);
	        P1.add(T444);

	        // AND
	        Button BB1 = new Button("CLEAR");
	        JTextField TT1 = new JTextField();
	        JLabel LL1 = new JLabel("&");
	        JTextField TT11 = new JTextField();
	        Button BB11 = new Button("=");
	        JLabel LL11 = new JLabel("DEC");
	        Label TT111 = new Label();
	        JLabel LL111 = new JLabel("HEX");
	        Label TT1111 = new Label();
	        JLabel LL1111 = new JLabel("BIN");
	        Label TT11111 = new Label();

	        BB1.setBounds(20, 340, 100, 40);
	        BB1.setFont(font);
	        BB1.setForeground(Color.YELLOW);
	        BB1.setBackground(new Color(165, 42, 42));
	        TT1.setBounds(140, 340, 100, 40);
	        TT1.setFont(font);
	        LL1.setBounds(270, 340, 100, 40);
	        LL1.setFont(font_2);
	        LL1.setForeground(Color.WHITE);
	        TT11.setBounds(320, 340, 100, 40);
	        TT11.setFont(font);
	        BB11.setBounds(440, 340, 100, 40);
	        BB11.setFont(font_2);
	        BB11.setForeground(Color.GREEN);
	        BB11.setBackground(Color.white);
	        LL11.setBounds(560, 340, 40, 40);
	        LL11.setFont(font);
	        LL11.setForeground(Color.YELLOW);
	        TT111.setBounds(600, 340, 100, 40);
	        TT111.setFont(resultFont);
	        TT111.setBackground(Color.WHITE);
	        TT111.setForeground(Color.black);
	        LL111.setBounds(710, 340, 40, 40);
	        LL111.setFont(font);
	        LL111.setForeground(Color.YELLOW);
	        TT1111.setBounds(750, 340, 100, 40);
	        TT1111.setFont(resultFont);
	        TT1111.setBackground(Color.WHITE);
	        TT1111.setForeground(Color.black);
	        LL1111.setBounds(860, 340, 40, 40);
	        LL1111.setFont(font);
	        LL1111.setForeground(Color.YELLOW);
	        TT11111.setBounds(900, 340, 100, 40);
	        TT11111.setFont(resultFont);
	        TT11111.setBackground(Color.WHITE);
	        TT11111.setForeground(Color.black);

	        P1.add(BB1);
	        P1.add(TT1);
	        P1.add(LL1);
	        P1.add(TT11);
	        P1.add(BB11);
	        P1.add(LL11);
	        P1.add(TT111);
	        P1.add(LL111);
	        P1.add(TT1111);
	        P1.add(LL1111);
	        P1.add(TT11111);

	        // OR
	        Button BB2 = new Button("CLEAR");
	        JTextField TT2 = new JTextField();
	        JLabel LL2 = new JLabel("|");
	        JTextField TT22 = new JTextField();
	        Button BB22 = new Button("=");
	        JLabel LL22 = new JLabel("DEC");
	        Label TT222 = new Label();
	        JLabel LL222 = new JLabel("HEX");
	        Label TT2222 = new Label();
	        JLabel LL2222 = new JLabel("BIN");
	        Label TT22222 = new Label();

	        BB2.setBounds(20, 410, 100, 40);
	        BB2.setFont(font);
	        BB2.setForeground(Color.YELLOW);
	        BB2.setBackground(new Color(165, 42, 42));
	        TT2.setBounds(140, 410, 100, 40);
	        TT2.setFont(font);
	        LL2.setBounds(275, 410, 100, 40);
	        LL2.setFont(font_2);
	        LL2.setForeground(Color.WHITE);
	        TT22.setBounds(320, 410, 100, 40);
	        TT22.setFont(font);
	        BB22.setBounds(440, 410, 100, 40);
	        BB22.setFont(font_2);
	        BB22.setForeground(Color.GREEN);
	        BB22.setBackground(Color.white);
	        LL22.setBounds(560, 410, 40, 40);
	        LL22.setFont(font);
	        LL22.setForeground(Color.YELLOW);
	        TT222.setBounds(600, 410, 100, 40);
	        TT222.setFont(resultFont);
	        TT222.setBackground(Color.WHITE);
	        TT222.setForeground(Color.black);
	        LL222.setBounds(710, 410, 40, 40);
	        LL222.setFont(font);
	        LL222.setForeground(Color.YELLOW);
	        TT2222.setBounds(750, 410, 100, 40);
	        TT2222.setFont(resultFont);
	        TT2222.setBackground(Color.WHITE);
	        TT2222.setForeground(Color.black);
	        LL2222.setBounds(860, 410, 40, 40);
	        LL2222.setFont(font);
	        LL2222.setForeground(Color.YELLOW);
	        TT22222.setBounds(900, 410, 100, 40);
	        TT22222.setFont(resultFont);
	        TT22222.setBackground(Color.WHITE);
	        TT22222.setForeground(Color.black);

	        P1.add(BB2);
	        P1.add(TT2);
	        P1.add(LL2);
	        P1.add(TT22);
	        P1.add(BB22);
	        P1.add(LL22);
	        P1.add(TT222);
	        P1.add(LL222);
	        P1.add(TT2222);
	        P1.add(LL2222);
	        P1.add(TT22222);

	        // NOT
	        Button BB3 = new Button("CLEAR");
	        JTextField TT3 = new JTextField();
	        JLabel LL3 = new JLabel("~");
	        Button BB33 = new Button("=");
	        JLabel LL33 = new JLabel("DEC");
	        Label TT333 = new Label();
	        JLabel LL333 = new JLabel("HEX");
	        Label TT3333 = new Label();
	        JLabel LL3333 = new JLabel("BIN");
	        Label TT33333 = new Label();

	        BB3.setBounds(20, 480, 100, 40);
	        BB3.setFont(font);
	        BB3.setForeground(Color.YELLOW);
	        BB3.setBackground(new Color(165, 42, 42));
	        TT3.setBounds(140, 480, 100, 40);
	        TT3.setFont(font);
	        LL3.setBounds(270, 480, 100, 40);
	        LL3.setFont(font_2);
	        LL3.setForeground(Color.WHITE);
	        BB33.setBounds(440, 480, 100, 40);
	        BB33.setFont(font_2);
	        BB33.setForeground(Color.GREEN);
	        BB33.setBackground(Color.white);
	        LL33.setBounds(560, 480, 40, 40);
	        LL33.setFont(font);
	        LL33.setForeground(Color.YELLOW);
	        TT333.setBounds(600, 480, 100, 40);
	        TT333.setFont(resultFont);
	        TT333.setBackground(Color.WHITE);
	        TT333.setForeground(Color.black);
	        LL333.setBounds(710, 480, 40, 40);
	        LL333.setFont(font);
	        LL333.setForeground(Color.YELLOW);
	        TT3333.setBounds(750, 480, 100, 40);
	        TT3333.setFont(resultFont);
	        TT3333.setBackground(Color.WHITE);
	        TT3333.setForeground(Color.black);
	        LL3333.setBounds(860, 480, 40, 40);
	        LL3333.setFont(font);
	        LL3333.setForeground(Color.YELLOW);
	        TT33333.setBounds(900, 480, 100, 40);
	        TT33333.setFont(resultFont);
	        TT33333.setBackground(Color.WHITE);
	        TT33333.setForeground(Color.black);

	        P1.add(BB3);
	        P1.add(TT3);
	        P1.add(LL3);
	        
	        P1.add(BB33);
	        P1.add(LL33);
	        P1.add(TT333);
	        P1.add(LL333);
	        P1.add(TT3333);
	        P1.add(LL3333);
	        P1.add(TT33333);

	        // SHIFT LEFT
	        Button BB4 = new Button("L-CLEAR");
	        JTextField TT4 = new JTextField();
	        JLabel LL4 = new JLabel("<<");
	        JTextField TT44 = new JTextField();
	        Button BB44 = new Button("=");
	        JLabel LL44 = new JLabel("DEC");
	        Label TT444 = new Label();
	        JLabel LL444 = new JLabel("HEX");
	        Label TT4444 = new Label();
	        JLabel LL4444 = new JLabel("BIN");
	        Label TT44444 = new Label();

	        BB4.setBounds(20, 560, 100, 40);
	        BB4.setFont(font);
	        BB4.setForeground(Color.YELLOW);
	        BB4.setBackground(new Color(165, 42, 42));
	        TT4.setBounds(140, 580, 100, 40);
	        TT4.setFont(font);
	        LL4.setBounds(260, 580, 100, 40);
	        LL4.setFont(font_2);
	        LL4.setForeground(Color.WHITE);
	        TT44.setBounds(320, 580, 100, 40);
	        TT44.setFont(font);
	        BB44.setBounds(440, 580, 100, 40);
	        BB44.setFont(font_2);
	        BB44.setForeground(Color.GREEN);
	        BB44.setBackground(Color.white);
	        LL44.setBounds(560, 580, 40, 40);
	        LL44.setFont(font);
	        LL44.setForeground(Color.YELLOW);
	        TT444.setBounds(600, 580, 100, 40);
	        TT444.setFont(resultFont);
	        TT444.setBackground(Color.WHITE);
	        TT444.setForeground(Color.black);
	        LL444.setBounds(710, 580, 40, 40);
	        LL444.setFont(font);
	        LL444.setForeground(Color.YELLOW);
	        TT4444.setBounds(750, 580, 100, 40);
	        TT4444.setFont(resultFont);
	        TT4444.setBackground(Color.WHITE);
	        TT4444.setForeground(Color.black);
	        LL4444.setBounds(860, 580, 40, 40);
	        LL4444.setFont(font);
	        LL4444.setForeground(Color.YELLOW);
	        TT44444.setBounds(900, 580, 100, 40);
	        TT44444.setFont(resultFont);
	        TT44444.setBackground(Color.WHITE);
	        TT44444.setForeground(Color.black);

	        P1.add(BB4);
	        P1.add(TT4);
	        P1.add(LL4);
	        P1.add(TT44);
	        P1.add(BB44);
	        P1.add(LL44);
	        P1.add(TT444);
	        P1.add(LL444);
	        P1.add(TT4444);
	        P1.add(LL4444);
	        P1.add(TT44444);

	        // SHIFT RIGHT
	        Button BB5 = new Button("R-CLEAR");
	        JTextField TT5 = new JTextField();
	        JLabel LL5 = new JLabel(">>");
	        JTextField TT55 = new JTextField();
	        Button BB55 = new Button("=");
	        JLabel LL55 = new JLabel("DEC");
	        Label TT555 = new Label();
	        JLabel LL555 = new JLabel("HEX");
	        Label TT5555 = new Label();
	        JLabel LL5555 = new JLabel("BIN");
	        Label TT55555 = new Label();

	        BB5.setBounds(20, 660, 100, 40);
	        BB5.setFont(font);
	        BB5.setForeground(Color.YELLOW);
	        BB5.setBackground(new Color(165, 42, 42));
	        TT5.setBounds(140, 640, 100, 40);
	        TT5.setFont(font);
	        LL5.setBounds(260, 640, 100, 40);
	        LL5.setFont(font_2);
	        LL5.setForeground(Color.WHITE);
	        TT55.setBounds(320, 640, 100, 40);
	        TT55.setFont(font);
	        BB55.setBounds(440, 640, 100, 40);
	        BB55.setFont(font_2);
	        BB55.setForeground(Color.GREEN);
	        BB55.setBackground(Color.white);
	        LL55.setBounds(560, 640, 40, 40);
	        LL55.setFont(font);
	        LL55.setForeground(Color.YELLOW);
	        TT555.setBounds(600, 640, 100, 40);
	        TT555.setFont(resultFont);
	        TT555.setBackground(Color.WHITE);
	        TT555.setForeground(Color.black);
	        LL555.setBounds(710, 640, 40, 40);
	        LL555.setFont(font);
	        LL555.setForeground(Color.YELLOW);
	        TT5555.setBounds(750, 640, 100, 40);
	        TT5555.setFont(resultFont);
	        TT5555.setBackground(Color.WHITE);
	        TT5555.setForeground(Color.black);
	        LL5555.setBounds(860, 640, 40, 40);
	        LL5555.setFont(font);
	        LL5555.setForeground(Color.YELLOW);
	        TT55555.setBounds(900, 640, 100, 40);
	        TT55555.setFont(resultFont);
	        TT55555.setBackground(Color.WHITE);
	        TT55555.setForeground(Color.black);

	        P1.add(BB5);
	        P1.add(TT5);
	        P1.add(LL5);
	        P1.add(TT55);
	        P1.add(BB55);
	        P1.add(LL55);
	        P1.add(TT555);
	        P1.add(LL555);
	        P1.add(TT5555);
	        P1.add(LL5555);
	        P1.add(TT55555);
	        
	        B1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                T1.setText("");
	                T11.setText("");
	                T111.setText("");
	            }
	        });

	        B11.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    float num1 = Integer.parseInt(T1.getText());
	                    float num2 = Integer.parseInt(T11.getText());
	                    float result = num1 + num2;
	                    T111.setText(String.valueOf(result));
	                } catch (NumberFormatException ex) {
	                    T111.setText("Invalid input");
	                }
	            }
	        });
	        
	     // Action Listener for Subtraction "=" button
	        B22.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                	float num1 = Integer.parseInt(T2.getText());
	                	float num2 = Integer.parseInt(T22.getText());
	                	float result = num1 - num2;
	                    T222.setText(String.valueOf(result));
	                } catch (NumberFormatException ex) {
	                    T222.setText("Invalid input");
	                }
	            }
	        });

	        // Action Listener for Multiplication "=" button
	        B33.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                	float num1 = Integer.parseInt(T3.getText());
	                	float num2 = Integer.parseInt(T33.getText());
	                	float result = num1 * num2;
	                    T333.setText(String.valueOf(result));
	                } catch (NumberFormatException ex) {
	                    T333.setText("Invalid input");
	                }
	            }
	        });

	        // Action Listener for Division "=" button
	        B44.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                	float num1 = Integer.parseInt(T4.getText());
	                	float num2 = Integer.parseInt(T44.getText());
	                    if (num2 == 0) {
	                        T444.setText("Cannot divide by zero");
	                    } else {
	                    	float result = num1 / num2;
	                        T444.setText(String.valueOf(result));
	                    }
	                } catch (NumberFormatException ex) {
	                    T444.setText("Invalid input");
	                }
	            }
	        });

	        // Action Listener for Subtraction, Multiplication, and Division "CLEAR" buttons
	        B2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                T2.setText("");
	                T22.setText("");
	                T222.setText("");
	            }
	        });

	        B3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                T3.setText("");
	                T33.setText("");
	                T333.setText("");
	            }
	        });

	        B4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                T4.setText("");
	                T44.setText("");
	                T444.setText("");
	            }
	        });
	        
	     // AND operation
	        BB11.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Parse inputs as decimal numbers and limit to 8 bits
	                    int num1 = Integer.parseInt(TT1.getText()) & 0xFF;
	                    int num2 = Integer.parseInt(TT11.getText()) & 0xFF;
	                    int result = num1 & num2;

	                    // Update results
	                    TT111.setText(String.valueOf(result)); // DEC
	                    TT1111.setText(Integer.toHexString(result).toUpperCase()); // HEX
	                    TT11111.setText(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0')); // BIN, pad with leading zeros
	                } catch (NumberFormatException ex) {
	                    TT111.setText("Invalid input");
	                    TT1111.setText("Invalid input");
	                    TT11111.setText("Invalid input");
	                }
	            }
	        });

	        BB1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                TT1.setText("");
	                TT11.setText("");
	                TT111.setText("");
	                TT1111.setText("");
	                TT11111.setText("");
	            }
	        });

	        // OR operation
	        BB22.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Parse inputs as decimal numbers and limit to 8 bits
	                    int num1 = Integer.parseInt(TT2.getText()) & 0xFF;
	                    int num2 = Integer.parseInt(TT22.getText()) & 0xFF;
	                    int result = num1 | num2;

	                    // Update results
	                    TT222.setText(String.valueOf(result)); // DEC
	                    TT2222.setText(Integer.toHexString(result).toUpperCase()); // HEX
	                    TT22222.setText(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0')); // BIN, pad with leading zeros
	                } catch (NumberFormatException ex) {
	                    TT222.setText("Invalid input");
	                    TT2222.setText("Invalid input");
	                    TT22222.setText("Invalid input");
	                }
	            }
	        });

	        BB2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                TT2.setText("");
	                TT22.setText("");
	                TT222.setText("");
	                TT2222.setText("");
	                TT22222.setText("");
	            }
	        });

	      
	     // RIGHT SHIFT operation
	        BB55.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Parse inputs as decimal numbers
	                    int num1 = Integer.parseInt(TT5.getText()) & 0xFF; // Number to shift
	                    int num2 = Integer.parseInt(TT55.getText()); // Number of positions to shift

	                    // Perform right shift operation
	                    int result = (num1 >> num2) & 0xFF; // Limit to 8 bits

	                    // Update results
	                    TT555.setText(String.valueOf(result)); // DEC
	                    TT5555.setText(Integer.toHexString(result).toUpperCase()); // HEX
	                    TT55555.setText(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0')); // BIN, pad with leading zeros
	                } catch (NumberFormatException ex) {
	                    TT555.setText("Invalid input");
	                    TT5555.setText("Invalid input");
	                    TT55555.setText("Invalid input");
	                }
	            }
	        });

	        // Clear button for RIGHT SHIFT operation
	        BB5.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                TT5.setText("");
	                TT55.setText("");
	                TT555.setText("");
	                TT5555.setText("");
	                TT55555.setText("");
	            }
	        });


	        // LEFT SHIFT operation
	        BB44.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Parse inputs as decimal numbers and limit to 8 bits
	                    int num1 = Integer.parseInt(TT4.getText()) & 0xFF;
	                    int num2 = Integer.parseInt(TT44.getText()); // Number of positions to shift
	                    int result = num1 << num2;

	                    // Mask to ensure 8-bit result
	                    result = result & 0xFF;

	                    // Update results
	                    TT444.setText(String.valueOf(result)); // DEC
	                    TT4444.setText(Integer.toHexString(result).toUpperCase()); // HEX
	                    TT44444.setText(String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0')); // BIN, pad with leading zeros
	                } catch (NumberFormatException ex) {
	                    TT444.setText("Invalid input");
	                    TT4444.setText("Invalid input");
	                    TT44444.setText("Invalid input");
	                }
	            }
	        });

	        BB4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                TT4.setText("");
	                TT44.setText("");
	                TT444.setText("");
	                TT4444.setText("");
	                TT44444.setText("");
	            }
	        });

	        // NOT operation
	        BB33.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Parse input as a decimal number
	                    int num1 = Integer.parseInt(TT3.getText());

	                    // Check if the input is within the 8-bit range
	                    if (num1 < 0 || num1 > 255) {
	                        throw new NumberFormatException(); // Input is out of range
	                    }

	                    // Calculate the number of bits in the input (ignoring leading zeros)
	                    int numBits = Integer.toBinaryString(num1).length();

	                    // Generate a mask that only covers the significant bits
	                    int mask = (1 << numBits) - 1;

	                    // Flip only the bits within the significant range
	                    int result = (~num1) & mask;

	                    // Update results
	                    TT333.setText(String.valueOf(result)); // DEC (Decimal)
	                    TT3333.setText(Integer.toHexString(result).toUpperCase()); // HEX (Hexadecimal)
	                    TT33333.setText(String.format("%" + numBits + "s", Integer.toBinaryString(result)).replace(' ', '0')); // BIN (Binary), pad to significant bits only
	                } catch (NumberFormatException ex) {
	                    TT333.setText("Invalid input");
	                    TT3333.setText("Invalid input");
	                    TT33333.setText("Invalid input");
	                }
	            }
	        });






	        BB3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Clear the input text field
	                TT3.setText("");

	                // Clear the result labels
	                TT333.setText("");
	                TT3333.setText("");
	                TT33333.setText("");
	            }
	        });

	        
	        //  clear all button
	        BB.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	TT5.setText("");
	                TT555.setText("");
	                TT5555.setText("");
	                TT55555.setText("");
	                TT4.setText("");
	                TT44.setText("");
	                TT444.setText("");
	                TT4444.setText("");
	                TT44444.setText("");
	                TT3.setText("");
	                TT55.setText("");
	                TT333.setText("");
	                TT3333.setText("");
	                TT33333.setText("");
	                TT2.setText("");
	                TT22.setText("");
	                TT222.setText("");
	                TT2222.setText("");
	                TT22222.setText("");
	                TT1.setText("");
	                TT11.setText("");
	                TT111.setText("");
	                TT1111.setText("");
	                TT11111.setText("");
	                T1.setText("");
	                T11.setText("");
	                T111.setText("");
	                T2.setText("");
	                T22.setText("");
	                T222.setText("");
	                T3.setText("");
	                T33.setText("");
	                T333.setText("");
	                T4.setText("");
	                T44.setText("");
	                T444.setText("");

	            }
	        });

	
	
	
	
	}} // =================================================


