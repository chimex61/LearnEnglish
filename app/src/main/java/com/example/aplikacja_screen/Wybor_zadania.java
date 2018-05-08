package com.example.aplikacja_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.m.aplikacja_screen.R;

public class Wybor_zadania extends AppCompatActivity {

    RadioButton dopasowanie, wybór, łączenie, plansza_kwadratowa, tłumaczenie, uzupełnianie;
    Button rozpocznij_lekcję;
    String tekst;
    TextView multiLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wybor_zadania);


        dopasowanie = (RadioButton) findViewById(R.id.dopasowanie);
        wybór = (RadioButton) findViewById(R.id.wybór);
        łączenie = (RadioButton) findViewById(R.id.łączenie);
        plansza_kwadratowa = (RadioButton) findViewById(R.id.plansza_kwadratowa);
        tłumaczenie = (RadioButton) findViewById(R.id.tłumaczenie);
        uzupełnianie = (RadioButton) findViewById(R.id.uzupełnianie);
        rozpocznij_lekcję = (Button) findViewById(R.id.lekcja);
        multiLine=(TextView)findViewById(R.id.multiLine);

        dopasowanie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(dopasowanie.isChecked()){
                    multiLine.setVisibility(View.VISIBLE);
                    multiLine.setText("\tDopasowanie\n\tZadanie polega na dopasowaniu obrazka do jego jego znaczenia w języku angielskim.");
                }
            }
        });
        wybór.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(wybór.isChecked()){
                    multiLine.setVisibility(View.VISIBLE);
                    multiLine.setText("\tWybór\n\tZadanie polega na wybraniu słowa,\nktóre nie pasuje do pozostałych słów.");
                }
            }
        });
        łączenie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(łączenie.isChecked()){
                    multiLine.setVisibility(View.VISIBLE);
                    multiLine.setText("\tŁączenie\n\tZadanie polega na  połączeniu słowa\nw języku polskim wraz z jego\nodpowiednikiem w języku angielskim.");
                }
            }
        });
        tłumaczenie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(tłumaczenie.isChecked()){
                    multiLine.setVisibility(View.VISIBLE);
                    multiLine.setText("\tTłumaczenie\n\tZadanie polega na przetłumaczeniu słowa\nnapisanego w języku polskim na jego\nodpowiednik w języku angielskim i na odwrót.");
                }
            }
        });

        plansza_kwadratowa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(plansza_kwadratowa.isChecked()){
                    multiLine.setVisibility(View.VISIBLE);
                    multiLine.setText("\tZadanie polega na znalezieniu\nodpowiednich słów.");
                }
            }
        });
        uzupełnianie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(uzupełnianie.isChecked()){
                    multiLine.setVisibility(View.VISIBLE);
                    multiLine.setText("\tUzupełnianie\n\tZadanie polega na uzupełnieniu brakujących liter w słowie.");
                }
            }
        });


        rozpocznij_lekcję.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dopasowanie.isChecked()) {
                    tekst = dopasowanie.getText().toString();
                    //start activity
                    startActivity(new Intent(Wybor_zadania.this,Dopasowanie.class));
                } else if (wybór.isChecked()) {
                    tekst = wybór.getText().toString();
                    startActivity(new Intent(Wybor_zadania.this,Wybor.class));
                } else if (łączenie.isChecked()) {
                    tekst = łączenie.getText().toString();
                    startActivity(new Intent(Wybor_zadania.this,Laczenie.class));
                } else if (plansza_kwadratowa.isChecked()) {
                    tekst = plansza_kwadratowa.getText().toString();
                    startActivity(new Intent(Wybor_zadania.this,PlanszaKwadratowa.class));
                } else if (tłumaczenie.isChecked()) {
                    tekst = tłumaczenie.getText().toString();
                    startActivity(new Intent(Wybor_zadania.this,Tlumaczenie.class));
                } else if (uzupełnianie.isChecked()) {
                    tekst = uzupełnianie.getText().toString();
                    startActivity(new Intent(Wybor_zadania.this,Uzupelnianie.class));
                }
                Toast.makeText(getApplicationContext(), "Wybrano " + tekst, Toast.LENGTH_LONG).show();
            }
        });
    }
}
