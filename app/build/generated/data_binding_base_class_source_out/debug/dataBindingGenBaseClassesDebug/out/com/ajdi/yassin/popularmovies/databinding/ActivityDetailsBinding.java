// Generated by data binding compiler. Do not edit!
package com.ajdi.yassin.popularmovies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ajdi.yassin.popularmovies.R;
import com.ajdi.yassin.popularmovies.data.local.model.MovieDetails;
import com.ajdi.yassin.popularmovies.data.local.model.Resource;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final ImageView imageMovieBackdrop;

  @NonNull
  public final NestedScrollView movieDetails;

  @NonNull
  public final PartialDetailsInfoBinding movieDetailsInfo;

  @NonNull
  public final ItemNetworkStateBinding networkState;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected MovieDetails mMovieDetails;

  @Bindable
  protected Resource mResource;

  protected ActivityDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appbar, CollapsingToolbarLayout collapsingToolbar,
      CoordinatorLayout coordinatorLayout, ImageView imageMovieBackdrop,
      NestedScrollView movieDetails, PartialDetailsInfoBinding movieDetailsInfo,
      ItemNetworkStateBinding networkState, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.coordinatorLayout = coordinatorLayout;
    this.imageMovieBackdrop = imageMovieBackdrop;
    this.movieDetails = movieDetails;
    this.movieDetailsInfo = movieDetailsInfo;
    setContainedBinding(this.movieDetailsInfo);
    this.networkState = networkState;
    setContainedBinding(this.networkState);
    this.toolbar = toolbar;
  }

  public abstract void setMovieDetails(@Nullable MovieDetails movieDetails);

  @Nullable
  public MovieDetails getMovieDetails() {
    return mMovieDetails;
  }

  public abstract void setResource(@Nullable Resource resource);

  @Nullable
  public Resource getResource() {
    return mResource;
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailsBinding>inflateInternal(inflater, R.layout.activity_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailsBinding>inflateInternal(inflater, R.layout.activity_details, null, false, component);
  }

  public static ActivityDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailsBinding)bind(component, view, R.layout.activity_details);
  }
}
