package com.ajdi.yassin.popularmovies.data.local.model;

import java.lang.System;

/**
 * @author Yassin Ajdi
 * @since 11/12/2018.
 */
@androidx.room.Entity(tableName = "cast", foreignKeys = {@androidx.room.ForeignKey(entity = com.ajdi.yassin.popularmovies.data.local.model.Movie.class, childColumns = {"movie_id"}, onUpdate = 5, onDelete = 5, parentColumns = {"id"})}, indices = {@androidx.room.Index(value = {"movie_id"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JU\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\bH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u0006."}, d2 = {"Lcom/ajdi/yassin/popularmovies/data/local/model/Cast;", "", "id", "", "movieId", "", "characterName", "gender", "", "actorName", "order", "profileImagePath", "(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getActorName", "()Ljava/lang/String;", "setActorName", "(Ljava/lang/String;)V", "getCharacterName", "setCharacterName", "getGender", "()I", "setGender", "(I)V", "getId", "setId", "getMovieId", "()J", "setMovieId", "(J)V", "getOrder", "setOrder", "getProfileImagePath", "setProfileImagePath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class Cast {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "credit_id")
    private java.lang.String id;
    @androidx.room.ColumnInfo(name = "movie_id")
    private long movieId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "character")
    private java.lang.String characterName;
    @com.google.gson.annotations.SerializedName(value = "gender")
    private int gender;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String actorName;
    @com.google.gson.annotations.SerializedName(value = "order")
    private int order;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "profile_path")
    private java.lang.String profileImagePath;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getMovieId() {
        return 0L;
    }
    
    public final void setMovieId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCharacterName() {
        return null;
    }
    
    public final void setCharacterName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getGender() {
        return 0;
    }
    
    public final void setGender(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActorName() {
        return null;
    }
    
    public final void setActorName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public final void setOrder(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfileImagePath() {
        return null;
    }
    
    public final void setProfileImagePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Cast(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long movieId, @org.jetbrains.annotations.Nullable()
    java.lang.String characterName, int gender, @org.jetbrains.annotations.Nullable()
    java.lang.String actorName, int order, @org.jetbrains.annotations.Nullable()
    java.lang.String profileImagePath) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ajdi.yassin.popularmovies.data.local.model.Cast copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long movieId, @org.jetbrains.annotations.Nullable()
    java.lang.String characterName, int gender, @org.jetbrains.annotations.Nullable()
    java.lang.String actorName, int order, @org.jetbrains.annotations.Nullable()
    java.lang.String profileImagePath) {
        return null;
    }
    
    /**
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author Yassin Ajdi
     * @since 11/12/2018.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}