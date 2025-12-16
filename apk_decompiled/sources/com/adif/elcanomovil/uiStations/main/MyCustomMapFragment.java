package com.adif.elcanomovil.uiStations.main;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.SupportMapFragment;

/* loaded from: classes2.dex */
public class MyCustomMapFragment extends SupportMapFragment {
    private OnTouchListener mListener;

    /* loaded from: classes2.dex */
    public interface OnTouchListener {
        void onTouch();
    }

    /* loaded from: classes2.dex */
    public class TouchableWrapper extends FrameLayout {
        public TouchableWrapper(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                MyCustomMapFragment.this.mListener.onTouch();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.K
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        TouchableWrapper touchableWrapper = new TouchableWrapper(getActivity());
        touchableWrapper.setBackgroundColor(getResources().getColor(R.color.transparent, null));
        ((ViewGroup) onCreateView).addView(touchableWrapper, new ViewGroup.LayoutParams(-1, -1));
        return onCreateView;
    }

    public void setListener(OnTouchListener onTouchListener) {
        this.mListener = onTouchListener;
    }
}
