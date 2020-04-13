// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class TransactionsListFragment$TransactionRecyclerAdapter$ViewHolder_ViewBinding implements Unbinder {
  private TransactionsListFragment.TransactionRecyclerAdapter.ViewHolder target;

  @UiThread
  public TransactionsListFragment$TransactionRecyclerAdapter$ViewHolder_ViewBinding(TransactionsListFragment.TransactionRecyclerAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.primaryText = Utils.findRequiredViewAsType(source, R.id.primary_text, "field 'primaryText'", TextView.class);
    target.secondaryText = Utils.findRequiredViewAsType(source, R.id.secondary_text, "field 'secondaryText'", TextView.class);
    target.transactionAmount = Utils.findRequiredViewAsType(source, R.id.transaction_amount, "field 'transactionAmount'", TextView.class);
    target.optionsMenu = Utils.findRequiredViewAsType(source, R.id.options_menu, "field 'optionsMenu'", ImageView.class);
    target.transactionDate = Utils.findOptionalViewAsType(source, R.id.transaction_date, "field 'transactionDate'", TextView.class);
    target.editTransaction = Utils.findOptionalViewAsType(source, R.id.edit_transaction, "field 'editTransaction'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionsListFragment.TransactionRecyclerAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.primaryText = null;
    target.secondaryText = null;
    target.transactionAmount = null;
    target.optionsMenu = null;
    target.transactionDate = null;
    target.editTransaction = null;
  }
}
