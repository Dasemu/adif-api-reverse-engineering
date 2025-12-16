package com.adif.elcanomovil.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CREATION", "MODIFICATION", "Companion", "common-resources_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypeSubscriptionCreationView {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypeSubscriptionCreationView[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final TypeSubscriptionCreationView CREATION = new TypeSubscriptionCreationView("CREATION", 0, 1);
    public static final TypeSubscriptionCreationView MODIFICATION = new TypeSubscriptionCreationView("MODIFICATION", 1, 2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView$Companion;", "", "()V", "invoke", "Lcom/adif/elcanomovil/enums/TypeSubscriptionCreationView;", "rawValue", "", "common-resources_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nenums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 enums.kt\ncom/adif/elcanomovil/enums/TypeSubscriptionCreationView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeSubscriptionCreationView invoke(int rawValue) {
            for (TypeSubscriptionCreationView typeSubscriptionCreationView : TypeSubscriptionCreationView.values()) {
                if (typeSubscriptionCreationView.getValue() == rawValue) {
                    return typeSubscriptionCreationView;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TypeSubscriptionCreationView[] $values() {
        return new TypeSubscriptionCreationView[]{CREATION, MODIFICATION};
    }

    static {
        TypeSubscriptionCreationView[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private TypeSubscriptionCreationView(String str, int i, int i4) {
        this.value = i4;
    }

    public static EnumEntries<TypeSubscriptionCreationView> getEntries() {
        return $ENTRIES;
    }

    public static TypeSubscriptionCreationView valueOf(String str) {
        return (TypeSubscriptionCreationView) Enum.valueOf(TypeSubscriptionCreationView.class, str);
    }

    public static TypeSubscriptionCreationView[] values() {
        return (TypeSubscriptionCreationView[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
