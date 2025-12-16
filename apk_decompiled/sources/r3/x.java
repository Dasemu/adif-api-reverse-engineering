package r3;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: classes3.dex */
public final class x extends AbstractList implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8316c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0579k[] f8317a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8318b;

    public x(C0579k[] c0579kArr, int[] iArr) {
        this.f8317a = c0579kArr;
        this.f8318b = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0579k) {
            return super.contains((C0579k) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f8317a[i];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int get_size() {
        return this.f8317a.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0579k) {
            return super.indexOf((C0579k) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0579k) {
            return super.lastIndexOf((C0579k) obj);
        }
        return -1;
    }
}
