// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.export;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class ExportFormFragment_ViewBinding implements Unbinder {
  private ExportFormFragment target;

  @UiThread
  public ExportFormFragment_ViewBinding(ExportFormFragment target, View source) {
    this.target = target;

    target.mDestinationSpinner = Utils.findRequiredViewAsType(source, R.id.spinner_export_destination, "field 'mDestinationSpinner'", Spinner.class);
    target.mDeleteAllCheckBox = Utils.findRequiredViewAsType(source, R.id.checkbox_post_export_delete, "field 'mDeleteAllCheckBox'", CheckBox.class);
    target.mExportWarningTextView = Utils.findRequiredViewAsType(source, R.id.export_warning, "field 'mExportWarningTextView'", TextView.class);
    target.mTargetUriTextView = Utils.findRequiredViewAsType(source, R.id.target_uri, "field 'mTargetUriTextView'", TextView.class);
    target.mRecurrenceTextView = Utils.findRequiredViewAsType(source, R.id.input_recurrence, "field 'mRecurrenceTextView'", TextView.class);
    target.mExportStartDate = Utils.findRequiredViewAsType(source, R.id.export_start_date, "field 'mExportStartDate'", TextView.class);
    target.mExportStartTime = Utils.findRequiredViewAsType(source, R.id.export_start_time, "field 'mExportStartTime'", TextView.class);
    target.mExportAllSwitch = Utils.findRequiredViewAsType(source, R.id.switch_export_all, "field 'mExportAllSwitch'", SwitchCompat.class);
    target.mExportDateLayout = Utils.findRequiredViewAsType(source, R.id.export_date_layout, "field 'mExportDateLayout'", LinearLayout.class);
    target.mOfxRadioButton = Utils.findRequiredViewAsType(source, R.id.radio_ofx_format, "field 'mOfxRadioButton'", RadioButton.class);
    target.mQifRadioButton = Utils.findRequiredViewAsType(source, R.id.radio_qif_format, "field 'mQifRadioButton'", RadioButton.class);
    target.mXmlRadioButton = Utils.findRequiredViewAsType(source, R.id.radio_xml_format, "field 'mXmlRadioButton'", RadioButton.class);
    target.mCsvTransactionsRadioButton = Utils.findRequiredViewAsType(source, R.id.radio_csv_transactions_format, "field 'mCsvTransactionsRadioButton'", RadioButton.class);
    target.mSeparatorCommaButton = Utils.findRequiredViewAsType(source, R.id.radio_separator_comma_format, "field 'mSeparatorCommaButton'", RadioButton.class);
    target.mSeparatorColonButton = Utils.findRequiredViewAsType(source, R.id.radio_separator_colon_format, "field 'mSeparatorColonButton'", RadioButton.class);
    target.mSeparatorSemicolonButton = Utils.findRequiredViewAsType(source, R.id.radio_separator_semicolon_format, "field 'mSeparatorSemicolonButton'", RadioButton.class);
    target.mCsvOptionsLayout = Utils.findRequiredViewAsType(source, R.id.layout_csv_options, "field 'mCsvOptionsLayout'", LinearLayout.class);
    target.mRecurrenceOptionsView = Utils.findRequiredView(source, R.id.recurrence_options, "field 'mRecurrenceOptionsView'");
  }

  @Override
  @CallSuper
  public void unbind() {
    ExportFormFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mDestinationSpinner = null;
    target.mDeleteAllCheckBox = null;
    target.mExportWarningTextView = null;
    target.mTargetUriTextView = null;
    target.mRecurrenceTextView = null;
    target.mExportStartDate = null;
    target.mExportStartTime = null;
    target.mExportAllSwitch = null;
    target.mExportDateLayout = null;
    target.mOfxRadioButton = null;
    target.mQifRadioButton = null;
    target.mXmlRadioButton = null;
    target.mCsvTransactionsRadioButton = null;
    target.mSeparatorCommaButton = null;
    target.mSeparatorColonButton = null;
    target.mSeparatorSemicolonButton = null;
    target.mCsvOptionsLayout = null;
    target.mRecurrenceOptionsView = null;
  }
}
