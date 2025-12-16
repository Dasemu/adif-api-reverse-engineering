package com.adif.elcanomovil.serviceStorage.utils;

import Z2.AbstractC0104l;
import Z2.G;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B7\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u00012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0097\u0002¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/adif/elcanomovil/serviceStorage/utils/ObjectPreference;", "", "T", "Lkotlin/properties/ReadWriteProperty;", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "preferences", "LZ2/G;", "moshi", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "defaultValue", "Ljava/lang/reflect/Type;", "type", "<init>", "(Lkotlin/Lazy;LZ2/G;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lkotlin/Lazy;", "LZ2/G;", "Ljava/lang/String;", "Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "service-storage_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nObjectPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectPreference.kt\ncom/adif/elcanomovil/serviceStorage/utils/ObjectPreference\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,85:1\n39#2,12:86\n*S KotlinDebug\n*F\n+ 1 ObjectPreference.kt\ncom/adif/elcanomovil/serviceStorage/utils/ObjectPreference\n*L\n45#1:86,12\n*E\n"})
/* loaded from: classes.dex */
public final class ObjectPreference<T> implements ReadWriteProperty<Object, T> {
    private final T defaultValue;
    private final G moshi;
    private final String name;
    private final Lazy<SharedPreferences> preferences;
    private final Type type;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectPreference(Lazy<? extends SharedPreferences> preferences, G moshi, String name, T t2, Type type) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.preferences = preferences;
        this.moshi = moshi;
        this.name = name;
        this.defaultValue = t2;
        this.type = type;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public T getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        try {
            if (!this.preferences.getValue().contains(this.name)) {
                return this.defaultValue;
            }
            String string = this.preferences.getValue().getString(this.name, null);
            if (string != null && string.length() != 0) {
                T t2 = (T) this.moshi.b(this.type).fromJson(string);
                return t2 == null ? this.defaultValue : t2;
            }
            return this.defaultValue;
        } catch (Exception unused) {
            return this.defaultValue;
        }
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object thisRef, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        AbstractC0104l b4 = this.moshi.b(this.type);
        SharedPreferences.Editor edit = this.preferences.getValue().edit();
        edit.putString(this.name, b4.toJson(value));
        edit.apply();
    }
}
