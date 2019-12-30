package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randNum = rand.nextInt(20)+1;
    }
    public void makeToast(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }
    public void startGuess(View view){

        EditText input = (EditText) findViewById(R.id.editText);

        if (randNum>Integer.parseInt(input.getText().toString())){
            makeToast("Lower!");
        }
        else if (randNum<Integer.parseInt(input.getText().toString())){
            makeToast("Higher!");
        }
        else{
            makeToast("Congratulations! Try again");
            Random rand = new Random();
            randNum = rand.nextInt(20)+1;
        }
    }
}
