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

public final class Activity4Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton c2;

  @NonNull
  public final ImageButton h2;

  @NonNull
  public final ImageButton t2;

  private Activity4Binding(@NonNull ConstraintLayout rootView, @NonNull ImageButton c2,
      @NonNull ImageButton h2, @NonNull ImageButton t2) {
    this.rootView = rootView;
    this.c2 = c2;
    this.h2 = h2;
    this.t2 = t2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Activity4Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Activity4Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_4, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Activity4Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.c2;
      ImageButton c2 = ViewBindings.findChildViewById(rootView, id);
      if (c2 == null) {
        break missingId;
      }

      id = R.id.h2;
      ImageButton h2 = ViewBindings.findChildViewById(rootView, id);
      if (h2 == null) {
        break missingId;
      }

      id = R.id.t2;
      ImageButton t2 = ViewBindings.findChildViewById(rootView, id);
      if (t2 == null) {
        break missingId;
      }

      return new Activity4Binding((ConstraintLayout) rootView, c2, h2, t2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
