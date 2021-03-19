package com.pharos.android3lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.pharos.android3lesson6.databinding.ActivityMainBinding;
import com.pharos.android3lesson6.domain.Math;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        math = new Math();

        ui.btnAdd.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int oper2 = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.add(oper1,oper2)));
        });
        ui.btnSub.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int oper2 = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.sub(oper1,oper2)));
        });
        ui.btnMul.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int oper2 = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.mul(oper1,oper2)));
        });
        ui.btnDiv.setOnClickListener(v -> {
            int oper1 = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int oper2 = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.div(oper1,oper2)));
        });
        ui.btnReverse.setOnClickListener(v -> {
            String oper1 = ui.etOperatorOne.getText().toString();
            ui.tvResult.setText(String.valueOf(math.reverseWords(oper1)));
        });
    }
}