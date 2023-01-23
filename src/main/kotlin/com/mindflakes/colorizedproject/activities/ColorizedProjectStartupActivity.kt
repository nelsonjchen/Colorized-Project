package com.mindflakes.colorizedproject.activities

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import com.mindflakes.colorizedproject.services.ProjectService

class ColorizedProjectStartupActivity: StartupActivity {
    override fun runActivity(project: Project) {
        project.service<ProjectService>()
    }

}