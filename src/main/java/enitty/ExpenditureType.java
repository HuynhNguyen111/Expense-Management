
package enitty;

import java.io.Serializable;

public class ExpenditureType implements Serializable{
    private int id;
    private String name;

    public ExpenditureType(int id, String name)  {
        this.id = id;
        this.name = name;
    }

    public ExpenditureType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
