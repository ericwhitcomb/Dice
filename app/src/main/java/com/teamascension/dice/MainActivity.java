package com.teamascension.dice;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonD2;
    Button buttonD4;
    Button buttonD6;
    Button buttonD8;
    Button buttonD10;
    Button buttonD12;
    Button buttonD20;
    Button buttonD100;

    AlertDialog dialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonD2 = (Button) this.findViewById((R.id.buttonD2));
        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D2 Roll", 2);
            }
        });

        buttonD4 = (Button) this.findViewById((R.id.buttonD4));
        buttonD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D4 Roll", 4);
            }
        });

        buttonD6 = (Button) this.findViewById((R.id.buttonD6));
        buttonD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D6 Roll", 6);
            }
        });

        buttonD8 = (Button) this.findViewById((R.id.buttonD8));
        buttonD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D8 Roll", 8);
            }
        });

        buttonD10 = (Button) this.findViewById((R.id.buttonD10));
        buttonD10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D10 Roll", 10);
            }
        });

        buttonD12 = (Button) this.findViewById((R.id.buttonD12));
        buttonD12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D12 Roll", 12);
            }
        });

        buttonD20 = (Button) this.findViewById((R.id.buttonD20));
        buttonD20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D20 Roll", 20);
            }
        });

        buttonD100 = (Button) this.findViewById((R.id.buttonD100));
        buttonD100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D100 Roll", 100);
            }
        });
    }

    private void displayDialog(String title, int sides) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_roll);
        dialog.setTitle(title);
        TextView tv = (TextView) dialog.findViewById(R.id.textNumber);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String s = "";
        int total = 0;
        for (int i = 0; i < 1; i++) {
            int n = (int) (Math.random() * sides) + 1;
            numbers.add(n);
            total += n;
            s = s + String.valueOf(n) + " ";
        }
        s = s + "= " + String.valueOf(total);
        tv.setText(s);
        dialog.show();
    }
}
