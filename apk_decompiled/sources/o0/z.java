package o0;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0521A f8078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(C0521A c0521a, int i) {
        super(0);
        this.f8077a = i;
        this.f8078b = c0521a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8077a) {
            case 0:
                String str = this.f8078b.f7906j;
                if (str != null) {
                    return Pattern.compile(str);
                }
                return null;
            default:
                String str2 = this.f8078b.f7904f;
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
        }
    }
}
