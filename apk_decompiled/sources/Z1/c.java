package Z1;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes3.dex */
public enum c implements ProtoEnum {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f2180a;

    c(int i4) {
        this.f2180a = i4;
    }

    @Override // com.google.firebase.encoders.proto.ProtoEnum
    public final int getNumber() {
        return this.f2180a;
    }
}
