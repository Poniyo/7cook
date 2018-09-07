package com.example.rayola.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.rayola.myapplication.genericsample.Bmw;
import com.example.rayola.myapplication.genericsample.Box;
import com.example.rayola.myapplication.genericsample.Contract;
import com.example.rayola.myapplication.genericsample.Parking;

import java.util.Locale;

public class ExpertProfileActivity extends AppCompatActivity {
    private View fullNameContainer;
    private EditText firstNameEt;
    private EditText lastNameEt;
    private Button editProfileBtn;
    private TextView fullNameTextView;
    private CheckBox androidCheckBox;
    private CheckBox cssCheckBox;
    private CheckBox deepLearningCheckBox;
    private RadioButton profileTehranRadioButton;
    private RadioButton profileGilanRadioButton;
    private RadioButton profileAlborzRadioButton;
    private RadioGroup profileRadioGroup;
    private Button saveInformationBtn;
    private Button showWebsiteButton;
    private boolean isInEditMode;
    private static final String TAG = "ExpertProfileActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_profile);
        setupViews();


       /* if (Locale.getDefault().getLanguage().equals("en")){

        }*/
        fullNameContainer = findViewById(R.id.ll_profile_fullname_container);
        editProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstNameEt.getText().toString();
                String b = lastNameEt.getText().toString();
                if (isInEditMode) {

                    editProfileBtn.setText(R.string.profile_editProfile_Button);

                    fullNameContainer.setVisibility(View.GONE);

                    if (a.isEmpty() && b.isEmpty()) {
                        Toast.makeText(ExpertProfileActivity.this, "Nemitavanad khali bashad", Toast.LENGTH_SHORT).show();
                    } else {
                        fullNameTextView.setText(firstNameEt.getText() +
                                " " + lastNameEt.getText());
                        firstNameEt.setText("");
                        lastNameEt.setText("");
                    }
                } else {
                    // fullNameTextView.setText("Enter the Name and Family...");
                    fullNameContainer.setVisibility(View.VISIBLE);
                    editProfileBtn.setText(getText(R.string.profile_done));
                }
                isInEditMode = !isInEditMode;
            }
        });

      /*  try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            Log.e(TAG, "onCreate: "+e.toString());
        }*/

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_expert_profile);
        setSupportActionBar(toolbar);

     /*   Box<String,String> box=new Box<String,String>();
        box.setData("masoud");

        Box<Post> box1=new Box<>();
        box1.setData(new Post());

        Box box2=new Box<String,String>();
        box2.setData();  همه نوع view میتونه بگیره به غیر از پریمیتیو تایپ ها
                در اینجا آبجکت میگیره ، چون نوع رو براش مشخص نکردیم

        Parking<Bmw> parking=new Parking<>();
        parking.setCar();

       final Contract<String> contract=new Contract<String>() {
            @Override
            public void sign(String T) {
                contract.sign();
            }
        };*/


    }

    class CbChecked implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if (isChecked) {
                Toast.makeText(ExpertProfileActivity.this, getString(R.string.profile_isCheckedMessaged, compoundButton.getText()),
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(ExpertProfileActivity.this, getString(R.string.profile_isCheckedMessaged2, compoundButton.getText()),
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    private void setupViews() {
        CbChecked cbChecked = new CbChecked();
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/iransans_mobile_font.ttf");
        firstNameEt = findViewById(R.id.et_profile_firstname);
       // firstNameEt.setTypeface(typeface);
        lastNameEt = findViewById(R.id.et_profile_lastname);
      //  lastNameEt.setTypeface(typeface);
        editProfileBtn = findViewById(R.id.btn_edit_profile);
        editProfileBtn.setTypeface(typeface);
        fullNameTextView = findViewById(R.id.text_view_profile);
        fullNameTextView.setTypeface(typeface);
        androidCheckBox = findViewById(R.id.checkbox_android_profile);
        androidCheckBox.setTypeface(typeface);
        androidCheckBox.setOnCheckedChangeListener(cbChecked);
        cssCheckBox = findViewById(R.id.checkbox_css_profile);
        cssCheckBox.setTypeface(typeface);
        cssCheckBox.setOnCheckedChangeListener(cbChecked);
        deepLearningCheckBox = findViewById(R.id.checkbox_profile_deep);
        deepLearningCheckBox.setTypeface(typeface);
        deepLearningCheckBox.setOnCheckedChangeListener(cbChecked);
        showWebsiteButton=findViewById(R.id.show_website);
        showWebsiteButton.setTypeface(typeface);

        profileRadioGroup = findViewById(R.id.radioGroup_profile);
        profileTehranRadioButton=findViewById(R.id.radio_profile_tehran);
        profileTehranRadioButton.setTypeface(typeface);
        profileGilanRadioButton=findViewById(R.id.radio_profile_zanjan);
        profileGilanRadioButton.setTypeface(typeface);
        profileAlborzRadioButton=findViewById(R.id.radio_profile_shiraz);
        profileAlborzRadioButton.setTypeface(typeface);



        profileRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                Toast.makeText(ExpertProfileActivity.this, getString(R.string.profile_isCheckedMessaged,
                        ((RadioButton) findViewById(checkId)).getText().toString()), Toast.LENGTH_SHORT).show();
            }
        });
        saveInformationBtn = findViewById(R.id.saveForm_profile);
        saveInformationBtn.setTypeface(typeface);
        saveInformationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ExpertProfileActivity.this, getString(R.string.profile_ToastSaveInforMation_Button), Toast.LENGTH_SHORT).show();
            }
        });
    }
  /*  @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked){
            Toast.makeText(this,getString(R.string.profile_isCheckedMessaged,compoundButton.getText()),
                    Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,getString(R.string.profile_isCheckedMessaged2,compoundButton.getText()),
                    Toast.LENGTH_LONG).show();
        }
    }*/


}
