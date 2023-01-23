package com.mindflakes.colorizedproject.color_setters

import com.intellij.openapi.project.Project
import com.mindflakes.colorizedproject.utils.getForegroundColorBasedOnBrightness
import java.awt.Color

class LinuxColorSetter : ColorSetter() {
    override val TITLE_BAR_COMPONENT_PATH = listOf("JBLayeredPane", "LinuxIdeMenuBar")

    override fun setTitleBar(color: Color, project: Project) {
        val titleBarComponent = findTitleBarComponent(project)

        recursiveSetComponentColor(titleBarComponent, color, "background")
        recursiveSetComponentColor(titleBarComponent, getForegroundColorBasedOnBrightness(color), "foreground")
    }
}