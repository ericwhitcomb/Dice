package com.teamascension.dice;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

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

        spinner = (Spinner) this.findViewById(R.id.spinner);

        buttonD2 = (Button) this.findViewById((R.id.buttonD2));
        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D2 Roll", 2, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD4 = (Button) this.findViewById((R.id.buttonD4));
        buttonD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D4 Roll", 4, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD6 = (Button) this.findViewById((R.id.buttonD6));
        buttonD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D6 Roll", 6, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD8 = (Button) this.findViewById((R.id.buttonD8));
        buttonD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D8 Roll", 8, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD10 = (Button) this.findViewById((R.id.buttonD10));
        buttonD10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D10 Roll", 10, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD12 = (Button) this.findViewById((R.id.buttonD12));
        buttonD12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D12 Roll", 12, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD20 = (Button) this.findViewById((R.id.buttonD20));
        buttonD20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D20 Roll", 20, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });

        buttonD100 = (Button) this.findViewById((R.id.buttonD100));
        buttonD100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog("D100 Roll", 100, Integer.parseInt(spinner.getSelectedItem().toString()));
            }
        });
    }

    private void displayDialog(String title, int sides, int count) {

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_roll);
        dialog.setTitle(title + ":");

        TextView textNumbers = (TextView) dialog.findViewById(R.id.textNumbers);
        TextView textTotal = (TextView) dialog.findViewById(R.id.textTotal);

        String s = "";
        int total = 0;
        for (int i = 0; i < count; i++) {
            int n = (int) (Math.random() * sides) + 1;
            total += n;
            s = s + String.valueOf(n) + " + ";
        }
        s = s.substring(0, s.length()-3);
        if (count > 1) {
            textNumbers.setText(s);
            textNumbers.setVisibility(View.VISIBLE);
        } else {
            textNumbers.setVisibility(View.INVISIBLE);
        }
        textTotal.setText(String.valueOf(total));
        dialog.show();
    }
}
