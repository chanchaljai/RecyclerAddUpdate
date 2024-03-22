package com.example.reclearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    recyclerContactAdapter adapter;
    ArrayList<contactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new contactModel(R.drawable.a,"A","9999999999"));
        arrContacts.add(new contactModel(R.drawable.b,"B","9999999999"));
        arrContacts.add(new contactModel(R.drawable.c,"C","9999999999"));
        arrContacts.add(new contactModel(R.drawable.a,"A","9999999999"));
        arrContacts.add(new contactModel(R.drawable.b,"B","9999999999"));
        arrContacts.add(new contactModel(R.drawable.c,"C","9999999999"));
        arrContacts.add(new contactModel(R.drawable.a,"A","9999999999"));
        arrContacts.add(new contactModel(R.drawable.b,"B","9999999999"));
        arrContacts.add(new contactModel(R.drawable.c,"C","9999999999"));
        arrContacts.add(new contactModel(R.drawable.a,"A","9999999999"));
        arrContacts.add(new contactModel(R.drawable.b,"B","9999999999"));
        arrContacts.add(new contactModel(R.drawable.c,"C","9999999999"));
        arrContacts.add(new contactModel(R.drawable.a,"A","9999999999"));
        arrContacts.add(new contactModel(R.drawable.b,"B","9999999999"));
        arrContacts.add(new contactModel(R.drawable.c,"C","9999999999"));
        arrContacts.add(new contactModel(R.drawable.a,"A","9999999999"));
        arrContacts.add(new contactModel(R.drawable.b,"B","9999999999"));
        arrContacts.add(new contactModel(R.drawable.c,"C","9999999999"));

        recyclerContactAdapter adapter = new recyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}