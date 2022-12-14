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

public final class Activity5Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton c3;

  @NonNull
  public final ImageButton h3;

  @NonNull
  public final ImageButton t3;

  private Activity5Binding(@NonNull ConstraintLayout rootView, @NonNull ImageButton c3,
      @NonNull ImageButton h3, @NonNull ImageButton t3) {
    this.rootView = rootView;
    this.c3 = c3;
    this.h3 = h3;
    this.t3 = t3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Activity5Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Activity5Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_5, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Activity5Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.c3;
      ImageButton c3 = ViewBindings.findChildViewById(rootView, id);
      if (c3 == null) {
        break missingId;
      }

      id = R.id.h3;
      ImageButton h3 = ViewBindings.findChildViewById(rootView, id);
      if (h3 == null) {
        break missingId;
      }

      id = R.id.t3;
      ImageButton t3 = ViewBindings.findChildViewById(rootView, id);
      if (t3 == null) {
        break missingId;
      }

      return new Activity5Binding((ConstraintLayout) rootView, c3, h3, t3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
