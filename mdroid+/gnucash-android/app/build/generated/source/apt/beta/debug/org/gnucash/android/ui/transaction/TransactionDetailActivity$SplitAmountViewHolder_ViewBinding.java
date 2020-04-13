// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class TransactionDetailActivity$SplitAmountViewHolder_ViewBinding implements Unbinder {
  private TransactionDetailActivity.SplitAmountViewHolder target;

  @UiThread
  public TransactionDetailActivity$SplitAmountViewHolder_ViewBinding(TransactionDetailActivity.SplitAmountViewHolder target,
      View source) {
    this.target = target;

    target.accountName = Utils.findRequiredViewAsType(source, R.id.split_account_name, "field 'accountName'", TextView.class);
    target.splitDebit = Utils.findRequiredViewAsType(source, R.id.split_debit, "field 'splitDebit'", TextView.class);
    target.splitCredit = Utils.findRequiredViewAsType(source, R.id.split_credit, "field 'splitCredit'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionDetailActivity.SplitAmountViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.accountName = null;
    target.splitDebit = null;
    target.splitCredit = null;
  }
}
