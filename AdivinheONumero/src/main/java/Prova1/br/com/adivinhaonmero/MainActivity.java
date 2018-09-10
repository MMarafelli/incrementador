package Prova1.br.com.adivinhaonmero;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import ifcommunity.br.com.adivinhaonmero.R;

public class MainActivity extends AppCompatActivity {

    private TextView numeroTentativasTextView;
    private Button aumentarButton;
    private Button diminuirButton;
    private Button resetarButton;

    private int numeroTentativas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        aumentarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTentativas++;
                numeroTentativasTextView.setText(Integer.toString(numeroTentativas));
                numeroTentativasTextView.setBackgroundColor(Color.BLUE);
            }
        });

        diminuirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTentativas--;
                numeroTentativasTextView.setText(Integer.toString(numeroTentativas));
                numeroTentativasTextView.setBackgroundColor(Color.RED);
            }
        });

        resetarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTentativas = 0;
                numeroTentativasTextView.setText(Integer.toString(numeroTentativas));
                numeroTentativasTextView.setBackgroundColor(Color.GREEN);
            }
        });
    }

    private void initViews() {
        numeroTentativasTextView = findViewById(R.id.numero_contagem_textview);
        resetarButton = findViewById(R.id.resetar_button);
        aumentarButton = findViewById(R.id.aumentar_button);
        diminuirButton = findViewById(R.id.diminuir_button);
    }
}
