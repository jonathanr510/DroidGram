package com.example.student.droidgram;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.student.droidgram.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberLikes = 0;

    /**
     * This method displays the given likes on the screen.
     */
    private void displayLikes(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.likes_text_view);
        priceTextView.setText("Likes:" + number);
    }

    public void increase(View view) {
        numberLikes++;
        displayLikes(numberLikes);
    }

    public void decrease(View view) {
        if(numberLikes <= 0){
            return;
        }
        numberLikes--;
        displayLikes(numberLikes);
    }
}








