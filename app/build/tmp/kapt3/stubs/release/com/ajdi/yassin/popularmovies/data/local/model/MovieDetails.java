package com.ajdi.yassin.popularmovies.data.local.model;

import java.lang.System;

/**
 * This class is used to load full movie details including (Trailers, Cast, etc)
 *
 * @author Yassin Ajdi
 * @since 11/12/2018.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/ajdi/yassin/popularmovies/data/local/model/MovieDetails;", "", "movie", "Lcom/ajdi/yassin/popularmovies/data/local/model/Movie;", "trailers", "", "Lcom/ajdi/yassin/popularmovies/data/local/model/Trailer;", "castList", "Lcom/ajdi/yassin/popularmovies/data/local/model/Cast;", "reviews", "Lcom/ajdi/yassin/popularmovies/data/local/model/Review;", "(Lcom/ajdi/yassin/popularmovies/data/local/model/Movie;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCastList", "()Ljava/util/List;", "setCastList", "(Ljava/util/List;)V", "getMovie", "()Lcom/ajdi/yassin/popularmovies/data/local/model/Movie;", "setMovie", "(Lcom/ajdi/yassin/popularmovies/data/local/model/Movie;)V", "getReviews", "setReviews", "getTrailers", "setTrailers", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
public final class MovieDetails {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private com.ajdi.yassin.popularmovies.data.local.model.Movie movie;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "movie_id")
    private java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> trailers;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "movie_id")
    private java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> castList;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "id", entityColumn = "movie_id")
    private java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> reviews;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.Movie getMovie() {
        return null;
    }
    
    public final void setMovie(@org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.Movie p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> getTrailers() {
        return null;
    }
    
    public final void setTrailers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> getCastList() {
        return null;
    }
    
    public final void setCastList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> getReviews() {
        return null;
    }
    
    public final void setReviews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> p0) {
    }
    
    public MovieDetails(@org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.Movie movie, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> trailers, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> castList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> reviews) {
        super();
    }
    
    public MovieDetails() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ajdi.yassin.popularmovies.data.local.model.Movie component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> component4() {
        return null;
    }
    
    /**
     * This class is used to load full movie details including (Trailers, Cast, etc)
     *
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ajdi.yassin.popularmovies.data.local.model.MovieDetails copy(@org.jetbrains.annotations.Nullable()
    com.ajdi.yassin.popularmovies.data.local.model.Movie movie, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> trailers, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> castList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> reviews) {
        return null;
    }
    
    /**
     * This class is used to load full movie details including (Trailers, Cast, etc)
     *
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * This class is used to load full movie details including (Trailers, Cast, etc)
     *
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This class is used to load full movie details including (Trailers, Cast, etc)
     *
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}