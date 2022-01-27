package com.github.0xab41.almostmonotheme.services

import com.intellij.openapi.project.Project
import com.github.0xab41.almostmonotheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
