package com.we_love_crazy_quote.bmicalculator;

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
    private  void findViews()
    {

        resultText = findViewById(R.id.Text_View_result);
        maleButton = findViewById(R.id.radio_button_male);
        femaleButton = findViewById(R.id.radio_button_female);
        ageEditText = findViewById(R.id.Edit_text_Age);
        feetEditText = findViewById(R.id.Edit_View_Feet);
        inchesEditText = findViewById(R.id.Edit_View_Inches);
        weightEditText = findViewById(R.id.Edit_View_weight);


        Button calculateButton = findViewById(R.id.button_calculate);
    }
    private  void setupButtonClickListener()
    {

        calculateButton.setOnClickListener(new View.OnClickListener() {
                                               @Override public void onClick(View v) {
                                                   calculateBmi();

                                               }
                                           }
        );}
    private void calculateBmi()
    {

        String ageText=ageEditText.getText().toString();
        String feetText=feetEditText.getText().toString();
        String inchesText=inchesEditText.getText().toString();
        String weightText=weightEditText.getText().toString();


//Converting the number String into variables

        int age= Integer.parseInt(ageText);
        int feet = Integer.parseInt(feetText);
        int inches = Integer.parseInt(inchesText);
        int weight = Integer.parseInt(weightText);
        int totalInches = (feet*12) +inches;


        double heightInMeter = totalInches*0.0254;
        //BMi Formula
        double bmi   = weight*(heightInMeter*heightInMeter);
//we must convert the decimal/double into a string for a textView
        String bmitextResult=String.valueOf(bmi);


        resultText.setText(bmitextResult);
//resultText.setText("Age:"+ageText+"feet :"+feetText+"Inches:"+inchesText+"Weight :"+weightText);

    }
}