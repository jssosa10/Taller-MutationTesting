// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.homescreen;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class WidgetConfigurationActivity_ViewBinding implements Unbinder {
  private WidgetConfigurationActivity target;

  @UiThread
  public WidgetConfigurationActivity_ViewBinding(WidgetConfigurationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WidgetConfigurationActivity_ViewBinding(WidgetConfigurationActivity target, View source) {
    this.target = target;

    target.mAccountsSpinner = Utils.findRequiredViewAsType(source, R.id.input_accounts_spinner, "field 'mAccountsSpinner'", Spinner.class);
    target.mBooksSpinner = Utils.findRequiredViewAsType(source, R.id.input_books_spinner, "field 'mBooksSpinner'", Spinner.class);
    target.mHideAccountBalance = Utils.findRequiredViewAsType(source, R.id.input_hide_account_balance, "field 'mHideAccountBalance'", CheckBox.class);
    target.mOkButton = Utils.findRequiredViewAsType(source, R.id.btn_save, "field 'mOkButton'", Button.class);
    target.mCancelButton = Utils.findRequiredViewAsType(source, R.id.btn_cancel, "field 'mCancelButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WidgetConfigurationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAccountsSpinner = null;
    target.mBooksSpinner = null;
    target.mHideAccountBalance = null;
    target.mOkButton = null;
    target.mCancelButton = null;
  }
}
