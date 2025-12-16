package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import d.C0292a;
import d.C0302k;
import e.AbstractC0311a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: androidx.fragment.app.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146f0 extends AbstractC0311a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3120a;

    public /* synthetic */ C0146f0(int i) {
        this.f3120a = i;
    }

    @Override // e.AbstractC0311a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f3120a) {
            case 0:
                C0302k c0302k = (C0302k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0302k.f6112b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = c0302k.f6111a;
                        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                        c0302k = new C0302k(intentSender, null, c0302k.f6113c, c0302k.f6114d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0302k);
                if (AbstractC0158l0.M(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                String input2 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                String[] input3 = {input2};
                Intrinsics.checkNotNullParameter(input3, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input3);
                Intrinsics.checkNotNullExpressionValue(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            default:
                Intent input4 = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input4, "input");
                return input4;
        }
    }

    @Override // e.AbstractC0311a
    public A.a b(Context context, Object obj) {
        switch (this.f3120a) {
            case 1:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length == 0) {
                    return new A.a(MapsKt.emptyMap(), 25);
                }
                for (String str : input) {
                    if (D.h.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
                for (String str2 : input) {
                    Pair pair = TuplesKt.to(str2, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new A.a(linkedHashMap, 25);
            case 2:
                String input2 = (String) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                if (D.h.checkSelfPermission(context, input2) == 0) {
                    return new A.a(Boolean.TRUE, 25);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // e.AbstractC0311a
    public final Object c(int i, Intent intent) {
        switch (this.f3120a) {
            case 0:
                return new C0292a(i, intent);
            case 1:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra == null || stringArrayExtra == null) {
                        return MapsKt.emptyMap();
                    }
                    ArrayList arrayList = new ArrayList(intArrayExtra.length);
                    for (int i4 : intArrayExtra) {
                        arrayList.add(Boolean.valueOf(i4 == 0));
                    }
                    return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
                }
                return MapsKt.emptyMap();
            case 2:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z3 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            if (intArrayExtra2[i5] == 0) {
                                z3 = true;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            default:
                return new C0292a(i, intent);
        }
    }
}
