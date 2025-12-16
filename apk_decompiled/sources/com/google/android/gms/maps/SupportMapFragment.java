package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.K;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public class SupportMapFragment extends K {
    private final zzaw zza = new zzaw(this);

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.zza.zzb(onMapReadyCallback);
    }

    @Override // androidx.fragment.app.K
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.K
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        zzaw.zza(this.zza, activity);
    }

    @Override // androidx.fragment.app.K
    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.zza.onCreate(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.K
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.K
    public void onDestroy() {
        this.zza.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.K
    public void onDestroyView() {
        this.zza.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        zzaw zzawVar = this.zza;
        if (zzawVar.getDelegate() != null) {
            ((zzav) zzawVar.getDelegate()).zza(bundle);
        }
    }

    public final void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        zzaw zzawVar = this.zza;
        if (zzawVar.getDelegate() != null) {
            ((zzav) zzawVar.getDelegate()).zzb();
        }
    }

    @Override // androidx.fragment.app.K
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            zzaw.zza(this.zza, activity);
            GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", createFromAttributes);
            this.zza.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.K, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zza.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.K
    public void onPause() {
        this.zza.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.K
    public void onResume() {
        super.onResume();
        this.zza.onResume();
    }

    @Override // androidx.fragment.app.K
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.K
    public void onStart() {
        super.onStart();
        this.zza.onStart();
    }

    @Override // androidx.fragment.app.K
    public void onStop() {
        this.zza.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.K
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }
}
