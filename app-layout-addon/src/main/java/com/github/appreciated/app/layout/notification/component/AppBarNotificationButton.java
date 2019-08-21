package com.github.appreciated.app.layout.notification.component;

import com.github.appreciated.app.layout.component.appbar.ContextMenuAppBarButton;
import com.github.appreciated.app.layout.notification.NotificationHolder;
import com.github.appreciated.app.layout.notification.NotificationsChangeListener;
import com.github.appreciated.app.layout.notification.entitiy.Notification;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;

/**
 * A component which opens a window containing the notifications on click closely to this component. Also showing an
 * indicator how many new notifications are available
 */

@CssImport("./com/github/appreciated/app-layout/styles/app-bar-notification-button-style.css")
public class AppBarNotificationButton<T extends Notification> extends ContextMenuAppBarButton {

    private NotificationsView notificationsView;

    public AppBarNotificationButton(VaadinIcon icon, NotificationHolder<T> holder) {
        super(icon.create());
        this.notificationsView = new NotificationsView(holder);
        this.setContentComponent(notificationsView);
        setClassName("app-bar-notification-button");
        getStyle().set("--paper-menu-button-dropdown-background", "transparent")
                .set("--shadow-elevation-2dp_-_box-shadow", "0px")
                .set("--paper-menu-button-dropdown_-_margin-top", "var(--app-layout-bar-height)")
                .set("--paper-menu-button-dropdown_-_margin-right", "7px");

        //setHorizontalAlignment(HorizontalAlignment.RIGHT);
        holder.addNotificationsChangeListener(new NotificationsChangeListener<T>() {
            @Override
            public void onNotificationChanges(NotificationHolder<T> holder) {
                refreshNotifications();
            }

            @Override
            public void onNotificationAdded(T notification) {
                refreshNotifications();
            }

            @Override
            public void onNotificationRemoved(T notification) {

            }
        });
        //holder.addClickListener(newStatus -> getUI().ifPresent(ui -> ui.access(AppBarNotificationButton.this::close)));
        holder.bind(getBadge());
    }

    public void refreshNotifications() {
        getContextMenu().removeAll();
        notificationsView.initViews().forEach(this::withItem);
    }

    public NotificationsView getNotificationsView() {
        return notificationsView;
    }
}
