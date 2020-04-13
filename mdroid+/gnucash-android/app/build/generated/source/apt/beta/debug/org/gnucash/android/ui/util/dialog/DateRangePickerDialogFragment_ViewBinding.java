// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.util.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.squareup.timessquare.CalendarPickerView;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class DateRangePickerDialogFragment_ViewBinding implements Unbinder {
  private DateRangePickerDialogFragment target;

  @UiThread
  public DateRangePickerDialogFragment_ViewBinding(DateRangePickerDialogFragment target,
      View source) {
    this.target = target;

    target.mCalendarPickerView = Utils.findRequiredViewAsType(source, R.id.calendar_view, "field 'mCalendarPickerView'", CalendarPickerView.class);
    target.mDoneButton = Utils.findRequiredViewAsType(source, R.id.btn_save, "field 'mDoneButton'", Button.class);
    target.mCancelButton = Utils.findRequiredViewAsType(source, R.id.btn_cancel, "field 'mCancelButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DateRangePickerDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCalendarPickerView = null;
    target.mDoneButton = null;
    target.mCancelButton = null;
  }
}
