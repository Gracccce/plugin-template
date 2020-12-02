package com.github.gracccce.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.gracccce.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
