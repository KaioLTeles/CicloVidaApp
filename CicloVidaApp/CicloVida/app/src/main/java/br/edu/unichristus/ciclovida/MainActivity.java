package br.edu.unichristus.ciclovida;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String CATEGORIA ="CicloVida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(CATEGORIA, getLocalClassName() + ".onCreate()----->Criado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(CATEGORIA, getLocalClassName() + ".onDestroy()----->Destruido");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(CATEGORIA, getLocalClassName() + ".onPause()----->Pausado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(CATEGORIA, getLocalClassName() + ".onRestart()----->Iniciado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(CATEGORIA, getLocalClassName() + ".onResume()----->Minimizado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(CATEGORIA, getLocalClassName() + ".onStart()----->Startado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(CATEGORIA, getLocalClassName() + ".onStop()----->Parado");
    }

    private String getClassName(){
        return MainActivity.class.getName();
    }
}
