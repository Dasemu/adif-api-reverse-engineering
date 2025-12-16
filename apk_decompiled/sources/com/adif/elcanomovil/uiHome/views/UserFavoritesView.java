package com.adif.elcanomovil.uiHome.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0232n0;
import androidx.recyclerview.widget.E0;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiHome.R;
import com.adif.elcanomovil.uiHome.adapters.UserFavoritesAdapter;
import com.adif.elcanomovil.uiHome.data.UserFavoriteVO;
import com.adif.elcanomovil.uiHome.databinding.ViewUserFavoritesBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0010J\u0014\u0010\u001f\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100 J\b\u0010!\u001a\u00020\u0017H\u0002J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\u0006\u0010$\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R>\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0002`\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/adif/elcanomovil/uiHome/views/UserFavoritesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attrs", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/adif/elcanomovil/uiHome/databinding/ViewUserFavoritesBinding;", "value", "Ljava/util/ArrayList;", "Lcom/adif/elcanomovil/uiHome/data/UserFavoriteVO;", "Lkotlin/collections/ArrayList;", "favorites", "setFavorites", "(Ljava/util/ArrayList;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "Lcom/adif/elcanomovil/uiHome/adapters/UserFavoriteListener;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "addFavorite", "favorite", "addFavorites", "", "configureViews", "initView", "notifyDataSetChanged", "removeAllFavorites", "removeFavorite", "ui-home_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserFavoritesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFavoritesView.kt\ncom/adif/elcanomovil/uiHome/views/UserFavoritesView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n350#2,7:106\n*S KotlinDebug\n*F\n+ 1 UserFavoritesView.kt\ncom/adif/elcanomovil/uiHome/views/UserFavoritesView\n*L\n74#1:106,7\n*E\n"})
/* loaded from: classes2.dex */
public final class UserFavoritesView extends ConstraintLayout {
    private ViewUserFavoritesBinding binding;
    private ArrayList<UserFavoriteVO> favorites;
    private Function1<? super UserFavoriteVO, Unit> listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFavoritesView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.favorites = new ArrayList<>();
        initView(context, null);
    }

    private final void configureViews() {
        ViewUserFavoritesBinding viewUserFavoritesBinding = this.binding;
        if (viewUserFavoritesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserFavoritesBinding = null;
        }
        viewUserFavoritesBinding.recycleViewFavouriteStations.i(new AbstractC0232n0() { // from class: com.adif.elcanomovil.uiHome.views.UserFavoritesView$configureViews$1
            @Override // androidx.recyclerview.widget.AbstractC0232n0
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, E0 state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = 16;
            }
        });
    }

    private final void initView(Context context, AttributeSet attrs) {
        View.inflate(context, R.layout.view_user_favorites, this);
        ViewUserFavoritesBinding bind = ViewUserFavoritesBinding.bind(this);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        configureViews();
    }

    private final void notifyDataSetChanged() {
        ViewUserFavoritesBinding viewUserFavoritesBinding = this.binding;
        if (viewUserFavoritesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserFavoritesBinding = null;
        }
        RecyclerView recyclerView = viewUserFavoritesBinding.recycleViewFavouriteStations;
        ArrayList<UserFavoriteVO> arrayList = this.favorites;
        Function1<? super UserFavoriteVO, Unit> function1 = this.listener;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setAdapter(new UserFavoritesAdapter(arrayList, function1, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeFavorite$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    private final void setFavorites(ArrayList<UserFavoriteVO> arrayList) {
        this.favorites = arrayList;
        notifyDataSetChanged();
    }

    public final void addFavorite(UserFavoriteVO favorite) {
        Intrinsics.checkNotNullParameter(favorite, "favorite");
        this.favorites.add(favorite);
        notifyDataSetChanged();
    }

    public final void addFavorites(List<UserFavoriteVO> favorites) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        setFavorites(new ArrayList<>());
        this.favorites.addAll(favorites);
        ViewUserFavoritesBinding viewUserFavoritesBinding = this.binding;
        ViewUserFavoritesBinding viewUserFavoritesBinding2 = null;
        if (viewUserFavoritesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserFavoritesBinding = null;
        }
        viewUserFavoritesBinding.recycleViewFavouriteStations.setVisibility(0);
        ViewUserFavoritesBinding viewUserFavoritesBinding3 = this.binding;
        if (viewUserFavoritesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewUserFavoritesBinding2 = viewUserFavoritesBinding3;
        }
        viewUserFavoritesBinding2.viewFavouriteStationsEmpty.setVisibility(8);
        notifyDataSetChanged();
    }

    public final Function1<UserFavoriteVO, Unit> getListener() {
        return this.listener;
    }

    public final void removeAllFavorites() {
        setFavorites(new ArrayList<>());
        ViewUserFavoritesBinding viewUserFavoritesBinding = this.binding;
        ViewUserFavoritesBinding viewUserFavoritesBinding2 = null;
        if (viewUserFavoritesBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewUserFavoritesBinding = null;
        }
        viewUserFavoritesBinding.recycleViewFavouriteStations.setVisibility(8);
        ViewUserFavoritesBinding viewUserFavoritesBinding3 = this.binding;
        if (viewUserFavoritesBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewUserFavoritesBinding2 = viewUserFavoritesBinding3;
        }
        viewUserFavoritesBinding2.viewFavouriteStationsEmpty.setVisibility(0);
    }

    public final void removeFavorite(UserFavoriteVO favorite) {
        Intrinsics.checkNotNullParameter(favorite, "favorite");
        ArrayList<UserFavoriteVO> arrayList = this.favorites;
        final I1.b bVar = new I1.b(favorite, 10);
        arrayList.removeIf(new Predicate() { // from class: com.adif.elcanomovil.uiHome.views.k
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean removeFavorite$lambda$0;
                removeFavorite$lambda$0 = UserFavoritesView.removeFavorite$lambda$0(I1.b.this, obj);
                return removeFavorite$lambda$0;
            }
        });
        notifyDataSetChanged();
    }

    public final void setListener(Function1<? super UserFavoriteVO, Unit> function1) {
        this.listener = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFavoritesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.favorites = new ArrayList<>();
        initView(context, attributeSet);
    }

    public /* synthetic */ UserFavoritesView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFavoritesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.favorites = new ArrayList<>();
        initView(context, attributeSet);
    }
}
