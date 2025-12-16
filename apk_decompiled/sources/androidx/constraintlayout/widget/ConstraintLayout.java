package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import u.AbstractC0627d;
import u.C0626c;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static t sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<c> mConstraintHelpers;
    protected i mConstraintLayoutSpec;
    private p mConstraintSet;
    private int mConstraintSetId;
    private q mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected w.e mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    f mMeasurer;
    private AbstractC0627d mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<w.d> mTempMapIdToWidget;

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new w.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        g(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.constraintlayout.widget.t, java.lang.Object] */
    public static t getSharedValues() {
        if (sSharedValues == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            sSharedValues = obj;
        }
        return sSharedValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02ba -> B:76:0x02bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyConstraintsFromLayoutParams(boolean r20, android.view.View r21, w.d r22, androidx.constraintlayout.widget.e r23, android.util.SparseArray<w.d> r24) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, w.d, androidx.constraintlayout.widget.e, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i5 = (int) ((parseInt / 1080.0f) * width);
                        int i6 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i5;
                        float f4 = i6;
                        float f5 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f4, f5, f4, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f4, f5, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f5, f4, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(AbstractC0627d abstractC0627d) {
        this.mLayoutWidget.f8742w0.getClass();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public final void g(AttributeSet attributeSet, int i, int i4) {
        w.e eVar = this.mLayoutWidget;
        eVar.f8698f0 = this;
        f fVar = this.mMeasurer;
        eVar.f8740u0 = fVar;
        eVar.f8738s0.f8298g = fVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f2749b, i, i4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 16) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p pVar = new p();
                        this.mConstraintSet = pVar;
                        pVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        w.e eVar2 = this.mLayoutWidget;
        eVar2.f8728D0 = this.mOptimizationLevel;
        C0626c.p = eVar2.W(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f8728D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f8703j == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f8703j = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f8703j = "parent";
            }
        }
        w.e eVar = this.mLayoutWidget;
        if (eVar.f8701h0 == null) {
            eVar.f8701h0 = eVar.f8703j;
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.f8701h0);
        }
        Iterator it = this.mLayoutWidget.f8736q0.iterator();
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            View view = dVar.f8698f0;
            if (view != null) {
                if (dVar.f8703j == null && (id = view.getId()) != -1) {
                    dVar.f8703j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f8701h0 == null) {
                    dVar.f8701h0 = dVar.f8703j;
                    Log.v(TAG, " setDebugName " + dVar.f8701h0);
                }
            }
        }
        this.mLayoutWidget.n(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final w.d getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f2606p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof e) {
            return ((e) view.getLayoutParams()).f2606p0;
        }
        return null;
    }

    public final void h(w.d dVar, e eVar, SparseArray sparseArray, int i, int i4) {
        View view = this.mChildrenByIds.get(i);
        w.d dVar2 = (w.d) sparseArray.get(i);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof e)) {
            return;
        }
        eVar.f2583c0 = USE_CONSTRAINTS_HELPER;
        if (i4 == 6) {
            e eVar2 = (e) view.getLayoutParams();
            eVar2.f2583c0 = USE_CONSTRAINTS_HELPER;
            eVar2.f2606p0.f8667E = USE_CONSTRAINTS_HELPER;
        }
        dVar.i(6).b(dVar2.i(i4), eVar.f2557D, eVar.f2556C, USE_CONSTRAINTS_HELPER);
        dVar.f8667E = USE_CONSTRAINTS_HELPER;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    public boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return USE_CONSTRAINTS_HELPER;
    }

    public void loadLayoutDescription(int i) {
        if (i == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new i(getContext(), this, i);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            e eVar = (e) childAt.getLayoutParams();
            w.d dVar = eVar.f2606p0;
            if (childAt.getVisibility() != 8 || eVar.f2585d0 || eVar.f2587e0 || isInEditMode) {
                int r4 = dVar.r();
                int s4 = dVar.s();
                childAt.layout(r4, s4, dVar.q() + r4, dVar.k() + s4);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.mConstraintHelpers.get(i8).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        w.d dVar;
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i5 = this.mOnMeasureHeightMeasureSpec;
        }
        boolean z6 = this.mDirtyHierarchy;
        boolean z7 = USE_CONSTRAINTS_HELPER;
        if (!z6) {
            int childCount = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                if (getChildAt(i6).isLayoutRequested()) {
                    this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
                    break;
                }
                i6++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i4;
        this.mLayoutWidget.f8741v0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            int childCount2 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount2) {
                    z3 = false;
                    break;
                } else {
                    if (getChildAt(i7).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i7++;
                }
            }
            if (z3) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i8 = 0; i8 < childCount3; i8++) {
                    w.d viewWidget = getViewWidget(getChildAt(i8));
                    if (viewWidget != null) {
                        viewWidget.C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i9 = 0; i9 < childCount3; i9++) {
                        View childAt = getChildAt(i9);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id == 0) {
                                dVar = this.mLayoutWidget;
                            } else {
                                View view = this.mChildrenByIds.get(id);
                                if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                    onViewAdded(view);
                                }
                                dVar = view == this ? this.mLayoutWidget : view == null ? null : ((e) view.getLayoutParams()).f2606p0;
                            }
                            dVar.f8701h0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        getChildAt(i10).getId();
                    }
                }
                p pVar = this.mConstraintSet;
                if (pVar != null) {
                    pVar.a(this);
                }
                this.mLayoutWidget.f8736q0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i11 = 0;
                    while (i11 < size) {
                        c cVar = this.mConstraintHelpers.get(i11);
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f2550e);
                        }
                        w.i iVar = cVar.f2549d;
                        if (iVar == null) {
                            z4 = z7;
                        } else {
                            iVar.f8801r0 = 0;
                            Arrays.fill(iVar.f8800q0, obj);
                            int i12 = 0;
                            while (i12 < cVar.f2547b) {
                                int i13 = cVar.f2546a[i12];
                                View viewById = getViewById(i13);
                                if (viewById == null) {
                                    Integer valueOf = Integer.valueOf(i13);
                                    HashMap hashMap = cVar.f2552g;
                                    String str = (String) hashMap.get(valueOf);
                                    z5 = z7;
                                    int f2 = cVar.f(this, str);
                                    if (f2 != 0) {
                                        cVar.f2546a[i12] = f2;
                                        hashMap.put(Integer.valueOf(f2), str);
                                        viewById = getViewById(f2);
                                    }
                                } else {
                                    z5 = z7;
                                }
                                if (viewById != null) {
                                    w.i iVar2 = cVar.f2549d;
                                    w.d viewWidget2 = getViewWidget(viewById);
                                    iVar2.getClass();
                                    if (viewWidget2 != iVar2 && viewWidget2 != null) {
                                        int i14 = iVar2.f8801r0 + 1;
                                        w.d[] dVarArr = iVar2.f8800q0;
                                        if (i14 > dVarArr.length) {
                                            iVar2.f8800q0 = (w.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        w.d[] dVarArr2 = iVar2.f8800q0;
                                        int i15 = iVar2.f8801r0;
                                        dVarArr2[i15] = viewWidget2;
                                        iVar2.f8801r0 = i15 + 1;
                                    }
                                }
                                i12++;
                                z7 = z5;
                            }
                            z4 = z7;
                            cVar.f2549d.S();
                        }
                        i11++;
                        z7 = z4;
                        obj = null;
                    }
                }
                for (int i16 = 0; i16 < childCount3; i16++) {
                    getChildAt(i16);
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
                }
                for (int i18 = 0; i18 < childCount3; i18++) {
                    View childAt3 = getChildAt(i18);
                    w.d viewWidget3 = getViewWidget(childAt3);
                    if (viewWidget3 != null) {
                        e eVar = (e) childAt3.getLayoutParams();
                        w.e eVar2 = this.mLayoutWidget;
                        eVar2.f8736q0.add(viewWidget3);
                        w.d dVar2 = viewWidget3.f8681T;
                        if (dVar2 != null) {
                            ((w.e) dVar2).f8736q0.remove(viewWidget3);
                            viewWidget3.C();
                        }
                        viewWidget3.f8681T = eVar2;
                        applyConstraintsFromLayoutParams(isInEditMode, childAt3, viewWidget3, eVar, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z3) {
                w.e eVar3 = this.mLayoutWidget;
                eVar3.f8737r0.q(eVar3);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i4);
        int q4 = this.mLayoutWidget.q();
        int k4 = this.mLayoutWidget.k();
        w.e eVar4 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i4, q4, k4, eVar4.E0, eVar4.f8729F0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        w.d viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof w.h)) {
            e eVar = (e) view.getLayoutParams();
            w.h hVar = new w.h();
            eVar.f2606p0 = hVar;
            eVar.f2585d0 = USE_CONSTRAINTS_HELPER;
            hVar.S(eVar.f2574V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f2587e0 = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(cVar)) {
                this.mConstraintHelpers.add(cVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        w.d viewWidget = getViewWidget(view);
        this.mLayoutWidget.f8736q0.remove(viewWidget);
        viewWidget.C();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new i(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i4, int i5, int i6, boolean z3, boolean z4) {
        f fVar = this.mMeasurer;
        int i7 = fVar.f2621e;
        int resolveSizeAndState = View.resolveSizeAndState(i5 + fVar.f2620d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i6 + i7, i4, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z3) {
            min |= 16777216;
        }
        if (z4) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x0060, code lost:
    
        if (isRtl() != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a0  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolveSystem(w.e r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(w.e, int, int, int):void");
    }

    public void setConstraintSet(p pVar) {
        this.mConstraintSet = pVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(str, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(q qVar) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        w.e eVar = this.mLayoutWidget;
        eVar.f8728D0 = i;
        C0626c.p = eVar.W(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelfDimensionBehaviour(w.e r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.f r0 = r8.mMeasurer
            int r1 = r0.f2621e
            int r0 = r0.f2620d
            int r2 = r8.getChildCount()
            r3 = 0
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2
            if (r10 == r6) goto L2e
            if (r10 == 0) goto L22
            if (r10 == r5) goto L1a
            r11 = r3
        L18:
            r10 = r4
            goto L37
        L1a:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r0
            int r11 = java.lang.Math.min(r10, r11)
            goto L18
        L22:
            if (r2 != 0) goto L2c
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r3, r10)
        L2a:
            r10 = r7
            goto L37
        L2c:
            r11 = r3
            goto L2a
        L2e:
            if (r2 != 0) goto L2a
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r3, r10)
            goto L2a
        L37:
            if (r12 == r6) goto L53
            if (r12 == 0) goto L48
            if (r12 == r5) goto L40
            r13 = r3
        L3e:
            r7 = r4
            goto L5b
        L40:
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            int r13 = java.lang.Math.min(r12, r13)
            goto L3e
        L48:
            if (r2 != 0) goto L51
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r3, r12)
            goto L5b
        L51:
            r13 = r3
            goto L5b
        L53:
            if (r2 != 0) goto L5b
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r3, r12)
        L5b:
            int r12 = r9.q()
            if (r11 != r12) goto L67
            int r12 = r9.k()
            if (r13 == r12) goto L6b
        L67:
            r3.m r12 = r9.f8738s0
            r12.f8294c = r4
        L6b:
            r9.f8686Y = r3
            r9.Z = r3
            int r12 = r8.mMaxWidth
            int r12 = r12 - r0
            int[] r2 = r9.f8665C
            r2[r3] = r12
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            r2[r4] = r12
            r9.f8690b0 = r3
            r9.f8692c0 = r3
            r9.M(r10)
            r9.O(r11)
            r9.N(r7)
            r9.L(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r0
            if (r10 >= 0) goto L93
            r9.f8690b0 = r3
            goto L95
        L93:
            r9.f8690b0 = r10
        L95:
            int r8 = r8.mMinHeight
            int r8 = r8 - r1
            if (r8 >= 0) goto L9d
            r9.f8692c0 = r3
            return
        L9d:
            r9.f8692c0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(w.e, int, int, int, int):void");
    }

    public void setState(int i, int i4, int i5) {
        i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            float f2 = i4;
            float f4 = i5;
            int i6 = iVar.f2635b;
            SparseArray sparseArray = iVar.f2637d;
            int i7 = 0;
            ConstraintLayout constraintLayout = iVar.f2634a;
            if (i6 == i) {
                g gVar = i == -1 ? (g) sparseArray.valueAt(0) : (g) sparseArray.get(i6);
                int i8 = iVar.f2636c;
                if (i8 == -1 || !((h) gVar.f2625b.get(i8)).a(f2, f4)) {
                    while (true) {
                        ArrayList arrayList = gVar.f2625b;
                        if (i7 >= arrayList.size()) {
                            i7 = -1;
                            break;
                        } else if (((h) arrayList.get(i7)).a(f2, f4)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (iVar.f2636c == i7) {
                        return;
                    }
                    ArrayList arrayList2 = gVar.f2625b;
                    p pVar = i7 == -1 ? null : ((h) arrayList2.get(i7)).f2633f;
                    if (i7 != -1) {
                        int i9 = ((h) arrayList2.get(i7)).f2632e;
                    }
                    if (pVar == null) {
                        return;
                    }
                    iVar.f2636c = i7;
                    pVar.a(constraintLayout);
                    constraintLayout.setConstraintSet(null);
                    constraintLayout.requestLayout();
                    return;
                }
                return;
            }
            iVar.f2635b = i;
            g gVar2 = (g) sparseArray.get(i);
            while (true) {
                ArrayList arrayList3 = gVar2.f2625b;
                if (i7 >= arrayList3.size()) {
                    i7 = -1;
                    break;
                } else if (((h) arrayList3.get(i7)).a(f2, f4)) {
                    break;
                } else {
                    i7++;
                }
            }
            ArrayList arrayList4 = gVar2.f2625b;
            p pVar2 = i7 == -1 ? gVar2.f2627d : ((h) arrayList4.get(i7)).f2633f;
            if (i7 != -1) {
                int i10 = ((h) arrayList4.get(i7)).f2632e;
            }
            if (pVar2 != null) {
                iVar.f2636c = i7;
                pVar2.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
                return;
            }
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f2 + ", " + f4);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.constraintlayout.widget.e, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public e generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f2578a = -1;
        marginLayoutParams.f2580b = -1;
        marginLayoutParams.f2582c = -1.0f;
        marginLayoutParams.f2584d = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2586e = -1;
        marginLayoutParams.f2588f = -1;
        marginLayoutParams.f2590g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f2594j = -1;
        marginLayoutParams.f2596k = -1;
        marginLayoutParams.f2598l = -1;
        marginLayoutParams.f2600m = -1;
        marginLayoutParams.f2602n = -1;
        marginLayoutParams.f2604o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.f2607q = 0;
        marginLayoutParams.f2608r = BitmapDescriptorFactory.HUE_RED;
        marginLayoutParams.f2609s = -1;
        marginLayoutParams.f2610t = -1;
        marginLayoutParams.f2611u = -1;
        marginLayoutParams.f2612v = -1;
        marginLayoutParams.f2613w = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2614x = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2615y = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2616z = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2554A = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2555B = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2556C = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2557D = 0;
        marginLayoutParams.f2558E = 0.5f;
        marginLayoutParams.f2559F = 0.5f;
        marginLayoutParams.f2560G = null;
        marginLayoutParams.f2561H = -1.0f;
        marginLayoutParams.f2562I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.f2563K = 0;
        marginLayoutParams.f2564L = 0;
        marginLayoutParams.f2565M = 0;
        marginLayoutParams.f2566N = 0;
        marginLayoutParams.f2567O = 0;
        marginLayoutParams.f2568P = 0;
        marginLayoutParams.f2569Q = 0;
        marginLayoutParams.f2570R = 1.0f;
        marginLayoutParams.f2571S = 1.0f;
        marginLayoutParams.f2572T = -1;
        marginLayoutParams.f2573U = -1;
        marginLayoutParams.f2574V = -1;
        marginLayoutParams.f2575W = false;
        marginLayoutParams.f2576X = false;
        marginLayoutParams.f2577Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f2579a0 = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2581b0 = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2583c0 = false;
        marginLayoutParams.f2585d0 = false;
        marginLayoutParams.f2587e0 = false;
        marginLayoutParams.f2589f0 = -1;
        marginLayoutParams.f2591g0 = -1;
        marginLayoutParams.f2592h0 = -1;
        marginLayoutParams.f2593i0 = -1;
        marginLayoutParams.f2595j0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2597k0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2599l0 = 0.5f;
        marginLayoutParams.f2606p0 = new w.d();
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.e, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    @Override // android.view.ViewGroup
    public e generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f2578a = -1;
        marginLayoutParams.f2580b = -1;
        marginLayoutParams.f2582c = -1.0f;
        marginLayoutParams.f2584d = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2586e = -1;
        marginLayoutParams.f2588f = -1;
        marginLayoutParams.f2590g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f2594j = -1;
        marginLayoutParams.f2596k = -1;
        marginLayoutParams.f2598l = -1;
        marginLayoutParams.f2600m = -1;
        marginLayoutParams.f2602n = -1;
        marginLayoutParams.f2604o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.f2607q = 0;
        marginLayoutParams.f2608r = BitmapDescriptorFactory.HUE_RED;
        marginLayoutParams.f2609s = -1;
        marginLayoutParams.f2610t = -1;
        marginLayoutParams.f2611u = -1;
        marginLayoutParams.f2612v = -1;
        marginLayoutParams.f2613w = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2614x = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2615y = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2616z = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2554A = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2555B = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2556C = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2557D = 0;
        marginLayoutParams.f2558E = 0.5f;
        marginLayoutParams.f2559F = 0.5f;
        marginLayoutParams.f2560G = null;
        marginLayoutParams.f2561H = -1.0f;
        marginLayoutParams.f2562I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.f2563K = 0;
        marginLayoutParams.f2564L = 0;
        marginLayoutParams.f2565M = 0;
        marginLayoutParams.f2566N = 0;
        marginLayoutParams.f2567O = 0;
        marginLayoutParams.f2568P = 0;
        marginLayoutParams.f2569Q = 0;
        marginLayoutParams.f2570R = 1.0f;
        marginLayoutParams.f2571S = 1.0f;
        marginLayoutParams.f2572T = -1;
        marginLayoutParams.f2573U = -1;
        marginLayoutParams.f2574V = -1;
        marginLayoutParams.f2575W = false;
        marginLayoutParams.f2576X = false;
        marginLayoutParams.f2577Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f2579a0 = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2581b0 = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2583c0 = false;
        marginLayoutParams.f2585d0 = false;
        marginLayoutParams.f2587e0 = false;
        marginLayoutParams.f2589f0 = -1;
        marginLayoutParams.f2591g0 = -1;
        marginLayoutParams.f2592h0 = -1;
        marginLayoutParams.f2593i0 = -1;
        marginLayoutParams.f2595j0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2597k0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2599l0 = 0.5f;
        marginLayoutParams.f2606p0 = new w.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f2749b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i4 = d.f2553a.get(index);
            switch (i4) {
                case 1:
                    marginLayoutParams.f2574V = obtainStyledAttributes.getInt(index, marginLayoutParams.f2574V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.p);
                    marginLayoutParams.p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f2607q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2607q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f2608r) % 360.0f;
                    marginLayoutParams.f2608r = f2;
                    if (f2 < BitmapDescriptorFactory.HUE_RED) {
                        marginLayoutParams.f2608r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f2578a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f2578a);
                    break;
                case 6:
                    marginLayoutParams.f2580b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f2580b);
                    break;
                case 7:
                    marginLayoutParams.f2582c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f2582c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2586e);
                    marginLayoutParams.f2586e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f2586e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2588f);
                    marginLayoutParams.f2588f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f2588f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2590g);
                    marginLayoutParams.f2590g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f2590g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2594j);
                    marginLayoutParams.f2594j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f2594j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2596k);
                    marginLayoutParams.f2596k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f2596k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2598l);
                    marginLayoutParams.f2598l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f2598l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2600m);
                    marginLayoutParams.f2600m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f2600m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2609s);
                    marginLayoutParams.f2609s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f2609s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2610t);
                    marginLayoutParams.f2610t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f2610t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2611u);
                    marginLayoutParams.f2611u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f2611u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2612v);
                    marginLayoutParams.f2612v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f2612v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f2613w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2613w);
                    break;
                case 22:
                    marginLayoutParams.f2614x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2614x);
                    break;
                case 23:
                    marginLayoutParams.f2615y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2615y);
                    break;
                case 24:
                    marginLayoutParams.f2616z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2616z);
                    break;
                case 25:
                    marginLayoutParams.f2554A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2554A);
                    break;
                case 26:
                    marginLayoutParams.f2555B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2555B);
                    break;
                case 27:
                    marginLayoutParams.f2575W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f2575W);
                    break;
                case 28:
                    marginLayoutParams.f2576X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f2576X);
                    break;
                case 29:
                    marginLayoutParams.f2558E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f2558E);
                    break;
                case 30:
                    marginLayoutParams.f2559F = obtainStyledAttributes.getFloat(index, marginLayoutParams.f2559F);
                    break;
                case 31:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f2564L = i5;
                    if (i5 == 1) {
                        Log.e(TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f2565M = i6;
                    if (i6 == 1) {
                        Log.e(TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f2566N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2566N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f2566N) == -2) {
                            marginLayoutParams.f2566N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f2568P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2568P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f2568P) == -2) {
                            marginLayoutParams.f2568P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f2570R = Math.max(BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, marginLayoutParams.f2570R));
                    marginLayoutParams.f2564L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f2567O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2567O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f2567O) == -2) {
                            marginLayoutParams.f2567O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f2569Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2569Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f2569Q) == -2) {
                            marginLayoutParams.f2569Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f2571S = Math.max(BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, marginLayoutParams.f2571S));
                    marginLayoutParams.f2565M = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            p.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.f2561H = obtainStyledAttributes.getFloat(index, marginLayoutParams.f2561H);
                            break;
                        case 46:
                            marginLayoutParams.f2562I = obtainStyledAttributes.getFloat(index, marginLayoutParams.f2562I);
                            break;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f2563K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f2572T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f2572T);
                            break;
                        case 50:
                            marginLayoutParams.f2573U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f2573U);
                            break;
                        case 51:
                            marginLayoutParams.f2577Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2602n);
                            marginLayoutParams.f2602n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f2602n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f2604o);
                            marginLayoutParams.f2604o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f2604o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.f2557D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2557D);
                            break;
                        case 55:
                            marginLayoutParams.f2556C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f2556C);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    p.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    p.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    break;
                                case 67:
                                    marginLayoutParams.f2584d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f2584d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new w.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        g(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new w.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        g(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new w.e();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new f(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        g(attributeSet, i, i4);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.constraintlayout.widget.e, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f2578a = -1;
        marginLayoutParams.f2580b = -1;
        marginLayoutParams.f2582c = -1.0f;
        marginLayoutParams.f2584d = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2586e = -1;
        marginLayoutParams.f2588f = -1;
        marginLayoutParams.f2590g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f2594j = -1;
        marginLayoutParams.f2596k = -1;
        marginLayoutParams.f2598l = -1;
        marginLayoutParams.f2600m = -1;
        marginLayoutParams.f2602n = -1;
        marginLayoutParams.f2604o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.f2607q = 0;
        marginLayoutParams.f2608r = BitmapDescriptorFactory.HUE_RED;
        marginLayoutParams.f2609s = -1;
        marginLayoutParams.f2610t = -1;
        marginLayoutParams.f2611u = -1;
        marginLayoutParams.f2612v = -1;
        marginLayoutParams.f2613w = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2614x = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2615y = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2616z = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2554A = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2555B = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2556C = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2557D = 0;
        marginLayoutParams.f2558E = 0.5f;
        marginLayoutParams.f2559F = 0.5f;
        marginLayoutParams.f2560G = null;
        marginLayoutParams.f2561H = -1.0f;
        marginLayoutParams.f2562I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.f2563K = 0;
        marginLayoutParams.f2564L = 0;
        marginLayoutParams.f2565M = 0;
        marginLayoutParams.f2566N = 0;
        marginLayoutParams.f2567O = 0;
        marginLayoutParams.f2568P = 0;
        marginLayoutParams.f2569Q = 0;
        marginLayoutParams.f2570R = 1.0f;
        marginLayoutParams.f2571S = 1.0f;
        marginLayoutParams.f2572T = -1;
        marginLayoutParams.f2573U = -1;
        marginLayoutParams.f2574V = -1;
        marginLayoutParams.f2575W = false;
        marginLayoutParams.f2576X = false;
        marginLayoutParams.f2577Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.f2579a0 = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2581b0 = USE_CONSTRAINTS_HELPER;
        marginLayoutParams.f2583c0 = false;
        marginLayoutParams.f2585d0 = false;
        marginLayoutParams.f2587e0 = false;
        marginLayoutParams.f2589f0 = -1;
        marginLayoutParams.f2591g0 = -1;
        marginLayoutParams.f2592h0 = -1;
        marginLayoutParams.f2593i0 = -1;
        marginLayoutParams.f2595j0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2597k0 = IntCompanionObject.MIN_VALUE;
        marginLayoutParams.f2599l0 = 0.5f;
        marginLayoutParams.f2606p0 = new w.d();
        return marginLayoutParams;
    }
}
