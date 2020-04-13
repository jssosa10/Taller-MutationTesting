// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.transaction;

import android.inputmethodservice.KeyboardView;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class SplitEditorFragment_ViewBinding implements Unbinder {
  private SplitEditorFragment target;

  @UiThread
  public SplitEditorFragment_ViewBinding(SplitEditorFragment target, View source) {
    this.target = target;

    target.mSplitsLinearLayout = Utils.findRequiredViewAsType(source, R.id.split_list_layout, "field 'mSplitsLinearLayout'", LinearLayout.class);
    target.mKeyboardView = Utils.findRequiredViewAsType(source, R.id.calculator_keyboard, "field 'mKeyboardView'", KeyboardView.class);
    target.mImbalanceTextView = Utils.findRequiredViewAsType(source, R.id.imbalance_textview, "field 'mImbalanceTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplitEditorFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSplitsLinearLayout = null;
    target.mKeyboardView = null;
    target.mImbalanceTextView = null;
  }
}
