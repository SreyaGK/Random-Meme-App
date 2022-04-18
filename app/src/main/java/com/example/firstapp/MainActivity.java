package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    int[] pics = {R.drawable.meme_1,R.drawable.meme_2,R.drawable.meme_3,R.drawable.meme_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=(ImageView) findViewById(R.id.picture);
    }

    public void Change(View view)
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        image.setImageResource(pics[rand_int]);
    }
}
