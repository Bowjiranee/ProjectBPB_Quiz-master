package com.example.hp.projectbpb_quiz;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.projectbpb_quiz.model.Quiz;

import java.nio.file.OpenOption;

import static android.os.Build.VERSION_CODES.O;

public class QuizDataDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_data_details);

        ImageView quizImageView = (ImageView)findViewById(R.id.quizAppGuessImageView);
        TextView detailTextView = (TextView)findViewById(R.id.detailTextView);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        QuizData quizData = QuizData.getInstance();
        Quiz quiz = quizData.quizDataList.get(position);

        String name = quiz.name;
        String detail = quiz.detail;
        Drawable drawable = quiz.getPictureDrawable(this);

        quizImageView.setImageDrawable(drawable);
        detailTextView.setText(detail);

        getSupportActionBar().setTitle(name);
    }
}
