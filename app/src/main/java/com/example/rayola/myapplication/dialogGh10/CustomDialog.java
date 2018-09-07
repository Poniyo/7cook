package com.example.rayola.myapplication.dialogGh10;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.rayola.myapplication.R;

import java.util.zip.Inflater;

public class CustomDialog extends DialogFragment {
    private OnButtonAClicked onButtonAClicked;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
        View view= LayoutInflater.from(getContext()).inflate(R.layout.dialog_custom,null);

        Button buttonA=view.findViewById(R.id.Button_dialogSample_a);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onButtonAClicked!=null)
                    onButtonAClicked.onClick(("Button A Clicked!"));

                    dismiss();

            }
        });
        builder.setView(view);
        return  builder.create();
    }

    public void setOnButtonAClicked(OnButtonAClicked onButtonAClicked) {
        this.onButtonAClicked = onButtonAClicked;
    }

    public interface  OnButtonAClicked {
        void onClick(String message);
    }
}
