package com.example.dogu2.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button b1, b2, b3, b4, b5 ,b6 ,b7 ,b8 ,b9 ,b0, btop, bcik, bcarp, bbol, btemizle, besittir;
    TextView giris, cikis;
    String a = "0";
    String islem;
    float sayi1, sayi2, result;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        giris = findViewById(R.id.giris);
        cikis = findViewById(R.id.cikis);


        b1 = findViewById(R.id.buton_bir); 
        b2 = findViewById(R.id.buton_iki);
        b3 = findViewById(R.id.buton_uc);
        b4 = findViewById(R.id.buton_dort);
        b5 = findViewById(R.id.buton_bes);
        b6 = findViewById(R.id.buton_alti);
        b7 = findViewById(R.id.buton_yedi);
        b8 = findViewById(R.id.buton_sekiz);
        b9 = findViewById(R.id.buton_dokuz);
        b0 = findViewById(R.id.buton_sifir);



        btop = findViewById(R.id.buton_topla);
        bcik = findViewById(R.id.buton_cikar);
        bcarp = findViewById(R.id.buton_carpma);
        bbol = findViewById(R.id.buton_bol);

        btemizle = findViewById(R.id.buton_clear);
        besittir = findViewById(R.id.sonuc);



        btemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giris.setText("");
                cikis.setText("");
            }
        });

        besittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(islem.equals("+")) {
                    sayi2 = Float.parseFloat(giris.getText().toString());
                    result = sayi1+sayi2;
                    cikis.setText(Float.toString(result));
                }else if(islem.equals("-")){
                    sayi2 = Float.parseFloat(giris.getText().toString());
                    result = sayi1-sayi2;
                    cikis.setText(Float.toString(result));
                }else if(islem.equals("x")){
                    sayi2 = Float.parseFloat(giris.getText().toString());
                    result = sayi1*sayi2;
                    cikis.setText(Float.toString(result));
                }else if(islem.equals("/")){
                    sayi2 = Float.parseFloat(giris.getText().toString());
                    result = sayi1/sayi2;
                    cikis.setText(Float.toString(result));
                }
            }
        });

        btop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "+";
                sayi1 = Float.parseFloat(giris.getText().toString());
                giris.setText("");

            }
        });

        bcik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "-";
                sayi1 = Float.parseFloat(giris.getText().toString());
                giris.setText("");

            }
        });

        bcarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "x";
                sayi1 = Float.parseFloat(giris.getText().toString());
                giris.setText("");

            }
        });

        bbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islem = "/";
                sayi1 = Float.parseFloat(giris.getText().toString());
                giris.setText("");

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"1";

                giris.setText(a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"2";

                giris.setText(a);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"3";

                giris.setText(a);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"4";

                giris.setText(a);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"5";

                giris.setText(a);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"6";

                giris.setText(a);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"7";

                giris.setText(a);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"8";

                giris.setText(a);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"9";

                giris.setText(a);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=giris.getText().toString();
                a=a+"0";

                giris.setText(a);
            }
        });


    }}
