package com.adif.elcanomovil.uiAvisa.components.details;

import C.w;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceComment;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceNotificationType;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStatus;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.GetIncidenceDetailsUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.resources.StringUtils;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.utils.ui.Utils;
import d1.C0309c;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import u.AbstractC0629f;

@HiltViewModel
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00112\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0015H\u0002¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\n2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00152\b\b\u0002\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010\u001f\u001a\u00020'2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015H\u0002¢\u0006\u0004\b\u001f\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u00108\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R$\u0010:\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010>\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R$\u0010@\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R$\u0010B\u001a\u00020'2\u0006\u0010/\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010F\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R$\u0010H\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u00107R$\u0010J\u001a\u00020'2\u0006\u0010/\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER$\u0010L\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u00105\u001a\u0004\bM\u00107R$\u0010N\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u00107R$\u0010P\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u0010=R$\u0010R\u001a\u00020'2\u0006\u0010/\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010ER$\u0010T\u001a\u00020'2\u0006\u0010/\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010C\u001a\u0004\bU\u0010ER$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bV\u0010=R \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010-R \u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010-R \u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001d\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0Z0\u00148F¢\u0006\u0006\u001a\u0004\bc\u0010\u0018¨\u0006e"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidenceDetailsUseCase;", "getIncidenceDetailsUseCase", "Landroid/content/Context;", "context", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidenceDetailsUseCase;Landroid/content/Context;)V", "", "issueId", "Lkotlinx/coroutines/Job;", "getIssueDetail", "(I)Lkotlinx/coroutines/Job;", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "issueStation", "", "fromDatabase", "", "populateView", "(Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;Z)V", "Landroidx/lifecycle/Q;", "", "Landroid/graphics/Bitmap;", "getUserPicturesLiveData", "()Landroidx/lifecycle/Q;", "getSystemPicturesLiveData", "isDataLoaded", "Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "showErrorDialog", "()Lcom/adif/elcanomovil/commonNavGraph/navigation/Navigation;", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceComment;", "comments", "prepareCommentPictures", "(Ljava/util/List;)V", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "pictures", "systemImages", "preparePictures", "(Ljava/util/List;Z)Lkotlinx/coroutines/Job;", "", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/GetIncidenceDetailsUseCase;", "Landroid/content/Context;", "Landroidx/lifecycle/X;", "dataLoaded", "Landroidx/lifecycle/X;", "Landroid/text/SpannableStringBuilder;", "<set-?>", "statusText", "Landroid/text/SpannableStringBuilder;", "getStatusText", "()Landroid/text/SpannableStringBuilder;", "statusBackgroundColour", "I", "getStatusBackgroundColour", "()I", "statusTextColour", "getStatusTextColour", "estimatedFixingDateVisibility", "Z", "getEstimatedFixingDateVisibility", "()Z", "estimatedFixingDate", "getEstimatedFixingDate", "descriptionText", "getDescriptionText", "notificationStatusText", "Ljava/lang/String;", "getNotificationStatusText", "()Ljava/lang/String;", "notificationStatusTextColour", "getNotificationStatusTextColour", "notificationDrawable", "getNotificationDrawable", "commentsText", "getCommentsText", "commentsColour", "getCommentsColour", "commentsDrawable", "getCommentsDrawable", "commentsEmpty", "getCommentsEmpty", "stationName", "getStationName", "categoryName", "getCategoryName", "getFromDatabase", "userPicturesLiveData", "systemPicturesLiveData", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "_userDetailIncidences", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryUpdateActions$delegate", "Lkotlin/Lazy;", "getMandatoryUpdateActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryUpdateActions", "getUserDetailIncidences", "userDetailIncidences", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIssueDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueDetailsViewModel.kt\ncom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,305:1\n1549#2:306\n1620#2,3:307\n1054#2:310\n766#2:311\n857#2,2:312\n1549#2:314\n1620#2,3:315\n2661#2,7:318\n*S KotlinDebug\n*F\n+ 1 IssueDetailsViewModel.kt\ncom/adif/elcanomovil/uiAvisa/components/details/IssueDetailsViewModel\n*L\n226#1:306\n226#1:307,3\n258#1:310\n259#1:311\n259#1:312,2\n263#1:314\n263#1:315,3\n278#1:318,7\n*E\n"})
/* loaded from: classes.dex */
public final class IssueDetailsViewModel extends w0 {
    private final W _userDetailIncidences;
    private String categoryName;
    private int commentsColour;
    private int commentsDrawable;
    private boolean commentsEmpty;
    private String commentsText;
    private final Context context;
    private final X dataLoaded;
    private SpannableStringBuilder descriptionText;
    private SpannableStringBuilder estimatedFixingDate;
    private boolean estimatedFixingDateVisibility;
    private boolean fromDatabase;
    private final GetIncidenceDetailsUseCase getIncidenceDetailsUseCase;

    /* renamed from: mandatoryUpdateActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryUpdateActions;
    private int notificationDrawable;
    private String notificationStatusText;
    private int notificationStatusTextColour;
    private String stationName;
    private int statusBackgroundColour;
    private SpannableStringBuilder statusText;
    private int statusTextColour;
    private final X systemPicturesLiveData;
    private final X userPicturesLiveData;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IncidenceStatus.values().length];
            try {
                iArr[IncidenceStatus.STATUS_TYPE_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IncidenceNotificationType.values().length];
            try {
                iArr2[IncidenceNotificationType.NOTIFICATION_TYPE_PUSH_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    @Inject
    public IssueDetailsViewModel(GetIncidenceDetailsUseCase getIncidenceDetailsUseCase, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(getIncidenceDetailsUseCase, "getIncidenceDetailsUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.getIncidenceDetailsUseCase = getIncidenceDetailsUseCase;
        this.context = context;
        this.dataLoaded = new Q();
        this.statusText = new SpannableStringBuilder();
        this.statusBackgroundColour = -1;
        this.statusTextColour = -1;
        this.estimatedFixingDate = new SpannableStringBuilder();
        this.descriptionText = new SpannableStringBuilder();
        this.notificationStatusText = "";
        this.notificationStatusTextColour = -1;
        this.notificationDrawable = -1;
        this.commentsText = "";
        this.commentsColour = -1;
        this.commentsDrawable = -1;
        this.commentsEmpty = true;
        this.stationName = "";
        this.categoryName = "";
        this.fromDatabase = true;
        this.userPicturesLiveData = new Q();
        this.systemPicturesLiveData = new Q();
        this._userDetailIncidences = new W();
        this.mandatoryUpdateActions = LazyKt.lazy(new e(this));
    }

    public static final /* synthetic */ W access$get_userDetailIncidences$p(IssueDetailsViewModel issueDetailsViewModel) {
        return issueDetailsViewModel._userDetailIncidences;
    }

    private final String comments(List<IncidenceComment> comments) {
        int collectionSizeOrDefault;
        String str;
        List sortedWith = CollectionsKt.sortedWith(comments, new Comparator() { // from class: com.adif.elcanomovil.uiAvisa.components.details.IssueDetailsViewModel$comments$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t4) {
                return ComparisonsKt.compareValues(((IncidenceComment) t4).getUpdatedTime(), ((IncidenceComment) t2).getUpdatedTime());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedWith) {
            if (((IncidenceComment) obj).getDescription().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            String string = this.context.getString(R.string.issue_no_comments);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IncidenceComment incidenceComment = (IncidenceComment) it.next();
            StringBuilder sb = new StringBuilder("<br>");
            Date updatedTime = incidenceComment.getUpdatedTime();
            if (updatedTime != null) {
                str = "<strong><small>" + ((SimpleDateFormat) C0309c.f6169b.getValue()).format(updatedTime) + "</small></strong><br>";
                if (str != null) {
                    sb.append(str);
                    StringBuilder a2 = AbstractC0629f.a(sb.toString());
                    a2.append(incidenceComment.getDescription());
                    a2.append("<br>");
                    arrayList2.add(a2.toString());
                }
            }
            Date createTime = incidenceComment.getCreateTime();
            str = createTime != null ? "<strong><small>" + ((SimpleDateFormat) C0309c.f6169b.getValue()).format(createTime) + "</small></strong><br>" : null;
            sb.append(str);
            StringBuilder a22 = AbstractC0629f.a(sb.toString());
            a22.append(incidenceComment.getDescription());
            a22.append("<br>");
            arrayList2.add(a22.toString());
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = w.n((String) next, (String) it2.next());
        }
        return (String) next;
    }

    private final AlertActions getMandatoryUpdateActions() {
        return (AlertActions) this.mandatoryUpdateActions.getValue();
    }

    public static /* synthetic */ void populateView$default(IssueDetailsViewModel issueDetailsViewModel, IncidenceStation incidenceStation, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z3 = true;
        }
        issueDetailsViewModel.populateView(incidenceStation, z3);
    }

    private final void prepareCommentPictures(List<IncidenceComment> comments) {
        int collectionSizeOrDefault;
        if (comments == null) {
            this.systemPicturesLiveData.k(null);
            return;
        }
        List<IncidenceComment> list = comments;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((IncidenceComment) it.next()).getFixPhotos());
        }
        preparePictures(CollectionsKt.flatten(arrayList), true);
    }

    private final Job preparePictures(List<IncidencePicture> pictures, boolean systemImages) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new g(pictures, systemImages, this, null), 2, null);
        return launch$default;
    }

    public static /* synthetic */ Job preparePictures$default(IssueDetailsViewModel issueDetailsViewModel, List list, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z3 = false;
        }
        return issueDetailsViewModel.preparePictures(list, z3);
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final int getCommentsColour() {
        return this.commentsColour;
    }

    public final int getCommentsDrawable() {
        return this.commentsDrawable;
    }

    public final boolean getCommentsEmpty() {
        return this.commentsEmpty;
    }

    public final String getCommentsText() {
        return this.commentsText;
    }

    public final SpannableStringBuilder getDescriptionText() {
        return this.descriptionText;
    }

    public final SpannableStringBuilder getEstimatedFixingDate() {
        return this.estimatedFixingDate;
    }

    public final boolean getEstimatedFixingDateVisibility() {
        return this.estimatedFixingDateVisibility;
    }

    public final boolean getFromDatabase() {
        return this.fromDatabase;
    }

    public final Job getIssueDetail(int issueId) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(q0.j(this), Dispatchers.getMain(), null, new d(this, issueId, null), 2, null);
        return launch$default;
    }

    public final int getNotificationDrawable() {
        return this.notificationDrawable;
    }

    public final String getNotificationStatusText() {
        return this.notificationStatusText;
    }

    public final int getNotificationStatusTextColour() {
        return this.notificationStatusTextColour;
    }

    public final String getStationName() {
        return this.stationName;
    }

    public final int getStatusBackgroundColour() {
        return this.statusBackgroundColour;
    }

    public final SpannableStringBuilder getStatusText() {
        return this.statusText;
    }

    public final int getStatusTextColour() {
        return this.statusTextColour;
    }

    public final Q getSystemPicturesLiveData() {
        return this.systemPicturesLiveData;
    }

    public final Q getUserDetailIncidences() {
        return this._userDetailIncidences;
    }

    public final Q getUserPicturesLiveData() {
        return this.userPicturesLiveData;
    }

    public final Q isDataLoaded() {
        return this.dataLoaded;
    }

    public final void populateView(IncidenceStation issueStation, boolean fromDatabase) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(issueStation, "issueStation");
        this.fromDatabase = fromDatabase;
        Date solvedDate = issueStation.getIncidence().getSolvedDate();
        if (solvedDate != null) {
            StringBuilder sb = new StringBuilder();
            StringUtils.Companion companion = StringUtils.INSTANCE;
            Context context = this.context;
            sb.append(companion.textBold(context, Utils.INSTANCE.getStringResource(context, issueStation.getIncidence().getStatusTypeId())).toString());
            sb.append('\n');
            Lazy lazy = C0309c.f6168a;
            sb.append(m3.d.o().format(solvedDate));
            this.estimatedFixingDate = new SpannableStringBuilder(sb.toString());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.estimatedFixingDate = new SpannableStringBuilder(Utils.INSTANCE.getStringResource(this.context, issueStation.getIncidence().getStatusTypeId()));
        }
        IncidenceStatus invoke = IncidenceStatus.INSTANCE.invoke(issueStation.getIncidence().getStatusTypeId());
        if ((invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()]) == 1) {
            Date estimatedDateTo = issueStation.getIncidence().getEstimatedDateTo();
            if (estimatedDateTo != null) {
                StringBuilder sb2 = new StringBuilder();
                StringUtils.Companion companion2 = StringUtils.INSTANCE;
                Context context2 = this.context;
                String string = context2.getString(R.string.avisa_issue_estimated_date);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                sb2.append(companion2.textBold(context2, string).toString());
                sb2.append(' ');
                Lazy lazy2 = C0309c.f6168a;
                sb2.append(m3.d.o().format(estimatedDateTo));
                this.statusText = new SpannableStringBuilder(sb2.toString());
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                this.statusText = new SpannableStringBuilder(this.context.getString(R.string.avisa_issue_estimated_date));
            }
            this.estimatedFixingDateVisibility = true;
            this.statusBackgroundColour = R.color.colour_issue_ongoing;
            this.statusTextColour = R.color.white;
        } else {
            this.statusTextColour = R.color.white;
            this.statusBackgroundColour = issueStation.getIncidence().getStatusTypeId() == IncidenceStatus.STATUS_TYPE_SOLVED.getValue() ? R.color.colour_issue_solved : R.color.colour_issue_canceled;
            this.estimatedFixingDateVisibility = false;
        }
        StringBuilder sb3 = new StringBuilder();
        StringUtils.Companion companion3 = StringUtils.INSTANCE;
        Context context3 = this.context;
        StringBuilder sb4 = new StringBuilder();
        Lazy lazy3 = C0309c.f6168a;
        sb4.append(m3.d.o().format(issueStation.getIncidence().getCreatedTime()));
        sb4.append(". ");
        sb3.append(companion3.textBold(context3, sb4.toString()).toString());
        sb3.append(issueStation.getIncidence().getDescription());
        this.descriptionText = new SpannableStringBuilder(sb3.toString());
        IncidenceNotificationType invoke2 = IncidenceNotificationType.INSTANCE.invoke(issueStation.getIncidence().getNotificationTypeId());
        if ((invoke2 != null ? WhenMappings.$EnumSwitchMapping$1[invoke2.ordinal()] : -1) == 1) {
            String string2 = this.context.getString(R.string.avisa_issue_notifications_on);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.notificationStatusText = string2;
            this.notificationStatusTextColour = D.h.getColor(this.context, R.color.yellow);
            this.notificationDrawable = R.drawable.icon_notifications;
        } else {
            String string3 = this.context.getString(R.string.avisa_issue_notifications_off);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            this.notificationStatusText = string3;
            this.notificationStatusTextColour = D.h.getColor(this.context, R.color.lightGrey);
            this.notificationDrawable = R.drawable.icon_notifications_inactive;
        }
        List<IncidenceComment> comments = issueStation.getIncidence().getComments();
        if (comments != null) {
            this.commentsEmpty = comments.isEmpty();
            if (comments.isEmpty()) {
                this.commentsDrawable = 0;
                String string4 = this.context.getString(R.string.issue_no_comments);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                this.commentsText = string4;
                this.commentsColour = D.h.getColor(this.context, R.color.lightGrey);
            } else {
                String comments2 = comments(comments);
                this.commentsText = comments2;
                if (Intrinsics.areEqual(comments2, this.context.getString(R.string.issue_no_comments))) {
                    this.commentsDrawable = 0;
                    this.commentsColour = D.h.getColor(this.context, R.color.lightGrey);
                    this.commentsEmpty = true;
                } else {
                    this.commentsColour = D.h.getColor(this.context, R.color.white);
                    this.commentsDrawable = R.drawable.ic_dropdown_open;
                }
            }
        }
        this.stationName = issueStation.getAvisaStation().getName();
        this.categoryName = issueStation.getCategoryAvisa().getTitle();
        preparePictures$default(this, issueStation.getIncidence().getPhotos(), false, 2, null);
        prepareCommentPictures(issueStation.getIncidence().getComments());
        this.dataLoaded.k(Boolean.TRUE);
    }

    public final Navigation showErrorDialog() {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.generic_error_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new Navigation.Direction(companion.toAlertDialog(false, false, string, string2, getMandatoryUpdateActions(), AlertType.WARNING), null, 2, null);
    }
}
