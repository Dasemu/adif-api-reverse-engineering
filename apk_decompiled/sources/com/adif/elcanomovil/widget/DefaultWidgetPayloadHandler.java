package com.adif.elcanomovil.widget;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/adif/elcanomovil/widget/DefaultWidgetPayloadHandler;", "Lcom/adif/elcanomovil/widget/WidgetPayloadHandler;", "()V", "handlePayload", "Lcom/adif/elcanomovil/widget/WidgetPayload;", "bundle", "Landroid/os/Bundle;", "parse", "Companion", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultWidgetPayloadHandler implements WidgetPayloadHandler {
    public static final String IS_WIDGET_JSON_TYPE = "w";
    public static final String WIDGET_JSON_MESSAGE_DESTINATIONID = "d";
    public static final String WIDGET_JSON_MESSAGE_IS_CERCANIAS = "ce";
    public static final String WIDGET_JSON_MESSAGE_STATIONID = "o";

    private final WidgetPayload parse(Bundle bundle) {
        String string;
        String string2 = bundle.getString("o");
        if (string2 == null || (string = bundle.getString("d")) == null) {
            return null;
        }
        return new WidgetPayload(string2, string, bundle.getBoolean(WIDGET_JSON_MESSAGE_IS_CERCANIAS));
    }

    @Override // com.adif.elcanomovil.widget.WidgetPayloadHandler
    public WidgetPayload handlePayload(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean(IS_WIDGET_JSON_TYPE)) {
            return parse(bundle);
        }
        return null;
    }
}
