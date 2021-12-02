package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private SensorManager sensorManager;
    private List<Sensor> deviceSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        sensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        deviceSensor = sensorManager.getSensorList(Sensor.TYPE_ALL);
//        textView.setText(deviceSensor.toString());
        printSensoe();
        /* specificSensor();
        this mathood you can use foe specifice sensor detect.*/
    }

    /*private void specificSensor() {
      if (sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE )!= null)
      { textView.setText("This device abailable this sensor");

       }else
       {
           textView.setText("this device is not avilable this sensor");
       }
    }*/

    private void printSensoe() {
        for (Sensor sensor : deviceSensor){

            textView.setText(" "+textView.getText()+"\n"+"    "+ sensor.getName());
        }
    }

}