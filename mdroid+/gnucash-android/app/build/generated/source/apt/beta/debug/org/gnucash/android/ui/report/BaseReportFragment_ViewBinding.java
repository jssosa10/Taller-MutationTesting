// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class BaseReportFragment_ViewBinding implements Unbinder {
  private BaseReportFragment target;

  @UiThread
  public BaseReportFragment_ViewBinding(BaseReportFragment target, View source) {
    this.target = target;

    target.mSelectedValueTextView = Utils.findOptionalViewAsType(source, R.id.selected_chart_slice, "field 'mSelectedValueTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseReportFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSelectedValueTextView = null;
  }
}
