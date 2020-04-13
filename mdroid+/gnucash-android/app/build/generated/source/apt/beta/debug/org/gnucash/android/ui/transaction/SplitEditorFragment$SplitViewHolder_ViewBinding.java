// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
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

public class SplitEditorFragment$SplitViewHolder_ViewBinding implements Unbinder {
  private SplitEditorFragment.SplitViewHolder target;

  @UiThread
  public SplitEditorFragment$SplitViewHolder_ViewBinding(SplitEditorFragment.SplitViewHolder target,
      View source) {
    this.target = target;

    target.splitMemoEditText = Utils.findRequiredViewAsType(source, R.id.input_split_memo, "field 'splitMemoEditText'", EditText.class);
    target.splitAmountEditText = Utils.findRequiredViewAsType(source, R.id.input_split_amount, "field 'splitAmountEditText'", CalculatorEditText.class);
    target.removeSplitButton = Utils.findRequiredViewAsType(source, R.id.btn_remove_split, "field 'removeSplitButton'", ImageView.class);
    target.accountsSpinner = Utils.findRequiredViewAsType(source, R.id.input_accounts_spinner, "field 'accountsSpinner'", Spinner.class);
    target.splitCurrencyTextView = Utils.findRequiredViewAsType(source, R.id.split_currency_symbol, "field 'splitCurrencyTextView'", TextView.class);
    target.splitUidTextView = Utils.findRequiredViewAsType(source, R.id.split_uid, "field 'splitUidTextView'", TextView.class);
    target.splitTypeSwitch = Utils.findRequiredViewAsType(source, R.id.btn_split_type, "field 'splitTypeSwitch'", TransactionTypeSwitch.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplitEditorFragment.SplitViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.splitMemoEditText = null;
    target.splitAmountEditText = null;
    target.removeSplitButton = null;
    target.accountsSpinner = null;
    target.splitCurrencyTextView = null;
    target.splitUidTextView = null;
    target.splitTypeSwitch = null;
  }
}
