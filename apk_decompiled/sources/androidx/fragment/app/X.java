package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC0378a;
import i0.AbstractC0383d;
import i0.AbstractC0392m;
import i0.C0382c;
import i0.C0384e;
import i0.EnumC0381b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class X implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0158l0 f3080a;

    public X(AbstractC0158l0 abstractC0158l0) {
        this.f3080a = abstractC0158l0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        t0 g4;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        AbstractC0158l0 abstractC0158l0 = this.f3080a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, abstractC0158l0);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0378a.f6745a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z3 = K.class.isAssignableFrom(C0142d0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z3 = false;
                }
                if (z3) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    K fragment = resourceId != -1 ? abstractC0158l0.E(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = abstractC0158l0.F(string);
                    }
                    if (fragment == null && id != -1) {
                        fragment = abstractC0158l0.E(id);
                    }
                    if (fragment == null) {
                        C0142d0 J = abstractC0158l0.J();
                        context.getClassLoader();
                        fragment = J.a(attributeValue);
                        fragment.mFromLayout = true;
                        fragment.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragment.mContainerId = id;
                        fragment.mTag = string;
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = abstractC0158l0;
                        V v3 = abstractC0158l0.f3177w;
                        fragment.mHost = v3;
                        fragment.onInflate((Context) v3.f3075b, attributeSet, fragment.mSavedFragmentState);
                        g4 = abstractC0158l0.a(fragment);
                        if (AbstractC0158l0.M(2)) {
                            Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!fragment.mInLayout) {
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = abstractC0158l0;
                        V v4 = abstractC0158l0.f3177w;
                        fragment.mHost = v4;
                        fragment.onInflate((Context) v4.f3075b, attributeSet, fragment.mSavedFragmentState);
                        g4 = abstractC0158l0.g(fragment);
                        if (AbstractC0158l0.M(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0382c c0382c = AbstractC0383d.f6811a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    AbstractC0392m abstractC0392m = new AbstractC0392m(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
                    AbstractC0383d.c(abstractC0392m);
                    C0382c a2 = AbstractC0383d.a(fragment);
                    if (a2.f6809a.contains(EnumC0381b.f6803d) && AbstractC0383d.e(a2, fragment.getClass(), C0384e.class)) {
                        AbstractC0383d.b(a2, abstractC0392m);
                    }
                    fragment.mContainer = viewGroup;
                    g4.k();
                    g4.j();
                    View view2 = fragment.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragment.mView.getTag() == null) {
                            fragment.mView.setTag(string);
                        }
                        fragment.mView.addOnAttachStateChangeListener(new W(this, g4));
                        return fragment.mView;
                    }
                    throw new IllegalStateException(C.w.o("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
