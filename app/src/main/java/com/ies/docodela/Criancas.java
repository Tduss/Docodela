package com.ies.docodela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Criancas extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criancas);
        initialization();


        link_adolescentes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Criancas.this,boysAdolescentes.class);
                startActivity(intent);
            }
        });

        link_adultos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Criancas.this, MainActivity.class);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, boysAdolescentes.class));
            }
        });
    }

    public void initialization()
    {
        input_weight = findViewById(R.id.input_weight_criancas);
        input_year = findViewById(R.id.input_year_criancas);
        input_month = findViewById(R.id.input_month_criancas);
        bmi_classification = findViewById(R.id.resultado_nominal_criancas);
        link_adolescentes = findViewById(R.id.link_AD_Adolescentes);
        link_adultos = findViewById(R.id.link_adultos);
    }


    public void btn_calcular_criancas(View view)
    {
        float weight_in;
        int years, months;
        try
        {
            weight_in = Float.parseFloat(input_weight.getText().toString());
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


            float weight = validadeWeigth(weight_in);
            if (weight == -1)
            {
                Toast.makeText(this, "Peso inapropriado", Toast.LENGTH_SHORT).show();
                return;
            }

            String formattedBmi = String.format("%.1f", weight);



            if (radioSelected == 1)
            {
                switch (month)
                {
                    case 0:
                        if(year == 0)
                        {
                            if (weight > 4.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 4.4 && weight >= 2.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 2.1 && weight <= 2.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight <2.1 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.0 && weight >= 7.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.9 && weight <= 7.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.9 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 15.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 15.3 && weight >= 9.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.6 && weight <= 9.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.6 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 18.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.3 && weight >= 11.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.0 && weight <= 11.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.0 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 21.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.2 && weight >= 12.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.2 && weight <= 12.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.2 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 5)
                        {
                            if (weight > 24.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 24.2 && weight >= 14.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.4 && weight <= 14.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.4 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 1:
                        if(year == 0)
                        {
                            if (weight > 5.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 5.8 && weight >= 3.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 2.9 && weight <= 3.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight <2.9 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.3 && weight >= 7.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.8 && weight <= 7.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.1 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 15.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 15.5 && weight >= 9.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.8 && weight <= 9.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.8 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 18.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.6 && weight >= 11.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.1 && weight <= 11.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.1 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 21.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.4 && weight >= 12.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.3 && weight <= 12.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.3 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 2:
                        if(year == 0)
                        {
                            if (weight > 7.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 7.1 && weight >= 4.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 3.8 && weight <= 4.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 3.8 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.6 && weight >= 8.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.2 && weight <= 8.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.2 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 15.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 15.8 && weight >= 10.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.9 && weight <= 9.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.9 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 18.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.8 && weight >= 11.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.2 && weight <= 11.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.2 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 21.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.7 && weight >= 12.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.4 && weight <= 12.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.4 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 3:
                        if(year == 0)
                        {
                            if (weight > 8.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 8.0 && weight >= 5.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 4.4 && weight <= 4.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 4.4 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.8 && weight >= 8.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.4 && weight <= 8.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.4 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.1 && weight >= 10.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.0 && weight <= 10.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.0 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.0 && weight >= 11.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.3 && weight <= 11.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.3 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 21.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.9 && weight >= 13.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.5 && weight <= 13.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.5 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 4:
                        if(year == 0)
                        {
                            if (weight > 8.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 8.7 && weight >= 5.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 4.9 && weight <= 5.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 4.9 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.1 && weight >= 8.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.5 && weight <= 8.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.5 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.3 && weight >= 10.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.1 && weight <= 10.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.1 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.3 && weight >= 11.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.4 && weight <= 11.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.4 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.2 && weight >= 13.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.6 && weight <= 13.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.6 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 5:
                        if(year == 0)
                        {
                            if (weight > 9.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 9.3 && weight >= 6.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.3 && weight <= 5.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 4.3 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.4 && weight >= 8.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.7 && weight <= 8.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.7 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.6 && weight >= 10.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.2 && weight <= 10.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.2 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.5 && weight >= 11.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.5 && weight <= 11.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.5 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.4 && weight >= 13.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.7 && weight <= 13.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.7 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 6:
                        if(year == 0)
                        {
                            if (weight > 9.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 9.8 && weight >= 6.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.7 && weight <= 6.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.7 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.7 && weight >= 8.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.8 && weight <= 8.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.8 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.9 && weight >= 10.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.4 && weight <= 10.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.4 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.7 && weight >= 12.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.6 && weight <= 11.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.7 && weight >= 13.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.8 && weight <= 13.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.8 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 7:
                        if(year == 0)
                        {
                            if (weight > 10.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 10.3 && weight >= 6.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.9 && weight <= 6.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.9 )
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.9 && weight >= 8.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.0 && weight <= 8.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.0 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.1 && weight >= 10.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.5 && weight <= 10.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.5)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.0 && weight >= 12.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.7 && weight <= 12.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.7)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.9 && weight >= 13.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.9 && weight <= 13.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.9 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 8:
                        if(year == 0)
                        {
                            if (weight > 10.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 10.7 && weight >= 6.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.2 && weight <= 6.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.2)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 14.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.2 && weight >= 9.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.1 && weight <= 9.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.4 && weight >= 10.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.6 && weight <= 10.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.2 && weight >= 12.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.8 && weight <= 12.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.8)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.2 && weight >= 13.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.0 && weight <= 13.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.0)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 9:
                        if(year == 0)
                        {
                            if (weight > 11.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 11.0 && weight >= 7.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.4 && weight <= 7.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.4)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 14.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.5 && weight >= 9.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.2 && weight <= 9.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.2)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.6 && weight >= 10.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.6 && weight <= 10.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.7)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.5 && weight >= 12.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.9 && weight <= 12.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.4 && weight >= 13.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.1 && weight <= 13.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 10:
                        if(year == 0)
                        {
                            if (weight > 11.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 11.4 && weight >= 7.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.6 && weight <= 7.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.6)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 14.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.7 && weight >= 9.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.4 && weight <= 9.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.4)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.8 && weight >= 11.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.8 && weight <= 10.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.8)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.7 && weight >= 12.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.0 && weight <= 12.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.0)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.7 && weight >= 13.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.2 && weight <= 13.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.2)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 11:
                        if(year == 0)
                        {
                            if (weight > 11.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 11.7 && weight >= 7.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.8 && weight <= 7.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.8)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 15.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 15.0 && weight >= 9.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.5 && weight <= 9.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.5)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 18.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.1 && weight >= 11.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.9 && weight <= 11.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.9 && weight >= 12.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.1 && weight <= 12.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.9 && weight >= 14.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.3 && weight <= 13.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.3)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;

                    default:
                        Toast.makeText(this, "Ano ou mês inválido", Toast.LENGTH_SHORT).show();
                }

               // bmi_result.setText(formattedBmi);
            }

            //Begining
            else if (radioSelected == 2)
            {
                switch (month)
                {
                    case 0:
                        if(year == 0)
                        {
                            if (weight > 4.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 4.2 && weight >= 2.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 2.0 && weight <= 2.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 2.0)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 11.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 11.5 && weight >= 7.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.3 && weight <= 6.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.3)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 14.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.8 && weight >= 9.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.1 && weight <= 8.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 18.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.1 && weight >= 10.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.6 && weight <= 10.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 21.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.5 && weight >= 12.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.9 && weight <= 12.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 5)
                        {
                            if (weight > 24.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 24.9 && weight >= 13.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.1 && weight <= 13.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 1:
                        if(year == 0)
                        {
                            if (weight > 5.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 5.5 && weight >= 3.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 2.7 && weight <= 3.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight <2.7)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 11.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 11.8 && weight >= 7.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.4 && weight <= 7.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.4)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 15.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 9.2 && weight >= 15.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.2 && weight <= 9.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.2)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 18.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.4 && weight >= 10.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.7 && weight <= 10.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.7)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 21.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.8 && weight >= 12.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.0 && weight <= 12.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.0)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 2:
                        if(year == 0)
                        {
                            if (weight > 6.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 6.6 && weight >= 3.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 3.4 && weight <= 3.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 3.4)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.1 && weight >= 7.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.6 && weight <= 7.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 15.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 15.4 && weight >= 9.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.4 && weight <= 9.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.4)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 18.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 18.7 && weight >= 11.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.8 && weight <= 11.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.8)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.1 && weight >= 12.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.1 && weight <= 12.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 3:
                        if(year == 0)
                        {
                            if (weight > 7.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 7.5 && weight >= 4.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 4.0 && weight <= 4.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 4.0)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.4 && weight >= 7.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.7 && weight <= 7.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.7)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 15.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 15.7 && weight >= 9.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.5 && weight <= 9.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.5)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.0 && weight >= 11.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.9 && weight <= 11.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.4 && weight >= 12.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.2 && weight <= 12.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.2)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 4:
                        if(year == 0)
                        {
                            if (weight > 8.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 8.2 && weight >= 5.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 4.4 && weight <= 4.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 4.4)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.6 && weight >= 7.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.9 && weight <= 7.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.0 && weight >= 9.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.6 && weight <= 9.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.2 && weight >= 11.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.1 && weight <= 11.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.6 && weight >= 12.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.3 && weight <= 12.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.3)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 5:
                        if(year == 0)
                        {
                            if (weight > 8.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 8.8 && weight >= 5.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 4.8 && weight <= 5.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 4.8)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 12.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 12.9 && weight >= 7.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.0 && weight <= 7.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.0)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.2 && weight >= 9.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.8 && weight <= 9.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.8 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.5 && weight >= 11.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.2 && weight <= 11.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.2)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 22.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 22.9 && weight >= 12.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.4 && weight <= 12.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.4 )
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 6:
                        if(year == 0)
                        {
                            if (weight > 9.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 9.3 && weight >= 5.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.1 && weight <= 5.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.1)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.2 && weight >= 8.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.2 && weight <= 8.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.2)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.5 && weight >= 10.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 8.9 && weight <= 9.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 8.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 19.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 19.8 && weight >= 11.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.3 && weight <= 11.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.3)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.2 && weight >= 13.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.5 && weight <= 12.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.4)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 7:
                        if(year == 0)
                        {
                            if (weight > 9.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 9.8 && weight >= 6.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.3 && weight <= 5.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.3)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.5 && weight >= 8.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.3 && weight <= 8.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.3)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 16.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 16.8 && weight >= 10.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.0 && weight <= 10.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.0)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.1 && weight >= 11.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.4 && weight <= 11.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.4)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.5 && weight >= 13.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.6 && weight <= 13.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 8:
                        if(year == 0)
                        {
                            if (weight > 10.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 10.2 && weight >= 6.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.6 && weight <= 6.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.6)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 13.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 13.7 && weight >= 8.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.5 && weight <= 8.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.5)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.1 && weight >= 10.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.1 && weight <= 10.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.1)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.4 && weight >= 11.8)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.5 && weight <= 11.7)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.5)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 23.8)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 23.8 && weight >= 13.3)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.7 && weight <= 13.2)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.7)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 9:
                        if(year == 0)
                        {
                            if (weight > 10.5)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 10.5 && weight >= 6.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.8 && weight <= 6.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.8)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 14.0)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.0 && weight >= 8.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.6 && weight <= 8.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.3 && weight >= 10.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.3 && weight <= 10.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.3)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.7)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.7 && weight >= 12.0)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.6 && weight <= 11.9)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.6)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 24.1)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 24.1 && weight >= 13.4)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.8 && weight <= 13.3)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.8)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 10:
                        if(year == 0)
                        {
                            if (weight > 10.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 10.9 && weight >= 6.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 5.9 && weight <= 6.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 5.9)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 14.3)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.3 && weight >= 8.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.8 && weight <= 8.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.8)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.6 && weight >= 10.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.4 && weight <= 10.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.4)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 20.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 20.9 && weight >= 12.1)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.7 && weight <= 12.0)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.7)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 24.4)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 24.4 && weight >= 13.5)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 11.9 && weight <= 13.4)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 11.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;


                    case 11:
                        if(year == 0)
                        {
                            if (weight > 11.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 11.2 && weight >= 6.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 6.1 && weight <= 6.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 6.1)
                            {
                                bmi_classification.setText(BPG);
                            }

                        }
                        else if(year == 1)
                        {
                            if (weight > 14.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 14.6 && weight >= 8.9)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 7.9 && weight <= 8.8)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 7.9)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        else if(year == 2)
                        {
                            if (weight > 17.9)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 17.9 && weight >= 10.7)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 9.5 && weight <= 10.6)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 9.5)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }

                        else if(year == 3)
                        {
                            if (weight > 21.2)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 21.2 && weight >= 12.2)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 10.8 && weight <= 12.1)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 10.8)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }


                        else if(year == 4)
                        {
                            if (weight > 24.6)
                            {
                                bmi_classification.setText(Obesidade);
                            }
                            else if (weight <= 24.6 && weight >= 13.6)
                            {
                                bmi_classification.setText(Normal);
                            }
                            else if (weight >= 12.0 && weight <= 13.5)
                            {
                                bmi_classification.setText(BPM);
                            }
                            else if (weight < 12.0)
                            {
                                bmi_classification.setText(BPG);
                            }
                        }
                        break;
                    default:
                        Toast.makeText(this, "Ano ou mês inválido", Toast.LENGTH_SHORT).show();
                }

               // bmi_result.setText(formattedBmi);
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
    {   if (ano <= 5 && mes <=12)
    {

        return new int[]{ano, mes};
    }
    return  null;
    }


    public float validadeWeigth(float weight)
    {
        if (weight <= 0)
        {
            return -1;
        }
        else
        {
            return weight;

        }
    }

    public int getSelectedGender()
    {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.btn_radio_M_criancas)
        {
            return 1;
        } else if (selectedId == R.id.btn_radio_F_criancas)
        {
            return 2;
        }
        return -1;
    }

    private EditText input_weight;

    private EditText input_year;
    private EditText input_month;
    private TextView link_adolescentes, link_adultos;


    String Obesidade = "Obesidade";
    String Normal = "Normal";
    String BPM = "BPM";
    String BPG = "BPG";

    private TextView bmi_classification;
}