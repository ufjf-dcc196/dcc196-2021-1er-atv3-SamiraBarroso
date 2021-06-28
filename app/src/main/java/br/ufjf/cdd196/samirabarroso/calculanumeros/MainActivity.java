package br.ufjf.cdd196.samirabarroso.calculanumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private TextView textViewResultado;
    private Button buttonSoma;
    private Button buttonSub;
    private Button buttonMult;
    private Button buttonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMult = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDiv);

        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x;
                Double y;
                Double resultado = 0.0;

                try {
                    x = Double.parseDouble(editTextNumero1.getText().toString());
                    y = Double.parseDouble(editTextNumero2.getText().toString());
                    resultado = x + y;

                }catch (Exception e){

                }
                textViewResultado.setText(String.valueOf(resultado));
                editTextNumero1.setText("");
                editTextNumero2.setText("");

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x ;
                Double y ;
                Double resultado = 0.0;

                try {
                    x = Double.parseDouble(editTextNumero1.getText().toString());
                    y = Double.parseDouble(editTextNumero2.getText().toString());
                    resultado = x - y;

                }catch (Exception e){

                }
                textViewResultado.setText(String.valueOf(resultado));
                editTextNumero1.setText("");
                editTextNumero2.setText("");
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x ;
                Double y ;
                Double resultado = 0.0;

                try {
                    x = Double.parseDouble(editTextNumero1.getText().toString());
                    y = Double.parseDouble(editTextNumero2.getText().toString());
                    resultado = x * y;

                }catch (Exception e){

                }
                textViewResultado.setText(String.valueOf(resultado));
                editTextNumero1.setText("");
                editTextNumero2.setText("");
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double x ;
                Double y ;
                Double resultado = 0.0;

                try {
                    x = Double.parseDouble(editTextNumero1.getText().toString());
                    y = Double.parseDouble(editTextNumero2.getText().toString());

                    if(y == 0 ){
                        throw new Exception("Nao é permitido fazer uma divisão por zero!");
                    }

                    resultado = x / y;
                    textViewResultado.setText(String.valueOf(resultado));

                }catch (Exception e){
                    textViewResultado.setText(e.getMessage());
                }

               // textViewResultado.setText(Integer.toString(resultado));
                editTextNumero1.setText("");
                editTextNumero2.setText("");

            }
        });

    }


}