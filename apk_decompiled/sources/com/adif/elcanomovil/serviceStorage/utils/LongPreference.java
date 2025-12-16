package com.adif.elcanomovil.serviceStorage.utils;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0097\u0002¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/utils/LongPreference;", "Lkotlin/properties/ReadWriteProperty;", "", "", "preferences", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Lkotlin/Lazy;Ljava/lang/String;)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Long;", "setValue", "", "value", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPreference.kt\ncom/adif/elcanomovil/serviceStorage/utils/LongPreference\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,31:1\n39#2,12:32\n*S KotlinDebug\n*F\n+ 1 LongPreference.kt\ncom/adif/elcanomovil/serviceStorage/utils/LongPreference\n*L\n26#1:32,12\n*E\n"})
/* loaded from: classes.dex */
public final class LongPreference implements ReadWriteProperty<Object, Long> {
    private final String name;
    private final Lazy<SharedPreferences> preferences;

    /* JADX WARN: Multi-variable type inference failed */
    public LongPreference(Lazy<? extends SharedPreferences> preferences, String name) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(name, "name");
        this.preferences = preferences;
        this.name = name;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Long l4) {
        setValue(obj, (KProperty<?>) kProperty, l4.longValue());
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public Long getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return Long.valueOf(this.preferences.getValue().getLong(this.name, 0L));
    }

    public void setValue(Object thisRef, KProperty<?> property, long value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        SharedPreferences.Editor edit = this.preferences.getValue().edit();
        edit.putLong(this.name, value);
        edit.apply();
    }
}
