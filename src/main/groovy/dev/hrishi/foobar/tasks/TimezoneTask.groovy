package dev.hrishi.foobar.tasks

import dev.hrishi.foobar.service.DefaultTimezone
import dev.hrishi.foobar.service.Timezone
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TimezoneTask extends DefaultTask
{
    @TaskAction
    def print()
    {
        def zone = project.findProperty("zone") ?: "Europe/Madrid"
        Timezone tz = new DefaultTimezone(TimeZone.getTimeZone(zone))
        println "Time is >>>>>>>>> ${tz.getTime()}"
    }
}
