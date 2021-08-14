package com.github.leeyoho1874.myplugin.services

import com.github.leeyoho1874.myplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
