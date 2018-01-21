package com.teamascension.dice;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNumber;
    Button buttonClear;

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

        editNumber = (EditText) this.findViewById(R.id.editNumber);

        buttonClear = (Button) this.findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNumber.setText("");
            }
        });

        final Dialog dialog = new Dialog(this);

        buttonD2 = (Button) this.findViewById((R.id.buttonD2));
        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog_roll);
                dialog.setTitle("D2 Roll");
                TextView tv = (TextView) dialog.findViewById(R.id.textNumber);
                tv.setText("D2");
                dialog.show();
            }
        });
    }
}
