package com.coxtunes.timecounter.androidcountertime;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //-------Initialize Variable------------//
    private TextView countertext;
    private Button startcount, loginbutton;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countertext = findViewById(R.id.times);
        startcount = findViewById(R.id.cstart);
        loginbutton = findViewById(R.id.login);



        startcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ///------------------methord for count down timer-----------------//
                //--------here 6o is second, 1000 is milisecond & last 1000 is 1000milisec = 1sec for interval change time---//
                countDownTimer = new CountDownTimer(60*1000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                        //---------your action here----------//
                        //---------here 1000 is milisecond-----------//
                        countertext.setText("Start Counting: "+millisUntilFinished /1000 + "second");

                    }

                    @Override
                    public void onFinish() {

                        //------------define your task when time finis-----//
                        countertext.setText("DONE, NOW YOU CAN LOGIN");
                        loginbutton.setVisibility(View.VISIBLE);
                    }
                };
                countDownTimer.start();

                //------here is also reset method, end methoed------------///

            }
        });




    }
}
