//OpTime build v.01 (10-26-2021)
//Created by Nicholas Ciavone for CSI 2999



/* -----------------------------------------------------------------
This must be done by Nov 24th 2021 
Must fill out more documentation about possible seperate files.
--------------------------------------------------------------------*/

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//-----------------------------------------------------------------------------//

 

/* 
public class home extends Frame {
String keymsg = "This is a test."; String mousemsg = "";

int mouseX=30, mouseY=30;



public void paint(Graphics g) {
g.drawString(keymsg, 10, 40);
g.drawString(mousemsg, mouseX, mouseY);
}

 

// Create the window of moderate size. - NC

public static void main(String args[]) {

home appwin = new home();

//This is where you change the window size - NC
appwin.setSize(new Dimension(600, 400));
appwin.setTitle("OpTime (alpha v.01)");
appwin.setVisible(true);
}


// Creating an Exit button with the JButton obj. - NC
JButton exit = new JButton("Exit");

exit.addActionListener /*class implementing action listener*/;

 
/*
public void actionPerformed(ActionEvent e)
{

     if(e.getSource() == exit) System.exit(0);

}
*/

// Program to measure elapsed time in Java - NC
class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        long startTime = System.nanoTime();
 
        /* … The code being measured starts … */
 
        // sleep for 5 seconds
        TimeUnit.SECONDS.sleep(5);
 
        /* … The code being measured ends … */
 
        long endTime = System.nanoTime();
 
        // get the difference between the two nano time valuess
        long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}