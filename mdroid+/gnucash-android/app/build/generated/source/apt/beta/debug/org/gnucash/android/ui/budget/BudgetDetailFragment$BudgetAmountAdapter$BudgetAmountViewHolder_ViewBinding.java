// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.BarChart;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class BudgetDetailFragment$BudgetAmountAdapter$BudgetAmountViewHolder_ViewBinding implements Unbinder {
  private BudgetDetailFragment.BudgetAmountAdapter.BudgetAmountViewHolder target;

  @UiThread
  public BudgetDetailFragment$BudgetAmountAdapter$BudgetAmountViewHolder_ViewBinding(BudgetDetailFragment.BudgetAmountAdapter.BudgetAmountViewHolder target,
      View source) {
    this.target = target;

    target.budgetAccount = Utils.findRequiredViewAsType(source, R.id.budget_account, "field 'budgetAccount'", TextView.class);
    target.budgetAmount = Utils.findRequiredViewAsType(source, R.id.budget_amount, "field 'budgetAmount'", TextView.class);
    target.budgetSpent = Utils.findRequiredViewAsType(source, R.id.budget_spent, "field 'budgetSpent'", TextView.class);
    target.budgetLeft = Utils.findRequiredViewAsType(source, R.id.budget_left, "field 'budgetLeft'", TextView.class);
    target.budgetIndicator = Utils.findRequiredViewAsType(source, R.id.budget_indicator, "field 'budgetIndicator'", ProgressBar.class);
    target.budgetChart = Utils.findRequiredViewAsType(source, R.id.budget_chart, "field 'budgetChart'", BarChart.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetDetailFragment.BudgetAmountAdapter.BudgetAmountViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.budgetAccount = null;
    target.budgetAmount = null;
    target.budgetSpent = null;
    target.budgetLeft = null;
    target.budgetIndicator = null;
    target.budgetChart = null;
  }
}
