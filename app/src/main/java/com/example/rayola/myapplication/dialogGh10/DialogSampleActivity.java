package com.example.rayola.myapplication.dialogGh10;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.rayola.myapplication.R;

public class DialogSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_sample);

        Button dialogButton = findViewById(R.id.button_standard_dialog);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DialogSampleActivity.this)
                        .setTitle("Hello")
                        .setMessage("This is a test")
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogSampleActivity.this, "Positive Button Clicked...", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(DialogSampleActivity.this, "Negative Button Clicked...", Toast.LENGTH_SHORT).show();
                            }
                        }).create();
                alertDialog.show();
            }
        });

        Button customDialogButton=findViewById(R.id.button_CustomDialog);
        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialog customDialog=new CustomDialog();
                customDialog.show(getSupportFragmentManager(),null);
                customDialog.setOnButtonAClicked(new CustomDialog.OnButtonAClicked() {
                    @Override
                    public void onClick(String message) {
                        Toast.makeText(DialogSampleActivity.this, message, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
