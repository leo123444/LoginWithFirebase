package com.example.aula.loginwithfirebase.vista;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//implementing

public class VistaLogin extends AppCompatActivity implements IVistaLogin{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //trying to correct te R error
      //  setContentView(R.layout.activity_login);
    }
}
