// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.account;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class AccountsListFragment$AccountRecyclerAdapter$AccountViewHolder_ViewBinding implements Unbinder {
  private AccountsListFragment.AccountRecyclerAdapter.AccountViewHolder target;

  @UiThread
  public AccountsListFragment$AccountRecyclerAdapter$AccountViewHolder_ViewBinding(AccountsListFragment.AccountRecyclerAdapter.AccountViewHolder target,
      View source) {
    this.target = target;

    target.accountName = Utils.findRequiredViewAsType(source, R.id.primary_text, "field 'accountName'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.secondary_text, "field 'description'", TextView.class);
    target.accountBalance = Utils.findRequiredViewAsType(source, R.id.account_balance, "field 'accountBalance'", TextView.class);
    target.createTransaction = Utils.findRequiredViewAsType(source, R.id.create_transaction, "field 'createTransaction'", ImageView.class);
    target.favoriteStatus = Utils.findRequiredViewAsType(source, R.id.favorite_status, "field 'favoriteStatus'", ImageView.class);
    target.optionsMenu = Utils.findRequiredViewAsType(source, R.id.options_menu, "field 'optionsMenu'", ImageView.class);
    target.colorStripView = Utils.findRequiredView(source, R.id.account_color_strip, "field 'colorStripView'");
    target.budgetIndicator = Utils.findRequiredViewAsType(source, R.id.budget_indicator, "field 'budgetIndicator'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AccountsListFragment.AccountRecyclerAdapter.AccountViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.accountName = null;
    target.description = null;
    target.accountBalance = null;
    target.createTransaction = null;
    target.favoriteStatus = null;
    target.optionsMenu = null;
    target.colorStripView = null;
    target.budgetIndicator = null;
  }
}
