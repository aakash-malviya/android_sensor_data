// Generated by view binder compiler. Do not edit!
package com.example.visualizationofsensordata.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.ImageButton;
import com.example.visualizationofsensordata.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Activity3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton c1;

  @NonNull
  public final ImageButton h1;

  @NonNull
  public final ImageButton t1;

  private Activity3Binding(@NonNull ConstraintLayout rootView, @NonNull ImageButton c1,
      @NonNull ImageButton h1, @NonNull ImageButton t1) {
    this.rootView = rootView;
    this.c1 = c1;
    this.h1 = h1;
    this.t1 = t1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Activity3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Activity3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Activity3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.c1;
      ImageButton c1 = ViewBindings.findChildViewById(rootView, id);
      if (c1 == null) {
        break missingId;
      }

      id = R.id.h1;
      ImageButton h1 = ViewBindings.findChildViewById(rootView, id);
      if (h1 == null) {
        break missingId;
      }

      id = R.id.t1;
      ImageButton t1 = ViewBindings.findChildViewById(rootView, id);
      if (t1 == null) {
        break missingId;
      }

      return new Activity3Binding((ConstraintLayout) rootView, c1, h1, t1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
