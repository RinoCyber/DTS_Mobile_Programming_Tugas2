package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Hint1,Hint2;
    Button btnTambah,btnKurang,btnKali,btnBagi,btnBersih;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hint1 = findViewById(R.id.Hint1);
        Hint2 = findViewById(R.id.Hint2);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnBersih = findViewById(R.id.btnBersih);
        txtHasil = findViewById(R.id.txtHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Hint1.getText().length()>0) && (Hint2.getText().length()>0)){
                    double angka1 = Double.parseDouble(Hint1.getText().toString());
                    double angka2 = Double.parseDouble(Hint2.getText().toString());
                    double hasil = angka1 + angka2;
                    txtHasil.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Hint1.getText().length()>0) && (Hint2.getText().length()>0)){
                    double angka1 = Double.parseDouble(Hint1.getText().toString());
                    double angka2 = Double.parseDouble(Hint2.getText().toString());
                    double hasil = angka1 - angka2;
                    txtHasil.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Hint1.getText().length()>0) && (Hint2.getText().length()>0)){
                    double angka1 = Double.parseDouble(Hint1.getText().toString());
                    double angka2 = Double.parseDouble(Hint2.getText().toString());
                    double hasil = angka1 * angka2;
                    txtHasil.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Hint1.getText().length()>0) && (Hint2.getText().length()>0)){
                    double angka1 = Double.parseDouble(Hint1.getText().toString());
                    double angka2 = Double.parseDouble(Hint2.getText().toString());
                    double hasil = angka1 / angka2;
                    txtHasil.setText(Double.toString(hasil));
                }
                else{
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon Masukkan Angka Pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnBersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hint1.setText("");
                Hint2.setText("");
                txtHasil.setText("");
                Hint1.requestFocus();
            }
        });
    }
}