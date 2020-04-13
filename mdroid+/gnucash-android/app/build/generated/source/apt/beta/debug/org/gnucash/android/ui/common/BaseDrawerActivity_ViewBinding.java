// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.common;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class BaseDrawerActivity_ViewBinding implements Unbinder {
  private BaseDrawerActivity target;

  @UiThread
  public BaseDrawerActivity_ViewBinding(BaseDrawerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseDrawerActivity_ViewBinding(BaseDrawerActivity target, View source) {
    this.target = target;

    target.mDrawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'mDrawerLayout'", DrawerLayout.class);
    target.mNavigationView = Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'mNavigationView'", NavigationView.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mToolbarProgress = Utils.findRequiredViewAsType(source, R.id.toolbar_progress, "field 'mToolbarProgress'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseDrawerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mDrawerLayout = null;
    target.mNavigationView = null;
    target.mToolbar = null;
    target.mToolbarProgress = null;
  }
}
