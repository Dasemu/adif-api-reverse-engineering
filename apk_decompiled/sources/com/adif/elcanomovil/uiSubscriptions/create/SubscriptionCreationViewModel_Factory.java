package com.adif.elcanomovil.uiSubscriptions.create;

import android.content.Context;
import com.adif.elcanomovil.domain.usecases.stations.GetStationByIdUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.CreateSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.DeleteSubscriptionsUseCase;
import com.adif.elcanomovil.domain.usecases.subscriptions.subscriptions.ModifySubscriptionsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
/* loaded from: classes3.dex */
public final class SubscriptionCreationViewModel_Factory implements Factory<SubscriptionCreationViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<CreateSubscriptionsUseCase> createSubscriptionsUseCaseProvider;
    private final Provider<DeleteSubscriptionsUseCase> deleteSubscriptionsUseCaseProvider;
    private final Provider<GetStationByIdUseCase> getStationByIdUseCaseProvider;
    private final Provider<ModifySubscriptionsUseCase> modifySubscriptionsUseCaseProvider;

    public SubscriptionCreationViewModel_Factory(Provider<CreateSubscriptionsUseCase> provider, Provider<GetStationByIdUseCase> provider2, Provider<DeleteSubscriptionsUseCase> provider3, Provider<ModifySubscriptionsUseCase> provider4, Provider<Context> provider5) {
        this.createSubscriptionsUseCaseProvider = provider;
        this.getStationByIdUseCaseProvider = provider2;
        this.deleteSubscriptionsUseCaseProvider = provider3;
        this.modifySubscriptionsUseCaseProvider = provider4;
        this.contextProvider = provider5;
    }

    public static SubscriptionCreationViewModel_Factory create(Provider<CreateSubscriptionsUseCase> provider, Provider<GetStationByIdUseCase> provider2, Provider<DeleteSubscriptionsUseCase> provider3, Provider<ModifySubscriptionsUseCase> provider4, Provider<Context> provider5) {
        return new SubscriptionCreationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SubscriptionCreationViewModel newInstance(CreateSubscriptionsUseCase createSubscriptionsUseCase, GetStationByIdUseCase getStationByIdUseCase, DeleteSubscriptionsUseCase deleteSubscriptionsUseCase, ModifySubscriptionsUseCase modifySubscriptionsUseCase, Context context) {
        return new SubscriptionCreationViewModel(createSubscriptionsUseCase, getStationByIdUseCase, deleteSubscriptionsUseCase, modifySubscriptionsUseCase, context);
    }

    @Override // javax.inject.Provider
    public SubscriptionCreationViewModel get() {
        return newInstance(this.createSubscriptionsUseCaseProvider.get(), this.getStationByIdUseCaseProvider.get(), this.deleteSubscriptionsUseCaseProvider.get(), this.modifySubscriptionsUseCaseProvider.get(), this.contextProvider.get());
    }
}
