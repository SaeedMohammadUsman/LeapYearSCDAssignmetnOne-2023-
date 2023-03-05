///////////////////////////////////////////////////////////////////////////
//*************************************************************************
// SCD  Assignment 														  *
// Developer:Mohammad Usman												  *
// problem statement: Leap Year        					 				  *
// DAte: 05/03/2023														  *
// Submitted to :Mr. Shakir Rasheed							              *
//*************************************************************************
//////////////////////////////////////////////////////////////////////////

import javax.swing.JOptionPane;
public class LeapYear {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //take five time an input number for checking
            String inputYear = JOptionPane.showInputDialog(null, "Enter a year to check if it is a leap year:");
            int year = Integer.parseInt(inputYear);// convert the string to the int (parseInt)

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){  //condition
                JOptionPane.showMessageDialog(null, year + " is a leap year.");
            } else {
                JOptionPane.showMessageDialog(null, year + " is not a leap year.");
            }
        }
    }
}
