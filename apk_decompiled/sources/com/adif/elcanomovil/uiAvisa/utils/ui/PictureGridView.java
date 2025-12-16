package com.adif.elcanomovil.uiAvisa.utils.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.components.details.PicturesAdapter;
import com.adif.elcanomovil.uiAvisa.databinding.GridPicturesBinding;
import com.adif.elcanomovil.uiAvisa.utils.ui.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001dH\u0002J\u0006\u0010!\u001a\u00020\u001dJ\b\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fH\u0016J\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rJ!\u0010&\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020'2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010(J\u0014\u0010)\u001a\u00020\u001d2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020'0\u000fJ\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridView;", "Landroid/widget/LinearLayout;", "Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter$OnPictureGridFragmentInteractionListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/adif/elcanomovil/uiAvisa/components/details/PicturesAdapter;", "binding", "Lcom/adif/elcanomovil/uiAvisa/databinding/GridPicturesBinding;", "callback", "Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridView$OnPictureGridInteractionListener;", "imageViews", "", "Landroid/widget/ImageView;", "images", "", "", "isLoading", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "type", "Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridType;", "deleteImage", "", "position", "", "initialiseView", "invalidateViews", "onFinishTemporaryDetach", "onPictureInteraction", "bitmap", "setCallback", "setImage", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)V", "setImages", "setLoading", "showEmptyMessage", "updateLabel", "OnPictureGridInteractionListener", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPictureGridView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureGridView.kt\ncom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1855#2,2:231\n766#2:233\n857#2,2:234\n1864#2,3:236\n1855#2,2:239\n*S KotlinDebug\n*F\n+ 1 PictureGridView.kt\ncom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridView\n*L\n80#1:231,2\n140#1:233\n140#1:234,2\n145#1:236,3\n168#1:239,2\n*E\n"})
/* loaded from: classes.dex */
public final class PictureGridView extends LinearLayout implements PicturesAdapter.OnPictureGridFragmentInteractionListener {
    private PicturesAdapter adapter;
    private final GridPicturesBinding binding;
    private OnPictureGridInteractionListener callback;
    private final List<ImageView> imageViews;
    private final List<Object> images;
    private boolean isLoading;
    private Drawable placeholderDrawable;
    private final CoroutineScope scope;
    private PictureGridType type;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/adif/elcanomovil/uiAvisa/utils/ui/PictureGridView$OnPictureGridInteractionListener;", "", "onPictureInteraction", "", "bitmap", "Landroid/graphics/Bitmap;", "position", "", "ui-avisa_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface OnPictureGridInteractionListener {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            public static void onPictureInteraction(OnPictureGridInteractionListener onPictureGridInteractionListener, int i) {
            }

            public static void onPictureInteraction(OnPictureGridInteractionListener onPictureGridInteractionListener, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            }
        }

        void onPictureInteraction(int position);

        void onPictureInteraction(Bitmap bitmap);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PictureGridType.values().length];
            try {
                iArr[PictureGridType.COMMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PictureGridType.DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PictureGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.scope = CoroutineScopeKt.CoroutineScope(Job$default.plus(Dispatchers.getDefault()));
        this.images = new ArrayList();
        this.isLoading = true;
        GridPicturesBinding inflate = GridPicturesBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        List<ImageView> listOf = CollectionsKt.listOf((Object[]) new ImageView[]{findViewById(R.id.grid_image_1), findViewById(R.id.grid_image_2), findViewById(R.id.grid_image_3), findViewById(R.id.grid_image_4)});
        this.imageViews = listOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.PictureGridView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        PictureGridType fromInt = PictureGridType.INSTANCE.fromInt(obtainStyledAttributes.getInt(R.styleable.PictureGridView_type, 0));
        this.type = fromInt;
        if (fromInt == PictureGridType.CREATION) {
            this.placeholderDrawable = obtainStyledAttributes.getDrawable(R.styleable.PictureGridView_placeholder);
            for (ImageView imageView : listOf) {
                imageView.setImageDrawable(this.placeholderDrawable);
                imageView.setOnClickListener(new D1.a(this, 2));
            }
        }
        obtainStyledAttributes.recycle();
        initialiseView();
    }

    private final void initialiseView() {
        if (this.type == PictureGridType.CREATION) {
            this.binding.gridFixedlayout.setVisibility(0);
            this.binding.gridRecyclerview.setVisibility(8);
            this.binding.gridEmptyLabel.setVisibility(8);
            return;
        }
        this.binding.gridRecyclerview.i(new SpacesItemDecorator(4, getResources().getDimensionPixelSize(R.dimen.picture_grid_spacing), false));
        this.binding.gridFixedlayout.setVisibility(8);
        this.binding.gridRecyclerview.setVisibility(0);
        this.binding.gridEmptyLabel.setVisibility(8);
        PicturesAdapter picturesAdapter = new PicturesAdapter(this);
        this.adapter = picturesAdapter;
        this.binding.gridRecyclerview.setAdapter(picturesAdapter);
        this.binding.gridRecyclerview.setNestedScrollingEnabled(false);
    }

    public static final void lambda$1$lambda$0(PictureGridView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnPictureGridInteractionListener onPictureGridInteractionListener = this$0.callback;
        if (onPictureGridInteractionListener != null) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
            onPictureGridInteractionListener.onPictureInteraction(Integer.parseInt((String) tag));
        }
    }

    private final void setImage(Bitmap bitmap, Integer position) {
        int i;
        if (position != null) {
            this.images.set(position.intValue(), bitmap);
            i = position.intValue();
        } else if (this.images.size() == 0 || this.images.size() > 4) {
            this.images.add(0, bitmap);
            i = 0;
        } else {
            List<Object> list = this.images;
            list.add(list.size(), bitmap);
            i = this.images.size() - 1;
        }
        Utils.Companion companion = Utils.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int pxFromDp = companion.pxFromDp(context, 100);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.imageViews.get(i).setImageBitmap(ThumbnailUtils.extractThumbnail(bitmap, pxFromDp, companion.pxFromDp(context2, 100)));
    }

    public static /* synthetic */ void setImage$default(PictureGridView pictureGridView, Bitmap bitmap, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        pictureGridView.setImage(bitmap, num);
    }

    private final void showEmptyMessage() {
        this.binding.gridRecyclerview.setVisibility(8);
        this.binding.gridFixedlayout.setVisibility(8);
        this.binding.gridEmptyLabel.setVisibility(0);
        updateLabel();
    }

    private final void updateLabel() {
        if (this.isLoading) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i == 1) {
                this.binding.gridEmptyLabel.setText(R.string.avisa_empty_pictures);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                this.binding.gridEmptyLabel.setText(R.string.avisa_empty_pictures);
                return;
            }
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i4 == 1) {
            this.binding.gridEmptyLabel.setText(R.string.avisa_empty_pictures);
        } else {
            if (i4 != 2) {
                return;
            }
            this.binding.gridEmptyLabel.setText(R.string.avisa_empty_pictures);
        }
    }

    public final void deleteImage(int position) {
        if (position == this.images.size() - 1) {
            this.images.remove(position);
            this.imageViews.get(position).setImageDrawable(this.placeholderDrawable);
            return;
        }
        List<Object> list = this.images;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(this.images.get(position), obj)) {
                arrayList.add(obj);
            }
        }
        this.images.clear();
        this.images.addAll(arrayList);
        int i = 0;
        for (Object obj2 : this.imageViews) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((ImageView) obj2).setImageDrawable(this.placeholderDrawable);
            if (this.images.size() - 1 >= i) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new a(this, i, null), 3, null);
            }
            i = i4;
        }
    }

    public final void invalidateViews() {
        this.binding.gridFixedlayout.invalidate();
        this.binding.gridRecyclerview.invalidate();
        this.binding.gridEmptyLabel.invalidate();
        this.binding.gridFixedlayout.requestLayout();
        this.binding.gridRecyclerview.requestLayout();
        this.binding.gridEmptyLabel.requestLayout();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    @Override // com.adif.elcanomovil.uiAvisa.components.details.PicturesAdapter.OnPictureGridFragmentInteractionListener
    public void onPictureInteraction(int bitmap) {
        OnPictureGridInteractionListener onPictureGridInteractionListener;
        if (!(this.images.get(bitmap) instanceof Bitmap) || (onPictureGridInteractionListener = this.callback) == null) {
            return;
        }
        Object obj = this.images.get(bitmap);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
        onPictureGridInteractionListener.onPictureInteraction((Bitmap) obj);
    }

    public final void setCallback(OnPictureGridInteractionListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    public final void setImages(List<Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        PicturesAdapter picturesAdapter = null;
        if (this.type == PictureGridType.CREATION) {
            this.images.clear();
            Iterator<T> it = images.iterator();
            while (it.hasNext()) {
                setImage$default(this, (Bitmap) it.next(), null, 2, null);
            }
            return;
        }
        if (images.isEmpty()) {
            showEmptyMessage();
            return;
        }
        this.images.clear();
        this.images.addAll(images);
        PicturesAdapter picturesAdapter2 = this.adapter;
        if (picturesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            picturesAdapter = picturesAdapter2;
        }
        picturesAdapter.updatePictures(images);
        this.binding.gridEmptyLabel.setVisibility(8);
        this.binding.gridRecyclerview.setVisibility(0);
    }

    public final void setLoading(boolean isLoading) {
        this.isLoading = isLoading;
        if (this.type != PictureGridType.CREATION) {
            updateLabel();
        }
    }
}
