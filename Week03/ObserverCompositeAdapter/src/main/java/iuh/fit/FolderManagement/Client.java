package iuh.fit.FolderManagement;

public class Client {
    public static void main(String[] args) {
        Folder KTTKPM = new Folder();

        Folder BTL = new Folder();
        KTTKPM.add(BTL);

        File slideBaoCao = new File("BaoCao.pptx", "Slides báo cáo cuối kì", 40);
        KTTKPM.add(slideBaoCao);

        BTL.add(new File(".env", "Danh sách các biến môi trường cho project", 1));

        KTTKPM.add(new File("Exercise", "Danh sách các bài tập thực hành", 0));

        KTTKPM.displayInformation();
    }
}
