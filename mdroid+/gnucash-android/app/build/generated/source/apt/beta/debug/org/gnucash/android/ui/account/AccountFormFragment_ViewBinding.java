// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.account;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.colorpicker.ColorSquare;

public class AccountFormFragment_ViewBinding implements Unbinder {
  private AccountFormFragment target;

  @UiThread
  public AccountFormFragment_ViewBinding(AccountFormFragment target, View source) {
    this.target = target;

    target.mNameEditText = Utils.findRequiredViewAsType(source, R.id.input_account_name, "field 'mNameEditText'", EditText.class);
    target.mTextInputLayout = Utils.findRequiredViewAsType(source, R.id.name_text_input_layout, "field 'mTextInputLayout'", TextInputLayout.class);
    target.mCurrencySpinner = Utils.findRequiredViewAsType(source, R.id.input_currency_spinner, "field 'mCurrencySpinner'", Spinner.class);
    target.mParentAccountSpinner = Utils.findRequiredViewAsType(source, R.id.input_parent_account, "field 'mParentAccountSpinner'", Spinner.class);
    target.mParentCheckBox = Utils.findRequiredViewAsType(source, R.id.checkbox_parent_account, "field 'mParentCheckBox'", CheckBox.class);
    target.mAccountTypeSpinner = Utils.findRequiredViewAsType(source, R.id.input_account_type_spinner, "field 'mAccountTypeSpinner'", Spinner.class);
    target.mDefaultTransferAccountCheckBox = Utils.findRequiredViewAsType(source, R.id.checkbox_default_transfer_account, "field 'mDefaultTransferAccountCheckBox'", CheckBox.class);
    target.mDefaultTransferAccountSpinner = Utils.findRequiredViewAsType(source, R.id.input_default_transfer_account, "field 'mDefaultTransferAccountSpinner'", Spinner.class);
    target.mDescriptionEditText = Utils.findRequiredViewAsType(source, R.id.input_account_description, "field 'mDescriptionEditText'", EditText.class);
    target.mPlaceholderCheckBox = Utils.findRequiredViewAsType(source, R.id.checkbox_placeholder_account, "field 'mPlaceholderCheckBox'", CheckBox.class);
    target.mColorSquare = Utils.findRequiredViewAsType(source, R.id.input_color_picker, "field 'mColorSquare'", ColorSquare.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AccountFormFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mNameEditText = null;
    target.mTextInputLayout = null;
    target.mCurrencySpinner = null;
    target.mParentAccountSpinner = null;
    target.mParentCheckBox = null;
    target.mAccountTypeSpinner = null;
    target.mDefaultTransferAccountCheckBox = null;
    target.mDefaultTransferAccountSpinner = null;
    target.mDescriptionEditText = null;
    target.mPlaceholderCheckBox = null;
    target.mColorSquare = null;
  }
}
