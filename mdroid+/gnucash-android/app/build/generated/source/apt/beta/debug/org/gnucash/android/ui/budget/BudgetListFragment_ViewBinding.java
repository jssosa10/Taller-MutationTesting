// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.util.widget.EmptyRecyclerView;

public class BudgetListFragment_ViewBinding implements Unbinder {
  private BudgetListFragment target;

  @UiThread
  public BudgetListFragment_ViewBinding(BudgetListFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.budget_recycler_view, "field 'mRecyclerView'", EmptyRecyclerView.class);
    target.mProposeBudgets = Utils.findRequiredViewAsType(source, R.id.empty_view, "field 'mProposeBudgets'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mProposeBudgets = null;
  }
}
