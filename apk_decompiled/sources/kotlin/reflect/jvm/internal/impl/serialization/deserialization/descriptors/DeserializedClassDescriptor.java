package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n288#2,2:428\n766#2:430\n857#2,2:431\n1549#2:433\n1620#2,3:434\n1549#2:437\n1620#2,3:438\n1603#2,9:441\n1855#2:450\n1856#2:452\n1612#2:453\n661#2,11:455\n1#3:451\n1#3:454\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n*L\n139#1:428,2\n151#1:430\n151#1:431,2\n151#1:433\n151#1:434,3\n157#1:437\n157#1:438,3\n188#1:441,9\n188#1:450\n188#1:452\n188#1:453\n218#1:455,11\n188#1:451\n*E\n"})
/* loaded from: classes3.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {
    private final Annotations annotations;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationContext f7139c;
    private final ClassId classId;
    private final ProtoBuf.Class classProto;
    private final NullableLazyValue<ClassDescriptor> companionObjectDescriptor;
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> constructors;
    private final DeclarationDescriptor containingDeclaration;
    private final EnumEntryClassDescriptors enumEntries;
    private final ClassKind kind;
    private final ScopesHolderForClass<DeserializedClassMemberScope> memberScopeHolder;
    private final BinaryVersion metadataVersion;
    private final Modality modality;
    private final NullableLazyValue<ClassConstructorDescriptor> primaryConstructor;
    private final NotNullLazyValue<Collection<ClassDescriptor>> sealedSubclasses;
    private final SourceElement sourceElement;
    private final MemberScopeImpl staticScope;
    private final ProtoContainer.Class thisAsProtoContainer;
    private final DeserializedClassTypeConstructor typeConstructor;
    private final NullableLazyValue<ValueClassRepresentation<SimpleType>> valueClassRepresentation;
    private final DescriptorVisibility visibility;

    @SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n1446#2,5:433\n1446#2,5:438\n1#3:432\n206#4,5:443\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n*L\n272#1:428\n272#1:429,3\n352#1:433,5\n358#1:438,5\n364#1:443,5\n*E\n"})
    /* loaded from: classes3.dex */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;
        private final KotlinTypeRefiner kotlinTypeRefiner;
        private final NotNullLazyValue<Collection<KotlinType>> refinedSupertypes;
        final /* synthetic */ DeserializedClassDescriptor this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r7.this$0 = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r8.getC()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r3 = r0.getFunctionList()
                java.lang.String r0 = "getFunctionList(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r4 = r0.getPropertyList()
                java.lang.String r0 = "getPropertyList(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r5 = r0.getTypeAliasList()
                java.lang.String r0 = "getTypeAliasList(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
                java.util.List r0 = r0.getNestedClassNameList()
                java.lang.String r1 = "getNestedClassNameList(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r8.getC()
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r8 = r8.getNameResolver()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r6 = kotlin.collections.CollectionsKt.g(r0)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L56:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L6e
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r8, r6)
                r1.add(r6)
                goto L56
            L6e:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                r6.<init>()
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r1.kotlinTypeRefiner = r9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r7 = r1.getC()
                kotlin.reflect.jvm.internal.impl.storage.StorageManager r7 = r7.getStorageManager()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                r8.<init>()
                kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r7 = r7.createLazyValue(r8)
                r1.allDescriptors = r7
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r7 = r1.getC()
                kotlin.reflect.jvm.internal.impl.storage.StorageManager r7 = r7.getStorageManager()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                r8.<init>()
                kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r7 = r7.createLazyValue(r8)
                r1.refinedSupertypes = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner):void");
        }

        private final <D extends CallableMemberDescriptor> void generateFakeOverrides(Name name, Collection<? extends D> collection, final List<D> list) {
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, collection, new ArrayList(list), getClassDescriptor(), new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                    Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                    OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                    list.add(fakeOverride);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public void conflict(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                    Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                    Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                    if (fromCurrent instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) fromCurrent).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, fromSuper);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeserializedClassDescriptor getClassDescriptor() {
            return this.this$0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void addEnumEntryDescriptors(Collection<DeclarationDescriptor> result, Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            EnumEntryClassDescriptors enumEntryClassDescriptors = getClassDescriptor().enumEntries;
            List all = enumEntryClassDescriptors != null ? enumEntryClassDescriptors.all() : null;
            if (all == null) {
                all = CollectionsKt.emptyList();
            }
            result.addAll(all);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void computeNonDeclaredFunctions(Name name, List<SimpleFunctionDescriptor> functions) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.refinedSupertypes.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            functions.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.this$0));
            generateFakeOverrides(name, arrayList, functions);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public void computeNonDeclaredProperties(Name name, List<PropertyDescriptor> descriptors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.refinedSupertypes.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList, descriptors);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public ClassId createClassId(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ClassId createNestedClassId = this.this$0.classId.createNestedClassId(name);
            Intrinsics.checkNotNullExpressionValue(createNestedClassId, "createNestedClassId(...)");
            return createNestedClassId;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* renamed from: getContributedClassifier */
        public ClassifierDescriptor mo1396getContributedClassifier(Name name, LookupLocation location) {
            ClassDescriptor findEnumEntry;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            mo1400recordLookup(name, location);
            EnumEntryClassDescriptors enumEntryClassDescriptors = getClassDescriptor().enumEntries;
            return (enumEntryClassDescriptors == null || (findEnumEntry = enumEntryClassDescriptors.findEnumEntry(name)) == null) ? super.mo1396getContributedClassifier(name, location) : findEnumEntry;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            return this.allDescriptors.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            mo1400recordLookup(name, location);
            return super.getContributedFunctions(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            mo1400recordLookup(name, location);
            return super.getContributedVariables(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<Name> getNonDeclaredClassifierNames() {
            List<KotlinType> mo1395getSupertypes = getClassDescriptor().typeConstructor.mo1395getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo1395getSupertypes.iterator();
            while (it.hasNext()) {
                Set<Name> classifierNames = ((KotlinType) it.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    return null;
                }
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, classifierNames);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<Name> getNonDeclaredFunctionNames() {
            List<KotlinType> mo1395getSupertypes = getClassDescriptor().typeConstructor.mo1395getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo1395getSupertypes.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(this.this$0));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public Set<Name> getNonDeclaredVariableNames() {
            List<KotlinType> mo1395getSupertypes = getClassDescriptor().typeConstructor.mo1395getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = mo1395getSupertypes.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public boolean isDeclaredFunctionAvailable(SimpleFunctionDescriptor function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.this$0, function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* renamed from: recordLookup */
        public void mo1400recordLookup(Name name, LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            UtilsKt.record(getC().getComponents().getLookupTracker(), location, getClassDescriptor(), name);
        }
    }

    @SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1194#2,2:428\n1222#2,4:430\n1620#2,3:434\n1620#2,3:437\n1603#2,9:440\n1855#2:449\n1856#2:451\n1612#2:452\n1#3:450\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n*L\n387#1:428,2\n387#1:430,4\n419#1:434,3\n420#1:437,3\n424#1:440,9\n424#1:449\n424#1:451\n424#1:452\n424#1:450\n*E\n"})
    /* loaded from: classes3.dex */
    public final class EnumEntryClassDescriptors {
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> enumEntryByName;
        private final Map<Name, ProtoBuf.EnumEntry> enumEntryProtos;
        private final NotNullLazyValue<Set<Name>> enumMemberNames;

        public EnumEntryClassDescriptors() {
            int collectionSizeOrDefault;
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            Intrinsics.checkNotNullExpressionValue(enumEntryList, "getEnumEntryList(...)");
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.getName(DeserializedClassDescriptor.this.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.enumEntryProtos = linkedHashMap;
            StorageManager storageManager = DeserializedClassDescriptor.this.getC().getStorageManager();
            final DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.enumEntryByName = storageManager.createMemoizedFunctionWithNullableValues(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final ClassDescriptor invoke(Name name) {
                    Map map;
                    NotNullLazyValue notNullLazyValue;
                    Intrinsics.checkNotNullParameter(name, "name");
                    map = DeserializedClassDescriptor.EnumEntryClassDescriptors.this.enumEntryProtos;
                    final ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) map.get(name);
                    if (enumEntry == null) {
                        return null;
                    }
                    final DeserializedClassDescriptor deserializedClassDescriptor2 = deserializedClassDescriptor;
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = DeserializedClassDescriptor.EnumEntryClassDescriptors.this;
                    StorageManager storageManager2 = deserializedClassDescriptor2.getC().getStorageManager();
                    notNullLazyValue = enumEntryClassDescriptors.enumMemberNames;
                    return EnumEntrySyntheticClassDescriptor.create(storageManager2, deserializedClassDescriptor2, name, notNullLazyValue, new DeserializedAnnotations(deserializedClassDescriptor2.getC().getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends AnnotationDescriptor> invoke() {
                            return CollectionsKt.toList(DeserializedClassDescriptor.this.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(DeserializedClassDescriptor.this.getThisAsProtoContainer$deserialization(), enumEntry));
                        }
                    }), SourceElement.NO_SOURCE);
                }
            });
            this.enumMemberNames = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Set<? extends Name> invoke() {
                    Set<? extends Name> computeEnumMemberNames;
                    computeEnumMemberNames = DeserializedClassDescriptor.EnumEntryClassDescriptors.this.computeEnumMemberNames();
                    return computeEnumMemberNames;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<Name> computeEnumMemberNames() {
            HashSet hashSet = new HashSet();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.getTypeConstructor().mo1395getSupertypes().iterator();
            while (it.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it.next().getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it2.next()).getName()));
            }
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor2.getC().getNameResolver(), ((ProtoBuf.Property) it3.next()).getName()));
            }
            return SetsKt.plus((Set) hashSet, (Iterable) hashSet);
        }

        public final Collection<ClassDescriptor> all() {
            Set<Name> keySet = this.enumEntryProtos.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                ClassDescriptor findEnumEntry = findEnumEntry((Name) it.next());
                if (findEnumEntry != null) {
                    arrayList.add(findEnumEntry);
                }
            }
            return arrayList;
        }

        public final ClassDescriptor findEnumEntry(Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.enumEntryByName.invoke(name);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext outerContext, ProtoBuf.Class classProto, NameResolver nameResolver, BinaryVersion metadataVersion, SourceElement sourceElement) {
        super(outerContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName()).getShortClassName());
        MemberScopeImpl memberScopeImpl;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.classProto = classProto;
        this.metadataVersion = metadataVersion;
        this.sourceElement = sourceElement;
        this.classId = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.modality = protoEnumFlags.modality(Flags.MODALITY.get(classProto.getFlags()));
        this.visibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(classProto.getFlags()));
        ClassKind classKind = protoEnumFlags.classKind(Flags.CLASS_KIND.get(classProto.getFlags()));
        this.kind = classKind;
        List<ProtoBuf.TypeParameter> typeParameterList = classProto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        ProtoBuf.TypeTable typeTable = classProto.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = classProto.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext childContext = outerContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion);
        this.f7139c = childContext;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        if (classKind == classKind2) {
            Boolean bool = Flags.HAS_ENUM_ENTRIES.get(classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            memberScopeImpl = new StaticScopeForKotlinEnum(childContext.getStorageManager(), this, bool.booleanValue() || Intrinsics.areEqual(childContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), Boolean.TRUE));
        } else {
            memberScopeImpl = MemberScope.Empty.INSTANCE;
        }
        this.staticScope = memberScopeImpl;
        this.typeConstructor = new DeserializedClassTypeConstructor();
        this.memberScopeHolder = ScopesHolderForClass.Companion.create(this, childContext.getStorageManager(), childContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.enumEntries = classKind == classKind2 ? new EnumEntryClassDescriptors() : null;
        DeclarationDescriptor containingDeclaration = outerContext.getContainingDeclaration();
        this.containingDeclaration = containingDeclaration;
        this.primaryConstructor = childContext.getStorageManager().createNullableLazyValue(new Function0<ClassConstructorDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$primaryConstructor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ClassConstructorDescriptor invoke() {
                ClassConstructorDescriptor computePrimaryConstructor;
                computePrimaryConstructor = DeserializedClassDescriptor.this.computePrimaryConstructor();
                return computePrimaryConstructor;
            }
        });
        this.constructors = childContext.getStorageManager().createLazyValue(new Function0<Collection<? extends ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$constructors$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends ClassConstructorDescriptor> invoke() {
                Collection<? extends ClassConstructorDescriptor> computeConstructors;
                computeConstructors = DeserializedClassDescriptor.this.computeConstructors();
                return computeConstructors;
            }
        });
        this.companionObjectDescriptor = childContext.getStorageManager().createNullableLazyValue(new Function0<ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$companionObjectDescriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ClassDescriptor invoke() {
                ClassDescriptor computeCompanionObjectDescriptor;
                computeCompanionObjectDescriptor = DeserializedClassDescriptor.this.computeCompanionObjectDescriptor();
                return computeCompanionObjectDescriptor;
            }
        });
        this.sealedSubclasses = childContext.getStorageManager().createLazyValue(new Function0<Collection<? extends ClassDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$sealedSubclasses$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends ClassDescriptor> invoke() {
                Collection<? extends ClassDescriptor> computeSubclassesForSealedClass;
                computeSubclassesForSealedClass = DeserializedClassDescriptor.this.computeSubclassesForSealedClass();
                return computeSubclassesForSealedClass;
            }
        });
        this.valueClassRepresentation = childContext.getStorageManager().createNullableLazyValue(new Function0<ValueClassRepresentation<SimpleType>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$valueClassRepresentation$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ValueClassRepresentation<SimpleType> invoke() {
                ValueClassRepresentation<SimpleType> computeValueClassRepresentation;
                computeValueClassRepresentation = DeserializedClassDescriptor.this.computeValueClassRepresentation();
                return computeValueClassRepresentation;
            }
        });
        NameResolver nameResolver2 = childContext.getNameResolver();
        TypeTable typeTable3 = childContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        this.thisAsProtoContainer = new ProtoContainer.Class(classProto, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.thisAsProtoContainer : null);
        this.annotations = !Flags.HAS_ANNOTATIONS.get(classProto.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(childContext.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$annotations$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                return CollectionsKt.toList(DeserializedClassDescriptor.this.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(DeserializedClassDescriptor.this.getThisAsProtoContainer$deserialization()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor computeCompanionObjectDescriptor() {
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor mo1396getContributedClassifier = getMemberScope().mo1396getContributedClassifier(NameResolverUtilKt.getName(this.f7139c.getNameResolver(), this.classProto.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (mo1396getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) mo1396getContributedClassifier;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<ClassConstructorDescriptor> computeConstructors() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) computeSecondaryConstructors(), (Iterable) CollectionsKt.listOfNotNull(mo1388getUnsubstitutedPrimaryConstructor())), (Iterable) this.f7139c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassConstructorDescriptor computePrimaryConstructor() {
        Object obj;
        if (this.kind.isSingleton()) {
            ClassConstructorDescriptorImpl createPrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            createPrimaryConstructorForObject.setReturnType(getDefaultType());
            return createPrimaryConstructorForObject;
        }
        List<ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        Iterator<T> it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags()).booleanValue()) {
                break;
            }
        }
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) obj;
        if (constructor != null) {
            return this.f7139c.getMemberDeserializer().loadConstructor(constructor, true);
        }
        return null;
    }

    private final List<ClassConstructorDescriptor> computeSecondaryConstructors() {
        int collectionSizeOrDefault;
        List<ProtoBuf.Constructor> constructorList = this.classProto.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : constructorList) {
            Boolean bool = Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            if (bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) it.next();
            MemberDeserializer memberDeserializer = this.f7139c.getMemberDeserializer();
            Intrinsics.checkNotNull(constructor);
            arrayList2.add(memberDeserializer.loadConstructor(constructor, false));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<ClassDescriptor> computeSubclassesForSealedClass() {
        if (this.modality != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = this.classProto.getSealedSubclassFqNameList();
        Intrinsics.checkNotNull(sealedSubclassFqNameList);
        if (sealedSubclassFqNameList.isEmpty()) {
            return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents components = this.f7139c.getComponents();
            NameResolver nameResolver = this.f7139c.getNameResolver();
            Intrinsics.checkNotNull(num);
            ClassDescriptor deserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (deserializeClass != null) {
                arrayList.add(deserializeClass);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueClassRepresentation<SimpleType> computeValueClassRepresentation() {
        if (!isInline() && !isValue()) {
            return null;
        }
        ValueClassRepresentation<SimpleType> loadValueClassRepresentation = ValueClassUtilKt.loadValueClassRepresentation(this.classProto, this.f7139c.getNameResolver(), this.f7139c.getTypeTable(), new DeserializedClassDescriptor$computeValueClassRepresentation$1(this.f7139c.getTypeDeserializer()), new DeserializedClassDescriptor$computeValueClassRepresentation$2(this));
        if (loadValueClassRepresentation != null) {
            return loadValueClassRepresentation;
        }
        if (this.metadataVersion.isAtLeast(1, 5, 1)) {
            return null;
        }
        ClassConstructorDescriptor mo1388getUnsubstitutedPrimaryConstructor = mo1388getUnsubstitutedPrimaryConstructor();
        if (mo1388getUnsubstitutedPrimaryConstructor == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List<ValueParameterDescriptor> valueParameters = mo1388getUnsubstitutedPrimaryConstructor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Name name = ((ValueParameterDescriptor) CollectionsKt.first((List) valueParameters)).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        SimpleType valueClassPropertyType = getValueClassPropertyType(name);
        if (valueClassPropertyType != null) {
            return new InlineClassRepresentation(name, valueClassPropertyType);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    private final DeserializedClassMemberScope getMemberScope() {
        return this.memberScopeHolder.getScope(this.f7139c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r0 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getValueClassPropertyType(kotlin.reflect.jvm.internal.impl.name.Name r5) {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope r4 = r4.getMemberScope()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION
            java.util.Collection r4 = r4.getContributedVariables(r5, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r0 = 0
            r1 = r5
        L13:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r4.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r3 = r3.getExtensionReceiverParameter()
            if (r3 != 0) goto L13
            if (r0 == 0) goto L2a
        L28:
            r1 = r5
            goto L30
        L2a:
            r0 = 1
            r1 = r2
            goto L13
        L2d:
            if (r0 != 0) goto L30
            goto L28
        L30:
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r1
            if (r1 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r1.getType()
        L38:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.getValueClassPropertyType(kotlin.reflect.jvm.internal.impl.name.Name):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final DeserializationContext getC() {
        return this.f7139c;
    }

    public final ProtoBuf.Class getClassProto() {
        return this.classProto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo1387getCompanionObjectDescriptor() {
        return this.companionObjectDescriptor.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return this.constructors.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        int collectionSizeOrDefault;
        List<ProtoBuf.Type> contextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(this.classProto, this.f7139c.getTypeTable());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(contextReceiverTypes, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(getThisAsReceiverParameter(), new ContextClassReceiver(this, this.f7139c.getTypeDeserializer().type((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f7139c.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.kind;
    }

    public final BinaryVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return this.sealedSubclasses.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return this.sourceElement;
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.memberScopeHolder.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo1388getUnsubstitutedPrimaryConstructor() {
        return this.primaryConstructor.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return this.valueClassRepresentation.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public DescriptorVisibility getVisibility() {
        return this.visibility;
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getMemberScope().getClassNames$deserialization().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.classProto.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        Boolean bool = Flags.IS_FUN_INTERFACE.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        Boolean bool = Flags.IS_VALUE_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue() && this.metadataVersion.isAtMost(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        Boolean bool = Flags.IS_VALUE_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue() && this.metadataVersion.isAtLeast(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(isExpect() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n1603#2,9:432\n1855#2:441\n1856#2:443\n1612#2:444\n1549#2:445\n1620#2,3:446\n1#3:442\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n*L\n239#1:428\n239#1:429,3\n243#1:432,9\n243#1:441\n243#1:443\n243#1:444\n250#1:445\n250#1:446,3\n243#1:442\n*E\n"})
    /* loaded from: classes3.dex */
    public final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.parameters = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends TypeParameterDescriptor> invoke() {
                    return TypeParameterUtilsKt.computeConstructorTypeParameters(DeserializedClassDescriptor.this);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public Collection<KotlinType> computeSupertypes() {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            String asString;
            FqName asSingleFqName;
            List<ProtoBuf.Type> supertypes = ProtoTypeTableUtilKt.supertypes(DeserializedClassDescriptor.this.getClassProto(), DeserializedClassDescriptor.this.getC().getTypeTable());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it.next()));
            }
            List plus = CollectionsKt.plus((Collection) arrayList, (Iterable) DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(DeserializedClassDescriptor.this));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = plus.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor mo1394getDeclarationDescriptor = ((KotlinType) it2.next()).getConstructor().mo1394getDeclarationDescriptor();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = mo1394getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) mo1394getDeclarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    NotFoundClasses.MockClassDescriptor mockClassDescriptor2 = (NotFoundClasses.MockClassDescriptor) it3.next();
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (asSingleFqName = classId.asSingleFqName()) == null || (asString = asSingleFqName.asString()) == null) {
                        asString = mockClassDescriptor2.getName().asString();
                    }
                    arrayList3.add(asString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt.toList(plus);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return this.parameters.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        public String toString() {
            String name = DeserializedClassDescriptor.this.getName().toString();
            Intrinsics.checkNotNullExpressionValue(name, "toString(...)");
            return name;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public DeserializedClassDescriptor mo1394getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }
}
