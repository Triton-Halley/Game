package com.example.myapplication.Controller.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Controller.Fragment.FourInARowFragment;
import com.example.myapplication.Controller.Fragment.TicTacToeFragment;
import com.example.myapplication.R;

public class GameSelectPage extends AppCompatActivity {
    private Button mTicTacToe ;
    private Button m4inaRow ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViews();
        setOnListener();
    }
    private void findAllViews(){
        mTicTacToe = findViewById(R.id.Tic_Tac_Toe);
        m4inaRow = findViewById(R.id.Four_in_a_Row);
    }
    private void setOnListener(){
        mTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameFragmentTicTacToe();
            }
        });
        m4inaRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameFragment4InaRow();
            }
        });
    }
    private void gameFragmentTicTacToe(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .add(R.id.Container_Fragment, new TicTacToeFragment())
                .commit();
    }
    private void gameFragment4InaRow(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .add(R.id.Container_Fragment, new FourInARowFragment())
                .commit();
    }

}