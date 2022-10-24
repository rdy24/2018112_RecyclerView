package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recycleview.models.Movie;

public class MovieDetailActivity extends AppCompatActivity {

  ImageView image;
  TextView title, description, genre;
  public static final String ITEM_EXTRA = "item_extra";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    setContentView(R.layout.activity_movie_detail);
    image = findViewById(R.id.image_logo);
    title = findViewById(R.id.tv_title);
    description = findViewById(R.id.tv_desciption);
    genre = findViewById(R.id.tv_genre);

    Movie movie = getIntent().getParcelableExtra(ITEM_EXTRA);
    if (movie != null) {
      image.setImageResource(movie.getImage());
      title.setText(movie.getName());
      description.setText(movie.getDescription());
      genre.setText(movie.getGenre());
    }

    if(getSupportActionBar() != null) {
      getSupportActionBar().setTitle("Movie Detail");
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
  }
  public boolean onSupportNavigateUp() {
    finish();
    return true;
  }
}