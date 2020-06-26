package com.ajdi.yassin.popularmovies.databinding;
import com.ajdi.yassin.popularmovies.R;
import com.ajdi.yassin.popularmovies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PartialDetailsInfoBindingImpl extends PartialDetailsInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline, 15);
        sViewsWithIds.put(R.id.card_poster, 16);
        sViewsWithIds.put(R.id.barrier2, 17);
        sViewsWithIds.put(R.id.view_divider, 18);
        sViewsWithIds.put(R.id.label_release_date, 19);
        sViewsWithIds.put(R.id.label_language, 20);
        sViewsWithIds.put(R.id.view_divider_bottom, 21);
        sViewsWithIds.put(R.id.label_overview, 22);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PartialDetailsInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private PartialDetailsInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (com.google.android.material.chip.ChipGroup) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[21]
            );
        this.chipGroup.setTag(null);
        this.imagePoster.setTag(null);
        this.labelCast.setTag(null);
        this.labelReviews.setTag(null);
        this.labelTrailers.setTag(null);
        this.labelVote.setTag(null);
        this.listCast.setTag(null);
        this.listReviews.setTag(null);
        this.listTrailers.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textLanguage.setTag(null);
        this.textOverview.setTag(null);
        this.textReleaseDate.setTag(null);
        this.textTitle.setTag(null);
        this.textVote.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movieDetails == variableId) {
            setMovieDetails((com.ajdi.yassin.popularmovies.data.local.model.MovieDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovieDetails(@Nullable com.ajdi.yassin.popularmovies.data.local.model.MovieDetails MovieDetails) {
        this.mMovieDetails = MovieDetails;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movieDetails);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String labelVoteAndroidStringLabelVotesMovieDetailsMovieVoteCount = null;
        java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Trailer> movieDetailsTrailers = null;
        int movieDetailsTrailersSize = 0;
        java.lang.String movieDetailsMoviePosterPath = null;
        java.lang.String movieDetailsMovieReleaseDate = null;
        java.lang.String movieDetailsMovieOverview = null;
        java.lang.String stringValueOfMovieDetailsMovieVoteAverage = null;
        java.lang.String movieDetailsMovieOriginalLanguage = null;
        java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Cast> movieDetailsCastList = null;
        boolean movieDetailsTrailersSizeInt0 = false;
        com.ajdi.yassin.popularmovies.data.local.model.MovieDetails movieDetails = mMovieDetails;
        java.lang.String movieDetailsMovieTitle = null;
        int movieDetailsReviewsSize = 0;
        com.ajdi.yassin.popularmovies.data.local.model.Movie movieDetailsMovie = null;
        double movieDetailsMovieVoteAverage = 0.0;
        boolean movieDetailsReviewsSizeInt0 = false;
        java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Genre> movieDetailsMovieGenres = null;
        boolean movieDetailsCastListSizeInt0 = false;
        int movieDetailsMovieVoteCount = 0;
        int movieDetailsCastListSize = 0;
        boolean movieDetailsMovieGenresJavaLangObjectNull = false;
        java.util.List<com.ajdi.yassin.popularmovies.data.local.model.Review> movieDetailsReviews = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movieDetails != null) {
                    // read movieDetails.trailers
                    movieDetailsTrailers = movieDetails.getTrailers();
                    // read movieDetails.castList
                    movieDetailsCastList = movieDetails.getCastList();
                    // read movieDetails.movie
                    movieDetailsMovie = movieDetails.getMovie();
                    // read movieDetails.reviews
                    movieDetailsReviews = movieDetails.getReviews();
                }


                if (movieDetailsTrailers != null) {
                    // read movieDetails.trailers.size
                    movieDetailsTrailersSize = movieDetailsTrailers.size();
                }
                if (movieDetailsCastList != null) {
                    // read movieDetails.castList.size
                    movieDetailsCastListSize = movieDetailsCastList.size();
                }
                if (movieDetailsMovie != null) {
                    // read movieDetails.movie.posterPath
                    movieDetailsMoviePosterPath = movieDetailsMovie.getPosterPath();
                    // read movieDetails.movie.releaseDate
                    movieDetailsMovieReleaseDate = movieDetailsMovie.getReleaseDate();
                    // read movieDetails.movie.overview
                    movieDetailsMovieOverview = movieDetailsMovie.getOverview();
                    // read movieDetails.movie.originalLanguage
                    movieDetailsMovieOriginalLanguage = movieDetailsMovie.getOriginalLanguage();
                    // read movieDetails.movie.title
                    movieDetailsMovieTitle = movieDetailsMovie.getTitle();
                    // read movieDetails.movie.voteAverage
                    movieDetailsMovieVoteAverage = movieDetailsMovie.getVoteAverage();
                    // read movieDetails.movie.genres
                    movieDetailsMovieGenres = movieDetailsMovie.getGenres();
                    // read movieDetails.movie.voteCount
                    movieDetailsMovieVoteCount = movieDetailsMovie.getVoteCount();
                }
                if (movieDetailsReviews != null) {
                    // read movieDetails.reviews.size
                    movieDetailsReviewsSize = movieDetailsReviews.size();
                }


                // read movieDetails.trailers.size > 0
                movieDetailsTrailersSizeInt0 = (movieDetailsTrailersSize) > (0);
                // read movieDetails.castList.size > 0
                movieDetailsCastListSizeInt0 = (movieDetailsCastListSize) > (0);
                // read String.valueOf(movieDetails.movie.voteAverage)
                stringValueOfMovieDetailsMovieVoteAverage = java.lang.String.valueOf(movieDetailsMovieVoteAverage);
                // read movieDetails.movie.genres != null
                movieDetailsMovieGenresJavaLangObjectNull = (movieDetailsMovieGenres) != (null);
                // read @android:string/label_votes
                labelVoteAndroidStringLabelVotesMovieDetailsMovieVoteCount = labelVote.getResources().getString(R.string.label_votes, movieDetailsMovieVoteCount);
                // read movieDetails.reviews.size > 0
                movieDetailsReviewsSizeInt0 = (movieDetailsReviewsSize) > (0);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.setItems(this.chipGroup, movieDetailsMovieGenres);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.chipGroup, movieDetailsMovieGenresJavaLangObjectNull);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.bindImage(this.imagePoster, movieDetailsMoviePosterPath);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.labelCast, movieDetailsCastListSizeInt0);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.labelReviews, movieDetailsReviewsSizeInt0);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.labelTrailers, movieDetailsTrailersSizeInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.labelVote, labelVoteAndroidStringLabelVotesMovieDetailsMovieVoteCount);
            com.ajdi.yassin.popularmovies.ui.moviedetails.cast.CastBinding.setItems(this.listCast, movieDetailsCastList);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.listCast, movieDetailsCastListSizeInt0);
            com.ajdi.yassin.popularmovies.ui.moviedetails.reviews.ReviewsBinding.setItems(this.listReviews, movieDetailsReviews);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.listReviews, movieDetailsReviewsSizeInt0);
            com.ajdi.yassin.popularmovies.ui.moviedetails.trailers.TrailersListBindings.setItems(this.listTrailers, movieDetailsTrailers);
            com.ajdi.yassin.popularmovies.ui.moviedetails.BindingAdapters.showHide(this.listTrailers, movieDetailsTrailersSizeInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textLanguage, movieDetailsMovieOriginalLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textOverview, movieDetailsMovieOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textReleaseDate, movieDetailsMovieReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textTitle, movieDetailsMovieTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textVote, stringValueOfMovieDetailsMovieVoteAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movieDetails
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}