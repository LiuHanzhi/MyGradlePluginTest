package com.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    // 当插件apply时调用
    void apply(Project project) {
        System.out.println("自定义插件!11111111")
    }
}
