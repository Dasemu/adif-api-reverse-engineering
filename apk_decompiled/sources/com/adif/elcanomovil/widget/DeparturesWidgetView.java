package com.adif.elcanomovil.widget;

import I0.h;
import I0.p;
import S0.i;
import U.m;
import U.n;
import U.q;
import U.r;
import a.AbstractC0105a;
import a.AbstractC0106b;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompatService;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntents;
import com.adif.elcanomovil.commonNavGraph.navigation.NavigationIntentsKt;
import com.adif.elcanomovil.domain.entities.circulation.AvldmdCirculation;
import com.adif.elcanomovil.domain.entities.circulation.CercaniasCirculation;
import com.adif.elcanomovil.domain.entities.circulation.Circulation;
import com.adif.elcanomovil.domain.entities.circulation.DateHeaderCirculation;
import com.adif.elcanomovil.domain.entities.circulation.TrainCirculation;
import com.adif.elcanomovil.serviceStorage.model.FavouriteEntity;
import com.adif.elcanomovil.uiDepartures.adapters.TrainCirculationMapperKt;
import com.adif.elcanomovil.widget.utils.DateExtensionKt;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u.AbstractC0629f;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 j2\u00020\u0001:\u0001jB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010!J\u001f\u0010,\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010)J\u001f\u0010-\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010)J)\u00100\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b2\u0010!J\u0017\u00103\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b3\u0010!J+\u00107\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b;\u0010!J\u001f\u0010<\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010BJ+\u0010E\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u00102\b\u0010D\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bE\u0010FJ/\u0010J\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020H2\u0006\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010KJ/\u0010M\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020L2\u0006\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u0001042\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u0004\u0018\u00010.2\u0006\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u0004\u0018\u00010.2\u0006\u0010>\u001a\u00020\b2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u0004\u0018\u00010.2\u0006\u0010>\u001a\u00020\b2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\bX\u0010WJ!\u0010Y\u001a\u0004\u0018\u00010.2\u0006\u0010>\u001a\u00020\b2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\bY\u0010WJ\u001d\u0010Z\u001a\u0004\u0018\u00010.*\u0002042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020HH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020HH\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010b\u001a\u00020a*\u00020`H\u0002¢\u0006\u0004\bb\u0010cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010eR\u001c\u0010h\u001a\n g*\u0004\u0018\u00010f0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetView;", "", "Landroid/content/Context;", "context", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "navigationIntents", "<init>", "(Landroid/content/Context;Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;)V", "", "widgetId", "Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;", "widgetInfo", "", "loading", "(ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)V", "", "Lcom/adif/elcanomovil/domain/entities/circulation/Circulation;", "circulations", FirebaseAnalytics.Param.SUCCESS, "(ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;Ljava/util/List;)V", "networkError", "backgroundDataError", "otherError", "noResults", "missingInformationError", "(I)V", "title", "message", "genericError", "(ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;II)V", "Landroid/widget/RemoteViews;", "views", "setControlsUpdatingState", "(Landroid/widget/RemoteViews;)V", "", "updatedTime", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setControlsEnabledState", "(Landroid/widget/RemoteViews;ILjava/lang/String;Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)V", "image", "setEmptyViewImage", "(Landroid/widget/RemoteViews;I)V", "removeEmptyViewImage", "resourceId", "setEmptyViewTitle", "setEmptyViewSubtitle", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "setEmptyViewActionButton", "(Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;)V", "removeEmptyViewActionButton", "removeEmptyViewSubtitle", "Landroid/content/Intent;", "intent", "LU/n;", "toRemoteViews", "(Ljava/util/List;ILandroid/content/Intent;)LU/n;", "displayEmptyView", "(Landroid/widget/RemoteViews;Landroid/app/PendingIntent;)V", "displayResultsView", "updateCirculationInfo", "(Landroid/widget/RemoteViews;Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)V", "appWidgetId", "updateHeaders", "(Landroid/widget/RemoteViews;ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)V", "commitChanges", "(ILandroid/widget/RemoteViews;)V", "item", "openAppIntent", "getUpdatedCirculationRemoteView", "(ILcom/adif/elcanomovil/domain/entities/circulation/Circulation;Landroid/content/Intent;)Landroid/widget/RemoteViews;", "remoteView", "Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;", "movement", "bindCercaniasCirculationRemoteView", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;I)V", "Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation;", "bindAVLDMDCirculationRemoteView", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/adif/elcanomovil/domain/entities/circulation/AvldmdCirculation;I)V", "Lcom/adif/elcanomovil/domain/entities/circulation/DateHeaderCirculation;", "bindMovementHeaderRemoteView", "(Landroid/widget/RemoteViews;Lcom/adif/elcanomovil/domain/entities/circulation/DateHeaderCirculation;)V", "createOpenRoutesViewIntent", "(Lcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)Landroid/content/Intent;", "creteIgnoreBackgroundDataRestrictionsSettingsPendingIntent", "(I)Landroid/app/PendingIntent;", "createUpdatePendingIntent", "(ILcom/adif/elcanomovil/serviceStorage/model/FavouriteEntity;)Landroid/app/PendingIntent;", "createChangeWayPendingIntent", "createOpenRoutesViewPendingIntent", "toPendingBroadcastIntent", "(Landroid/content/Intent;I)Landroid/app/PendingIntent;", "updateWidgetLineInformation", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;)V", "setWidgetLineInformationLegacyFormat", "(Landroid/widget/RemoteViews;Lcom/adif/elcanomovil/domain/entities/circulation/CercaniasCirculation;)V", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "Landroid/content/Context;", "Lcom/adif/elcanomovil/commonNavGraph/navigation/NavigationIntents;", "Landroid/appwidget/AppWidgetManager;", "kotlin.jvm.PlatformType", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "Companion", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeparturesWidgetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeparturesWidgetView.kt\ncom/adif/elcanomovil/widget/DeparturesWidgetView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,587:1\n1864#2,3:588\n24#3:591\n849#4,5:592\n1#5:597\n*S KotlinDebug\n*F\n+ 1 DeparturesWidgetView.kt\ncom/adif/elcanomovil/widget/DeparturesWidgetView\n*L\n235#1:588,3\n508#1:591\n513#1:592,5\n*E\n"})
/* loaded from: classes3.dex */
public final class DeparturesWidgetView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MIN_WIDGET_SIZE_TO_HIDE_COLUMN = 4;
    private final AppWidgetManager appWidgetManager;
    private final Context context;
    private final NavigationIntents navigationIntents;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adif/elcanomovil/widget/DeparturesWidgetView$Companion;", "", "()V", "MIN_WIDGET_SIZE_TO_HIDE_COLUMN", "", "getCellsForSize", "size", "setPlatformText", "", "remoteView", "Landroid/widget/RemoteViews;", "circulation", "Lcom/adif/elcanomovil/domain/entities/circulation/TrainCirculation;", "getMinWidthCells", "Landroid/appwidget/AppWidgetManager;", "widgetId", "widget_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getCellsForSize(int size) {
            int i = 2;
            while ((i * 70) - 30 < size) {
                i++;
            }
            return i - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getMinWidthCells(AppWidgetManager appWidgetManager, int i) {
            return getCellsForSize(appWidgetManager.getAppWidgetOptions(i).getInt("appWidgetMinWidth"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setPlatformText(RemoteViews remoteView, TrainCirculation circulation) {
            int i = R.id.platform;
            remoteView.setTextViewText(i, TrainCirculationMapperKt.getPlatformText(circulation));
            remoteView.setFloat(i, "setAlpha", TrainCirculationMapperKt.getPlatformTextAlpha(circulation));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvldmdCirculation.State.values().length];
            try {
                iArr[AvldmdCirculation.State.SUPPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvldmdCirculation.State.DELAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DeparturesWidgetView(@ApplicationContext Context context, NavigationIntents navigationIntents) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigationIntents, "navigationIntents");
        this.context = context;
        this.navigationIntents = navigationIntents;
        this.appWidgetManager = AppWidgetManager.getInstance(context);
    }

    private final void bindAVLDMDCirculationRemoteView(Context context, RemoteViews remoteView, AvldmdCirculation movement, int appWidgetId) {
        remoteView.setTextViewText(R.id.time, movement.getTime());
        int i = R.id.delayed_time;
        remoteView.setTextViewText(i, movement.getDelayedTime());
        remoteView.setTextViewText(R.id.station, movement.getStationShortName());
        Companion companion = INSTANCE;
        companion.setPlatformText(remoteView, movement);
        remoteView.setTextViewText(R.id.operator, AbstractC0105a.K(context, movement.getTrain().getOperator()));
        remoteView.setTextViewText(R.id.product, AbstractC0105a.k(context, movement.getTrain().getCommercialProduct()));
        remoteView.setTextViewText(R.id.number, movement.getTrain().getCommercialNumber());
        AvldmdCirculation.State state = movement.getState();
        int i4 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i4 == 1) {
            remoteView.setViewVisibility(i, 8);
            int i5 = R.id.action;
            remoteView.setViewVisibility(i5, 0);
            remoteView.setTextViewText(i5, context.getString(com.adif.elcanomovil.uiDepartures.R.string.circulation_train_suppressed));
            int i6 = R.id.indicator_left;
            remoteView.setViewVisibility(i6, 0);
            int i7 = R.id.indicator_right;
            remoteView.setViewVisibility(i7, 0);
            int i8 = com.adif.elcanomovil.uiDepartures.R.color.darkRed;
            remoteView.setInt(i6, "setBackgroundColor", context.getColor(i8));
            remoteView.setInt(i7, "setBackgroundColor", context.getColor(i8));
            remoteView.setViewVisibility(R.id.suppressed_train, 0);
            remoteView.setViewVisibility(R.id.platform, 4);
        } else if (i4 != 2) {
            remoteView.setViewVisibility(i, 8);
            remoteView.setViewVisibility(R.id.action, 8);
            remoteView.setViewVisibility(R.id.indicator_right, 4);
            remoteView.setViewVisibility(R.id.indicator_left, 4);
            remoteView.setViewVisibility(R.id.suppressed_train, 8);
            remoteView.setViewVisibility(R.id.platform, 0);
        } else {
            remoteView.setTextViewText(i, movement.getDelayedTime());
            remoteView.setViewVisibility(i, 0);
            remoteView.setViewVisibility(R.id.action, 8);
            remoteView.setViewVisibility(R.id.indicator_right, 4);
            remoteView.setViewVisibility(R.id.indicator_left, 4);
            remoteView.setViewVisibility(R.id.suppressed_train, 8);
            remoteView.setViewVisibility(R.id.platform, 0);
        }
        String observation = movement.getObservation();
        if (observation == null || observation.length() == 0) {
            remoteView.setViewVisibility(R.id.notes_observation, 8);
        } else {
            int i9 = R.id.notes_observation;
            remoteView.setViewVisibility(i9, 0);
            remoteView.setTextViewText(i9, movement.getObservation());
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(appWidgetManager, "getInstance(...)");
        remoteView.setViewVisibility(R.id.train_info_avldmd, companion.getMinWidthCells(appWidgetManager, appWidgetId) > 4 ? 0 : 8);
    }

    private final void bindCercaniasCirculationRemoteView(Context context, RemoteViews remoteView, CercaniasCirculation movement, int appWidgetId) {
        String str;
        String observation;
        String observation2;
        if (movement.getTime().length() == 0) {
            remoteView.setViewVisibility(R.id.time, 8);
        } else {
            int i = R.id.time;
            remoteView.setViewVisibility(i, 0);
            remoteView.setTextViewText(i, movement.getTime());
        }
        Companion companion = INSTANCE;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(appWidgetManager, "getInstance(...)");
        remoteView.setViewVisibility(R.id.line_cercanias, companion.getMinWidthCells(appWidgetManager, appWidgetId) <= 4 ? 8 : 0);
        remoteView.setTextViewText(R.id.station, movement.getStationShortName());
        updateWidgetLineInformation(context, remoteView, movement);
        remoteView.setViewVisibility(R.id.accessibility, movement.getAccessibleStation() ? 0 : 4);
        companion.setPlatformText(remoteView, movement);
        if (!movement.isShortTrain() && ((observation2 = movement.getObservation()) == null || observation2.length() == 0)) {
            remoteView.setViewVisibility(R.id.notes_observation, 8);
            return;
        }
        if (movement.isShortTrain()) {
            str = context.getString(com.adif.elcanomovil.uiDepartures.R.string.circulation_train_short);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        } else {
            str = "";
        }
        if (str.length() > 0 && (observation = movement.getObservation()) != null && observation.length() != 0) {
            str = str.concat(" - ");
        }
        String observation3 = movement.getObservation();
        if (observation3 != null && observation3.length() != 0) {
            StringBuilder a2 = AbstractC0629f.a(str);
            a2.append(movement.getObservation());
            str = a2.toString();
        }
        int i4 = R.id.notes_observation;
        remoteView.setViewVisibility(i4, 0);
        remoteView.setTextViewText(i4, str);
    }

    private final void bindMovementHeaderRemoteView(RemoteViews remoteView, DateHeaderCirculation item) {
        remoteView.setTextViewText(R.id.widget_header_date, item.getDate());
    }

    private final void commitChanges(int widgetId, RemoteViews views) {
        this.appWidgetManager.updateAppWidget(widgetId, views);
    }

    private final PendingIntent createChangeWayPendingIntent(int appWidgetId, FavouriteEntity data) {
        Intent intent = new Intent(this.context, (Class<?>) DeparturesWidget.class);
        intent.putExtra("appWidgetId", appWidgetId);
        intent.setAction(DeparturesWidget.ACTION_APPWIDGET_CHANGE_WAY);
        intent.putExtra(DefaultWidgetPayloadHandler.IS_WIDGET_JSON_TYPE, true);
        intent.putExtra("o", data.getIdentifierStation());
        intent.putExtra("d", data.getIdentifierToStation());
        intent.putExtra(DefaultWidgetPayloadHandler.WIDGET_JSON_MESSAGE_IS_CERCANIAS, data.isCercanias());
        return toPendingBroadcastIntent(intent, appWidgetId);
    }

    private final Intent createOpenRoutesViewIntent(FavouriteEntity data) {
        String identifierToStation;
        String identifierStation = data.getIdentifierStation();
        if (identifierStation == null || (identifierToStation = data.getIdentifierToStation()) == null) {
            return null;
        }
        NavigationIntents navigationIntents = this.navigationIntents;
        Boolean isCercanias = data.isCercanias();
        return navigationIntents.createOpenRoutesViewIntent(identifierStation, identifierToStation, isCercanias != null ? isCercanias.booleanValue() : false);
    }

    private final PendingIntent createOpenRoutesViewPendingIntent(int appWidgetId, FavouriteEntity data) {
        String identifierToStation;
        String identifierStation = data.getIdentifierStation();
        if (identifierStation == null || (identifierToStation = data.getIdentifierToStation()) == null) {
            return null;
        }
        NavigationIntents navigationIntents = this.navigationIntents;
        Boolean isCercanias = data.isCercanias();
        return navigationIntents.createOpenRoutesViewPendingIntent(appWidgetId, identifierStation, identifierToStation, isCercanias != null ? isCercanias.booleanValue() : false);
    }

    private final PendingIntent createUpdatePendingIntent(int appWidgetId, FavouriteEntity data) {
        Intent intent = new Intent(this.context, (Class<?>) DeparturesWidget.class);
        intent.putExtra("appWidgetId", appWidgetId);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra(DefaultWidgetPayloadHandler.IS_WIDGET_JSON_TYPE, true);
        intent.putExtra("o", data.getIdentifierStation());
        intent.putExtra("d", data.getIdentifierToStation());
        intent.putExtra(DefaultWidgetPayloadHandler.WIDGET_JSON_MESSAGE_IS_CERCANIAS, data.isCercanias());
        return toPendingBroadcastIntent(intent, appWidgetId);
    }

    private final PendingIntent creteIgnoreBackgroundDataRestrictionsSettingsPendingIntent(int appWidgetId) {
        Intent intent = new Intent("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts("package", this.context.getPackageName(), null));
        return NavigationIntentsKt.toPendingActivityIntent(intent, this.context, appWidgetId);
    }

    private final void displayEmptyView(RemoteViews views, PendingIntent intent) {
        int i = R.id.appwidget_empty_view;
        views.setViewVisibility(i, 0);
        views.setViewVisibility(R.id.appwidget_listview, 8);
        views.setOnClickPendingIntent(i, intent);
    }

    private final void displayResultsView(RemoteViews views) {
        views.setViewVisibility(R.id.appwidget_empty_view, 8);
        views.setViewVisibility(R.id.appwidget_listview, 0);
    }

    private final void genericError(int widgetId, FavouriteEntity widgetInfo, int title, int message) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.widget_main);
        updateCirculationInfo(remoteViews, widgetInfo);
        updateHeaders(remoteViews, widgetId, widgetInfo);
        setControlsEnabledState(remoteViews, widgetId, DateExtensionKt.getStringDiffTime(new Date()), widgetInfo);
        displayEmptyView(remoteViews, createOpenRoutesViewPendingIntent(widgetId, widgetInfo));
        setEmptyViewImage(remoteViews, R.drawable.ic_result_error);
        setEmptyViewTitle(remoteViews, title);
        setEmptyViewSubtitle(remoteViews, message);
        removeEmptyViewActionButton(remoteViews);
        commitChanges(widgetId, remoteViews);
    }

    private final RemoteViews getUpdatedCirculationRemoteView(int widgetId, Circulation item, Intent openAppIntent) {
        RemoteViews remoteViews;
        boolean z3 = item instanceof CercaniasCirculation;
        if (z3) {
            remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.item_widget_circulation_cercanias);
        } else if (item instanceof AvldmdCirculation) {
            remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.item_widget_circulation_avldmd);
        } else {
            if (!(item instanceof DateHeaderCirculation)) {
                return null;
            }
            remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.item_circulation_date);
        }
        if (z3) {
            bindCercaniasCirculationRemoteView(this.context, remoteViews, (CercaniasCirculation) item, widgetId);
        } else if (item instanceof AvldmdCirculation) {
            bindAVLDMDCirculationRemoteView(this.context, remoteViews, (AvldmdCirculation) item, widgetId);
        } else if (item instanceof DateHeaderCirculation) {
            bindMovementHeaderRemoteView(remoteViews, (DateHeaderCirculation) item);
        }
        remoteViews.setOnClickFillInIntent(R.id.item_row, openAppIntent);
        return remoteViews;
    }

    private final void removeEmptyViewActionButton(RemoteViews views) {
        views.setViewVisibility(R.id.action_button, 4);
    }

    private final void removeEmptyViewImage(RemoteViews views) {
        views.setViewVisibility(R.id.imageView, 4);
    }

    private final void removeEmptyViewSubtitle(RemoteViews views) {
        views.setViewVisibility(R.id.empty_subtitle, 4);
    }

    private final void setControlsEnabledState(RemoteViews views, int widgetId, String updatedTime, FavouriteEntity data) {
        views.setTextViewText(R.id.widget_header_updated, this.context.getString(R.string.widget_header_updated));
        int i = R.id.widget_header_updated_time;
        views.setTextViewText(i, updatedTime);
        views.setViewVisibility(i, 0);
        views.setOnClickPendingIntent(R.id.widget_header_refresh_station, createUpdatePendingIntent(widgetId, data));
        views.setOnClickPendingIntent(R.id.widget_header_switch_stations, createChangeWayPendingIntent(widgetId, data));
    }

    private final void setControlsUpdatingState(RemoteViews views) {
        views.setTextViewText(R.id.widget_header_updated, this.context.getString(R.string.widget_header_updating));
        views.setViewVisibility(R.id.widget_header_updated_time, 4);
    }

    private final void setEmptyViewActionButton(RemoteViews views, int resourceId, PendingIntent pendingIntent) {
        int i = R.id.action_button;
        views.setTextViewText(i, this.context.getString(resourceId));
        views.setOnClickPendingIntent(i, pendingIntent);
    }

    private final void setEmptyViewImage(RemoteViews views, int image) {
        int i = R.id.imageView;
        views.setImageViewResource(i, image);
        views.setViewVisibility(i, 0);
    }

    private final void setEmptyViewSubtitle(RemoteViews views, int resourceId) {
        int i = R.id.empty_subtitle;
        views.setTextViewText(i, this.context.getString(resourceId));
        views.setViewVisibility(i, 0);
    }

    private final void setEmptyViewTitle(RemoteViews views, int resourceId) {
        int i = R.id.empty_title;
        views.setTextViewText(i, this.context.getString(resourceId));
        views.setViewVisibility(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWidgetLineInformationLegacyFormat(RemoteViews remoteView, CercaniasCirculation item) {
        int i = R.id.line;
        remoteView.setViewVisibility(i, 0);
        remoteView.setViewVisibility(R.id.logo, 8);
        remoteView.setTextViewText(i, item.getLine().getName());
        remoteView.setInt(i, "setBackgroundColor", Color.parseColor(item.getLine().getColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap toBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            return bitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        Integer valueOf = Integer.valueOf(intrinsicWidth);
        if (intrinsicWidth <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 1;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Integer valueOf2 = intrinsicHeight > 0 ? Integer.valueOf(intrinsicHeight) : null;
        Bitmap createBitmap = Bitmap.createBitmap(intValue, valueOf2 != null ? valueOf2.intValue() : 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private final PendingIntent toPendingBroadcastIntent(Intent intent, int i) {
        return PendingIntent.getBroadcast(this.context, i, intent, 201326592);
    }

    private final n toRemoteViews(List<? extends Circulation> list, int i, Intent intent) {
        long[] longArray;
        int collectionSizeOrDefault;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RemoteViews view = getUpdatedCirculationRemoteView(i, (Circulation) obj, intent);
            if (view != null) {
                Intrinsics.checkNotNullParameter(view, "view");
                arrayList.add(Long.valueOf(i5));
                arrayList2.add(view);
                i4++;
            }
            i5 = i6;
        }
        if (i4 < 1) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((RemoteViews) it.next()).getLayoutId()));
            }
            i4 = CollectionsKt.distinct(arrayList3).size();
        }
        longArray = CollectionsKt___CollectionsKt.toLongArray(arrayList);
        return new n(longArray, (RemoteViews[]) arrayList2.toArray(new RemoteViews[0]), Math.max(i4, 1));
    }

    private final void updateCirculationInfo(RemoteViews views, FavouriteEntity widgetInfo) {
        views.setTextViewText(R.id.station, widgetInfo.getStationName());
        views.setTextViewText(R.id.stationto, widgetInfo.getStationToName());
        int i = R.id.tv_typeOfTrain;
        Context context = this.context;
        Boolean isCercanias = widgetInfo.isCercanias();
        Boolean bool = Boolean.TRUE;
        views.setTextViewText(i, context.getText(Intrinsics.areEqual(isCercanias, bool) ? Intrinsics.areEqual(widgetInfo.isRodalies(), bool) ? R.string.circulation_traintype_rodalies : R.string.circulation_traintype_cercanias : R.string.circulation_traintype_others));
    }

    private final void updateHeaders(RemoteViews views, int appWidgetId, FavouriteEntity widgetInfo) {
        views.setTextViewText(R.id.header_circulation_type, this.context.getString(Intrinsics.areEqual(widgetInfo.isCercanias(), Boolean.TRUE) ? R.string.circulation_header_line : R.string.circulation_header_train));
        Companion companion = INSTANCE;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.context);
        Intrinsics.checkNotNullExpressionValue(appWidgetManager, "getInstance(...)");
        views.setViewVisibility(R.id.ll_trainOrLine, companion.getMinWidthCells(appWidgetManager, appWidgetId) <= 4 ? 8 : 0);
    }

    private final void updateWidgetLineInformation(Context context, final RemoteViews remoteView, final CercaniasCirculation item) {
        h a2 = I0.a.a(context);
        i iVar = new i(context);
        iVar.f1464c = item.getLine().getIconUrl();
        iVar.f1467f = item.getLine().getIconUrl();
        iVar.b(item.getLine().getIconUrl());
        iVar.f1465d = new U0.b(remoteView, item, this, remoteView, item, this, remoteView, item) { // from class: com.adif.elcanomovil.widget.DeparturesWidgetView$updateWidgetLineInformation$$inlined$target$1
            final /* synthetic */ CercaniasCirculation $item$inlined;
            final /* synthetic */ CercaniasCirculation $item$inlined$1;
            final /* synthetic */ CercaniasCirculation $item$inlined$2;
            final /* synthetic */ RemoteViews $remoteView$inlined;
            final /* synthetic */ RemoteViews $remoteView$inlined$1;
            final /* synthetic */ RemoteViews $remoteView$inlined$2;

            {
                this.$remoteView$inlined$1 = remoteView;
                this.$item$inlined$1 = item;
                this.$remoteView$inlined$2 = remoteView;
                this.$item$inlined$2 = item;
            }

            @Override // U0.b
            public void onError(Drawable error) {
                DeparturesWidgetView.this.setWidgetLineInformationLegacyFormat(this.$remoteView$inlined$1, this.$item$inlined$1);
            }

            @Override // U0.b
            public void onStart(Drawable placeholder) {
                DeparturesWidgetView.this.setWidgetLineInformationLegacyFormat(this.$remoteView$inlined, this.$item$inlined);
            }

            @Override // U0.b
            public void onSuccess(Drawable result) {
                Bitmap bitmap;
                try {
                    bitmap = DeparturesWidgetView.this.toBitmap(result);
                    this.$remoteView$inlined$2.setViewVisibility(R.id.line, 8);
                    RemoteViews remoteViews = this.$remoteView$inlined$2;
                    int i = R.id.logo;
                    remoteViews.setViewVisibility(i, 0);
                    this.$remoteView$inlined$2.setImageViewBitmap(i, bitmap);
                } catch (Exception unused) {
                    DeparturesWidgetView.this.setWidgetLineInformationLegacyFormat(this.$remoteView$inlined$2, this.$item$inlined$2);
                }
            }
        };
        iVar.f1472m = null;
        iVar.f1473n = null;
        iVar.f1474o = null;
        ((p) a2).b(iVar.a());
    }

    public final void backgroundDataError(int widgetId, FavouriteEntity widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.widget_main);
        updateCirculationInfo(remoteViews, widgetInfo);
        updateHeaders(remoteViews, widgetId, widgetInfo);
        setControlsEnabledState(remoteViews, widgetId, DateExtensionKt.getStringDiffTime(new Date()), widgetInfo);
        PendingIntent creteIgnoreBackgroundDataRestrictionsSettingsPendingIntent = creteIgnoreBackgroundDataRestrictionsSettingsPendingIntent(widgetId);
        displayEmptyView(remoteViews, creteIgnoreBackgroundDataRestrictionsSettingsPendingIntent);
        setEmptyViewImage(remoteViews, R.drawable.ic_result_error);
        setEmptyViewTitle(remoteViews, R.string.background_data_permission_title);
        setEmptyViewSubtitle(remoteViews, R.string.background_data_permission_message);
        setEmptyViewActionButton(remoteViews, R.string.background_data_permission_button, creteIgnoreBackgroundDataRestrictionsSettingsPendingIntent);
        commitChanges(widgetId, remoteViews);
    }

    public final void loading(int widgetId, FavouriteEntity widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.widget_main);
        updateCirculationInfo(remoteViews, widgetInfo);
        updateHeaders(remoteViews, widgetId, widgetInfo);
        setControlsUpdatingState(remoteViews);
        displayEmptyView(remoteViews, createOpenRoutesViewPendingIntent(widgetId, widgetInfo));
        removeEmptyViewImage(remoteViews);
        setEmptyViewTitle(remoteViews, R.string.circulation_loading_more);
        removeEmptyViewSubtitle(remoteViews);
        removeEmptyViewActionButton(remoteViews);
        commitChanges(widgetId, remoteViews);
    }

    public final void missingInformationError(int widgetId) {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.widget_main);
        displayEmptyView(remoteViews, null);
        setEmptyViewImage(remoteViews, R.drawable.ic_result_error);
        setEmptyViewTitle(remoteViews, R.string.missing_widget_information_title);
        setEmptyViewSubtitle(remoteViews, R.string.missing_widget_information_message);
        removeEmptyViewActionButton(remoteViews);
        commitChanges(widgetId, remoteViews);
    }

    public final void networkError(int widgetId, FavouriteEntity widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        genericError(widgetId, widgetInfo, R.string.generic_error_title, R.string.network_error_message);
    }

    public final void noResults(int widgetId, FavouriteEntity widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        genericError(widgetId, widgetInfo, R.string.circulation_no_results_title, R.string.circulation_no_results_message);
    }

    public final void otherError(int widgetId, FavouriteEntity widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        genericError(widgetId, widgetInfo, R.string.generic_error_title, R.string.generic_error_message);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, kotlin.jvm.functions.Function2] */
    public final void success(int widgetId, FavouriteEntity widgetInfo, List<? extends Circulation> circulations) {
        PendingIntent pendingActivityIntent;
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(circulations, "circulations");
        String packageName = this.context.getPackageName();
        int i = R.layout.widget_main;
        RemoteViews remoteViews = new RemoteViews(packageName, i);
        updateCirculationInfo(remoteViews, widgetInfo);
        updateHeaders(remoteViews, widgetId, widgetInfo);
        setControlsEnabledState(remoteViews, widgetId, DateExtensionKt.getStringDiffTime(new Date()), widgetInfo);
        displayResultsView(remoteViews);
        Intent createOpenRoutesViewIntent = createOpenRoutesViewIntent(widgetInfo);
        Context context = this.context;
        int i4 = R.id.appwidget_listview;
        n items = toRemoteViews(circulations, widgetId, createOpenRoutesViewIntent);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        Intrinsics.checkNotNullParameter(items, "items");
        if (Build.VERSION.SDK_INT > 31) {
            m.f1757a.a(remoteViews, i4, items);
        } else {
            int i5 = RemoteViewsCompatService.f2820a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intent putExtra = new Intent(context, (Class<?>) RemoteViewsCompatService.class).putExtra("appWidgetId", i).putExtra("androidx.core.widget.extra.view_id", i4);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, RemoteVi…ra(EXTRA_VIEW_ID, viewId)");
            putExtra.setData(Uri.parse(putExtra.toUri(1)));
            if (context.getPackageManager().resolveService(putExtra, 0) == null) {
                throw new IllegalStateException("RemoteViewsCompatService could not be resolved, ensure that you have declared it in your app manifest.");
            }
            remoteViews.setRemoteAdapter(i4, putExtra);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(items, "items");
            Long p = AbstractC0106b.p(context);
            if (p == null) {
                throw new IllegalStateException("Couldn't obtain version code for app");
            }
            byte[] G3 = AbstractC0106b.G(new FunctionReferenceImpl(2, items, n.class, "writeToParcel", "writeToParcel$core_remoteviews_release(Landroid/os/Parcel;I)V", 0));
            String INCREMENTAL = Build.VERSION.INCREMENTAL;
            Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
            r rVar = new r(G3, p.longValue());
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(':');
            sb.append(i4);
            String sb2 = sb.toString();
            q parcelable = new q(rVar);
            Intrinsics.checkNotNullParameter(parcelable, "parcelable");
            String encodeToString = Base64.encodeToString(AbstractC0106b.G(parcelable), 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(serialize…celable), Base64.DEFAULT)");
            edit.putString(sb2, encodeToString).apply();
            AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, i4);
        }
        if (createOpenRoutesViewIntent != null && (pendingActivityIntent = NavigationIntentsKt.toPendingActivityIntent(createOpenRoutesViewIntent, this.context, widgetId)) != null) {
            remoteViews.setPendingIntentTemplate(i4, pendingActivityIntent);
        }
        commitChanges(widgetId, remoteViews);
        this.appWidgetManager.notifyAppWidgetViewDataChanged(widgetId, i4);
    }
}
