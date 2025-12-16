package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.internal.a;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import o0.C0525b;
import o0.C0526c;
import o0.E;
import o0.K;
import o0.U;
import o0.V;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Lo0/V;", "Lo0/b;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@U("activity")
/* loaded from: classes.dex */
public class ActivityNavigator extends V {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3443c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f3444d;

    public ActivityNavigator(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3443c = context;
        Iterator it = SequencesKt.generateSequence(context, C0526c.f7976b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f3444d = (Activity) obj;
    }

    @Override // o0.V
    public final E a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new E(this);
    }

    @Override // o0.V
    public final E c(E e4, Bundle bundle, K k4) {
        Intent intent;
        int intExtra;
        C0525b destination = (C0525b) e4;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.f7974k == null) {
            throw new IllegalStateException(a.m(new StringBuilder("Destination "), destination.h, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.f7974k);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = destination.f7975l;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f3444d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (k4 != null && k4.f7937a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.h);
        Context context = this.f3443c;
        Resources resources = context.getResources();
        if (k4 != null) {
            int i = k4.h;
            int i4 = k4.i;
            if ((i <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i), "animator")) && (i4 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i4), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i4);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i4) + " when launching " + destination);
            }
        }
        context.startActivity(intent2);
        if (k4 == null || activity == null) {
            return null;
        }
        int i5 = k4.f7942f;
        int i6 = k4.f7943g;
        if ((i5 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i5), "animator")) && (i6 <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(i6), "animator"))) {
            if (i5 < 0 && i6 < 0) {
                return null;
            }
            activity.overridePendingTransition(RangesKt.coerceAtLeast(i5, 0), RangesKt.coerceAtLeast(i6, 0));
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i5) + " and exit resource " + resources.getResourceName(i6) + "when launching " + destination);
        return null;
    }

    @Override // o0.V
    public final boolean j() {
        Activity activity = this.f3444d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
