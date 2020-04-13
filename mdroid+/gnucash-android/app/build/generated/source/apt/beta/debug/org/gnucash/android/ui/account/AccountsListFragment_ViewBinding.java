// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.account;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.util.widget.EmptyRecyclerView;

public class AccountsListFragment_ViewBinding implements Unbinder {
  private AccountsListFragment target;

  @UiThread
  public AccountsListFragment_ViewBinding(AccountsListFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.account_recycler_view, "field 'mRecyclerView'", EmptyRecyclerView.class);
    target.mEmptyTextView = Utils.findRequiredViewAsType(source, R.id.empty_view, "field 'mEmptyTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AccountsListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mEmptyTextView = null;
  }
}
