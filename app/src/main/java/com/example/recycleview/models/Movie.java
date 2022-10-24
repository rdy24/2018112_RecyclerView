package com.example.recycleview.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
  public String name;
  public String genre;
  public int image;
  public String description;

  public Movie(String name, String genre, int image) {
    this.name = name;
    this.genre = genre;
    this.image = image;
  }

  public Movie(String name, String genre, int image, String description) {
    this.name = name;
    this.genre = genre;
    this.image = image;
    this.description = description;
  }

  protected Movie(Parcel in) {
    name = in.readString();
    genre = in.readString();
    image = in.readInt();
    description = in.readString();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getImage() {
    return image;
  }

  public void setImage(int image) {
    this.image = image;
  }


  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(name);
    dest.writeString(genre);
    dest.writeInt(image);
    dest.writeString(description);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public static final Creator<Movie> CREATOR = new Creator<Movie>() {
    @Override
    public Movie createFromParcel(Parcel in) {
      return new Movie(in);
    }

    @Override
    public Movie[] newArray(int size) {
      return new Movie[size];
    }
  };
}
