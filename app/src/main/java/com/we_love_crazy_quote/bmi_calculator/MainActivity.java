package com.we_love_crazy_quote.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.we_love_crazy_quote.bmi_calculator.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    //class Variables also are called Fields
    private TextView resultText;
    private Button calculateButton;
    private RadioButton maleButton;
    private RadioButton femaleButton;
    private EditText ageEditText;
    private  EditText feetEditText;
    private EditText inchesEditText;
    private EditText weightEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
    }


    private void findViews()
    {

        resultText = findViewById(R.id.Text_View_result);
        maleButton = findViewById(R.id.radio_button_male);
        femaleButton = findViewById(R.id.radio_button_female);
        ageEditText = findViewById(R.id.Edit_text_Age);
        feetEditText = findViewById(R.id.Edit_View_Feet);
        inchesEditText = findViewById(R.id.Edit_View_Inches);
        weightEditText = findViewById(R.id.Edit_View_weight);


        calculateButton = findViewById(R.id.button_calculate);
    }
    private void setupButtonClickListener()
    {
        calculateButton.setOnClickListener(new View.OnClickListener() {
                                               @Override public void onClick(View v) {
                                                  double bmiResult=calculateBmi();
                                                  String ageText=ageEditText.getText().toString();
                                                  int age=Integer.parseInt(ageText);
                                                  if(age>=18)
                                                      displayResult(bmiResult);
                                                  else
                                                      displayGuidance(bmiResult);

                                               }
                                               private double calculateBmi()
                                               {

                                                   String ageText=ageEditText.getText().toString();
                                                   String feetText=feetEditText.getText().toString();
                                                   String inchesText=inchesEditText.getText().toString();
                                                   String weightText=weightEditText.getText().toString();


//Converting the number String into variables

                                                   int age = Integer.parseInt(ageText);
                                                   int feet = Integer.parseInt(feetText);
                                                   int inches = Integer.parseInt(inchesText);
                                                   int weight = Integer.parseInt(weightText);
                                                   int totalInches = (feet*12) +inches;


                                                   double heightInMeter = totalInches*0.0254;
                                                   //BMi Formula
                                                   double bmi   = weight/(heightInMeter*heightInMeter);
                                                   return bmi;
//we must convert the decimal/double into a string for a textView




//resultText.setText("Age:"+ageText+"feet :"+feetText+"Inches:"+inchesText+"Weight :"+weightText);

                                               }
                                           }
        );}

    private void displayResult(double bmi)
    {
        DecimalFormat myDecimalFormatter = new DecimalFormat(  "0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);
        String fullResultString;
        if(bmi <18.5)
        {
            //Display underweight
            fullResultString ="BMI Value is "+bmiTextResult +
                                              "                      You are underweight";

        }
        else if(bmi > 25)
        {
          //Display overweight
          fullResultString = "BMI Value is " +bmiTextResult+
                                              "                      You are overweight";

        }
        else
        {
            //Display healthy
            fullResultString ="BMI Value is "+bmiTextResult+
                                             "                      You are a healthy weight";
        }
    resultText.setText(fullResultString);
    }
        private void displayGuidance(double bmi)
        {
            DecimalFormat myDecimalFormatter = new DecimalFormat(  "0.00");
            String bmiTextResult = myDecimalFormatter.format(bmi);
            String fullResultString;
            if(maleButton.isChecked())
            {
                //display boy Guidance
                fullResultString = "BMI Value is "+bmiTextResult + "                      As you are under 18 , please consult with your doctor for the healthy range for boys";

            }
            else if(femaleButton.isChecked())
            {
                //Display girl Guidance
                fullResultString = "BMI Value is "+bmiTextResult + "                      As you are under 18 , please consult with your doctor for the healthy range for girls";

            }
            else {
                //Display genral guidance
                fullResultString ="BMI Value is "+ bmiTextResult + "                      As you are under 18 , please consult with your doctor for the healthy range";
            }
            resultText.setText(fullResultString);
        }
}