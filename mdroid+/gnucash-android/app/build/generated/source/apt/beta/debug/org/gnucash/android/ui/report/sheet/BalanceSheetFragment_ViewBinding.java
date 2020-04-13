// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report.sheet;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.report.BaseReportFragment_ViewBinding;

public class BalanceSheetFragment_ViewBinding extends BaseReportFragment_ViewBinding {
  private BalanceSheetFragment target;

  @UiThread
  public BalanceSheetFragment_ViewBinding(BalanceSheetFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mAssetsTableLayout = Utils.findRequiredViewAsType(source, R.id.table_assets, "field 'mAssetsTableLayout'", TableLayout.class);
    target.mLiabilitiesTableLayout = Utils.findRequiredViewAsType(source, R.id.table_liabilities, "field 'mLiabilitiesTableLayout'", TableLayout.class);
    target.mEquityTableLayout = Utils.findRequiredViewAsType(source, R.id.table_equity, "field 'mEquityTableLayout'", TableLayout.class);
    target.mNetWorth = Utils.findRequiredViewAsType(source, R.id.total_liability_and_equity, "field 'mNetWorth'", TextView.class);
  }

  @Override
  public void unbind() {
    BalanceSheetFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAssetsTableLayout = null;
    target.mLiabilitiesTableLayout = null;
    target.mEquityTableLayout = null;
    target.mNetWorth = null;

    super.unbind();
  }
}
