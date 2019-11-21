package com.idi.morespringpatterns.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Evgeny Borisov
 */
class WorkControllerTest {

    @Test
    void doWork() {
        WorkController workController = new WorkController();

        workController.doWork();
    }
}