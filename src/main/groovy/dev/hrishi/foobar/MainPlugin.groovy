package dev.hrishi.foobar

import dev.hrishi.foobar.tasks.TimezoneTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class MainPlugin implements Plugin<Project>
{
    @Override
    void apply(Project project)
    {
        project.task("timeFor", type: TimezoneTask) {
            group = 'TimeZone'
            description = 'TimeZone utility commands'
        }
    }
}
