package chicken;

import java.util.Date;

public class Farm {
    private final Integer egg;
    private final String typeChicken;
    private final Date layTime;

    public Farm(Integer egg, String typeChicken, Date layTime) {
        this.egg = egg;
        this.typeChicken = typeChicken;
        this.layTime = new Date();
    }

    public Integer getEgg() {
        return egg;
    }

    public String getTypeChicken() {
        return typeChicken;
    }

    public Date getLayTime() {
        return layTime;
    }
}