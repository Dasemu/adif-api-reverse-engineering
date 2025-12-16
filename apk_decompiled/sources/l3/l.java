package l3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f7414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f7415b;

    public l(q qVar, u reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f7415b = qVar;
        this.f7414a = reader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Throwable th;
        EnumC0439b enumC0439b;
        q qVar = this.f7415b;
        u uVar = this.f7414a;
        EnumC0439b enumC0439b2 = EnumC0439b.INTERNAL_ERROR;
        IOException e4 = null;
        try {
            try {
                Intrinsics.checkNotNullParameter(this, "handler");
                if (!uVar.d(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        enumC0439b = enumC0439b2;
                        qVar.d(enumC0439b, enumC0439b2, e4);
                        f3.c.c(uVar);
                        throw th;
                    }
                } while (uVar.d(false, this));
                enumC0439b = EnumC0439b.NO_ERROR;
                try {
                    try {
                        qVar.d(enumC0439b, EnumC0439b.CANCEL, null);
                    } catch (IOException e5) {
                        e4 = e5;
                        EnumC0439b enumC0439b3 = EnumC0439b.PROTOCOL_ERROR;
                        qVar.d(enumC0439b3, enumC0439b3, e4);
                        f3.c.c(uVar);
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qVar.d(enumC0439b, enumC0439b2, e4);
                    f3.c.c(uVar);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e6) {
            e4 = e6;
        }
        f3.c.c(uVar);
        return Unit.INSTANCE;
    }
}
