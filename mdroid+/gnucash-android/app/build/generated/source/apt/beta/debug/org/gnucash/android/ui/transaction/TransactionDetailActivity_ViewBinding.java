// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class TransactionDetailActivity_ViewBinding implements Unbinder {
  private TransactionDetailActivity target;

  private View view2131296442;

  @UiThread
  public TransactionDetailActivity_ViewBinding(TransactionDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TransactionDetailActivity_ViewBinding(final TransactionDetailActivity target,
      View source) {
    this.target = target;

    View view;
    target.mTransactionDescription = Utils.findRequiredViewAsType(source, R.id.trn_description, "field 'mTransactionDescription'", TextView.class);
    target.mTimeAndDate = Utils.findRequiredViewAsType(source, R.id.trn_time_and_date, "field 'mTimeAndDate'", TextView.class);
    target.mRecurrence = Utils.findRequiredViewAsType(source, R.id.trn_recurrence, "field 'mRecurrence'", TextView.class);
    target.mNotes = Utils.findRequiredViewAsType(source, R.id.trn_notes, "field 'mNotes'", TextView.class);
    target.mToolBar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolBar'", Toolbar.class);
    target.mTransactionAccount = Utils.findRequiredViewAsType(source, R.id.transaction_account, "field 'mTransactionAccount'", TextView.class);
    target.mDebitBalance = Utils.findRequiredViewAsType(source, R.id.balance_debit, "field 'mDebitBalance'", TextView.class);
    target.mCreditBalance = Utils.findRequiredViewAsType(source, R.id.balance_credit, "field 'mCreditBalance'", TextView.class);
    target.mDetailTableLayout = Utils.findRequiredViewAsType(source, R.id.fragment_transaction_details, "field 'mDetailTableLayout'", TableLayout.class);
    view = Utils.findRequiredView(source, R.id.fab_edit_transaction, "method 'editTransaction'");
    view2131296442 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.editTransaction();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTransactionDescription = null;
    target.mTimeAndDate = null;
    target.mRecurrence = null;
    target.mNotes = null;
    target.mToolBar = null;
    target.mTransactionAccount = null;
    target.mDebitBalance = null;
    target.mCreditBalance = null;
    target.mDetailTableLayout = null;

    view2131296442.setOnClickListener(null);
    view2131296442 = null;
  }
}
