package androidx.room;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final F.i f3987a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3988b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3989c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3990d;

    public o(F.i observer, int[] tableIds, String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f3987a = observer;
        this.f3988b = tableIds;
        this.f3989c = tableNames;
        this.f3990d = tableNames.length == 0 ? SetsKt.emptySet() : SetsKt.setOf(tableNames[0]);
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set invalidatedTablesIds) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f3988b;
        int length = iArr.length;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                int length2 = iArr.length;
                int i4 = 0;
                while (i < length2) {
                    int i5 = i4 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i]))) {
                        createSetBuilder.add(this.f3989c[i4]);
                    }
                    i++;
                    i4 = i5;
                }
                emptySet = SetsKt.build(createSetBuilder);
            } else {
                emptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f3990d : SetsKt.emptySet();
            }
        } else {
            emptySet = SetsKt.emptySet();
        }
        if (emptySet.isEmpty()) {
            return;
        }
        ((Channel) this.f3987a.f491c).mo1630trySendJP2dKIU(Unit.INSTANCE);
    }
}
