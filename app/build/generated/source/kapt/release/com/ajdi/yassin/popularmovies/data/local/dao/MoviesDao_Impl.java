package com.ajdi.yassin.popularmovies.data.local.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ajdi.yassin.popularmovies.data.local.model.Cast;
import com.ajdi.yassin.popularmovies.data.local.model.Converters;
import com.ajdi.yassin.popularmovies.data.local.model.Genre;
import com.ajdi.yassin.popularmovies.data.local.model.Movie;
import com.ajdi.yassin.popularmovies.data.local.model.MovieDetails;
import com.ajdi.yassin.popularmovies.data.local.model.Review;
import com.ajdi.yassin.popularmovies.data.local.model.Trailer;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MoviesDao_Impl implements MoviesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovie;

  private final SharedSQLiteStatement __preparedStmtOfFavoriteMovie;

  private final SharedSQLiteStatement __preparedStmtOfUnFavoriteMovie;

  public MoviesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `movie`(`originalLanguage`,`id`,`title`,`poster_path`,`backdrop_path`,`overview`,`popularity`,`vote_average`,`vote_count`,`release_date`,`is_favorite`,`genres`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOriginalLanguage());
        }
        stmt.bindLong(2, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBackdropPath());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        stmt.bindDouble(7, value.getPopularity());
        stmt.bindDouble(8, value.getVoteAverage());
        stmt.bindLong(9, value.getVoteCount());
        if (value.getReleaseDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getReleaseDate());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(11, _tmp);
        final String _tmp_1;
        _tmp_1 = Converters.fromGenresList(value.getGenres());
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_1);
        }
      }
    };
    this.__preparedStmtOfFavoriteMovie = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE movie SET is_favorite = 1 WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUnFavoriteMovie = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE movie SET is_favorite = 0 WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int favoriteMovie(final long movieId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfFavoriteMovie.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, movieId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfFavoriteMovie.release(_stmt);
    }
  }

  @Override
  public int unFavoriteMovie(final long movieId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUnFavoriteMovie.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, movieId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUnFavoriteMovie.release(_stmt);
    }
  }

  @Override
  public LiveData<MovieDetails> getMovie(final long movieId) {
    final String _sql = "SELECT * FROM movie WHERE movie.id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"trailer","cast","review","movie"}, true, new Callable<MovieDetails>() {
      @Override
      public MovieDetails call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true);
          try {
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
            final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
            final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
            final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
            final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
            final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
            final LongSparseArray<ArrayList<Trailer>> _collectionTrailers = new LongSparseArray<ArrayList<Trailer>>();
            final LongSparseArray<ArrayList<Cast>> _collectionCastList = new LongSparseArray<ArrayList<Cast>>();
            final LongSparseArray<ArrayList<Review>> _collectionReviews = new LongSparseArray<ArrayList<Review>>();
            while (_cursor.moveToNext()) {
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
                ArrayList<Trailer> _tmpTrailersCollection = _collectionTrailers.get(_tmpKey);
                if (_tmpTrailersCollection == null) {
                  _tmpTrailersCollection = new ArrayList<Trailer>();
                  _collectionTrailers.put(_tmpKey, _tmpTrailersCollection);
                }
              }
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
                ArrayList<Cast> _tmpCastListCollection = _collectionCastList.get(_tmpKey_1);
                if (_tmpCastListCollection == null) {
                  _tmpCastListCollection = new ArrayList<Cast>();
                  _collectionCastList.put(_tmpKey_1, _tmpCastListCollection);
                }
              }
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_2 = _cursor.getLong(_cursorIndexOfId);
                ArrayList<Review> _tmpReviewsCollection = _collectionReviews.get(_tmpKey_2);
                if (_tmpReviewsCollection == null) {
                  _tmpReviewsCollection = new ArrayList<Review>();
                  _collectionReviews.put(_tmpKey_2, _tmpReviewsCollection);
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiptrailerAscomAjdiYassinPopularmoviesDataLocalModelTrailer(_collectionTrailers);
            __fetchRelationshipcastAscomAjdiYassinPopularmoviesDataLocalModelCast(_collectionCastList);
            __fetchRelationshipreviewAscomAjdiYassinPopularmoviesDataLocalModelReview(_collectionReviews);
            final MovieDetails _result;
            if(_cursor.moveToFirst()) {
              final Movie _tmpMovie;
              if (! (_cursor.isNull(_cursorIndexOfOriginalLanguage) && _cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfPosterPath) && _cursor.isNull(_cursorIndexOfBackdropPath) && _cursor.isNull(_cursorIndexOfOverview) && _cursor.isNull(_cursorIndexOfPopularity) && _cursor.isNull(_cursorIndexOfVoteAverage) && _cursor.isNull(_cursorIndexOfVoteCount) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfIsFavorite) && _cursor.isNull(_cursorIndexOfGenres))) {
                _tmpMovie = new Movie();
                final String _tmpOriginalLanguage;
                _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
                _tmpMovie.setOriginalLanguage(_tmpOriginalLanguage);
                final long _tmpId;
                _tmpId = _cursor.getLong(_cursorIndexOfId);
                _tmpMovie.setId(_tmpId);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                _tmpMovie.setTitle(_tmpTitle);
                final String _tmpPosterPath;
                _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
                _tmpMovie.setPosterPath(_tmpPosterPath);
                final String _tmpBackdropPath;
                _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
                _tmpMovie.setBackdropPath(_tmpBackdropPath);
                final String _tmpOverview;
                _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
                _tmpMovie.setOverview(_tmpOverview);
                final double _tmpPopularity;
                _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
                _tmpMovie.setPopularity(_tmpPopularity);
                final double _tmpVoteAverage;
                _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
                _tmpMovie.setVoteAverage(_tmpVoteAverage);
                final int _tmpVoteCount;
                _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
                _tmpMovie.setVoteCount(_tmpVoteCount);
                final String _tmpReleaseDate;
                _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
                _tmpMovie.setReleaseDate(_tmpReleaseDate);
                final boolean _tmpIsFavorite;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
                _tmpIsFavorite = _tmp != 0;
                _tmpMovie.setFavorite(_tmpIsFavorite);
                final List<Genre> _tmpGenres;
                final String _tmp_1;
                _tmp_1 = _cursor.getString(_cursorIndexOfGenres);
                _tmpGenres = Converters.toGenresList(_tmp_1);
                _tmpMovie.setGenres(_tmpGenres);
              }  else  {
                _tmpMovie = null;
              }
              ArrayList<Trailer> _tmpTrailersCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_3 = _cursor.getLong(_cursorIndexOfId);
                _tmpTrailersCollection_1 = _collectionTrailers.get(_tmpKey_3);
              }
              if (_tmpTrailersCollection_1 == null) {
                _tmpTrailersCollection_1 = new ArrayList<Trailer>();
              }
              ArrayList<Cast> _tmpCastListCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_4 = _cursor.getLong(_cursorIndexOfId);
                _tmpCastListCollection_1 = _collectionCastList.get(_tmpKey_4);
              }
              if (_tmpCastListCollection_1 == null) {
                _tmpCastListCollection_1 = new ArrayList<Cast>();
              }
              ArrayList<Review> _tmpReviewsCollection_1 = null;
              if (!_cursor.isNull(_cursorIndexOfId)) {
                final long _tmpKey_5 = _cursor.getLong(_cursorIndexOfId);
                _tmpReviewsCollection_1 = _collectionReviews.get(_tmpKey_5);
              }
              if (_tmpReviewsCollection_1 == null) {
                _tmpReviewsCollection_1 = new ArrayList<Review>();
              }
              _result = new MovieDetails(_tmpMovie,_tmpTrailersCollection_1,_tmpCastListCollection_1,_tmpReviewsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Movie>> getAllFavoriteMovies() {
    final String _sql = "SELECT * FROM movie WHERE is_favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            _item = new Movie();
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            _item.setOriginalLanguage(_tmpOriginalLanguage);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            _item.setPosterPath(_tmpPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            _item.setBackdropPath(_tmpBackdropPath);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            _item.setOverview(_tmpOverview);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            _item.setPopularity(_tmpPopularity);
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            _item.setVoteAverage(_tmpVoteAverage);
            final int _tmpVoteCount;
            _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            _item.setVoteCount(_tmpVoteCount);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            _item.setReleaseDate(_tmpReleaseDate);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item.setFavorite(_tmpIsFavorite);
            final List<Genre> _tmpGenres;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfGenres);
            _tmpGenres = Converters.toGenresList(_tmp_1);
            _item.setGenres(_tmpGenres);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshiptrailerAscomAjdiYassinPopularmoviesDataLocalModelTrailer(final LongSparseArray<ArrayList<Trailer>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Trailer>> _tmpInnerMap = new LongSparseArray<ArrayList<Trailer>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _mapIndex = 0;
      int _tmpIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshiptrailerAscomAjdiYassinPopularmoviesDataLocalModelTrailer(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Trailer>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshiptrailerAscomAjdiYassinPopularmoviesDataLocalModelTrailer(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`movie_id`,`key`,`site`,`title` FROM `trailer` WHERE `movie_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "movie_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
      final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
      final int _cursorIndexOfSite = CursorUtil.getColumnIndexOrThrow(_cursor, "site");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final long _tmpKey = _cursor.getLong(_itemKeyIndex);
          ArrayList<Trailer> _tmpCollection = _map.get(_tmpKey);
          if (_tmpCollection != null) {
            final Trailer _item_1;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final long _tmpMovieId;
            _tmpMovieId = _cursor.getLong(_cursorIndexOfMovieId);
            final String _tmpKey_1;
            _tmpKey_1 = _cursor.getString(_cursorIndexOfKey);
            final String _tmpSite;
            _tmpSite = _cursor.getString(_cursorIndexOfSite);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item_1 = new Trailer(_tmpId,_tmpMovieId,_tmpKey_1,_tmpSite,_tmpTitle);
            _tmpCollection.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipcastAscomAjdiYassinPopularmoviesDataLocalModelCast(final LongSparseArray<ArrayList<Cast>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Cast>> _tmpInnerMap = new LongSparseArray<ArrayList<Cast>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _mapIndex = 0;
      int _tmpIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipcastAscomAjdiYassinPopularmoviesDataLocalModelCast(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Cast>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipcastAscomAjdiYassinPopularmoviesDataLocalModelCast(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`movie_id`,`characterName`,`gender`,`actorName`,`order`,`profileImagePath` FROM `cast` WHERE `movie_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "movie_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
      final int _cursorIndexOfCharacterName = CursorUtil.getColumnIndexOrThrow(_cursor, "characterName");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfActorName = CursorUtil.getColumnIndexOrThrow(_cursor, "actorName");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "order");
      final int _cursorIndexOfProfileImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "profileImagePath");
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final long _tmpKey = _cursor.getLong(_itemKeyIndex);
          ArrayList<Cast> _tmpCollection = _map.get(_tmpKey);
          if (_tmpCollection != null) {
            final Cast _item_1;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final long _tmpMovieId;
            _tmpMovieId = _cursor.getLong(_cursorIndexOfMovieId);
            final String _tmpCharacterName;
            _tmpCharacterName = _cursor.getString(_cursorIndexOfCharacterName);
            final int _tmpGender;
            _tmpGender = _cursor.getInt(_cursorIndexOfGender);
            final String _tmpActorName;
            _tmpActorName = _cursor.getString(_cursorIndexOfActorName);
            final int _tmpOrder;
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
            final String _tmpProfileImagePath;
            _tmpProfileImagePath = _cursor.getString(_cursorIndexOfProfileImagePath);
            _item_1 = new Cast(_tmpId,_tmpMovieId,_tmpCharacterName,_tmpGender,_tmpActorName,_tmpOrder,_tmpProfileImagePath);
            _tmpCollection.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipreviewAscomAjdiYassinPopularmoviesDataLocalModelReview(final LongSparseArray<ArrayList<Review>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<Review>> _tmpInnerMap = new LongSparseArray<ArrayList<Review>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _mapIndex = 0;
      int _tmpIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipreviewAscomAjdiYassinPopularmoviesDataLocalModelReview(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<Review>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipreviewAscomAjdiYassinPopularmoviesDataLocalModelReview(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`movie_id`,`author`,`content`,`url` FROM `review` WHERE `movie_id` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "movie_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final long _tmpKey = _cursor.getLong(_itemKeyIndex);
          ArrayList<Review> _tmpCollection = _map.get(_tmpKey);
          if (_tmpCollection != null) {
            final Review _item_1;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final long _tmpMovieId;
            _tmpMovieId = _cursor.getLong(_cursorIndexOfMovieId);
            final String _tmpAuthor;
            _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            final String _tmpContent;
            _tmpContent = _cursor.getString(_cursorIndexOfContent);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _item_1 = new Review(_tmpId,_tmpMovieId,_tmpAuthor,_tmpContent,_tmpUrl);
            _tmpCollection.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
