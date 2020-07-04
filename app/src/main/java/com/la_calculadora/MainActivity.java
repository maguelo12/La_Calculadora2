package com.la_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button suma;
    Button rest;
    Button divid;
    Button multiplica;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1= (EditText)findViewById(R.id.numero1);
        num2= (EditText)findViewById(R.id.numero2);

        resultado=(TextView)findViewById(R.id.resultado);

        suma=(Button)findViewById(R.id.btnSuma);
        rest=(Button)findViewById(R.id.restar);
        divid=(Button)(findViewById(R.id.dividir)) ;
        multiplica=(Button)(findViewById(R.id.multiplicar));

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numero1= Double.parseDouble(num1.getText().toString());
                double numero2= Double.parseDouble(num2.getText().toString());

                double sumatoria= numero1 + numero2;

                resultado.setText(Double.toString(sumatoria));

            }
        });

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numero1= Double.parseDouble(num1.getText().toString());
                double numero2= Double.parseDouble(num2.getText().toString());

                double sumatoria= numero1 - numero2;

                resultado.setText(Double.toString(sumatoria));

            }
        });

        divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numero1= Double.parseDouble(num1.getText().toString());
                double numero2= Double.parseDouble(num2.getText().toString());

                double sumatoria= numero1 / numero2;

                resultado.setText(Double.toString(sumatoria));

            }
        });

        multiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double numero1= Double.parseDouble(num1.getText().toString());
                double numero2= Double.parseDouble(num2.getText().toString());

                double sumatoria= numero1 * numero2;

                resultado.setText(Double.toString(sumatoria));

            }
        });

    }
}