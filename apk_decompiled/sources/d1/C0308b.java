package d1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0308b f6165b = new C0308b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0308b f6166c = new C0308b(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6167a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0308b(int i, int i4) {
        super(i);
        this.f6167a = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6167a) {
            case 0:
                return new SimpleDateFormat("dd/MM/yyyy", Locale.US);
            default:
                return new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.US);
        }
    }
}
