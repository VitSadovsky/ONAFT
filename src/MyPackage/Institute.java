package MyPackage;
import java.lang.reflect.Array;
import java.util.*;


public class Institute {
   ArrayList <Group> groupList;
    String instituteName;

    public Institute(String instituteName) {
        this.instituteName = instituteName;
        groupList = new ArrayList<Group>();
    }

      void addGroup(Group group){
         groupList.add(group);
    }


}
