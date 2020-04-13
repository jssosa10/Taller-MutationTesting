// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

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

public class BudgetDetailFragment_ViewBinding implements Unbinder {
  private BudgetDetailFragment target;

  @UiThread
  public BudgetDetailFragment_ViewBinding(BudgetDetailFragment target, View source) {
    this.target = target;

    target.mBudgetNameTextView = Utils.findRequiredViewAsType(source, R.id.primary_text, "field 'mBudgetNameTextView'", TextView.class);
    target.mBudgetDescriptionTextView = Utils.findRequiredViewAsType(source, R.id.secondary_text, "field 'mBudgetDescriptionTextView'", TextView.class);
    target.mBudgetRecurrence = Utils.findRequiredViewAsType(source, R.id.budget_recurrence, "field 'mBudgetRecurrence'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.budget_amount_recycler, "field 'mRecyclerView'", EmptyRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBudgetNameTextView = null;
    target.mBudgetDescriptionTextView = null;
    target.mBudgetRecurrence = null;
    target.mRecyclerView = null;
  }
}
