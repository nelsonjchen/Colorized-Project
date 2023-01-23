package com.mindflakes.colorizedproject.services

import com.mindflakes.colorizedproject.COLOR_SETTING_PATH
import com.mindflakes.colorizedproject.OVERRIDE_AUTO_COLOR_CONFIG
import com.mindflakes.colorizedproject.setTitleBarColor
import com.mindflakes.colorizedproject.ui.AUTO_COLOR_SET_TOGGLED_PATH
import com.mindflakes.colorizedproject.utils.getColorBasedOnProjectName
import com.intellij.ide.util.PropertiesComponent
import com.intellij.openapi.project.Project
import java.awt.Color
import java.util.Timer
import kotlin.concurrent.schedule

const val NO_COLOR_SET = -1
const val SET_COLOR_DELAY_MS: Long = 5000

class ProjectService(project: Project) {

    private val mProject = project

    init {
        val globalConfigs = PropertiesComponent.getInstance()
        val projectConfigs = PropertiesComponent.getInstance(mProject)
        val rgb = projectConfigs.getInt(COLOR_SETTING_PATH, NO_COLOR_SET)

        if (rgb != NO_COLOR_SET) {
            val color = if (globalConfigs.getBoolean(AUTO_COLOR_SET_TOGGLED_PATH) &&
                !projectConfigs.getBoolean(OVERRIDE_AUTO_COLOR_CONFIG)
            ) getColorBasedOnProjectName(mProject) else Color(rgb)

            setTitleBarColorWithDelay(color)
        } else if (globalConfigs.getBoolean(AUTO_COLOR_SET_TOGGLED_PATH)) {
            setTitleBarColorWithDelay(getColorBasedOnProjectName(mProject))
        }
    }

    /**
     * Delay this action to prevent the UI manger from overriding the title bar
     * with new components that are unreachable early in the execution
     */
    private fun setTitleBarColorWithDelay(color: Color, delay: Long = SET_COLOR_DELAY_MS) {
        Timer().schedule(delay) {
            setTitleBarColor(color, mProject)
        }
    }
}
