package practice;

import model.Candidate;

import java.util.function.Predicate;

import static java.lang.Integer.parseInt;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate candidate) {
        String[] date = candidate.getPeriodsInUkr().split("-");
        return candidate.getAge() >= 35
                && candidate.isAllowedToVote()
                && candidate.getNationality().equalsIgnoreCase("Ukrainian")
                && parseInt(date[1]) - parseInt(date[0]) > 10;
    }
}
