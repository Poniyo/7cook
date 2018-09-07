package com.example.rayola.myapplication.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rayola.myapplication.R;

import org.w3c.dom.Text;

public class MainWeatherAppActivity extends AppCompatActivity implements ApiService.OnWeatherResultReceived{
    private ApiService apiService;
    private TextView weatherTv;
    private TextView tempTv;
    private TextView pressureTv;
    private TextView humidityTv;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(
        R.layout.activity_main_weather_app);
        apiService=new ApiService(MainWeatherAppActivity.this);

        weatherTv=findViewById(R.id.tv_main_weather);
        tempTv=findViewById(R.id.tv_main_temp);
        pressureTv=findViewById(R.id.tv_main_pressure);
        humidityTv=findViewById(R.id.tv_main_humidity);
        progressBar=findViewById(R.id.progressBar_main);
        final EditText getCityEditText = findViewById(R.id.et_main_cityName);
        Button sendRequestButton = findViewById(R.id.button_main_sendRequest);
        sendRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getCityEditText.length() > 0) {
                    progressBar.setVisibility(View.VISIBLE);
                    apiService.getWeather(getCityEditText.getText().toString(), MainWeatherAppActivity.this);
                }else {
                    getCityEditText.setError("EditText is Empty...");
                }
            }
        });
    }

    @Override
    public void onReceived(String weather, float temp, int pressure, int humidity) {
        weatherTv.setText(weather);
        tempTv.setText(String.valueOf(temp));
        pressureTv.setText(String.valueOf(humidity));
        humidityTv.setText(String.valueOf(humidity));
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
