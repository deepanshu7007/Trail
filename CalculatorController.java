/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Trail;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;

    private CalculatorModel theModel;

     

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

        this.theView = theView;

        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());

    }

    class CalculateListener implements ActionListener{

 

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber = 0;

            try{

                firstNumber = 

                secondNumber = theView.getSecondNumber();

                 

                theModel.addTwoNumbers(firstNumber, secondNumber);

                 

                theView.setCalcSolution(theModel.getCalculationValue());


            }


            catch(NumberFormatException ex){

                 

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

                 

            }


        }

         

    }

     

}
