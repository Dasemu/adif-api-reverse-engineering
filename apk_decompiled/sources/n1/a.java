package n1;

import com.adif.elcanomovil.domain.usecases.recentSearch.GetRecentSearchesUseCase;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public GetRecentSearchesUseCase f7843a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f7844b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f7845c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GetRecentSearchesUseCase f7847e;

    /* renamed from: f, reason: collision with root package name */
    public int f7848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GetRecentSearchesUseCase getRecentSearchesUseCase, Continuation continuation) {
        super(continuation);
        this.f7847e = getRecentSearchesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7846d = obj;
        this.f7848f |= IntCompanionObject.MIN_VALUE;
        return this.f7847e.invoke(this);
    }
}
