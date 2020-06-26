package com.ajdi.yassin.popularmovies.data.local.model;

import java.lang.System;

/**
 * Created by Yassin Ajdi.
 */
@androidx.room.Entity(tableName = "movie")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\b\u0087\b\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0010H\u00c6\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\nH\u00c6\u0003J\t\u0010V\u001a\u00020\nH\u00c6\u0003J\t\u0010W\u001a\u00020\rH\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00ad\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001J\u0013\u0010Z\u001a\u00020\u00102\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\\\u001a\u00020\rH\u0016J\t\u0010]\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\u0004\u0018\u00010\u00058F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J\u00a8\u0006^"}, d2 = {"Lcom/ajdi/yassin/popularmovies/data/local/model/Movie;", "", "id", "", "title", "", "posterPath", "backdropPath", "overview", "popularity", "", "voteAverage", "voteCount", "", "releaseDate", "isFavorite", "", "genres", "", "Lcom/ajdi/yassin/popularmovies/data/local/model/Genre;", "trailersResponse", "Lcom/ajdi/yassin/popularmovies/data/local/model/TrailersResponse;", "creditsResponse", "Lcom/ajdi/yassin/popularmovies/data/local/model/CreditsResponse;", "reviewsResponse", "Lcom/ajdi/yassin/popularmovies/data/local/model/ReviewsResponse;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/String;ZLjava/util/List;Lcom/ajdi/yassin/popularmovies/data/local/model/TrailersResponse;Lcom/ajdi/yassin/popularmovies/data/local/model/CreditsResponse;Lcom/ajdi/yassin/popularmovies/data/local/model/ReviewsResponse;)V", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "getCreditsResponse", "()Lcom/ajdi/yassin/popularmovies/data/local/model/CreditsResponse;", "setCreditsResponse", "(Lcom/ajdi/yassin/popularmovies/data/local/model/CreditsResponse;)V", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "getId", "()J", "setId", "(J)V", "()Z", "setFavorite", "(Z)V", "originalLanguage", "getOriginalLanguage", "setOriginalLanguage", "getOverview", "setOverview", "getPopularity", "()D", "setPopularity", "(D)V", "getPosterPath", "setPosterPath", "getReleaseDate", "setReleaseDate", "getReviewsResponse", "()Lcom/ajdi/yassin/popularmovies/data/local/model/ReviewsResponse;", "setReviewsResponse", "(Lcom/ajdi/yassin/popularmovies/data/local/model/ReviewsResponse;)V", "getTitle", "setTitle", "getTrailersResponse", "()Lcom/ajdi/yassin/popularmovies/data/local/model/TrailersResponse;", "setTrailersResponse", "(Lcom/ajdi/yassin/popularmovies/data/local/model/TrailersResponse;)V", "getVoteAverage", "setVoteAverage", "getVoteCount", "()I", "setVoteCount", "(I)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "o", "hashCode", "toString", "app_release"})
public final class Movie {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "id")
    private long id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "poster_path")
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "backdrop_path")
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private double popularity;
    @androidx.room.ColumnInfo(name = "vote_average")
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private double voteAverage;
    @androidx.room.ColumnInfo(name = "vote_count")
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private int voteCount;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "release_date")
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @androidx.room.ColumnInfo(name = "is_favorite")
    private boolean isFavorite;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "genres")
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> genres;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "videos")
    private com.ajdi.yassin.popularmovies.data.local.model.TrailersResponse trailersResponse;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "credits")
    private com.ajdi.yassin.popularmovies.data.local.model.CreditsResponse creditsResponse;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    @com.google.gson.annotations.SerializedName(value = "reviews")
    private com.ajdi.yassin.popularmovies.data.local.model.ReviewsResponse reviewsResponse;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    public final void setOriginalLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object o) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    public final void setPopularity(double p0) {
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public final void setVoteAverage(double p0) {
    }
    
    public final int getVoteCount() {
        return 0;
    }
    
    public final void setVoteCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.TrailersResponse getTrailersResponse() {
        return null;
    }
    
    public final void setTrailersResponse(@org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.TrailersResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.CreditsResponse getCreditsResponse() {
        return null;
    }
    
    public final void setCreditsResponse(@org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.CreditsResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.ReviewsResponse getReviewsResponse() {
        return null;
    }
    
    public final void setReviewsResponse(@org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.ReviewsResponse p0) {
    }
    
    public Movie(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, double popularity, double voteAverage, int voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, boolean isFavorite, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> genres, @org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.TrailersResponse trailersResponse, @org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.CreditsResponse creditsResponse, @org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.ReviewsResponse reviewsResponse) {
        super();
    }
    
    public Movie() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.TrailersResponse component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.CreditsResponse component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.ReviewsResponse component14() {
        return null;
    }
    
    /**
     * Created by Yassin Ajdi.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ajdi.yassin.popularmovies.data.local.model.Movie copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, double popularity, double voteAverage, int voteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, boolean isFavorite, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> genres, @org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.TrailersResponse trailersResponse, @org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.CreditsResponse creditsResponse, @org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.ReviewsResponse reviewsResponse) {
        return null;
    }
    
    /**
     * Created by Yassin Ajdi.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}