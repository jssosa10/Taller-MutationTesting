// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class BudgetListFragment$BudgetRecyclerAdapter$BudgetViewHolder_ViewBinding implements Unbinder {
  private BudgetListFragment.BudgetRecyclerAdapter.BudgetViewHolder target;

  @UiThread
  public BudgetListFragment$BudgetRecyclerAdapter$BudgetViewHolder_ViewBinding(BudgetListFragment.BudgetRecyclerAdapter.BudgetViewHolder target,
      View source) {
    this.target = target;

    target.budgetName = Utils.findRequiredViewAsType(source, R.id.primary_text, "field 'budgetName'", TextView.class);
    target.accountName = Utils.findRequiredViewAsType(source, R.id.secondary_text, "field 'accountName'", TextView.class);
    target.budgetAmount = Utils.findRequiredViewAsType(source, R.id.budget_amount, "field 'budgetAmount'", TextView.class);
    target.optionsMenu = Utils.findRequiredViewAsType(source, R.id.options_menu, "field 'optionsMenu'", ImageView.class);
    target.budgetIndicator = Utils.findRequiredViewAsType(source, R.id.budget_indicator, "field 'budgetIndicator'", ProgressBar.class);
    target.budgetRecurrence = Utils.findRequiredViewAsType(source, R.id.budget_recurrence, "field 'budgetRecurrence'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetListFragment.BudgetRecyclerAdapter.BudgetViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.budgetName = null;
    target.accountName = null;
    target.budgetAmount = null;
    target.optionsMenu = null;
    target.budgetIndicator = null;
    target.budgetRecurrence = null;
  }
}
