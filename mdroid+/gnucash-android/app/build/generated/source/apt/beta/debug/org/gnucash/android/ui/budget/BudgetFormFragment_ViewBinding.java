// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

import android.inputmethodservice.KeyboardView;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.util.widget.CalculatorEditText;

public class BudgetFormFragment_ViewBinding implements Unbinder {
  private BudgetFormFragment target;

  private View view2131296309;

  private View view2131296511;

  @UiThread
  public BudgetFormFragment_ViewBinding(final BudgetFormFragment target, View source) {
    this.target = target;

    View view;
    target.mBudgetNameInput = Utils.findRequiredViewAsType(source, R.id.input_budget_name, "field 'mBudgetNameInput'", EditText.class);
    target.mDescriptionInput = Utils.findRequiredViewAsType(source, R.id.input_description, "field 'mDescriptionInput'", EditText.class);
    target.mRecurrenceInput = Utils.findRequiredViewAsType(source, R.id.input_recurrence, "field 'mRecurrenceInput'", TextView.class);
    target.mNameTextInputLayout = Utils.findRequiredViewAsType(source, R.id.name_text_input_layout, "field 'mNameTextInputLayout'", TextInputLayout.class);
    target.mKeyboardView = Utils.findRequiredViewAsType(source, R.id.calculator_keyboard, "field 'mKeyboardView'", KeyboardView.class);
    target.mBudgetAmountInput = Utils.findRequiredViewAsType(source, R.id.input_budget_amount, "field 'mBudgetAmountInput'", CalculatorEditText.class);
    target.mBudgetAccountSpinner = Utils.findRequiredViewAsType(source, R.id.input_budget_account_spinner, "field 'mBudgetAccountSpinner'", Spinner.class);
    view = Utils.findRequiredView(source, R.id.btn_add_budget_amount, "field 'mAddBudgetAmount' and method 'onOpenBudgetAmountEditor'");
    target.mAddBudgetAmount = Utils.castView(view, R.id.btn_add_budget_amount, "field 'mAddBudgetAmount'", Button.class);
    view2131296309 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOpenBudgetAmountEditor(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.input_start_date, "field 'mStartDateInput' and method 'onClickBudgetStartDate'");
    target.mStartDateInput = Utils.castView(view, R.id.input_start_date, "field 'mStartDateInput'", TextView.class);
    view2131296511 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickBudgetStartDate(p0);
      }
    });
    target.mBudgetAmountLayout = Utils.findRequiredView(source, R.id.budget_amount_layout, "field 'mBudgetAmountLayout'");
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetFormFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBudgetNameInput = null;
    target.mDescriptionInput = null;
    target.mRecurrenceInput = null;
    target.mNameTextInputLayout = null;
    target.mKeyboardView = null;
    target.mBudgetAmountInput = null;
    target.mBudgetAccountSpinner = null;
    target.mAddBudgetAmount = null;
    target.mStartDateInput = null;
    target.mBudgetAmountLayout = null;

    view2131296309.setOnClickListener(null);
    view2131296309 = null;
    view2131296511.setOnClickListener(null);
    view2131296511 = null;
  }
}
