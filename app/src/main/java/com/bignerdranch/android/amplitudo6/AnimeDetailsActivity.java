package com.bignerdranch.android.amplitudo6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class AnimeDetailsActivity extends AppCompatActivity {

    ImageView mImageView;
    TextView mTitleTxt;
    TextView mDescriptionTxt;
    TextView mAnimeEndedTxt;
    TextView mAnimeStartedTxt;
    TextView mEpisodeCountTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime_details);

        Intent intent = getIntent();

        findViewsById();
        //setValues();
                                    // Ne radi ni najprostiji mTitleTxt.setText("Proizvoljan text");

        Glide.with(AnimeDetailsActivity.this)
                .load(getIntent().getStringExtra("anime_image_url"))
                .into(mImageView);


        Toast.makeText(this, getIntent().getStringExtra("anime_title"), Toast.LENGTH_SHORT).show();
    }

    private void findViewsById() {

        mImageView = findViewById(R.id.image_view);
        mTitleTxt = findViewById(R.id.anime_title);
        mAnimeStartedTxt = findViewById(R.id.anime_started_txt);
        mEpisodeCountTxt = findViewById(R.id.ep_length_txt);
        mAnimeEndedTxt = findViewById(R.id.anime_ending_txt);
        mDescriptionTxt = findViewById(R.id.description_txt);
    }

    private void setValues() {
// TODO Napraviti jos sliku
        mTitleTxt.setText(getIntent().getStringExtra("anime_title"));
        mAnimeStartedTxt.setText(getIntent().getStringExtra("anime_started_date"));
        mEpisodeCountTxt.setText(getIntent().getStringExtra("anime_episodes"));
        mAnimeEndedTxt.setText(getIntent().getStringExtra("anime_ended_date"));
        mDescriptionTxt.setText(getIntent().getStringExtra("anime_description"));

        Glide.with(AnimeDetailsActivity.this)
                .load(getIntent().getStringExtra("anime_image_url"))
                .into(mImageView);

    }

}

