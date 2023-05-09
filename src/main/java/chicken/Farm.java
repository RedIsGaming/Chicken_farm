package chicken;

import java.util.Date;

public record Farm(Integer egg, String typeChicken, Date layTime) {
    public Farm(Integer egg, String typeChicken, Date layTime) {
        this.egg = egg;
        this.typeChicken = typeChicken;
        this.layTime = new Date();
    }
}