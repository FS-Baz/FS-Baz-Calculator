import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Calculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel label = new JLabel();
    JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,eql,sum,sub,mul,div,pwr,dec,mod,clr,del;

    double num1=0,num2=0,result =0; 
    String[] operator = {"÷","×","+","-"} ;
    String op;
 

    Calculator(){

        

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(317, 500);
        frame.setResizable(false);
        frame.setBackground(new Color(0xFFFFFF));
        frame.setTitle("Calculator");
        
//---------------------------------------------------------------------
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 317, 150);
        //panel2.setBackground(new Color(0xfbaed));
        panel1.setLayout(null);
        panel1.setBounds(0, 75, 350, 450);

//---------------------------------------------------------------------

    label.setBounds(0, 0, 250, 75);
    label.setFont(new Font("Arial", Font.PLAIN, 30));
    // label.setText("This is a test text");
//---------------------------------------------------------------------

        btn0 = new JButton();
        btn0.setBounds(75, 310, 75, 75);
        btn0.setFont(new Font("Arial", Font.PLAIN, 40));
        btn0.setText("0");
        btn0.addActionListener(this);
        btn0.setFocusable(false);
        btn1 = new JButton();
        btn1.setBounds(0, 235, 75, 75);
        btn1.setFont(new Font("Arial", Font.PLAIN, 40));
        btn1.setText("1");
        btn1.addActionListener(this);
        btn1.setFocusable(false);
        btn2 = new JButton();
        btn2.setFont(new Font("Arial", Font.PLAIN, 40));
        btn2.setText("2");
        btn2.setBounds(75, 235, 75, 75);
        btn2.addActionListener(this);
        btn2.setFocusable(false);
        btn3 = new JButton();
        btn3.setBounds(150, 235, 75, 75);
        btn3.setFont(new Font("Arial", Font.PLAIN, 40));
        btn3.setText("3");
        btn3.addActionListener(this);
        btn3.setFocusable(false);
        btn4 = new JButton();
        btn4.setBounds(0, 160, 75, 75);
        btn4.setFont(new Font("Arial", Font.PLAIN, 40));
        btn4.setText("4");
        btn4.addActionListener(this);
        btn4.setFocusable(false);
        btn5 = new JButton();
        btn5.setBounds(75, 160, 75, 75);
        btn5.setFont(new Font("Arial", Font.PLAIN, 40));
        btn5.setText("5");
        btn5.addActionListener(this);
        btn5.setFocusable(false);
        btn6 = new JButton();
        btn6.setBounds(150, 160, 75, 75);
        btn6.setFont(new Font("Arial", Font.PLAIN, 40));
        btn6.setText("6");
        btn6.addActionListener(this);
        btn6.setFocusable(false);
        btn7 = new JButton();
        btn7.setBounds(0, 85, 75, 75);
        btn7.setFont(new Font("Arial", Font.PLAIN, 40));
        btn7.setText("7");
        btn7.addActionListener(this);
        btn7.setFocusable(false);
        btn8 = new JButton();
        btn8.setBounds(75, 85, 75, 75);
        btn8.setFont(new Font("Arial", Font.PLAIN, 40));
        btn8.setText("8");
        btn8.addActionListener(this);
        btn8.setFocusable(false);
        btn9 = new JButton();
        btn9.setBounds(150, 85, 75, 75);
        btn9.setFont(new Font("Arial", Font.PLAIN, 40));
        btn9.setText("9");
        btn9.addActionListener(this);
        btn9.setFocusable(false);
        dec = new JButton();
        dec.setBounds(150, 310, 75, 75);
        dec.setFont(new Font("Arial", Font.PLAIN, 40));
        dec.setText(".");
        dec.addActionListener(this);
        dec.setFocusable(false);
        eql = new JButton();
        eql.setBounds(225, 310, 75, 75);
        eql.setFont(new Font("Arial", Font.PLAIN, 40));
        eql.setText("=");
        eql.addActionListener(this);
        eql.setFocusable(false);
        sum = new JButton();
        sum.setBounds(225, 235, 75, 75);
        sum.setFont(new Font("Arial", Font.PLAIN, 40));
        sum.setText("+");
        sum.addActionListener(this);
        sum.setFocusable(false);
        sub = new JButton();
        sub.setBounds(225, 160, 75, 75);
        sub.setFont(new Font("Arial", Font.PLAIN, 40));
        sub.setText("-");
        sub.addActionListener(this);
        sub.setFocusable(false);
        mul = new JButton();
        mul.setBounds(225, 85, 75, 75);
        mul.setFont(new Font("Arial", Font.PLAIN, 40));
        mul.setText("×");
        mul.addActionListener(this);
        mul.setFocusable(false);
        mod = new JButton();
        mod.setBounds(0, 310, 75, 75);
        mod.setFont(new Font("Arial", Font.PLAIN, 21));
        mod.setText("mod");
        mod.addActionListener(this);
        mod.setFocusable(false);
        div = new JButton();
        div.setBounds(225, 10, 75, 75);
        div.setFont(new Font("Arial", Font.PLAIN, 40));
        div.setText("÷");
        div.addActionListener(this);
        div.setFocusable(false);
        pwr = new JButton();
        pwr.setBounds(150, 10, 75, 75);
        pwr.setFont(new Font("Arial", Font.PLAIN, 40));
        pwr.setText("^");
        pwr.addActionListener(this);
        pwr.setFocusable(false);
        del = new JButton();
        del.setBounds(75, 10, 75, 75);
        del.setFont(new Font("Arial", Font.PLAIN, 30));
        del.setText("del");
        del.addActionListener(this);
        del.setFocusable(false);
        clr = new JButton();
        clr.setBounds(0, 10, 75, 75);
        clr.setFont(new Font("Arial", Font.PLAIN, 40));
        clr.setText("C");
        clr.addActionListener(this);
        clr.setFocusable(false);

//---------------------------------------------------------------------


        panel1.add(btn0);
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);
        panel1.add(btn9);
        panel1.add(dec);
        panel1.add(eql);
        panel1.add(sum);
        panel1.add(sub);
        panel1.add(mul);
        panel1.add(div);
        panel1.add(mod);
        panel1.add(pwr);
        panel1.add(del);
        panel1.add(clr);
        panel2.add(label);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == btn0){
            System.out.println(btn0.getText());
            if (label.getText().length()>0)
                label.setText(label.getText()+ btn0.getText());}
        else if  ( e.getSource() == btn1){
            System.out.println(btn1.getText());
            label.setText(label.getText()+ btn1.getText());}
        else if  ( e.getSource() == btn2){
            System.out.println(btn2.getText());
            label.setText(label.getText()+ btn2.getText());}
        else if  ( e.getSource() == btn3){
            System.out.println(btn3.getText());
            label.setText(label.getText()+ btn3.getText());}
        else if  ( e.getSource() == btn4){
            System.out.println(btn4.getText());
            label.setText(label.getText()+ btn4.getText());}
        else if  ( e.getSource() == btn5){
            System.out.println(btn5.getText());
            label.setText(label.getText()+ btn5.getText());}
        else if  ( e.getSource() == btn6){
            System.out.println(btn6.getText());
            label.setText(label.getText()+ btn6.getText());}
        else if  ( e.getSource() == btn7){
            System.out.println(btn7.getText());
            label.setText(label.getText()+ btn7.getText());}
        else if  ( e.getSource() == btn8){
            System.out.println(btn8.getText());
            label.setText(label.getText()+ btn8.getText());}
        else if  ( e.getSource() == btn9){
            System.out.println(btn9.getText());
            label.setText(label.getText()+ btn9.getText());}
        else if  ( e.getSource() == sum){
            System.out.println(sum.getText());
            num1 = Double.parseDouble(label.getText());
            op ="+";
            if (checkOp())
            label.setText("");}
        else if  ( e.getSource() == sub){
            System.out.println(sub.getText());
            num1 = Double.parseDouble(label.getText());
            op = "-";
            if (checkOp())
            label.setText("");}
        else if  ( e.getSource() == mul){
            System.out.println(mul.getText());
            num1 = Double.parseDouble(label.getText());
            op ="*";
            if (checkOp())
            label.setText("");}
        else if  ( e.getSource() == div){
            System.out.println(div.getText());
            num1 = Double.parseDouble(label.getText());
            op ="/";
            if (checkOp())
            label.setText("");}
        else if  ( e.getSource() == pwr){
            System.out.println(pwr.getText());
            op = "^";
            num1 = Double.parseDouble(label.getText());
            if (checkOp())
            label.setText(num1*num1+"");}
        else if  ( e.getSource() == dec){
            System.out.println(dec.getText());
            label.setText(label.getText()+ dec.getText());}
        else if  ( e.getSource() == del){
            System.out.println(del.getText());
                if (label.getText().length()>0)
                    label.setText(label.getText().substring(0, label.getText().length()-1));}
        else if  ( e.getSource() == clr){
            System.out.println(clr.getText());
            label.setText("");}
        else if  ( e.getSource() == mod){
            System.out.println(mod.getText());
            label.setText(label.getText()+ mod.getText());}
        else if  ( e.getSource() == eql){
            num2 = Double.parseDouble(label.getText());
            System.out.println(eql.getText());
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
              
                default:

                    break;
            }
            num1 = result;
            label.setText(result+"");}
    }
    
    

    private boolean checkOp(){
        String lastOP = label.getText().substring(label.getText().length()-1);
        for (int i =0; i< operator.length;i++)
            if (operator[i].equalsIgnoreCase(lastOP) || this.label.getText().isEmpty()){
                return false;}
        
        return true;
    }




    public static void main(String[] args) {
        new Calculator();
        
    }
}
