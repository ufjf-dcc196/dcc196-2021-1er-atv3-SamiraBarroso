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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonSoma = findViewById(R.id.buttonSoma);

        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = 0;
                int y = 0;
                int resultado = 0;

                try {
                    x = Integer.parseInt(editTextNumero1.getText().toString());
                    y = Integer.parseInt(editTextNumero2.getText().toString());
                    resultado = x + y;

                }catch (Exception e){

                }
                textViewResultado.setText(Integer.toString(resultado));
                editTextNumero1.setText("");
                editTextNumero2.setText("");
            }
        });

    }


}