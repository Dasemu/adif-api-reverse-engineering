package com.adif.elcanomovil.commonNavGraph.arguments;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "Ljava/util/ArrayList;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction;", "Lkotlin/collections/ArrayList;", "key", "", "actions", "", "(Ljava/lang/String;[Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertAction;)V", "getKey", "()Ljava/lang/String;", "common-nav-graph_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertActions extends ArrayList<AlertAction> {
    private final String key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertActions(String key, AlertAction... actions) {
        super(ArraysKt.asList(actions));
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.key = key;
    }

    public /* bridge */ boolean contains(AlertAction alertAction) {
        return super.contains((Object) alertAction);
    }

    public final String getKey() {
        return this.key;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(AlertAction alertAction) {
        return super.indexOf((Object) alertAction);
    }

    public /* bridge */ int lastIndexOf(AlertAction alertAction) {
        return super.lastIndexOf((Object) alertAction);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ AlertAction remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ AlertAction removeAt(int i) {
        return remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AlertAction) {
            return contains((AlertAction) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AlertAction) {
            return indexOf((AlertAction) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AlertAction) {
            return lastIndexOf((AlertAction) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(AlertAction alertAction) {
        return super.remove((Object) alertAction);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof AlertAction) {
            return remove((AlertAction) obj);
        }
        return false;
    }
}
