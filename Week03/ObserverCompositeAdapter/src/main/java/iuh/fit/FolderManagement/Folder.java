package iuh.fit.FolderManagement;

import java.util.ArrayList;

public class Folder implements DataObject {
    private String name;
    private ArrayList<DataObject> dataObjects;

    public Folder(String name) {
        this.name = name;
        dataObjects = new ArrayList<>();
    }

    public void add(DataObject object) {
        dataObjects.add(object);
    }

    public void remove(DataObject object) {
        dataObjects.remove(object);
    }

    public ArrayList<DataObject> getChildren() {
        return this.dataObjects;
    }

    @Override
    public void displayInformation() {
        System.out.println("Folder: " + name);
        dataObjects.forEach(DataObject::displayInformation);
    }

}
