package com.adif.elcanomovil.uiMoreAdif.wizard;

import B0.w;
import I2.i;
import O.J;
import O.L;
import O.X;
import a.AbstractC0105a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.adif.elcanomovil.uiMoreAdif.R;
import g.AbstractActivityC0364k;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class WizardActivity extends AbstractActivityC0364k {
    private int _xDelta;
    private MyAdapter mAdapter;
    private ViewPager mPager;

    /* loaded from: classes2.dex */
    public class MyAdapter extends F0.a {
        WizardActivity mActivity;

        public MyAdapter(WizardActivity wizardActivity) {
            this.mActivity = wizardActivity;
        }

        @Override // F0.a
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            ((ViewPager) viewGroup).removeView((LinearLayout) obj);
        }

        @Override // F0.a
        public int getCount() {
            return 5;
        }

        @Override // F0.a
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View inflate = ((LayoutInflater) this.mActivity.getSystemService("layout_inflater")).inflate(R.layout.fragment_wizard_first, viewGroup, false);
            inflate.setTag("IMAGE");
            ((ImageView) inflate.findViewById(R.id.imgWizard)).setImageResource(R.drawable.image_wizard_1 + i);
            ((ViewPager) viewGroup).addView(inflate);
            return inflate;
        }

        @Override // F0.a
        public boolean isViewFromObject(View view, Object obj) {
            return view == ((LinearLayout) obj);
        }
    }

    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    public /* synthetic */ boolean lambda$onCreate$1(View view, MotionEvent motionEvent) {
        if (((ViewPager) view).getCurrentItem() != 4) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this._xDelta = rawX;
            return false;
        }
        if (action != 2 || this._xDelta - rawX <= 100) {
            return false;
        }
        finish();
        return false;
    }

    @Override // androidx.fragment.app.P, b.o, C.AbstractActivityC0048l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "activity");
        AbstractC0105a.O(getWindow(), false);
        setContentView(R.layout.b_activity_wizard_main_screen);
        View rootView = findViewById(android.R.id.content);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        w wVar = new w(20);
        WeakHashMap weakHashMap = X.f1226a;
        L.u(rootView, wVar);
        J.c(rootView);
        this.mAdapter = new MyAdapter(this);
        ((TextView) findViewById(R.id.wizard_ready_text)).setOnClickListener(new D1.a(this, 13));
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        this.mPager = viewPager;
        viewPager.setAdapter(this.mAdapter);
        this.mPager.setOnTouchListener(new i(this, 1));
        this.mPager.setOnPageChangeListener(new a(this));
    }
}
