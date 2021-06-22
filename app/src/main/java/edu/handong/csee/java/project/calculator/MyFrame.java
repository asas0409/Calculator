package edu.handong.csee.java.project.calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;

public class MyFrame extends JFrame implements ActionListener{
	public static final int SCREEN_HEIGHT = 538;
	public static final int SCREEN_WIDTH = 514;
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttonPlus = new JButton("+");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton buttonMinus = new JButton("-");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton buttonMultiplier = new JButton("*");
	JButton buttonClear = new JButton("C");
	JButton button0 = new JButton("0");
	JButton buttonEqual = new JButton("=");
	JButton buttonDivider = new JButton("/");
	JLabel result = new JLabel();
	
	ArrayList<String> elements = new ArrayList<String>();
	Stack<String> operators = new Stack<String>();
	Stack<String> store = new Stack<String>();
	String number = "";
	
	public MyFrame() {
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Calculator");
		setLayout(null);
		
		
		result.setOpaque(true);   // 배경색 설정 위해 투명 해제
		result.setBackground(Color.WHITE);   //배경색 설정
		result.setBorder(new LineBorder(Color.BLACK,3));
		result.setBounds(0,0,500,100);
		result.setHorizontalAlignment(JLabel.RIGHT);
		result.setFont(new Font("고딕",Font.ITALIC,40));
		add(result);
		
		button7.setBounds(0,100,125,100);
		button7.setFont(new Font("고딕",Font.ITALIC,20));
		button7.addActionListener(this);
		add(button7);
		
		
		button8.setFont(new Font("고딕",Font.ITALIC,20));
		button8.setBounds(125,100,125,100);
		button8.addActionListener(this);
		add(button8);
		

		button9.setFont(new Font("고딕",Font.ITALIC,20));
		button9.setBounds(250,100,125,100);
		button9.addActionListener(this);
		add(button9);
		
		
		buttonPlus.setFont(new Font("고딕",Font.ITALIC,20));
		buttonPlus.setBounds(375,100,125,100);
		buttonPlus.addActionListener(this);
		add(buttonPlus);
		
		
		button4.setFont(new Font("고딕",Font.ITALIC,20));
		button4.setBounds(0,200,125,100);
		button4.addActionListener(this);
		add(button4);
		
		
		button5.setFont(new Font("고딕",Font.ITALIC,20));
		button5.setBounds(125,200,125,100);
		button5.addActionListener(this);
		add(button5);
		
		
		button6.setFont(new Font("고딕",Font.ITALIC,20));
		button6.setBounds(250,200,125,100);
		button6.addActionListener(this);
		add(button6);
		
	
		buttonMinus.setFont(new Font("고딕",Font.ITALIC,20));
		buttonMinus.setBounds(375,200,125,100);
		buttonMinus.addActionListener(this);
		add(buttonMinus);
		
		
		button1.setFont(new Font("고딕",Font.ITALIC,20));
		button1.setBounds(0,300,125,100);
		button1.addActionListener(this);
		add(button1);
		
		
		button2.setFont(new Font("고딕",Font.ITALIC,20));
		button2.setBounds(125,300,125,100);
		button2.addActionListener(this);
		add(button2);
		
		
		button3.setFont(new Font("고딕",Font.ITALIC,20));
		button3.setBounds(250,300,125,100);
		button3.addActionListener(this);
		add(button3);
		
		buttonMultiplier.setFont(new Font("고딕",Font.ITALIC,20));
		buttonMultiplier.setBounds(375,300,125,100);
		buttonMultiplier.addActionListener(this);
		add(buttonMultiplier);
		

		buttonClear.setFont(new Font("고딕",Font.ITALIC,20));
		buttonClear.setBounds(0,400,125,100);
		buttonClear.addActionListener(this);
		add(buttonClear);
		
	
		button0.setFont(new Font("고딕",Font.ITALIC,20));
		button0.setBounds(125,400,125,100);
		button0.addActionListener(this);
		add(button0);
		

		buttonEqual.setFont(new Font("고딕",Font.ITALIC,20));
		buttonEqual.setBounds(250,400,125,100);
		buttonEqual.addActionListener(this);
		add(buttonEqual);
		

		buttonDivider.setFont(new Font("고딕",Font.ITALIC,20));
		buttonDivider.setBounds(375,400,125,100);
		buttonDivider.addActionListener(this);
		add(buttonDivider);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button7) {
			result.setText(result.getText().concat("7"));
			number = number.concat("7");
		}else if(e.getSource()==button8) {
			result.setText(result.getText().concat("8"));
			number = number.concat("8");
		}else if(e.getSource()==button9) {
			result.setText(result.getText().concat("9"));
			number = number.concat("9");
		}else if(e.getSource()==button4) {
			result.setText(result.getText().concat("4"));
			number = number.concat("4");
		}else if(e.getSource()==button5) {
			result.setText(result.getText().concat("5"));
			number = number.concat("5");
		}else if(e.getSource()==button6) {
			result.setText(result.getText().concat("6"));
			number = number.concat("6");
		}else if(e.getSource()==button1) {
			result.setText(result.getText().concat("1"));
			number = number.concat("1");
		}else if(e.getSource()==button2) {
			result.setText(result.getText().concat("2"));
			number = number.concat("2");
		}else if(e.getSource()==button3) {
			result.setText(result.getText().concat("3"));
			number = number.concat("3");
		}else if(e.getSource()==buttonPlus) {
			result.setText(result.getText().concat("+"));
			elements.add(number);
			number = "";
			insertInStack("+");
		}else if(e.getSource()==buttonMinus) {
			result.setText(result.getText().concat("-"));
			elements.add(number);
			number = "";
			insertInStack("-");
		}else if(e.getSource()==buttonMultiplier) {
			result.setText(result.getText().concat("*"));
			elements.add(number);
			number = "";
			insertInStack("*");
		}else if(e.getSource()==buttonDivider) {
			result.setText(result.getText().concat("/"));
			elements.add(number);
			number = "";
			insertInStack("/");
		}else if(e.getSource()==buttonClear) {
			result.setText("");
			operators.clear();
			elements.clear();
			store.clear();
			
		}else if(e.getSource()==buttonEqual) {
			elements.add(number);
			while(!operators.isEmpty()) {
				elements.add(operators.pop());
			}
			result.setText(calculate());
		}
	}
	
	public void insertInStack(String operator) {
		if(operators.isEmpty()) {
			operators.add(operator);
		}else {
		while(getPriority(operators.peek())>=getPriority(operator)) {
			elements.add(operators.pop());
		}
			operators.add(operator);
		}
	}
	
	public int getPriority(String operator) {
		if(operator.equals("+")||operator.equals("-")) {
			return 1;
		}else if(operator.equals("*")||operator.equals("/")) {
			return 2;
		}else {
			return -1;
		}
	}
	
	public String calculate() {
		int operand1;
		int operand2;
		for(int i=0;i<elements.size();i++) {
			if(isOperator(elements.get(i))) {
				operand1 = Integer.parseInt(store.pop());
				operand2 = Integer.parseInt(store.pop());
				if(elements.get(i).equals("+")) {
					store.add(String.valueOf(operand2+operand1));
				}else if(elements.get(i).equals("-")) {
					store.add(String.valueOf(operand2-operand1));
				}else if(elements.get(i).equals("*")) {
					store.add(String.valueOf(operand2*operand1));
				}else if(elements.get(i).equals("/")) {
					store.add(String.valueOf(operand2/operand1));
				}
				
			}else {
				store.add(elements.get(i));
			}
		}
		return store.pop();
	}
	
	public boolean isOperator(String operator) {
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
