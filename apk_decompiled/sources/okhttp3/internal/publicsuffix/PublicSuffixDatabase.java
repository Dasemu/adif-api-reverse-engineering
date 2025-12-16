package okhttp3.internal.publicsuffix;

import a.AbstractC0105a;
import com.adif.elcanomovil.repositories.circulation.CirculationMapper;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import r3.C;
import r3.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "f0/b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f8101e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f8102f = CollectionsKt.listOf(CirculationMapper.VIA_ASTERISK);

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f8103g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8104a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f8105b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8106c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8107d;

    public static List c(String str) {
        List split$default;
        List dropLast;
        split$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (!Intrinsics.areEqual(CollectionsKt.last(split$default), "")) {
            return split$default;
        }
        dropLast = CollectionsKt___CollectionsKt.dropLast(split$default, 1);
        return dropLast;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r8, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0109, code lost:
    
        r12 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r11, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                C d4 = AbstractC0105a.d(new r(AbstractC0105a.R(resourceAsStream)));
                try {
                    long readInt = d4.readInt();
                    d4.P(readInt);
                    objectRef.element = d4.f8246b.b0(readInt);
                    long readInt2 = d4.readInt();
                    d4.P(readInt2);
                    objectRef2.element = d4.f8246b.b0(readInt2);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(d4, null);
                    synchronized (this) {
                        T t2 = objectRef.element;
                        Intrinsics.checkNotNull(t2);
                        this.f8106c = (byte[]) t2;
                        T t4 = objectRef2.element;
                        Intrinsics.checkNotNull(t4);
                        this.f8107d = (byte[]) t4;
                    }
                } finally {
                }
            }
        } finally {
            this.f8105b.countDown();
        }
    }
}
