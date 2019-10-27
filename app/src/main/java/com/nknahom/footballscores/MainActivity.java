package com.nknahom.footballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int goalTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setLogo(R.mipmap.ic_launcher);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setDisplayUseLogoEnabled(true);
        }
    }

    public void goalTeamA(View view) {
        goalTeamA += 1;
        displayGoalA(goalTeamA);
    }

    public void goalTeamB(View view) {
        goalTeamB += 1;
        displayGoalB(goalTeamB);
    }

    public void teamAFoul(View view) {
        foulTeamA += 1;
        displayFoulA(foulTeamA);
    }

    public void teamBFoul(View view) {
        foulTeamB += 1;
        displayFoulB(foulTeamB);
    }

    private void displayFoulA(int foulTeamA) {
        TextView foulA = findViewById(R.id.teamAFouls);
        foulA.setText(String.valueOf(foulTeamA));
    }

    private void displayFoulB(int foulTeamB) {
        TextView foulB = findViewById(R.id.teamBFoul);
        foulB.setText(String.valueOf(foulTeamB));
    }

    public void displayGoalA(int goalTeamA){
        TextView goalA = findViewById(R.id.teamAScore);
        goalA.setText(String.valueOf(goalTeamA));
    }

    private void displayGoalB(int goalTeamB) {
        TextView goalB = findViewById(R.id.teamBScore);
        goalB.setText(String.valueOf(goalTeamB));
    }

    public void resetGame(View view) {
        goalTeamA = 0;
        displayGoalA(goalTeamA);

        goalTeamB = 0;
        displayGoalB(goalTeamB);

        foulTeamA = 0;
        displayFoulA(foulTeamA);

        foulTeamB = 0;
        displayFoulB(foulTeamB);
    }
}
