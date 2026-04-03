package iuh.fit.NotifyTaskStatus;

public class Member implements Participant {
    private String name;

    public Member(String name){
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println("Xin chào " + name + "\n"
        + "Task " + task.getName() + " Đã hoàn thành: " + task.getProgress() + "%  \n");
    }
}
