// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Spinner;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.common.BaseDrawerActivity_ViewBinding;

public class ReportsActivity_ViewBinding extends BaseDrawerActivity_ViewBinding {
  private ReportsActivity target;

  @UiThread
  public ReportsActivity_ViewBinding(ReportsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReportsActivity_ViewBinding(ReportsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mTimeRangeSpinner = Utils.findRequiredViewAsType(source, R.id.time_range_spinner, "field 'mTimeRangeSpinner'", Spinner.class);
    target.mAccountTypeSpinner = Utils.findRequiredViewAsType(source, R.id.report_account_type_spinner, "field 'mAccountTypeSpinner'", Spinner.class);
    target.mReportTypeSpinner = Utils.findRequiredViewAsType(source, R.id.toolbar_spinner, "field 'mReportTypeSpinner'", Spinner.class);
  }

  @Override
  public void unbind() {
    ReportsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTimeRangeSpinner = null;
    target.mAccountTypeSpinner = null;
    target.mReportTypeSpinner = null;

    super.unbind();
  }
}
