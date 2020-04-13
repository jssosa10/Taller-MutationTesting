// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class TransferFundsDialogFragment_ViewBinding implements Unbinder {
  private TransferFundsDialogFragment target;

  @UiThread
  public TransferFundsDialogFragment_ViewBinding(TransferFundsDialogFragment target, View source) {
    this.target = target;

    target.mFromCurrencyLabel = Utils.findRequiredViewAsType(source, R.id.from_currency, "field 'mFromCurrencyLabel'", TextView.class);
    target.mToCurrencyLabel = Utils.findRequiredViewAsType(source, R.id.to_currency, "field 'mToCurrencyLabel'", TextView.class);
    target.mConvertedAmountCurrencyLabel = Utils.findRequiredViewAsType(source, R.id.target_currency, "field 'mConvertedAmountCurrencyLabel'", TextView.class);
    target.mStartAmountLabel = Utils.findRequiredViewAsType(source, R.id.amount_to_convert, "field 'mStartAmountLabel'", TextView.class);
    target.mExchangeRateInput = Utils.findRequiredViewAsType(source, R.id.input_exchange_rate, "field 'mExchangeRateInput'", EditText.class);
    target.mConvertedAmountInput = Utils.findRequiredViewAsType(source, R.id.input_converted_amount, "field 'mConvertedAmountInput'", EditText.class);
    target.mFetchExchangeRateButton = Utils.findRequiredViewAsType(source, R.id.btn_fetch_exchange_rate, "field 'mFetchExchangeRateButton'", Button.class);
    target.mExchangeRateRadioButton = Utils.findRequiredViewAsType(source, R.id.radio_exchange_rate, "field 'mExchangeRateRadioButton'", RadioButton.class);
    target.mConvertedAmountRadioButton = Utils.findRequiredViewAsType(source, R.id.radio_converted_amount, "field 'mConvertedAmountRadioButton'", RadioButton.class);
    target.mSampleExchangeRate = Utils.findRequiredViewAsType(source, R.id.label_exchange_rate_example, "field 'mSampleExchangeRate'", TextView.class);
    target.mExchangeRateInputLayout = Utils.findRequiredViewAsType(source, R.id.exchange_rate_text_input_layout, "field 'mExchangeRateInputLayout'", TextInputLayout.class);
    target.mConvertedAmountInputLayout = Utils.findRequiredViewAsType(source, R.id.converted_amount_text_input_layout, "field 'mConvertedAmountInputLayout'", TextInputLayout.class);
    target.mSaveButton = Utils.findRequiredViewAsType(source, R.id.btn_save, "field 'mSaveButton'", Button.class);
    target.mCancelButton = Utils.findRequiredViewAsType(source, R.id.btn_cancel, "field 'mCancelButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransferFundsDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFromCurrencyLabel = null;
    target.mToCurrencyLabel = null;
    target.mConvertedAmountCurrencyLabel = null;
    target.mStartAmountLabel = null;
    target.mExchangeRateInput = null;
    target.mConvertedAmountInput = null;
    target.mFetchExchangeRateButton = null;
    target.mExchangeRateRadioButton = null;
    target.mConvertedAmountRadioButton = null;
    target.mSampleExchangeRate = null;
    target.mExchangeRateInputLayout = null;
    target.mConvertedAmountInputLayout = null;
    target.mSaveButton = null;
    target.mCancelButton = null;
  }
}
