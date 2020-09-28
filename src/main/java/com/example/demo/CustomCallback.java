package com.example.demo;

import org.flywaydb.core.api.callback.BaseCallback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import org.springframework.stereotype.Component;

@Component
public class CustomCallback extends BaseCallback {
    @Override
    public void handle(Event event, Context context) {
        System.out.println(event.getId());
        System.out.println(event.name());
        System.out.println(context.getConfiguration().getBaselineVersion().getVersion());
    }
}
