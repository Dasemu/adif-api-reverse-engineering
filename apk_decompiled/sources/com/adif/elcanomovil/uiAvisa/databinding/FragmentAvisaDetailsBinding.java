package com.adif.elcanomovil.uiAvisa.databinding;

import a.AbstractC0105a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.adif.elcanomovil.commonViews.FullWidthButtonView;
import com.adif.elcanomovil.commonViews.HeaderView;
import com.adif.elcanomovil.uiAvisa.R;
import com.adif.elcanomovil.uiAvisa.utils.ui.PictureGridView;

/* loaded from: classes.dex */
public final class FragmentAvisaDetailsBinding {
    public final HeaderView headerAvisaDetailIssue;
    public final FullWidthButtonView issueDetailsCategory;
    public final TextView issueDetailsComments;
    public final LinearLayout issueDetailsCommentsHolder;
    public final TextView issueDetailsCommentsTitle;
    public final TextView issueDetailsDescription;
    public final TextView issueDetailsFixingTitle;
    public final FullWidthButtonView issueDetailsLocation;
    public final TextView issueDetailsNotifications;
    public final ImageView issueDetailsNotificationsIcon;
    public final LinearLayout issueDetailsNotificationsWithIcon;
    public final TextView issueDetailsStatus;
    public final PictureGridView issueSystemPictures;
    public final PictureGridView issueUserPictures;
    private final NestedScrollView rootView;
    public final NestedScrollView scrollView;

    private FragmentAvisaDetailsBinding(NestedScrollView nestedScrollView, HeaderView headerView, FullWidthButtonView fullWidthButtonView, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, FullWidthButtonView fullWidthButtonView2, TextView textView5, ImageView imageView, LinearLayout linearLayout2, TextView textView6, PictureGridView pictureGridView, PictureGridView pictureGridView2, NestedScrollView nestedScrollView2) {
        this.rootView = nestedScrollView;
        this.headerAvisaDetailIssue = headerView;
        this.issueDetailsCategory = fullWidthButtonView;
        this.issueDetailsComments = textView;
        this.issueDetailsCommentsHolder = linearLayout;
        this.issueDetailsCommentsTitle = textView2;
        this.issueDetailsDescription = textView3;
        this.issueDetailsFixingTitle = textView4;
        this.issueDetailsLocation = fullWidthButtonView2;
        this.issueDetailsNotifications = textView5;
        this.issueDetailsNotificationsIcon = imageView;
        this.issueDetailsNotificationsWithIcon = linearLayout2;
        this.issueDetailsStatus = textView6;
        this.issueSystemPictures = pictureGridView;
        this.issueUserPictures = pictureGridView2;
        this.scrollView = nestedScrollView2;
    }

    public static FragmentAvisaDetailsBinding bind(View view) {
        int i = R.id.headerAvisaDetailIssue;
        HeaderView headerView = (HeaderView) AbstractC0105a.t(view, i);
        if (headerView != null) {
            i = R.id.issue_details_category;
            FullWidthButtonView fullWidthButtonView = (FullWidthButtonView) AbstractC0105a.t(view, i);
            if (fullWidthButtonView != null) {
                i = R.id.issue_details_comments;
                TextView textView = (TextView) AbstractC0105a.t(view, i);
                if (textView != null) {
                    i = R.id.issue_details_comments_holder;
                    LinearLayout linearLayout = (LinearLayout) AbstractC0105a.t(view, i);
                    if (linearLayout != null) {
                        i = R.id.issue_details_comments_title;
                        TextView textView2 = (TextView) AbstractC0105a.t(view, i);
                        if (textView2 != null) {
                            i = R.id.issue_details_description;
                            TextView textView3 = (TextView) AbstractC0105a.t(view, i);
                            if (textView3 != null) {
                                i = R.id.issue_details_fixing_title;
                                TextView textView4 = (TextView) AbstractC0105a.t(view, i);
                                if (textView4 != null) {
                                    i = R.id.issue_details_location;
                                    FullWidthButtonView fullWidthButtonView2 = (FullWidthButtonView) AbstractC0105a.t(view, i);
                                    if (fullWidthButtonView2 != null) {
                                        i = R.id.issue_details_notifications;
                                        TextView textView5 = (TextView) AbstractC0105a.t(view, i);
                                        if (textView5 != null) {
                                            i = R.id.issue_details_notifications_icon;
                                            ImageView imageView = (ImageView) AbstractC0105a.t(view, i);
                                            if (imageView != null) {
                                                i = R.id.issue_details_notifications_with_icon;
                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC0105a.t(view, i);
                                                if (linearLayout2 != null) {
                                                    i = R.id.issue_details_status;
                                                    TextView textView6 = (TextView) AbstractC0105a.t(view, i);
                                                    if (textView6 != null) {
                                                        i = R.id.issue_system_pictures;
                                                        PictureGridView pictureGridView = (PictureGridView) AbstractC0105a.t(view, i);
                                                        if (pictureGridView != null) {
                                                            i = R.id.issue_user_pictures;
                                                            PictureGridView pictureGridView2 = (PictureGridView) AbstractC0105a.t(view, i);
                                                            if (pictureGridView2 != null) {
                                                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                                return new FragmentAvisaDetailsBinding(nestedScrollView, headerView, fullWidthButtonView, textView, linearLayout, textView2, textView3, textView4, fullWidthButtonView2, textView5, imageView, linearLayout2, textView6, pictureGridView, pictureGridView2, nestedScrollView);
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

    public static FragmentAvisaDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAvisaDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(R.layout.fragment_avisa_details, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
