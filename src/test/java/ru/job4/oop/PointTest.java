package ru.job4.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


class PointTest {

    @Test
    public void when00and00and04ThenMinu1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        double expected = 2;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when000and022and04ThenMinu1() {
        Point ad = new Point(0, 0,0);
        Point bd = new Point(0, 2,2);
        double rsl = ad.distance3d(bd);
        double expected = 2.828;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

}