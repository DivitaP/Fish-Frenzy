package org.mentorschools.mygameappliction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mentorschools.mygameappliction.MainActivity;
import org.mentorschools.mygameappliction.R;

public class GameOverActivity extends AppCompatActivity
{
    private Button StartGameAgain;
    private TextView FinalScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        score = getIntent().getExtras().get("score").toString();

        StartGameAgain = (Button) findViewById(R.id.play_again_button);
        FinalScore = (TextView) findViewById(R.id.score_final);


        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        FinalScore.setText("Score : "+ score);
    }
}

