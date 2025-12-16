package com.adif.elcanomovil.commonViews.includeViews;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.adif.elcanomovil.commonViews.R;
import com.adif.elcanomovil.commonViews.databinding.LoadingEmptyOrErrorCommonViewBinding;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\r"}, d2 = {"Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView;", "", "()V", "updateElementsVisibility", "", "binding", "Lcom/adif/elcanomovil/commonViews/databinding/LoadingEmptyOrErrorCommonViewBinding;", "status", "Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView$Status;", "title", "", "message", "Status", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoadingEmptyOrErrorView {
    public static final LoadingEmptyOrErrorView INSTANCE = new LoadingEmptyOrErrorView();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/commonViews/includeViews/LoadingEmptyOrErrorView$Status;", "", "(Ljava/lang/String;I)V", "HIDDEN", "INIT", "LOADING", "EMPTY", "ERROR", "common-views_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status HIDDEN = new Status("HIDDEN", 0);
        public static final Status INIT = new Status("INIT", 1);
        public static final Status LOADING = new Status("LOADING", 2);
        public static final Status EMPTY = new Status("EMPTY", 3);
        public static final Status ERROR = new Status("ERROR", 4);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{HIDDEN, INIT, LOADING, EMPTY, ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Status(String str, int i) {
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LoadingEmptyOrErrorView() {
    }

    public final void updateElementsVisibility(LoadingEmptyOrErrorCommonViewBinding binding, Status status, String title, String message) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(status, "status");
        binding.loadingOrError.setVisibility(status != Status.HIDDEN ? 0 : 8);
        ProgressBar progressBar = binding.loading;
        Status status2 = Status.LOADING;
        progressBar.setVisibility(status == status2 ? 0 : 8);
        binding.iconNoResults.setVisibility(status != status2 ? 0 : 8);
        ImageView imageView = binding.iconNoResults;
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        imageView.setImageResource(i != 1 ? i != 2 ? i != 3 ? R.drawable.ic_no_results : R.drawable.ic_result_error : R.drawable.ic_result_empty : R.drawable.ic_no_results);
        binding.title.setText(title);
        binding.message.setText(message);
    }
}
