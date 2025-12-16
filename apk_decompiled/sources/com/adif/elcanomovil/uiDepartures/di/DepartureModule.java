package com.adif.elcanomovil.uiDepartures.di;

import com.adif.elcanomovil.domain.entities.circulation.mappers.AvldmdCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.CercaniasCirculationMapper;
import com.adif.elcanomovil.domain.entities.circulation.mappers.OthersCirculationMapper;
import com.adif.elcanomovil.domain.repositories.linecolours.LineColoursRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/adif/elcanomovil/uiDepartures/di/DepartureModule;", "", "()V", "dateFormatter", "Ljava/text/DateFormat;", "providesAvldmdCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/AvldmdCirculationMapper;", "formatter", "providesCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/CercaniasCirculationMapper;", "lineColoursRepository", "Lcom/adif/elcanomovil/domain/repositories/linecolours/LineColoursRepository;", "providesOtherCirculationMapper", "Lcom/adif/elcanomovil/domain/entities/circulation/mappers/OthersCirculationMapper;", "ui-departures_proNon_corporateRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class DepartureModule {
    public static final DepartureModule INSTANCE = new DepartureModule();

    private DepartureModule() {
    }

    @Provides
    @Named("circulation")
    public final DateFormat dateFormatter() {
        return new SimpleDateFormat("HH:mm", Locale.US);
    }

    @Provides
    public final AvldmdCirculationMapper providesAvldmdCirculationMapper(@Named("circulation") DateFormat formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new AvldmdCirculationMapper(formatter);
    }

    @Provides
    public final CercaniasCirculationMapper providesCirculationMapper(@Named("circulation") DateFormat formatter, LineColoursRepository lineColoursRepository) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(lineColoursRepository, "lineColoursRepository");
        return new CercaniasCirculationMapper(formatter, lineColoursRepository);
    }

    @Provides
    public final OthersCirculationMapper providesOtherCirculationMapper(@Named("circulation") DateFormat formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return new OthersCirculationMapper(formatter);
    }
}
