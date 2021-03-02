package in.tejas.login;

import java.util.ArrayList;

class ParentList {

    String name;
    int image;

    ArrayList<ChildList> arrayChild;

    public ArrayList<ChildList> getArrayChild() {
        return arrayChild;
    }

    public void setArrayChild(ArrayList<ChildList> arrayChild) {
        this.arrayChild = arrayChild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
