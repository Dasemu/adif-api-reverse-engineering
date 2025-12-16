package com.adif.elcanomovil.uiAvisa.components.create;

import a.AbstractC0106b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationHandler;
import com.adif.elcanomovil.uiAvisa.components.create.NavigateTo;
import d.AbstractC0294c;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o0.AbstractC0544v;
import o0.C0522B;
import o0.C0523C;
import o0.D;
import o0.E;
import o0.H;

/* loaded from: classes.dex */
public final class g implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewIssueFragment f4840a;

    public g(NewIssueFragment newIssueFragment) {
        this.f4840a = newIssueFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Intent intent;
        AbstractC0294c abstractC0294c;
        NavigateTo navigateTo = (NavigateTo) obj;
        boolean z3 = navigateTo instanceof NavigateTo.RegularNavigation;
        NewIssueFragment newIssueFragment = this.f4840a;
        if (z3) {
            new NavigationHandler(newIssueFragment).invoke2(((NavigateTo.RegularNavigation) navigateTo).getNavigation());
        } else if (navigateTo instanceof NavigateTo.EditPicture) {
            NavigateTo.EditPicture editPicture = (NavigateTo.EditPicture) navigateTo;
            newIssueFragment.editPicture(editPicture.getPosition(), editPicture.getPictureContent());
        } else if (Intrinsics.areEqual(navigateTo, NavigateTo.PickPicture.INSTANCE)) {
            newIssueFragment.promptPickPictureDialog();
        } else if (navigateTo instanceof NavigateTo.PickImageFromCamera) {
            newIssueFragment.takePhoto(((NavigateTo.PickImageFromCamera) navigateTo).getImageUri());
        } else if (Intrinsics.areEqual(navigateTo, NavigateTo.PickImageFromGallery.INSTANCE)) {
            newIssueFragment.selectImageInAlbum();
        } else if (Intrinsics.areEqual(navigateTo, NavigateTo.AskForCameraPermission.INSTANCE)) {
            abstractC0294c = newIssueFragment.requestCameraPermissions;
            abstractC0294c.a(new String[]{"android.permission.CAMERA"});
        } else if (Intrinsics.areEqual(navigateTo, NavigateTo.NavigateUp.INSTANCE)) {
            AbstractC0544v n4 = m3.l.n(newIssueFragment);
            if (n4.h() == 1) {
                Activity activity = n4.f8049b;
                Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
                if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
                    E g4 = n4.g();
                    Intrinsics.checkNotNull(g4);
                    int i = g4.h;
                    H h = g4.f7921b;
                    while (true) {
                        if (h == null) {
                            break;
                        }
                        if (h.f7932l != i) {
                            Bundle bundle = new Bundle();
                            if (activity != null) {
                                Intrinsics.checkNotNull(activity);
                                if (activity.getIntent() != null) {
                                    Intrinsics.checkNotNull(activity);
                                    if (activity.getIntent().getData() != null) {
                                        Intrinsics.checkNotNull(activity);
                                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                                        H h4 = n4.f8050c;
                                        Intrinsics.checkNotNull(h4);
                                        Intrinsics.checkNotNull(activity);
                                        Intent intent2 = activity.getIntent();
                                        Intrinsics.checkNotNullExpressionValue(intent2, "activity!!.intent");
                                        D g5 = h4.g(new C0523C(intent2));
                                        if (g5 != null) {
                                            bundle.putAll(g5.f7914a.b(g5.f7915b));
                                        }
                                    }
                                }
                            }
                            A.j jVar = new A.j(n4);
                            int i4 = h.h;
                            ArrayList arrayList = (ArrayList) jVar.f29c;
                            arrayList.clear();
                            arrayList.add(new C0522B(i4, null));
                            if (((H) jVar.f30d) != null) {
                                jVar.r();
                            }
                            ((Intent) jVar.f28b).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                            jVar.b().b();
                            if (activity != null) {
                                activity.finish();
                            }
                        } else {
                            i = h.h;
                            h = h.f7921b;
                        }
                    }
                } else if (n4.f8053f) {
                    Intrinsics.checkNotNull(activity);
                    Intent intent3 = activity.getIntent();
                    Bundle extras2 = intent3.getExtras();
                    Intrinsics.checkNotNull(extras2);
                    int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
                    Intrinsics.checkNotNull(intArray);
                    List<Integer> mutableList = ArraysKt.toMutableList(intArray);
                    ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    int intValue = ((Number) CollectionsKt.removeLast(mutableList)).intValue();
                    if (parcelableArrayList != null) {
                    }
                    if (!mutableList.isEmpty()) {
                        E e4 = AbstractC0544v.e(n4.i(), intValue);
                        if (e4 instanceof H) {
                            int i5 = H.f7930n;
                            intValue = AbstractC0106b.h((H) e4).h;
                        }
                        E g6 = n4.g();
                        if (g6 != null && intValue == g6.h) {
                            A.j jVar2 = new A.j(n4);
                            Bundle b4 = AbstractC0106b.b(TuplesKt.to("android-support-nav:controller:deepLinkIntent", intent3));
                            Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle2 != null) {
                                b4.putAll(bundle2);
                            }
                            ((Intent) jVar2.f28b).putExtra("android-support-nav:controller:deepLinkExtras", b4);
                            int i6 = 0;
                            for (Object obj2 : mutableList) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                ((ArrayList) jVar2.f29c).add(new C0522B(((Number) obj2).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i6) : null));
                                if (((H) jVar2.f30d) != null) {
                                    jVar2.r();
                                }
                                i6 = i7;
                            }
                            jVar2.b().b();
                            activity.finish();
                        }
                    }
                }
            } else {
                n4.q();
            }
        }
        return Unit.INSTANCE;
    }
}
