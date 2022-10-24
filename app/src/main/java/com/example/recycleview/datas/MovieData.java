package com.example.recycleview.datas;


import com.example.recycleview.R;
import com.example.recycleview.models.Movie;

import java.util.ArrayList;

public class MovieData {
  private static String[] movieName = {
          "Avengers: Infinity War",
          "Avengers: Endgame",
          "Doctor Strange",
          "Spider Man",
          "Cars",
          "Titanic",
          "Black Panther",
          "Venom",
  };

  private static String[] movieGenre = {
          "Action, Adventure, Fantasy",
          "Action, Adventure, Drama",
          "Action, Adventure, Sci-Fi",
          "Action, Adventure, Sci-Fi",
          "Action, Adventure, Fantasy",
          "Drama, Romance",
          "Action, Adventure, Sci-Fi",
          "Action, Adventure, Sci-Fi"
  };

  private static int[] movieImage = {
          R.drawable.infinity,
          R.drawable.endgame,
          R.drawable.doctor,
          R.drawable.spider,
          R.drawable.cars,
          R.drawable.titanic,
          R.drawable.blackpanther,
          R.drawable.venom,
  };

  private static String[] movieDescription = {
          "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
          "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
          "While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts.",
          "After being bitten by a genetically altered spider, nerdy high school student Peter Parker is endowed with amazing powers to become the Amazing superhero known",
          "Blindsided by a new generation of blazing-fast racers, the legendary Lightning McQueen is suddenly pushed out of the sport he loves. To get back in the game, he will need the help of an eager young race technician with her own plan to win",
          "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
          "After the death of his father, T'Challa returns home to the African nation of Wakanda to take his rightful place as king. When a powerful enemy suddenly reappears, T'Challa's mettle as king -- and as Black Panther -- gets tested when he's drawn into a formidable conflict that puts the fate of Wakanda and the entire world at risk.",
          "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego \"Venom\" to save his life.",
  };

  public static ArrayList<Movie> getDataMovie() {
    ArrayList<Movie> list = new ArrayList<>();
    for (int i = 0; i < movieName.length; i++) {
      Movie movie = new Movie(movieName[i], movieGenre[i], movieImage[i], movieDescription[i]);
      list.add(movie);
    }
    return list;
  }

  public static Movie getMovie(int position) {
    return new Movie(movieName[position], movieGenre[position], movieImage[position], movieDescription[position]);
  }

}
