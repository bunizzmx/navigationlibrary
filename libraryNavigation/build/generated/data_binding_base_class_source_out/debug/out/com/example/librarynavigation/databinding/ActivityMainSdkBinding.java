// Generated by view binder compiler. Do not edit!
package com.example.librarynavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.librarynavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainSdkBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintProgress;

  @NonNull
  public final ConstraintLayout constraintToolbar;

  @NonNull
  public final ContentLoadingProgressBar contentLoadingProgressBar;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final TextView textProgress;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainSdkBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintProgress, @NonNull ConstraintLayout constraintToolbar,
      @NonNull ContentLoadingProgressBar contentLoadingProgressBar,
      @NonNull ImageButton imageButton, @NonNull TextView textProgress, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.constraintProgress = constraintProgress;
    this.constraintToolbar = constraintToolbar;
    this.contentLoadingProgressBar = contentLoadingProgressBar;
    this.imageButton = imageButton;
    this.textProgress = textProgress;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainSdkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainSdkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_sdk, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainSdkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraint_progress;
      ConstraintLayout constraintProgress = ViewBindings.findChildViewById(rootView, id);
      if (constraintProgress == null) {
        break missingId;
      }

      id = R.id.constraint_toolbar;
      ConstraintLayout constraintToolbar = ViewBindings.findChildViewById(rootView, id);
      if (constraintToolbar == null) {
        break missingId;
      }

      id = R.id.contentLoadingProgressBar;
      ContentLoadingProgressBar contentLoadingProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (contentLoadingProgressBar == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.text_progress;
      TextView textProgress = ViewBindings.findChildViewById(rootView, id);
      if (textProgress == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainSdkBinding((ConstraintLayout) rootView, constraintProgress,
          constraintToolbar, contentLoadingProgressBar, imageButton, textProgress, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}