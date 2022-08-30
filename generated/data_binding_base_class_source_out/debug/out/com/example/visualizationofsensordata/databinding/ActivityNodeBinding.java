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
import android.widget.Button;
import com.example.visualizationofsensordata.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNodeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button node1;

  @NonNull
  public final Button node2;

  @NonNull
  public final Button node3;

  private ActivityNodeBinding(@NonNull ConstraintLayout rootView, @NonNull Button node1,
      @NonNull Button node2, @NonNull Button node3) {
    this.rootView = rootView;
    this.node1 = node1;
    this.node2 = node2;
    this.node3 = node3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_node, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.node1;
      Button node1 = ViewBindings.findChildViewById(rootView, id);
      if (node1 == null) {
        break missingId;
      }

      id = R.id.node2;
      Button node2 = ViewBindings.findChildViewById(rootView, id);
      if (node2 == null) {
        break missingId;
      }

      id = R.id.node3;
      Button node3 = ViewBindings.findChildViewById(rootView, id);
      if (node3 == null) {
        break missingId;
      }

      return new ActivityNodeBinding((ConstraintLayout) rootView, node1, node2, node3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
