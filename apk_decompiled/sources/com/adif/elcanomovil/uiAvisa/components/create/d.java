package com.adif.elcanomovil.uiAvisa.components.create;

import android.graphics.Bitmap;
import com.adif.elcanomovil.commonViews.ButtonsEvents;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.domain.entities.utils.AsyncResult;
import com.adif.elcanomovil.uiAvisa.databinding.FragmentAvisaNewBinding;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewIssueFragment f4835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(NewIssueFragment newIssueFragment, int i) {
        super(1);
        this.f4834a = i;
        this.f4835b = newIssueFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentAvisaNewBinding fragmentAvisaNewBinding;
        FragmentAvisaNewBinding fragmentAvisaNewBinding2;
        NewIssueViewModel viewModel;
        NewIssueViewModel viewModel2;
        NewIssueViewModel viewModel3;
        NewIssueViewModel viewModel4;
        NewIssueViewModel viewModel5;
        NewIssueViewModel viewModel6;
        FragmentAvisaNewBinding fragmentAvisaNewBinding3;
        Unit unit;
        FragmentAvisaNewBinding fragmentAvisaNewBinding4;
        FragmentAvisaNewBinding fragmentAvisaNewBinding5;
        Unit unit2;
        FragmentAvisaNewBinding fragmentAvisaNewBinding6;
        FragmentAvisaNewBinding fragmentAvisaNewBinding7;
        Unit unit3;
        FragmentAvisaNewBinding fragmentAvisaNewBinding8;
        FragmentAvisaNewBinding fragmentAvisaNewBinding9;
        switch (this.f4834a) {
            case 0:
                AsyncResult asyncResult = (AsyncResult) obj;
                int i = NewIssueFragment$bindViewModel$10$WhenMappings.$EnumSwitchMapping$0[asyncResult.getStatus().ordinal()];
                NewIssueFragment newIssueFragment = this.f4835b;
                if (i == 1) {
                    fragmentAvisaNewBinding = newIssueFragment.binding;
                    FragmentAvisaNewBinding fragmentAvisaNewBinding10 = null;
                    if (fragmentAvisaNewBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding = null;
                    }
                    fragmentAvisaNewBinding.createIssueCategory.setEnabled(true);
                    fragmentAvisaNewBinding2 = newIssueFragment.binding;
                    if (fragmentAvisaNewBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentAvisaNewBinding10 = fragmentAvisaNewBinding2;
                    }
                    fragmentAvisaNewBinding10.categoryButton.setEnabled(true);
                    List<AvisaStationCategory> list = (List) asyncResult.getData();
                    if (list != null) {
                        viewModel = newIssueFragment.getViewModel();
                        viewModel.setCategories(list);
                    }
                } else if (i == 2) {
                    viewModel2 = newIssueFragment.getViewModel();
                    viewModel2.showErrorDialog();
                }
                return Unit.INSTANCE;
            case 1:
                if (NewIssueFragment$bindViewModel$11$WhenMappings.$EnumSwitchMapping$0[((AsyncResult) obj).getStatus().ordinal()] == 3) {
                    viewModel3 = this.f4835b.getViewModel();
                    viewModel3.showErrorDialog();
                }
                return Unit.INSTANCE;
            case 2:
                AsyncResult asyncResult2 = (AsyncResult) obj;
                if (asyncResult2 != null) {
                    int i4 = NewIssueFragment$bindViewModel$12$WhenMappings.$EnumSwitchMapping$0[asyncResult2.getStatus().ordinal()];
                    if (i4 != 1) {
                        NewIssueFragment newIssueFragment2 = this.f4835b;
                        if (i4 == 2) {
                            newIssueFragment2.showProgress(8);
                            System.out.println((Object) "issue created");
                            viewModel4 = newIssueFragment2.getViewModel();
                            viewModel4.issueCreated();
                        } else if (i4 != 3) {
                            System.out.println((Object) "Unknown error");
                            viewModel6 = newIssueFragment2.getViewModel();
                            viewModel6.showErrorDialog();
                        } else {
                            newIssueFragment2.showProgress(8);
                            System.out.println(asyncResult2.getThrowable());
                            viewModel5 = newIssueFragment2.getViewModel();
                            viewModel5.showErrorDialog();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                List<Bitmap> list2 = (List) obj;
                if (list2 != null) {
                    fragmentAvisaNewBinding3 = this.f4835b.binding;
                    if (fragmentAvisaNewBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding3 = null;
                    }
                    fragmentAvisaNewBinding3.createIssueGrid.setImages(list2);
                }
                return Unit.INSTANCE;
            case 4:
                AvisaStationCategory avisaStationCategory = (AvisaStationCategory) obj;
                NewIssueFragment newIssueFragment3 = this.f4835b;
                if (avisaStationCategory != null) {
                    fragmentAvisaNewBinding5 = newIssueFragment3.binding;
                    if (fragmentAvisaNewBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding5 = null;
                    }
                    fragmentAvisaNewBinding5.createIssueCategory.setText(avisaStationCategory.getTitle());
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    fragmentAvisaNewBinding4 = newIssueFragment3.binding;
                    if (fragmentAvisaNewBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding4 = null;
                    }
                    fragmentAvisaNewBinding4.createIssueCategory.setText((CharSequence) null);
                }
                return Unit.INSTANCE;
            case 5:
                AvisaStation avisaStation = (AvisaStation) obj;
                NewIssueFragment newIssueFragment4 = this.f4835b;
                if (avisaStation != null) {
                    fragmentAvisaNewBinding7 = newIssueFragment4.binding;
                    if (fragmentAvisaNewBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding7 = null;
                    }
                    fragmentAvisaNewBinding7.createIssueStation.setText(avisaStation.getName());
                    newIssueFragment4.requestCategories(avisaStation.getStId());
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    fragmentAvisaNewBinding6 = newIssueFragment4.binding;
                    if (fragmentAvisaNewBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding6 = null;
                    }
                    fragmentAvisaNewBinding6.createIssueStation.setText((CharSequence) null);
                }
                return Unit.INSTANCE;
            case 6:
                Boolean bool = (Boolean) obj;
                NewIssueFragment newIssueFragment5 = this.f4835b;
                FragmentAvisaNewBinding fragmentAvisaNewBinding11 = null;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    fragmentAvisaNewBinding9 = newIssueFragment5.binding;
                    if (fragmentAvisaNewBinding9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentAvisaNewBinding9 = null;
                    }
                    fragmentAvisaNewBinding9.createIssueButton.setEnabled(booleanValue);
                    unit3 = Unit.INSTANCE;
                } else {
                    unit3 = null;
                }
                if (unit3 == null) {
                    fragmentAvisaNewBinding8 = newIssueFragment5.binding;
                    if (fragmentAvisaNewBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentAvisaNewBinding11 = fragmentAvisaNewBinding8;
                    }
                    fragmentAvisaNewBinding11.createIssueButton.setEnabled(false);
                }
                return Unit.INSTANCE;
            case 7:
                ButtonsEvents it = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f4835b.requireActivity().onBackPressed();
                return Unit.INSTANCE;
            default:
                ButtonsEvents it2 = (ButtonsEvents) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                this.f4835b.requireActivity().onBackPressed();
                return Unit.INSTANCE;
        }
    }
}
