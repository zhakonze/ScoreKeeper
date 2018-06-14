package com.example.anroid.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

//import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    int TeamAscore  = 0;
    int TeamBscore  = 0;
    int shotForA    = 0;
    int foulForA    = 0;
    int yCardA      = 0;
    int rCardA      = 0;
    int shotForB    = 0;
    int foulForB    = 0;
    int yCardB      = 0;
    int rCardB      = 0;


    Spinner spinner0;
    Spinner spinner00;
    ImageView imageview;
    ImageView imageview0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(TeamAscore);
        displayForTeamB(TeamBscore);

        spinner0 = (Spinner) findViewById(R.id.spinner1);
        spinner00 = (Spinner) findViewById(R.id.spinner2);

        imageview = (ImageView) findViewById(R.id.imageView2);
        imageview0 = (ImageView) findViewById(R.id.imageView3);



        spinner0.setOnItemSelectedListener(new OnItemSelectedListener() {
            //spinner.
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                if(arg2 == 0)
                {

                    imageview.setImageResource(R.drawable.afghanistan);
                }
                else if(arg2 == 1)
                {
                    imageview.setImageResource(R.drawable.albania);
                }
                else if(arg2 == 2)
                {
                    imageview.setImageResource(R.drawable.algeria);
                }
                else if(arg2 == 3)
                {
                    imageview.setImageResource(R.drawable.andorra);
                }
                else if(arg2 == 4)
                {
                    imageview.setImageResource(R.drawable.angola);
                }
                else if(arg2 == 5)
                {
                    imageview.setImageResource(R.drawable.antiguaandbarbuda);
                }
                else if(arg2 == 6)
                {
                    imageview.setImageResource(R.drawable.argentina);
                }
                else if(arg2 == 7)
                {
                    imageview.setImageResource(R.drawable.armenia);
                }
                else if(arg2 == 8)
                {
                    imageview.setImageResource(R.drawable.australia);
                }
                else if(arg2 == 9)
                {
                    imageview.setImageResource(R.drawable.austria);
                }
                else if(arg2 == 10)
                {
                    imageview.setImageResource(R.drawable.azerbaijan);
                }
                else if(arg2 == 11)
                {
                    imageview.setImageResource(R.drawable.botswana);
                }
                else if(arg2 == 12)
                {
                    imageview.setImageResource(R.drawable.botswana);
                }
                else if(arg2 == 13)
                {
                    imageview.setImageResource(R.drawable.botswana);
                }
                else if(arg2 == 14)
                {
                    imageview.setImageResource(R.drawable.namibia);
                }
                else if(arg2 == 15)
                {
                    imageview.setImageResource(R.drawable.southafrica);
                }
                else if(arg2 == 16)
                {
                    imageview.setImageResource(R.drawable.zambia);
                }
                else if(arg2 == 17)
                {
                    imageview.setImageResource(R.drawable.zimbabwe);
                }


            }





            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });


        spinner00.setOnItemSelectedListener(new OnItemSelectedListener() {
            //spinner.
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                if(arg2 == 0)
                {

                    imageview0.setImageResource(R.drawable.angola);
                }
                else if(arg2 == 1)
                {
                    imageview0.setImageResource(R.drawable.botswana);
                }
                else if(arg2 == 2)
                {
                    imageview0.setImageResource(R.drawable.namibia);
                }
                else if(arg2 == 3)
                {
                    imageview0.setImageResource(R.drawable.southafrica);
                }
                else if(arg2 == 4)
                {
                    imageview0.setImageResource(R.drawable.zambia);
                }
                else if(arg2 == 5)
                {
                    imageview0.setImageResource(R.drawable.zimbabwe);
                }


            }





            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });
    }
 /*======================Displays the given score for Team A=======================================*/
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void goalA(View view){
        TeamAscore = TeamAscore + 1;
        displayForTeamA(TeamAscore);
    }
/*=================================================================================================*/
    public void shoDisA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shota);
        scoreView.setText(String.valueOf(score));

    }

    public void shotA(View view){
        shotForA = shotForA + 1;
        shoDisA(shotForA);
    }
/*=================================================================================================*/
    public void fouDisA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foula);
        scoreView.setText(String.valueOf(score));

    }

    public void foulA(View view){
        foulForA = foulForA + 1;
        fouDisA(foulForA);
    }
/*=================================================================================================*/
    public void yelDisA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ycarda);
        scoreView.setText(String.valueOf(score));

    }

    public void yeloA(View view){
        yCardA = yCardA + 1;
        yelDisA(yCardA);
    }
/*=================================================================================================*/
    public void redDisA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rcarda);
        scoreView.setText(String.valueOf(score));

    }

    public void redA(View view){
        rCardA = rCardA + 1;
        redDisA(rCardA);
    }
/*=================================================================================================*/


/*======================Displays the given score for Team B=======================================*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    public void goalB(View view){
        TeamBscore = TeamBscore + 1;
        displayForTeamB(TeamBscore);
    }
/*=================================================================================================*/
    public void shoDisB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotb);
        scoreView.setText(String.valueOf(score));

    }

    public void shotB(View view){
        shotForB = shotForB + 1;
        shoDisB(shotForB);
    }
    /*=================================================================================================*/
    public void fouDisB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulb);
        scoreView.setText(String.valueOf(score));

    }

    public void foulB(View view){
        foulForB = foulForB + 1;
        fouDisB(foulForB);
    }
    /*=================================================================================================*/
    public void yelDisB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ycardb);
        scoreView.setText(String.valueOf(score));

    }

    public void yeloB(View view){
        yCardB = yCardB + 1;
        yelDisB(yCardB);
    }
    /*=================================================================================================*/
    public void redDisB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rcardb);
        scoreView.setText(String.valueOf(score));

    }

    public void redB(View view){
        rCardB = rCardB + 1;
        redDisB(rCardB);
    }
    /*=================================================================================================*/


    public void clear(View view){
        TeamAscore  = 0;
        TeamBscore  = 0;
        shotForA    = 0;
        foulForA    = 0;
        yCardA      = 0;
        rCardA      = 0;
        shotForB    = 0;
        foulForB    = 0;
        yCardB      = 0;
        rCardB      = 0;

        displayForTeamA(TeamAscore);
        displayForTeamB(TeamBscore);
        redDisA(rCardA);
        redDisB(rCardB);
        yelDisA(yCardA);
        yelDisB(yCardB);
        fouDisA(foulForA);
        fouDisB(foulForB);
        shoDisA(shotForA);
        shoDisB(shotForB);

    }


}

