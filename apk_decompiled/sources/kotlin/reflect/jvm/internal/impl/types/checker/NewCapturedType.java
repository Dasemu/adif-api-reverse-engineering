package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: classes3.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {
    private final TypeAttributes attributes;
    private final CaptureStatus captureStatus;
    private final NewCapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final boolean isProjectionNotNull;
    private final UnwrappedType lowerType;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    public final CaptureStatus getCaptureStatus() {
        return this.captureStatus;
    }

    public final UnwrappedType getLowerType() {
        return this.lowerType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public final boolean isProjectionNotNull() {
        return this.isProjectionNotNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, newAttributes, isMarkedNullable(), this.isProjectionNotNull);
    }

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.captureStatus = captureStatus;
        this.constructor = constructor;
        this.lowerType = unwrappedType;
        this.attributes = attributes;
        this.isMarkedNullable = z3;
        this.isProjectionNotNull = z4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public NewCapturedType makeNullableAsSpecified(boolean z3) {
        return new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, getAttributes(), z3, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.captureStatus;
        NewCapturedTypeConstructor refine = getConstructor().refine(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.lowerType;
        return new NewCapturedType(captureStatus, refine, unwrappedType != null ? kotlinTypeRefiner.refineType((KotlinTypeMarker) unwrappedType).unwrap() : null, getAttributes(), isMarkedNullable(), false, 32, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r11, kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12, kotlin.reflect.jvm.internal.impl.types.TypeProjection r13, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r14) {
        /*
            r10 = this;
            java.lang.String r0 = "captureStatus"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "projection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 56
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r11
            r4 = r12
            r3 = r1
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType.<init>(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.TypeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor):void");
    }
}
