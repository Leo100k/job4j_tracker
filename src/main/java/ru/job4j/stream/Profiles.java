package ru.job4j.stream;

import ru.job4j.collection.SortDescByNameJob;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream()
                .map(pr -> pr.getAddress())
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());

        //  return new ArrayList<>();
    }

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(pr -> pr.getAddress())
                .collect(Collectors.toList());

    }
}