package com.example.myapplication.Controller.Fragment;

import android.content.Intent;
import android.lib.widget.snackbar.Snackbar;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Controller.Activity.GameSelectPage;
import com.example.myapplication.Enums.GameResult;
import com.example.myapplication.Model.TicTacToe;
import com.example.myapplication.R;

public class TicTacToeFragment extends Fragment {
    public static TicTacToe mTicTacToe = new TicTacToe();
private Button mButtonPos00;
private Button mButtonPos01;
private Button mButtonPos02;
private Button mButtonPos10;
private Button mButtonPos11;
private Button mButtonPos12;
private Button mButtonPos20;
private Button mButtonPos21;
private Button mButtonPos22;
private TextView mGameName;
    public static char mOperator = 'O';

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
        findViews(view);
        setListener();
        return view;
    }

    private void findViews(View view) {
        mGameName = view.findViewById(R.id.Game_name);
        mButtonPos00 = view.findViewById(R.id.pos_0_0);
        mButtonPos01 = view.findViewById(R.id.pos_0_1);
        mButtonPos02 = view.findViewById(R.id.pos_0_2);
        mButtonPos10 = view.findViewById(R.id.pos_1_0);
        mButtonPos11 = view.findViewById(R.id.pos_1_1);
        mButtonPos12 = view.findViewById(R.id.pos_1_2);
        mButtonPos20 = view.findViewById(R.id.pos_2_0);
        mButtonPos21 = view.findViewById(R.id.pos_2_1);
        mButtonPos22 = view.findViewById(R.id.pos_2_2);
    }

    private void setListener() {
        checkGame();
        mButtonPos00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos00, 0, 0);
                mButtonPos00.setEnabled(false);

            }
        });
        checkGame();
        mButtonPos01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos01, 0, 1);
                mButtonPos01.setEnabled(false);

            }
        });
        checkGame();
        mButtonPos02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos02, 0, 2);
                mButtonPos02.setEnabled(false);
            }
        });
        checkGame();
        mButtonPos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos10, 1, 0);
                mButtonPos10.setEnabled(false);
            }
        });
        checkGame();
        mButtonPos11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos11, 1, 1);
                mButtonPos11.setEnabled(false);
            }
        });
        checkGame();
        mButtonPos12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos12, 1, 2);
                mButtonPos12.setEnabled(false);
            }
        });
        checkGame();
        mButtonPos20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos20, 2, 0);
                mButtonPos20.setEnabled(false);
            }
        });
        checkGame();
        mButtonPos21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos21, 2, 1);
                mButtonPos21.setEnabled(false);
            }
        });
        checkGame();
        mButtonPos22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkGame();
                player(mOperator, mButtonPos22, 2, 2);
                mButtonPos22.setEnabled(false);
            }
        });
    }

    private void player(char operator, Button button, int row, int column) {
        if (operator == 'X') {
            button.setText("X");
            gameTicTacToe(operator, row, column);
            mOperator = 'O';
        } else {
            button.setText("O");
            gameTicTacToe(operator, row, column);
            mOperator = 'X';
        }
    }

    private void gameTicTacToe(char operator, int row, int column) {
        mTicTacToe.enterValue(operator, row, column);
    }

    private void checkGame() {
        GameResult gameResult = mTicTacToe.isGameFinished();
        int Counter = 0;
        switch (gameResult) {
            case O_WINS:
                Toast.makeText(getActivity(), "O Win", Toast.LENGTH_SHORT).show();
                finishGame();
                break;
            case X_WINS:
                Snackbar snackbar = Snackbar.with(getActivity());
                snackbar.show();
//                Toast.makeText(getActivity(), "X Win", Toast.LENGTH_SHORT).show();
                finishGame();
                break;
            case DRAW:
                /*Toast.makeText(getActivity(), "Draw", Toast.LENGTH_SHORT).show();
                finishGame();*/
                break;

            default:
                break;
        }
    }

    //finishGameAndBackToSelectGamePage
    private void finishGame() {
        mTicTacToe.empty();
        Intent intent = new Intent(getActivity(), GameSelectPage.class);
        startActivity(intent);
    }
}