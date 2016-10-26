package com.example.yvtc.test2016102602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mylist;
    // /String fruits[] = {"芭樂", "芒果", "荔枝", "甘蔗", "鳳梨"};
    Spinner spinner;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = new ArrayList<>();
        mylist.add("芭樂");
        mylist.add("芒果");
        mylist.add("荔枝");
        spinner = (Spinner) findViewById(R.id.spinner);

        adapter = new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_item,
                        mylist);
        spinner.setAdapter(adapter);
    }
    public void clickAdd(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();
        mylist.add(str);
        adapter.notifyDataSetChanged();
    }
    public void clickDelete(View v)
    {
        mylist.remove(spinner.getSelectedItemPosition());
        adapter.notifyDataSetChanged();
    }
}
