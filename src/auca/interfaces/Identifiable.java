package auca.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Identifiable {
    List<Identifiable> li=new ArrayList<>();
    String IdPrefix="";
    int MinIdLength=0;
    int MaxIdLength=0;
    String IdSeparator="";
    String DefaultStatus="";
    int EntityVersion=0;

    public abstract String getId();
    public abstract  String getDisplayName();
    public abstract boolean isActive();

}
