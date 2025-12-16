package com.adif.elcanomovil.serviceStorage.utils;

import Q2.d;
import X2.a;
import com.adif.elcanomovil.serviceStorage.model.avisa.IncidenceCommentEntity;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/utils/CommentTypeConverter;", "", "<init>", "()V", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/adif/elcanomovil/serviceStorage/model/avisa/IncidenceCommentEntity;", "stringToList", "(Ljava/lang/String;)Ljava/util/List;", "someObjects", "listToString", "(Ljava/util/List;)Ljava/lang/String;", "LQ2/d;", "gson", "LQ2/d;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommentTypeConverter {
    private final d gson = new d();

    public final String listToString(List<IncidenceCommentEntity> someObjects) {
        String f2 = this.gson.f(someObjects);
        Intrinsics.checkNotNullExpressionValue(f2, "toJson(...)");
        return f2;
    }

    public final List<IncidenceCommentEntity> stringToList(String data) {
        if (data == null || Intrinsics.areEqual(data, "null")) {
            List<IncidenceCommentEntity> list = Collections.EMPTY_LIST;
            Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
            return list;
        }
        Type type = new a() { // from class: com.adif.elcanomovil.serviceStorage.utils.CommentTypeConverter$stringToList$listType$1
        }.getType();
        d dVar = this.gson;
        dVar.getClass();
        Object c4 = dVar.c(data, a.get(type));
        Intrinsics.checkNotNullExpressionValue(c4, "fromJson(...)");
        return (List) c4;
    }
}
