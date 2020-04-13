// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.inputmethodservice.KeyboardView;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.util.widget.CalculatorEditText;
import org.gnucash.android.ui.util.widget.TransactionTypeSwitch;

public class TransactionFormFragment_ViewBinding implements Unbinder {
  private TransactionFormFragment target;

  @UiThread
  public TransactionFormFragment_ViewBinding(TransactionFormFragment target, View source) {
    this.target = target;

    target.mTransactionTypeSwitch = Utils.findRequiredViewAsType(source, R.id.input_transaction_type, "field 'mTransactionTypeSwitch'", TransactionTypeSwitch.class);
    target.mDescriptionEditText = Utils.findRequiredViewAsType(source, R.id.input_transaction_name, "field 'mDescriptionEditText'", AutoCompleteTextView.class);
    target.mAmountEditText = Utils.findRequiredViewAsType(source, R.id.input_transaction_amount, "field 'mAmountEditText'", CalculatorEditText.class);
    target.mCurrencyTextView = Utils.findRequiredViewAsType(source, R.id.currency_symbol, "field 'mCurrencyTextView'", TextView.class);
    target.mNotesEditText = Utils.findRequiredViewAsType(source, R.id.input_description, "field 'mNotesEditText'", EditText.class);
    target.mDateTextView = Utils.findRequiredViewAsType(source, R.id.input_date, "field 'mDateTextView'", TextView.class);
    target.mTimeTextView = Utils.findRequiredViewAsType(source, R.id.input_time, "field 'mTimeTextView'", TextView.class);
    target.mTransferAccountSpinner = Utils.findRequiredViewAsType(source, R.id.input_transfer_account_spinner, "field 'mTransferAccountSpinner'", Spinner.class);
    target.mSaveTemplateCheckbox = Utils.findRequiredViewAsType(source, R.id.checkbox_save_template, "field 'mSaveTemplateCheckbox'", CheckBox.class);
    target.mRecurrenceTextView = Utils.findRequiredViewAsType(source, R.id.input_recurrence, "field 'mRecurrenceTextView'", TextView.class);
    target.mKeyboardView = Utils.findRequiredViewAsType(source, R.id.calculator_keyboard, "field 'mKeyboardView'", KeyboardView.class);
    target.mOpenSplitEditor = Utils.findRequiredViewAsType(source, R.id.btn_split_editor, "field 'mOpenSplitEditor'", ImageView.class);
    target.mDoubleEntryLayout = Utils.findRequiredView(source, R.id.layout_double_entry, "field 'mDoubleEntryLayout'");
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionFormFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTransactionTypeSwitch = null;
    target.mDescriptionEditText = null;
    target.mAmountEditText = null;
    target.mCurrencyTextView = null;
    target.mNotesEditText = null;
    target.mDateTextView = null;
    target.mTimeTextView = null;
    target.mTransferAccountSpinner = null;
    target.mSaveTemplateCheckbox = null;
    target.mRecurrenceTextView = null;
    target.mKeyboardView = null;
    target.mOpenSplitEditor = null;
    target.mDoubleEntryLayout = null;
  }
}
