package com.adif.elcanomovil.resources;

import Q2.d;
import S2.h;
import W2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/resources/IntentUtil;", "", "<init>", "()V", "LQ2/d;", "gson", "LQ2/d;", "getGson", "()LQ2/d;", "getGson$annotations", "common-resources_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntentUtil {
    public static final IntentUtil INSTANCE = new IntentUtil();
    private static final d gson;

    static {
        h hVar = h.f1597c;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z3 = b.f1971a;
        d dVar = new d(hVar, new HashMap(hashMap), new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, new ArrayList(linkedList));
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        gson = dVar;
    }

    private IntentUtil() {
    }

    public static /* synthetic */ void getGson$annotations() {
    }

    public final d getGson() {
        return gson;
    }
}
