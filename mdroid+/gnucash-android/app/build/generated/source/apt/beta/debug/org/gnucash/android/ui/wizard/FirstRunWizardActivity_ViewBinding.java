// Generated code from Butter Knife. Do not modify!
package org.gnucash.android.ui.wizard;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tech.freak.wizardpager.ui.StepPagerStrip;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.gnucash.android.R;

public class FirstRunWizardActivity_ViewBinding implements Unbinder {
  private FirstRunWizardActivity target;

  @UiThread
  public FirstRunWizardActivity_ViewBinding(FirstRunWizardActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FirstRunWizardActivity_ViewBinding(FirstRunWizardActivity target, View source) {
    this.target = target;

    target.mPager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'mPager'", ViewPager.class);
    target.mNextButton = Utils.findRequiredViewAsType(source, R.id.btn_save, "field 'mNextButton'", AppCompatButton.class);
    target.mPrevButton = Utils.findRequiredViewAsType(source, R.id.btn_cancel, "field 'mPrevButton'", Button.class);
    target.mStepPagerStrip = Utils.findRequiredViewAsType(source, R.id.strip, "field 'mStepPagerStrip'", StepPagerStrip.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FirstRunWizardActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPager = null;
    target.mNextButton = null;
    target.mPrevButton = null;
    target.mStepPagerStrip = null;
  }
}
