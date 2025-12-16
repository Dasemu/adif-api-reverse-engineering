package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;

@SourceDebugExtension({"SMAP\nIntersectionTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,120:1\n1#2:121\n1045#3:122\n1549#3:129\n1620#3,2:130\n1622#3:138\n98#4,6:123\n104#4:132\n105#4,4:134\n112#4,7:139\n99#5:133\n*S KotlinDebug\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n66#1:122\n89#1:129\n89#1:130,2\n89#1:138\n89#1:123,6\n89#1:132\n89#1:134,4\n89#1:139,7\n89#1:133\n*E\n"})
/* loaded from: classes3.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {
    private KotlinType alternative;
    private final int hashCode;
    private final LinkedHashSet<KotlinType> intersectedTypes;

    public IntersectionTypeConstructor(Collection<? extends KotlinType> typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.intersectedTypes = linkedHashSet;
        this.hashCode = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<KotlinType, String>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(KotlinType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.toString();
                }
            };
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(function1);
    }

    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.intersectedTypes);
    }

    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, CollectionsKt.emptyList(), false, createScopeForKotlinType(), new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$createType$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                return IntersectionTypeConstructor.this.refine(kotlinTypeRefiner).createType();
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.areEqual(this.intersectedTypes, ((IntersectionTypeConstructor) obj).intersectedTypes);
        }
        return false;
    }

    public final KotlinType getAlternativeType() {
        return this.alternative;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.intersectedTypes.iterator().next().getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo1394getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getSupertypes */
    public Collection<KotlinType> mo1395getSupertypes() {
        return this.intersectedTypes;
    }

    public int hashCode() {
        return this.hashCode;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final String makeDebugNameForIntersectionType(final Function1<? super KotlinType, ? extends Object> getProperTypeRelatedToStringify) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.sortedWith(this.intersectedTypes, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                KotlinType kotlinType = (KotlinType) t2;
                Function1 function1 = Function1.this;
                Intrinsics.checkNotNull(kotlinType);
                String obj = function1.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t4;
                Function1 function12 = Function1.this;
                Intrinsics.checkNotNull(kotlinType2);
                return ComparisonsKt.compareValues(obj, function12.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new Function1<KotlinType, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(KotlinType kotlinType) {
                Function1<KotlinType, Object> function1 = getProperTypeRelatedToStringify;
                Intrinsics.checkNotNull(kotlinType);
                return function1.invoke(kotlinType).toString();
            }
        }, 24, null);
        return joinToString$default;
    }

    public final IntersectionTypeConstructor setAlternative(KotlinType kotlinType) {
        return new IntersectionTypeConstructor(this.intersectedTypes, kotlinType);
    }

    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public IntersectionTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> mo1395getSupertypes = mo1395getSupertypes();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(mo1395getSupertypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = mo1395getSupertypes.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).refine(kotlinTypeRefiner));
            z3 = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = null;
        if (z3) {
            KotlinType alternativeType = getAlternativeType();
            intersectionTypeConstructor = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructor == null ? this : intersectionTypeConstructor;
    }

    private IntersectionTypeConstructor(Collection<? extends KotlinType> collection, KotlinType kotlinType) {
        this(collection);
        this.alternative = kotlinType;
    }
}
