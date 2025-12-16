package androidx.recyclerview.widget;

import android.database.Observable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0220h0 {
    private final C0222i0 mObservable = new Observable();
    private boolean mHasStableIds = false;
    private EnumC0218g0 mStateRestorationPolicy = EnumC0218g0.f3817a;

    public final void bindViewHolder(I0 i02, int i) {
        boolean z3 = i02.mBindingAdapter == null;
        if (z3) {
            i02.mPosition = i;
            if (hasStableIds()) {
                i02.mItemId = getItemId(i);
            }
            i02.setFlags(1, 519);
            Trace.beginSection("RV OnBindView");
        }
        i02.mBindingAdapter = this;
        if (RecyclerView.A0) {
            if (i02.itemView.getParent() == null) {
                View view = i02.itemView;
                WeakHashMap weakHashMap = O.X.f1226a;
                if (view.isAttachedToWindow() != i02.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + i02.isTmpDetached() + ", attached to window: " + i02.itemView.isAttachedToWindow() + ", holder: " + i02);
                }
            }
            if (i02.itemView.getParent() == null) {
                View view2 = i02.itemView;
                WeakHashMap weakHashMap2 = O.X.f1226a;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + i02);
                }
            }
        }
        onBindViewHolder(i02, i, i02.getUnmodifiedPayloads());
        if (z3) {
            i02.clearPayload();
            ViewGroup.LayoutParams layoutParams = i02.itemView.getLayoutParams();
            if (layoutParams instanceof C0239r0) {
                ((C0239r0) layoutParams).f3899c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
    }

    public final I0 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            Trace.beginSection("RV CreateView");
            I0 onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            onCreateViewHolder.mItemViewType = i;
            return onCreateViewHolder;
        } finally {
            Trace.endSection();
        }
    }

    public int findRelativeAdapterPositionIn(AbstractC0220h0 abstractC0220h0, I0 i02, int i) {
        if (abstractC0220h0 == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final EnumC0218g0 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i4) {
        this.mObservable.c(i, i4);
    }

    public final void notifyItemRangeChanged(int i, int i4) {
        this.mObservable.d(i, i4, null);
    }

    public final void notifyItemRangeInserted(int i, int i4) {
        this.mObservable.e(i, i4);
    }

    public final void notifyItemRangeRemoved(int i, int i4) {
        this.mObservable.f(i, i4);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(I0 i02, int i);

    public void onBindViewHolder(I0 i02, int i, List<Object> list) {
        onBindViewHolder(i02, i);
    }

    public abstract I0 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(I0 i02) {
        return false;
    }

    public void onViewAttachedToWindow(I0 i02) {
    }

    public void onViewDetachedFromWindow(I0 i02) {
    }

    public void onViewRecycled(I0 i02) {
    }

    public void registerAdapterDataObserver(AbstractC0224j0 abstractC0224j0) {
        this.mObservable.registerObserver(abstractC0224j0);
    }

    public void setHasStableIds(boolean z3) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z3;
    }

    public void setStateRestorationPolicy(EnumC0218g0 enumC0218g0) {
        this.mStateRestorationPolicy = enumC0218g0;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(AbstractC0224j0 abstractC0224j0) {
        this.mObservable.unregisterObserver(abstractC0224j0);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i4, Object obj) {
        this.mObservable.d(i, i4, obj);
    }
}
