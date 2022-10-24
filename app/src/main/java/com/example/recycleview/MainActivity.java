package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.recycleview.adapters.MovieAdapter;
import com.example.recycleview.datas.MovieData;
import com.example.recycleview.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  RecyclerView rvMovie;
  public List<Movie> movieList = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    setTitle("Movie List");
    rvMovie = findViewById(R.id.rv_movie);
    movieList = MovieData.getDataMovie();

    MovieAdapter movieAdapter = new MovieAdapter(movieList);
    rvMovie.setAdapter(movieAdapter);
    rvMovie.setLayoutManager(new LinearLayoutManager(this));
    rvMovie.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    movieAdapter.setOnItemClickCallback(new MovieAdapter.OnItemClickCallback() {
      @Override
      public void onItemClicked(Movie data) {
        Intent moveIntent = new Intent(MainActivity.this, MovieDetailActivity.class);
        moveIntent.putExtra(MovieDetailActivity.ITEM_EXTRA, data);
        startActivity(moveIntent);
      }
    });
  }
}