// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.util.widget.CalculatorEditText;

public class BudgetAmountEditorFragment$BudgetAmountViewHolder_ViewBinding implements Unbinder {
  private BudgetAmountEditorFragment.BudgetAmountViewHolder target;

  @UiThread
  public BudgetAmountEditorFragment$BudgetAmountViewHolder_ViewBinding(BudgetAmountEditorFragment.BudgetAmountViewHolder target,
      View source) {
    this.target = target;

    target.currencySymbolTextView = Utils.findRequiredViewAsType(source, R.id.currency_symbol, "field 'currencySymbolTextView'", TextView.class);
    target.amountEditText = Utils.findRequiredViewAsType(source, R.id.input_budget_amount, "field 'amountEditText'", CalculatorEditText.class);
    target.removeItemBtn = Utils.findRequiredViewAsType(source, R.id.btn_remove_item, "field 'removeItemBtn'", ImageView.class);
    target.budgetAccountSpinner = Utils.findRequiredViewAsType(source, R.id.input_budget_account_spinner, "field 'budgetAccountSpinner'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetAmountEditorFragment.BudgetAmountViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.currencySymbolTextView = null;
    target.amountEditText = null;
    target.removeItemBtn = null;
    target.budgetAccountSpinner = null;
  }
}
