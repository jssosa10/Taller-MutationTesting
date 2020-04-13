// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.util.widget.EmptyRecyclerView;

public class TransactionsListFragment_ViewBinding implements Unbinder {
  private TransactionsListFragment target;

  @UiThread
  public TransactionsListFragment_ViewBinding(TransactionsListFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.transaction_recycler_view, "field 'mRecyclerView'", EmptyRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionsListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
