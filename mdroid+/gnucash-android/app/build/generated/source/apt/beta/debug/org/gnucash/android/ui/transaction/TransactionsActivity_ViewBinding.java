// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.common.BaseDrawerActivity_ViewBinding;

public class TransactionsActivity_ViewBinding extends BaseDrawerActivity_ViewBinding {
  private TransactionsActivity target;

  @UiThread
  public TransactionsActivity_ViewBinding(TransactionsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TransactionsActivity_ViewBinding(TransactionsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'mViewPager'", ViewPager.class);
    target.mToolbarSpinner = Utils.findRequiredViewAsType(source, R.id.toolbar_spinner, "field 'mToolbarSpinner'", Spinner.class);
    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", TabLayout.class);
    target.mSumTextView = Utils.findRequiredViewAsType(source, R.id.transactions_sum, "field 'mSumTextView'", TextView.class);
    target.mCreateFloatingButton = Utils.findRequiredViewAsType(source, R.id.fab_create_transaction, "field 'mCreateFloatingButton'", FloatingActionButton.class);
  }

  @Override
  public void unbind() {
    TransactionsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mViewPager = null;
    target.mToolbarSpinner = null;
    target.mTabLayout = null;
    target.mSumTextView = null;
    target.mCreateFloatingButton = null;

    super.unbind();
  }
}
