package com.example.recycleview.datas;


import androidx.annotation.NonNull;

import com.example.recycleview.R;
import com.example.recycleview.models.Movie;

import org.jetbrains.annotations.Contract;

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
          "Doctor Strange, with the help of mystical allies both old and new, traverses the mind-bending and dangerous alternate realities of the Multiverse to confront a mysterious new adversary.",
          "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
          "Blindsided by a new generation of blazing-fast racers, the legendary Lightning McQueen is suddenly pushed out of the sport he loves. To get back in the game, he will need the help of an eager young race technician with her own plan to win, inspiration from the late Fabulous Hudson Hornet, and a few unexpected turns. Proving that #95 isn't through yet will test the heart of a champion on Piston Cup Racing’s biggest stage!",
          "101-year-old Rose DeWitt Bukater tells the story of her life aboard the Titanic, 84 years later. A young Rose boards the ship with her mother and fiancé. Meanwhile, Jack Dawson and Fabrizio De Rossi win third-class tickets aboard the ship. Rose tells the whole story from Titanic's departure through to its death—on its first and last voyage—on April 15, 1912.",
          "Queen Ramonda, Shuri, M’Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T’Challa’s death. As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross and forge a new path for the kingdom of Wakanda.",
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

}
