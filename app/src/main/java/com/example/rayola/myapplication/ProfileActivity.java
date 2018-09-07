package com.example.rayola.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity  {
    public Button saveForm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageButton btnBack=(ImageButton)findViewById(R.id.back_button);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Button editAvatar=(Button)findViewById(R.id.edit_avatar);
        editAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "edit avatar is clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });

        Typeface typeface=Typeface.createFromAsset(getAssets(),"font/iransans_mobile_font.ttf");

        EditText nameEditText=(EditText)findViewById(R.id.edittext_firstName);
        nameEditText.setTypeface(typeface);

        EditText lastNameEditText=(EditText)findViewById(R.id.edittext_Lastname);
        lastNameEditText.setTypeface(typeface);


        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
                Toast.makeText(ProfileActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                //Toast.makeText(ProfileActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Toast.makeText(ProfileActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox javaCheckBox=(CheckBox)findViewById(R.id.java_Checkbox);
        CheckBox htmlCheckBox=(CheckBox)findViewById(R.id.java_Checkbox);
        CheckBox cssCheckBox=(CheckBox)findViewById(R.id.css_Checkbox);

        javaCheckBox.setTypeface(typeface);
        htmlCheckBox.setTypeface(typeface);
        cssCheckBox.setTypeface(typeface);

        javaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(ProfileActivity.this,String.valueOf(isChecked),Toast.LENGTH_SHORT).show();
            }
        });

        RadioButton maleRadio=(RadioButton)findViewById(R.id.male_Radio);
        maleRadio.setTypeface(typeface);
        RadioButton femaleRadio=(RadioButton)findViewById(R.id.female_Radio);
        femaleRadio.setTypeface(typeface);

        femaleRadio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Toast.makeText(ProfileActivity.this,String.valueOf(isChecked),Toast.LENGTH_SHORT).show();
            }
        });

        saveForm=(Button)findViewById(R.id.save_form);
        saveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "Save Form is Clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
