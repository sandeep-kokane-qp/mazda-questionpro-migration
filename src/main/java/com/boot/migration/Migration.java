package com.boot.migration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class Migration implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("test");
        // get userinterlinks
        // create panel_member, cx_transaction, responset_set, custom fields
        //
    }


}
