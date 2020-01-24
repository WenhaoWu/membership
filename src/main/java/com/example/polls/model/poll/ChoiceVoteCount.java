package com.example.polls.model.poll;

public class ChoiceVoteCount {
    private Long choiceId;
    private Long choiceCount;

    public ChoiceVoteCount(Long choiceId, Long choiceCount) {
        this.choiceId = choiceId;
        this.choiceCount = choiceCount;
    }

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }

    public Long getChoiceCount() {
        return choiceCount;
    }

    public void setChoiceCount(Long choiceCount) {
        this.choiceCount = choiceCount;
    }
}
