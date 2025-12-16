package dagger.hilt.android.lifecycle;

import androidx.lifecycle.w0;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.b;
import l0.c;
import l0.d;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"VMF", "Ll0/c;", "Lkotlin/Function1;", "Landroidx/lifecycle/w0;", "callback", "withCreationCallback", "(Ll0/c;Lkotlin/jvm/functions/Function1;)Ll0/c;", "Ll0/d;", "addCreationCallback", "(Ll0/d;Lkotlin/jvm/functions/Function1;)Ll0/c;", "java_dagger_hilt_android_lifecycle-hilt_view_model_extensions_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "HiltViewModelExtensions")
/* loaded from: classes3.dex */
public final class HiltViewModelExtensions {
    public static final <VMF> c addCreationCallback(d dVar, final Function1<? super VMF, ? extends w0> callback) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        b CREATION_CALLBACK_KEY = HiltViewModelFactory.CREATION_CALLBACK_KEY;
        Intrinsics.checkNotNullExpressionValue(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        dVar.b(CREATION_CALLBACK_KEY, new Function1<Object, w0>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final w0 invoke(Object obj) {
                return callback.invoke(obj);
            }
        });
        return dVar;
    }

    public static final <VMF> c withCreationCallback(c cVar, Function1<? super VMF, ? extends w0> callback) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return addCreationCallback(new d(cVar), callback);
    }
}
