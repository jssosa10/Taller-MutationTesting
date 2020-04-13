// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.report;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class ReportsOverviewFragment_ViewBinding extends BaseReportFragment_ViewBinding {
  private ReportsOverviewFragment target;

  private View view2131296316;

  private View view2131296311;

  private View view2131296314;

  private View view2131296310;

  @UiThread
  public ReportsOverviewFragment_ViewBinding(final ReportsOverviewFragment target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_pie_chart, "field 'mPieChartButton' and method 'onClickChartTypeButton'");
    target.mPieChartButton = Utils.castView(view, R.id.btn_pie_chart, "field 'mPieChartButton'", Button.class);
    view2131296316 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickChartTypeButton(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_bar_chart, "field 'mBarChartButton' and method 'onClickChartTypeButton'");
    target.mBarChartButton = Utils.castView(view, R.id.btn_bar_chart, "field 'mBarChartButton'", Button.class);
    view2131296311 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickChartTypeButton(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_line_chart, "field 'mLineChartButton' and method 'onClickChartTypeButton'");
    target.mLineChartButton = Utils.castView(view, R.id.btn_line_chart, "field 'mLineChartButton'", Button.class);
    view2131296314 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickChartTypeButton(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_balance_sheet, "field 'mBalanceSheetButton' and method 'onClickChartTypeButton'");
    target.mBalanceSheetButton = Utils.castView(view, R.id.btn_balance_sheet, "field 'mBalanceSheetButton'", Button.class);
    view2131296310 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickChartTypeButton(p0);
      }
    });
    target.mChart = Utils.findRequiredViewAsType(source, R.id.pie_chart, "field 'mChart'", PieChart.class);
    target.mTotalAssets = Utils.findRequiredViewAsType(source, R.id.total_assets, "field 'mTotalAssets'", TextView.class);
    target.mTotalLiabilities = Utils.findRequiredViewAsType(source, R.id.total_liabilities, "field 'mTotalLiabilities'", TextView.class);
    target.mNetWorth = Utils.findRequiredViewAsType(source, R.id.net_worth, "field 'mNetWorth'", TextView.class);
  }

  @Override
  public void unbind() {
    ReportsOverviewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPieChartButton = null;
    target.mBarChartButton = null;
    target.mLineChartButton = null;
    target.mBalanceSheetButton = null;
    target.mChart = null;
    target.mTotalAssets = null;
    target.mTotalLiabilities = null;
    target.mNetWorth = null;

    view2131296316.setOnClickListener(null);
    view2131296316 = null;
    view2131296311.setOnClickListener(null);
    view2131296311 = null;
    view2131296314.setOnClickListener(null);
    view2131296314 = null;
    view2131296310.setOnClickListener(null);
    view2131296310 = null;

    super.unbind();
  }
}
