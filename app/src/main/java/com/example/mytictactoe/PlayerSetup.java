package com.example.mytictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);

        player1 = findViewById(R.id.editTextTextPersonName);
        player2 = findViewById(R.id.editTextTextPersonName2);

    }

    public void submitButtonClick(View view){
        String editTextTextPersonName = player1.getText().toString();
        String editTextTextPersonName2 = player2.getText().toString();

        Intent intent = new Intent(this,gameDisplay.class);
        intent.putExtra("PLAYER_NAME",new String[] {
                editTextTextPersonName,editTextTextPersonName2
        });
        startActivity(intent);

    }
}