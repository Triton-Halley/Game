package com.example.myapplication.Controller.Fragment;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class FourInARowFragment extends Fragment {
    private Button mFButtonPos00;
    private Button mFButtonPos01;
    private Button mFButtonPos02;
    private Button mFButtonPos03;
    private Button mFButtonPos04;
    private Button mFButtonPos10;
    private Button mFButtonPos11;
    private Button mFButtonPos12;
    private Button mFButtonPos13;
    private Button mFButtonPos14;
    private Button mFButtonPos20;
    private Button mFButtonPos21;
    private Button mFButtonPos22;
    private Button mFButtonPos23;
    private Button mFButtonPos24;
    private Button mFButtonPos30;
    private Button mFButtonPos31;
    private Button mFButtonPos32;
    private Button mFButtonPos33;
    private Button mFButtonPos34;
    private Button mFButtonPos40;
    private Button mFButtonPos41;
    private Button mFButtonPos42;
    private Button mFButtonPos43;
    private Button mFButtonPos44;
    private TextView mFGameName;
    private String mFOperator="Red";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four_in_a_row, container, false);
        findViews(view);
        buttonListener();
        return view ;
    }
    private void findViews(View view) {
        mFGameName = view.findViewById(R.id.FGame_name);
        mFButtonPos00 = view.findViewById(R.id.Fpos_0_0);
        mFButtonPos01 = view.findViewById(R.id.Fpos_0_1);
        mFButtonPos02 = view.findViewById(R.id.Fpos_0_2);
        mFButtonPos03 = view.findViewById(R.id.Fpos_0_3);
        mFButtonPos04 = view.findViewById(R.id.Fpos_0_4);
        mFButtonPos10 = view.findViewById(R.id.Fpos_1_0);
        mFButtonPos11 = view.findViewById(R.id.Fpos_1_1);
        mFButtonPos12 = view.findViewById(R.id.Fpos_1_2);
        mFButtonPos13 = view.findViewById(R.id.Fpos_1_3);
        mFButtonPos14 = view.findViewById(R.id.Fpos_1_4);
        mFButtonPos20 = view.findViewById(R.id.Fpos_2_0);
        mFButtonPos21 = view.findViewById(R.id.Fpos_2_1);
        mFButtonPos22 = view.findViewById(R.id.Fpos_2_2);
        mFButtonPos23 = view.findViewById(R.id.Fpos_2_3);
        mFButtonPos24 = view.findViewById(R.id.Fpos_2_4);
        mFButtonPos30 = view.findViewById(R.id.Fpos_3_0);
        mFButtonPos31 = view.findViewById(R.id.Fpos_3_1);
        mFButtonPos32 = view.findViewById(R.id.Fpos_3_2);
        mFButtonPos33 = view.findViewById(R.id.Fpos_3_3);
        mFButtonPos34 = view.findViewById(R.id.Fpos_3_4);
        mFButtonPos40 = view.findViewById(R.id.Fpos_4_0);
        mFButtonPos41 = view.findViewById(R.id.Fpos_4_1);
        mFButtonPos42 = view.findViewById(R.id.Fpos_4_2);
        mFButtonPos43 = view.findViewById(R.id.Fpos_4_3);
        mFButtonPos44 = view.findViewById(R.id.Fpos_4_4);
    }
    private void buttonListener(){
        mFButtonPos00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fPlayer(mFOperator,mFButtonPos00,0,0);
            }
        });
        mFButtonPos01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fPlayer(mFOperator,mFButtonPos01,0,1);
            }
        });
        mFButtonPos02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mFButtonPos44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    private void  fPlayer(String operator , Button button , int Row , int Columns){
        if (operator.equalsIgnoreCase("Red")){
            button.setBackgroundColor(Color.RED);
            mFOperator="Blue";
        }else {
            button.setBackgroundColor(Color.BLUE);
            mFOperator="Red";
        }
    }
}