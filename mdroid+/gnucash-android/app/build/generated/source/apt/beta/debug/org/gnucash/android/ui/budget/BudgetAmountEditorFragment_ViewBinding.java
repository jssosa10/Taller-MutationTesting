// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.budget;

import android.inputmethodservice.KeyboardView;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class BudgetAmountEditorFragment_ViewBinding implements Unbinder {
  private BudgetAmountEditorFragment target;

  @UiThread
  public BudgetAmountEditorFragment_ViewBinding(BudgetAmountEditorFragment target, View source) {
    this.target = target;

    target.mBudgetAmountTableLayout = Utils.findRequiredViewAsType(source, R.id.budget_amount_layout, "field 'mBudgetAmountTableLayout'", LinearLayout.class);
    target.mKeyboardView = Utils.findRequiredViewAsType(source, R.id.calculator_keyboard, "field 'mKeyboardView'", KeyboardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BudgetAmountEditorFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mBudgetAmountTableLayout = null;
    target.mKeyboardView = null;
  }
}
