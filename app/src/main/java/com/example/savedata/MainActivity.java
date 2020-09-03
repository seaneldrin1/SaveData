package com.example.savedata;

import android.app.Person;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    EditText etName, etSurname;
    TextView tvResult;
    ArrayList<Person> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etSurname= findViewById(R.id.etSurname);
        tvResult= findViewById(R.id.tvResult);
        persons = new ArrayList<Person>();


    }
    public void btnAddDta(View v){

    }
    public void btnSaveData(View v){

    }
}