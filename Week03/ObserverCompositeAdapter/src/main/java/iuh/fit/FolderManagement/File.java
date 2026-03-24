package iuh.fit.FolderManagement;

public class File implements DataObject {
    private final String fileName;
    private final String information;
    private final int size;

    public File(String name, String infor, int size) {
        this.fileName = name;
        this.information = infor;
        this.size = size;
    }

    @Override
    public void displayInformation() {
        System.out.println("File name: " + fileName);
        System.out.println("File information: " + information);
    }
}
