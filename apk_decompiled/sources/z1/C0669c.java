package z1;

import com.adif.elcanomovil.serviceNetworking.pinning.PinningPublicKeys;
import com.adif.elcanomovil.serviceNetworking.pinning.PinningRemoteDataSource;
import com.adif.elcanomovil.serviceNetworking.pinning.PinningRemoteDataSourceKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PinningRemoteDataSource f9011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669c(long j4, PinningRemoteDataSource pinningRemoteDataSource, Continuation continuation) {
        super(2, continuation);
        this.f9010b = j4;
        this.f9011c = pinningRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0669c(this.f9010b, this.f9011c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0669c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List asList;
        List asList2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f9009a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j4 = this.f9010b;
                C0668b c0668b = new C0668b(this.f9011c, null);
                this.f9009a = 1;
                obj = TimeoutKt.withTimeout(j4, c0668b, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            JSONObject jSONObject = new JSONObject((String) obj);
            JSONArray jSONArray = jSONObject.getJSONArray("estaciones_circulacion_key");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            asList = PinningRemoteDataSourceKt.asList(jSONArray);
            JSONArray jSONArray2 = jSONObject.getJSONArray("elcanoweb_avisa_key");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
            asList2 = PinningRemoteDataSourceKt.asList(jSONArray2);
            return new PinningPublicKeys(asList, asList2);
        } catch (Exception e4) {
            String message = "Failed to parse public keys JSON: " + e4.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            return null;
        }
    }
}
