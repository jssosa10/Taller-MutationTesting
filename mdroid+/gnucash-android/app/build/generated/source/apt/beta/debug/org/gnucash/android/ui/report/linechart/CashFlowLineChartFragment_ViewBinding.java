// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report.linechart;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.LineChart;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.report.BaseReportFragment_ViewBinding;

public class CashFlowLineChartFragment_ViewBinding extends BaseReportFragment_ViewBinding {
  private CashFlowLineChartFragment target;

  @UiThread
  public CashFlowLineChartFragment_ViewBinding(CashFlowLineChartFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mChart = Utils.findRequiredViewAsType(source, R.id.line_chart, "field 'mChart'", LineChart.class);
  }

  @Override
  public void unbind() {
    CashFlowLineChartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChart = null;

    super.unbind();
  }
}
