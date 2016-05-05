package com.example.sanil.galaxy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

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

        String meaningString = intent.getStringExtra(MainActivity.MEANING);
        TextView meaning = (TextView) findViewById(R.id.textViewMeaning);
        meaning.setText(meaningString);

        String sentenceString = intent.getStringExtra(MainActivity.SENTENCE);
        TextView sentence = (TextView) findViewById(R.id.textViewSentence);
        sentence.setText(sentenceString);

        /**
         * usig toast, flash message
         */

        /**
        Context context = getApplicationContext();
        CharSequence text = intent.getStringExtra("var_name"); // get the passed data from another previous activity
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();**/
    }


    public void listWord(View v){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }


}
