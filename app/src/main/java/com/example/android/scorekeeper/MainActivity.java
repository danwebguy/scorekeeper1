package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsNigeria = 0;
    int goalsGermany = 0;
    int foulsNigeria = 0;
    int foulsGermany = 0;
    int yellowCardsNigeria = 0;
    int yellowCardsGermany = 0;
    int redCardsNigeria = 0;
    int redCardsGermany = 0;
    int offSidesNigeria = 0;
    int offSidesGermany = 0;
    int cornerKicksNigeria = 0;
    int cornerKicksGermany = 0;
    int savesNigeria = 0;
    int savesGermany = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Nigeria by 1 goal.
     */
    public void addOneForTeamNigeria(View v) {
        goalsNigeria = goalsNigeria + 1;
        displayForTeamN(goalsNigeria);
    }

    /**
     * Displays the given score for Nigeria.
     */
    public void displayForTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Germany by 1 goal.
     */
    public void addOneForTeamGermany(View v) {
        goalsGermany = goalsGermany + 1;
        displayForTeamG(goalsGermany);
    }

    /**
     * Displays the given score for Germany.
     */
    public void displayForTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the points of fouls for Nigeria by 1.
     */
    public void addOneForFoulsNigeria(View v) {
        foulsNigeria = foulsNigeria + 1;
        displayFoulsTeamN(foulsNigeria);
    }

    /**
     * Displays the given points of Fouls for Nigeria.
     */
    public void displayFoulsTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForFoulsGermany(View v) {
        foulsGermany = foulsGermany + 1;
        displayFoulsTeamG(foulsGermany);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayFoulsTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Nigeria by 1.
     */
    public void addOneForYellowCardsNigeria(View v) {
        yellowCardsNigeria = yellowCardsNigeria + 1;
        displayYellowCardsTeamN(yellowCardsNigeria);
    }

    /**
     * Displays the given points of Fouls for Nigeria.
     */
    public void displayYellowCardsTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForYellowCardsGermany(View v) {
        yellowCardsGermany = yellowCardsGermany + 1;
        displayYellowCardsTeamG(yellowCardsGermany);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayYellowCardsTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForRedCardsTeamN(View v) {
        redCardsNigeria = redCardsNigeria + 1;
        displayRedCardsTeamN(redCardsNigeria);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayRedCardsTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForRedCardsTeamG(View v) {
        redCardsGermany = redCardsGermany + 1;
        displayRedCardsTeamG(redCardsGermany);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayRedCardsTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_red_cards);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForOffSidesTeamN(View v) {
        offSidesNigeria = offSidesNigeria + 1;
        displayOffSidesTeamN(offSidesNigeria);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayOffSidesTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_off_sides);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForOffSidesTeamG(View v) {
        offSidesGermany = offSidesGermany + 1;
        displayOffSidesTeamG(offSidesGermany);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayOffSidesTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_off_sides);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForCornerKicksTeamN(View v) {
        cornerKicksNigeria = cornerKicksNigeria + 1;
        displayCornerKicksTeamN(cornerKicksNigeria);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayCornerKicksTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_corner_kicks);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForCornerKicksTeamG(View v) {
        cornerKicksGermany = cornerKicksGermany + 1;
        displayCornerKicksTeamG(cornerKicksGermany);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displayCornerKicksTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_corner_kicks);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForSavesTeamN(View v) {
        savesNigeria = savesNigeria + 1;
        displaySavesTeamN(savesNigeria);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displaySavesTeamN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_saves);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the points of fouls for Germany by 1.
     */
    public void addOneForSavesTeamG(View v) {
        savesGermany = savesGermany + 1;
        displaySavesTeamG(savesGermany);
    }

    /**
     * Displays the given points of Fouls for Germany.
     */
    public void displaySavesTeamG(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_g_saves);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        goalsNigeria = 0;
        goalsGermany = 0;
        foulsNigeria = 0;
        foulsGermany = 0;
        yellowCardsNigeria = 0;
        yellowCardsGermany = 0;
        redCardsNigeria = 0;
        redCardsGermany = 0;
        offSidesNigeria = 0;
        offSidesGermany = 0;
        cornerKicksNigeria = 0;
        cornerKicksGermany = 0;
        savesNigeria = 0;
        savesGermany = 0;
        displayForTeamN(goalsNigeria);
        displayForTeamG(goalsGermany);
        displayFoulsTeamN(foulsNigeria);
        displayFoulsTeamG(foulsGermany);
        displayYellowCardsTeamN(yellowCardsNigeria);
        displayYellowCardsTeamG(yellowCardsGermany);
        displayRedCardsTeamN(redCardsNigeria);
        displayRedCardsTeamG(redCardsGermany);
        displayOffSidesTeamN(offSidesNigeria);
        displayOffSidesTeamG(offSidesGermany);
        displayCornerKicksTeamN(cornerKicksNigeria);
        displayCornerKicksTeamG(cornerKicksGermany);
        displaySavesTeamN(savesNigeria);
        displaySavesTeamG(savesGermany);
    }

}
