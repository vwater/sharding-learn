package com.djtu.vwater;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@SpringBootTest
public class TestThreadPoolTest {
    @Test
    public void testThreadPool() {
        List<CompletableFuture<String>> futureList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int index = i;
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep((long) (Math.random() * 10000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "Task " + index + " completed.";
            });
            futureList.add(future);
        }

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futureList.toArray(new CompletableFuture[0]));
        CompletableFuture<List<String>> allResults = allFutures.thenApply(v -> {
            List<String> results = new ArrayList<>();
            for (CompletableFuture<String> future : futureList) {
                System.out.println(future.join());
            }
            return results;
        });


    }
}
