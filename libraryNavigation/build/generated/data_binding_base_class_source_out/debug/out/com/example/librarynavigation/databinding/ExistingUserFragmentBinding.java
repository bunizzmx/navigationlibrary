// Generated by view binder compiler. Do not edit!
package com.example.librarynavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
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

public final class ExistingUserFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton closeFragment;

  @NonNull
  public final ContentLoadingProgressBar contentLoadingProgressBar;

  @NonNull
  public final ConstraintLayout fragmentExisitng;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final TextView txt1;

  private ExistingUserFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton closeFragment,
      @NonNull ContentLoadingProgressBar contentLoadingProgressBar,
      @NonNull ConstraintLayout fragmentExisitng, @NonNull LinearLayout linearLayout2,
      @NonNull TextView txt1) {
    this.rootView = rootView;
    this.closeFragment = closeFragment;
    this.contentLoadingProgressBar = contentLoadingProgressBar;
    this.fragmentExisitng = fragmentExisitng;
    this.linearLayout2 = linearLayout2;
    this.txt1 = txt1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExistingUserFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExistingUserFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.existing_user_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExistingUserFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close_fragment;
      ImageButton closeFragment = ViewBindings.findChildViewById(rootView, id);
      if (closeFragment == null) {
        break missingId;
      }

      id = R.id.contentLoadingProgressBar;
      ContentLoadingProgressBar contentLoadingProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (contentLoadingProgressBar == null) {
        break missingId;
      }

      ConstraintLayout fragmentExisitng = (ConstraintLayout) rootView;

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.txt1;
      TextView txt1 = ViewBindings.findChildViewById(rootView, id);
      if (txt1 == null) {
        break missingId;
      }

      return new ExistingUserFragmentBinding((ConstraintLayout) rootView, closeFragment,
          contentLoadingProgressBar, fragmentExisitng, linearLayout2, txt1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
