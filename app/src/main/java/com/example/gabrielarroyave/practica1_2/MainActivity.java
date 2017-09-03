package com.example.gabrielarroyave.practica1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bBoton1, bBoton2, bBoton3, bBoton4;
    private TextView tValor;

    boolean flag = true;

    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bBoton1=(Button)findViewById(R.id.bBoton1);
        bBoton2 = (Button) findViewById(R.id.bBoton2);
        bBoton3 = (Button) findViewById(R.id.bBoton3);
        bBoton4 = (Button) findViewById(R.id.bBoton4);

        tValor = (TextView) findViewById(R.id.tValor);

        bBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {

                    flag = false;
                    bBoton2.setVisibility(view.VISIBLE);
                    bBoton3.setVisibility(view.VISIBLE);
                    bBoton4.setVisibility(view.VISIBLE);
                }

                contador1++;
                if (contador1 > 9) {
                    contador1 = 0;
                }
                switch (contador1) {

                    case 0:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.black));
                        break;
                    case 1:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.red));
                        break;
                    case 3:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.orangered));
                        break;
                    case 4:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.green));
                        break;
                    case 6:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.violet));
                        break;
                    case 8:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        bBoton1.setBackgroundColor(bBoton1.getContext().getResources().getColor(R.color.white));
                        break;
                }

                calcular();
            }
        });

        bBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                if (contador2 > 9) {
                    contador2 = 0;
                }
                switch (contador2) {
                    case 0:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.black));
                        break;
                    case 1:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.red));
                        break;
                    case 3:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.orangered));
                        break;
                    case 4:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.green));
                        break;
                    case 6:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.violet));
                        break;
                    case 8:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        bBoton2.setBackgroundColor(bBoton2.getContext().getResources().getColor(R.color.white));
                        break;
                }
                calcular();
            }

        });

        bBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                if (contador3 > 9) {
                    contador3 = 0;
                }
                switch (contador3) {
                    case 0:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.black));
                        break;
                    case 1:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 2:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.red));
                        break;
                    case 3:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.orangered));
                        break;
                    case 4:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.yellow));
                        break;
                    case 5:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.green));
                        break;
                    case 6:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.blue));
                        break;
                    case 7:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.violet));
                        break;
                    case 8:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.gray));
                        break;
                    case 9:
                        bBoton3.setBackgroundColor(bBoton3.getContext().getResources().getColor(R.color.white));
                        break;
                }
                calcular();
            }

        });

        bBoton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                if (contador4 > 3) {
                    contador4 = 0;
                }
                switch (contador4) {
                    case 0:
                        bBoton4.setBackgroundColor(bBoton4.getContext().getResources().getColor(R.color.brown));
                        break;
                    case 1:
                        bBoton4.setBackgroundColor(bBoton4.getContext().getResources().getColor(R.color.red));
                        break;

                    case 2:
                        bBoton4.setBackgroundColor(bBoton4.getContext().getResources().getColor(R.color.darkkhaki));
                        break;
                    case 3:
                        bBoton4.setBackgroundColor(bBoton4.getContext().getResources().getColor(R.color.silver));
                        break;
                }
                calcular();
            }
        });
    }

    void calcular() {
        String valor = String.valueOf(contador1) + String.valueOf(contador2);
        double multiplicador = Math.pow(10, contador3);
        double numero = Double.parseDouble(valor) * multiplicador;
        String salida;

        if (contador4 == 0) {
            salida = "+/- 1%";
        }else if (contador4==1){
            salida = "+/- 2%";}
        else if (contador4==2){
            salida = "+/- 5%";
        }
        else {
            salida = "+/- 10%Ω";
        }
        valor = String.valueOf(numero)+" Ohmnios " + salida;
        tValor.setText(valor);
    }
}