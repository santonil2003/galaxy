package com.example.sanil.galaxy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String WORD = "com.example.sanil.galaxy.WORD";
    public final static String MEANING = "com.example.sanil.galaxy.MEANING";
    public final static String SENTENCE = "com.example.sanil.galaxy.SENTENCE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveWord(View v){
        // build intent to start another activity
        Intent intent = new Intent(this, ViewActivity.class);

        //get object from main layout
        EditText word = (EditText) findViewById(R.id.editTextWord);
        EditText meaning = (EditText) findViewById(R.id.editTextMeaning);
        EditText sentence = (EditText) findViewById(R.id.editTextSentence);


        intent.putExtra(WORD, word.getText().toString());
        intent.putExtra(MEANING, meaning.getText().toString());
        intent.putExtra(SENTENCE, sentence.getText().toString());

        startActivity(intent);
    }
}
