/*
 * Peter Horne-Deus
 * The is a program is a one month editable calendar
 * calendarCulminating.java
 * January 8, 2019
 */

package calendarCulminating;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.io.*;


/**
 *
 * @author pehor9164
 */
public class calendarCulminating extends javax.swing.JFrame {

    /**
     * Creates new form calendarCulminating
     */
    
    //Public Variables
    String activities;
    String[] allDay = new String[28];
    int day;
    int[] timesThrough = new int[28];
    String account = "";
    String accountName = "";
    
    //Stack overflow
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    
    
    public calendarCulminating() {
        initComponents();
        
        //Stack Overflow
        setSize(screenSize.width, screenSize.height);
        
        //Setting error labels to be hidden
        errorLbl1.setVisible(false);
        errorLbl2.setVisible(false);
        
        //Calling account method
        accounts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monthJFrame = new javax.swing.JFrame();
        monthBackgroundPnl = new javax.swing.JPanel();
        firstScrollPane = new javax.swing.JScrollPane();
        firstTxtArea = new javax.swing.JTextArea();
        twentyFirstScrollPane = new javax.swing.JScrollPane();
        twentyFirstTxtArea = new javax.swing.JTextArea();
        secondScrollPane = new javax.swing.JScrollPane();
        secondTxtArea = new javax.swing.JTextArea();
        twentySecondScrollPane = new javax.swing.JScrollPane();
        twentySecondTxtArea = new javax.swing.JTextArea();
        twentyThirdScrollPane = new javax.swing.JScrollPane();
        twentyThirdTxtArea = new javax.swing.JTextArea();
        twentyEighthScrollPane = new javax.swing.JScrollPane();
        twentyEighthTxtArea = new javax.swing.JTextArea();
        twentyFourthScrollPane = new javax.swing.JScrollPane();
        twentyFourthTxtArea = new javax.swing.JTextArea();
        twentyFifthScrollPane = new javax.swing.JScrollPane();
        twentyFifthTxtArea = new javax.swing.JTextArea();
        twentySixthScrollPane = new javax.swing.JScrollPane();
        twentySixthTxtArea = new javax.swing.JTextArea();
        twentySeventhScrollPane = new javax.swing.JScrollPane();
        twentySeventhTxtArea = new javax.swing.JTextArea();
        fifteenthScrollPane = new javax.swing.JScrollPane();
        fifteenthTxtArea = new javax.swing.JTextArea();
        sixteenthScrollPane = new javax.swing.JScrollPane();
        sixteenthTxtArea = new javax.swing.JTextArea();
        seventeenthScrollPane = new javax.swing.JScrollPane();
        seventeenthTxtArea = new javax.swing.JTextArea();
        eighteenthScrollPane = new javax.swing.JScrollPane();
        eighteenthTxtArea = new javax.swing.JTextArea();
        nineteenthScrollPane = new javax.swing.JScrollPane();
        nineteenthTxtArea = new javax.swing.JTextArea();
        twentiethScrollPane = new javax.swing.JScrollPane();
        twentiethTxtArea = new javax.swing.JTextArea();
        eighthScrollPane = new javax.swing.JScrollPane();
        eighthTxtArea = new javax.swing.JTextArea();
        ninthScrollPane = new javax.swing.JScrollPane();
        ninthTxtArea = new javax.swing.JTextArea();
        tenthScrollPane = new javax.swing.JScrollPane();
        tenthTxtArea = new javax.swing.JTextArea();
        eleventhScrollPane = new javax.swing.JScrollPane();
        eleventhTxtArea = new javax.swing.JTextArea();
        twelfthScrollPane = new javax.swing.JScrollPane();
        twelfthTxtArea = new javax.swing.JTextArea();
        thirteenthScrollPane = new javax.swing.JScrollPane();
        thirteenthTxtArea = new javax.swing.JTextArea();
        fourteenthScrollPane = new javax.swing.JScrollPane();
        fourteenthTxtArea = new javax.swing.JTextArea();
        seventhScrollPane = new javax.swing.JScrollPane();
        seventhTxtArea = new javax.swing.JTextArea();
        fifthScrollPane = new javax.swing.JScrollPane();
        fifthTxtArea = new javax.swing.JTextArea();
        sixthScrollPane = new javax.swing.JScrollPane();
        sixthTxtArea = new javax.swing.JTextArea();
        fourthScrollPane = new javax.swing.JScrollPane();
        fourthTxtArea = new javax.swing.JTextArea();
        thirdScrollPane = new javax.swing.JScrollPane();
        thirdTxtArea = new javax.swing.JTextArea();
        titleLbl = new javax.swing.JLabel();
        febuaryLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        saturdayLbl = new javax.swing.JLabel();
        sundayLbl = new javax.swing.JLabel();
        mondayLbl = new javax.swing.JLabel();
        tuesdayLbl = new javax.swing.JLabel();
        wednesdayLbl = new javax.swing.JLabel();
        thrusdayLbl = new javax.swing.JLabel();
        fridayLbl = new javax.swing.JLabel();
        dayChangeJFrame = new javax.swing.JFrame();
        backgroundPanel = new javax.swing.JPanel();
        dateLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        endTimeTxtFeild = new javax.swing.JTextField();
        activityLbl = new javax.swing.JLabel();
        endTimeLbl = new javax.swing.JLabel();
        activityTxtFeild = new javax.swing.JTextField();
        startTimeLbl = new javax.swing.JLabel();
        startTimeTxtFeild = new javax.swing.JTextField();
        endAmPmCombBox = new javax.swing.JComboBox();
        startAmPmCombBox = new javax.swing.JComboBox();
        errorLbl1 = new javax.swing.JLabel();
        errorLbl2 = new javax.swing.JLabel();
        signInBackgroundPnl = new javax.swing.JPanel();
        signUpLbl = new javax.swing.JLabel();
        signUpReEnterPasswordLbl = new javax.swing.JLabel();
        signUpUsernameLbl = new javax.swing.JLabel();
        signInLbl = new javax.swing.JLabel();
        signInUsernameLbl = new javax.swing.JLabel();
        signInUsernameTxtFeild = new javax.swing.JTextField();
        signInPasswordLbl = new javax.swing.JLabel();
        signUpPasswordLbl = new javax.swing.JLabel();
        createAccountBtn = new javax.swing.JButton();
        signInBtn = new javax.swing.JButton();
        signUpUsernameTxtFeild = new javax.swing.JTextField();
        signInErrorLbl = new javax.swing.JLabel();
        signinErrorLbl2 = new javax.swing.JLabel();
        signUpPasswordTxtFeild = new javax.swing.JPasswordField();
        signUpReEnterPasswordTxtFeild = new javax.swing.JPasswordField();
        signInPasswordTxtFeild = new javax.swing.JPasswordField();

        monthBackgroundPnl.setBackground(new java.awt.Color(204, 255, 255));
        monthBackgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstTxtArea.setEditable(false);
        firstTxtArea.setColumns(20);
        firstTxtArea.setRows(5);
        firstTxtArea.setText("1st");
        firstTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstTxtAreaMouseClicked(evt);
            }
        });
        firstScrollPane.setViewportView(firstTxtArea);

        monthBackgroundPnl.add(firstScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 80));

        twentyFirstTxtArea.setEditable(false);
        twentyFirstTxtArea.setColumns(20);
        twentyFirstTxtArea.setRows(5);
        twentyFirstTxtArea.setText("21st");
        twentyFirstTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyFirstTxtAreaMouseClicked(evt);
            }
        });
        twentyFirstScrollPane.setViewportView(twentyFirstTxtArea);

        monthBackgroundPnl.add(twentyFirstScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 190, 80));

        secondTxtArea.setEditable(false);
        secondTxtArea.setColumns(20);
        secondTxtArea.setRows(5);
        secondTxtArea.setText("2nd");
        secondTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondTxtAreaMouseClicked(evt);
            }
        });
        secondScrollPane.setViewportView(secondTxtArea);

        monthBackgroundPnl.add(secondScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 190, 80));

        twentySecondTxtArea.setEditable(false);
        twentySecondTxtArea.setColumns(20);
        twentySecondTxtArea.setRows(5);
        twentySecondTxtArea.setText("22nd");
        twentySecondTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentySecondTxtAreaMouseClicked(evt);
            }
        });
        twentySecondScrollPane.setViewportView(twentySecondTxtArea);

        monthBackgroundPnl.add(twentySecondScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 190, 80));

        twentyThirdTxtArea.setEditable(false);
        twentyThirdTxtArea.setColumns(20);
        twentyThirdTxtArea.setRows(5);
        twentyThirdTxtArea.setText("23rd");
        twentyThirdTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyThirdTxtAreaMouseClicked(evt);
            }
        });
        twentyThirdScrollPane.setViewportView(twentyThirdTxtArea);

        monthBackgroundPnl.add(twentyThirdScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 190, 80));

        twentyEighthTxtArea.setEditable(false);
        twentyEighthTxtArea.setColumns(20);
        twentyEighthTxtArea.setRows(5);
        twentyEighthTxtArea.setText("28th");
        twentyEighthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyEighthTxtAreaMouseClicked(evt);
            }
        });
        twentyEighthScrollPane.setViewportView(twentyEighthTxtArea);

        monthBackgroundPnl.add(twentyEighthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 190, 80));

        twentyFourthTxtArea.setEditable(false);
        twentyFourthTxtArea.setColumns(20);
        twentyFourthTxtArea.setRows(5);
        twentyFourthTxtArea.setText("24th");
        twentyFourthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyFourthTxtAreaMouseClicked(evt);
            }
        });
        twentyFourthScrollPane.setViewportView(twentyFourthTxtArea);

        monthBackgroundPnl.add(twentyFourthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 190, 80));

        twentyFifthTxtArea.setEditable(false);
        twentyFifthTxtArea.setColumns(20);
        twentyFifthTxtArea.setRows(5);
        twentyFifthTxtArea.setText("25th");
        twentyFifthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyFifthTxtAreaMouseClicked(evt);
            }
        });
        twentyFifthScrollPane.setViewportView(twentyFifthTxtArea);

        monthBackgroundPnl.add(twentyFifthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 190, 80));

        twentySixthTxtArea.setEditable(false);
        twentySixthTxtArea.setColumns(20);
        twentySixthTxtArea.setRows(5);
        twentySixthTxtArea.setText("26th");
        twentySixthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentySixthTxtAreaMouseClicked(evt);
            }
        });
        twentySixthScrollPane.setViewportView(twentySixthTxtArea);

        monthBackgroundPnl.add(twentySixthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 190, 80));

        twentySeventhTxtArea.setEditable(false);
        twentySeventhTxtArea.setColumns(20);
        twentySeventhTxtArea.setRows(5);
        twentySeventhTxtArea.setText("27th");
        twentySeventhTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentySeventhTxtAreaMouseClicked(evt);
            }
        });
        twentySeventhScrollPane.setViewportView(twentySeventhTxtArea);

        monthBackgroundPnl.add(twentySeventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 190, 80));

        fifteenthTxtArea.setEditable(false);
        fifteenthTxtArea.setColumns(20);
        fifteenthTxtArea.setRows(5);
        fifteenthTxtArea.setText("15th");
        fifteenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fifteenthTxtAreaMouseClicked(evt);
            }
        });
        fifteenthScrollPane.setViewportView(fifteenthTxtArea);

        monthBackgroundPnl.add(fifteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 80));

        sixteenthTxtArea.setEditable(false);
        sixteenthTxtArea.setColumns(20);
        sixteenthTxtArea.setRows(5);
        sixteenthTxtArea.setText("16th");
        sixteenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixteenthTxtAreaMouseClicked(evt);
            }
        });
        sixteenthScrollPane.setViewportView(sixteenthTxtArea);

        monthBackgroundPnl.add(sixteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 190, 80));

        seventeenthTxtArea.setEditable(false);
        seventeenthTxtArea.setColumns(20);
        seventeenthTxtArea.setRows(5);
        seventeenthTxtArea.setText("17th");
        seventeenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seventeenthTxtAreaMouseClicked(evt);
            }
        });
        seventeenthScrollPane.setViewportView(seventeenthTxtArea);

        monthBackgroundPnl.add(seventeenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 190, 80));

        eighteenthTxtArea.setEditable(false);
        eighteenthTxtArea.setColumns(20);
        eighteenthTxtArea.setRows(5);
        eighteenthTxtArea.setText("18th");
        eighteenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eighteenthTxtAreaMouseClicked(evt);
            }
        });
        eighteenthScrollPane.setViewportView(eighteenthTxtArea);

        monthBackgroundPnl.add(eighteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 190, 80));

        nineteenthTxtArea.setEditable(false);
        nineteenthTxtArea.setColumns(20);
        nineteenthTxtArea.setRows(5);
        nineteenthTxtArea.setText("19th");
        nineteenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineteenthTxtAreaMouseClicked(evt);
            }
        });
        nineteenthScrollPane.setViewportView(nineteenthTxtArea);

        monthBackgroundPnl.add(nineteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 190, 80));

        twentiethTxtArea.setEditable(false);
        twentiethTxtArea.setColumns(20);
        twentiethTxtArea.setRows(5);
        twentiethTxtArea.setText("20th");
        twentiethTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentiethTxtAreaMouseClicked(evt);
            }
        });
        twentiethScrollPane.setViewportView(twentiethTxtArea);

        monthBackgroundPnl.add(twentiethScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, 190, 80));

        eighthTxtArea.setEditable(false);
        eighthTxtArea.setColumns(20);
        eighthTxtArea.setRows(5);
        eighthTxtArea.setText("8th");
        eighthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eighthTxtAreaMouseClicked(evt);
            }
        });
        eighthScrollPane.setViewportView(eighthTxtArea);

        monthBackgroundPnl.add(eighthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 80));

        ninthTxtArea.setEditable(false);
        ninthTxtArea.setColumns(20);
        ninthTxtArea.setRows(5);
        ninthTxtArea.setText("9th");
        ninthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ninthTxtAreaMouseClicked(evt);
            }
        });
        ninthScrollPane.setViewportView(ninthTxtArea);

        monthBackgroundPnl.add(ninthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 190, 80));

        tenthTxtArea.setEditable(false);
        tenthTxtArea.setColumns(20);
        tenthTxtArea.setRows(5);
        tenthTxtArea.setText("10th");
        tenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenthTxtAreaMouseClicked(evt);
            }
        });
        tenthScrollPane.setViewportView(tenthTxtArea);

        monthBackgroundPnl.add(tenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 190, 80));

        eleventhTxtArea.setEditable(false);
        eleventhTxtArea.setColumns(20);
        eleventhTxtArea.setRows(5);
        eleventhTxtArea.setText("11th");
        eleventhTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eleventhTxtAreaMouseClicked(evt);
            }
        });
        eleventhScrollPane.setViewportView(eleventhTxtArea);

        monthBackgroundPnl.add(eleventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 190, 80));

        twelfthTxtArea.setEditable(false);
        twelfthTxtArea.setColumns(20);
        twelfthTxtArea.setRows(5);
        twelfthTxtArea.setText("12th");
        twelfthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twelfthTxtAreaMouseClicked(evt);
            }
        });
        twelfthScrollPane.setViewportView(twelfthTxtArea);

        monthBackgroundPnl.add(twelfthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 190, 80));

        thirteenthTxtArea.setEditable(false);
        thirteenthTxtArea.setColumns(20);
        thirteenthTxtArea.setRows(5);
        thirteenthTxtArea.setText("13th");
        thirteenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirteenthTxtAreaMouseClicked(evt);
            }
        });
        thirteenthScrollPane.setViewportView(thirteenthTxtArea);

        monthBackgroundPnl.add(thirteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 190, 80));

        fourteenthTxtArea.setEditable(false);
        fourteenthTxtArea.setColumns(20);
        fourteenthTxtArea.setRows(5);
        fourteenthTxtArea.setText("14th");
        fourteenthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourteenthTxtAreaMouseClicked(evt);
            }
        });
        fourteenthScrollPane.setViewportView(fourteenthTxtArea);

        monthBackgroundPnl.add(fourteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, 190, 80));

        seventhTxtArea.setEditable(false);
        seventhTxtArea.setColumns(20);
        seventhTxtArea.setRows(5);
        seventhTxtArea.setText("7th");
        seventhTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seventhTxtAreaMouseClicked(evt);
            }
        });
        seventhScrollPane.setViewportView(seventhTxtArea);

        monthBackgroundPnl.add(seventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 190, 80));

        fifthTxtArea.setEditable(false);
        fifthTxtArea.setColumns(20);
        fifthTxtArea.setRows(5);
        fifthTxtArea.setText("5th");
        fifthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fifthTxtAreaMouseClicked(evt);
            }
        });
        fifthScrollPane.setViewportView(fifthTxtArea);

        monthBackgroundPnl.add(fifthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 190, 80));

        sixthTxtArea.setEditable(false);
        sixthTxtArea.setColumns(20);
        sixthTxtArea.setRows(5);
        sixthTxtArea.setText("6th");
        sixthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixthTxtAreaMouseClicked(evt);
            }
        });
        sixthScrollPane.setViewportView(sixthTxtArea);

        monthBackgroundPnl.add(sixthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 190, 80));

        fourthTxtArea.setEditable(false);
        fourthTxtArea.setColumns(20);
        fourthTxtArea.setRows(5);
        fourthTxtArea.setText("4th");
        fourthTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourthTxtAreaMouseClicked(evt);
            }
        });
        fourthScrollPane.setViewportView(fourthTxtArea);

        monthBackgroundPnl.add(fourthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 190, 80));

        thirdTxtArea.setEditable(false);
        thirdTxtArea.setColumns(20);
        thirdTxtArea.setRows(5);
        thirdTxtArea.setText("3rd");
        thirdTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thirdTxtAreaMouseClicked(evt);
            }
        });
        thirdScrollPane.setViewportView(thirdTxtArea);

        monthBackgroundPnl.add(thirdScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 190, 80));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLbl.setText("Username's Calendar");
        monthBackgroundPnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        febuaryLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        febuaryLbl.setText("Date: Febuary, 2015");
        monthBackgroundPnl.add(febuaryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        exitBtn.setBackground(new java.awt.Color(51, 255, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        monthBackgroundPnl.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        saturdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saturdayLbl.setText("Saturday");
        monthBackgroundPnl.add(saturdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 110, -1, -1));

        sundayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sundayLbl.setText("Sunday");
        monthBackgroundPnl.add(sundayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        mondayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mondayLbl.setText("Monday");
        monthBackgroundPnl.add(mondayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        tuesdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tuesdayLbl.setText("Tuesday");
        monthBackgroundPnl.add(tuesdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        wednesdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wednesdayLbl.setText("Wednesday");
        monthBackgroundPnl.add(wednesdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        thrusdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        thrusdayLbl.setText("Thursday");
        monthBackgroundPnl.add(thrusdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, -1, -1));

        fridayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fridayLbl.setText("Friday");
        monthBackgroundPnl.add(fridayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, -1, -1));

        javax.swing.GroupLayout monthJFrameLayout = new javax.swing.GroupLayout(monthJFrame.getContentPane());
        monthJFrame.getContentPane().setLayout(monthJFrameLayout);
        monthJFrameLayout.setHorizontalGroup(
            monthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        monthJFrameLayout.setVerticalGroup(
            monthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backgroundPanel.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 160, 20));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));
        backgroundPanel.add(endTimeTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        activityLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        activityLbl.setText("Activity:");
        backgroundPanel.add(activityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        endTimeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endTimeLbl.setText("End Time:");
        backgroundPanel.add(endTimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        backgroundPanel.add(activityTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 160, -1));

        startTimeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startTimeLbl.setText("Start Time:");
        backgroundPanel.add(startTimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        backgroundPanel.add(startTimeTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, -1));

        endAmPmCombBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        backgroundPanel.add(endAmPmCombBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        startAmPmCombBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        backgroundPanel.add(startAmPmCombBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        errorLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLbl1.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl1.setText("Time Error Must be an INT and in the twelve hour clock");
        backgroundPanel.add(errorLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        errorLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLbl2.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl2.setText("Make sure your start time is later then your end time");
        backgroundPanel.add(errorLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        javax.swing.GroupLayout dayChangeJFrameLayout = new javax.swing.GroupLayout(dayChangeJFrame.getContentPane());
        dayChangeJFrame.getContentPane().setLayout(dayChangeJFrameLayout);
        dayChangeJFrameLayout.setHorizontalGroup(
            dayChangeJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        dayChangeJFrameLayout.setVerticalGroup(
            dayChangeJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        signInBackgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUpLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpLbl.setText("Sign Up:");
        signInBackgroundPnl.add(signUpLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        signUpReEnterPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpReEnterPasswordLbl.setText("Re-enter Password:");
        signInBackgroundPnl.add(signUpReEnterPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 20));

        signUpUsernameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpUsernameLbl.setText("Username:");
        signInBackgroundPnl.add(signUpUsernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        signInLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signInLbl.setText("Sign In:");
        signInBackgroundPnl.add(signInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        signInUsernameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signInUsernameLbl.setText("Username:");
        signInBackgroundPnl.add(signInUsernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        signInBackgroundPnl.add(signInUsernameTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 170, 30));

        signInPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signInPasswordLbl.setText("Password:");
        signInBackgroundPnl.add(signInPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        signUpPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpPasswordLbl.setText("Password:");
        signInBackgroundPnl.add(signUpPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        createAccountBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createAccountBtn.setText("Create Account");
        createAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtnActionPerformed(evt);
            }
        });
        signInBackgroundPnl.add(createAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        signInBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signInBtn.setText("Sign In");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        signInBackgroundPnl.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        signUpUsernameTxtFeild.setText(" ");
        signUpUsernameTxtFeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpUsernameTxtFeildMouseClicked(evt);
            }
        });
        signInBackgroundPnl.add(signUpUsernameTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, 30));

        signInErrorLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signInErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        signInBackgroundPnl.add(signInErrorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 460, 20));

        signinErrorLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signinErrorLbl2.setForeground(new java.awt.Color(255, 0, 51));
        signInBackgroundPnl.add(signinErrorLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 220, 20));

        signUpPasswordTxtFeild.setText(" ");
        signUpPasswordTxtFeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpPasswordTxtFeildMouseClicked(evt);
            }
        });
        signInBackgroundPnl.add(signUpPasswordTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 30));

        signUpReEnterPasswordTxtFeild.setText(" ");
        signUpReEnterPasswordTxtFeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpReEnterPasswordTxtFeildMouseClicked(evt);
            }
        });
        signInBackgroundPnl.add(signUpReEnterPasswordTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        signInPasswordTxtFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInPasswordTxtFeildActionPerformed(evt);
            }
        });
        signInBackgroundPnl.add(signInPasswordTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(signInBackgroundPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(signInBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The first day text area is clicked and sends the user to a new form where they can edit the first days events
     * @param evt 
     */
    private void firstTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 1;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_firstTxtAreaMouseClicked

    /**
     * Button on the first day that updates the calendar
     * @param evt 
     */
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //Variables
        String startTimeAmPm = (String)startAmPmCombBox.getSelectedItem();
        String endTimeAmPm = (String)endAmPmCombBox.getSelectedItem();
        String startTime = startTimeTxtFeild.getText();
        String endTime = endTimeTxtFeild.getText();
        String time = startTime +startTimeAmPm + "-" + endTime + endTimeAmPm +" ";
        int errorStart = 0;
        int errorEnd = 0;
        int errorTiming = 0;
       
        //Sending to a method to check if the start time is valid
        errorStart = startTime(startTime);
        errorEnd = endTime(endTime);
        errorTiming = checkTimes(startTime,endTime,startTimeAmPm,endTimeAmPm);
        activity(time,errorStart,errorEnd,errorTiming);
        
        
        
        //If there is an error this shows the error label
        if (errorStart == 1 || errorEnd == 1){
           errorLbl1.setVisible(true); 
        }
        else if(errorTiming == 1){
            errorLbl2.setVisible(true);
        }
        //Hiding the day and showing the month only if there are no errors
        else if (errorStart != 1 || errorEnd != 1 || errorTiming != 1){
            monthJFrame.show();
            dayChangeJFrame.hide();
            
            errorLbl1.setVisible(false);
            errorLbl2.setVisible(false);
            
            //Clearing text feilds
            startTimeTxtFeild.setText("");
            endTimeTxtFeild.setText("");
            activityTxtFeild.setText("");
        }    
        
        
    }//GEN-LAST:event_updateBtnActionPerformed

    /**
     * The Sign in button that initiates the sign in algorithm
     * @param evt 
     */
    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        //Variables
        File dataFile = new File("signIn.dat");
        FileReader in;
        BufferedReader readFile;
        
        String username = signInUsernameTxtFeild.getText();
        String password = signInPasswordTxtFeild.getText();
        String passwordPulled;
        String usernamePulled;
        int error = 0;
        int passwordCheck = 0;
        int usernameCheck = 0;
        
        try{
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            
            usernamePulled = readFile.readLine();
            passwordPulled = readFile.readLine();
            
            
            if(username.charAt(0) != ' ' && password.charAt(0) != ' '){
                while (passwordCheck < password.length()) {

                    System.out.println("test");
                    if (password.charAt(passwordCheck) != passwordPulled.charAt(passwordCheck)) {
                        error = 2;
                        throw new Exception("Error");
                    }
                    passwordCheck++;
                }
                while (usernameCheck < username.length()) {

                    if (username.charAt(usernameCheck) != usernamePulled.charAt(usernameCheck)) {
                        error = 1;
                        throw new Exception("Error");
                    }
                    usernameCheck++;
                }
                
                }
            else{

                error = 1;
                throw new Exception("Error");
            }
            
            if(username.length() != usernamePulled.length() || password.length() != passwordPulled.length()){
                error = 1;
                throw new Exception("Error");
            }
            
            if (error == 0){
                //Hiding the main sign in screen
                hide();

                //Displaying and resizing the chosen date
                monthJFrame.show();

                //Came From Stack Overflow
                monthJFrame.setSize(screenSize.width, screenSize.height);
                
                //Putting a name to the title
                titleLbl.setText(accountName + "'s Calendar" );
                
                //Colouring exit button
                exitBtn.setBackground(Color.black);

            }
            readFile.close();
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
    	}
        catch (Exception e){
            if (error == 1){
                System.err.println("You must enter a username that is the same as your account created");
                System.err.println("Exception: " + e);
            }
            else if (error == 2){
                System.err.println("You must enter the same password as the one you created");
                System.err.println("Exception: " + e);
            }
            }
        
    }//GEN-LAST:event_signInBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void secondTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 2;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_secondTxtAreaMouseClicked

    private void thirdTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirdTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 3;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_thirdTxtAreaMouseClicked

    private void fourthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 4;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_fourthTxtAreaMouseClicked

    private void fifthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fifthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 5;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_fifthTxtAreaMouseClicked

    private void sixthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 6;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_sixthTxtAreaMouseClicked

    private void seventhTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seventhTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 7;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_seventhTxtAreaMouseClicked

    private void eighthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eighthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 8;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_eighthTxtAreaMouseClicked

    private void ninthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 9;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_ninthTxtAreaMouseClicked

    private void tenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 10;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_tenthTxtAreaMouseClicked

    private void eleventhTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eleventhTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 11;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_eleventhTxtAreaMouseClicked

    private void twelfthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twelfthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 12;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twelfthTxtAreaMouseClicked

    private void thirteenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirteenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 13;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_thirteenthTxtAreaMouseClicked

    private void fourteenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourteenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 14;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_fourteenthTxtAreaMouseClicked

    private void fifteenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fifteenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 15;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_fifteenthTxtAreaMouseClicked

    private void sixteenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixteenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 16;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_sixteenthTxtAreaMouseClicked

    private void seventeenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seventeenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 17;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_seventeenthTxtAreaMouseClicked

    private void eighteenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eighteenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 18;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_eighteenthTxtAreaMouseClicked

    private void nineteenthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineteenthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 19;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_nineteenthTxtAreaMouseClicked

    private void twentiethTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentiethTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 20;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentiethTxtAreaMouseClicked

    private void twentyFirstTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyFirstTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 21;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentyFirstTxtAreaMouseClicked

    private void twentySecondTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentySecondTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 22;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentySecondTxtAreaMouseClicked

    private void twentyThirdTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyThirdTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 23;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentyThirdTxtAreaMouseClicked

    private void twentyFourthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyFourthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 24;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentyFourthTxtAreaMouseClicked

    private void twentyFifthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyFifthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 25;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentyFifthTxtAreaMouseClicked

    private void twentySixthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentySixthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 26;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentySixthTxtAreaMouseClicked

    private void twentySeventhTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentySeventhTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 27;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentySeventhTxtAreaMouseClicked

    private void twentyEighthTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyEighthTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        dayChangeJFrame.show();
        
        //Came From Stack Overflow
        dayChangeJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
        
        //Setting the day variable
        day = 28;
        
        //Setting Day Text
        dateLbl.setText("Febuary " + day + ",2015");
    }//GEN-LAST:event_twentyEighthTxtAreaMouseClicked

    private void createAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountBtnActionPerformed
        //Filewriter
        File dataFile = new File("signIn.dat");
        FileWriter out;
        BufferedWriter writeFile;
        //Variables
        String username = signUpUsernameTxtFeild.getText();
        String password = signUpPasswordTxtFeild.getText();
        String passwordReenterd = signUpReEnterPasswordTxtFeild.getText();
        int error = 0;
        
        try{
            if(account.equals("1")){
                error = 3;
                throw new Exception("Error");    
            }
            else{
                out = new FileWriter(dataFile);
                writeFile = new BufferedWriter(out);              

                if(username.charAt(0) != ' ' && password.charAt(0) != ' ' && passwordReenterd.charAt(0) != ' '){
                    if(password.length() != passwordReenterd.length()){
                        error = 2;
                        throw new Exception("Error");
                    }

                    if(password.equals(passwordReenterd)){ 
                        System.out.println("Yes");
                    }
                    else{
                        error = 2;
                        throw new Exception("Error");  
                    }


                }
                else{
                    error = 1;
                    throw new Exception("Error");
                }

                if (error == 0){
                    writeFile.write(username);
                    writeFile.newLine();
                    writeFile.write(password);
                    writeFile.newLine();
                    writeFile.write("1");
                    
                    //Hiding the main sign in screen
                     hide();

                    //Displaying and resizing the chosen date
                    monthJFrame.show();

                    //Came From Stack Overflow
                    monthJFrame.setSize(screenSize.width, screenSize.height);
                    
                    //Putting a name to the title
                    titleLbl.setText(accountName + "'s Calendar" );
                    
                    //Colouring exit button
                    exitBtn.setBackground(Color.black);
                    
                }
                else{
                writeFile.newLine();
                writeFile.newLine();
                writeFile.newLine();
                writeFile.write("0");
                }

                writeFile.close();
                out.close();  
            }
            
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
    	}
        catch (Exception e){
            if (error == 1){
                System.err.println("You must enter a user name and password");
                System.err.println("Exception: " + e);
                signinErrorLbl2.setText("You must enter a user name and password");
            }
            if (error == 2){
                System.err.println("You must enter the same password");
                System.err.println("Exception: " + e);
                signInErrorLbl.setText("You must enter the same password");
            }
            else if (error == 3){
                System.err.println("You already have an account");
                System.err.println("Exception: " + e);
                signInErrorLbl.setText("You already have an account");
            }
            }
        
        
    }//GEN-LAST:event_createAccountBtnActionPerformed

    private void signUpUsernameTxtFeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpUsernameTxtFeildMouseClicked
        signUpUsernameTxtFeild.setText("");
    }//GEN-LAST:event_signUpUsernameTxtFeildMouseClicked

    private void signUpPasswordTxtFeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpPasswordTxtFeildMouseClicked
        signUpPasswordTxtFeild.setText("");
    }//GEN-LAST:event_signUpPasswordTxtFeildMouseClicked

    private void signUpReEnterPasswordTxtFeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpReEnterPasswordTxtFeildMouseClicked
        signUpReEnterPasswordTxtFeild.setText("");
    }//GEN-LAST:event_signUpReEnterPasswordTxtFeildMouseClicked

    private void signInPasswordTxtFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInPasswordTxtFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInPasswordTxtFeildActionPerformed
    
    /**
     * This method checks the start time of the event to see if it is a usable time
     * @param startTime
     * @return error
     */
    public int startTime(String startTime){
        //Varaibles and arrays
        char startTimeCheck;
        int error = 0;
        char colon = ':';
        //Arrays
        int[] checkStart = new int[4];
        int[] minute = new int[2];
        
        //General try statment to send to a catch to catch errors in user input
        try{
            if(startTime.length() > 5){
                
                errorLbl1.setVisible(true);
                error = 1;
                throw new NumberFormatException();
            }
            else{               
                //Setting the user entered start time to an array
                for (int i = 0; i < 4; i ++){
                    startTimeCheck = startTime.charAt(i);
                    checkStart[i] = (int)startTimeCheck - 48 ;

                    
                    //checking that the time is not a bunch of letters
                    if(checkStart[i] > 10 || checkStart[i] < -1){
                        //Output Error
                        errorLbl1.setVisible(true);
                        error = 1;
                        throw new NumberFormatException();
                    }
                }
                //Checking if the first number is a 1
                if(checkStart[0] == 1){
                    //If the number is a one I want to check if the second one is a colon or another number
                    if (checkStart[1] == 10){
                       
                        //If the number is a colon then I must check a different posisition to check the minute time 
                        minute[0] = startTime.charAt(2) -48;
                        minute[1] = startTime.charAt(3) - 48;
                        //Making sure the user entered a colon
                        if(startTime.charAt(1) != colon){
                            error = 1;
                            errorLbl1.setVisible(true);

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                    else {
                        
                        //If the second number is not a colon then I must check to make sure it is a time that is useable
                        if (checkStart[1] == 0 ||checkStart[1] == 1 ||checkStart[1] == 2){
                            
                            //Setting the appropriate minute check
                            minute[0] = startTime.charAt(3) -48;
                            minute[1] = startTime.charAt(4) - 48;

                            //Making sure the user entered a colon
                            if(startTime.charAt(2) != colon){
                                error = 1;
                                errorLbl1.setVisible(true);

                                throw new Exception ("Must be a time in the twelve hour clock");
                            }

                        }
                        else{
                            //Setting error label to be shown
                            errorLbl1.setVisible(true);
                            error = 1;

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                }
                //Checking if the first digit of the minutes can be used or not
                if(minute[0] > 5 || minute[0] < 0 || minute[1] < 0){
                    errorLbl1.setVisible(true);
                    error = 1;

                    throw new Exception ("Must be a time in the twelve hour clock");
                }
            }
        }
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe);
            error = 1;
            }
        catch (Exception e){
            System.err.println("Must be a time in the twelve hour clock");
            System.err.println("The time must look something like this: 12:00, 12:31");
            System.err.println("Exception: " + e);
            error = 1;
            }
        return error;
    }
    
    /**
     * This is a method to check that the end time entered is a valid time
     * @param endTime
     * @return error
     */
    public int endTime (String endTime){
        //Varaibles and arrays
        char endTimeCheck;
        int error = 0;
        char colon = ':';
        //Arrays
        int[] checkEnd = new int[4];
        int[] minute = new int[2];
        
        //General try statment to send to a catch to catch errors in user input
        try{
            if(endTime.length() > 5){
                
                errorLbl1.setVisible(true);
                error = 1;
                throw new NumberFormatException();
            }
            else{               
                //Setting the user entered start time to an array
                for (int i = 0; i < 4; i ++){
                    endTimeCheck = endTime.charAt(i);
                    checkEnd[i] = (int)endTimeCheck - 48 ;

                    
                    //checking that the time is not a bunch of letters
                    if(checkEnd[i] > 10 || checkEnd[i] < -1){
                        //Output Error
                        errorLbl1.setVisible(true);
                        error = 1;
                        throw new NumberFormatException();
                    }
                }
                //Checking if the first number is a 1
                if(checkEnd[0] == 1){
                    //If the number is a one I want to check if the second one is a colon or another number
                    if (checkEnd[1] == 10){
                       
                        //If the number is a colon then I must check a different posisition to check the minute time 
                        minute[0] = endTime.charAt(2) -48;
                        minute[1] = endTime.charAt(3) - 48;
                        //Making sure the user entered a colon
                        if(endTime.charAt(1) != colon){
                            error = 1;
                            errorLbl1.setVisible(true);

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                    else {
                        //If the second number is not a colon then I must check to make sure it is a time that is useable
                        if (checkEnd[1] == 0 ||checkEnd[1] == 1 ||checkEnd[1] == 2){
                            
                            
                            //Setting the appropriate minute check
                            minute[0] = endTime.charAt(3) -48;
                            minute[1] = endTime.charAt(4) - 48;

                            //Making sure the user entered a colon
                            if(endTime.charAt(2) != colon){
                                error = 1;
                                errorLbl1.setVisible(true);

                                throw new Exception ("Must be a time in the twelve hour clock");
                        }

                        }
                        //Sending an error if the time is not in the twelve hour clock
                        else{
                            //Setting error label to be shown
                            errorLbl1.setVisible(true);
                            error = 1;

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                }
                //Checking if the first digit of the minutes can be used or not
                if(minute[0] > 5 || minute[0] < 0 || minute[1] < 0){
                    errorLbl1.setVisible(true);
                    error = 1;

                    throw new Exception ("Must be a time in the twelve hour clock");
                }
            }
        }
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe);
            error = 1;
            }
        catch (Exception e){
            System.err.println("Must be a time in the twelve hour clock");
            System.err.println("The time must look something like this: 12:00, 12:31");
            System.err.println("Exception: " + e);
            error = 1;
            }
        return error;
    }
    
    public int checkTimes(String startTime, String endTime, String startTimeAmPm, String endTimeAmPm){
        //Variables
        int error = 0;
        int startMinute;
        int endMinute;
        int startHour = 0;
        int endHour = 0;
        
        //Arrays
        int[] start = new int[5];
        int[] end = new int[5];
        int[] startMinutes = new int[2];
        int[] endMinutes = new int[2];
        
        try{
            for (int i = 0 ; i < startTime.length(); i ++){
                    start[i] = (int)startTime.charAt(i) - 48;
                    
            }
            for (int i = 0 ; i < endTime.length(); i ++){
                    end[i] = (int)endTime.charAt(i) - 48;
                    
            }
            
            if(startTime.length() == 4){
                startMinutes[0] = start[2] + 1;
                startMinutes[1] = start[3] + 1;                
                startHour = start[0];
            }
            else if(startTime.length() == 5){
                startMinutes[0] = start[3] + 1;
                startMinutes[1] = start[4] + 1;
                
                if(start[1] == 2){
                    startHour = 0;
                }
                else{
                    startHour = 10 + start[1];     
                }
            }
            if(endTime.length() == 4){
                endMinutes[0] = end[2] + 1;
                endMinutes[1] = end[3] + 1;
                
                endHour = end[0];
            }
            else if(endTime.length() == 5){
                endMinutes[0] = end[3] + 1;
                endMinutes[1] = end[4] + 1; 
                
                if(end[1] == 2){
                    endHour = 0;
                }
                else{
                    endHour = 10 + end[1];     
                }
            }
            
            endMinute = endMinutes[0] + endMinutes[1];
            startMinute = startMinutes[0] + startMinutes[1];
            
            if (startTimeAmPm == "PM" && endTimeAmPm == "AM"){
                error = 1;
            }
            
            else if(startHour > endHour && startTimeAmPm == "AM" && endTimeAmPm == "AM" ){
                error = 1;
            }
            
            else if(startHour > endHour && startTimeAmPm == "PM" && endTimeAmPm == "PM"){
                error = 1;
            }
            else if(startHour == endHour){
                if (startMinute > endMinute){
                    error = 1;
                } 
            }
            else if (startTimeAmPm == "AM" && endTimeAmPm == "PM"){
                error = 0;
            }
        }
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe);
            error = 1;
            }
        catch (Exception e){
            System.err.println("Must be a time in the twelve hour clock");
            System.err.println("The time must look something like this: 12:00, 12:31");
            System.err.println("Exception: " + e);
            error = 1;
            }
        
        return error;
    }
    
    public void activity(String time,int errorStart,int errorEnd,int errorTiming){
        String[] activity = new String[28];
        
        
        if(errorStart != 1 && errorEnd != 1 && errorTiming != 1){
            if (timesThrough[day - 1] == 0){
            activity[day -1] = activityTxtFeild.getText();
            allDay[day - 1] = time + ":\n" + activity[day - 1] + "\n";
            allDay[day - 1] = allDay[day - 1] + "\n";
            }
            else{
            activity[day -1] = activityTxtFeild.getText();
            allDay[day - 1] = allDay[day - 1] + time + ":\n" + activity[day - 1] + "\n";
            allDay[day - 1] = allDay[day - 1] + "\n";   
            }
                
            if(day == 1){
                firstTxtArea.setLineWrap(true);
                firstTxtArea.setWrapStyleWord(true);
                firstTxtArea.setText("1st \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 2){
                secondTxtArea.setLineWrap(true);
                secondTxtArea.setWrapStyleWord(true);
                secondTxtArea.setText("2nd \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 3){
                thirdTxtArea.setLineWrap(true);
                thirdTxtArea.setWrapStyleWord(true);
                thirdTxtArea.setText("3rd \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 4){
                fourthTxtArea.setLineWrap(true);
                fourthTxtArea.setWrapStyleWord(true);
                fourthTxtArea.setText("4th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 5){
                fifthTxtArea.setLineWrap(true);
                fifthTxtArea.setWrapStyleWord(true);
                fifthTxtArea.setText("5th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 6){
                sixthTxtArea.setLineWrap(true);
                sixthTxtArea.setWrapStyleWord(true);
                sixthTxtArea.setText("6th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 7){
                seventhTxtArea.setLineWrap(true);
                seventhTxtArea.setWrapStyleWord(true);
                seventhTxtArea.setText("7th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 8){
                eighthTxtArea.setLineWrap(true);
                eighthTxtArea.setWrapStyleWord(true);
                eighthTxtArea.setText("8th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 9){
                ninthTxtArea.setLineWrap(true);
                ninthTxtArea.setWrapStyleWord(true);
                ninthTxtArea.setText("9th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 10){
                tenthTxtArea.setLineWrap(true);
                tenthTxtArea.setWrapStyleWord(true);
                tenthTxtArea.setText("10th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 11){
                eleventhTxtArea.setLineWrap(true);
                eleventhTxtArea.setWrapStyleWord(true);
                eleventhTxtArea.setText("11th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 12){
                twelfthTxtArea.setLineWrap(true);
                twelfthTxtArea.setWrapStyleWord(true);
                twelfthTxtArea.setText("12th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 13){
                thirteenthTxtArea.setLineWrap(true);
                thirteenthTxtArea.setWrapStyleWord(true);
                thirteenthTxtArea.setText("13th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 14){
                fourteenthTxtArea.setLineWrap(true);
                fourteenthTxtArea.setWrapStyleWord(true);
                fourteenthTxtArea.setText("14th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 15){
                fifteenthTxtArea.setLineWrap(true);
                fifteenthTxtArea.setWrapStyleWord(true);
                fifteenthTxtArea.setText("15th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 16){
                sixteenthTxtArea.setLineWrap(true);
                sixteenthTxtArea.setWrapStyleWord(true);
                sixteenthTxtArea.setText("16th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 17){
                seventeenthTxtArea.setLineWrap(true);
                seventeenthTxtArea.setWrapStyleWord(true);
                seventeenthTxtArea.setText("17th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 18){
                eighteenthTxtArea.setLineWrap(true);
                eighteenthTxtArea.setWrapStyleWord(true);
                eighteenthTxtArea.setText("18th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 19){
                nineteenthTxtArea.setLineWrap(true);
                nineteenthTxtArea.setWrapStyleWord(true);
                nineteenthTxtArea.setText("19th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 20){
                twentiethTxtArea.setLineWrap(true);
                twentiethTxtArea.setWrapStyleWord(true);
                twentiethTxtArea.setText("20th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 21){
                twentyFirstTxtArea.setLineWrap(true);
                twentyFirstTxtArea.setWrapStyleWord(true);
                twentyFirstTxtArea.setText("21st \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 22){
                twentySecondTxtArea.setLineWrap(true);
                twentySecondTxtArea.setWrapStyleWord(true);
                twentySecondTxtArea.setText("22nd \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 23){
                twentyThirdTxtArea.setLineWrap(true);
                twentyThirdTxtArea.setWrapStyleWord(true);
                twentyThirdTxtArea.setText("23rd \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 24){
                twentyFourthTxtArea.setLineWrap(true);
                twentyFourthTxtArea.setWrapStyleWord(true);
                twentyFourthTxtArea.setText("24th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 25){
                twentyFifthTxtArea.setLineWrap(true);
                twentyFifthTxtArea.setWrapStyleWord(true);
                twentyFifthTxtArea.setText("25th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 26){
                twentySixthTxtArea.setLineWrap(true);
                twentySixthTxtArea.setWrapStyleWord(true);
                twentySixthTxtArea.setText("26th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 27){
                twentySeventhTxtArea.setLineWrap(true);
                twentySeventhTxtArea.setWrapStyleWord(true);
                twentySeventhTxtArea.setText("27th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            if(day == 28){
                twentyEighthTxtArea.setLineWrap(true);
                twentyEighthTxtArea.setWrapStyleWord(true); 
                twentyEighthTxtArea.setText("28th \n" +allDay[day - 1] );
                timesThrough[day - 1] ++;
            }
            
            
        
        }
    }
    
    public void accounts(){
        File dataFile = new File("signIn.dat");
        FileReader in;
        BufferedReader readFile;
        
        try{
            in = new FileReader(dataFile);
            readFile = new BufferedReader(in);
            
            accountName = readFile.readLine();
            readFile.readLine();
            account = readFile.readLine();
            
            in.close();
            readFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
    	}
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calendarCulminating().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLbl;
    private javax.swing.JTextField activityTxtFeild;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JFrame dayChangeJFrame;
    private javax.swing.JScrollPane eighteenthScrollPane;
    private javax.swing.JTextArea eighteenthTxtArea;
    private javax.swing.JScrollPane eighthScrollPane;
    private javax.swing.JTextArea eighthTxtArea;
    private javax.swing.JScrollPane eleventhScrollPane;
    private javax.swing.JTextArea eleventhTxtArea;
    private javax.swing.JComboBox endAmPmCombBox;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JTextField endTimeTxtFeild;
    private javax.swing.JLabel errorLbl1;
    private javax.swing.JLabel errorLbl2;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel febuaryLbl;
    private javax.swing.JScrollPane fifteenthScrollPane;
    private javax.swing.JTextArea fifteenthTxtArea;
    private javax.swing.JScrollPane fifthScrollPane;
    private javax.swing.JTextArea fifthTxtArea;
    private javax.swing.JScrollPane firstScrollPane;
    private javax.swing.JTextArea firstTxtArea;
    private javax.swing.JScrollPane fourteenthScrollPane;
    private javax.swing.JTextArea fourteenthTxtArea;
    private javax.swing.JScrollPane fourthScrollPane;
    private javax.swing.JTextArea fourthTxtArea;
    private javax.swing.JLabel fridayLbl;
    private javax.swing.JLabel mondayLbl;
    private javax.swing.JPanel monthBackgroundPnl;
    private javax.swing.JFrame monthJFrame;
    private javax.swing.JScrollPane nineteenthScrollPane;
    private javax.swing.JTextArea nineteenthTxtArea;
    private javax.swing.JScrollPane ninthScrollPane;
    private javax.swing.JTextArea ninthTxtArea;
    private javax.swing.JLabel saturdayLbl;
    private javax.swing.JScrollPane secondScrollPane;
    private javax.swing.JTextArea secondTxtArea;
    private javax.swing.JScrollPane seventeenthScrollPane;
    private javax.swing.JTextArea seventeenthTxtArea;
    private javax.swing.JScrollPane seventhScrollPane;
    private javax.swing.JTextArea seventhTxtArea;
    private javax.swing.JPanel signInBackgroundPnl;
    private javax.swing.JButton signInBtn;
    private javax.swing.JLabel signInErrorLbl;
    private javax.swing.JLabel signInLbl;
    private javax.swing.JLabel signInPasswordLbl;
    private javax.swing.JPasswordField signInPasswordTxtFeild;
    private javax.swing.JLabel signInUsernameLbl;
    private javax.swing.JTextField signInUsernameTxtFeild;
    private javax.swing.JLabel signUpLbl;
    private javax.swing.JLabel signUpPasswordLbl;
    private javax.swing.JPasswordField signUpPasswordTxtFeild;
    private javax.swing.JLabel signUpReEnterPasswordLbl;
    private javax.swing.JPasswordField signUpReEnterPasswordTxtFeild;
    private javax.swing.JLabel signUpUsernameLbl;
    private javax.swing.JTextField signUpUsernameTxtFeild;
    private javax.swing.JLabel signinErrorLbl2;
    private javax.swing.JScrollPane sixteenthScrollPane;
    private javax.swing.JTextArea sixteenthTxtArea;
    private javax.swing.JScrollPane sixthScrollPane;
    private javax.swing.JTextArea sixthTxtArea;
    private javax.swing.JComboBox startAmPmCombBox;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JTextField startTimeTxtFeild;
    private javax.swing.JLabel sundayLbl;
    private javax.swing.JScrollPane tenthScrollPane;
    private javax.swing.JTextArea tenthTxtArea;
    private javax.swing.JScrollPane thirdScrollPane;
    private javax.swing.JTextArea thirdTxtArea;
    private javax.swing.JScrollPane thirteenthScrollPane;
    private javax.swing.JTextArea thirteenthTxtArea;
    private javax.swing.JLabel thrusdayLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel tuesdayLbl;
    private javax.swing.JScrollPane twelfthScrollPane;
    private javax.swing.JTextArea twelfthTxtArea;
    private javax.swing.JScrollPane twentiethScrollPane;
    private javax.swing.JTextArea twentiethTxtArea;
    private javax.swing.JScrollPane twentyEighthScrollPane;
    private javax.swing.JTextArea twentyEighthTxtArea;
    private javax.swing.JScrollPane twentyFifthScrollPane;
    private javax.swing.JTextArea twentyFifthTxtArea;
    private javax.swing.JScrollPane twentyFirstScrollPane;
    private javax.swing.JTextArea twentyFirstTxtArea;
    private javax.swing.JScrollPane twentyFourthScrollPane;
    private javax.swing.JTextArea twentyFourthTxtArea;
    private javax.swing.JScrollPane twentySecondScrollPane;
    private javax.swing.JTextArea twentySecondTxtArea;
    private javax.swing.JScrollPane twentySeventhScrollPane;
    private javax.swing.JTextArea twentySeventhTxtArea;
    private javax.swing.JScrollPane twentySixthScrollPane;
    private javax.swing.JTextArea twentySixthTxtArea;
    private javax.swing.JScrollPane twentyThirdScrollPane;
    private javax.swing.JTextArea twentyThirdTxtArea;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel wednesdayLbl;
    // End of variables declaration//GEN-END:variables

    
}
