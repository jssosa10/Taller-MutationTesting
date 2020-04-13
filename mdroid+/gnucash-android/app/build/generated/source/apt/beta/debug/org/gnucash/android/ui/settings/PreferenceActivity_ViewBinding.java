// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.settings;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class PreferenceActivity_ViewBinding implements Unbinder {
  private PreferenceActivity target;

  @UiThread
  public PreferenceActivity_ViewBinding(PreferenceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PreferenceActivity_ViewBinding(PreferenceActivity target, View source) {
    this.target = target;

    target.mSlidingPaneLayout = Utils.findRequiredViewAsType(source, R.id.slidingpane_layout, "field 'mSlidingPaneLayout'", SlidingPaneLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PreferenceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSlidingPaneLayout = null;
  }
}
