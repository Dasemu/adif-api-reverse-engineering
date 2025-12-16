package com.adif.elcanomovil.uiAvisa.components.home;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.domain.entities.avisa.incidence.Incidence;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStation;
import com.adif.elcanomovil.domain.entities.avisa.incidence.IncidenceStatus;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.databinding.ItemIssueListBinding;
import com.adif.elcanomovil.uiAvisa.utils.adapter.IncidenceHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d1.C0309c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter;", "Landroidx/recyclerview/widget/h0;", "Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$IssueViewHolder;", "Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/app/Activity;", "context", "<init>", "(Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;Landroid/app/Activity;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$IssueViewHolder;", "getItemCount", "()I", "", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "issues", "", "replacing", "", "updateIssues", "(Ljava/util/List;Z)V", "holder", "position", "onBindViewHolder", "(Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$IssueViewHolder;I)V", "Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;", "Landroid/app/Activity;", "", "issuesList", "Ljava/util/List;", "IssueViewHolder", "OnIssueListFragmentInteractionListener", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IssuesAdapter extends AbstractC0220h0 {
    private final Activity context;
    private final List<IncidenceStation> issuesList;
    private final OnIssueListFragmentInteractionListener listener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$IssueViewHolder;", "Landroidx/recyclerview/widget/I0;", "Lcom/adif/elcanomovil/uiAvisa/databinding/ItemIssueListBinding;", "binding", "<init>", "(Lcom/adif/elcanomovil/uiAvisa/databinding/ItemIssueListBinding;)V", "", "populateView", "()V", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "item", "Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "(Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;)V", "Lcom/adif/elcanomovil/uiAvisa/databinding/ItemIssueListBinding;", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "getItem", "()Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;", "setItem", "(Lcom/adif/elcanomovil/domain/entities/avisa/incidence/IncidenceStation;)V", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class IssueViewHolder extends I0 {
        private final ItemIssueListBinding binding;
        public IncidenceStation item;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IncidenceStatus.values().length];
                try {
                    iArr[IncidenceStatus.STATUS_TYPE_IN_PROGRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IncidenceStatus.STATUS_TYPE_SOLVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IssueViewHolder(ItemIssueListBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public static final void bind$lambda$0(OnIssueListFragmentInteractionListener listener, IncidenceStation item, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(item, "$item");
            listener.onIssueInteraction(item.getIncidence());
        }

        private final void populateView() {
            Unit unit;
            String str;
            this.binding.itemId.setText(getItem().getIncidence().getIncidenceCode());
            this.binding.itemStation.setText(getItem().getAvisaStation().getName());
            TextView textView = this.binding.itemDescriptionDate;
            StringBuilder sb = new StringBuilder();
            Lazy lazy = C0309c.f6168a;
            sb.append(m3.d.o().format(getItem().getIncidence().getCreatedTime()));
            sb.append('.');
            textView.setText(sb.toString());
            this.binding.itemDescription.setText(getItem().getIncidence().getDescription());
            IncidenceStatus invoke = IncidenceStatus.INSTANCE.invoke(getItem().getIncidence().getStatusTypeId());
            int i = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
            Unit unit2 = null;
            String str2 = null;
            Unit unit3 = null;
            if (i == 1) {
                Date estimatedDateTo = getItem().getIncidence().getEstimatedDateTo();
                if (estimatedDateTo != null) {
                    this.binding.itemFixingTitle.setText(this.itemView.getContext().getString(R.string.avisa_issue_estimated_date) + ' ' + m3.d.o().format(estimatedDateTo));
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    this.binding.itemFixingTitle.setText(this.itemView.getContext().getString(R.string.avisa_issue_estimated_date));
                }
                TextView textView2 = this.binding.itemStatus;
                IncidenceHelper.Companion companion = IncidenceHelper.INSTANCE;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView2.setText(companion.getStringResource(context, invoke));
                this.binding.itemFixingTitle.setVisibility(0);
                this.binding.itemStatus.setBackgroundColor(D.h.getColor(this.itemView.getContext(), R.color.colour_issue_ongoing));
                this.binding.itemStatus.setTextColor(D.h.getColor(this.itemView.getContext(), R.color.white));
                return;
            }
            if (i == 2) {
                this.binding.itemFixingTitle.setVisibility(4);
                this.binding.itemStatus.setBackgroundColor(D.h.getColor(this.itemView.getContext(), R.color.colour_issue_solved));
                this.binding.itemStatus.setTextColor(D.h.getColor(this.itemView.getContext(), R.color.white));
                Date solvedDate = getItem().getIncidence().getSolvedDate();
                if (solvedDate != null) {
                    StringBuilder sb2 = new StringBuilder();
                    IncidenceHelper.Companion companion2 = IncidenceHelper.INSTANCE;
                    Context context2 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    sb2.append(companion2.getStringResource(context2, invoke));
                    sb2.append('\n');
                    sb2.append(m3.d.o().format(solvedDate));
                    this.binding.itemStatus.setText(sb2.toString());
                    unit3 = Unit.INSTANCE;
                }
                if (unit3 == null) {
                    TextView textView3 = this.binding.itemStatus;
                    IncidenceHelper.Companion companion3 = IncidenceHelper.INSTANCE;
                    Context context3 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    textView3.setText(companion3.getStringResource(context3, invoke));
                    return;
                }
                return;
            }
            this.binding.itemFixingTitle.setVisibility(4);
            this.binding.itemStatus.setBackgroundColor(D.h.getColor(this.itemView.getContext(), R.color.colour_issue_canceled));
            this.binding.itemStatus.setTextColor(D.h.getColor(this.itemView.getContext(), R.color.white));
            Date solvedDate2 = getItem().getIncidence().getSolvedDate();
            if (solvedDate2 != null) {
                StringBuilder sb3 = new StringBuilder();
                if (invoke != null) {
                    IncidenceHelper.Companion companion4 = IncidenceHelper.INSTANCE;
                    Context context4 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    str = companion4.getStringResource(context4, invoke);
                } else {
                    str = null;
                }
                sb3.append(str);
                sb3.append('\n');
                sb3.append(m3.d.o().format(solvedDate2));
                this.binding.itemStatus.setText(sb3.toString());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                TextView textView4 = this.binding.itemStatus;
                if (invoke != null) {
                    IncidenceHelper.Companion companion5 = IncidenceHelper.INSTANCE;
                    Context context5 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    str2 = companion5.getStringResource(context5, invoke);
                }
                textView4.setText(str2);
            }
        }

        public final void bind(IncidenceStation item, OnIssueListFragmentInteractionListener r4) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(r4, "listener");
            setItem(item);
            populateView();
            this.itemView.setOnClickListener(new G2.l(4, r4, item));
        }

        public final IncidenceStation getItem() {
            IncidenceStation incidenceStation = this.item;
            if (incidenceStation != null) {
                return incidenceStation;
            }
            Intrinsics.throwUninitializedPropertyAccessException("item");
            return null;
        }

        public final void setItem(IncidenceStation incidenceStation) {
            Intrinsics.checkNotNullParameter(incidenceStation, "<set-?>");
            this.item = incidenceStation;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/home/IssuesAdapter$OnIssueListFragmentInteractionListener;", "", "onIssueInteraction", "", "issue", "Lcom/adif/elcanomovil/domain/entities/avisa/incidence/Incidence;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface OnIssueListFragmentInteractionListener {
        void onIssueInteraction(Incidence issue);
    }

    public IssuesAdapter(OnIssueListFragmentInteractionListener listener, Activity context) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(context, "context");
        this.listener = listener;
        this.context = context;
        this.issuesList = new ArrayList();
    }

    public static /* synthetic */ void updateIssues$default(IssuesAdapter issuesAdapter, List list, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z3 = false;
        }
        issuesAdapter.updateIssues(list, z3);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.issuesList.size();
    }

    public final void updateIssues(List<IncidenceStation> issues, boolean replacing) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        if (replacing) {
            this.issuesList.clear();
            this.issuesList.addAll(issues);
        } else {
            this.issuesList.addAll(issues);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(IssueViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.issuesList.get(position), this.listener);
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public IssueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemIssueListBinding inflate = ItemIssueListBinding.inflate(LayoutInflater.from(this.context), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new IssueViewHolder(inflate);
    }
}
