package com.example.sanil.galaxy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Intent intent = getIntent();

        String wordString = intent.getStringExtra(MainActivity.WORD);
        TextView word = (TextView) findViewById(R.id.textViewWord);
        word.setText(wordString);

        String meaningString = intent.getStringExtra(MainActivity.SENTENCE);
        TextView meaning = (TextView) findViewById(R.id.textViewMeaning);
        meaning.setText(meaningString);

        String sentenceString = intent.getStringExtra(MainActivity.SENTENCE);
        TextView sentence = (TextView) findViewById(R.id.textViewSentence);
        sentence.setText(sentenceString);


    }
}
