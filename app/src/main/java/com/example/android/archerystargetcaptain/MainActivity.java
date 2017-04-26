package com.example.android.archerystargetcaptain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        // Tracks the score for Archer A
        int scoreArcherA = 0;
        // Tracks the score for Team B
        int scoreArcherB = 0;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called and increases by +10 for Archer A.
     */
    public void addTenForArcherA(View view) {
        scoreArcherA = scoreArcherA + 10;
        displayForArcherA(scoreArcherA);
    }
        /**
         * This method is called and increases by +10 for Archer B.
         */
        public void addTenForArcherB(View view) {
            scoreArcherB = scoreArcherB + 10;
            displayForArcherB(scoreArcherB);
        }
        /**
         * This method is called and increases by +9 for Archer A.
         */
        public void addNineForArcherA(View view) {
            scoreArcherA = scoreArcherA + 9;
            displayForArcherA(scoreArcherA);
        }

        /**
         * This method is called and increases by +9 for Archer B.
         */
        public void addNineForArcherB(View view) {
            scoreArcherB = scoreArcherB + 9;
            displayForArcherB(scoreArcherB);
        }
       /**
         * This method is called and increases by +8 for Archer A.
         */
        public void addEightForArcherA(View view) {
            scoreArcherA = scoreArcherA + 8;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +8 for Archer B.
         */
        public void addEightForArcherB(View view) {
            scoreArcherB = scoreArcherB + 8;
            displayForArcherB(scoreArcherB);
        }
        /**
         * This method is called and increases by +7 for Archer A.
         */
        public void addSevenForArcherA(View view) {
            scoreArcherA = scoreArcherA + 7;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +7 for Archer B.
         */
        public void addSevenForArcherB(View view) {
            scoreArcherB = scoreArcherB + 7;
            displayForArcherB(scoreArcherB);
        }
       /**
         * This method is called and increases by +6 for Archer A.
         */
        public void addSixForArcherA(View view) {
            scoreArcherA = scoreArcherA + 6;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +6 for Archer B.
         */
        public void addSixForArcherB(View view) {
            scoreArcherB = scoreArcherB + 6;
            displayForArcherB(scoreArcherB);
        }
        /**
         * This method is called and increases by +5 for Archer A.
         */
        public void addFiveForArcherA(View view) {
            scoreArcherA = scoreArcherA + 5;
            displayForArcherA(scoreArcherA);
        }

        /**
         * This method is called and increases by +5 for Archer B.
         */
        public void addFiveForArcherB(View view) {
            scoreArcherB = scoreArcherB + 5;
            displayForArcherB(scoreArcherB);
        }
        /**
         * This method is called and increases by +4 for Archer A.
         */
        public void addFourForArcherA(View view) {
            scoreArcherA = scoreArcherA + 4;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +4 for Archer B.
         */
        public void addFourForArcherB(View view) {
            scoreArcherB = scoreArcherB + 4;
            displayForArcherB(scoreArcherB);
        }
        /**
         * This method is called and increases by +3 for Archer A.
         */
        public void addThreeForArcherA(View view) {
            scoreArcherA = scoreArcherA + 3;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +3 for Archer B.
         */
        public void addThreeForArcherB(View view) {
            scoreArcherB = scoreArcherB + 3;
            displayForArcherB(scoreArcherB);
        }/**
         * This method is called and increases by +2 for Archer A.
         */
        public void addTwoForArcherA(View view) {
            scoreArcherA = scoreArcherA + 2;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +2 for Archer B.
         */
        public void addTwoForArcherB(View view) {
            scoreArcherB = scoreArcherB + 2;
            displayForArcherB(scoreArcherB);
        }/**
         * This method is called and increases by +1 for Archer A.
         */
        public void addOneForArcherA(View view) {
            scoreArcherA = scoreArcherA + 1;
            displayForArcherA(scoreArcherA);
        }
        /**
         * This method is called and increases by +1 for Archer B.
         */
        private void addOneForArcherB(View view) {
            scoreArcherB = scoreArcherB + 1;
            displayForArcherB(scoreArcherB);
        }
        // This method is called to reset the team scores to zero
        public void resetArchersScores(View view) {
            scoreArcherA = 0;
            scoreArcherB = 0;
            displayForArcherA(scoreArcherA);
            displayForArcherB(scoreArcherB);
        }




    /**
     * Displays the given score for Archer A.
     */
    private void displayForArcherA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_a_score);
        scoreView.setText(String.valueOf(score));
    }
        /**
         * Displays the given score for Archer B.
         */
        private void displayForArcherB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.archer_b_score);
           scoreView.setText(String.valueOf(score));
    }





}
