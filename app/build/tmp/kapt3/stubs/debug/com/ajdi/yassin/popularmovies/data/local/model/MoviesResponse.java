package com.ajdi.yassin.popularmovies.data.local.model;

import java.lang.System;

/**
 * Created by Yassin Ajdi.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/ajdi/yassin/popularmovies/data/local/model/MoviesResponse;", "", "page", "", "totalResults", "totalPages", "movies", "", "Lcom/ajdi/yassin/popularmovies/data/local/model/Movie;", "(IIILjava/util/List;)V", "getMovies", "()Ljava/util/List;", "setMovies", "(Ljava/util/List;)V", "getPage", "()I", "setPage", "(I)V", "getTotalPages", "setTotalPages", "getTotalResults", "setTotalResults", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MoviesResponse {
    @com.google.gson.annotations.SerializedName(value = "page")
    private int page;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private int totalResults;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private int totalPages;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Movie> movies;
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final void setTotalPages(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Movie> getMovies() {
        return null;
    }
    
    public final void setMovies(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Movie> p0) {
    }
    
    public MoviesResponse(int page, int totalResults, int totalPages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Movie> movies) {
        super();
    }
    
    public MoviesResponse() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Movie> component4() {
        return null;
    }
    
    /**
     * Created by Yassin Ajdi.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ajdi.yassin.popularmovies.data.local.model.MoviesResponse copy(int page, int totalResults, int totalPages, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Movie> movies) {
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
    
    /**
     * Created by Yassin Ajdi.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Yassin Ajdi.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}