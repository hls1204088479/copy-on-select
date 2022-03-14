package com.github.hls1204088479.copyonselect.services

import com.intellij.openapi.project.Project
import com.github.hls1204088479.copyonselect.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
