package com.adif.elcanomovil.uiAvisa.components.create;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import androidx.core.content.FileProvider;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import c1.C0283c;
import c1.C0284d;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertActions;
import com.adif.elcanomovil.commonNavGraph.arguments.AlertType;
import com.adif.elcanomovil.commonNavGraph.navigation.Navigation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStation;
import com.adif.elcanomovil.domain.entities.avisa.AvisaStationCategory;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidencePicture;
import com.adif.elcanomovil.domain.usecases.avisa.incidence.CreateIncidenceUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationCategoriesUseCase;
import com.adif.elcanomovil.domain.usecases.avisa.station.GetAvisaStationsUseCase;
import com.adif.elcanomovil.main.BottomNavFragmentDirections;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.components.create.NavigateTo;
import com.adif.elcanomovil.uiAvisa.components.create.NewIssueViewAction;
import com.google.firebase.messaging.Constants;
import d1.InterfaceC0307a;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import m0.C0501a;

@HiltViewModel
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b1\u00100J\u0017\u00104\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e06¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020\"06¢\u0006\u0004\b9\u00108J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020:06¢\u0006\u0004\b;\u00108J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\"0&¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e0&¢\u0006\u0004\b>\u0010=J\u0019\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0&06¢\u0006\u0004\b@\u00108J\u0015\u0010B\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020:¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0016¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0016¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\u0016H\u0007¢\u0006\u0004\bG\u0010EJ\u000f\u0010H\u001a\u00020\u001bH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0016H\u0002¢\u0006\u0004\bJ\u0010EJ\u000f\u0010K\u001a\u00020\u0016H\u0002¢\u0006\u0004\bK\u0010EJ\u000f\u0010L\u001a\u00020\u0016H\u0002¢\u0006\u0004\bL\u0010EJ\u000f\u0010M\u001a\u00020\u0016H\u0002¢\u0006\u0004\bM\u0010EJ\u000f\u0010N\u001a\u00020\u0016H\u0002¢\u0006\u0004\bN\u0010EJ\u000f\u0010O\u001a\u00020:H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020:H\u0002¢\u0006\u0004\bQ\u0010PJ\u0017\u00104\u001a\u00020\u00162\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\b4\u0010TJ\u0017\u0010V\u001a\u00020:2\u0006\u0010U\u001a\u00020?H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00162\u0006\u0010X\u001a\u00020RH\u0002¢\u0006\u0004\bY\u0010TJ\u000f\u0010Z\u001a\u00020\u0016H\u0002¢\u0006\u0004\bZ\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010[R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010_R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010`R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010bR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020:0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR(\u0010h\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010&0g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010eR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\"0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010eR(\u0010j\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010&0g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR \u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010iR\u0016\u0010l\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020q0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\"0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010sR\u001c\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001e0p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010sR \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0&0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010eR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001d\u0010z\u001a\b\u0012\u0004\u0012\u00020v0y8\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020-0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010xR\u001e\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020-0y8\u0006¢\u0006\r\n\u0004\b\u007f\u0010{\u001a\u0005\b\u0080\u0001\u0010}R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0088\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008b\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0085\u0001\u001a\u0006\b\u008a\u0001\u0010\u0087\u0001R!\u0010\u008e\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0085\u0001\u001a\u0006\b\u008d\u0001\u0010\u0087\u0001R'\u0010\u0090\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010&0g068F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u00108R'\u0010\u0092\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010&0g068F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u00108R\u001f\u0010\u0094\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160g068F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u00108¨\u0006\u0095\u0001"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewModel;", "Landroidx/lifecycle/w0;", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/CreateIncidenceUseCase;", "createIncidenceUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;", "getStationsUseCase", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;", "getAvisaStationCategoriesUseCase", "Landroid/content/Context;", "context", "Lc1/d;", "permissionHelper", "Ld1/a;", "appDispatcher", "Ld1/e;", "fileUtils", "Lc1/c;", "notificationsPermissionRequester", "<init>", "(Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/CreateIncidenceUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;Landroid/content/Context;Lc1/d;Ld1/a;Ld1/e;Lc1/c;)V", "Lcom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewAction;", "action", "", "onViewAction", "(Lcom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewAction;)V", "", "stationid", "Lkotlinx/coroutines/Job;", "fetchCategories", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;", "station", "setStation", "(Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStation;)V", "Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;", "category", "setCategory", "(Lcom/adif/elcanomovil/domain/entities/avisa/AvisaStationCategory;)V", "", "list", "setCategories", "(Ljava/util/List;)V", "description", "setIssueDescription", "(Ljava/lang/String;)V", "", "position", "pictureGridInteraction", "(I)V", "removePicture", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "addBitmapFrom", "(Landroid/content/Intent;)V", "Landroidx/lifecycle/Q;", "selectedStation", "()Landroidx/lifecycle/Q;", "selectedCategory", "", "canContinue", "categories", "()Ljava/util/List;", "avisaStations", "Landroid/graphics/Bitmap;", "bitmap", "notificationsEnabled", "createIssue", "(Z)Lkotlinx/coroutines/Job;", "issueCreated", "()V", "showErrorDialog", "addBitmapForTesting", "fetchStations", "()Lkotlinx/coroutines/Job;", "onCreationInfoDialogDismissed", "confirmIncidenceCreation", "cameraPictureTaken", "onPickImageFromCameraViewAction", "takePictureFromCameraAndSaveToFile", "allAllRequiredCameraPermissionsGranted", "()Z", "checkRequiredData", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "imageBitmap", "addNewBitmapImage", "(Landroid/graphics/Bitmap;)Z", "picture", "galleryAddPic", "showCreateIssueDialog", "Lcom/adif/elcanomovil/domain/usecases/avisa/incidence/CreateIncidenceUseCase;", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationsUseCase;", "Lcom/adif/elcanomovil/domain/usecases/avisa/station/GetAvisaStationCategoriesUseCase;", "Landroid/content/Context;", "Lc1/d;", "Ld1/a;", "Ld1/e;", "Lc1/c;", "Landroidx/lifecycle/X;", "requiredDataCompleted", "Landroidx/lifecycle/X;", "Landroidx/lifecycle/W;", "Lcom/adif/elcanomovil/domain/entities/utils/AsyncResult;", "_avisaStationList", "Landroidx/lifecycle/W;", "_listCategories", "_resultCreateIncidence", "issueDescription", "Ljava/lang/String;", "areNotificationsRequested", "Z", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidencePicture;", "pictures", "Ljava/util/List;", "avistaStations", "Lkotlinx/coroutines/channels/Channel;", "Lcom/adif/elcanomovil/uiAvisa/components/create/NavigateTo;", "_navigation", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "navigation", "Lkotlinx/coroutines/flow/Flow;", "getNavigation", "()Lkotlinx/coroutines/flow/Flow;", "_messages", "messages", "getMessages", "currentPhotoFile", "Ljava/io/File;", "Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryCreateActions$delegate", "Lkotlin/Lazy;", "getMandatoryCreateActions", "()Lcom/adif/elcanomovil/commonNavGraph/arguments/AlertActions;", "mandatoryCreateActions", "mandatoryUpdateActions$delegate", "getMandatoryUpdateActions", "mandatoryUpdateActions", "mandatoryWithOutActions$delegate", "getMandatoryWithOutActions", "mandatoryWithOutActions", "getAvisaStationList", "avisaStationList", "getListCategories", "listCategories", "getResultCreateIncidence", "resultCreateIncidence", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewIssueViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewIssueViewModel.kt\ncom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n766#2:376\n857#2,2:377\n1549#2:379\n1620#2,3:380\n1549#2:383\n1620#2,3:384\n*S KotlinDebug\n*F\n+ 1 NewIssueViewModel.kt\ncom/adif/elcanomovil/uiAvisa/components/create/NewIssueViewModel\n*L\n208#1:376\n208#1:377,2\n213#1:379\n213#1:380,3\n279#1:383\n279#1:384,3\n*E\n"})
/* loaded from: classes.dex */
public final class NewIssueViewModel extends w0 {
    private final W _avisaStationList;
    private final W _listCategories;
    private final Channel<Integer> _messages;
    private final Channel<NavigateTo> _navigation;
    private final W _resultCreateIncidence;
    private final InterfaceC0307a appDispatcher;
    private boolean areNotificationsRequested;
    private List<AvisaStation> avistaStations;
    private final X bitmap;
    private final List<AvisaStationCategory> categories;
    private final Context context;
    private final CreateIncidenceUseCase createIncidenceUseCase;
    private File currentPhotoFile;
    private final d1.e fileUtils;
    private final GetAvisaStationCategoriesUseCase getAvisaStationCategoriesUseCase;
    private final GetAvisaStationsUseCase getStationsUseCase;
    private String issueDescription;

    /* renamed from: mandatoryCreateActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryCreateActions;

    /* renamed from: mandatoryUpdateActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryUpdateActions;

    /* renamed from: mandatoryWithOutActions$delegate, reason: from kotlin metadata */
    private final Lazy mandatoryWithOutActions;
    private final Flow<Integer> messages;
    private final Flow<NavigateTo> navigation;
    private final C0283c notificationsPermissionRequester;
    private final C0284d permissionHelper;
    private final List<IncidencePicture> pictures;
    private final X requiredDataCompleted;
    private final X selectedCategory;
    private final X selectedStation;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.X, androidx.lifecycle.Q] */
    @Inject
    public NewIssueViewModel(CreateIncidenceUseCase createIncidenceUseCase, GetAvisaStationsUseCase getStationsUseCase, GetAvisaStationCategoriesUseCase getAvisaStationCategoriesUseCase, @ApplicationContext Context context, C0284d permissionHelper, InterfaceC0307a appDispatcher, d1.e fileUtils, C0283c notificationsPermissionRequester) {
        Intrinsics.checkNotNullParameter(createIncidenceUseCase, "createIncidenceUseCase");
        Intrinsics.checkNotNullParameter(getStationsUseCase, "getStationsUseCase");
        Intrinsics.checkNotNullParameter(getAvisaStationCategoriesUseCase, "getAvisaStationCategoriesUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionHelper, "permissionHelper");
        Intrinsics.checkNotNullParameter(appDispatcher, "appDispatcher");
        Intrinsics.checkNotNullParameter(fileUtils, "fileUtils");
        Intrinsics.checkNotNullParameter(notificationsPermissionRequester, "notificationsPermissionRequester");
        this.createIncidenceUseCase = createIncidenceUseCase;
        this.getStationsUseCase = getStationsUseCase;
        this.getAvisaStationCategoriesUseCase = getAvisaStationCategoriesUseCase;
        this.context = context;
        this.permissionHelper = permissionHelper;
        this.appDispatcher = appDispatcher;
        this.fileUtils = fileUtils;
        this.notificationsPermissionRequester = notificationsPermissionRequester;
        this.requiredDataCompleted = new Q();
        this._avisaStationList = new W();
        this.selectedStation = new Q();
        this.selectedCategory = new Q();
        this._listCategories = new W();
        this._resultCreateIncidence = new W();
        this.issueDescription = "";
        this.pictures = new ArrayList();
        this.categories = new ArrayList();
        this.avistaStations = new ArrayList();
        this.bitmap = new Q();
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        Channel<NavigateTo> Channel$default = ChannelKt.Channel$default(1, bufferOverflow, null, 4, null);
        this._navigation = Channel$default;
        this.navigation = FlowKt.receiveAsFlow(Channel$default);
        Channel<Integer> Channel$default2 = ChannelKt.Channel$default(1, bufferOverflow, null, 4, null);
        this._messages = Channel$default2;
        this.messages = FlowKt.receiveAsFlow(Channel$default2);
        fetchStations();
        this.mandatoryCreateActions = LazyKt.lazy(new v(this));
        this.mandatoryUpdateActions = LazyKt.lazy(new w(this));
        this.mandatoryWithOutActions = LazyKt.lazy(new x(this));
    }

    private final void addBitmapFrom(File file) {
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        if (absolutePath.length() > 0) {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            Intrinsics.checkNotNull(decodeFile);
            addNewBitmapImage(decodeFile);
            galleryAddPic(file);
        }
    }

    private final boolean addNewBitmapImage(Bitmap imageBitmap) {
        List<IncidencePicture> list = this.pictures;
        Intrinsics.checkNotNullParameter(imageBitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        imageBitmap.compress(Bitmap.CompressFormat.JPEG, 65, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        boolean add = list.add(new IncidencePicture("image/jpeg", encodeToString, null, null, null, 28, null));
        X x3 = this.bitmap;
        List<IncidencePicture> list2 = this.pictures;
        ArrayList arrayList = new ArrayList(CollectionsKt.g(list2));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String base64String = ((IncidencePicture) it.next()).getContent();
            Intrinsics.checkNotNullParameter(base64String, "base64String");
            byte[] decode = Base64.decode(base64String, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(...)");
            arrayList.add(decodeByteArray);
        }
        x3.k(arrayList);
        return add;
    }

    private final boolean allAllRequiredCameraPermissionsGranted() {
        C0284d c0284d = this.permissionHelper;
        Context context = this.context;
        c0284d.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("android.permission.CAMERA", "permission");
        return D.h.checkSelfPermission(context, "android.permission.CAMERA") == 0;
    }

    private final void cameraPictureTaken() {
        File file = this.currentPhotoFile;
        if (file != null) {
            addBitmapFrom(file);
            this.currentPhotoFile = null;
        }
    }

    private final boolean checkRequiredData() {
        return (this.selectedStation.d() == null || getListCategories().d() == null || this.issueDescription.length() <= 0 || this.pictures.isEmpty()) ? false : true;
    }

    private final void confirmIncidenceCreation() {
        if (checkRequiredData()) {
            showCreateIssueDialog();
        } else {
            this._messages.mo1630trySendJP2dKIU(Integer.valueOf(R.string.create_issue_need_more_data));
        }
    }

    private final Job fetchStations() {
        C0501a j4 = q0.j(this);
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.launch$default(j4, Dispatchers.getMain(), null, new u(this, null), 2, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, android.media.MediaScannerConnection$OnScanCompletedListener] */
    private final void galleryAddPic(File picture) {
        Uri fromFile = Uri.fromFile(picture);
        MediaScannerConnection.scanFile(this.context, new String[]{fromFile.toString()}, new String[]{fromFile.toString()}, new Object());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void galleryAddPic$lambda$8(String str, Uri uri) {
    }

    private final AlertActions getMandatoryCreateActions() {
        return (AlertActions) this.mandatoryCreateActions.getValue();
    }

    private final AlertActions getMandatoryUpdateActions() {
        return (AlertActions) this.mandatoryUpdateActions.getValue();
    }

    private final AlertActions getMandatoryWithOutActions() {
        return (AlertActions) this.mandatoryWithOutActions.getValue();
    }

    private final void onCreationInfoDialogDismissed() {
        if (this.areNotificationsRequested) {
            this.notificationsPermissionRequester.a(new y(this));
        } else {
            this._navigation.mo1630trySendJP2dKIU(NavigateTo.NavigateUp.INSTANCE);
        }
    }

    private final void onPickImageFromCameraViewAction() {
        if (allAllRequiredCameraPermissionsGranted()) {
            takePictureFromCameraAndSaveToFile();
        } else {
            this._navigation.mo1630trySendJP2dKIU(NavigateTo.AskForCameraPermission.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCreateIssueDialog() {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.create_issue_confirmation_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.create_issue_confirmation_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this._navigation.mo1630trySendJP2dKIU(new NavigateTo.RegularNavigation(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryCreateActions(), AlertType.INFO), null, 2, 0 == true ? 1 : 0)));
    }

    private final void takePictureFromCameraAndSaveToFile() {
        File file;
        d1.e eVar = this.fileUtils;
        Context context = this.context;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            if (externalFilesDir != null && !externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            file = File.createTempFile("JPEG _" + format + '_', ".jpg", externalFilesDir);
        } catch (IOException unused) {
            file = null;
        }
        this.currentPhotoFile = file;
        if (file != null) {
            Channel<NavigateTo> channel = this._navigation;
            d1.e eVar2 = this.fileUtils;
            Context context2 = this.context;
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(file, "file");
            Uri uriForFile = FileProvider.getUriForFile(context2, context2.getPackageName() + ".provider", file);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
            ChannelResult.m1640boximpl(channel.mo1630trySendJP2dKIU(new NavigateTo.PickImageFromCamera(uriForFile)));
        }
    }

    public final void addBitmapForTesting() {
        this.pictures.add(new IncidencePicture("image/jpeg", "", null, null, null, 28, null));
    }

    public final List<AvisaStation> avisaStations() {
        return this.avistaStations;
    }

    public final Q bitmap() {
        return this.bitmap;
    }

    public final Q canContinue() {
        return this.requiredDataCompleted;
    }

    public final List<AvisaStationCategory> categories() {
        return this.categories;
    }

    public final Job createIssue(boolean notificationsEnabled) {
        C0501a j4 = q0.j(this);
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.launch$default(j4, Dispatchers.getMain(), null, new q(notificationsEnabled, this, null), 2, null);
    }

    public final Job fetchCategories(String stationid) {
        Intrinsics.checkNotNullParameter(stationid, "stationid");
        C0501a j4 = q0.j(this);
        ((d1.d) this.appDispatcher).getClass();
        return BuildersKt.launch$default(j4, Dispatchers.getMain(), null, new s(this, stationid, null), 2, null);
    }

    public final Q getAvisaStationList() {
        return this._avisaStationList;
    }

    public final Q getListCategories() {
        return this._listCategories;
    }

    public final Flow<Integer> getMessages() {
        return this.messages;
    }

    public final Flow<NavigateTo> getNavigation() {
        return this.navigation;
    }

    public final Q getResultCreateIncidence() {
        return this._resultCreateIncidence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void issueCreated() {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.create_issue_success_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.create_issue_success_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this._navigation.mo1630trySendJP2dKIU(new NavigateTo.RegularNavigation(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryUpdateActions(), AlertType.INFO), null, 2, 0 == true ? 1 : 0)));
    }

    public final void onViewAction(NewIssueViewAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.areEqual(action, NewIssueViewAction.PickImageFromCameraViewAction.INSTANCE)) {
            onPickImageFromCameraViewAction();
            return;
        }
        if (Intrinsics.areEqual(action, NewIssueViewAction.PickImageFromGalleryViewAction.INSTANCE)) {
            this._navigation.mo1630trySendJP2dKIU(NavigateTo.PickImageFromGallery.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(action, NewIssueViewAction.CameraPermissionGranted.INSTANCE)) {
            takePictureFromCameraAndSaveToFile();
            return;
        }
        if (Intrinsics.areEqual(action, NewIssueViewAction.CameraPictureTaken.INSTANCE)) {
            cameraPictureTaken();
            return;
        }
        if (Intrinsics.areEqual(action, NewIssueViewAction.CreateIncidence.INSTANCE)) {
            confirmIncidenceCreation();
        } else if (action instanceof NewIssueViewAction.SetNotificationsEnabled) {
            this.areNotificationsRequested = ((NewIssueViewAction.SetNotificationsEnabled) action).getEnabled();
        } else if (Intrinsics.areEqual(action, NewIssueViewAction.CreationInfoDialogDismissed.INSTANCE)) {
            onCreationInfoDialogDismissed();
        }
    }

    public final void pictureGridInteraction(int position) {
        if (this.pictures.size() - 1 >= position) {
            this._navigation.mo1630trySendJP2dKIU(new NavigateTo.EditPicture(position, this.pictures.get(position).getContent()));
        } else {
            this._navigation.mo1630trySendJP2dKIU(NavigateTo.PickPicture.INSTANCE);
        }
    }

    public final void removePicture(int position) {
        List<IncidencePicture> list = this.pictures;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(this.pictures.get(position), (IncidencePicture) obj)) {
                arrayList.add(obj);
            }
        }
        this.pictures.clear();
        this.pictures.addAll(arrayList);
        X x3 = this.bitmap;
        List<IncidencePicture> list2 = this.pictures;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.g(list2));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String base64String = ((IncidencePicture) it.next()).getContent();
            Intrinsics.checkNotNullParameter(base64String, "base64String");
            byte[] decode = Base64.decode(base64String, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            Intrinsics.checkNotNullExpressionValue(decodeByteArray, "decodeByteArray(...)");
            arrayList2.add(decodeByteArray);
        }
        x3.k(arrayList2);
    }

    public final Q selectedCategory() {
        return this.selectedCategory;
    }

    public final Q selectedStation() {
        return this.selectedStation;
    }

    public final void setCategories(List<AvisaStationCategory> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.categories.clear();
        this.categories.addAll(list);
    }

    public final void setCategory(AvisaStationCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.selectedCategory.j(category);
    }

    public final void setIssueDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.issueDescription = description;
    }

    public final void setStation(AvisaStation station) {
        Intrinsics.checkNotNullParameter(station, "station");
        this.selectedStation.j(station);
        this.selectedCategory.j(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showErrorDialog() {
        BottomNavFragmentDirections.Companion companion = BottomNavFragmentDirections.INSTANCE;
        String string = this.context.getString(R.string.generic_error_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.generic_error_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this._navigation.mo1630trySendJP2dKIU(new NavigateTo.RegularNavigation(new Navigation.RootDirection(companion.toAlertDialog(false, false, string, string2, getMandatoryWithOutActions(), AlertType.WARNING), null, 2, 0 == true ? 1 : 0)));
    }

    public final void addBitmapFrom(Intent data) {
        Bitmap bitmap;
        if (data != null) {
            Bundle extras = data.getExtras();
            if (extras == null) {
                Uri data2 = data.getData();
                bitmap = data2 != null ? BitmapFactory.decodeStream(this.context.getContentResolver().openInputStream(data2)) : null;
            } else {
                Object obj = extras.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
                bitmap = (Bitmap) obj;
            }
            if (bitmap != null) {
                addNewBitmapImage(bitmap);
            }
        }
    }
}
