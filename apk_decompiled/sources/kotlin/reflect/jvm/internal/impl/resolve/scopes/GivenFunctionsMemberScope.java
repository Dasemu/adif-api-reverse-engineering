package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension({"SMAP\nGivenFunctionsMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,91:1\n32#2,2:92\n9#2,6:94\n32#2,2:100\n9#2,6:102\n1360#3:108\n1446#3,5:109\n800#3,11:114\n1477#3:125\n1502#3,3:126\n1505#3,3:136\n1477#3:139\n1502#3,3:140\n1505#3,3:150\n766#3:153\n857#3,2:154\n372#4,7:129\n372#4,7:143\n*S KotlinDebug\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n*L\n51#1:92,2\n51#1:94,6\n55#1:100,2\n55#1:102,6\n61#1:108\n61#1:109,5\n62#1:114,11\n63#1:125\n63#1:126,3\n63#1:136,3\n64#1:139\n64#1:140,3\n64#1:150,3\n68#1:153\n68#1:154,2\n63#1:129,7\n64#1:143,7\n*E\n"})
/* loaded from: classes3.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final NotNullLazyValue allDescriptors$delegate;
    private final ClassDescriptor containingClass;

    public GivenFunctionsMemberScope(StorageManager storageManager, ClassDescriptor containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.containingClass = containingClass;
        this.allDescriptors$delegate = storageManager.createLazyValue(new Function0<List<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends DeclarationDescriptor> invoke() {
                List createFakeOverrides;
                List<FunctionDescriptor> computeDeclaredFunctions = GivenFunctionsMemberScope.this.computeDeclaredFunctions();
                createFakeOverrides = GivenFunctionsMemberScope.this.createFakeOverrides(computeDeclaredFunctions);
                return CollectionsKt.plus((Collection) computeDeclaredFunctions, (Iterable) createFakeOverrides);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    public final List<DeclarationDescriptor> createFakeOverrides(List<? extends FunctionDescriptor> list) {
        ?? emptyList;
        final ArrayList arrayList = new ArrayList(3);
        Collection<KotlinType> mo1395getSupertypes = this.containingClass.getTypeConstructor().mo1395getSupertypes();
        Intrinsics.checkNotNullExpressionValue(mo1395getSupertypes, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = mo1395getSupertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ResolutionScope.DefaultImpls.getContributedDescriptors$default(((KotlinType) it.next()).getMemberScope(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            Name name = ((CallableMemberDescriptor) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Name name2 = (Name) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) obj2) instanceof FunctionDescriptor);
                Object obj3 = linkedHashMap2.get(valueOf);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj3);
                }
                ((List) obj3).add(obj2);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.DEFAULT;
                List list4 = list3;
                if (booleanValue) {
                    emptyList = new ArrayList();
                    for (Object obj4 : list) {
                        if (Intrinsics.areEqual(((FunctionDescriptor) obj4).getName(), name2)) {
                            emptyList.add(obj4);
                        }
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                overridingUtil.generateOverridesInFunctionGroup(name2, list4, (Collection) emptyList, this.containingClass, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                    public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                        OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                        arrayList.add(fakeOverride);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                    public void conflict(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                        throw new IllegalStateException(("Conflict in scope of " + this.getContainingClass() + ": " + fromSuper + " vs " + fromCurrent).toString());
                    }
                });
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }

    private final List<DeclarationDescriptor> getAllDescriptors() {
        return (List) StorageKt.getValue(this.allDescriptors$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public abstract List<FunctionDescriptor> computeDeclaredFunctions();

    public final ClassDescriptor getContainingClass() {
        return this.containingClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return !kindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask()) ? CollectionsKt.emptyList() : getAllDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        List list;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List<DeclarationDescriptor> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            list = CollectionsKt.emptyList();
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : allDescriptors) {
                if ((obj instanceof SimpleFunctionDescriptor) && Intrinsics.areEqual(((SimpleFunctionDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            list = smartList;
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        List list;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List<DeclarationDescriptor> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            list = CollectionsKt.emptyList();
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : allDescriptors) {
                if ((obj instanceof PropertyDescriptor) && Intrinsics.areEqual(((PropertyDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            list = smartList;
        }
        return list;
    }
}
