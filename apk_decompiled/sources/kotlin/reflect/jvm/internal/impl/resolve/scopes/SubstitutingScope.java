package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

@SourceDebugExtension({"SMAP\nSubstitutingScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n372#2,3:112\n375#2,4:116\n19#3:115\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n*L\n52#1:112,3\n52#1:116,4\n54#1:115\n*E\n"})
/* loaded from: classes3.dex */
public final class SubstitutingScope implements MemberScope {
    private final Lazy _allDescriptors$delegate;
    private final TypeSubstitutor capturingSubstitutor;
    private Map<DeclarationDescriptor, DeclarationDescriptor> substitutedDescriptors;
    private final Lazy substitutor$delegate;
    private final MemberScope workerScope;

    public SubstitutingScope(MemberScope workerScope, final TypeSubstitutor givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.workerScope = workerScope;
        this.substitutor$delegate = LazyKt.lazy(new Function0<TypeSubstitutor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$substitutor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final TypeSubstitutor invoke() {
                return TypeSubstitutor.this.getSubstitution().buildSubstitutor();
            }
        });
        TypeSubstitution substitution = givenSubstitutor.getSubstitution();
        Intrinsics.checkNotNullExpressionValue(substitution, "getSubstitution(...)");
        this.capturingSubstitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this._allDescriptors$delegate = LazyKt.lazy(new Function0<Collection<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends DeclarationDescriptor> invoke() {
                MemberScope memberScope;
                Collection<? extends DeclarationDescriptor> substitute;
                SubstitutingScope substitutingScope = SubstitutingScope.this;
                memberScope = substitutingScope.workerScope;
                substitute = substitutingScope.substitute(ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, null, null, 3, null));
                return substitute;
            }
        });
    }

    private final Collection<DeclarationDescriptor> get_allDescriptors() {
        return (Collection) this._allDescriptors$delegate.getValue();
    }

    private final <D extends DeclarationDescriptor> D substitute(D d4) {
        if (this.capturingSubstitutor.isEmpty()) {
            return d4;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.substitutedDescriptors;
        Intrinsics.checkNotNull(map);
        DeclarationDescriptor declarationDescriptor = map.get(d4);
        if (declarationDescriptor == null) {
            if (!(d4 instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d4).toString());
            }
            declarationDescriptor = ((Substitutable) d4).substitute(this.capturingSubstitutor);
            if (declarationDescriptor != null) {
                map.put(d4, declarationDescriptor);
            } else {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d4 + " substitution fails");
            }
        }
        D d5 = (D) declarationDescriptor;
        Intrinsics.checkNotNull(d5, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo1396getContributedClassifier(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        ClassifierDescriptor mo1396getContributedClassifier = this.workerScope.mo1396getContributedClassifier(name, location);
        if (mo1396getContributedClassifier != null) {
            return (ClassifierDescriptor) substitute((SubstitutingScope) mo1396getContributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return get_allDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return substitute(this.workerScope.getContributedFunctions(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return substitute(this.workerScope.getContributedVariables(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo1400recordLookup(Name name, LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends DeclarationDescriptor> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.capturingSubstitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet newLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(substitute((SubstitutingScope) it.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }
}
