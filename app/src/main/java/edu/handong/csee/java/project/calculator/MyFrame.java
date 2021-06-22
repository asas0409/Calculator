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
	public static final int SCREEN_HEIGHT = 638;
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
	JButton buttonDot = new JButton(".");
	JButton buttonOpener = new JButton("(");
	JButton buttonCloser = new JButton(")");
	JLabel result = new JLabel();
	
	int newTrial = 0;
	int closerBefore = 0;
	
	ArrayList<String> elements = new ArrayList<String>();
	Stack<String> operators = new Stack<String>();
	Stack<String> store = new Stack<String>();
	String number = "";
	
	public static void main(String[] args) {
		MyFrame frameA = new MyFrame();
		frameA.setDefaultCloseOperation(EXIT_ON_CLOSE);   //창이 닫히면 프로그램도 종료
	}
	
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
		button7.setFocusable(false);
		add(button7);
		
		
		button8.setFont(new Font("고딕",Font.ITALIC,20));
		button8.setBounds(125,100,125,100);
		button8.addActionListener(this);
		button8.setFocusable(false);
		add(button8);
		

		button9.setFont(new Font("고딕",Font.ITALIC,20));
		button9.setBounds(250,100,125,100);
		button9.addActionListener(this);
		button9.setFocusable(false);
		add(button9);
		
		
		buttonPlus.setFont(new Font("고딕",Font.ITALIC,20));
		buttonPlus.setBounds(375,100,125,100);
		buttonPlus.addActionListener(this);
		buttonPlus.setFocusable(false);
		add(buttonPlus);
		
		
		button4.setFont(new Font("고딕",Font.ITALIC,20));
		button4.setBounds(0,200,125,100);
		button4.addActionListener(this);
		button4.setFocusable(false);
		add(button4);
		
		
		button5.setFont(new Font("고딕",Font.ITALIC,20));
		button5.setBounds(125,200,125,100);
		button5.addActionListener(this);
		button5.setFocusable(false);
		add(button5);
		
		
		button6.setFont(new Font("고딕",Font.ITALIC,20));
		button6.setBounds(250,200,125,100);
		button6.addActionListener(this);
		button6.setFocusable(false);
		add(button6);
		
	
		buttonMinus.setFont(new Font("고딕",Font.ITALIC,20));
		buttonMinus.setBounds(375,200,125,100);
		buttonMinus.addActionListener(this);
		buttonMinus.setFocusable(false);
		add(buttonMinus);
		
		
		button1.setFont(new Font("고딕",Font.ITALIC,20));
		button1.setBounds(0,300,125,100);
		button1.addActionListener(this);
		button1.setFocusable(false);
		add(button1);
		
		
		button2.setFont(new Font("고딕",Font.ITALIC,20));
		button2.setBounds(125,300,125,100);
		button2.addActionListener(this);
		button2.setFocusable(false);
		add(button2);
		
		
		button3.setFont(new Font("고딕",Font.ITALIC,20));
		button3.setBounds(250,300,125,100);
		button3.addActionListener(this);
		button3.setFocusable(false);
		add(button3);
		
		buttonMultiplier.setFont(new Font("고딕",Font.ITALIC,20));
		buttonMultiplier.setBounds(375,300,125,100);
		buttonMultiplier.addActionListener(this);
		buttonMultiplier.setFocusable(false);
		add(buttonMultiplier);
		

		buttonClear.setFont(new Font("고딕",Font.ITALIC,20));
		buttonClear.setBounds(0,400,125,100);
		buttonClear.addActionListener(this);
		buttonClear.setFocusable(false);
		add(buttonClear);
		
	
		button0.setFont(new Font("고딕",Font.ITALIC,20));
		button0.setBounds(125,400,125,100);
		button0.addActionListener(this);
		button0.setFocusable(false);
		add(button0);
		

		buttonEqual.setFont(new Font("고딕",Font.ITALIC,20));
		buttonEqual.setBounds(250,400,125,100);
		buttonEqual.addActionListener(this);
		buttonEqual.setFocusable(false);
		add(buttonEqual);
		

		buttonDivider.setFont(new Font("고딕",Font.ITALIC,20));
		buttonDivider.setBounds(375,400,125,100);
		buttonDivider.addActionListener(this);
		buttonDivider.setFocusable(false);
		add(buttonDivider);
		
		buttonDot.setFont(new Font("고딕",Font.ITALIC,30));
		buttonDot.setBounds(0,500,125,100);
		buttonDot.addActionListener(this);
		buttonDot.setFocusable(false);
		add(buttonDot);
		
		buttonOpener.setFont(new Font("고딕",Font.ITALIC,20));
		buttonOpener.setBounds(125,500,125,100);
		buttonOpener.addActionListener(this);
		buttonOpener.setFocusable(false);
		add(buttonOpener);
		
		buttonCloser.setFont(new Font("고딕",Font.ITALIC,20));
		buttonCloser.setBounds(250,500,125,100);
		buttonCloser.addActionListener(this);
		buttonCloser.setFocusable(false);
		add(buttonCloser);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button7) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			if(number.equals("0")) {
			}
			result.setText(result.getText().concat("7"));
			number = number.concat("7");
		}else if(e.getSource()==button8) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("8"));
			number = number.concat("8");
		}else if(e.getSource()==button9) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("9"));
			number = number.concat("9");
		}else if(e.getSource()==button4) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("4"));
			number = number.concat("4");
		}else if(e.getSource()==button5) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("5"));
			number = number.concat("5");
		}else if(e.getSource()==button6) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("6"));
			number = number.concat("6");
		}else if(e.getSource()==button1) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("1"));
			number = number.concat("1");
		}else if(e.getSource()==button2) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("2"));
			number = number.concat("2");
		}else if(e.getSource()==button3) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			result.setText(result.getText().concat("3"));
			number = number.concat("3");
		}else if(e.getSource()==button0) {
			if(newTrial==1) {
				clearToRecalculate();
				newTrial = 0;
			}
			if(!number.equals("0")){
			result.setText(result.getText().concat("0"));
			number = number.concat("0");
			}
		}else if(e.getSource()==buttonDot) {
			result.setText(result.getText().concat("."));
			number = number.concat(".");
		}else if(e.getSource()==buttonOpener) {
			result.setText(result.getText().concat("("));
			operators.add("(");
		}else if(e.getSource()==buttonCloser) {
			result.setText(result.getText().concat(")"));
			if(closerBefore!=1) {
				elements.add(number);
				number = "";
			}
			while(!operators.peek().equals("(")) {
				elements.add(operators.pop());
			}
			operators.pop();
			closerBefore = 1;
		}else if(e.getSource()==buttonPlus) {
			result.setText(result.getText().concat("+"));
			if(closerBefore!=1) {
				elements.add(number);
				number = "";
			}else {
				closerBefore = 0;
			}
			insertInStack("+");
		}else if(e.getSource()==buttonMinus) {
			result.setText(result.getText().concat("-"));
			if(closerBefore!=1) {
				if(number.equals("")) {
					number = "-";
				}else {
				elements.add(number);
				number = "";
				insertInStack("-");
				}
			}else {
				closerBefore = 0;
				insertInStack("-");
			}
		}else if(e.getSource()==buttonMultiplier) {
			result.setText(result.getText().concat("*"));
			if(closerBefore!=1) {
				elements.add(number);
				number = "";
			}else {
				closerBefore = 0;
			}
			insertInStack("*");
		}else if(e.getSource()==buttonDivider) {
			result.setText(result.getText().concat("/"));
			if(closerBefore!=1) {
				elements.add(number);
				number = "";
			}else {
				closerBefore = 0;
			}
			insertInStack("/");
		}else if(e.getSource()==buttonClear) {
			clearToRecalculate();
			newTrial = 0;
		}else if(e.getSource()==buttonEqual) {
			if(closerBefore!=1) {
				elements.add(number);
				number = "";
			}else {
				closerBefore = 0;
			}
			while(!operators.isEmpty()) {
				elements.add(operators.pop());
			}
			result.setText(calculate());
			number = "";
			newTrial = 1;
		}
		
	}
	
	public void insertInStack(String operator) {
		while(!operators.isEmpty()&&(getPriority(operators.peek())>=getPriority(operator))) {
			elements.add(operators.pop());
		}
		operators.add(operator);

	}
	
	public int getPriority(String operator) {
		if(operator.equals("(")) {
			return 0;
		}else if(operator.equals("+")||operator.equals("-")) {
			return 1;
		}else if(operator.equals("*")||operator.equals("/")) {
			return 2;
		}else {
			return -1;
		}
	}
	public void clearToRecalculate() {
		result.setText("");
		operators.clear();
		elements.clear();
		store.clear();
		number = "";
	}
	public String calculate() { 
		double operand1;  
		double operand2;
		boolean isFirstOperandInt = false;
		boolean isSecondOperandInt = false;
		
		for(int i=0;i<elements.size();i++) {
			if(isOperator(elements.get(i))) {
				if(store.peek().contains("."))
					isFirstOperandInt = false;
				else 
					isFirstOperandInt = true;
				operand1 = Double.parseDouble(store.pop());
				
				if(store.peek().contains("."))
					isSecondOperandInt = false;
				else 
					isSecondOperandInt = true; 
	
				operand2 = Double.parseDouble(store.pop());
				if(elements.get(i).equals("+")) {
					store.add(isFirstOperandInt&&isSecondOperandInt?String.valueOf(operand2+operand1).substring(0,String.valueOf(operand2+operand1).indexOf(".")):String.valueOf(operand2+operand1));
				}else if(elements.get(i).equals("-")) {
					store.add(isFirstOperandInt&&isSecondOperandInt?String.valueOf(operand2-operand1).substring(0,String.valueOf(operand2-operand1).indexOf(".")):String.valueOf(operand2-operand1));
				}else if(elements.get(i).equals("*")) {
					store.add(isFirstOperandInt&&isSecondOperandInt?String.valueOf(operand2*operand1).substring(0,String.valueOf(operand2*operand1).indexOf(".")):String.valueOf(operand2*operand1));
				}else if(elements.get(i).equals("/")) {
					try {
						if(operand1==0) throw new Exception();
						if(operand2%operand1==0)
							store.add(String.valueOf(operand2/operand1));
						else
							store.add(String.valueOf(operand2/operand1));
					}catch(Exception e) {
						return "0으로 나눌수 없습니다.";
					}
				}
				
			}else {
				store.add(elements.get(i));
			}
		}
		if(store.peek().contains(".")) {
		Double last1 = Double.parseDouble(store.pop());
		String last = String.format("%.6f",last1);
		return last;
		}
		return store.pop();
	}
	public boolean isOperator(String operator) {
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"))
			return true;
		else
			return false;
	}

}
