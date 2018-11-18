package com.ai.cloud.consul.hello.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "withName")
public class HelloWorld {

    @NonNull
    private String name;
    @Getter(AccessLevel.NONE)
    private Date at;

    public Date getAt() {
        if (at == null) {
            at = new Date();
        }
        return at;
    }

}
