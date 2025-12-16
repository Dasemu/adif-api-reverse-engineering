package com.adif.elcanomovil.serviceStorage.utils;

import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0097\u0002J'\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/utils/StringPreference;", "Lkotlin/properties/ReadWriteProperty;", "", "", "preferences", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", AppMeasurementSdk.ConditionalUserProperty.NAME, "defaultValue", "(Lkotlin/Lazy;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringPreference.kt\ncom/adif/elcanomovil/serviceStorage/utils/StringPreference\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,30:1\n39#2,12:31\n*S KotlinDebug\n*F\n+ 1 StringPreference.kt\ncom/adif/elcanomovil/serviceStorage/utils/StringPreference\n*L\n27#1:31,12\n*E\n"})
/* loaded from: classes.dex */
public final class StringPreference implements ReadWriteProperty<Object, String> {
    private final String defaultValue;
    private final String name;
    private final Lazy<SharedPreferences> preferences;

    /* JADX WARN: Multi-variable type inference failed */
    public StringPreference(Lazy<? extends SharedPreferences> preferences, String name, String defaultValue) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.preferences = preferences;
        this.name = name;
        this.defaultValue = defaultValue;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, String str) {
        setValue2(obj, (KProperty<?>) kProperty, str);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public String getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String string = this.preferences.getValue().getString(this.name, this.defaultValue);
        return string == null ? this.defaultValue : string;
    }

    /* renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(Object thisRef, KProperty<?> property, String value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        SharedPreferences.Editor edit = this.preferences.getValue().edit();
        edit.putString(this.name, value);
        edit.apply();
    }
}
