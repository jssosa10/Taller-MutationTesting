// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.account;

import android.support.annotation.UiThread;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.common.BaseDrawerActivity_ViewBinding;

public class AccountsActivity_ViewBinding extends BaseDrawerActivity_ViewBinding {
  private AccountsActivity target;

  @UiThread
  public AccountsActivity_ViewBinding(AccountsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AccountsActivity_ViewBinding(AccountsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'mViewPager'", ViewPager.class);
    target.mFloatingActionButton = Utils.findRequiredViewAsType(source, R.id.fab_create_account, "field 'mFloatingActionButton'", FloatingActionButton.class);
    target.mCoordinatorLayout = Utils.findRequiredViewAsType(source, R.id.coordinatorLayout, "field 'mCoordinatorLayout'", CoordinatorLayout.class);
  }

  @Override
  public void unbind() {
    AccountsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mViewPager = null;
    target.mFloatingActionButton = null;
    target.mCoordinatorLayout = null;

    super.unbind();
  }
}
