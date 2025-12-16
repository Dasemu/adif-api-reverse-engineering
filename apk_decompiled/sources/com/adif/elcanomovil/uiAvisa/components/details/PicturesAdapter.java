package com.adif.elcanomovil.uiAvisa.components.details;

import G2.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC0220h0;
import androidx.recyclerview.widget.I0;
import com.adif.elcanomovil.uiAvisa.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter;", "Landroidx/recyclerview/widget/h0;", "Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$PictureViewHolder;", "Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$OnPictureGridFragmentInteractionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$OnPictureGridFragmentInteractionListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$PictureViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$PictureViewHolder;I)V", "", "Landroid/graphics/Bitmap;", "pictures", "updatePictures", "(Ljava/util/List;)V", "Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$OnPictureGridFragmentInteractionListener;", "", "pictureList", "Ljava/util/List;", "OnPictureGridFragmentInteractionListener", "PictureViewHolder", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PicturesAdapter extends AbstractC0220h0 {
    private final OnPictureGridFragmentInteractionListener listener;
    private final List<Bitmap> pictureList;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$OnPictureGridFragmentInteractionListener;", "", "onPictureInteraction", "", "bitmap", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface OnPictureGridFragmentInteractionListener {
        void onPictureInteraction(int bitmap);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$PictureViewHolder;", "Landroidx/recyclerview/widget/I0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "populateView", "()V", "Landroid/graphics/Bitmap;", "item", "Landroid/graphics/Bitmap;", "getItem", "()Landroid/graphics/Bitmap;", "setItem", "(Landroid/graphics/Bitmap;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PictureViewHolder extends I0 {
        public Bitmap item;
        private final CoroutineScope scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PictureViewHolder(View itemView) {
            super(itemView);
            CompletableJob Job$default;
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            this.scope = CoroutineScopeKt.CoroutineScope(Job$default.plus(Dispatchers.getDefault()));
        }

        public final Bitmap getItem() {
            Bitmap bitmap = this.item;
            if (bitmap != null) {
                return bitmap;
            }
            Intrinsics.throwUninitializedPropertyAccessException("item");
            return null;
        }

        public final void populateView() {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            int i = (int) (90 * context.getResources().getDisplayMetrics().density);
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(getItem(), i, (int) (90 * context2.getResources().getDisplayMetrics().density));
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageBitmap(extractThumbnail);
        }

        public final void setItem(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
            this.item = bitmap;
        }
    }

    public PicturesAdapter(OnPictureGridFragmentInteractionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.pictureList = new ArrayList();
    }

    public static final void onBindViewHolder$lambda$0(PicturesAdapter this$0, PictureViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.listener.onPictureInteraction(holder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public int getItemCount() {
        return this.pictureList.size();
    }

    public final void updatePictures(List<Bitmap> pictures) {
        Intrinsics.checkNotNullParameter(pictures, "pictures");
        this.pictureList.clear();
        this.pictureList.addAll(pictures);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setItem(this.pictureList.get(position));
        holder.itemView.setOnClickListener(new l(3, this, holder));
        holder.populateView();
    }

    @Override // androidx.recyclerview.widget.AbstractC0220h0
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_picture_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PictureViewHolder(inflate);
    }
}
