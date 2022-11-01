package com.example.recycleview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.recycleview.R;
import com.example.recycleview.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

  List<Movie> movieList;
  OnItemClickCallback onItemClickCallback;

  public MovieAdapter(List<Movie> movieList) {
    this.movieList = movieList;
  }

  public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
    this.onItemClickCallback = onItemClickCallback;
  }

  @NonNull
  @Override
  public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//    return null;
    Context context = parent.getContext();
    LayoutInflater layoutInflater = LayoutInflater.from(context);
    View movieView = layoutInflater.inflate(R.layout.item_movie,parent,false);
    MyViewHolder viewHolder = new MyViewHolder((ViewGroup) movieView);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Movie movie = movieList.get(position);
    holder.movieName.setText(movie.getName());
    holder.movieGenre.setText(movie.getGenre());
    Glide.with(holder.itemView.getContext())
            .load(movie.getImage())
            .apply(new RequestOptions().override(80,80))
            .into(holder.movieImage);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        onItemClickCallback.onItemClicked(movieList.get(holder.getAdapterPosition()));
      }
    });
  }

  @Override
  public int getItemCount() {

//    return 0;
    return (movieList != null) ? movieList.size() : 0;
  }

  public static class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView movieName, movieGenre, movieDescription;
    public ImageView movieImage;
    public MyViewHolder(@NonNull ViewGroup parent) {
      super(parent);
      movieName = parent.findViewById(R.id.tv_title);
      movieGenre = parent.findViewById(R.id.tv_genre);
      movieImage = parent.findViewById(R.id.image_logo);
    }
  }

  public static class OnItemClickCallback {
    public void onItemClicked(Movie movie) {
    }
  }
}
