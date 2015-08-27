package com.example.docente05.example02;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText EdtNum1;
    private EditText EdtNum2;
    private Button BtnMas;
    private Button BtnMenos;
    private Button BtnMult;
    private Button BtnDiv;
    private int valor=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdtNum1 = (EditText) findViewById(R.id.EdtNum1);
        EdtNum2 = (EditText) findViewById(R.id.EdtNum2);
        BtnMas = (Button) findViewById(R.id.BtnMas);
        BtnMenos = (Button) findViewById(R.id.BtnMenos);
        BtnMult= (Button) findViewById(R.id.BtnMult);
        BtnDiv = (Button) findViewById(R.id.BtnDiv);
        BtnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = Integer.parseInt(EdtNum1.getText().toString())+ Integer.parseInt(EdtNum2.getText().toString());
                Toast.makeText(getApplicationContext(), "suma = "+valor,Toast.LENGTH_SHORT).show();

            }
        });
        BtnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = Integer.parseInt(EdtNum1.getText().toString())- Integer.parseInt(EdtNum2.getText().toString());
                Toast.makeText(getApplicationContext(), "Resta = "+valor,Toast.LENGTH_SHORT).show();

            }
        });
        BtnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor = Integer.parseInt(EdtNum1.getText().toString())* Integer.parseInt(EdtNum2.getText().toString());
                Toast.makeText(getApplicationContext(), "Multiplicación = "+valor,Toast.LENGTH_SHORT).show();

            }
        });
        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(EdtNum2.getText().toString())!=0) {
                    valor = Integer.parseInt(EdtNum1.getText().toString()) / Integer.parseInt(EdtNum2.getText().toString());
                }else{

                    valor=0;
                }
                Toast.makeText(getApplicationContext(), "Div = "+valor,Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.hh){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
