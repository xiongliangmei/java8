package com;

public enum TypeColor implements BaseEnum {
    实时报警(1),
    综合报警(2),
    设备报警(3)
    ;
    private Integer value;
    TypeColor(Integer value) {
         this.value =value;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
    public String getName(){
        return this.name();
    }

    public static TypeColor getInstance(Integer value){
        if (null == value){
            return null;
        }
        TypeColor[] ems = TypeColor.values();
        for (TypeColor em:ems) {
            if (em.value.equals(value)){
                return em;
            }
        }
        return null;
    }
}
