package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int quantity = 0;
        int totalScore = 0;
        for (Pupil p : pupils) {
            List<Subject> sub = p.subjects();
            for (Subject item : sub) {
                totalScore += item.score();
                quantity++;
            }
        }
        return (double) totalScore / quantity;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {

        List<Label> score = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject subj : pupil.subjects()) {
                scoreSum = scoreSum + subj.score();
            }
            score.add(new Label(pupil.name(), (double) scoreSum / pupil.subjects().size()));
        }
        return score;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjs = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjs.put(subject.name(), subjs.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (String key : subjs.keySet()) {
            labels.add(new Label(key, (double) subjs.get(key) / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject subj : pupil.subjects()) {
                scoreSum = scoreSum + subj.score();
            }
            score.add(new Label(pupil.name(), scoreSum));
        }
        score.sort(Comparator.naturalOrder());
        return score.get(score.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjs = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjs.put(subject.name(), subjs.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> subjRate = new ArrayList<>();
        for (String key : subjs.keySet()) {
            subjRate.add(new Label(key, (double) subjs.get(key)));
        }

        subjRate.sort(Comparator.naturalOrder());
        return subjRate.get(subjRate.size() - 1);

    }
}