package com.github.appreciated.app.layout.behaviour.left;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

/**
 * Created by appreciated on 01.05.2017.
 * Edited By deyaeddin on 07.02.2018
 */

@HtmlImport("frontend://bower_components/polymer/polymer.html")
@HtmlImport("frontend://bower_components/iron-icons/iron-icons.html")
@HtmlImport("frontend://bower_components/paper-icon-button/paper-icon-button.html")
@HtmlImport("frontend://bower_components/app-layout/app-drawer-layout/app-drawer-layout.html")
@HtmlImport("frontend://bower_components/app-layout/app-drawer/app-drawer.html")
@HtmlImport("frontend://bower_components/app-layout/app-scroll-effects/app-scroll-effects.html")
@HtmlImport("frontend://bower_components/app-layout/app-header/app-header.html")
@HtmlImport("frontend://bower_components/app-layout/app-header-layout/app-header-layout.html")
@HtmlImport("frontend://bower_components/app-layout/app-toolbar/app-toolbar.html")

@Tag("left-hybrid")
@HtmlImport("/com/github/appreciated/app/layout/behaviour/left/left-hybrid.html")
public class LeftHybrid extends AbstractLeftAppLayoutBase {

    @Override
    public Component[] getContent() {
        return null;
    }

    @Override
    public HasComponents getContentHolder() {
        return null;
    }

    @Override
    public Component getMenuElementsHolder() {
        return null;
    }

    @Override
    public HasComponents getAppBarElementsHolder() {
        return null;
    }

    @Override
    public String getStyleName() {
        return "left-hybrid";
    }
}
