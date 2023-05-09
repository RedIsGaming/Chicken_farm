package chicken;

import java.util.Date;

public record Farm(Integer egg, String typeChicken, Date layTime, boolean isPsychical) {
    public Farm(Integer egg, String typeChicken, Date layTime) {
        this(egg, typeChicken, layTime, true);
    }

    public Farm(Integer egg, String typeChicken, Date layTime, boolean isPsychical) {
        this.egg = egg;
        this.typeChicken = typeChicken;
        this.layTime = new Date();
        this.isPsychical = isPsychical;
    }
}