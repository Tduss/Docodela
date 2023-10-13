package com.ies.docodela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class boysAdolescentes extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys_adolescentes);
        initialization();


        link_adultos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(boysAdolescentes.this,MainActivity.class);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, boysAdolescentes.class));
            }
        });

        link_criancas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(boysAdolescentes.this, Criancas.class);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, boysAdolescentes.class));
            }
        });
    }

    public void initialization()
    {
        input_weight = findViewById(R.id.input_weight_adolescentes);
        input_height = findViewById(R.id.input_height_adolescentes);
        input_year = findViewById(R.id.input_year_adolescentes);
        input_month = findViewById(R.id.input_month_adolescentes);
        bmi_classification = findViewById(R.id.resultado_nominal_adolescentes);
        bmi_result = findViewById(R.id.resultado_numerico_adolescentes);
        link_criancas = findViewById(R.id.link_criancas);
        link_adultos = findViewById(R.id.link_adultos);
    }


    public void btn_calcular_adolescentes(View view)
    {
        float weight, height;
        int years, months;
        try
        {
            weight = Float.parseFloat(input_weight.getText().toString());
            height = Float.parseFloat(input_height.getText().toString());
            years = Integer.parseInt(input_year.getText().toString());
            months = Integer.parseInt(input_month.getText().toString());


            int radioSelected = getSelectedGender();

            if (radioSelected == -1)
            {
                Toast.makeText(this, "Por favor, selecione o sexo ", Toast.LENGTH_SHORT).show();
                return;
            }


            int[] result = monthCalculator(years, months);
            if (result == null)
            {
                Toast.makeText(this, "Ano ou mes inapropriado", Toast.LENGTH_SHORT).show();
                return;
            }

            int year = result[0];
            int month = result[1];


            float roundedBmi = calculateBMI(weight, height);


            //round the bmi to nearested integer to one place decimal number
            float bmi = Math.round(roundedBmi * 10.0) / 10.0F;


            String formattedBmi = String.format("%.1f", bmi);

            if (bmi == -1)
            {
                Toast.makeText(this, "Peso ou altura inapropriada", Toast.LENGTH_SHORT).show();
                return;
            }


            // Analyze bmi range based on age for BOYS
            //if (year >= 5 && year <= 18)
            //{
            if (radioSelected == 1)
            {
                switch (year)
                {
                    case 5:
                        if(month == 1)
                        {
                            if (bmi > 18.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 18.3 && bmi >= 16.7)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.0 && bmi <= 16.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.1 && bmi <= 12.9)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.1)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 18.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 18.4 && bmi >= 16.8)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.0 && bmi <= 16.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.1 && bmi <= 12.9)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.1)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 6:
                        if(month == 0)
                        {
                            if (bmi > 18.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 18.5 && bmi >= 16.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.0 && bmi <= 16.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.1 && bmi <= 12.9)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.1)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if (month == 6)
                        {
                            if (bmi > 18.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi >= 17.7 && bmi <= 18.5)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.1 && bmi <= 16.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.2 && bmi <= 13.0)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.2)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 7:
                        if(month == 0)
                        {
                            if (bmi > 19.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.0 && bmi >= 17.1)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.1 && bmi <= 17.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.3 && bmi <= 13.0)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.3)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 19.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.3 && bmi >= 17.3)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.2 && bmi <= 17.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.3 && bmi <= 13.1)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.3)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 8:
                        if(month == 0)
                        {
                            if (bmi > 19.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.7 && bmi >= 17.5)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.3 && bmi <= 17.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.4 && bmi <= 13.2)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.4)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 20.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 20.1 && bmi >= 17.8)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.4 && bmi <= 17.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.5 && bmi <= 13.3)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.5)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 9:
                        if(month == 0)
                        {
                            if (bmi > 20.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 20.5 && bmi >= 18.0)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.5 && bmi <= 17.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.6 && bmi <= 13.4)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.6)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 20.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 20.9 && bmi >= 18.3)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.6 && bmi <= 18.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.7 && bmi <= 13.5)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 10:
                        if(month == 0)
                        {
                            if (bmi > 21.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 21.4 && bmi >= 18.6)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.7 && bmi <= 18.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.8 && bmi <= 13.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.8)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 21.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 21.9 && bmi >= 18.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.9 && bmi <= 18.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.9 && bmi <= 13.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.9)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 11:
                        if(month ==0)
                        {
                            if (bmi > 22.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 22.5 && bmi >= 19.3)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.1 && bmi <= 19.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.1 && bmi <= 14.0)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.1)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if (month == 6)
                        {
                            if (bmi > 23.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 23.0 && bmi >= 19.6)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.2 && bmi <= 19.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.2 && bmi <= 14.1)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.2)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 12:
                        if(month == 0)
                        {
                            if (bmi > 23.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 23.6 && bmi >= 20.0)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.5 && bmi <= 19.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.4 && bmi <= 14.4)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.4)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 24.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 24.2 && bmi >= 20.5)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.7 && bmi <= 20.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.6 && bmi <= 14.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.6)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 13:
                        if(month == 0)
                        {
                            if (bmi > 24.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 24.8 && bmi >= 20.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.9 && bmi <= 20.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.8 && bmi <= 14.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.8)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 25.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 25.3 && bmi >= 21.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.2 && bmi <= 21.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.0 && bmi <= 15.1)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.0)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 14:
                        if(month == 0)
                        {
                            if (bmi > 25.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 25.9 && bmi >= 21.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.5 && bmi <= 21.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.3 && bmi <= 15.4)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.3)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 26.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 26.5 && bmi >= 22.3)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.7 && bmi <= 22.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.5 && bmi <= 15.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.5)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 15:
                        if(month == 0)
                        {
                            if (bmi > 27.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 27.0 && bmi >= 22.8)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.0 && bmi <= 22.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.7 && bmi <= 15.9)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 27.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 27.4 && bmi >= 23.2)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.3 && bmi <= 23.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.9 && bmi <= 16.2)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.9)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 16:
                        if(month == 0)
                        {
                            if (bmi > 27.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 27.9 && bmi >= 23.6)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.5 && bmi <= 23.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 15.1 && bmi <= 16.4)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 15.1)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 28.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 28.3 && bmi >= 24.0)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.7 && bmi <= 23.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 15.3 && bmi <= 16.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 15.3)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 17:
                        if(month == 0)
                        {
                            if (bmi > 28.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 28.6 && bmi >= 24.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.9 && bmi <= 24.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 15.4 && bmi <= 16.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 15.4)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(month == 6)
                        {
                            if (bmi > 29.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 29.0 && bmi >= 24.7)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 17.1 && bmi <= 24.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 15.6 && bmi <= 17.0)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 15.6)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 18:
                        if (bmi > 29.2)
                        {
                            bmi_classification.setText(Obesidade);
                        }
                        else if (bmi <= 29.2 && bmi >= 25.0)
                        {
                            bmi_classification.setText(Sobrepeso);
                        }
                        else if (bmi >= 17.3 && bmi <= 24.9)
                        {
                            bmi_classification.setText(Normal);
                        }
                        else if (bmi >= 15.7 && bmi <= 17.2)
                        {
                            bmi_classification.setText(DAM);
                        }
                        else if (bmi < 15.7)
                        {
                            bmi_classification.setText(DAG);
                        }
                        break;
                    default:
                        Toast.makeText(this, "Ano ou mês inválido", Toast.LENGTH_SHORT).show();
                }

                bmi_result.setText(formattedBmi);
            }

            //Begining
            else if (radioSelected == 2)
            {
                switch (years)
                {
                    case 5:
                        if(months == 1)
                        {
                            if (bmi > 18.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 18.9 && bmi >= 17.0)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.7 && bmi <= 16.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.8 && bmi <= 12.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.8)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 19.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.0 && bmi >= 17.0)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.7 && bmi <= 16.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.7 && bmi <= 12.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 6:
                        if(months == 0)
                        {
                            if (bmi > 19.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.2 && bmi >= 17.1)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.7 && bmi <= 17.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.7 && bmi <= 12.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if (months == 6)
                        {
                            if (bmi > 19.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.5 && bmi >= 17.2)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.7 && bmi <= 17.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.7 && bmi <= 12.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 7:
                        if(months == 0)
                        {
                            if (bmi > 19.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 19.8 && bmi >= 17.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.7 && bmi <= 17.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.8 && bmi <= 12.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.8)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 20.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 20.1 && bmi >= 17.6)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.8 && bmi <= 17.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.8 && bmi <= 12.7)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.8)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 8:
                        if(months == 0)
                        {
                            if (bmi > 20.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 20.6 && bmi >= 17.8)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 12.9 && bmi <= 17.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 11.9 && bmi <= 12.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 11.9)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 21.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 21.1 && bmi >= 18.1)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.0 && bmi <= 18.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.0 && bmi <= 12.9)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.0)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 9:
                        if(months == 0)
                        {
                            if (bmi > 21.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 21.5 && bmi >= 18.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.1 && bmi <= 18.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.1 && bmi <= 13.0)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.1)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 22.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 22.0 && bmi >= 18.8)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.3 && bmi <= 18.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.2 && bmi <= 13.2)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.2)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 10:
                        if(months == 0)
                        {
                            if (bmi > 22.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 22.6 && bmi >= 19.1)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.5 && bmi <= 19.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.4 && bmi <= 13.4)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.4)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months ==6)
                        {
                            if (bmi > 23.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 23.1 && bmi >= 19.5)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 13.7 && bmi <= 19.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.5 && bmi <= 13.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.5)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 11:
                        if(months ==0)
                        {
                            if (bmi > 23.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 23.7 && bmi >= 20.0)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi <= 19.9 && bmi >= 13.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.7 && bmi <= 13.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if (months == 6)
                        {
                            if (bmi > 24.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 24.3 && bmi >= 20.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi <= 20.3 && bmi >= 14.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 12.9 && bmi <= 14.0)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 12.9)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 12:
                        if(months == 0)
                        {
                            if (bmi > 25.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 25.0 && bmi >= 20.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.4 && bmi <= 20.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.2 && bmi <= 14.3)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.2)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 25.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 25.6 && bmi >= 21.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.7 && bmi <= 21.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.4 && bmi <= 14.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.4)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 13:
                        if(months == 0)
                        {
                            if (bmi > 26.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 26.2 && bmi >= 21.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 14.9 && bmi <= 21.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.6 && bmi <= 14.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.6)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 26.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 26.8 && bmi >= 22.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.2 && bmi <= 22.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 13.8 && bmi <= 15.1)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 13.8)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 14:
                        if(months == 0)
                        {
                            if (bmi > 27.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 27.3 && bmi >= 22.8)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.4 && bmi <= 22.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.0 && bmi <= 15.3)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.0)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 27.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 27.8 && bmi >= 23.2)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.7 && bmi <= 23.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.2 && bmi <= 15.6)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.2)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 15:
                        if(months == 0)
                        {
                            if (bmi > 28.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 28.2 && bmi >= 23.6)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 15.9 && bmi <= 23.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.4 && bmi <= 15.8)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.4)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 28.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 28.6 && bmi >= 23.9)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.0 && bmi <= 23.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.5 && bmi <= 15.9)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.5)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 16:
                        if(months == 0)
                        {
                            if (bmi > 28.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 28.9 && bmi >= 24.2)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.2 && bmi <= 24.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.6 && bmi <= 16.1)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.6)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 29.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 29.1 && bmi >= 24.4)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.3 && bmi <= 24.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.7 && bmi <= 16.2)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 17:
                        if(months == 0)
                        {
                            if (weight > 29.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 29.3 && bmi >= 24.6)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.4 && bmi <= 24.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.7 && bmi <= 16.3)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        else if(months == 6)
                        {
                            if (bmi > 29.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (bmi <= 29.4 && bmi >= 24.7)
                            {
                                bmi_classification.setText(Sobrepeso);
                            }
                            else if (bmi >= 16.4 && bmi <= 24.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (bmi >= 14.7 && bmi <= 16.3)
                            {
                                bmi_classification.setText(DAM);
                            }
                            else if (bmi < 14.7)
                            {
                                bmi_classification.setText(DAG);
                            }
                        }
                        break;


                    case 18:
                        if (bmi > 29.5)
                        {
                            bmi_classification.setText(Obesidade);
                        }
                        else if (bmi <= 29.5 && bmi >= 24.9)
                        {
                            bmi_classification.setText(Sobrepeso);
                        }
                        else if (bmi >= 16.4 && bmi <= 24.8)
                        {
                            bmi_classification.setText(Normal);
                        }
                        else if (bmi >= 14.7 && bmi <= 16.3)
                        {
                            bmi_classification.setText(DAM);
                        }
                        else if (bmi < 14.7)
                        {
                            bmi_classification.setText(DAG);
                        }
                        break;
                    default:
                        Toast.makeText(this, "PAno ou mês inválido", Toast.LENGTH_SHORT).show();
                }

                bmi_result.setText(formattedBmi);
            }
            //end
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Por favor, preenche os campos vazios", Toast.LENGTH_SHORT).show();
            //return;
        }
    }


    public static int[] monthCalculator(int ano, int mes)
    {   if ((ano >= 5 && ano <= 18) && (mes <=12))
        {
            if (ano == 5 && mes == 0)
            {
                return null;
            }

            else if (ano == 5 && mes <= 2)
            {
                return new int[]{ano, 1};
            }

            else if (mes >= 0 && mes <= 2)
            {
                return new int[]{ano, 0};
            }
            else if (mes >= 3 && mes <= 8)
            {
                return new int[]{ano, 6};
            }
            else if (mes >= 9)
            {
                return new int[]{ano + 1, 0};
            }
        }

        return null;
    }


    public float calculateBMI(float weight, float height)
    {
        if (weight <= 0 || height <= 0)
        {
            return -1;
        }
        else
        {
            return weight / (height * height);

        }
    }

    public int getSelectedGender()
    {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.btn_radio_M)
        {
            return 1;
        } else if (selectedId == R.id.btn_radio_F)
        {
            return 2;
        }
        return -1;
    }

    private EditText input_weight;

    private EditText input_height;
    private EditText input_year;
    private EditText input_month;
    private TextView link_criancas, link_adultos;

    String Obesidade = "Obesidade";
    String Sobrepeso = "Sobrepeso";
    String Normal = "Normal";
    String DAM = "DAM";
    String DAG = "DAG";

    private TextView bmi_classification;
    private TextView bmi_result;

}