package com.bytelegend;

import com.github.hcsp.test.helper.ProjectSourceFileReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ChallengeTest {
    @Test
    public void test() {
        int n = new Random().nextInt(50) + 50;
        String str =
                IntStream.range(n, n + 20)
                        .mapToObj(i -> String.format("%c", i))
                        .collect(Collectors.joining(""));
        Assertions.assertEquals(
                (int) str.chars().filter(Character::isUpperCase).count(),
                Challenge.countUpperCaseLetters(str));
    }

    @Test
    public void noMagicNumbers() {
        String sourceCode = ProjectSourceFileReader.readAsString(Challenge.class);
        Assertions.assertTrue(
                Stream.of("64", "65", "90", "91", "0x41", "0x5a").noneMatch(sourceCode::contains));
    }
}
