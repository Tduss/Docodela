package com.ies.docodela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{

    private EditText input_weight;
    private EditText input_height;

    private TextView bmi_classification;
    private TextView bmi_result;
    private  TextView txt_weight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    public void initialization()
    {
        input_weight = findViewById(R.id.input_weight);
        input_height = findViewById(R.id.input_height);
        bmi_classification = findViewById(R.id.nominal_resultado);
        bmi_result = findViewById(R.id.number_result);
        txt_weight = findViewById(R.id.txt_peso);
    }



    public void btnOnClickCalculator(View view)
    {
        double weight = Double.parseDouble(input_weight.getText().toString());
        double height = Double.parseDouble(input_height.getText().toString());
        if (weight > 0 && height > 0)
        {
            double bmi = weight / (height * height);
            String formattedBmi = String.format("%.1f", bmi);

            if (bmi <= 16.0)
            {
                bmi_classification.setText("DAG");
            } else if (bmi < 18.5)
            {
                bmi_classification.setText("DAM");
            } else if (bmi < 25.0)
            {
                bmi_classification.setText("Normal");
            }
            else {
                bmi_classification.setText("Sobrepeso");
            }

            bmi_result.setText(formattedBmi);
             //Toast.makeText(this, formattedBmi+": " + bmi_classification.getText(),Toast.LENGTH_LONG).show();
//            Toast toast = Toast.makeText(getApplicationContext(), "Your message here", Toast.LENGTH_SHORT);
//            //toast.setGravity(Gravity.TOP, 0, 0);
//            txt_weight.setText(""+toast.toString());
//            toast.show();
        }
        else
        {
            //bmi_classification.setText("Reva o peso e a altura");

            Toast.makeText(this, "Peso ou altura errada",Toast.LENGTH_SHORT).show();

        }

    }
}