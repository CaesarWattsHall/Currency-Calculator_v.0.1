/*
*By: Caesar W. & Obina E.
*Class: JAVA 1
*Instructor: Dr.Primo
*Assignment: Group-Project
*Date: 12/05/2018
*Due: 12/06/2018 @9:30AM
*/
//START
package groupproject_centurion;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class GroupProject_CENTURION 
extends Frame implements ItemListener, ActionListener
{
//This will initialize all the GUI components within the program.
    JComboBox crwhConvertFrom, obiConvertTo;
    JTextField crwhTXTFieldFrom, obiTXTFieldTo;
    JButton crwhComputingAnswer, obiExitingTheSystem;
    JLabel crwhFROM, obiTO;
    JLabel crwhFromLabel, obiToLabel;
    JPanel crwhCenterStage = new JPanel();

    double crwhInputValues = 0;
    double obiTheResult = 0;

    public GroupProject_CENTURION() { 
        //Lets add up all the GUI components
        super("CENTURION - Currency Calculator [VR.0.01]"); 
        setSize(420,300);
        setLayout(null);
        setBackground(Color.lightGray);

        crwhFromLabel = new JLabel("From:");
        crwhFromLabel.setBounds(30,45,250,30);
        crwhFromLabel.setForeground(Color.BLUE);
        add(crwhFromLabel);

        crwhConvertFrom = new JComboBox();
        crwhConvertFrom.setBounds(30,70,150,30);
        crwhConvertFrom.addItem("U.S. Dollar");        //American USD Currency
        crwhConvertFrom.addItem("Canadian Dollar");    //Canadian Currency
        crwhConvertFrom.addItem("Australian Dollar");  //Australian Currency  
        crwhConvertFrom.addItem("Chinese Yuan");       //Chinese Yuan currency
        crwhConvertFrom.addItem("Japan Yen");          //Japanese Yen currency
        crwhConvertFrom.addItem("Pound Sterling");     //Great Britian currency
        crwhConvertFrom.addItem("Euro");               //European currency
        add(crwhConvertFrom);

        obiToLabel = new JLabel("To:");
        obiToLabel.setBounds(230,45,250,30);
        obiToLabel.setForeground(Color.BLUE);
        add(obiToLabel);

        obiConvertTo = new JComboBox();
        obiConvertTo.setBounds(230,70,150,30);
        obiConvertTo.addItem("U.S. Dollar");        
        obiConvertTo.addItem("Canadian Dollar");
        obiConvertTo.addItem("Australian Dollar");
        obiConvertTo.addItem("Chinese Yuan");     
        obiConvertTo.addItem("Japan Yen");        
        obiConvertTo.addItem("Pound Sterling");   
        obiConvertTo.addItem("Euro");             
        add(obiConvertTo);

        crwhFROM = new JLabel("Enter Amount to Convert:");
        crwhFROM.setBounds(50,110,300,30);
        add(crwhFROM);

        crwhTXTFieldFrom = new JTextField(15);
        crwhTXTFieldFrom.setBounds(50,140,300,30);
        add(crwhTXTFieldFrom);

        crwhComputingAnswer = new JButton("Compute");
        crwhComputingAnswer.setBounds(100,250,100,30);
        add(crwhComputingAnswer);

        obiTO = new JLabel("Here's the converted amount:");
        obiTO.setBounds(50,170,300,30);
        add(obiTO);   

        obiTXTFieldTo = new JTextField(15);
        obiTXTFieldTo.setBounds(50,200,300,30);
        obiTXTFieldTo.setEditable(false);
        obiTXTFieldTo.setForeground(Color.BLUE);
        add(obiTXTFieldTo);

        obiExitingTheSystem = new JButton("Exit");
        obiExitingTheSystem.setBounds(210,250,100,30);
        add(obiExitingTheSystem);
        
        //register all the GUI components who will listen or invoke the methods
        crwhConvertFrom.addItemListener(this);
        obiConvertTo.addItemListener(this);
        crwhComputingAnswer.addActionListener(this);
        crwhTXTFieldFrom.addActionListener(this);
        obiExitingTheSystem.addActionListener(this);
        
        //this will close the applet window if the user clicked the close or exit button
        addWindowListener(new WindowAdapter() { 
                public void windowClosing(WindowEvent e) { 
                    exit(); 
                } 
            });
    }
    //the exit method
    public void exit(){ 
        setVisible(false); 
        dispose(); 
        System.exit(0); 
    } 
    //show or make the applet window frame visible 
    public static void main(String args[]) { 
        GroupProject_CENTURION w = new GroupProject_CENTURION(); 
        w.setVisible(true); 
    } 

    public void ConvertUSDollar() { 
    //Convert USD to any country
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.33);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.39);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues * 6.94);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues * 112.54);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues * 0.78);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else 
        {
            obiTheResult = (crwhInputValues * 0.87);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }

    public void ConvertCanadianDollar() { 
    //Convert the Canadian Dollar to any country
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues * 0.75);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.04);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues * 5.22);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues * 84.67);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues * 0.59);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else 
        {
            obiTheResult = (crwhInputValues * 0.66);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }
    public void ConvertAustralianDollar() { 
    //Convert the Canadian Dollar to any country
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues * 0.72);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues * 0.96);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues * 5.01);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues * 81.39);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues * 0.56);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else 
        {
            obiTheResult = (crwhInputValues * 0.63);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }
    
    public void ConvertChineseYuan() { //Convert Chinese Yuan
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues * 0.14);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues * 0.19);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues * 0.20);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues * 16.21);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues * 0.11);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else
        {
            obiTheResult = (crwhInputValues * 0.13);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }

    public void ConvertJapaneseYen() { //Convert Japanese Yen
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues * 0.0089);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues * 0.012);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues * 0.012);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues * 0.062);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues * 0.0069);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else
        {
            obiTheResult = (crwhInputValues * 0.0078);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }

    public void ConvertPoundSterling() { //Convert Great Britain Pound-Sterling
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues * 1.29);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.70);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.77);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues * 8.88);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues * 144.17);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else
        {
            obiTheResult = (crwhInputValues * 1.12);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }

    public void ConvertEuro() { //Convert Euros
        if(obiConvertTo.getSelectedItem()=="US Dollar")
        {
            obiTheResult = (crwhInputValues * 1.15);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Canadian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.51);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Australian Dollar")
        {
            obiTheResult = (crwhInputValues * 1.58);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Chinese Yuan")
        {
            obiTheResult = (crwhInputValues * 7.95);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Japanese Yen")
        {
            obiTheResult = (crwhInputValues * 128.91);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else if(obiConvertTo.getSelectedItem()=="Pound Sterling")
        {
            obiTheResult = (crwhInputValues * 0.89);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
        else
        {
            obiTheResult = (crwhInputValues);
            obiTXTFieldTo.setText(""+obiTheResult);
        }
    }

    public void actionPerformed(ActionEvent e) {

        crwhInputValues = Double.parseDouble(crwhTXTFieldFrom.getText());
        String msg = crwhTXTFieldFrom.getText();

        if(e.getSource()==crwhComputingAnswer)
        {
            if(crwhConvertFrom.getSelectedItem()=="US Dollar")
            {
                ConvertUSDollar();                 
            }
            else if(crwhConvertFrom.getSelectedItem()=="Canadian Dollar")
            {
                ConvertCanadianDollar();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Australian Dollar")
            {
                ConvertAustralianDollar();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Chinese Yuan")
            {
                ConvertChineseYuan();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Japanese Yen")
            {
                ConvertJapaneseYen();
            }
            else if(crwhConvertFrom.getSelectedItem()=="Pound Sterling")
            {
                ConvertPoundSterling();
            }
            else
            {
                ConvertEuro();
            }

        }
        
        // What this does, is that it will ask the nameless user,
        // if they'd like to exit the GUI or not.
        else
        {
            //This will then display a confirmation box.
            int choice = JOptionPane.showConfirmDialog(null,"Are you positive?",
                    "Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {
    }
}
//END