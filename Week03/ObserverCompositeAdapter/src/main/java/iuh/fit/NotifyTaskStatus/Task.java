package iuh.fit.NotifyTaskStatus;

import java.util.ArrayList;


public class Task {
    private String name;
    private int progress;
    private ArrayList<Participant> members;

    public Task(String name) {
        members = new ArrayList<>();
        this.name = name;
        progress = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
        notifyMembers();
    }

    public boolean subscribe(Participant p) {
        return members.add(p);
    }

    public boolean unsubscribe(Participant p) {
        return members.remove(p);
    }

    public void notifyMembers() {
        members.forEach(m -> m.update(this));
    }

}
