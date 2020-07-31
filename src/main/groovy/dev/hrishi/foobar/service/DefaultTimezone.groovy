package dev.hrishi.foobar.service

class DefaultTimezone implements Timezone
{
    private Calendar calendar

    DefaultTimezone(Calendar calendar)
    {
        this.calendar = calendar
    }

    @Override
    String getTime()
    {
        return calendar.getTime().toString()
    }
}
