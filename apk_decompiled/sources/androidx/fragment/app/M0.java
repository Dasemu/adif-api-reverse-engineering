package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f3054a;

    /* renamed from: b, reason: collision with root package name */
    public static final M0 f3055b;

    /* renamed from: c, reason: collision with root package name */
    public static final M0 f3056c;

    /* renamed from: d, reason: collision with root package name */
    public static final M0 f3057d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ M0[] f3058e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.M0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.M0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.M0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.fragment.app.M0] */
    static {
        ?? r02 = new Enum("REMOVED", 0);
        f3054a = r02;
        ?? r12 = new Enum("VISIBLE", 1);
        f3055b = r12;
        ?? r22 = new Enum("GONE", 2);
        f3056c = r22;
        ?? r32 = new Enum("INVISIBLE", 3);
        f3057d = r32;
        f3058e = new M0[]{r02, r12, r22, r32};
    }

    public static M0 valueOf(String str) {
        return (M0) Enum.valueOf(M0.class, str);
    }

    public static M0[] values() {
        return (M0[]) f3058e.clone();
    }

    public final void a(View view, ViewGroup container) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        int i = L0.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i == 3) {
            if (AbstractC0158l0.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i != 4) {
            return;
        }
        if (AbstractC0158l0.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
