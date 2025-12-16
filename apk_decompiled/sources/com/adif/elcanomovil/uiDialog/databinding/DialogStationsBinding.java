package com.adif.elcanomovil.uiDialog.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.adif.elcanomovil.uiDialog.R;

/* loaded from: classes2.dex */
public final class DialogStationsBinding {
    public final TextView accessibility;
    public final LinearLayout accessibilityLayout;
    public final LinearLayout clLinks;
    public final ImageButton close;
    public final TextView description;
    public final TextView location;
    public final LinearLayout locationLayout;
    public final ImageView logo;
    public final TextView name;
    public final TextView offerDescription;
    public final ImageView offerImage;
    public final LinearLayout offerLayout;
    public final TextView openingHours;
    public final LinearLayout openingHoursLayout;
    public final ImageView paymentWayApplePay;
    public final ImageView paymentWayBizum;
    public final ImageView paymentWayCash;
    public final ImageView paymentWayCreditCard;
    public final ImageView paymentWayFoodVoucher;
    public final ImageView paymentWayGooglePay;
    public final ImageView paymentWayOthers;
    public final ImageView paymentWayPayPal;
    public final ImageView paymentWaySamsungPay;
    public final ImageButton playSore;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextView telephone;
    public final LinearLayout telephoneLayout;
    public final TextView web;
    public final LinearLayout webLayout;

    private DialogStationsBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageButton imageButton, TextView textView2, TextView textView3, LinearLayout linearLayout4, ImageView imageView, TextView textView4, TextView textView5, ImageView imageView2, LinearLayout linearLayout5, TextView textView6, LinearLayout linearLayout6, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11, ImageButton imageButton2, RecyclerView recyclerView, TextView textView7, LinearLayout linearLayout7, TextView textView8, LinearLayout linearLayout8) {
        this.rootView = linearLayout;
        this.accessibility = textView;
        this.accessibilityLayout = linearLayout2;
        this.clLinks = linearLayout3;
        this.close = imageButton;
        this.description = textView2;
        this.location = textView3;
        this.locationLayout = linearLayout4;
        this.logo = imageView;
        this.name = textView4;
        this.offerDescription = textView5;
        this.offerImage = imageView2;
        this.offerLayout = linearLayout5;
        this.openingHours = textView6;
        this.openingHoursLayout = linearLayout6;
        this.paymentWayApplePay = imageView3;
        this.paymentWayBizum = imageView4;
        this.paymentWayCash = imageView5;
        this.paymentWayCreditCard = imageView6;
        this.paymentWayFoodVoucher = imageView7;
        this.paymentWayGooglePay = imageView8;
        this.paymentWayOthers = imageView9;
        this.paymentWayPayPal = imageView10;
        this.paymentWaySamsungPay = imageView11;
        this.playSore = imageButton2;
        this.rv = recyclerView;
        this.telephone = textView7;
        this.telephoneLayout = linearLayout7;
        this.web = textView8;
        this.webLayout = linearLayout8;
    }

    public static DialogStationsBinding bind(View view) {
        int i = R.id.accessibility;
        TextView textView = (TextView) AbstractC0105a.t(view, i);
        if (textView != null) {
            i = R.id.accessibility_layout;
            LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
            if (linearLayout != null) {
                i = R.id.cl_links;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                if (linearLayout2 != null) {
                    i = R.id.close;
                    ImageButton imageButton = (ImageButton) AbstractC0105a.t(view, i);
                    if (imageButton != null) {
                        i = R.id.description;
                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                        if (textView2 != null) {
                            i = R.id.location;
                            TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                            if (textView3 != null) {
                                i = R.id.location_layout;
                                LinearLayout linearLayout3 = (LinearLayout) AbstractC0105a.t(view, i);
                                if (linearLayout3 != null) {
                                    i = R.id.logo;
                                    ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                    if (imageView != null) {
                                        i = R.id.name;
                                        TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView4 != null) {
                                            i = R.id.offer_description;
                                            TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                            if (textView5 != null) {
                                                i = R.id.offer_image;
                                                ImageView imageView2 = (ImageView) AbstractC0105a.t(view, i);
                                                if (imageView2 != null) {
                                                    i = R.id.offer_layout;
                                                    LinearLayout linearLayout4 = (LinearLayout) AbstractC0105a.t(view, i);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.opening_hours;
                                                        TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                        if (textView6 != null) {
                                                            i = R.id.opening_hours_layout;
                                                            LinearLayout linearLayout5 = (LinearLayout) AbstractC0105a.t(view, i);
                                                            if (linearLayout5 != null) {
                                                                i = R.id.payment_way_apple_pay;
                                                                ImageView imageView3 = (ImageView) AbstractC0105a.t(view, i);
                                                                if (imageView3 != null) {
                                                                    i = R.id.payment_way_bizum;
                                                                    ImageView imageView4 = (ImageView) AbstractC0105a.t(view, i);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.payment_way_cash;
                                                                        ImageView imageView5 = (ImageView) AbstractC0105a.t(view, i);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.payment_way_credit_card;
                                                                            ImageView imageView6 = (ImageView) AbstractC0105a.t(view, i);
                                                                            if (imageView6 != null) {
                                                                                i = R.id.payment_way_food_voucher;
                                                                                ImageView imageView7 = (ImageView) AbstractC0105a.t(view, i);
                                                                                if (imageView7 != null) {
                                                                                    i = R.id.payment_way_google_pay;
                                                                                    ImageView imageView8 = (ImageView) AbstractC0105a.t(view, i);
                                                                                    if (imageView8 != null) {
                                                                                        i = R.id.payment_way_others;
                                                                                        ImageView imageView9 = (ImageView) AbstractC0105a.t(view, i);
                                                                                        if (imageView9 != null) {
                                                                                            i = R.id.payment_way_pay_pal;
                                                                                            ImageView imageView10 = (ImageView) AbstractC0105a.t(view, i);
                                                                                            if (imageView10 != null) {
                                                                                                i = R.id.payment_way_samsung_pay;
                                                                                                ImageView imageView11 = (ImageView) AbstractC0105a.t(view, i);
                                                                                                if (imageView11 != null) {
                                                                                                    i = R.id.play_sore;
                                                                                                    ImageButton imageButton2 = (ImageButton) AbstractC0105a.t(view, i);
                                                                                                    if (imageButton2 != null) {
                                                                                                        i = R.id.rv;
                                                                                                        RecyclerView recyclerView = (RecyclerView) AbstractC0105a.t(view, i);
                                                                                                        if (recyclerView != null) {
                                                                                                            i = R.id.telephone;
                                                                                                            TextView textView7 = (TextView) AbstractC0105a.t(view, i);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.telephone_layout;
                                                                                                                LinearLayout linearLayout6 = (LinearLayout) AbstractC0105a.t(view, i);
                                                                                                                if (linearLayout6 != null) {
                                                                                                                    i = R.id.web;
                                                                                                                    TextView textView8 = (TextView) AbstractC0105a.t(view, i);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.web_layout;
                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) AbstractC0105a.t(view, i);
                                                                                                                        if (linearLayout7 != null) {
                                                                                                                            return new DialogStationsBinding((LinearLayout) view, textView, linearLayout, linearLayout2, imageButton, textView2, textView3, linearLayout3, imageView, textView4, textView5, imageView2, linearLayout4, textView6, linearLayout5, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageButton2, recyclerView, textView7, linearLayout6, textView8, linearLayout7);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static DialogStationsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogStationsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.dialog_stations, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
