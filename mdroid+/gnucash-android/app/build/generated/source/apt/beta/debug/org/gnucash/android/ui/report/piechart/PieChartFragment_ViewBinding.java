// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report.piechart;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;
import org.gnucash.android.ui.report.BaseReportFragment_ViewBinding;

public class PieChartFragment_ViewBinding extends BaseReportFragment_ViewBinding {
  private PieChartFragment target;

  @UiThread
  public PieChartFragment_ViewBinding(PieChartFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mChart = Utils.findRequiredViewAsType(source, R.id.pie_chart, "field 'mChart'", PieChart.class);
  }

  @Override
  public void unbind() {
    PieChartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChart = null;

    super.unbind();
  }
}
