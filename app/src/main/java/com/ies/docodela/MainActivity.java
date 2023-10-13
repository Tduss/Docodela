package com.ies.docodela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.DomainLoadStoreParameter;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();

        link_Adolescentes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,boysAdolescentes.class);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, boysAdolescentes.class));
            }
        });

        link_criancas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Criancas.class);
                startActivity(intent);
            }
        });


    }

    public void initialization()
    {
        input_weight = findViewById(R.id.input_weight);
        input_height = findViewById(R.id.input_height);
        bmi_classification = findViewById(R.id.nominal_resultado);
        bmi_result = findViewById(R.id.number_result);
        link_criancas = findViewById(R.id.link_AD_criancas);
        link_Adolescentes = findViewById(R.id.link_AD_Adolescentes);
    }



    public void btnOnClickCalculator(View view)
    {
        float weight, height;
        try
        {
            weight = Float.parseFloat(input_weight.getText().toString());
            height = Float.parseFloat(input_height.getText().toString());
        }
        catch (NumberFormatException e)
        {

            Toast.makeText(this, "porfavor, preenche os campos vazios", Toast.LENGTH_SHORT).show();
            return;
        }
        if (weight > 0 && height > 0)
        {
            double roundedBmi = weight / (height * height);
            double bmi = Math.round(roundedBmi * 10.0) / 10.0;
            String formattedBmi = String.format("%.1f", bmi);

            if (bmi <= 16.0)
            {
                bmi_classification.setText(DAG);
            }
            else if (bmi < 18.5)
            {
                bmi_classification.setText(DAM);
            }
            else if (bmi < 25.0)
            {
                bmi_classification.setText(Normal);
            }
            else if (bmi < 30)
            {
                bmi_classification.setText(Sobrepeso);
            }
            else
            {
                bmi_classification.setText(Obesidade);
            }

            bmi_result.setText(formattedBmi);

        }
        else
        {
            //bmi_classification.setText("Reveja o peso e a altura");

            Toast.makeText(this, "Peso ou altura invalida",Toast.LENGTH_SHORT).show();

        }

    }

    private EditText input_weight;
    private EditText input_height;

    private TextView bmi_classification;
    private TextView bmi_result;
    private TextView link_criancas, link_Adolescentes;

    String Obesidade = "Obesidade";
    String Sobrepeso = "Sobrepeso";
    String Normal = "Normal";
    String DAM = "DAM";
    String DAG = "DAG";
}