// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report.barchart;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.BarChart;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.report.BaseReportFragment_ViewBinding;

public class StackedBarChartFragment_ViewBinding extends BaseReportFragment_ViewBinding {
  private StackedBarChartFragment target;

  @UiThread
  public StackedBarChartFragment_ViewBinding(StackedBarChartFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mChart = Utils.findRequiredViewAsType(source, R.id.bar_chart, "field 'mChart'", BarChart.class);
  }

  @Override
  public void unbind() {
    StackedBarChartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChart = null;

    super.unbind();
  }
}
